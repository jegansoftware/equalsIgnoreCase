//file name should be named as codePoint_At
package codePointAt;
import java.util.*;
public class codePoint_At {
	private String name="";
	
	Scanner in=new Scanner(System.in);
	public void get()
	{
		int i;
		System.out.printf("\nEnter Your String:");
		name=in.nextLine();
		
		int n;
		for(i=0;i<name.length();i++)
		{
			n=name.charAt(i);
			if(n==32)
			{
			System.out.printf("\n%2c   %2d - Space ",name.codePointAt(i),name.codePointAt(i));
			}
			else
			{
				System.out.printf("\n%2c = %2d",name.codePointAt(i),name.codePointAt(i));
			}
		}
		
	}

}
