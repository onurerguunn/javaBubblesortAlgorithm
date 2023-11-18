package bubblesortalg;

public class BubbleSortAlg {

    public static void main(String[] args) {

        int[] array = {2, 4, 6, 3, 7, 11, 9};
        bubbleSort(array); // KABARCIK SIRALAMA ALGORİTMASI BURADA KULLANILDI .
        for (int i = 0; i < array.length; i++) { // KONTROL AMAÇLI TEKRAR YAZIYORUZ.
            System.out.println(array[i]);

        }

    }

// Bubblesort algoritması
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Komşu elemanları karşılaştır
                if (arr[j] > arr[j + 1]) {
                    // Swap (yer değiştirme) işlemi
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
