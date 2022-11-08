public class ForCiklas {
    public static void main(String[] args) {
        isvestiSkaiciusNuoXIkiY(20, 47);
        System.out.println("---------------");

        int progresijosSuma = intervaloSumaSuNurodytuDidinimu(10, 50, 3);
        System.out.println("progresijosSuma = " + progresijosSuma);
    }

    /**
     * Funkcija išveda visus sveikus skaičius nuo nurodytos pradžios iki pabaigos imtinai (įeina ir pabaiga)
     * @param x pradžia
     * @param y pabaiga
     */
    public static void isvestiSkaiciusNuoXIkiY(int x, int y) {
        for (int i = x; i <= y; i++) {
            System.out.println("i = " + i);
        }
    }

    /**
     * Suranda intervalo nuo pradžia iki pabaiga sumą, tuos skaičius didinant nurodytu kiekiu (d)
     * @param pradzia
     * @param pabaiga
     * @param d
     * @return
     */
    public static int intervaloSumaSuNurodytuDidinimu(int pradzia, int pabaiga, int d) {
        int suma = 0;
        for (int i = pradzia; i <= pabaiga; i += d) {
            suma += i;
         //   System.out.println("i = " + i + ", suma = " + suma);
        }
        return suma;
    }
}
