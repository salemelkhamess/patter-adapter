package org.example.cumputer;

public class Monitor implements VGA {
    @Override
    public void print(String message) {

        System.out.println("================================");
        System.out.println(message);
        System.out.println("=================================");
    }
}
