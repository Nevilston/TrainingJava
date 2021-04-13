import java.util.Scanner;
public class example {
	public static void main(String  args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name = in.nextLine();
		System.out.println("Name is "+name);
		in.close();
		Example1.additon();
	}
	
}
 public class Example1{
	 public static void additon() {
	 System.out.println("Enter Number");
	int  a = sc.nextInt();
	 int b = sc.nextInt();
	 int  c= a + b;
	 System.out.println("Total is "+c);
	 
 }}
 