import java.util.Scanner;

public class shiv {
    public static void main(String[] args) {
		 Scanner shivam = new Scanner(System.in);
		 
		 
		 System.out.println("Before Swapping:");
		 System.out.println("Enter a1");
		 int a = shivam.nextInt();
		 int a1 = a;
		 System.out.println("a1 : " +a);
		 System.out.println("Enter b1");
		 int b = shivam.nextInt();
		 int b1 = b;
		 System.out.println("a2 : " +b);
		 
		 System.out.println("After Swapping:");
		 
		 a1 = b;
		 System.out.println("a1 : " +a1);
		 b1 = a ;
		 System.out.println("b1 : " +b1);
	}
}
