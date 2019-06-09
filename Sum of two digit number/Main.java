import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
       Scanner sc = new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=n1%10;
      int n3=n1/10;
      int sum=n3+n2;
      System.out.println(sum);
	}

}