public class ExceptionTypesDemo {
    public static void main(String[] args) {
        try {
            int[] arr = new int[10];
            arr[11] = 20;
            int[] arr2 = new int[-10];
            Object obj = null;
            obj.toString();
        }
        catch(NegativeArraySizeException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
