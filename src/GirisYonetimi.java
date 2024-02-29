import java.util.Scanner;

public class GirisYonetimi {
    private static final String DOGRU_SIFRE = "1234"; // Örnek şifre
    private static final int MAX_DENEME_HAKKI = 3;
    private static int girisDenemesi = 0;

    public static boolean girisYap() {
        Scanner scanner = new Scanner(System.in);

        while (girisDenemesi < MAX_DENEME_HAKKI) {
            System.out.print("Lütfen şifreyi girin: ");
            String girilenSifre = scanner.nextLine();

            if (girilenSifre.equals(DOGRU_SIFRE)) {
                System.out.println("Giriş başarılı.");
                return true;
            } else {
                girisDenemesi++;
                System.out.println("Hatalı şifre. Kalan deneme hakkı: " + (MAX_DENEME_HAKKI - girisDenemesi));
            }
        }

        System.out.println("Giriş hakkınız doldu. Program sonlandırılıyor.");
        return false;
    }
}
