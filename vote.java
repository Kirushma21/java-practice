import java.util.Scanner;
public class vote {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter ur age");
        int age= s.nextInt();
      
        if(age>=18){
            System.out.println("eligible to vote");

        }
        else{
            System.out.println("Not eligible");

        }
        
    }
    
}
