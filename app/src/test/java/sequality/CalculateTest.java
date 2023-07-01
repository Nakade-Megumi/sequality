package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest{
  @Test
  public void testSum(){
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(3,2));
  }

  @Test
  public void testAverage(){
    Calculate calculate = new Calculate();
    double expected = 2.5;
    assertEquals(expected, calculate.average(5,2),0.0);
  }

  @Test
  public void testSumTo(){
    Calculate calculate = new Calculate();
    int expected = 55;
    assertEquals(expected, calculate.sumTo(10,1));
  }

  @Test
  public void testSumTo_2(){
    Calculate calculate = new Calculate();
    int expected = 55;
    assertEquals(expected, calculate.sumTo(1,10));
  }

  @Test
  public void testOdd(){
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.odd(10,1));
  }

  @Test
  public void testOdd_2(){
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.odd(1,10));
  }

  @Test
  public void testeven(){
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expected, calculate.even(10,1));
  }

  @Test
  public void testeven_2(){
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expected, calculate.even(1,10));
  }
}
