package com.Shapes;

public class ComplexNum{
   private double rNum;
   private double iNum;

   public ComplexNum(double rNum, double iNum) {
      this.rNum = rNum;
      this.iNum = iNum;
   }
   public double absN() {
      return Math.sqrt(iNum*iNum+rNum*rNum);
   }
   public ComplexNum getReciprocal(){
      double denom = iNum*iNum+rNum*rNum;
      if (denom !=0){
         return new ComplexNum(rNum/denom, -iNum/denom);
      } else{
         throw new IllegalStateException("z=0");
      }
   }

   public double getrNum() {
      return rNum;
   }
   public void setrNum(double rNum) {
      this.rNum = rNum;
   }
   public double getiNum() {
      return iNum;
   }
   public void setiNum(double iNum) {
      this.iNum = iNum;
   }

   @java.lang.Override
   public java.lang.String toString() {
      return "ComplexNum{" +
              "reNum=" + rNum +
              ", imNum=" + iNum +
              '}';
   }
}