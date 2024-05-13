package question4;
public class question4 {
    public static void sort(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap characters using a temporary variable
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        char[] characters = {'a', 'c', 'd', 'b', 'e'};
        System.out.println("Unsorted array: " + new String(characters));

        sort(characters);

        System.out.println("Sorted array: " + new String(characters));
    }
}


