package com.calculators;

import com.Shapes.ComplexNum;

public class Calculator{
    public static void main(String[] args) {
        ComplexNum  CN = new ComplexNum(4, 4);
        double v= CN.absN();
        ComplexNum h= CN.getReciprocal();
        System.out.println(v);
        System.out.println(h);
    }
}

