package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;
import java.util.*;

public class TestA21 {

  @Test
  public void testA21() {
    /* System output redirection */
    // PrintStream originalOut = System.out;
    // ByteArrayOutputStream bos = new ByteArrayOutputStream();
    // System.setOut(new PrintStream(bos));

    /* For Test */
    int result;
    int[] num = new int[3];

    // action
    // Test 1
    A21.getRdnum(num);
    Arrays.sort(num);
    int ans = num[1];

    System.out.println("Random numbers " + num[0] + " " + num[1] + " " + num[2]);
    System.out.println("Answer " + ans);
    result = A21.getMed(num);

    // assertion
    // assertEquals("Hello world!\n", bos.toString());
    assertEquals(result, ans);

    // Test 2
    A21.getRdnum(num);
    Arrays.sort(num);
    ans = num[1];

    System.out.println("Random numbers " + num[0] + " " + num[1] + " " + num[2]);
    System.out.println("Answer " + ans);
    result = A21.getMed(num);

    // assertion
    // assertEquals("Hello world!\n", bos.toString());
    assertEquals(result, ans);
    // undo the binding in System
    // System.setOut(originalOut);
  }
}
