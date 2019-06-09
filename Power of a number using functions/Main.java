import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    long base,exponent,r=1; 
     Scanner sc=new Scanner(System.in);
       base=sc.nextLong();
       exponent=sc.nextLong();
     r=calpower(base,exponent); 
     System.out.println(r); 
  } 
  static long calpower(long n1,long p1)
  {     long r1=1;
     if(n1>=0&&p1==0)     
        r1 =1; 
     else if(n1==0&&p1>=1)
       r1=0;
     else 
       for(int i=1;i<=p1;i++)       
         r1=r1 *n1; 
     return r1; 
    } 
}