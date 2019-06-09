import java.util.Scanner;
class Main
{
  public static int sq(int num){
    int s=num*num;
  return s; }
 
	public static void main (String[] args)
    {
	 Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int squ=sq(n);
      System.out.println(squ);
	} 
}