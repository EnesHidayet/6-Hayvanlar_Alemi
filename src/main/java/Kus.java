public class Kus extends Hayvanlar{
    public Kus(String tur, String renk, int yas) {
        super(tur, renk, yas);
    }

    @Override
    public void sesCikar() {
        System.out.println("Kuþ cývýldýyor...");
    }
}
