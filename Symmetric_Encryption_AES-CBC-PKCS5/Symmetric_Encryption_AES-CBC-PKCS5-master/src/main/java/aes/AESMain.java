package aes;

import java.security.GeneralSecurityException;
import java.security.spec.KeySpec;
import java.util.Base64;
import java.util.Random;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class AESMain {
	public String encryptMessage(String txtToEncrypt, String passphrase)
	{
	String combineData = "";
	try
	{
	Cipher cipher =
	Cipher.getInstance("AES/CBC/PKCS5Padding");
	String saltHex = getRandomHexString(32);
	String ivHex = getRandomHexString(32);
	byte[] salt = hexStringToByteArray(saltHex);
	byte[] iv = hexStringToByteArray(ivHex);
	SecretKeySpec sKey =
	(SecretKeySpec)generateKeyFromPassword(
	passphrase, salt);
	cipher.init(1, sKey, new IvParameterSpec(iv));
	byte[] utf8 = txtToEncrypt.getBytes("UTF-8");
	byte[] enc = cipher.doFinal(utf8);
	combineData = saltHex + " " + ivHex + " " +
	Base64.getEncoder().encodeToString(enc);
	}
	catch (Exception e)
	{
	e.printStackTrace();
	}
	combineData = combineData.replaceAll("\n",
	"").replaceAll("\t", "").replaceAll("\r", "");
	return combineData;
	}
	
	
	public String decryptMessage(String str, String myKey)
	{
	String decrypted = null;
	try
	{
	if ((str != null) && (str.contains(" ")))
	{
	String salt = str.split(" ")[0];
	String iv = str.split(" ")[1];
	String encryptedText = str.split(" ")[2];
	EncryptorDecryptorUtil dec = new
	EncryptorDecryptorUtil(128);
	decrypted = dec.decrypt(salt, iv, myKey, encryptedText);
	
	}
	else
	{
	decrypted = str;
	}
	}
	catch (Exception e)
	{
	e.printStackTrace();
	}
	return decrypted;
	}
	public static String getRandomHexString(int numchars)
	{
	Random r = new Random();
	StringBuilder sb = new StringBuilder();
	while (sb.length() < numchars) {
	sb.append(Integer.toHexString(r.nextInt()));
	}
	return sb.toString().substring(0, numchars);
	}
	public static byte[] hexStringToByteArray(String s)
	{
	int len = s.length();
	byte[] data = new byte[len / 2];
	for (int i = 0; i < len; i += 2) {
	data[(i / 2)] =
	((byte)((Character.digit(s.charAt(i), 16) << 4) +
	Character.digit(s.charAt(i + 1), 16)));
	}
	return data;
	}
	public static SecretKey generateKeyFromPassword(String password, byte[] saltBytes)
			
			throws GeneralSecurityException
			{
			KeySpec keySpec = new PBEKeySpec(password.toCharArray(),saltBytes,100, 128);
	SecretKeyFactory keyFactory =
	SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
	SecretKey secretKey = keyFactory.generateSecret(keySpec);
	return new SecretKeySpec(secretKey.getEncoded(), "AES");
	}
	
	public static void main(String[] args) {
		AESMain ob=new AESMain();
		String data="{\"name\":\"Abhishek\",\"age\":25,\"city\":\"Karanja lad\"}";
		String pass="f8baa12ddf334906a951dd8991cab775";
		String encrypted=ob.encryptMessage(data,pass);
		System.out.println("Payload Data:"+data);
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println("\nEnc:"+encrypted);
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println();
		
//		String encc="7ff85b1f57264ca842a05db8c4c141ec cc9faceec9160c9f4f291a9b8eaeda69 0F71DWMwcf7rAC4U2BTy7kyVK8hHbj3uu0N+ewlVOkFjL72JZEpwdB6DYrTLkJnFl7iFYb3/oJRWkAIRd6T+BX7IkcdasEVmMTA7/AMkR1zdkKEB1Ol/ZlVXN2ELid3C8btWiWGF3ECnrewsJV3C7PPyCAW6zeZoN0uui+jREBRHnW62FEYxlQZpCcYsxLmJQXmmACJ04tYo8DNXXgjyDkHacSL9rchK8/wxTpLbZts=";
		
		
		String decrypted=ob.decryptMessage(encrypted,pass);
		System.out.println("Dec:"+decrypted);
	}
}
