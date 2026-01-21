package studio1;

import java.util.Scanner;

public class LeapYear {
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
    System.out.println("Please enter year: ");
    int year = in.nextInt();
    boolean divbyfour = (year % 4 == 0);
    boolean divbyhundred = (year % 100 != 0);
    boolean divbyfourhund = (year % 400 == 0);
    boolean leapyear = (divbyfour && divbyhundred) || divbyfourhund;
    System.out.println(year + " is a leap year:" + leapyear);



}
}