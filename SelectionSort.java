package sort;

/**
 * SelectionSort: explora la lista hacia la derecha partiendo desde el primer elemento
 * para encontrar el elemento mas pequeño e intercambiarlo por el primer
 * elemento.
 */
public class SelectionSort implements IArrays {

    public static void sort(int[] array) {
        int key;

        for (int i = 0; i < array.length - 1; i++) {
            key = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[key]) {
                    key = j;
                }
            }
            IArrays.swap(array, i, key);
        }
    }
}
