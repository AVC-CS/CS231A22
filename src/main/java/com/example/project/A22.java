package com.example.project;

import java.util.*;
import java.io.*;

class A22 {
    static List<Integer> getSequence(int N1, int N2, int N) {
        /*****************************************
         * Code your program here
         *****************************************/
        List<Integer> result = new ArrayList<>();
        result.add(N1);
        result.add(N2);
        for (int i = 2; i < N; i++) {
            result.add(N1 + N2);
            int tmp = N1;
            N1 = N2;
            N2 = tmp + N2;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the Starting two numbers: ");
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        System.out.printf("%s\n", "Enter the number of numbers: ");
        int N = sc.nextInt();

        List<Integer> result = getSequence(N1, N2, N);
        System.out.println("Result Median " + result.toString());
        sc.close();
    }
}
