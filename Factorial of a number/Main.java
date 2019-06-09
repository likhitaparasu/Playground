import java.util.Scanner;
class Main{
	public static void main (String[] args){
  int i,fact=1;
Scanner scan = new Scanner(System.in);
      int num=scan.nextInt();
for(i=1;i<=num;i++){
fact=fact*i;
}
System.out.println(fact);
    }
}