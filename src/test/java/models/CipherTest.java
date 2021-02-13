package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class CipherTest {
    @Test
    public void newCipherTest_instantiatesCorrectly() {
        Cipher newCipher = new Cipher("abc", 3);
        assertEquals(true, newCipher instanceof Cipher);
    }

    @Test
    public void newCipherTest_getsWord_abc() {
        Cipher newCipher = new Cipher("abc", 3);
        assertEquals("abc", newCipher.getWord());
    }

    @Test
    public void newCipherTest_getsPassword_3() {
        Cipher newCipher = new Cipher("abc", 3);
        assertEquals(3, newCipher.getKey());
    }

    @Test
    public void newCipherTest_passwordIsPositiveInteger() {
        Cipher newCipher = new Cipher("abc", 1);
        assertEquals(true, newCipher.isPositive());
    }

}