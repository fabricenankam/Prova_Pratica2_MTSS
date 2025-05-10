////////////////////////////////////////////////////////////////////
// FABRICE NANKAM 2123577
// YIGU ZHU 2082860
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest 
{
  //Issue #4
  @Test
  public void testInputLessThan1(){
    try{
        IntegerToRoman.convert(0);
    }catch (IllegalArgumentException errore){
        assertEquals("Input deve essere un numero tra 1 e 1000.", errore.getMessage());
    }
  }

  @Test
  public void testInputGreaterThan1000(){
    try{
        IntegerToRoman.convert(1001);
    }catch (IllegalArgumentException errore){
        assertEquals("Input deve essere un numero tra 1 e 1000.", errore.getMessage());
    }
  }
  @Test
  public void test1()
  {
    int testNumber = 1;
    String testResult = IntegerToRoman.convert(testNumber);
    assertEquals("I", testResult);
  }

  @Test
  public void test3()
  {
    int testNumber = 3;
    String testResult = IntegerToRoman.convert(testNumber);
    assertEquals("III", testResult);
  }

  @Test
  public void test4()
  {
    int testNumber = 4;
    String testResult = IntegerToRoman.convert(testNumber);
    assertEquals("IV", testResult);
  }

//issue #5
  @Test
  public void test7()
  {
    int testNumber = 7;
    String testResult = IntegerToRoman.convert(testNumber);
    assertEquals("VII", testResult);
  }

  @Test
  public void test8()
  {
    int testNumber = 8;
    String testResult = IntegerToRoman.convert(testNumber);
    assertEquals("VIII", testResult);
  }
  
  //Issue #6
  @Test
  public void test9()
  {
    int testNumber = 9;
    String testResult = IntegerToRoman.convert(testNumber);
    assertEquals("IX", testResult);
  }

  @Test
  public void test13()
  {
    int testNumber = 13;
    String testResult = IntegerToRoman.convert(testNumber);
    assertEquals("XIII", testResult);
  }

  @Test
  public void test27()
  {
    int testNumber = 27;
    String testResult = IntegerToRoman.convert(testNumber);
    assertEquals("XXVII", testResult);
  }

  //Issue #7
  @Test
  public void test45()
  {
    int testNumber = 45;
    String testResult = IntegerToRoman.convert(testNumber);
    assertEquals("XLV", testResult);
  }

  @Test
  public void test84()
  {
    int testNumber = 84;
    String testResult = IntegerToRoman.convert(testNumber);
    assertEquals("LXXXIV", testResult);
  }

  @Test
  public void test89()
  {
    int testNumber = 89;
    String testResult = IntegerToRoman.convert(testNumber);
    assertEquals("LXXXIX", testResult);
  }

  //Issue #8
  @Test
  public void test90()
  {
    int testNumber = 90;
    String testResult = IntegerToRoman.convert(testNumber);
    assertEquals("XC", testResult);
  }

  @Test
  public void test240()
  {
    int testNumber = 240;
    String testResult = IntegerToRoman.convert(testNumber);
    assertEquals("CCXL", testResult);
  }

  @Test
  public void test314()
  {
    int testNumber = 314;
    String testResult = IntegerToRoman.convert(testNumber);
    assertEquals("CCCXIV", testResult);
  }

  @Test
  public void test399()
  {
    int testNumber = 399;
    String testResult = IntegerToRoman.convert(testNumber);
    assertEquals("CCCXCIX", testResult);
  }

  //Issue #9
  @Test
  public void test400()
  {
    int testNumber = 400;
    String testResult = IntegerToRoman.convert(testNumber);
    assertEquals("CD", testResult);
  }

  @Test
  public void test420()
  {
    int testNumber = 420;
    String testResult = IntegerToRoman.convert(testNumber);
    assertEquals("CDXX", testResult);
  }

  @Test
  public void test651()
  {
    int testNumber = 651;
    String testResult = IntegerToRoman.convert(testNumber);
    assertEquals("DCLI", testResult);
  }

  @Test
  public void test726()
  {
    int testNumber = 726;
    String testResult = IntegerToRoman.convert(testNumber);
    assertEquals("DCCXXVI", testResult);
  }

  @Test
  public void test899()
  {
    int testNumber = 899;
    String testResult = IntegerToRoman.convert(testNumber);
    assertEquals("DCCCXCIX", testResult);
  }

  //Issue #10
  @Test
  public void test900()
  {
    int testNumber = 900;
    String testResult = IntegerToRoman.convert(testNumber);
    assertEquals("CM", testResult);
  }
  
  @Test
  public void test945()
  {
    int testNumber = 945;
    String testResult = IntegerToRoman.convert(testNumber);
    assertEquals("CMXLV", testResult);
  }

  @Test
  public void test1000()
  {
    int testNumber = 1000;
    String testResult = IntegerToRoman.convert(testNumber);
    assertEquals("M", testResult);
  }
}
