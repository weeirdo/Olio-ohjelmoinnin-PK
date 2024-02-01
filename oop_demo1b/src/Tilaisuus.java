public class Tilaisuus {
    private String tyyppi;
    private String esiintyja;
    private String asiakas;

    public Tilaisuus(String tyyppi, String esiintyja, String asiakas) {
        this.tyyppi = tyyppi;
        this.esiintyja = esiintyja;
        this.asiakas = asiakas;
    }

    public String getTyyppi() {
        return tyyppi;
    }

    public void setTyyppi(String tyyppi) {
        this.tyyppi = tyyppi;
    }

    public String getEsiintyja() {
        return esiintyja;
    }

    public void setEsiintyja(String esiintyja) {
            this.esiintyja = esiintyja;
    }

    public String getAsiakas() {
        return asiakas;
    }

    public void setAsiakas(String asiakas) {
        this.asiakas = asiakas;
    }
}

