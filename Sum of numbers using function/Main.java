import java.util.Scanner;
class Main{
 public static int sumofn(int num){
    int sum=0;
    for(int i=1;i<=num;i++){
   sum=sum+i;}
  return sum; }
 
	public static void main (String[] args)
    {
	 Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();        
      int son=sumofn(n);
     
      System.out.println(son);
	} 
}