package org.example.dsa.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnagramApp {
    static int size;
    static int count;
    static char[] arrChar = new char[100];

    public static void main(String[] args) {

    }
    public static void doAnagram(int newSize) {
        if (newSize == 1)
            return;
        for (int j = 0; j < newSize; j++) {
          doAnagram(newSize - 1);
          if (newSize == 2)
              displayWord();
          rotate(newSize);
        }
    }

    public static void rotate(int newSize) {
        int j;
        int position = size - newSize;
        char temp = arrChar[position];
        for (j = position + 1; j < size; j++)
            arrChar[j - 1] = arrChar[j];
        arrChar[j - 1] = temp;
    }

    public static void displayWord() {
        if (count < 99)
            System.out.println(" ");
        if (count < 9)
            System.out.println(" ");
        System.out.println(++count + " ");
        System.out.print("  ");
        System.out.flush();
        if (count % 6 == 0)
            System.out.println("");
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
