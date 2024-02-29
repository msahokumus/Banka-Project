public class Hesap {
    private String hesapNo;
    private double bakiye;

    public Hesap(String hesapNo) {
        this.hesapNo = hesapNo;
        this.bakiye = 0.0;
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void paraYatir(double miktar) {
        bakiye += miktar;
    }

    public void paraCek(double miktar) {
        if (bakiye >= miktar) {
            bakiye -= miktar;
        } else {
            System.out.println("Yetersiz bakiye!");
        }
    }
}
