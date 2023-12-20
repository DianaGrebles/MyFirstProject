public class JavaMethods {
    public static void main(String[] args) {
        printHello();
        printHello();
        WeLearn();
        helloName("Cristina");
        getSum(2, 3);
        System.out.println(getSumwithreturn(3, 4));
        System.out.println(getProductwihreturn(3, 4));
        System.out.println(areMere("Diana"));
        System.out.println(metodaex6("abcde"));
        System.out.println(metodaex6optionale("casa"));
        System.out.println(metodaex6optionale("Mesopotamia"));


    }
    private static void printHello() {
        System.out.println("Hello World");

    }

    private static void WeLearn() {
        System.out.println("We learn about Methods");
    }

    private static void helloName(String name) {
        System.out.println("Hello" + name);
    }

    private static void getSum(int f, int g) {
        System.out.println(f + g);
    }

    private static int getSumwithreturn(int f, int g) {

        int sum = f + g;
        return sum;
        // Sau int sum=f+g; return f+g;
    }

    //private e optional
    private static int getProductwihreturn(int f, int g) {
        int product = f * g;
        return product;

    }

    private static String areMere(String nume) {
        return nume + " are mere.";

    }

    //Primesteunstringsireturneazainvers.
    private static String metodaex6(String cuvant) {
        String cuvantInversat = "";
        int lungime = cuvant.length();
        for (int i = 0; i < lungime; i++) {
            cuvantInversat = cuvantInversat + cuvant.charAt(i);
        }
        return cuvantInversat;
    }

    //exercitii optionale 5
    private static int metoda5Optionale(int a, int b, int c, int d) {
        int max = a;
        if (b > a) {
            max = b;
        }
        if (c > max) {
            max = d;
        }
        return max;

    }

    //above not finished
//6 optionale
    private static String metodaex6optionale(String cuvant) {
        String litereledinmijloc = "";
        int lungimeacuvantului=cuvant.length();
        if (lungimeacuvantului % 2 == 0) {
            int pozitielitera1 = lungimeacuvantului / 2 - 1;
            int pozitielitera2 = lungimeacuvantului / 2;
            litereledinmijloc=litereledinmijloc+cuvant.charAt(pozitielitera1)+cuvant.charAt(pozitielitera2);
        }
        else litereledinmijloc=litereledinmijloc+cuvant.charAt(lungimeacuvantului/2);
        return litereledinmijloc;
    }

    //exercitiul8optionale
    //873
    public static int metodaex8optionale(int numar){
        int sum=0;
        while(numar>0) {
            sum = sum + numar % 10;
            numar = numar / 10;
        }
        return sum;
    }

}

