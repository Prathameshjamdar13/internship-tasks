package communication.handshake;

public class HandshakeCrypto {
//    public static byte[] encrypt(byte[] plaintext, Key key) {
//        try {
//            Cipher cipher = Cipher.getInstance("RSA");
//            cipher.init(Cipher.ENCRYPT_MODE, key);
//            return cipher.doFinal(plaintext);
//        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//    public static byte[] decrypt(byte[] ciphertext, Key key) {
//        try {
//            Cipher cipher = Cipher.getInstance("RSA");
//            cipher.init(Cipher.DECRYPT_MODE, key);
//            return cipher.doFinal(ciphertext);
//        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }

//    public static PublicKey getPublicKeyFromCertFile(String certfile) {
//        try {
//            CertificateFactory fact = CertificateFactory.getInstance("X.509");
//            FileInputStream CAIs = new FileInputStream(certfile);
//            return fact.generateCertificate(CAIs).getPublicKey();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//    public static PrivateKey getPrivateKeyFromKeyFile(String keyfile) {
//        try {
//            Path path = Paths.get(keyfile);
//            byte[] privKeyBytes = Files.readAllBytes(path);
//            PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(privKeyBytes);
//            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
//            return keyFactory.generatePrivate(keySpec);
//        } catch (IOException | NoSuchAlgorithmException | InvalidKeySpecException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
}
