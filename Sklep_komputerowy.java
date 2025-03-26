public class Sklep_komputerowy {

    private Produkt[] produkt;
    private Klient[] klient;
    private Zamowienie[] zamowienie;

    private int liczbaProdukt;
    private int liczbaklient;
    private int liczbazamowienie;

    public void dodajProdukt(Produkt produkt) {
        produkt.add(produkt);
        System.out.spritln("Dodano nowy produkt: " + produkt.getNazwa()  + produkt.getKategoria() + produkt.getId() + produkt.getCena());
    }

    public void dodajKlient(Klient klient) {
        klient.add(klient);
        System.out.println("Dodaj nowego klienta;" + klient.getImie() + klient.getNazwisko() + klient.getId() + klient.getEmail());
    }

    public Produkt[] getProdukt() {
        return produkt;
    }
    public void setProdukt(Produkt[] produkt) {
        this.produkt = produkt;
    }

    public Klient[] getKlient() {
        return klient;
    }
    public void setKlient(Klient[] klient) {
        this.klient = klient;
    }

    public Zamowienie[] getZamowienie() {
        return zamowienie;
    }
    public void setZamowienie(Zamowienie[] zamowienie) {
        this.zamowienie = zamowienie;
    }

    public int getLiczbaProdukt() {
        return liczbaProdukt;
    }
    public void setLiczbaProdukt(int liczbaProdukt) {
        this.liczbaProdukt = liczbaProdukt;
    }

    public int getLiczbaklient() {
        return liczbaklient;
    }
    public void setLiczbaklient(int liczbaklient) {
        this.liczbaklient = liczbaklient;
    }

    public int getLiczbazamowienie() {
        return liczbazamowienie;
    }
    public void setLiczbazamowienie(int liczbazamowienie) {
        this.liczbazamowienie = liczbazamowienie;
    }
}
