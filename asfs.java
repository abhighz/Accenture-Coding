public class asfs {
    public static void main(String[] args) {
        int result=0;
        int [] arr={5};
        for (int i = 0; i < arr.length; i++) {
            result^=arr[i];
        }
        System.out.println(result);      
    }
}