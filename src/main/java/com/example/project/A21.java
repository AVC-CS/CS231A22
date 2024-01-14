package com.example.project;

import java.util.*;
import java.io.*;

class A21 {
    static void getRdnum(int rdnum[]) {
        /*****************************************
         * Code your program here
         *****************************************/

    }

    static int getMed(int num[]) {
        /*****************************************
         * Code your program here
         *****************************************/
    }

    public static void main(String[] args) {
        Console con = System.console();

        int[] num = new int[3];
        getRdnum(num);
        con.writer().printf("The random numbers are: ");
        for (int i = 0; i < 3; i++) {
            con.writer().printf("%d\t", num[i]);
        }
        con.writer().println();

        int result = getMed(num);
        System.out.println("Result Median " + result);
    }
}
