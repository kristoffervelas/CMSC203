import static org.junit.Assert.*;
import org.junit.Test;

public class CryptoManagerTestStudent {

    @Test
    public void testEncryptCaesar() {
        assertEquals("Encrypting 'FOR' with key 3", "IRU", CryptoManager.caesarEncryption("FOR", 3));
        assertEquals("Encrypting 'WORLD' with key 4", "[SVPH", CryptoManager.caesarEncryption("WORLD", 4));
    }

    @Test
    public void testDecryptCaesar() {
        assertEquals("Decrypting 'IRU' with key 3", "FOR", CryptoManager.caesarDecryption("IRU", 3));
        assertEquals("Decrypting '[SVPH' with key 4", "WORLD", CryptoManager.caesarDecryption("[SVPH", 4));
    }

    @Test
    public void testEncryptBellaso() {
        assertEquals("Encrypting 'HELLO' with Bellaso 'ABC'", "IGOMQ", CryptoManager.bellasoEncryption("HELLO", "ABC"));
        assertEquals("Encrypting 'HAPPY' with Bellaso 'XYZ'", " Z*(2", CryptoManager.bellasoEncryption("HAPPY", "XYZ"));
    }

    @Test
    public void testDecryptBellaso() {
        assertEquals("Decrypting 'HFNOS' with Bellaso 'ABC'", "GDKNQ", CryptoManager.bellasoDecryption("HFNOS", "ABC"));
        assertEquals("Decrypting 'YWGXB' with Bellaso 'XYZ'", "A>-@)", CryptoManager.bellasoDecryption("YWGXB", "XYZ"));
    }

    @Test
    public void testIsStringInBounds() {
        assertTrue("String within bounds", CryptoManager.isStringInBounds("HELLO"));
    }
}