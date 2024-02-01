public class Asiakas {
    private String nimi;
    private String asiakasNumero;

    public Asiakas(String nimi, String asiakasNumero) {
        this.nimi = nimi;
        this.asiakasNumero = asiakasNumero;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getAsiakasNumero() {
        return asiakasNumero;
    }

    public void setAsiakasNumero(String asiakasNumero) {
        this.asiakasNumero = asiakasNumero;
    }
}

