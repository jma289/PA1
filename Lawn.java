// Lawn.java
// Jia-hui Ma
// jma289
// pa1
// inputting dimensions to calculate lawn area and to output mowing time

import java.util.Scanner;

class Lawn{

   public static void main( String[] args ){

      double widthlot, lengthlot, widthhouse, lengthhouse, mowingrate;
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the length and width of the lot, in feet: ");
      widthlot = sc.nextDouble();
      lengthlot = sc.nextDouble();
      System.out.print("Enter the length and width of the house, in feet: ");
      widthhouse = sc.nextDouble();
      lengthhouse = sc.nextDouble();

      double arealot, areahouse, arealawn;
      arealot = widthlot * lengthlot;
      areahouse = widthhouse * lengthhouse;
      arealawn = arealot - areahouse;
      System.out.println("The lawn area is " + arealawn +" square feet.");

      System.out.print("Enter the mowing rate, in square feet per second: ");
      mowingrate = sc.nextDouble();

      double time;
      time = arealawn / mowingrate;
      int h, m, s;

      s = (int) Math.round(time);
      m = s/60;
      s = s%60;
      h = m/60;
      m = m%60;

      System.out.print("The mowing time is "+h+" hour");
      if (h != 1){
         System.out.print("s ");}
      else{System.out.print(" ");}
      System.out.print(m+" minute");
      if (m != 1){
         System.out.print("s ");}
      else{System.out.print(" ");}
      System.out.print(s+" second");
      if (s != 1){
         System.out.println("s.");}
      else{System.out.println(".");}
   }
}
