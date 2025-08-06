package com.Shapes;
import java.math.*;

public class ComplexNum{
   private BigDecimal rNum;
   private BigDecimal iNum;
   final static BigDecimal constm1=new BigDecimal("-1");

   public ComplexNum(BigDecimal rNum, BigDecimal iNum) {
      this.rNum = rNum;
      this.iNum = iNum;
   }
   public BigDecimal absN() {
       BigDecimal i=iNum.multiply(iNum);
       BigDecimal j=rNum.multiply(rNum);
       BigDecimal k=i.add(j);
      return k.sqrt(new MathContext(1000));
   }

   public ComplexNum getReciprocal(){
       BigDecimal i=iNum.multiply(iNum);
       BigDecimal j=rNum.multiply(rNum);
       BigDecimal denom=i.add(j);

      if (denom.compareTo(BigDecimal.ZERO)>0 || denom.compareTo(BigDecimal.ZERO)<0){
         BigDecimal iN=iNum.multiply(constm1).divide(denom, 1000, RoundingMode.HALF_UP);
         BigDecimal rN=rNum.divide(denom, 1000, RoundingMode.HALF_UP);
         return new ComplexNum(rN, iN);
      } else{
         throw new IllegalStateException("You have zeros");
      }
   }

   public BigDecimal getrNum() {
      return rNum;
   }
   public void setrNum(BigDecimal rNum) {
      this.rNum = rNum;
   }
   public BigDecimal getiNum() {
      return iNum;
   }
   public void setiNum(BigDecimal iNum) {
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