import static java.lang.System.out;
import java.util.Scanner;

public class Fungsiinvers {
    // 
    static double fungsi(double x) {
        return 2 * x +3;
    }

    //
    static double invers(double y) {
        return (y - 3) / 2;
    }

    //
    static void cekInvers(double x) {
        double fx = fungsi(x);
        double inversFx = invers(fx);

        out.println("Nilai X            = " + x);
        out.println("Hasil f(x)         = " + fx);
        out.println("Hasil f^-1(f(x))   = " + inversFx);

        if (x == inversFx) {
            out.println("Status      = BENAR (fungsi dan invers sesuai)");
        } else {
            out.println("Status      = SALAH");
        }
        out.println("-------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            out.print("Masukkan nilai x: ");
            double x = input.nextDouble();

            cekInvers(x);

            out.print("Coba Lagi? (y/n): ");
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');
            
        out.println("Program Selesai.   ");
        input.close();
    }
}
