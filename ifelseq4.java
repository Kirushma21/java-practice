import java.util.Scanner;

public class ifelseq4 {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        int income= obj.nextInt();
        if(income>7000){
            System.out.println("scholarship available");
        }
        else{
            System.out.println("not avail");
        }
    }
    
}
