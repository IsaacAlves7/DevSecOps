package aes;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.KeySpec;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class EncryptorDecryptorUtil {
private int keySize;
private Cipher cipher;
public EncryptorDecryptorUtil(int keySize)
{
this.keySize = keySize;
try
{
this.cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
}
catch (NoSuchAlgorithmException e)
{
e.printStackTrace();
}
catch (NoSuchPaddingException e)
{
e.printStackTrace();
}
}
public String decrypt(String salt, String iv, String passphrase, String
EncryptedText)
{
String decryptedValue = null;
try
{
byte[] saltBytes = hexStringToByteArray(salt);
SecretKeySpec sKey = (SecretKeySpec)generateKeyFromPassword(
passphrase, saltBytes);
byte[] ivBytes = hexStringToByteArray(iv);
IvParameterSpec ivParameterSpec = new IvParameterSpec(ivBytes);
this.cipher.init(2, sKey, ivParameterSpec);
byte[] decordedValue = Base64.getDecoder().decode(EncryptedText);
byte[] decValue = this.cipher.doFinal(decordedValue);
decryptedValue = new String(decValue);
return new String(decryptedValue);
}
catch (Exception e)
{
e.printStackTrace();
}
return decryptedValue;
}
public static SecretKey generateKeyFromPassword(String password, byte[]
saltBytes)
throws GeneralSecurityException
{
	KeySpec keySpec = new PBEKeySpec(password.toCharArray(), saltBytes,
			100, 128);
			SecretKeyFactory keyFactory =
			SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
			SecretKey secretKey = keyFactory.generateSecret(keySpec);
			return new SecretKeySpec(secretKey.getEncoded(), "AES");
			}
			public static byte[] hexStringToByteArray(String s)
			{
//			System.out.println("s:::::::"+s);
			int len = s.length();
			byte[] data = new byte[len / 2];
			for (int i = 0; i < len; i += 2) {
			data[(i / 2)] =
			((byte)((Character.digit(s.charAt(i), 16) << 4) +
			Character.digit(s.charAt(i + 1), 16)));
			}
			return data;
			}
			}


