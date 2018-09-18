import java.util.Scanner;

public class ConsecutiveNumbers {

    public static boolean checkConsecutive(String input){
        boolean consecutive = true;
        String[] numbers = input.split(",");
        if (numbers.length != 7) {
            System.out.println("Invalid number of inputs");
        } else {
            int i = 0;
            while ((i <numbers.length-1)&&(consecutive == true)) {
                int digit = Integer.parseInt(numbers[i]);
                int digit1 = digit+1;
                int digit2 = digit-1;
                if(digit1 == Integer.parseInt(numbers[i+1])){
                    //System.out.println("In if");
                    consecutive = true;
                }
                else if(digit2 == Integer.parseInt(numbers[i+1])){
                    consecutive = true;
                }
                else{
                    //System.out.println("In else");
                    consecutive = false;
                }
                i++;
            }
        }
        return consecutive;
    }

}

