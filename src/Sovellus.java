import java.util.ArrayList;

public class Sovellus {
    private ArrayList<Asiakas> asiakkaat;
    private ArrayList<Esiintyja> esiintyjat;
    private ArrayList<Tilaisuus> tilaisuus;
    private ArrayList<Palkkio> palkkiot;
    private ArrayList<Ostotapahtuma> ostotapahtuma;

    public Sovellus(ArrayList<Asiakas> asiakkaat, ArrayList<Esiintyja> esiintyjat, ArrayList<Tilaisuus> tilaisuus, ArrayList<Palkkio> palkkiot, ArrayList<Ostotapahtuma> ostotapahtuma) {
        this.asiakkaat = asiakkaat;
        this.esiintyjat = esiintyjat;
        this.tilaisuus = tilaisuus;
        this.palkkiot = palkkiot;
        this.ostotapahtuma = ostotapahtuma;
    }

    public ArrayList<Asiakas> getAsiakkaat() {
        return asiakkaat;
    }

    public void setAsiakkaat(ArrayList<Asiakas> asiakkaat) {
        this.asiakkaat = asiakkaat;
    }

    public ArrayList<Esiintyja> getEsiintyjat() {
        return esiintyjat;
    }

    public void setEsiintyjat(ArrayList<Esiintyja> esiintyjat) {
        this.esiintyjat = esiintyjat;
    }

    public ArrayList<Tilaisuus> getTilaisuus() {
        return tilaisuus;
    }

    public void setTilaisuus(ArrayList<Tilaisuus> tilaisuus) {
        this.tilaisuus = tilaisuus;
    }

    public ArrayList<Palkkio> getPalkkiot() {
        return palkkiot;
    }

    public void setPalkkiot(ArrayList<Palkkio> palkkiot) {
        this.palkkiot = palkkiot;
    }

    public ArrayList<Ostotapahtuma> getOstotapahtuma() {
        return ostotapahtuma;
    }

    public void setOstotapahtuma(ArrayList<Ostotapahtuma> ostotapahtuma) {
        this.ostotapahtuma = ostotapahtuma;
    }
}
