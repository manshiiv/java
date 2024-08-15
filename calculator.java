import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String n = sc.next();
        sc.close();
        switch(n){
            case"addition":System.out.println(a+b);
            break;
            case"sub": System.out.println(a-b);
            break;
            case"multiply": System.out.println(a*b);
            break;
            case"divide":System.out.println(a/b);
            break;
            case"modulo":System.out.println(a%b);
            break;
            default:System.out.println("invalid operation");

        }
    }
    
    
}
