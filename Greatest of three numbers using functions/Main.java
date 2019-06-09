import java.util.Scanner;
class Main{
  public static int compare(int p,int q,int r){
    int g;
    if(p>q)
      g=p;
    else
      g=q;
    if(g<r)
      g=r;
    return g;
  }      
	public static void main (String[] args){
	 Scanner sc = new Scanner(System.in);
      int n1= sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      System.out.print(compare(n1,n2,n3));
    }
}