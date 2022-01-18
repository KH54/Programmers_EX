package com.programmers.leve2;

import java.util.Arrays;
import java.util.Comparator;

public class 파일명정렬 {
    public static void main(String[] args) {
        String[] files = { "img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG" };

        System.out.println(Arrays.toString(solution((files))));

    }

    public static String[] solution(String[] files) {

        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] file1 = division(o1);
                String[] file2 = division(o2);

                if (file1[0].compareTo(file2[0]) == 0) {
                    int num1 = Integer.parseInt(file1[1]);
                    int num2 = Integer.parseInt(file2[1]);

                    return num1 - num2;
                } else {
                    return file1[0].compareTo(file2[0]);
                }
            }

            private String[] division(String info) {
                String head = "";
                String number = "";

                int index = 0;
                
//               head = info.replaceAll("[0-9]", "");
//               number = info.replaceAll("[^0-9]", "");

                for (; index < info.length(); ++index) {
                    char ch = info.charAt(index);

                    if (ch >= '0' && ch <= '9') {
                        break;
                    }
                    head += ch;
                }

                for (; index < info.length(); ++index) {
                    char ch = info.charAt(index);

                    if (!(ch >= '0' && ch <= '9')) {
                        break;
                    }
                    number += ch;
                }

                String[] file = { head.toLowerCase(), number };

                return file;
            }
        });
        return files;
    }
}
