package com.calculators;

import com.Shapes.ComplexNum;

public class Calculator{
    public static void main(String[] args) {
        ComplexNum  CN = new ComplexNum(4, 4);
        double v= CN.absN;
        System.out.println(v);
    }
}

