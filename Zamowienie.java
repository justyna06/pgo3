public class Zamowienie {

    private int id;
    private Klient klient;
    private Produkt[] produkty;
    private int[] ilosc;
    private String dataZamowienia;
    private String status;

    public void iloscproduktow() {

        int suma = 0;

        for (Produkt produkt : produkty) {
            System.out.println("Produkt" + produkt.getNazwa() + "Ilość");
            suma += produkt.getIloscWMagazynie();

        }
    }

    public double obliczWartośćZamowienie() {

        double suma = 0.0;

        for (Produkt produkt : produkty) {
            System.out.println("cena zamowienia" + produkt.getCena());
            suma += produkt.getCena();
        }
        return suma;
    }


    public double zastosujZniżke(){

        double suma = 0.0;

        for (Produkt produkt : produkty) {
            suma += produkt.getCena();
        }

        if (klient.getEmail() > 3){
            suma *= 0.9;
        }
        return suma;
    }


    public String wyświetlStatus() {

        for (Produkt produkt : produkty) {
            if (produkt.getIloscWMagazynie() < 0) {
                System.out.println("w realizacji");
            }else if (produkt.getIloscWMagazynie() == 0) {
                System.out.println("zrealizowane");
            }else {
                System.out.println("nowe");
            }
        }
        return status;
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
        return status;
    }
    public void setStatusZamowienia(String status) {
        this.status = status;
    }
}
