public class VeiksmaiSuMasyvais {
    public static void main(String[] args) {
        int[] skaiciai = {10, 25, 14, 6, 8};
        int suma = masyvoSuma(skaiciai);
        isvestiMasyva(skaiciai);
        System.out.println("suma = " + suma);
        isvestiBruksniukus();

        skaiciai = idetiMasyva(skaiciai, -17);      // į masyvą prideda -17
        isvestiMasyva(skaiciai);
        suma = masyvoSuma(skaiciai);
        System.out.println("suma = " + suma);
    }

    /**
     * Suranda masyvo sumą
     * @param masyvas masyvas, kurio sumos ieškosime
     * @return suma
     */
    public static int masyvoSuma(int[] masyvas) {
        int suma = 0;
        for (int elementas : masyvas) {
          //  System.out.println("elementas = " + elementas);
            suma += elementas;
          //  System.out.println("suma = " + suma);
        }
        return suma;
    }

    public static int[] idetiMasyva(int[] masyvas, int skaicius) {
        int[] naujasMasyvas = new int[masyvas.length + 1];
        for (int i = 0; i < masyvas.length; i++) {      // einu per seną masyvą
            naujasMasyvas[i] = masyvas[i];              // ir visus elementus iš seno masyvo sudedu į tas pačias naujo masyvo vietas
        }
        naujasMasyvas[naujasMasyvas.length - 1] = skaicius;
        return naujasMasyvas;
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

    public static void isvestiBruksniukus() {
        System.out.println("-----------------");
    }
}
