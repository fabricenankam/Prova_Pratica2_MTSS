////////////////////////////////////////////////////////////////////
// [FABRICE] [NANKAM] [2123577]
// [YIGU] [ZHU] [2082860]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanPrinterTest 
{
  //Issue #4
  @Test
  public void testprint1()
  {
    int testNumber = 1;
    String expectedResult = " _____  \n|_   _| \n  | |   \n  | |   \n _| |_  \n|_____| ";
    String testResult = RomanPrinter.print(testNumber);
    assertEquals(expectedResult, testResult);
  }
}
