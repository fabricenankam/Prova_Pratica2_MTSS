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