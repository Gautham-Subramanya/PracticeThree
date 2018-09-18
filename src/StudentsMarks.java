import java.util.Scanner;

public class StudentsMarks {

    public boolean unlimitedParams(String... args) {
        boolean found = false;
        for (int i = 0; i < args.length; i++) {

            if (Integer.parseInt(args[i]) < 0 || Integer.parseInt(args[i]) > 100) {

                found = true;
            }


        }
        return found;
    }
}