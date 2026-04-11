package aes;



import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Security;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Arrays;
import java.util.Base64;


import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;



public class DecryptHybridGenericOaepGcmTest_StandAlone {

  
  public static void main(String[] args) {
      
      

        String mode = "hybrid_generic_oaep_gcm";
        String key = "MY5yrqMWTsS0cMIvAjUKuX6fpk3KqFSkg381Hj7y4P/lnUainhOjcX4u9Y+B8rSTxfEJHUNn45Sk26xmBLABexxGmd8l2usZOgkiO2guM35xbizX0ctxV13ilolfn3V0mBuy7eCh7NsxV5mEUv9U64oWj5oKGA+vVJflDK4slr0Lt6L82TqCIYvqyYdjx9m5lPhhuudEtymYgR2JADrsRFEDUXzrSNR+8xZMI5X8iBGo9Mkub2CMfjgcAG5KsYiFoX3V0lqObuDkkT34gYWwNYs9YDJZlvEzDrlZ1efitE3oeiDe5EtjoDV2v5rB1CMOeMshVuY0ydKbpuwEFzy2BDliTuCzfaWYQkmFt/J/1yAq/rIF5eTN/stRrSr2oWtp8vkRez8FF9GksRYf3MAaDnt2WfOd4yqfipJvhkMmKsO6ZQ3Ni6FF4GTaoLNwOWww1v5zxDNxPQuJJw4XLmGwDCWzSoQdGKYqV7A9yk2Sr0MuAo9tLrljMNd4psUPa4RvTI56erVn8/+mXH+ITgHIcYFV3wS7gCzxvJl7z1Ds6Yttlm2ph6SMQV5ICLeggBZViYF9YgbTmj0f3GFkqf0kr42uzonGsHMRf/UsrMiXtZWHghMV2Qd+El+X2xeGv9+LCIM861PwlfVKKq0GJumpx/Z0jhsN1zFzrJr2bTbNXtM=";
                
        String iv = "";
        String privateKey = "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";
        String content ="YTdhdm93ejFOMktCSjZHSTJNOXluRGZvQi9KRERLSERINmR2ais2djZFRVdnbTZQSVZtUnErd2prMmd4M1U2emk4MlhlcFFFM2t3SjR3dmVJc3dDRC9GdVMvTnhLL3JJVTNNTDVZTE1ySHhmRW8rc2g5NlNTcjZJTUhJRjFrQXFrc1dGbGQyeDBOSEhwNnM0SVVtejhyYUhtb29oQ3pTQU9SYjdsRWlYanl2c1g4Y1FIWW5jNGU3U2M4Vi9kSG04WUthUUo3SFIvT2RyaDRVVHJxVVkyMWMwdUFQYlc4Z0FQaEV4eTFXblo4eW5oZmsxUGFkT0xZT2FKblFUOUR1Sm9sUDdmcGJtWkdUd0lxUjZlNTBMUytGQ2piRG52S1pvOHkyTDFVOHJpWFc1eUhDcjRxaEFxdFRwcDJjR0VYWURkTzZCYzY4am15VnF4QzBDMCtTNUw5ZVB3MVhRV0t2Q09tZk5JcW5lcWJCNXBqeHZWQ1JnUGpRMCtLUUtxY3I1NG56a01WcktiRU5pUjJFMm5wMkY3YlZpQTQ3R2szWEFJVjREVHJ0Q0tTZU5YckhnK3N1ZlVVTXJzbjdaWHJPTnNZTG1tU1o2bnFVWXZEM3V0NmZ4YnlNeTYzTFBuL1J4dVU0cTFwNnhSZkZySU90bTV6bFZTOTR2MG50U2xBWDY0MFpaZ0RYbmtCNEdXV29iTUpjNzFjVDl6Q1pUdndVbTY2UEhnaGloWHUrQk9CdlhSUUk4UTZmNG8rQXhYUEYvWG1RazkvMVdrQUt4ZklpT0NIS2JmRnZxeFVNbFZseCthWUI3VmFTWnV5QjJsN20weWwzUWp5TFpXeHFxOWgzbk5qUUVJL1pMeHJrNmtqZnZ0SzB0YXR2YWwrb3lralVBU2NIWEVpR1Z5eFlia2VHdlN4dFRScS9ZcXZEaVR2SUVpQ2x1N0J6SG1UcHNUSjAwUTU1cmlXWFF1c08rcXBnVlppZENDWEhqYWdsU1ZBMWlxaW1JUytxUlFrdG41Y0J2K0JLUW1iNXRveWppd2xPQUZqOUpBajVNQU1jWUduS3VDZkRGL3NKM2k3aVcyNTFoV25tZW9EVVZBdENiOFA3OGZRVzhoTmtOUXp2MzRiR3Y1UWljZ1YrL3J0Uk13MWJ1aXpwdUUrR29Wd0pNMFdON09ZNnJ5M2xWK1RMdlhqVmR3RDNpYjFEMUthVmgyVVZLZmgvR2tDajJLUWVkTzc0ZUJ4czJFUnBEUVlJQ3l5OVVpZ1VXTVd4aCtPdUlQU2xqeEU3VjNUcERCa3k1cGxrc1gwUERKWlNUbktJQ0hKZUZMQ3dmVFc0R3A2NkYzL3JUbG5XbUZJWjQ3WXdoZmQvb2RTWTlqQWIxdUJlSHkxTWd4c2V3SnpqM2JHRTc5T1Y4NDl2QnE3YlJHQjBCWjlkakNXc0pucG1jaWxSdUdzMVFRa0RlVDJWb3l5cFhsNXZDdkx6NVJkSEtkaG8xUXl1TlBwNDgySFprelBsaWJUbzM1TGdZRmtJOUpWaEdhN2dPRW1UcWtIdmhGV3hyVmx2KzAwbXRYVk5jc2xjMTBSUUpOUHZ0VDN4SG1sdTlFdjgzYytPTVB1MCtNOTl3RDhuMXY1Z1JTRVg4ZXdUNXZzZ0U0RmNrOHpNaDdqWXRHVG1hSFN4Zk5kbHF1RUh2aE0wY3BQYmdXeGEra2I2bDN2WGd4YjN2S3JZd09Hd3JKbjNaLzh3S3hLUVp3dUpHdlVzK3NGMndNYVM4dkhTY1dlcEUySUNTZkRocVlRdlZUeWQzWC9wYUtQVEl1ZW1WamhZNlBTOFRLZG5ncE9xdXVrNmJaREltWVdSOTMxYzh5UkRaU0p1ZWptZzMyN2JLcUM1dXJKRDYwVzBwVndudzJzNFFHTzF4aEVUdFhmYjdzSlpIZTdsditYVkYvUlVjVXJLYXFaRENzOUphMkZJazZKbVZlb2xVRGpYNWZYSktxTFRyZWFsdlljSHJxVmtMdVA3NlhTNHdNU2thVzRFcGU1dmRrZDRXZFh2NDQrSGdmTitvZTdDc1F4dHl5Q0UxakhyMWU1ZitnZkpVR045S1k2QWptejFYZnc4eXR2dVkrS29hdDYrUFNDSXBVdktpS1FWMGZuUHlRUTVFT0dRTUJyQisxL2hheS82SnNYSmp6MGtNTlpCTTNlUi9iSnlodmdlMkdRVHc5NFhXeFJ3am1LelpDOG5QODVLNDEyaTJqK1lGY3hwdjkwRUpmUzJGUVgyUXVlU0IrbVErTGNhVlA0dEdrbUFUS1BCVW1RekxVT0wrV2s1S0YvbzYwcng5WGczQ0U3Q1dRbWZxdFpmRU55Y3dDNy9NT2F5dWJJNExjdHpBZU5uYmJEM1J6OVRIVkZreG1YUEVOYU84N0tDc3ZIZmxSMi9DZDA4U2ZENjR2aXh0Y3JuL1UvMWkvR3dvMmJwbkZ0clZBeXFwS2xQanF1YlB3cVZsZDg2L3hEbmMrQVBxU1pHVWpHRXZCM2U2WnplVm53N0ZHYnZrOGsvbUNXcVpoUVAvZVdWZnJRWDJFWERPbkR1WkFuUUJNZWZYWGJTTm5HYlI2TUdvb2pkSVo1bEdkMHp4eWRUU2JXYTluZmdKVHJKWVpuc2hCcEYvRVpzdE9rK0ZBSmpnTUV5R0VTMmxSN1lreXQ2QTNzclo2YXNjZ1daZW94M0E1ZW5GdjVWZ1czT0llZWo1VUp2Y3pIbGQzYVRpZUVTOUZVeXl2Z0NKeG53SVQreFlSWnlRTk4vMjczZ0RhT3lwN3p5eGxFTXg0NkdtRDVwMDU5eXZDOC9nTnB3RzJCQjM5eVl5d0VYNkY4V2N0elAveTZFS3E5bVp2bzVEUEZ2MkNjQzVvUkpUZ1JpYWpwMzE1MU1Mb3pnNWE0d3dhM0lWUU9XWlg2M0hLTzhYR0l6ZGwrVTZwb1B5dDlZUGYxd1RBSWFEVHNnNjN1c1RXeUE5cVhReEZIcmtUSElqNUpuMDAxTktNdFJmVFVBZjNCaklEKzMrOERBTXNwcnpkWGY2TXdtWnVoRnF6bjNvNk85emY2d0FuaFZneVY1MDBlK1NwaVBENm9oUVJuS1FuRU9ZU3dJQzFtcWFyU0hsczlOYzIxQTBOWGJLYnFTOHcrYjFiUFZheGxvYXh4NTMrVFhYWEF6RzcxVUU0a2FEbWJ2UEp0OEZKNVdQU2Y5aXpDVnU4MHdkZXJQRUs4NGpWYW5MUldWYlcxQVlYOUY5UjV6VXNRc0hTTzlGL2xEcjF0MDlQVVlOL0NMbEIzdmVub1RaY0hEU3A3Q2QrQnJtMVF0QzVxUnc1RGZueWEvc3RmYXR5NzhIU3NJOXY4dGh6ZmdCRVBGNndaOWwvU3dKeFhHeDhaeWJWRFBjR1kwMFMyVjA5Nm9tdFJFT3JIdnJhZDN5MjJET2lhaytBRUw2UTVna1V1WkRvMnpsVDB6enlyTXFoY2VvRDFZSVZXNm1wMExLVTNLaUNuL2lkUm5mK3BYK3JISzR1TWtRVURLSkQ0bVlVUEh4Vmk3Szk2RjlRcU00RTZGcHFiKzUwMUljODZDYnVMNUk4Nnc5WWREM2luZ3RDYm82Y1BSUEl3OHF4ZlBpelVmMkFOWlVEbzBiZ3BpRldVNnQ3clUwUUVScjZIZFJpc3luYWNFRGJ2bkV6ZG1CNkxQbllJeFF2UDhnNlR6UHBjRHIyU2grc2FMMktwb2VyNFNtNy8vNDJpTFpKOUs2dFFKUThZeEhhNVpGbjc1SjIrbmpGK0FQamY2L2E4a1pacHFOc0pzWFFFdkZSN00xMTAwQlBsVU5zSDJad1NURUc1U3JoNXZmWGVjM3hvVFBXbHgrdmVjWnI5Y2FtU29lTjc0VkFHMGJzaDgvR3paTllQNHRUZDhpUmRBemJUbUpuVVd4QU5EdU95ajR6U3pOQ0ZoV0kwSURTa01mS2prc2Y1ZUZuRjRBRFNxYkRpaHY0YjkvODJ4bjgzSjVnYmVpYWd1ajhIVmttM25sbk9UeDRheE1JanIrcXVnamdDR00vR205Y29aRGNuNUtqaGU4Ymdja0pqUFk0ZStJMUtiVWdScU5abzFWV21HbG4wMzFwd1ZsTk16cmlvY3BmMnp6Ty9UaHAxOVJ0WWZ5NjJvaVRTNzZmZTFlNnJHTW90WWpJSDZkcG9tR2FKQ251SU1BaE9zc1Jwc2RjeXBSa1JPWkpZM2tSdVNndnhHNVJEOCtIRG9URU5mdU5PZnlROTAwWlBUcC95SjllTGlpSUJNL3hVczlXV1NLLzZYdk5ieVNjcnU1M2FXWGdyNmx4OGVoUWJjSlJDMS9oQjhHTW1KYUs3UU9Wb0dqRDhyQ2l6ZXFvalk3UmJkYUJ3Y3ZiNWdud2pMYmxXM3pMVWJyRmJaeDd4U3UyT1FpVXU0cjZIWjJJSGFKbzVZRDZTc3d0NXAydXJwVHZwZTE3SGhja1BRc3FpOEozNkI5MUxSSUJaajNiczRDREZXQzZURXJDWThvMDFBRDFpNm43UzdZcWE2Y3Q2ckRIcHp5SDhCemZzdVNQSlptUXE1MGhBaDA0YnhDZCtHbTl4WW1TS3FaVThKeHByMmRwZUNGYTlPRmQvZGxSdmRmdzBoUi9ueHdyVVZhd3hCSVNtWWtlajZNZ0xBMlJHZ1MydHlMWkJBQWNKclJDR0NvZk56Ti9WcWxhbGhpaXM1MGcyQnBmamljOVVsK1RJam4rSGlhUm5pelNZc0tHRXdFc3NyR3g1VHczdXVqRlVSTFREcmtteFR0Q3RjT082OUdnTGtOSFczaGMvTTZpbnBLYm5kYWNDWVNtMGkyaEIyRitNUjR0K1RoUUd0a3cxRjNTeHBla1pJVjl5ZmJ0S1l6UkJubFd3L2d6bnRURnJVR0hXYUl1L1dZejZaRVR2TUJSeUhjTnpIdUVSTEhTTk1FU3dwVlp2eFBUSEVpc3l3UWlscnJ4VHlkcGZzZ3lwVHdYTDE3QmR5ZTE5aHNaK1lGWFFSUkV3OVJuRHpidkRCcXR6UWhLeFpyZTQxNFU3bWJLRXBOWEU3RUE1WVAxZjhCRmJIaEFQSUxLT1BoTXQxcTNKL2FDelpsR0hkcVdURXh3N28rMTNYcTd4RkVUS1Q0c0JPN1BhWlB3V2JocUpyYzdSKy9YclFCenVlRWxsU1Q4UEpXSXhLOXZHb3FxRVVMNENqNldsaktCM0RTd0h5NUJLZUsyMDdPbC9oaW1hNmx3aWM0STE4Q2UxQ2JnSms3NFNsUW5Ea0RVaHJaYWhsbWl0bmZMNmF5S05XZUdzWUd2dHgrUUVoOHVJSVN3KzdxRW5TMzVJMzkzYzB0MXluSCtBYjIxY1FCK2s5Y0tDek8veFZxb0dOQzdDeEtFVGorY2JkZVV6M0Y5V1YxeU1PZlpnMjF6Qzh3TnJqanU0QkpHNzhIZGh0SDNXZXh5dTNaWExDd1E2WnJjb2hpczFVcEYraGFSaG82RnVEVjRIbG4xNUZ1UENMclVlMEpaRnQ0QUJRVld4NllZUTZNUk9FZXUrcFhJTHlzcUx2S09nZC9MSnBHSzlReUY2Zy9nZ2EwRzArbmhmVW9FKzgvVVNlTWI0bTlsajVWcVBkNE5pSWh5a0xmQ1VvSERDQXBuWHUrTmdWWTZJNzBtWWpEOHdRNUVJdXA3MGhSNW5qMVJ4eVVTeHYwVFltRTI5a3k3eUlMbUJmaGFZMUk0VTZMcndJL09qRUJnZ0svZi9vemlHczlLNGNMNmpSRzA4aElSMmowOWQzU3lsektiZnJDYWIvenpzQkVvQzUxbzRLRVJBRTRxMTh1SXYrZ3ROY3EvZ1IzZXdSVlowdVEzenlJMUNXZlNUaVdiTGJSSjRCeGRvbWxQM29heElRWFRJbkg3N0F1YW1neFRtTXdHTUZhZlZ1dmUvZStKenhmVTMraXFHcW5CY29wMkQxL0U2TXBXQkYyeTh1YlUwUkRVOGZwTUgyWC9adXlJMVdwSVNHZlhlOEx5WWpqZG1lNW53ZnVia25OLzZydkdYOURVZG5PeEk2QjlvNWRGcU4rZ0lsN0lmTjQyK3FjSUZDb1lsUlRFZTZVOVhHdU5HcklYYjd2Y2pFUTNVWTJreThVWkxROVNacTlPaFlRRU56T1FrdmlUb0syMFgvS25YQ1NYbjdlYitxeFFwTExhRndhazNqWWNjVzg5M0lhKytZejIwWHh1bm51U0hKc3hvb3FLYnNpM2ppOGNwZkI1bTFZajdidlBFUi9VVlQ2V281TkZyTlNTTStKS1hmb091ME5oc29IQi9MVEFhY290Y0c5VEJSL1hDQStaSVo3NFQzWnh5dTlkRWx3RDM3ZzliVXBTTDZCVUtOV09tZWMzWHFMOXcrNVFMZWVUVVVWUXc3a0NhZTFDNDA1TUlEdzRRZDE5anQrWk1maHJITm56dGJvWWF4U3lHQnFZaWk1KzVFcXJpK2Y0TWVabXloZVd6TEE4UnpFNnZPcnJ2VEFmWjFvY0w1T1VaRENoTldFOExuUXljL3c3QUVoeXRTRnNNL3ZZVXVKTmU2RUh6K2JCZVBFR3lnamRuaEJlZmczaXZIT0h1emovWDdVb0ZtajVOQjU3bm00TlJ4c01FYzd3aVJwb0FaYU8rZ2lKTmN2cWdLV04wSU1HVTYwaEhxcmUzcGMxL08yNDlNa2Y0RmV3TlNkZ09kUzRuRnhCdGRXb01rdnhlZ2RDSFYrb2x2S1hoTDRTbldqOGIzOGcvamNrU2EzaSt1aXgxcWR4OGUxdUNTN2UrUmNFRkFjYkZsZWt4cEl1M3dISDJqVDQ3VitHQ3VJaFF3Y1VOOHlGdWVQM2xuanRhN1p2aW1VOE1EaENITGcvZmt6QklDVXRlbm1XTDJ3RDF4ZnFIRzEvME5rbUFWU3FPbU9uY1FjWEVIV3VCdTV6eHBvWEtyYThNRHVLMU5wTElvZWFOdkw3OTdNU3VXV3NkRkZWa1VqV1FDSC9pRUdHNFN5c0hQbW1WajVTWTJsd3B6elFYZnlHbFFseWtKNVhvZFhpb3RhUHFXUWV3WVBqeWZ1V2xyc1kwQkEzOXpDNnpZUjg0SFdyaXk5RWhCMHlERlBnQ0tZT1VZQUhVTkdteFJrYjF4QXhRclhKNisyL1dvRzJMNEpnaFlvdnFNUzdJQ1VUR0NaZXY0eklRPT0=";
            
        try {

            if (mode.equalsIgnoreCase("hybrid_generic_oaep_gcm")) {
                System.out.println("msg3" + "In HYBRID_GENERIC");
                byte[] decodedKey = decodeFromBase64(key.getBytes());
                byte[] decryptedKey = asymmetric_decrypt(decodedKey, privateKey.getBytes(), "RSA","RSA/ECB/OAEPWithSHA1AndMGF1Padding");
                byte[] decodedIv = null;
                byte[] decodedContent = decodeFromBase64(content.getBytes());
                byte[] encryptedContent = null;
                if (iv.equalsIgnoreCase("")) {
                    decodedIv = extractBytes(decodedContent, 0, 16);
                    encryptedContent = extractBytes(decodedContent, 16, decodedContent.length);
                } else {
                    decodedIv = decodeFromBase64(iv.getBytes());
                    encryptedContent = decodeFromBase64(content.getBytes());
                }
                System.out.println("DECODED_DECRYPTED_KEY");
                System.out.println(new String(decryptedKey));
                byte[] decryptedContent = ECB.decrypt(encryptedContent, decryptedKey);//decryptGCM(encryptedContent, decodedIv, decryptedKey, "AES","AES/GCM/NoPadding");
                
                System.out.println("DECODED_DECRYPTED_CONTENT");
                System.out.println(new String(decryptedContent));

            }
        } catch (GeneralSecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
  
  public static byte[] decodeFromBase64(byte[] input) {
        return Base64.getDecoder().decode(input);
      }
    
    public static byte[] encodeToBase64(byte[] input) {
        return Base64.getEncoder().encode(input);
      }
    
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
    
    public static SecretKeySpec getSecretKey(byte[] keyBytes, String algorithm) {
        return new SecretKeySpec(keyBytes, algorithm);
      }
}

