package test.java;
import org.junit.Assert;
import org.junit.Test;


import main.FizzBuzz;

public class FizzBuzzTest {
   @Test
	public void fizzbuztest1(){
	   FizzBuzz fizzbuzz = new FizzBuzz();
	   
	  
	Assert.assertEquals( "1", fizzbuzz.convert(1));
	Assert.assertEquals( "2", fizzbuzz.convert(2));
   }
   @Test
    public void fizzbuztest2(){
	   FizzBuzz fizzbuzz=new FizzBuzz();
	   Assert.assertEquals("Fizz", fizzbuzz.convert(3));
   }
   @Test
   public void fizzbuztest3(){
	   FizzBuzz fizzbuzz=new FizzBuzz();
	   Assert.assertEquals("Buzz", fizzbuzz.convert(5));
  }
   @Test
   public void fizzbuztest4(){
	   FizzBuzz fizzbuzz=new FizzBuzz();
	   Assert.assertEquals("FizzBuzz", fizzbuzz.convert(15));
  }
}
