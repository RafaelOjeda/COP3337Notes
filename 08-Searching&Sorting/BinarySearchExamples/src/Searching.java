import java.util.*;
public class Searching {

    public static Comparable[] randomNumberGenerator(int size) {
        Random r = new Random();
        Comparable[] output = new Comparable[size];
        for(int i = 0; i < size;i++)
            output[i] = Math.abs(r.nextInt())%(2*size);

        Arrays.sort(output);
        return output;
    }
    public static boolean linearSearch(Comparable[] array, Comparable target) {
        for(Comparable c: array) {
            if (c.compareTo(target) == 0) {
                return true;
            }
        }
        return false;
    }
    private static boolean binarySearchHelper(Comparable[] array, Comparable target, int low, int high) {
        if(low > high) {//empty search space
            return false;
        }
        int mid = (int)(low/2.0+high/2.0);
        int comp = target.compareTo(array[mid]);
        if(comp == 0) return true;
        if(comp > 0) {
            return binarySearchHelper(array, target, mid+1, high);
        }
        return binarySearchHelper(array, target, low, mid-1);
    }
    public static boolean binarySearch(Comparable[] array, Comparable target) {
        return binarySearchHelper(array, target, 0, array.length - 1);
    }

    public static int sqrtUsingBinarySearchV2(int n) {
        if (n <= 1)
            return n;
        int low = 0, high = n - 1, mid = -1;
        while (low < high - 1) {
            mid = (int) (low / 2.0 + high / 2.0);
            double diff = mid - n / (double) mid;
            if (diff > 0.00001)// mid > sqrt (n)
                high = mid;
            else if (diff < -0.00001)// mid < sqrt(n)
                low = mid;
            else
                return mid;
        }
        return low;
    }

    public static int sqrtUsingBinarySearch(int n) {
        if (n <= 1)
            return n;
        int low = 0, high = n - 1, mid = -1;
        while (low < high - 1) {
            mid = (int) (low / 2.0 + high / 2.0);
            if (mid > 46340) {// to avoid overflow
                mid = 46340;
                if (n > mid * mid)
                    n = mid * mid;
            }
            int midSquare = mid * mid;
            if (midSquare > n)
                high = mid;
            else if (midSquare < n)
                low = mid;
            else
                return mid;
        }
        return low;
    }


    public static boolean binarySearchIterative(Comparable[] array, Comparable target) {

        int low = 0, high = array.length - 1;
        while (low <= high) {
            int mid = (int)(low/2.0+high/2.0);
            int comp = target.compareTo(array[mid]);

            if (target.compareTo(array[mid]) == 0) return true;
            if (target.compareTo(array[mid]) > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static int binarySearchForIndex(Comparable[] array, Comparable target) {
        int low = 0, high = array.length - 1;
        while(low <= high) {
            int mid = (int)(low/2.0+high/2.0);
            int comp = target.compareTo(array[mid]);
            if(comp == 0) return mid;
            if(comp > 0) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static int recursiveBinarySearch (int[] array, int value, int start, int end) {
        

        if (start < end) {
            return -1;
        } else {
            int mid = (start + end)/2;

            if (array[mid] == value) {
                return mid;
            } else if (array[mid] > value]) {
                return recursiveBinarySearch(array, value, 0, mid-1);
            } else {
                return recursiveBinarySearch(array, value, mid+1, end);
            }
        }
    }
    public static void main(String[] args) {

        System.out.println(sqrtUsingBinarySearch(2000000000));
        System.out.flush();
        Comparable[] array = randomNumberGenerator(10000000);
        //let's sort it....
        long start = System.nanoTime();
        System.out.println("Result of searching 47 is "+
                binarySearchIterative(array, 47));
        //linearSearch(array, 47));
        System.out.printf("Total time is %.3f milisecond.\n",
                (System.nanoTime()-start)/1000000.0);


        int[] numbers = {1,3,4,5,6,7,8,9,2,11,13};

        int res = recursiveLinearSearch(numbers, 7, numbers.length);

        System.out.println(res);
    }

}