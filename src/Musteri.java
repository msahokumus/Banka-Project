public class Musteri {
    public static void main(String[] args) {
        if (GirisYonetimi.girisYap()) {
            Hesap hesap = new Hesap("27154546585");
            BankaYonetimi bankaYonetimi = new BankaYonetimi(hesap);

            bankaYonetimi.calistir();
        }
    }
}
