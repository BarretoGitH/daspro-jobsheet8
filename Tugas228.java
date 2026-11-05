import java.util.Scanner;

public class Tugas228 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Nilai n minimal 3. Silakan jalankan ulang program.");
        } else {
            int totalAngka = 0;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    int hasil = i * j;
                   
                     System.out.printf("%4d ", hasil);
                    totalAngka += hasil;
                }
                System.out.println();
            }
            System.out.println("Jumlah seluruh angka: " + totalAngka);
        }
        sc.close();
    }
}