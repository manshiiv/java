import java.util.Scanner;
public class reverseno {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("enter the number:");

        int n =sc.nextInt() ;
        System.out.println("the entered no is " +n);
        sc.close();
        int rev_num =0 , sum=0;
     do{
        rev_num= rev_num*10+ n % 10;
        sum= sum + n%10;
        n= n/10;
      }
      while(n>0);
      System.out.println("reverse of given no is :"+ rev_num);
      System.out.println("the sum of no is :"+ sum);
     
     
    }
     
     }

