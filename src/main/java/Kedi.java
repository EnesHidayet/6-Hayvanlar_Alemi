public class Kedi extends Hayvanlar{

    public Kedi(String tur, String renk, int yas) {
        super(tur, renk, yas);
    }

    @Override
    public void sesCikar() {
        System.out.println("Kedi miyavlıyor...");
    }
}
