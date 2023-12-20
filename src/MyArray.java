
public class MyArray {
    public static void main(String[] args) {

        //Ex 4-Tipuri de date
        Double[] myArray = {1.11111111, 2.22222222, 3.33333333, 4.44444444};
        String[] myStringArray = {"unu", "Doi", "Trei", "Patru"};
        System.out.println(myArray[1]);
        System.out.println(myArray[3]);
        System.out.println(myArray.length);
        System.out.println(myStringArray.length);

        for (int i = 0; i < myStringArray.length; i++) {
            System.out.println(myStringArray[i]);


            double[] myArray2 = {1.1234567, 2.1234567, 3.1234567, 4.1234567};
            String[] myStringArray2 = {"Unu", "Doi", "Trei", "Patru"};
            System.out.println(myArray2[1]);
            System.out.println(myArray2[3]);
            for (int g = 0; g < myArray2.length; g++) {
                System.out.println(myArray2[g]);
            }

        /*  Exercitiul 5 – in clasa MyArray
            Declarati un array de elemente de tip char cu elementele: a, b, c, d.
                    Afisati elementul de pe prima pozitie.
                    Afisati elementul de pe a doua pozitie.
            Afisati elementul de pe ultima pozitie.
            Afisati toate elementele sirului folosind FOR

            /*

         *Exemplu de utilizat FOR:

FOR (Start, Stop, Pas)
Start = i=0
Stop = i<4
Pas = i++
Mai este si for each - pentru string-uri = arata fiecare element din string
             */
            String[] myArray3 = {"a", "b", "c", "d"};
            String[] myStringArray3 = {"Unu", "Doi", "Trei", "Patru"};
            System.out.println(myArray3[0]);
            System.out.println(myArray3[1]);
            System.out.println(myArray3[3]);
            for (int m = 0; m < myStringArray3.length; m++)
                System.out.println(myStringArray3[m]);

            int x = 5;
            while (x < 10) {
                System.out.println(x);
                x += 2;
            }
        }
    }
}




