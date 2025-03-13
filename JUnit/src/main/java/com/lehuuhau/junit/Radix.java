/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lehuuhau.junit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author lehuu
 */
public class Radix {

    private int number;

    public Radix(int number) {
        if (number < 0) {
            throw new ArithmeticException("Invalid Radix");
        }
        this.number = number;
    }

    public String ConvertDecimalToAnother(int radix){
        int n = this.number;
        if (radix < 2 || radix > 16) {
            throw new ArithmeticException("Invalid Radix");
        }
        List<String> result = new ArrayList<>();
        while (n > 0) {
            int value = n % radix;
            if (value < 10) {
                result.add(String.valueOf(value));
            } else {
                switch (value) {
                    case 10:
                        result.add("A");
                        break;
                    case 11:
                        result.add("B");
                        break;
                    case 12:
                        result.add("C");
                        break;
                    case 13:
                        result.add("D");
                        break;
                    case 14:
                        result.add("E");
                        break;
                    case 15:
                        result.add("F");
                        break;
                }
            }
            n /= radix;
        }
        Collections.reverse(result);
        return String.join("", result);
    }
}
