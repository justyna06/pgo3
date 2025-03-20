public class Klient {

    private int id;
    private String Imie;
    private String Nazwisko;
    private String email;
    private boolean czyStaly;

    public void wyswietlInformacje(){
        System.out.println("Wyswietl informacje o kliencie: " +
                "id: " + id +
                "Imie:" + Imie +
                "Nazwisko:" + Nazwisko +
                "email:" + email +
                "czyStaly:" + czyStaly);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getImie() {
        return Imie;
    }
    public void setImie(String imie) {
        Imie = imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isCzyStaly() {
        return czyStaly;
    }
    public void setCzyStaly(boolean czyStaly) {
        this.czyStaly = czyStaly;
    }
}
