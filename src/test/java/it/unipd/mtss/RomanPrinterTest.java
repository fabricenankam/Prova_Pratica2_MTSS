////////////////////////////////////////////////////////////////////
// FABRICE NANKAM 2123577
// YIGU ZHU 2082860
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

  //Issue #5
  @Test
  public void testprint5()
  {
    int testNumber = 5;
    String expectedResult = "__      __ \n\\ \\    / / \n \\ \\  / /  \n  \\ \\/ /   \n   \\ /     \n    \\/     ";
    String testResult = RomanPrinter.print(testNumber);
    assertEquals(expectedResult, testResult);
  }
  
  //Issue #6
  @Test
  public void testprint10()
  {
    int testNumber = 10;
    String expectedResult = "__   __ \n\\ \\ / / \n \\ V /  \n  > <   \n / . \\  \n/_/ \\_\\ ";
    String testResult = RomanPrinter.print(testNumber);
    assertEquals(expectedResult, testResult);
  }

  //Isuue #7
  @Test
  public void testprint50()
  {
    int testNumber = 50;
    String expectedResult = " _       \n| |      \n| |      \n| |      \n| |____  \n|______| ";
    String testResult = RomanPrinter.print(testNumber);
    assertEquals(expectedResult, testResult);
  }
  
  //Issue #8
  @Test
  public void testprint100()
  {
    int testNumber = 100;
    String expectedResult = "  _____  \n / ____| \n| |      \n| |      \n| |____  \n \\_____| ";
    String testResult = RomanPrinter.print(testNumber);
    assertEquals(expectedResult, testResult);
  }

  //Issue #9
  @Test
  public void testprint500()
  {
    int testNumber = 500;
    String expectedResult = " _____   \n|  __ \\  \n| |  | | \n| |  | | \n| |__| | \n|_____/  ";
    String testResult = RomanPrinter.print(testNumber);
    assertEquals(expectedResult, testResult);
  }
}
