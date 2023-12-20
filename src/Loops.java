public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
// alta varianta de abordare - pe git hub Cristina
            for (int z = 0; z <= 10; z += 2) {
                System.out.println(z);
//For each
                String cars[] = {"BMW", "Mazda", "Opel", "Toyota"};
                for (String car : cars) {
                    System.out.println(car);
                }

                //While
                int m = 0;
                while (m < 5)  System.out.println(m);m++;
            }

                //int j = 0;
                //do {
                //System.out.println(j);
                //j++;
                // } while (j<5);

            }


            for (int k = 0; k < 10; k++) {
                if (k == 4) {
                    break;
                }
                System.out.println(k);
            }

            System.out.println("While");
            int k = 0;
            while (k < 10) {
                k++;
                if (k == 4) {
                    continue;
                }
                System.out.println(k);


            }

            //Tema pentru 01.11.2023
//Ex 1 - Scrieți un program care să afișeze toate numerele întregi de la 0 până la 10
//(inclusiv).

            //int a = 0;
            for (int a = 0; a >= 10; a++) {
                System.out.println(a);
            }


            // Ex 2 - Scrieți un program care să afișeze numerele întregi de la 20 până la 10 (inclusiv)
//în ordine descrescătoare.
//                int b = 0;
//                while (b<= 20 & b >=10)
//                    {System.out.println(b-);
//                    }

// Ex 3 - Scrieți un program care să afișeze toate numerele pare pozitive până la 100
//(inclusiv).

            int c = 0;


            //Ex 4 - Se dă un șir cu următoarele elemente: măr, căpsune, pere, banane. Scrieți un
//program care să afișeze pentru fiecare fruct: “Îmi place să mananc [numeFruct]”,
//unde numeFruct reprezintă fiecare fruct din șir.

            String fruits[] = {"mar", "capsune", "pere", "banane"};
            for (String fruit : fruits) {
                System.out.println("Imi place sa mananc " + fruit);
            }


//Ex 5 - Scrieți un program care să afișeze numele lunii în funcție de un număr întreg de
//la 1-12. Ex: 1 -> Ianuarie, 2-> Februarie, 3-> Martie, etc.

            int luna = 2;
            switch (luna) {
                case 1:
                    System.out.println("Ianuarie");
                    break;
                case 2:
                    System.out.println("Februarie");
                    break;
                case 3:
                    System.out.println("Martie");
                    break;
                case 4:
                    System.out.println("Aprilie");
                    break;
                case 5:
                    System.out.println("Mai");
                    break;
                case 6:
                    System.out.println("Iunie");
                    break;
                case 7:
                    System.out.println("Iulie");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("Septembrie");
                    break;
                case 10:
                    System.out.println("Octombrie");
                    break;
                case 11:
                    System.out.println("Noiembrie");
                    break;
                case 12:
                    System.out.println("Decembrie");
                    break;

            }


//Exercitii optionale
// Ex 1
// Declarati o variabila de tip int, cu numele “temperature” si dati-i o valoare la alegere.
// Daca valoarea ei este mai mica decat 18, afisati “prea frig”. Daca valoarea este intre 18 si 22,
// afisati “ok”. Daca valoarea este peste 22, afisati “prea cald”

            int temperature = 22;
            if (temperature<18){
                System.out.println("prea frig");
        }
            else if (temperature >=18&&temperature<=22) {
                System.out.println("ok");
            }
            else System.out.println("too hot");
            }

//Ex 2
// Se dau doua variabile:
// char gender (gen) – initializati cu o valoare la alegere (posibile valori „m‟ sau „f‟)
// boolean married (casatorit/a) - initializati cu o valoare la alegere
// Scrieti un program folosind instructiuni conditionale, astfel incat
// pentru gen „m‟, sa afiseze “Domnul”, indiferent daca persoana e casatorita sau nu
// pentru gen „f‟ sa afiseze “Domnisoara”, daca nu e casatorita sau “Doamna”, daca e casatorita.

        //varianta 1
        // char gender = 'm';
        // boolean married = true;
        // if (gender=='m'){
        // System.out.println("Domnul");
        // }
        // else if (gender=="f"&&married==false){
        // System.out.println("Domnisoara");
        // } else if (gender=="f"&&married==true){
        // System.out.println("Doamna");
        // }

        //varianta 2
        {char gender = 'f';
        boolean married = true;
        if (gender=='m')
            System.out.println("Domnul");
        }
        //else if (gender=='f'){
            //if(married){
                //System.out.println("Doamna");
          //  }
           // else  System.out.println("Domnisoara");
       // }


//Ex 3
// Declarati si initializati doua variabile de tip int.
//Scrieti un program care sa afiseze variabila cu valoare mai mare dintre cele doua: “[x] este
//mai mare decat [y]”, unde x si y sunt valorile variabilelor.
//Daca cele doua sunt egale, programul trebuie sa afiseze “sunt egale”.

                        int x = 24;
                        int y = 22;

                        //de comparat x cu y


//Ex 4
// Declarati o a treia variabila. Scrieti un program care sa afiseze variabila cu valoare mai mare dintre cele 3.

                        int z=42;


//Ex 5 - If
// Declarati o variabila de tip char cu numele letter si dati-i o valoare la alegere.
//Daca valoarea este consoana, afisati “[letter] este consoana”, daca este vocala, afisati “[letter]
//este vocala”, unde letter e valoarea variabilei.

                        char letter = 'u';
    {if (letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'){
                            System.out.println(letter+" este vocala");
        }
        else System.out.println(letter+"este consoana");
    }

}

















