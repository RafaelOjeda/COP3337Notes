class Main {

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
                int temp = arr[min];
                arr[min] = arr[j];
                arr[j] = temp;
            }

        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1};

        int[] arr1 = selectionSort(arr);

        System.out.println(selectionSort(arr1));
    }
}