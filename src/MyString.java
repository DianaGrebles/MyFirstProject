public class MyString {
    public static void main(String[] args) {
        String myString = "LaLaLa";
        int lungime = myString.length();
        System.out.println("lungimea textului este " + lungime);
        String myName = "Diana Grebles";
        int lungimeaNumelui = myName.length();
        System.out.println(lungimeaNumelui);
        System.out.println("lungimea numelui \"Diana Grebles \" este " + lungimeaNumelui);
        //vezi mai sus, foarte utila formatarea
        char aCinceaLitera = myName.charAt(4);
        System.out.println(aCinceaLitera);
        char primaLitera = myName.charAt(0);
        System.out.println(primaLitera);
        System.out.println(aCinceaLitera + primaLitera);
        //interesant ce da mai sus

        System.out.println("________");

        //Ex 3-Tipuri de date

        String myCountry = "Finlanda";
        int lungimeaNumeluiFinlandei = myCountry.length();
        System.out.println(lungimeaNumeluiFinlandei);
        System.out.println("lungimea numelui \"Finlandei\"este " + myCountry.length());

        /*Optionale

        Exercitiul 2 – in clasa MyString
Declarati o variabila de tip String cu numele myFavouriteMovie si valoarea egala cu numele filmului vostru preferat.
Ex. String myFavouriteMovie = “Great Expectations”;
Afisati urmatorul text in consola:
My favourite movie is “Great Expectations”
Unde numele filmului vostru preferat sa apara in loc de “Great Expectations”.
Afisati inclusiv ghilimelele.
         */


        String MyFavouriteMovie = "Lola rennt";
        System.out.println("My favourite movie is \" " + MyFavouriteMovie + "\"");

        /*Exercitiul 3
        In clasa
MyString - un tip de date non-primitiv. Aceste tipuri de date pot apela metode. Incercati sa
apelati metodele toUpperCase() si toLowerCase() cu variabila de la exercitiul 2.
Ex.
myFavouriteMovie.toUpperCase();
myFavouriteMovie.toLowerCase();
Puneti rezultatul intr-o afisare si observati outputul.
Ex.
System.out.println(myFavouriteMovie.toUpperCase());
         */

        System.out.println(MyFavouriteMovie.toUpperCase());
        System.out.println(MyFavouriteMovie.toLowerCase());



        //Exercitiul 4 – in clasa MyString
        //Afisati lungimea stringului (adica numarul de caractere) pentru myFavouriteMovie
        int lungimeanumeluifilmului = MyFavouriteMovie.length();
        System.out.println(lungimeanumeluifilmului);


    }



}
