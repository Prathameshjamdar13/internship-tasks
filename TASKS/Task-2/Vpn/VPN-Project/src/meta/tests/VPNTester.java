package meta.tests;

import java.security.Principal;

public class VPNTester {
    private Principal issuerDN;

    public void main(String[] args) {
        testaCertificate();
        /*test();*/
    }

    private void testaCertificate() {
        try {
            System.out.println(issuerDN);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
/*
    private static void test() {
        System.out.println(" - Test 1: - ");
        testSessionKey();
        System.out.println();

        System.out.println(" - Test 2: - ");
        testSessionCrypto();
        System.out.println();

        System.out.println(" - Test 3: - ");
        testVerifyCertificate();
        System.out.println();

        System.out.println(" - Test 4: - ");
        testHandshakeCrypto();
    }

    private static void testVerifyCertificate() {
        HandleCertificate vC = new HandleCertificate("certs/CA.pem", "certs/user.pem");
        vC.verify();
    }

    private static void testSessionKey() {
        SessionKey key1 = new SessionKey(128);
        SessionKey key2 = new SessionKey(key1.encodeKey());

        if (key1.getSecretKey().equals(key2.getSecretKey())) {
            System.out.println("The keys match");
        } else {
            System.out.println("The keys do not match");
        }
    }

    private static void testSessionCrypto() {
        TestSessionCrypto testSessionCrypto = new TestSessionCrypto();

        try {
            testSessionCrypto.encrypt();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void testHandshakeCrypto() {
        try {
            HandshakeCryptoTester.encrypt();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }*/
}
