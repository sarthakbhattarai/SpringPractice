package com.Spring.Practice;

import org.springframework.stereotype.Component;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

@Component
public class PasswordEncDec {

    private static final String ENCRYPTION_KEY = "mySecretKey12345"; // 16-character encryption key

    public static String encrypt(String password)  {
        try{
            SecretKeySpec secretKey = new SecretKeySpec(ENCRYPTION_KEY.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encryptedBytes = cipher.doFinal(password.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(encryptedBytes);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }

    }

    public static String decrypt(String encryptedPassword) {
        try{
            SecretKeySpec secretKey = new SecretKeySpec(ENCRYPTION_KEY.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] decodedBytes = Base64.getDecoder().decode(encryptedPassword);
            byte[] decryptedBytes = cipher.doFinal(decodedBytes);
            return new String(decryptedBytes, StandardCharsets.UTF_8);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }

    }


    public static void main(String[] args) throws Exception {
        String check = "hello";
        System.out.println("Normal: "+check);
        System.out.println();
        String enc = encrypt(check);
        System.out.println("Encrypting: "+enc);
        System.out.println();
        System.out.println("Decrypting: "+decrypt(enc));

    }
}
