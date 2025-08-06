package com.calculators;

import java.util.*;
import java.io.*;
import java.math.*;
import com.Shapes.ComplexNum;

public class Calculator{

    public static void main(String[] args) throws IOException {
        System.out.println("Enter first double real:");
        BigDecimal f=BigDecimalInput();
        System.out.println("Enter first double imagen:");
        BigDecimal s=BigDecimalInput();
        ComplexNum CM = new ComplexNum(f, s);
        BigDecimal w= CM.absN();
        System.out.println(w);
        ComplexNum j= CM.getReciprocal();
        System.out.println(j);
        System.out.println("Enter second double real:");
        BigDecimal f2=BigDecimalInput();
        System.out.println("Enter second double imagen:");
        BigDecimal s2=BigDecimalInput();
        ComplexNum CM2 = new ComplexNum(f2, s2);
        BigDecimal w2= CM2.absN();
        System.out.println(w2);
        ComplexNum j2= CM2.getReciprocal();
        System.out.println(j2);
        choseMenu(CM,CM2);
    }
     static void choseMenu(ComplexNum CM, ComplexNum CM2){
        System.out.println("Enter operator: +  -  *  /");
        String operator=OperatorInput();
        switch (operator) {
            case "+":
                BigDecimal rs = CM2.getrNum().add(CM.getrNum());
                BigDecimal is = CM2.getiNum().add(CM.getiNum());
                ComplexNum sum = new ComplexNum(rs, is);
                System.out.println("Sum =" + sum);
                break;
            case "-":
                BigDecimal rs1 = CM.getrNum().subtract(CM2.getrNum());
                BigDecimal is1 = CM.getiNum().subtract(CM2.getiNum());
                ComplexNum sub = new ComplexNum(rs1, is1);
                System.out.println("Sub =" + sub);
                break;
            case "*":
                BigDecimal rm=CM2.getrNum().multiply(CM.getrNum());
                BigDecimal im=CM2.getiNum().multiply(CM.getiNum());
                BigDecimal rs2 = rm.subtract(im);
                BigDecimal r1i =CM.getrNum().multiply(CM2.getiNum());
                BigDecimal ir =CM.getiNum().multiply(CM2.getrNum());
                BigDecimal is2 = r1i.add(ir);
                ComplexNum mul = new ComplexNum(rs2, is2);
                System.out.println("Mul =" + mul);
                break;
            case "/":
                BigDecimal r12 = CM2.getrNum().multiply(CM.getrNum());
                BigDecimal i12 = CM2.getiNum().multiply(CM.getiNum());
                BigDecimal ri = r12.add(i12);
                BigDecimal r22 = CM2.getrNum().multiply(CM2.getrNum());
                BigDecimal i22 = CM2.getiNum().multiply(CM2.getiNum());
                BigDecimal ri22 = r22.add(i22);
                BigDecimal rs3 = ri.divide(ri22, 1000, RoundingMode.HALF_UP);
                //double rs3 = (((CM2.getrNum() * CM.getrNum()) + (CM2.getiNum() * CM.getiNum()))) /
                //        (CM2.getrNum() * CM2.getrNum() + CM2.getiNum() * CM2.getiNum());
                BigDecimal r2i1=CM2.getrNum().multiply(CM.getiNum());
                BigDecimal r1i2=CM.getrNum().multiply(CM2.getiNum());
                BigDecimal r2i1r1i2= r2i1.subtract(r1i2);
                BigDecimal is3 =r2i1r1i2.divide(ri22, 1000, RoundingMode.HALF_UP);
                //double is3 = ((CM2.getrNum() * CM.getiNum()) - (CM.getrNum() * CM2.getiNum())) /
                      //  (CM2.getrNum() * CM2.getrNum() + CM2.getiNum() * CM2.getiNum());
                ComplexNum div = new ComplexNum(rs3, is3);
                System.out.println("Div =" + div);
                break;
            default:
                choseMenu(CM,CM2);
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
    public static BigDecimal BigDecimalInput() {
        Scanner scanner1 = new Scanner(System.in);
        BigDecimal random;
        if (scanner1.hasNextBigDecimal()) {
            random = scanner1.nextBigDecimal();
            //if (random.compareTo(BigDecimal.ZERO)<=0){
            //System.out.println("Enter BigDecimal again");
            //return BigDecimalInput();
                //}
            return random;
        } else {
            System.out.println("Enter BigDecimal again");
            return BigDecimalInput();
        }
    }

//    public static double DoubleInput() {
//        Scanner scanner1 = new Scanner(System.in);
//        double random=0.0;
//        if (scanner1.hasNextDouble()) {
//            random = scanner1.nextDouble();
//            return random;
//        } else {
//            System.out.println("Enter double again");
//            return DoubleInput();
//        }
//    }

}

