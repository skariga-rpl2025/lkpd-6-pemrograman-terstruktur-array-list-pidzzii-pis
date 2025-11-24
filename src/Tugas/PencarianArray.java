import java.util.Scanner;

public class PencarianArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int arr_count, i, num;

        System.out.print("Masukkan jumlah elemen array: ");
        arr_count = sc.nextInt();

        // Input elemen array
        for (i = 0; i < arr_count; i++) {
            System.out.print("Elemen ke-" + i + ": ");
            arr[i] = sc.nextInt();
        }

        // Angka yang dicari
        System.out.print("\nMasukkan angka yang dicari: ");
        num = sc.nextInt();

        // Linear Search
        for (i = 0; i < arr_count; i++) {
            if (arr[i] == num) {
                System.out.println("Angka ditemukan pada index ke-" + i);
                break;
            }
        }

        if (i == arr_count) {
            System.out.println("Angka tidak ditemukan");
        }
    }
}
