import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    int i,count=0;
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    for(i=1;i<=n;i++){
      System.out.print(i);
        count++;
    if(count%3==0)
      System.out.print(",");}
  }
}