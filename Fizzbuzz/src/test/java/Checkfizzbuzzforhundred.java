package test.java;
import org.junit.Test;

import main.FizzBuzz;
public class Checkfizzbuzzforhundred {
	
  @Test
  public void hundredfizzbuzz()
  {
	  FizzBuzz fizzbuzz=new FizzBuzz();
	  for(int i=1;i<=100;i++)
	  {
		System.out.println(fizzbuzz.convert(i));  
	  }
  }
	

}
