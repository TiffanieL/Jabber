/*
Christian Lapinig
clapinig@my.smccd.edu
CIS 254JA
Palindrome.java
Test For Palindrome
Lab #23
10/30/2015
*/

import java.util.Scanner;

public class Palindrome {
    public boolean isPalindrome(String message, int number) {
         System.out.println(message);
         int digit1 = number / 10000;
         int digit2 = number % 10000 / 1000;
         int digit4 = number % 10000 % 1000 % 100 / 10;
         int digit5 = number % 10000 % 1000 % 100 % 10;

         System.out.println(number);

         if (digit1 == digit5) {
            if (digit2 == digit4) {
               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      }

      public boolean isPalindrome(String message, String input) {
         System.out.println(message);
         int number = Integer.parseInt(input);
         return isPalindrome("", number);
      }

      public boolean isPalindrome(String message, int...digits) {
        System.out.println(message);
        int number = digits[0] * 10000 + digits[1] * 1000 + digits[2] * 100 + digits[3] * 10 + digits[4];
        return isPalindrome("", number);
      }

      public boolean isPalindrome(String message, char...digits) {
        System.out.println(message);
        if (digits.length < 1) {
            return false;
        }
        String input = "" + digits[0] + digits[1] + digits[2] + digits[3] + digits[4];
        return isPalindrome("", input);
      }

      public static void main(String[] args) {
      Palindrome pali = new Palindrome();
      System.out.println("Programmed By Christian Lapinig");

      if (pali.isPalindrome("This Method Checks An Int", 12345)) {
          System.out.println("This Number is a Palindrome\n");
      } else {
          System.out.println("This Number is Not a Palindrome\n");
      }

      if (pali.isPalindrome("This Method Checks a String", "10101")) {
          System.out.println("This Number is a Palindrome!\n");
      } else {
          System.out.println("This Number is Not a Palindrome\n");
      }

      if (pali.isPalindrome("This Method Checks a Set of Ints", 1 , 2 , 3 , 2, 1)) {
          System.out.println("This Number is a Palindrome!\n");
      } else {
          System.out.println("This Number is Not a Palindrome\n");
      }

      if (pali.isPalindrome("This Method Checks a Set of Chars", '1', '2', '3', '2', '1' )) {
          System.out.println("This Number is a Palindrome!\n");
      } else {
          System.out.println("This Number is Not a Palindrome\n");
      }

      if (pali.isPalindrome("This Method Checks Only One Argument")) {
          System.out.println("This Number is a Palindrome!\n");
      } else {
          System.out.println("The Char Method is Called");
      }
   }
}
