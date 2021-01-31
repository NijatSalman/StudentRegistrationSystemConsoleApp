package Utility;

import java.util.Scanner;

public class InputUtil {
	
	public static String RequaireText(String title){
		
	   	Scanner sc=new Scanner(System.in);
	   	System.out.println(title);
		 String answer=sc.nextLine();
		 return answer;
	}
	
	
	public static int RequaireNumber(String title){
		
	   	Scanner sc=new Scanner(System.in);
	   	System.out.println(title);
		 int answer=sc.nextInt();
		 return answer;
	}

}
