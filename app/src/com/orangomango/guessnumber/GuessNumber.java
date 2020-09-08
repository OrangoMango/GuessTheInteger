package com.orangomango.guessnumber;

import java.util.Random;
import java.io.*;

public class GuessNumber {

  public static Random r = new Random();
  public static final int CORRECT = r.nextInt(100) + 1;
  public static int attemps = 0;

  public static void main(String[] args) throws IOException{
      
      BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
      
      int number = 0;
      
      do {
        System.out.print("Enter an integer: ");
        attemps++ ;
        
        try {
          number = Integer.parseInt(rd.readLine());
        } catch (Exception e) {
          System.out.println("Invalid input");
          continue;
        }
        
        if (number > CORRECT){
          System.out.println("Try lower");
        }
        if (number < CORRECT){
          System.out.println("Try higher");
        }
        
      } while (number != CORRECT);
     
      
      System.out.println("Correct number! ("+attemps+" attemps)");
  }
}

