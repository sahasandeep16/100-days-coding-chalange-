import java.util.*;
public class TryCase {
	public static void main (String [] args ) {
		Scanner in = new Scanner(System.in);
		
		String e = in.nextLine();
		
		StringBuffer ne = new StringBuffer(e);
	
		for (int i = 0; i < e.length();i++) {
			if (Character.isLowerCase(e.charAt(i)))
			{
				ne.setCharAt(i,Character.toUpperCase(e.charAt(i)));
			}
			
			else if(Character.isUpperCase(e.charAt(i))) {    
                
              ne.setCharAt(i, Character.toLowerCase(e.charAt(i)));    
            }  
		}
		
System.out.println("The conversion is :" +ne);
	}
}
