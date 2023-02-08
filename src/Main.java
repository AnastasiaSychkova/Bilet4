public class Main {
    public static void main(String[] args) {

        String[] arr = {"one", "two", "three", "four", "two", "four"};
        for (int i = 0; i < arr.length; i++) {
            String arr2 = arr[i];
            for (int f = i + 1; f < arr.length; f++) {
                if (arr2 == null) {
                    break;
                }
                if (arr2.equals(arr[f])) {
                    arr[i] = null;
                    arr2 = null;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.printf(arr[i] + " ");
            }
        }
    }
}







