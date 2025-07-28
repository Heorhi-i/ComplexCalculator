package com.Shapes;

public class ComplexNum{
   private double rNum;
   private double eNum;

   public ComplexNum(double rNum, double eNum) {
      this.rNum = rNum;
      this.eNum = eNum;
   }
   public double absN() {
      return Math.sqrt(eNum*eNum+rNum*rNum);
   }
   public double getrNum() {
      return rNum;
   }
   public void setrNum(double rNum) {
      this.rNum = rNum;
   }
   public double geteNum() {
      return eNum;
   }
   public void seteNum(double eNum) {
      this.eNum = eNum;
   }
}