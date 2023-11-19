public class Balik extends Hayvanlar{
    public Balik(String tur, String renk, int yas) {
        super(tur, renk, yas);
    }

    @Override
    public void sesCikar() {
        System.out.println("Balık gugulduyor...");
    }
}
