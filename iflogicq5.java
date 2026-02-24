import java.util.Scanner;

public class iflogicq5 {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        int num= obj.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("divisible");
        }
        else{
            System.out.println("not");
        }


        
    }
    
}
