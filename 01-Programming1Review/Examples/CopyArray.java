class CopyArray {

    public static void copyArr(int[] source, int[] target) {
        if (source.length == target.length) {
            for (int i = 0; i < source.length; i++) {
                target[i] = source[i];
            }
        } else {
            System.out.println("Not same size arrays");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        
    }
}