package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;
import java.util.*;

public class TestA22 {

  @Test
  public void testA22_1() {
    /* System output redirection */
    // PrintStream originalOut = System.out;
    // ByteArrayOutputStream bos = new ByteArrayOutputStream();
    // System.setOut(new PrintStream(bos));

    /* For Test */
    int N1 = 5;
    int N2 = 8;
    int N = 3;

    // action
    // Test 1
    List<Integer> result = A22.getSequence(N1, N2, N);
    // List<Integer> ans = new ArrayList<Integer>();
    List<Integer> ans = new ArrayList<>(Arrays.asList(5, 8, 13));

    System.out.printf("Input Values are %d %d %d\n", N1, N2, N);
    System.out.println("Answer " + ans.toString());

    // assertion
    // assertEquals("Hello world!\n", bos.toString());
    assertEquals(result, ans);

    // Test 2
    N1 = 10;
    N2 = 20;
    N = 10;

    // action
    // Test 1
    result = A22.getSequence(N1, N2, N);
    // List<Integer> ans = new ArrayList<Integer>();
    ans = new ArrayList<>(Arrays.asList(10, 20, 30, 50, 80, 130, 210, 340, 550, 890));

    System.out.printf("Input Values are %d %d %d\n", N1, N2, N);
    System.out.println("Answer " + ans.toString());

    // assertion
    // assertEquals("Hello world!\n", bos.toString());
    assertEquals(result, ans);
    // undo the binding in System
    // System.setOut(originalOut);
  }

  @Test
  public void testA22_2() {
    /* System output redirection */
    // PrintStream originalOut = System.out;
    // ByteArrayOutputStream bos = new ByteArrayOutputStream();
    // System.setOut(new PrintStream(bos));

    /* For Test */
    int N1 = 0;
    int N2 = 1;
    int N = 3;

    // action
    // Test 1
    List<Integer> result = A22.getSequence(N1, N2, N);
    // List<Integer> ans = new ArrayList<Integer>();
    List<Integer> ans = new ArrayList<>(Arrays.asList(0, 1, 1));

    System.out.printf("Input Values are %d %d %d\n", N1, N2, N);
    System.out.println("Answer " + ans.toString());

    // assertion
    // assertEquals("Hello world!\n", bos.toString());
    assertEquals(result, ans);

    // Test 2
    N1 = -1;
    N2 = -2;
    N = 5;

    // action
    // Test 1
    result = A22.getSequence(N1, N2, N);
    // List<Integer> ans = new ArrayList<Integer>();
    ans = new ArrayList<>(Arrays.asList(-1, -2, -3, -5, -8));

    System.out.printf("Input Values are %d %d %d\n", N1, N2, N);
    System.out.println("Answer " + ans.toString());

    // assertion
    // assertEquals("Hello world!\n", bos.toString());
    assertEquals(result, ans);
    // undo the binding in System
    // System.setOut(originalOut);
  }
}
