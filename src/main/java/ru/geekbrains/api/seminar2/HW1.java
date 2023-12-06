package ru.geekbrains.api.seminar2;

import java.util.Arrays;

public class HW1 {
    static class Answer {
        public static StringBuilder answer(String QUERY, String PARAMS){
            String str;
            str = PARAMS.replaceAll("[{\" }:]", "");
            str = str.replaceAll("name","");
            str = str.replaceAll("country","");
            str = str.replaceAll("city","");
            String[] array = str.split(",");
            String str2 = QUERY;
            for (int i = 0; i < array.length; i++) {
                if (array[i].contains("null")) {
                    continue;
                } else {
                    str2 = QUERY + "name='" + array[0] + "' and country='" + array[1] + "' and city='" + array[2] + "'";
                }
            }
            return new StringBuilder(str2);
        }
    }

    public static class Printer{
        public static void main(String[] args) {
            String QUERY = "";
            String PARAMS = "";

            if (args.length == 0) {
                // При отправке кода на Выполнение, вы можете варьировать эти параметры
                QUERY = "select * from students where ";
                PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
            }
            else{
                QUERY = args[0];
                PARAMS = args[1];
            }

            Answer ans = new Answer();
            System.out.println(ans.answer(QUERY, PARAMS));
        }
    }
}
