import java.util.Scanner;

public class BankaYonetimi {
    private Hesap hesap;

    public BankaYonetimi(Hesap hesap) {
        this.hesap = hesap;
    }

    public void paraYatir(double miktar) {
        hesap.paraYatir(miktar);
        System.out.println(miktar + " TL yatırıldı. Yeni bakiye: " + hesap.getBakiye());
    }

    public void paraCek(double miktar) {
        hesap.paraCek(miktar);
        System.out.println(miktar + " TL çekildi. Yeni bakiye: " + hesap.getBakiye());
    }

    public void bakiyeGoruntule() {
        System.out.println("Hesap bakiyesi: " + hesap.getBakiye() + " TL");
    }

    public void menuGoster() {
        System.out.println("1. Para Yatırma");
        System.out.println("2. Para Çekme");
        System.out.println("3. Bakiye Görüntüleme");
        System.out.println("0. Çıkış");
    }

    public void calistir() {
        Scanner scanner = new Scanner(System.in);
        int secim;

        do {
            menuGoster();
            System.out.print("Seçiminizi girin: ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Yatırmak istediğiniz miktarı girin: ");
                    double yatirilanMiktar = scanner.nextDouble();
                    paraYatir(yatirilanMiktar);
                    break;
                case 2:
                    System.out.print("Çekmek istediğiniz miktarı girin: ");
                    double cekilenMiktar = scanner.nextDouble();
                    paraCek(cekilenMiktar);
                    break;
                case 3:
                    bakiyeGoruntule();
                    break;
                case 0:
                    System.out.println("Programdan çıkılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
                    break;
            }
        } while (secim != 0);

        scanner.close();
    }
}
