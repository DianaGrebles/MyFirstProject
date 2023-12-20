public class Conditionals {
    public static void main(String[] args) {
        if (10 < 0) {
            System.out.println("10 is greater than 0");
        } else
            System.out.println("10 is not smaller than 0"); //vezi si pe GitHub - Cristina

        int time = 99;
        if (time < 10) {
            System.out.println("Good morning");
        } else if (time < 18) {
            System.out.println("Good day");
        } else System.out.println("Good evening");

        int day=3;
        switch (day){
            case 1:System.out.println("Monday");break;
            case 2:System.out.println("Tuesday");break;
            case 3:System.out.println("Wednesday");break;
            case 4:System.out.println("Thursday");break;
            case 5:System.out.println("Friday");break;
            case 6:System.out.println("Saturday");break;
            case 7:System.out.println("Sunday");break;
        }

        int a = 5;
        int b = 10;
        int c = 8;
        boolean abc = a>b || c>b || c>a;
        System.out.println(abc);


        if (false)
        {System.out.print("a");}
        else if (true)
        {System.out.print("b");}
        else
        {System.out.print("c");};

        boolean suntemCuminti = true;
        boolean vineMosul;
        if (!suntemCuminti)
        {vineMosul = false;}
        else vineMosul = true;
        System.out.print(vineMosul);


    }
    //else System.out.println("Only 24 hours in a day");

    //ex 6 Algoritmi
//for (String t: tari){
    //if (t.charAt(0)=="A")
    // metode din oracle - cu string e mai ok (mai multe caractere), cu char - doar primul
    }














