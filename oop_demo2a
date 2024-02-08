import java.util.ArrayList;

/**
 *Luokka muodostaa listan, johon käyttäjä voi lisätä tai hakea muistiinpanoja.
 *
 * @param nimi kirjoittajan nimi
 * @param omistaja muistivihon omistaja
 * @param muistiinpanot lista muistiipanoista
 * @return muistiinpanot kertoo muistiinpanojen pituuden
 *
 */

public class Muistivihko {
    private String nimi;
    private String omistaja;
    private ArrayList<String> muistiinpanot;

    public Muistivihko(String nimi, String omistaja) {
        this.nimi = nimi;
        this.omistaja = omistaja;
        muistiinpanot = new ArrayList<>();
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getOmistaja() {
        return omistaja;
    }

    public void setOmistaja(String omistaja) {
        this.omistaja = omistaja;
    }

    public void lisaaMuistiinpano(String viesti) {
        this.muistiinpanot.add(viesti);
    }

    public int muistiinpanoja() {
        return muistiinpanot.size();
    }

    public void tulostaMuistiinpanot() {
        for(String viesti : muistiinpanot) {
            System.out.println(viesti);
        }
    }
}

