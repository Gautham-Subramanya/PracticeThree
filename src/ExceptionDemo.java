import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            int num1, num2, res;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the first number");
            num1 = scan.nextInt();
            System.out.println("Enter the second number");
            num2 = scan.nextInt();
            if(num2 == 0){
                throw new Exception("Division by Zero is illegal");
            }
            res = num1/num2;
        }
        catch(Exception x){
            System.out.println(x);
        }
        finally {
            System.out.println("In Finally");
        }
    }
}
