public class Musteri {
    public static void main(String[] args) {
        if (GirisYonetimi.girisYap()) {
            Hesap hesap = new Hesap("1234567890");
            BankaYonetimi bankaYonetimi = new BankaYonetimi(hesap);

            bankaYonetimi.calistir();
        }
    }
}
