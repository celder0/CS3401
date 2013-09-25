/*
 * Chris Elder
 * CS3401/01
 * Yong Shi
 * Assignment #1
 */

public class Recursion {

	public static void main(String[] args) {

		String s1 = "level", s2 = "food", s3 = "deed";
		int num1 = 1, num2 = 3, num3 = 21;
		System.out.println("Is "+s1+" a paradrome? "+isPalindrome_r(s1));
		System.out.println("Is "+s2+" a paradrome? "+isPalindrome_r(s2));
		System.out.println("Is "+s3+" a paradrome? "+isPalindrome_r(s3));
		System.out.println("Is "+s1+" a paradrome? "+isPalindrome_nr(s1));
		System.out.println("Is "+s2+" a paradrome? "+isPalindrome_nr(s2));
		System.out.println("Is "+s3+" a paradrome? "+isPalindrome_nr(s3));
		System.out.println("n="+num1+" so the sum is " +sum_r(num1));
		System.out.println("n="+num2+" so the sum is " +sum_r(num2));
		System.out.println("n="+num3+" so the sum is " +sum_r(num3));
		System.out.println("n="+num1+" so the sum is " +sum_nr(num1));
		System.out.println("n="+num2+" so the sum is " +sum_nr(num2));
		System.out.println("n="+num3+" so the sum is " +sum_nr(num3));
		System.out.println("The GCD of "+num1+" and "+num3+" is "+getGcd_r(num1,num3));
		System.out.println("The GCD of "+num1+" and "+num2+" is "+getGcd_r(num1,num2));
		System.out.println("The GCD of "+num2+" and "+num3+" is "+getGcd_r(num2,num3));
		System.out.println("The GCD of "+num1+" and "+num3+" is "+getGcd_nr(num1,num3));
		System.out.println("The GCD of "+num1+" and "+num2+" is "+getGcd_nr(num1,num2));
		System.out.println("The GCD of "+num2+" and "+num3+" is "+getGcd_nr(num3,num2));
		
	}
	
	//this method allows you to recursively check if a word is a palindrome 
	public static boolean isPalindrome_r(String word) {
		if(word.length()>1)
		{
			if(word.charAt(0)==word.charAt(word.length()-1))
			{
				if (word.length()==2)
				{
					return true;
				}
				return isPalindrome_r(word.substring(1,word.length()-1));
			}
			else
				return false;
		}
			return true;
	} 

	//this method allows you to non-recursively check if a word is a palindrome 
	public static boolean isPalindrome_nr(String word) {
	//your implementation of this method goes here
		for(int i = 0; i <= word.length()/2; i++)
		{
			if(word.charAt(i)!=word.charAt(word.length()-i-1))
			{
				return false;
			}
		}
		return true;
	} 

	//this method allows you to recursively compute Sum(n) = 1+1/2 +1/3 + … + 1/n
	public static double sum_r(int n) {
	//your implementation of this method goes here
		if(n == 1)
		{
			return 1;
		}
		else
		{
			return 1.0/n + sum_r(n-1);
		}
	}

	   //this method allows you to non-recursively compute Sum(n) = 1+1/2 +1/3 + … + 1/n
	public static double sum_nr(int n) {
		double sum = 0.0;
		for(int i = n; i >0; i--)
		{
			sum += 1.0/i;
		}
		return sum;
	 
	}

	   //this method allows you to recursively compute the greatest common divisor of two    
	   //positive integer numbers 
	public static double getGcd_r (int m, int n) {
	//your implementation of this method goes here
		if(n>m)
		{
			return getGcd_r(n,m);
		}
		if(n == 0)
		{
			return m;
		}
		if(n == 1)
		{
			return 1;
		}
		return getGcd_r(n,n%m);
		
	}
	   //this method allows you to non-recursively compute the greatest common divisor of two    
	   //positive integer numbers 
	public static double getGcd_nr (int m, int n) {
		for(int i = n; i > 0; i--)
		{
			if(n%i==0 && m%i==0)
			{
				return i;
			}
		}
		return 1;		
	}
}
