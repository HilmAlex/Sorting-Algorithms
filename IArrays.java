package sort;

public interface IArrays {
    static void swap(int[] array, int position1, int position2) {
        int temp;

        temp = array[position1];
        array[position1] = array[position2];
        array[position2] = temp;
    }

    static void fill(int array[], int minimumValue, int maximumValue){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ( Math.random() * maximumValue ) + minimumValue;
        }
    }

    static void print(int[] vector) {
        String printView;

        printView = "[";

        for (int i = 0; i < vector.length; i++) {
            printView += vector[i] + ", ";
        }

        printView += "]";

        System.out.println(printView);
    }
}
