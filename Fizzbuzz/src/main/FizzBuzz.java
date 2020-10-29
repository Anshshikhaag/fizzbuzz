package main;

public class FizzBuzz {

	public String convert(int checkfizzbuzz)
	{
	if(checkfizzbuzz%15==0)	
	{
		return "FizzBuzz";
	}
	if(checkfizzbuzz%3==0)
	{
		return "Fizz";
	}
	
	if(checkfizzbuzz%5==0)
	{
		return "Buzz";
	}
    
	return String.valueOf(checkfizzbuzz);
	}
}
