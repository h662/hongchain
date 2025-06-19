package org.example;

import java.security.MessageDigest;

public class StringUtil {
    public static String applySha256(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(input.getBytes("UTF-8"));
            System.out.println(hashBytes);
        } catch(Exception e) {
            throw new RuntimeException(e);
        }

        return "";
    }
}
