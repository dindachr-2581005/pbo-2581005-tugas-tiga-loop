import java.util.Scanner;

public class TigaLoop {

    public static void main(String[] args) {

        Scanner inputTigaLoop = new Scanner(System.in);

        System.out.print("Batas deret (n) : ");
        int n = inputTigaLoop.nextInt();

        System.out.println();
        System.out.println("===== SATU DERET, TIGA LOOP =====");

        // ==================== FOR ====================
        System.out.print("for      : ");

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        System.out.println();


        // ==================== WHILE ====================
        System.out.print("while    : ");

        int iWhile = 1;

        while (iWhile <= n) {
            System.out.print(iWhile + " ");
            iWhile++;
        }

        System.out.println();


        // ==================== DO-WHILE ====================
        System.out.print("do-while : ");

        int iDoWhile = 1;

        do {
            System.out.print(iDoWhile + " ");
            iDoWhile++;
        } while (iDoWhile <= n);

        System.out.println();

        // ==================== OFF-BY-ONE ====================

        int kurang = 0;

        for (int i = 1; i < n; i++) {
            kurang++;
        }

        int kurangSama = 0;

        for (int i = 1; i <= n; i++) {
            kurangSama++;
        }

        System.out.println();
        System.out.println("i < n berpulang : " + kurang + " kali");
        System.out.println("i <= n berulang : " + kurangSama + " kali");

        /*
OUTPUT RUN 1 - n = 5

Batas deret (n) : 5

===== SATU DERET, TIGA LOOP =====
for      : 1 2 3 4 5
while    : 1 2 3 4 5
do-while : 1 2 3 4 5

i < n berulang  : 4 kali
i <= n berulang : 5 kali

Disaring : 1 3 5 7
Sampai println : 4 kali


OUTPUT RUN 2 - n = 0

Batas deret (n) : 0

===== SATU DERET, TIGA LOOP =====
for      :
while    :
do-while : 1

i < n berulang  : 0 kali
i <= n berulang : 0 kali

Disaring : 1 3 5 7
Sampai println : 4 kali


KESIMPULAN:
do-while mengecek kondisinya sesudah badan loop dijalankan,
jadi badannya pasti jalan minimal sekali.
*/

        // ==================== Saring deret 1–10 ====================

        int jumlahPrintln = 0;

        System.out.println();
        System.out.print("Disaring : ");

        for (int i = 1; i <= 10; i++) {

            // Lewati angka genap.
            if (i % 2 == 0) {
                continue;
            }

            // Berhenti jika i > 7.
            if (i > 7) {
                break;
            }

            System.out.print(i + " ");
            jumlahPrintln++;
        }

        System.out.println();
        System.out.println("Sampai println : " + jumlahPrintln + " kali");


        /*
         * KESIMPULAN continue DAN break:
         *
         * Pada i = 8, kondisi i % 2 == 0 bernilai benar,
         * sehingga continue dijalankan terlebih dahulu.
         * Akibatnya, program melewati pemeriksaan break
         * dan langsung lanjut ke i = 9.
         *
         * Pada i = 9, angka tidak genap sehingga continue
         * tidak dijalankan. Kemudian i > 7 bernilai benar,
         * sehingga break menghentikan loop.
         *
         * Jadi loop tidak berhenti di i = 8.
         */


        inputTigaLoop.close();
    }
}






