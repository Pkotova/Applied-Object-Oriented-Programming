package com;

public class RouteCipherTest {

    public static void main(String[] args) {
//representation of the class Route cipher

// example of encrypting for negative key
        RouteCipher encryptTextNegativeKey = new RouteCipher(-5);
        System.out.print("With key: " + encryptTextNegativeKey.toString() + " ");
        String encryptedTextNegative = encryptTextNegativeKey.encrypt("ABORT THE MISSION, YOU HAVE BEEN SPOTTED");
        System.out.println(encryptedTextNegative);
        System.out.println();

// example of encrypting for positive key
        RouteCipher encryptTextPositiveKey = new RouteCipher(5);
        System.out.print("With key: " + encryptTextPositiveKey.toString() + " ");
        String encryptedTextPositive = encryptTextPositiveKey.encrypt("ABORT THE MISSION, YOU HAVE BEEN SPOTTED");
        System.out.println(encryptedTextPositive);
        System.out.println();

// example of decrypting for positive key
        RouteCipher decryptNegativeKey = new RouteCipher(-4);
        System.out.print("With key: " + decryptNegativeKey.toString() + " ");
        String decryptedTextNegative = decryptNegativeKey.decrypt("XEAHSIHTIEIXTXTLTSPN");
        System.out.println(decryptedTextNegative);
        System.out.println();

// example of decrypting for positive key
        RouteCipher decryptPositiveKey = new RouteCipher(4);
        System.out.print("With key: " + decryptPositiveKey.toString() + " ");
        String decryptedTextPositive = decryptPositiveKey.decrypt("TIEIXTXXEAHSIHSPNTLT");
        System.out.println(decryptedTextPositive);
        System.out.println();
    }
}

/*----- PROCESS FOR ENCRYPTING  ------
-- 0) We convert String to char array
-- 1) We clear the given message
-- 2) Following the given instructions in the assigment we fill matrix
-- 3) We read the matrix spirally counter clock wise due the key sign
---- 3.1) If the key is positive we run startFromUpLeftElement function
---- 3.2) If the key is negative we run rotate180degrees function,
--------- and then we run startFromUpLeftElement function
-- 4) We return the char array and convert it back to String
 */
//**************************************************************
/*----- PROCESS FOR DECRYPTING  ------
-- 0) We convert String to char array
-- 1) We clear the given message
-- 2) Following the given instructions in the assigment we fill matrix
-- 3) We read the matrix spirally counter clock wise due the key sign
---- 3.1) If the key is positive we run decryptMatrixPositiveKey function
---- 3.2) If the key is negative we run rotate180degrees function,
--------- and then we run decryptMatrixPositiveKey function
-- 4) We return the char array and convert it back to String
 */
