package com.calculators;

import java.util.*;
import java.io.*;
import com.Shapes.ComplexNum;

public class Calculator{
    public static void main(String[] args) throws IOException {
        ComplexNum  CN = new ComplexNum(4, 4);
        double v= CN.absN();
        ComplexNum h= CN.getReciprocal();
        System.out.println(v);
        System.out.println(h);
        System.out.println("Enter first double real:");
        double f=DoubleInput();
        System.out.println("Enter first double imagen:");
        double s=DoubleInput();
        ComplexNum  CM = new ComplexNum(f, s);
        double w= CM.absN();
        System.out.println(w);
        ComplexNum j= CM.getReciprocal();
        System.out.println(j);
        System.out.println("Enter second double real:");
        double f2=DoubleInput();
        System.out.println("Enter second double imagen:");
        double s2=DoubleInput();
        ComplexNum  CM2 = new ComplexNum(f2, s2);
        double w2= CM2.absN();
        System.out.println(w2);
        ComplexNum j2= CM2.getReciprocal();
        System.out.println(j2);
        System.out.println("Enter operator: +  -  *  /");
        String operator=OperatorInput();
        switch (operator){
            case "+": double rs=CM2.getrNum()+CM.getrNum();
                double is=CM2.getiNum()+CM.getiNum();
                ComplexNum sum=new ComplexNum(rs, is);
                System.out.println("Sum ="+sum);
                break;
            case "-": double rs1=CM.getrNum()-CM2.getrNum();
                double is1=CM.getiNum()-CM2.getiNum();
                ComplexNum sub=new ComplexNum(rs1, is1);
                System.out.println("Sub ="+sub);
                break;
            case "*": double rs2=((CM2.getrNum()*CM.getrNum())-(CM2.getiNum()*CM.getiNum()));
                double is2=((CM.getrNum()*CM2.getiNum())+(CM.getiNum()*CM2.getrNum()));
                ComplexNum mul=new ComplexNum(rs2, is2);
                System.out.println("Mul ="+mul);
                break;
            case "/": double rs3=(((CM2.getrNum()*CM.getrNum())+(CM2.getiNum() *CM.getiNum())))/
                        (CM2.getrNum()*CM2.getrNum()+CM2.getiNum()*CM2.getiNum());
                double is3=((CM2.getrNum()*CM.getiNum())-(CM.getrNum()*CM2.getiNum()))/
                        (CM2.getrNum()*CM2.getrNum()+CM2.getiNum()*CM2.getiNum());
                ComplexNum div=new ComplexNum(rs3, is3);
                System.out.println("Div ="+div);
                break;

        }
    }
    public static String OperatorInput() {
        Scanner scanner2 = new Scanner(System.in);
        String random;
        if (scanner2.hasNextLine()) {
            random = scanner2.nextLine();
            return random.strip();
        } else {
            System.out.println("Enter operator again");
            return OperatorInput();
        }
    }

    public static double DoubleInput() {
        Scanner scanner1 = new Scanner(System.in);
        double random=0.0;
        if (scanner1.hasNextDouble()) {
            random = scanner1.nextDouble();
            return random;
        } else {
            System.out.println("Enter double again");
            return DoubleInput();
        }
    }

}

