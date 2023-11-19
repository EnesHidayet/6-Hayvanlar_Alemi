public class Yilan extends Hayvanlar{
    public Yilan(String tur, String renk, int yas) {
        super(tur, renk, yas);
    }

    @Override
    public void sesCikar() {
        System.out.println("Yýlan týslýyor...");
    }
}
