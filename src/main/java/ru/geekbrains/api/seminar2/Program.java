package ru.geekbrains.api.seminar2;

import java.util.UUID;

public class Program {
    public static void main(String[] args) {
        String str = "Hello!";
        MyString myStr = new MyString(new char[]{'H', 'e', 'l', 'l', 'o'});
        String str2 = new String(new char[]{'H', 'e', 'l', 'l', 'o'});

        str2 = str2 + "abc";

        System.out.println(UUID.randomUUID());

        String buf = "";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 30000; i++) {
            buf = buf + UUID.randomUUID();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("[1] Операция выполнена за " + (endTime - startTime) + " мс.");

        StringBuilder stringBuilder = new StringBuilder();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 30000; i++) {
            stringBuilder.append(UUID.randomUUID());
        }
        endTime = System.currentTimeMillis();
        System.out.println("[2] Операция выполнена за " + (endTime - startTime) + " мс.");
    }
}
