public class EqualArray {
    
    public static boolean equalArray (int[] x, int[] y) {
        if (x.length != y.length) {
            return false;
        } else {
            for (int i = 0; i < x.length; i++) {
                if (x[i] != y[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {

    }
}
