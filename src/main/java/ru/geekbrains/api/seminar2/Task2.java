package ru.geekbrains.api.seminar2;

import java.util.Scanner;

public class Task2 {

    /* Задача ЕГЭ. "Частота символов":
    На вход программы подаются произвольный алфавитно-цифровые символы.
    Требуется написать программу, которая будет печатать последовательность строчных английских букв ('a', 'b', ... 'z')
    из входной последовательности и частот их повторения.
    Печать должна происходить в алфавитном порядке. Например, пусть на вход подаются следующие символы:
    fhb5kbfshfm.
    В этом случае программа должна вывести:
    b2
    f3
    h2
    k1
    m1
    s1 [{\:]
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] statistic = new int[26];
        char a = 'a';
        char c;
        int noA = a; //97
        System.out.println("Введите строку: ");
        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                statistic[c - noA]++;
            }
        }
        System.out.println("Результат работы программы: ");
        for (int i = 0; i < statistic.length; i++) {
            if (statistic[i] > 0) {
                char cc = (char)(i + noA);
                System.out.printf("%s:%d\n", cc, statistic[i]);
            }
        }
    }
}
