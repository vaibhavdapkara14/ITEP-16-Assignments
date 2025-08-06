

class Program14 {
    public static void main(String args[]) {
        int arr[] = {1, 2, 1, 2, 5,4,7};
        int n = arr.length;

        boolean found = false;

        for (int i = 0; i < n; i++) {
            boolean isUnique = true;

            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.println("First non-repeating element: " + arr[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeating element found");
        }
    }
}
