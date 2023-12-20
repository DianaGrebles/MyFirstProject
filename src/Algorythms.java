public class Algorythms {
    public static void main(String[] args) {
        //Algoritmi - 1


        int numere[] = {1, -25, 34, -2, 67, 5};

        for (int i = 0; i < numere.length; i++) {
            int inainte = numere[i] - 1;
            int dupa = numere[i] + 1;
            System.out.println(inainte + " " + dupa);

        }
        for (int i = 0; i < numere.length; i++) {
            System.out.println(numere[i]);
        }

        // Java string methods - docs.oracle
        String tari[] = {"Anglia", "Romania", "Albania", "Franta", "Elvetia"};
        for (String t : tari) {
            System.out.println(t.charAt(0));
            System.out.println(t.length());
            System.out.println(t.contains("n"));


        }
        // ex 8 - Algoritmi
       // for (String t : tari) {
           // System.out.println(t);
           // System.out.println(t.length());
            //int max = 0;
            //if (t.length() > max) {
               // max = t.length();
               // taraCuLungimeMaxima=t;
              //  Sout(taraCuLungimeMaxima);
        //Alternativa - cu FOR EACH
            }
        }

