package utils;

public class Math {
	public static int factorial(int l){
		if (l <= 1){return 1;}
		return l * factorial(l-1);
	}
	
	public static int factorialLoop(int a){
		int n = 1;
		for (int i = l; i >= 1; i--)
		{
			n = n * i;
		}
		return n;
	}
}
