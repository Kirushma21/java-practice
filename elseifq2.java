import java.util.Scanner;
public class elseifq2 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a= obj.nextInt();
        int b= obj.nextInt();
        int c= obj.nextInt();
        int d= obj.nextInt();
        int e= obj.nextInt();
        int avg= a+b+c+d+e/5;
        System.out.println(avg);
        if(avg<35){
            System.out.println("additional classs");
        }
        else{
            System.out.println("good to go");
        }
    }
    
}
