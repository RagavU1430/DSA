class selection {
    public static void main(String[] args) {
        int[] arr = { 10, 34, 54, 1, 4 };
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = 0;
            j = j - 1;
            while (arr[j] > key && j >= 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}