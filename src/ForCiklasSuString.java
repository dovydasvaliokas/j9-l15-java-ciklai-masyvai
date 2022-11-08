public class ForCiklasSuString {
    public static void main(String[] args) {
        String s1 = "Čia yra namas";
        ivestiRaidesAtskiraiEilutemis(s1);

        int kiekYraRaidziuA = kiekARaidziu(s1);
        System.out.println("kiekYraRaidziuA = " + kiekYraRaidziuA);
    }

    /**
     * Išveda žodžio kiekvieną raidę į atskirą eilutę į konsolę
     * @param zodis žodis, kurio raides išvedinėsime
     */
    public static void ivestiRaidesAtskiraiEilutemis(String zodis) {
        for (int i = 0; i < zodis.length(); i++) {
            System.out.println("zodis[" + i + "] = " + zodis.charAt(i));
        }
    }

    /**
     * Suranda kiek žodyje yra 'a' raidžių
     * @param zodis žodis, kuriame ieškosime a raides
     * @return a raidžių kiekį
     */
    public static int kiekARaidziu(String zodis) {
        int kiekis = 0;
        for (int i = 0; i < zodis.length(); i++) {
         //   System.out.println("i = " + i);
            if (zodis.charAt(i) == 'a') {
         //       System.out.println("TIESA");
         //       System.out.println("zodis[" + i + "]= " + zodis.charAt(i));
                kiekis++;
            }
//            else {
//                System.out.println("netiesa");
//                System.out.println("zodis[" + i + "]= " + zodis.charAt(i));
//            }
//            System.out.println("kiekis = " + kiekis);
        }
        return kiekis;
    }
}
