public class Esiintyja {
    private String nimi;
    private String erityisala;
    private int palkkio;
    private String tunniste;

    public Esiintyja(String nimi, String erityisala, int palkkio, String tunniste) {
        this.nimi = nimi;
        this.erityisala = erityisala;
        this.palkkio = palkkio;
        this.tunniste = tunniste;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getErityisala() {
        return erityisala;
    }

    public void setErityisala(String erityisala) {
        this.erityisala = erityisala;
    }

    public int getPalkkio() {
        return palkkio;
    }

    public void setPalkkio(int palkkio) {
        if (palkkio>=0) {
            this.palkkio = palkkio;
        }
    }

    public String getTunniste() {
        return tunniste;
    }

    public void setTunniste(String tunniste) {
        this.tunniste = tunniste;
    }
}
