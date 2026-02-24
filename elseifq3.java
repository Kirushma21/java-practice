import java.util.Scanner;

public class elseifq3 {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        int sal= obj.nextInt();
        int age=obj.nextInt();
        if(sal>=20000 || age<=25){
            System.out.println("eligible for loan");
            int loan= obj.nextInt();
            
        
            if(loan<=50000){
                System.out.println("eligible for loan");
            }
            else{
                System.out.println("not eligible");
            }
        }
    }
    
}
