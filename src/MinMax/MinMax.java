package MinMax;
import java.util.Scanner;
public class MinMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan kaç tane sayı gireceğini alma
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = scanner.nextInt();

        // En büyük ve en küçük sayıları başlangıçta ilk girilen sayı ile başlatma
        int enBuyuk = scanner.nextInt();
        int enKucuk = enBuyuk;

        // Kalan sayıları döngü ile okuma ve en büyük ve en küçük sayıları bulma
        for (int i = 1; i < n; i++) {
            int sayi = scanner.nextInt();
            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            } else if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }

        // Sonuçları yazdırma
        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }
}
