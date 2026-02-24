import java.util.Scanner;
public class positivenum {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the num:");
        int num=s.nextInt();
        if(num>0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }

    }

    
}
