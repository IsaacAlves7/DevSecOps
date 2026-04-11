package aes;

import java.util.Base64;

public class Utils {

	
	public byte[] decodeFromBase64(byte str[]){
		
		 
		 byte[] decodedBytes = Base64.getDecoder().decode(str);
		 String decodedString = new String(decodedBytes);
		return decodedString.getBytes();
	}
	
	
	public byte[] encodeToBase64(byte str[]){
		
		 String encodedString = Base64.getEncoder().encodeToString(str);
		return encodedString.getBytes();
		
	}
	
	public static void main(String[] args) {
		Utils co=new Utils();
		byte arr[]=co.encodeToBase64("abhishek".getBytes());
		System.out.println(new String(arr));
		
		byte arr1[]=co.decodeFromBase64(arr);
		System.out.println(new String(arr1));
	}
	
	
}
