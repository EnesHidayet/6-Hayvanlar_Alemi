public class Runner {
    public static void main(String[] args) {
        Hayvanlar kus=new Kus("B�lb�l","Sar�",2);
        Hayvanlar kedi=new Kedi("Tekir","Siyah",7);
        Hayvanlar balik=new Balik("Alabal�k","Gri �st�ne siyah noktal�",1);
        Hayvanlar yilan=new Yilan("Kara mamba","Siyah",4);

        kus.sesCikar();
        kedi.sesCikar();
        balik.sesCikar();
        yilan.sesCikar();
    }
}
