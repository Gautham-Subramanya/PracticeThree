import java.util.Scanner;

public class PlacesArray {
//    public static void main(String[] args) {
//        int i;
//        System.out.println("Enter the number of places to be stored");
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        String[] places = new String[n];
//        String[] result = new String[n];
//        System.out.println("Enter the place");
//        for(i=0;i<n;i++){
//            Scanner scan = new Scanner(System.in);
//            places[i] = scan.nextLine();
//            result[i] = places[i].replaceAll("[aeiou]", "");
//        }
//        for(i=0;i<n;i++){
//            System.out.println("Place name without Vowels: "+result[i]);
//        }
//    }


    public String[] places(String[] places, int n) {
        int i;
        //System.out.println("Enter the number of places to be stored");
        //Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
        String[] result = new String[n];
        for (i = 0; i < n; i++) {
            result[i] = places[i].replaceAll("[aeiou]", "");
        }
//        for (i = 0; i < n; i++) {
//            System.out.println("Place name without Vowels: " + result[i]);
//
//        }
        return result;
    }
}
