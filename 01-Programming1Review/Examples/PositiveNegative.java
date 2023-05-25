public class PositiveNegative {
    
    public static void rearrange(int[] arr) {
        int[] pos = new int[arr.length];
        int[] neg = new int[arr.length];

        int j = 0;
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos[j] = arr[i];
                j++;
            } else {
                neg[k] = arr[i];
                k++;
            }
        }

        int i = 0;
        int l = 0;

        while (neg[i] < 0) {
            arr[l] = neg[i];
            i++;
            l++;
        }
        i = 0;
        while (pos[i] > 0) {
            arr[l] = pos[i];
            i++;
            l++;
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int [] nums = {-3,-2,-1,1,2,3,4};

        rearrange(nums);
    }
}
