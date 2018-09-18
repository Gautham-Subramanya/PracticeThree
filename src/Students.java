import java.util.Scanner;

public class Students {
    public static void main(String[] args){
        System.out.println("Enter the number of student details that will be entered");
        Scanner in = new Scanner(System.in);
        int grades;
        int numOfStudents = in.nextInt();
        int[] stuGrades = new int[numOfStudents];
        int i = 0;
        while (i != numOfStudents) {
            try {
                System.out.println("Enter the grade of student " + i);
                grades = in.nextInt();
                if ((grades < 0) || (grades > 100)) {
                    throw new NumberFormatException();
                }
                else {
                    stuGrades[i] = grades;
                    i++;
                }
            }
            catch (Exception e) {
                System.out.println("Enter a valid grade(between 0 and 100)");
            }
        }
    }

}
