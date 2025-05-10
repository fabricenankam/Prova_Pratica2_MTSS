////////////////////////////////////////////////////////////////////
// FABRICE NANKAM 2123577
// YIGU ZHU 2082860
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
  public static String convert(int number){
    if(number > 0 && number <= 1000){
      String Roman = "";
      while(number > 0){
        //Issue #6
        if(number % 50 >= 10){
          number = number - 10;
          Roman = Roman + "X";
        }
        else if(number >= 9){
          number = number - 9;
          Roman = Roman + "IX";
        }
        //Issue #5
        else if(number >= 5){
          number = number - 5;
          Roman = Roman + "V";
        }
        else if(number >= 4){
          number = number - 4;
          Roman = Roman + "IV";
        }
        //Issue #4
        else if(number % 5 > 0){
          number--;
          Roman = Roman + "I";
        }
      }
      return Roman;
    
    }
    else{
      throw new IllegalArgumentException("Input deve essere un numero tra 1 e 1000.");
    }
  }
  }
  
