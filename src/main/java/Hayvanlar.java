public class Hayvanlar {
    String tur;
    String renk;
    int yas;

    public void sesCikar(){
        System.out.println("Hayvan ses çıkarıyor.");
    }

    public Hayvanlar(String tur, String renk, int yas) {
        this.tur = tur;
        this.renk = renk;
        this.yas = yas;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Hayvanlar{" +
                "tur='" + tur + '\'' +
                ", renk='" + renk + '\'' +
                ", yas=" + yas +
                '}';
    }
}
