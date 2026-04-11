package aes;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Security;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

//import org.bouncycastle.jce.provider.BouncyCastleProvider;

import com.apigee.flow.execution.ExecutionContext;
import com.apigee.flow.execution.ExecutionResult;
import com.apigee.flow.execution.spi.Execution;
import com.apigee.flow.message.MessageContext;


public class EncryptionAndDecryptionCallout implements Execution {


	private Map<String, String> properties = null;

	public EncryptionAndDecryptionCallout(Map<String, String> properties) {
		this.properties = properties;
	}
	
	public ExecutionResult execute(MessageContext msgContext, ExecutionContext execContext) {
		long executionStartTime = System.nanoTime();
		try {
			DebugLogger debugLogger = new DebugLogger(msgContext, execContext);
			ContentLogger contentLogger = new ContentLogger(msgContext, execContext);
			debugLogger.log("msg1", "In init()");
		 	String mode = resolveVariable(this.properties.get("mode"), msgContext);
		 	debugLogger.log("msgMode", mode);

		 	String Content= resolveVariable(this.properties.get("content"), msgContext);
		 	debugLogger.log("msgContent", Content);
		 	String PKey= resolveVariable(this.properties.get("pkey"), msgContext);
		 	debugLogger.log("msgPKey", PKey);
		 	String KEY="";
		 	KEY=resolveVariable(this.properties.get("key"), msgContext);
		 	debugLogger.log("msgKEY", KEY);
		 

		      if (mode.equals("Encryption")) {
		    	 debugLogger.log("msgEncryption()","Encryption");
				String publicKey =PKey;
				String content = Content;
		        String skey = randomString(16);
		        byte[] key1 = skey.getBytes();
		        SecretKeySpec secretKey = new SecretKeySpec(key1, "AES");
		        debugLogger.log("msgEncryption","Encryption1");
		        byte[] plaintextKey = secretKey.getEncoded();
		        debugLogger.log("msgEncryption","Encryption2");
		        byte[] encryptedKey = asymmetric_encrypt(plaintextKey, publicKey.getBytes(), "RSA","RSA/ECB/PKCS1Padding");
		        debugLogger.log("msgEncryption","Encryption3");
		        byte[] encodedEncryptedKey = encodeToBase64(encryptedKey);
		        debugLogger.log("msgEncryption","Encryption4");
		        String sIV =randomString(16);
		        debugLogger.log("msgEncryption","Encryption5");
		        byte[] iv = sIV.getBytes();
		        debugLogger.log("msgEncryption","Encryption6");
		        byte[] encryptedContent = ECB.encrypt(content.getBytes(), plaintextKey);
		        debugLogger.log("msgEncryption","Encryption7");
		        byte[] ivAndEncryptedContent = mergeTwoByteArrays(iv, encryptedContent);
		        debugLogger.log("msgEncryption","Encryption8");
		        byte[] encodedIvAndEncryptedContent = encodeToBase64(ivAndEncryptedContent);
		        debugLogger.log("msgEncryption","Encryption9");
		        msgContext.setVariable("encodedEncryptedKey",new String(encodedEncryptedKey));
		        debugLogger.log("msgEncryption","Encryption10");
		        msgContext.setVariable("encodedIvAndEncryptedContent",new String(encodedIvAndEncryptedContent));
		        debugLogger.log("msgEncryption","Encryption1");
		      }
		           
		      
		      else if(mode.equals("Decryption")) {
		    	  debugLogger.log("msgDecryption()","Decryption");
		          String key = KEY;               
		          String iv = "";
		          String privateKey = PKey;
		          String content =Content;
		    	
	                byte[] decodedKey =decodeFromBase64(key.getBytes());
	                byte[] decryptedKey =asymmetric_decrypt(decodedKey, privateKey.getBytes(), "RSA","RSA/ECB/PKCS1Padding");
	                byte[] decodedIv = null;
	                byte[] decodedContent =decodeFromBase64(content.getBytes());
	                byte[] encryptedContent = null;
	                if (iv.equalsIgnoreCase("")) {
	                    decodedIv =extractBytes(decodedContent, 0, 16);
	                    encryptedContent = extractBytes(decodedContent, 16, decodedContent.length);
	                } else {
	                    decodedIv =decodeFromBase64(iv.getBytes());
	                    encryptedContent =decodeFromBase64(content.getBytes());
	                }
	                msgContext.setVariable("encodedEncryptedKey",new String(decryptedKey));
	                byte[] decryptedContent = ECB.decrypt(encryptedContent, decryptedKey);//decryptGCM(encryptedContent, decodedIv, decryptedKey, "AES","AES/GCM/NoPadding");
	                msgContext.setVariable("encodedEncryptedKey",new String(decryptedContent));
	
		      }
			long executionEndTime = System.nanoTime();
			debugLogger.log("ENCRYPTION_EXECUTION_TIME", String.valueOf(executionEndTime - executionStartTime));
			return ExecutionResult.SUCCESS;
		} catch (Exception exception) {
			DebugLogger debugLogger = new DebugLogger(msgContext, execContext);
			msgContext.setVariable("CATCH_EXCEPTION", exception.getMessage());
			long executionEndTime = System.nanoTime();
			debugLogger.log("ENCRYPTION_EXECUTION_TIME", String.valueOf(executionEndTime - executionStartTime));
			return ExecutionResult.ABORT;
		}
	}

	private String resolveVariable(String variable, MessageContext msgContext) {
		if (isEmpty(variable))
			return "";
		if (!variable.startsWith("{") || !variable.endsWith("}"))
			return variable;
		String value = msgContext.getVariable(variable.substring(1, variable.length() - 1)).toString();
		if (isEmpty(value))
			return variable;
		return value;
	}

	private boolean isEmpty(String variable) {
		return (variable == null || variable.length() == 0);
	}

	public EncryptionAndDecryptionCallout() {
	}
	


		  static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		  static SecureRandom rnd = new SecureRandom();

		  public static String randomString(int len) {
		    StringBuilder sb = new StringBuilder(len);
		    for (int i = 0; i < len; i++)
		      sb.append(AB.charAt(rnd.nextInt(AB.length())));
		    return sb.toString();
		  }
		  
		  public static byte[] asymmetric_encrypt(byte[] content, byte[] publicKey, String encryptionMode, String encryptionAlgo) throws GeneralSecurityException {
		      PublicKey x509Key = getPublic(publicKey, encryptionMode);
		      return helper_encrypt(content, x509Key, encryptionAlgo);
		    }
		  
		  public static PublicKey getPublic(byte[] publicKey, String mode) throws NoSuchAlgorithmException, InvalidKeySpecException {
		      X509EncodedKeySpec spec = new X509EncodedKeySpec(decodeFromBase64(publicKey));
		      KeyFactory kf = KeyFactory.getInstance(mode);
		      return kf.generatePublic(spec);
		    }
		  
		  public static byte[] helper_encrypt(byte[] input, PublicKey key, String cipherAlgorithm) throws GeneralSecurityException {
		      Cipher cipher = Cipher.getInstance(cipherAlgorithm);
		      cipher.init(1, key);
		      return cipher.doFinal(input);
		    }
		  
		  public static byte[] decodeFromBase64(byte[] input) {
		      return Base64.getDecoder().decode(input);
		    }
		  
		  public static byte[] encodeToBase64(byte[] input) {
		      return Base64.getEncoder().encode(input);
		    }
		  
		  public static byte[] encryptGCM(byte[] content, byte[] iv, byte[] key, String encryptionMode, String encryptionAlgo) throws NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, NoSuchPaddingException {
		      SecretKeySpec secretKey = getSecretKey(key, encryptionMode);
		      GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(16 * 8, iv);
		      byte[] encContent = helper_encryptGCM(content, secretKey, gcmParameterSpec, encryptionAlgo);;
		      return encContent;
		    }
		  
		  public static byte[] helper_encryptGCM(byte[] input, SecretKeySpec key, GCMParameterSpec gcmParameterSpec, String cipherAlgorithm) throws InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, NoSuchPaddingException, NoSuchAlgorithmException {
		      Cipher cipher = Cipher.getInstance(cipherAlgorithm);
		      cipher.init(1, key, gcmParameterSpec);
		      return cipher.doFinal(input);
		    }
		  
		  public static byte[] mergeTwoByteArrays(byte[] arrayOne, byte[] arrayTwo) {
		      byte[] mergedArray = new byte[arrayOne.length + arrayTwo.length];
		      System.arraycopy(arrayOne, 0, mergedArray, 0, arrayOne.length);
		      System.arraycopy(arrayTwo, 0, mergedArray, arrayOne.length, arrayTwo.length);
		      return mergedArray;
		    }
		  
		   public static SecretKeySpec getSecretKey(byte[] keyBytes, String algorithm) {
		        return new SecretKeySpec(keyBytes, algorithm);
		      }
//-----------------------------------------------------------------------------------------------

		     
		     public static byte[] asymmetric_decrypt(byte[] encryptedContent, byte[] privateKey, String decryptionMode, String decryptionAlgo) throws GeneralSecurityException {
		         PrivateKey pkcs8PrivateKey = getPrivate(privateKey, decryptionMode);
		         return decrypt(encryptedContent, pkcs8PrivateKey, decryptionAlgo);
		       }
		     
		     public static PrivateKey getPrivate(byte[] privateKey, String mode) throws NoSuchAlgorithmException, InvalidKeySpecException {
		         PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(decodeFromBase64(privateKey));
		         KeyFactory kf = KeyFactory.getInstance(mode);
		         return kf.generatePrivate(spec);
		       }
		     
		     public static byte[] decrypt(byte[] input, PrivateKey key, String algorithm) throws GeneralSecurityException {
		         Cipher cipher = Cipher.getInstance(algorithm);
		         cipher.init(2, key);
		         return cipher.doFinal(input);
		       }
		     
		     public static byte[] extractBytes(byte[] input, int startIndex, int endIndex) {
		         return Arrays.copyOfRange(input, startIndex, endIndex);
		       }
		     
		     public static byte[] decryptGCM(byte[] encryptedContent, byte[] iv, byte[] key, String decryptionMode, String decryptionAlgo) throws GeneralSecurityException {
		         SecretKeySpec secretKey = getSecretKey(key, decryptionMode);
		         GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(16 * 8, iv);
		         return helper_decryptGCM(encryptedContent, secretKey, gcmParameterSpec, decryptionAlgo);
		     }
		     
		     public static byte[] helper_decryptGCM(byte[] input, SecretKeySpec key, GCMParameterSpec gcmParameterSpec, String algorithm) throws GeneralSecurityException {
		         Cipher cipher = Cipher.getInstance(algorithm);
		         cipher.init(2, key, gcmParameterSpec);
		         return cipher.doFinal(input);
		       }
		     

}

