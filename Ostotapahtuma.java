public class Ostotapahtuma {
    private Asiakas asiakas;
    private Esiintyja esiintyja;
    private Tilaisuus tilaisuus;
    private Palkkio palkkio;

    public Ostotapahtuma(Asiakas asiakas, Esiintyja esiintyja, Tilaisuus tilaisuus, Palkkio palkkio) {
        this.asiakas = asiakas;
        this.esiintyja = esiintyja;
        this.tilaisuus = tilaisuus;
        this.palkkio = palkkio;
    }

    public Asiakas getAsiakas() {
        return asiakas;
    }

    public Esiintyja getEsiintyja() {
        return esiintyja;
    }

    public Tilaisuus getTilaisuus() {
        return tilaisuus;
    }

    public Palkkio getPalkkio() {
        return palkkio;
    }
}
