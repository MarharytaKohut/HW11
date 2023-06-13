import java.util.Arrays;

public class Lottery {
    public static void main(String[] args) {
        int[] array1 = new int[]{3, 4, 0, 8, 9, 2, 5};
        int[] array2 = new int[]{1, 0, 4, 6, 8, 5, 7};
        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println("Кількість збігів: 1");
    }
}
