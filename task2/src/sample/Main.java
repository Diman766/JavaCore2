package sample;

import regular.CaesarCipher;

public class Main {
    public static void main(String[] args) {

        String cipheredMessage = CaesarCipher.cipher("hello", 3, true);
        System.out.println(cipheredMessage);
        System.out.println(CaesarCipher.cipher(cipheredMessage, 3, false));

    }
}