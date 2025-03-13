package com.lehuuhau.junit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lehuu
 */
public class Polynomial {

    static double Power(double x, int n) {
        if (n == 0) {
            return 1.0;
        } else if (n > 0) {
            return n * Power(x, n - 1);
        } else {
            return Power(x, n + 1) / x;
        }
    }
}
