package Strings.com;
// write a program to print number occurred characater in the string:
public class assignment4 {
	public static void main(String[] args) {
		String s= "hello world";
		int totalcount=s.length();
		int totalcount_afterRemove=s.replace("l" ,"").length();
		int count = totalcount-totalcount_afterRemove;
		System.out.println("The l Character ocuured for:"+count);
	}
}
