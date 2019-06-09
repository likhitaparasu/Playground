import java.util.Scanner;
class Main
{
  public static void main(String args[])
  { Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int n1=n/100;
   int n2=n%100;
   int n3=n2/10;
   int n4=n%10;
   System.out.print(n4);
   System.out.print(n3);
   System.out.print(n1);
    //Type your code here
  }
}