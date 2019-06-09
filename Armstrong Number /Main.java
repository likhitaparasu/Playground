import java.util.Scanner;
class Main{
        public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
          int num=sc.nextInt();
        int originalNumber, remainder, result = 0;

        originalNumber = num;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == num)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not a Armstrong Number");
    }
}