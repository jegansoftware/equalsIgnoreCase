//file name should be named as CodePointAt.java
package codePointAt;
import java.util.*;
public class CodePointAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ni="Yes";
		String ans="";
		Scanner n=new Scanner(System.in);
		codePoint_At in=new codePoint_At();
		
	
		
		do {
			
			in.get();
			
			// ask question for continue 
			System.out.printf("\nDo you want to continue ?Yes /No\n");
			ans=n.nextLine();
		}while(ni.equalsIgnoreCase(ans));
		
		in=null;
	}

}
