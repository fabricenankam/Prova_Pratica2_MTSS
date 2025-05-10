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
}
