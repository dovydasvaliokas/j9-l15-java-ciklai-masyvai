public class Masyvai {
    public static void main(String[] args) {
         int[] skaiciai = {10, 20, 47, -5, -8, 14};     // masyvo sukūrimas iš karto į jį sudedant reikšmes

        System.out.println("skaiciai[0] = " + skaiciai[0]);     // išveda 0-tą elementą
        System.out.println("skaiciai[2] = " + skaiciai[2]);     // išveda 3-ią elementą

        System.out.println("skaiciai = " + skaiciai);       // išvedu visą masyvą - tačiau jo skaičių neišveda - išveda jo HashCode (mums jis yra nenaudingas)
        isvestiMasyva(skaiciai);
        isvestiBruksniukus();

        // Sukuriu "tuščią" String masyvą, t.y. nurodysiu, kad masyve bus 5 žodžiai, bet jų iš karto dar neįdėsiu
        String[] zodziai = new String[5];
        zodziai[0] = "namas";
        zodziai[1] = "kėdė";
        zodziai[2] = "kamuolys";
        zodziai[3] = "12214";
        zodziai[4] = "dkfadsfads1523";
        isvestiMasyva(zodziai);
        isvestiBruksniukus();

        isvestiMasyva(skaiciai, 3);
        isvestiBruksniukus();

        isvestiMasyva(skaiciai, true);


    }

    /**
     * Išveda masyvo elementus į atskiras eilutes
     * @param masyvas išvedinėjamas masyvas
     */
    public static void isvestiMasyva(int[] masyvas) {
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println("masyvas[" + i +"] = " + masyvas[i]);
        }
    }

    /**
     * OVERLOADINTA (perkrauta) funkcija, kuri išves String masyvą. Overloadnimas - tai yra funkcijos tokiu pačiu pavadinimu kelių variantų kūrimas,
     * Kai jai paduodami arba skirtingų duomenų tipų parametrai arba skirtingas kiekis
     * @param masyvas
     */
    public static void isvestiMasyva(String[] masyvas) {
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println("masyvas[" + i + "] = " + masyvas[i]);
        }
    }

    /**
     * Overloadinta funkcija, kuri išveda visus masyvo elementus nuo kažkurio eleento
     * @param masyvas masyvas kurį išvedame
     * @param nuoKurio nuo kurio elemento pradėti išvedimą
     */
    public static void isvestiMasyva(int[] masyvas, int nuoKurio) {
        for (int i = nuoKurio; i < masyvas.length; i++) {
            System.out.println("masyvas[" + i + "] = " + masyvas[i]);
        }
    }

    /**
     * Overloadinta funkcija, kuri išveda masyvą į vieną eilutę
     * @param masyvas išvedamas masyvas
     * @param vienaEilute jeigu true - išves į vieną eilutę, jeigu false - visiškai nieko nedarys
     */
    public static void isvestiMasyva(int[] masyvas, boolean vienaEilute) {
        if (!vienaEilute) {
            return;
        }
        System.out.print("masyvas = [");
        for (int i = 0; i < masyvas.length - 1; i++) {      // length - 1, kadangi paskutinį truputį kitaip išvesti reikia (be kablelio)
            System.out.print(masyvas[i] + ", ");
        }
        System.out.print(masyvas[masyvas.length - 1]);      // išvedame paskutinį elementą po jo nepalikdami kablelio
        System.out.print("]");
    }

    public static void isvestiBruksniukus() {
        System.out.println("-----------------");
    }
}
