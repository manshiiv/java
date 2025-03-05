import java.util.Scanner;

public class arraytraversing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();
        int array[]=new int[size];

       for(int i=0;i<size;i++){
        array [i]=sc.nextInt();
     }
           boolean allsame= true;
              for(int i=1;i<size;i++){
                if(array[i]!=array[i-1]){
                     allsame=false;
                     break;
                }
              }
                if(allsame==true){
                    System.out.println("All elements are same");
                }else{
                    System.out.println("All elements are not same");
                }

            }
}
