public class MyString {
    public static void main(String[] args) {
        String myString = "This is a text";
int lungime = myString.length();
        System.out.println("lungimea textului este "  +  lungime);
        String myName = "Diana Grebles";
        int lungimeaNumelui = myName.length();
        System.out.println(lungimeaNumelui);
        System.out.println("lungimea numelui \"Diana Grebles \" este "+lungimeaNumelui);
        char aPatraLitera=myName.charAt(4);
        System.out.println(aPatraLitera);
        char primaLitera=myName.charAt(0);
        System.out.println(primaLitera);
        System.out.println(aPatraLitera+primaLitera);

        System.out.println("________");

        String myCountry = "Finlanda";
        int lungimeaNumelui2 = myCountry.length();
        System.out.println(lungimeaNumelui2);
        System.out.println("lungimea numelui \"Finlandei\"este " +myCountry.length());

String MyFavouriteMovie = "'Lola rennt'";
            System.out.println("My favourite movie is \" " + MyFavouriteMovie+"\"");
            System.out.println(MyFavouriteMovie.toUpperCase());
            System.out.println(MyFavouriteMovie.toLowerCase());
            int lungimeanumelui3 = MyFavouriteMovie.length();
            System.out.println(lungimeanumelui3);
            }
}
