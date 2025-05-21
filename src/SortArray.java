import java.util.Arrays;

public class SortArray {

    public int[] sort(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Le tableau ne peut pas être vide");
        }

        // Tri par sélection
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;

            // Recherche du plus petit élément
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Échange des éléments
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        SortArray sortArray = new SortArray();

        int[] tableau = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        int[] result = sortArray.sort(tableau);
        System.out.println("Tableau trié : " + Arrays.toString(result));
    }
}
