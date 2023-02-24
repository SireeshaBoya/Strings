package Strings.com;
import java.util.Scanner;
public class Assignment   


// small program for printing how many words present in the strings
{  
	public static void main(String[] args) {
		//String name="well ccome to the java tutorials";
		System.out.println("Enter your String:");
		Scanner sc= new Scanner(System.in);
		String n1=sc.nextLine();
		int count=1;
		for(int i=0;i<n1.length()-1;i++) {
			if((n1.charAt(i)==' ') && (n1.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("total  umber of words:"+count);
	}
}
