public class Sorting {

    public static int[] selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int min = i;

            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }

            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }        

        return array;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {

        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random()*100);
        }

        printArray(numbers);

        System.out.println();
        selectionSort(numbers);
        printArray(numbers);
    }
}
