import java.util.Scanner;
public class ifequalinput {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        int num1= obj.nextInt();
        int num2= obj.nextInt();
        if(num1==num2){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
    
}
