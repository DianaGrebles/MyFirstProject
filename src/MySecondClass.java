public class MySecondClass {
    public static void main(String[] args) {
        System.out.print("Invata!");
        System.out.println("Invata cu drag.");
        System.out.print("Invata cu mult drag.");
        System.out.println("Invata cu si mai mult drag.");
        //x=5;
        //nume="Jon";


        //ExercitiiAutomation2
        // 1-declarare variabila int pentru zi si luna nastere; afisare suma
        int zi=7;
        int luna=10;
        System.out.println(zi+luna);

        //2-declarare variabila String care sa contina numele nostru; afisarea valorii ei
        String nume="Diana";
        System.out.println(nume);
        System.out.println(nume+" invata Java.");
        //sau cu String text = "invata Java"; sout nume+text

        //3-declarare variabila de tip int si de tip String; afisare impreuna cu aceeasi functie print
        int x=3;
        String y=" pastori se intalnira.";
        System.out.println(x+y);

        //Exercitii optionale
        //1- declarare doua variabile String, afisare impreuna cu+

        String limbaj="Java.";
        String text1="Este usor sa inveti ";
        System.out.println(text1+limbaj);
        //2-noua valoare pentru limbaj, se suprascrie
        limbaj="Python.";
        //atentie mai sus-interesant!!! - altfel: java: variable limbaj is already defined in method main(java.lang.String[])
        System.out.println(text1+limbaj);
        //3-Atribuiti variabilei limbaj valoarea “orice limbaj de programare.Afisati din nou text1+limbaj si vedeti ce rezulta.
        limbaj="orice limbaj de programare ";
        System.out.println(text1+limbaj);
        //4-noua variabila:text2.Afisati impreuna text1+limbaj+text2 si observati outputul.
        String text2="atata timp cat iti dai silinta ";
        System.out.println(text1+limbaj+text2);
        //5-Acum afisati variabilele in ordine inversa text2+limbaj+text1 si observati outputul
        System.out.println(text2+limbaj+text1);
        //Am pus cate un spatiu (“ “) la finalul fiecarui text din variabile (text1, limbaj,text2) pentru o afisare cu spatii intre cuvinte.
        System.out.print(text2+limbaj+text1);
        System.out.println(text2+limbaj+text1);
        System.out.println(text2+limbaj+text1);
        System.out.print(text2+limbaj+text1);
        System.out.println(text2+limbaj+text1);
        /*Intreab-o pe Cristina cu In si fara In,
        sa nu fie cumva invers.*/
    }
}
