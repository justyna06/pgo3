public class Zamowienie {

    private int id;
    private Klient klient;
    private Produkt[] produkty;
    private int[] ilosc;
    private String dataZamowienia;
    private String statusZamowienia;

    public void iloscproduktow() {

        for (int i = 0; i < produkty.length; i++) {
            Produkt produkt = produkty[i];
        }
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Klient getKlient() {
        return klient;
    }
    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public Produkt[] getProdukty() {
        return produkty;
    }
    public void setProdukty(Produkt[] produkty) {
        this.produkty = produkty;
    }

    public int[] getIlosc() {
        return ilosc;
    }
    public void setIlosc(int[] ilosc) {
        this.ilosc = ilosc;
    }

    public String getDataZamowienia() {
        return dataZamowienia;
    }
    public void setDataZamowienia(String dataZamowienia) {
        this.dataZamowienia = dataZamowienia;
    }

    public String getStatusZamowienia() {
        return statusZamowienia;
    }
    public void setStatusZamowienia(String statusZamowienia) {
        this.statusZamowienia = statusZamowienia;
    }
}
