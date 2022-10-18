package Strings;

import java.util.Arrays;


public class CheckForSuffle {

	public static void main(String[] args) {
		
		String A = "gupta";
		String B = "rishav";
		String C = "rigushavpta";
		
		String local = A + B;
		
		char[] newlocal =  local.toCharArray();
		Arrays.sort(newlocal);
		
		char[] newC =  C.toCharArray();
		Arrays.sort(newC);
		
		int count = 0;
		for (int i = 0; i < newlocal.length; i++) {
			if(newlocal[i] != newC[i])
			{
				count = 1;
			}
		
		}	
		
		if(count ==0)
		{
			System.out.println("love is true");
		}
		else {
			System.out.println("love is waste of time");
		}
		
	}

}
