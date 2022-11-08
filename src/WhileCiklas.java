public class WhileCiklas {
    public static void main(String[] args) {
        int x = 25;
        int riba = 418;

        x = dvigubintiSkaiciuIkiRibos(x, riba);
        System.out.println("x = " + x);
    }

    /**
     * Ši funkcija dvigubina skaičių tol, kol jis dar nepasiekė ribos, t.y., kai jau skaičius yra didesnis nei riba, funkcija grąžina rezultatą
     * @param skaicius didinimas skaičius
     * @param riba iki kokios reikšmės didinti skaičių, kai skaičius pasiekia ribą, funkcija grąžina rezultatą
     * @return kažkiek kartų padvigubinta skaičiaus reikšmė
     */
    public static int dvigubintiSkaiciuIkiRibos(int skaicius, int riba) {
       // System.out.println("Skaičiaus pirminė reikšmė: " + skaicius);
        while (skaicius < riba) {
            skaicius = skaicius * 2;
         //   System.out.println("Didiname: " + skaicius);
           // skaicius *= 2;  // galima dvigubinti ir tokiu metodu
        }
        return skaicius;
    }
}
