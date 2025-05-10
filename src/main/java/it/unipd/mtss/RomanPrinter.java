////////////////////////////////////////////////////////////////////
// FABRICE NANKAM 2123577
// YIGU ZHU 2082860
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
  public static String print(int num){
    return printAsciiArt(IntegerToRoman.convert(num));
  }

  private static String printAsciiArt(String romanNumber){
    String FirstLine = "", SecondLine = "", ThirdLine = "", FourthLine = "", FifthLine = "", SixthLine = "";
    while(!romanNumber.trim().isEmpty()){
      switch(romanNumber.charAt(0)){
        case 'C': //Issue #8
          FirstLine = FirstLine +   "  _____  ";
          SecondLine = SecondLine + " / ____| ";
          ThirdLine = ThirdLine +   "| |      ";
          FourthLine = FourthLine + "| |      ";
          FifthLine = FifthLine +   "| |____  ";
          SixthLine = SixthLine +   " \\_____| ";
          romanNumber = romanNumber.substring(1);
          break;
          
       case 'L': //Issue #7
          FirstLine = FirstLine +   " _       ";
          SecondLine = SecondLine + "| |      ";
          ThirdLine = ThirdLine +   "| |      ";
          FourthLine = FourthLine + "| |      ";
          FifthLine = FifthLine +   "| |____  ";
          SixthLine = SixthLine +   "|______| ";
          romanNumber = romanNumber.substring(1);
          break;

        case 'X': //Issue #6
          FirstLine = FirstLine +   "__   __ ";
          SecondLine = SecondLine + "\\ \\ / / ";
          ThirdLine = ThirdLine +   " \\ V /  ";
          FourthLine = FourthLine + "  > <   ";
          FifthLine = FifthLine +   " / . \\  ";
          SixthLine = SixthLine +   "/_/ \\_\\ ";
          romanNumber = romanNumber.substring(1);
          break;

        case 'V': //Issue #5
          FirstLine = FirstLine +   "__      __ ";
          SecondLine = SecondLine + "\\ \\    / / ";
          ThirdLine = ThirdLine +   " \\ \\  / /  ";
          FourthLine = FourthLine + "  \\ \\/ /   ";
          FifthLine = FifthLine +   "   \\ /     ";
          SixthLine = SixthLine +   "    \\/     ";
          romanNumber = romanNumber.substring(1);
          break;

        case 'I': //Issue #4
          FirstLine = FirstLine +   " _____  ";
          SecondLine = SecondLine + "|_   _| ";
          ThirdLine = ThirdLine +   "  | |   ";
          FourthLine = FourthLine + "  | |   ";
          FifthLine = FifthLine +   " _| |_  ";
          SixthLine = SixthLine +   "|_____| ";
          romanNumber = romanNumber.substring(1);
          break;
      }
    }
    return FirstLine+"\n"+SecondLine+"\n"+ThirdLine+"\n"+FourthLine+"\n"+FifthLine+"\n"+SixthLine;
  }
}