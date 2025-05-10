////////////////////////////////////////////////////////////////////
// FABRICE NANKAM 2123577
// YIGU ZHU 2082860
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
  public static String convert(int number){
    if(number > 0 && number <= 1000){
      StringBuilder roman = new StringBuilder();
    int[] numberArabic = {
        50,      // Issue #7
        40,      // Issue #7
        10,      // Issue #6
        9,       // Issue #6
        5,       // Issue #5
        4,       // Issue #5
        1        // Issue #4
    };
    String[] numberRoman = {
        "L",     // Issue #7
        "XL",    // Issue #7
        "X",     // Issue #6
        "IX",    // Issue #6
        "V",     // Issue #5
        "IV",    // Issue #5
        "I"      // Issue #4
    };

    for (int i = 0; i < numberArabic.length; i++) {
      int count = number / numberArabic[i];
      number %= numberArabic[i];
      for (int j = 0; j < count; j++) {
          roman.append(numberRoman[i]);
      }
    }
    return roman.toString();
    }
    else{
      throw new IllegalArgumentException("Input deve essere un numero tra 1 e 1000.");
    }
  }
  }
  
