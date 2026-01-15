import static java.lang.System.out;
import java.util.Scanner;

public class Himpunanulangan {
    Scanner input = new Scanner(System.in);
    int[] himpunanA = new int[100];
    int[] himpunanB = new int[100];
    String[] himpunanHasil = new String[100];
    int jumlahAnggotaA;
    int jumlahAnggotaB;
    int jumlahRelasi;

    public void dataAnggota(){
        out.print("Jumlah Anggota A : ");
        jumlahAnggotaA = input.nextInt();
        for (int i = 1; i <= jumlahAnggotaA; i++) {
            out.print("A" + i + " = ");
            himpunanA[i] = input.nextInt();
        }
    
        out.print("\nJumlah Anggota B : ");
        jumlahAnggotaB = input.nextInt();
        for (int i = 1; i <= jumlahAnggotaB; i++) {
            out.print("B" + i + " = ");
            himpunanB[i] = input.nextInt();
        }
    }

    public void tampilAnggota(){
        out.print("\nA = { ");
        for (int i = 1; i <= jumlahAnggotaA; i++) {
            out.print(himpunanA[i] + " ");
        }
        out.println("}");

        out.print("B = { ");
        for (int i = 1; i <= jumlahAnggotaB; i++) {
            out.print(himpunanB[i] + " ");
        }
        out.println("}");
    }

    public void himpunanGabungan() {
        out.print("\nA U B : { ");

        for (int i = 1; i <= jumlahAnggotaA; i++ ) {
            out.print(himpunanA[i] + " ");
        }

        for (int i = 1; i <= jumlahAnggotaB; i++) {
            boolean adaSama = false;
            for (int j = 1; j <= jumlahAnggotaA; j++) {
                if (himpunanB[i] == himpunanA[j]) {
                    adaSama = true;
                }
            }
            if (!adaSama) {
                out.print(himpunanB[i] + " ");
            }
        }
        out.println("}");    
    }

    public void himpunanIrisan() {
        out.print("A n B : { ");
        for (int i = 1; i <= jumlahAnggotaB; i++) {
            boolean adaSama = false;
            for (int j = 1; j <= jumlahAnggotaA; j++) {
                if (himpunanB[i] == himpunanA[j]) {
                    adaSama = true;
                }
            }
            if (adaSama) {
                out.print(himpunanB[i] + " ");
            }
        }
        out.println("}");
    }

    public void inputRelasi() {
        int max = jumlahAnggotaA * jumlahAnggotaB;

        do {
            out.print("\nJumlah relasi: ");
            jumlahRelasi = input.nextInt();
            input.nextLine();
        } while (jumlahRelasi > max || jumlahRelasi < 1);

        for (int i = 1; i <= jumlahRelasi; i++) {
            out.print("Relasi ke-" + i + " (hasil B): ");
            String tujuan = input.nextLine();
            himpunanHasil[i] = tujuan;
        }
    }

    public void cetakRelasi() {
        out.print("\nDomain   = { ");
        for (int i = 1; i<= jumlahAnggotaA; i++) 
            out.print(himpunanA[i] + " ");
        out.println("}");

        out.print("\nKodomain = { ");
        for (int i = 1; i<= jumlahAnggotaB; i++) 
            out.print(himpunanB[i] + " ");
        out.println("}");

        out.print("\nRange    = { ");
        for (int i = 1; i<= jumlahRelasi; i++) 
            out.print(himpunanHasil[i] + " ");
        out.println("}");

    }

    public static void main(String[] args) {
        Himpunanulangan bilangan = new Himpunanulangan();
        bilangan.dataAnggota();
        bilangan.tampilAnggota();
        bilangan.himpunanGabungan();
        bilangan.himpunanIrisan();
        bilangan.inputRelasi();
        bilangan.cetakRelasi();
    }
}
