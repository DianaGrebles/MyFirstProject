public class Operators {

    public static void main(String[] args) {
        {
        }
        int sum1 = 100 + 50;
        int sum2 = sum1 + 50;
        int sum3 = sum1 + sum2;
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

        int number1 = 100;
        int number2 = 50;
        System.out.println(number1 + number2);
        System.out.println(number1 - number2);
        System.out.println(number1 / number2);
        System.out.println(number1 * number2);
        System.out.println(number1 % number2);
        System.out.println(9 / 2);
        System.out.println(9 % 2);
        System.out.println(++number1); //mai intai face incrementarea
        System.out.println(--number2);
        System.out.println(number1++); // mai intai afiseaza, apoi incrementeaza
        int number3 = number2;
        number2 = 1;
        System.out.println(number3);
        System.out.println(number2);
        number2 = number2 + 2;
        number2 += 2;
        System.out.println(number2);
        number2 += 4; //echivalent cu number2=number2+4
        System.out.println(number1 > number2); //100>6
        System.out.println(number1 < number2);
        System.out.println(10 > 5);
        System.out.println("A" == "A"); // == inseamna ca nu atribuim valoare, ca sa diferentiem de atribuire
        System.out.println('A' < 'B'); //doar de curiozitate, sa vedem daca stie, compara codurile hexa
        System.out.println(!true); // = not true, so false (in this case)
        System.out.println(10 > 5);
        System.out.println(number1); //a devenit 101
        System.out.println(number2); //a devenit 6
        Boolean condition1 = number1 > number2 && number1 > 100;
        System.out.println(condition1);
        Boolean condition2 = number1 > number2 || number1 < 100;
        System.out.println(condition2);
        if (!condition1) {
            System.out.println("Conditia este adevarata");
        } else System.out.println("Conditia nu este adevarata");
        //Excercitii din slide-uri - 18.10.2023//
        //Ex 1 - varianta 1
        System.out.println(10*6);
        //Ex 1 - varianta 2
        double result = 10*6;
        System.out.println(result);
        //Ex 2 - varianta 1
        System.out.println(10/5);
        //Ex 2 - varianta 2
        double result1 = 10/5;
        System.out.println(result1);
        //Ex 3 - varianta 1
        int x = 10;
        ++x;
        System.out.println(++x);
        System.out.println(100+100);
// DE CE?//Ex 4
        x+=5;
        System.out.println(x);
        // DE CE 17 si nu 15?

     //Ex 5
        int y = 10;
        int z = 20;
        int k = y+z;
        if(k>=10){
            System.out.println ("Suma este mai mare decat 10");
        }
        else System.out.println ("Suma este mai mica decat 10");

        //Ex6
        if (k%2==0){
            System.out.println ("Suma este numar par");
        }
        // Else e optional, doar If e obligatoriu

     // Ex 1 - optional

        int a = 5;
        int b = 10;
        int c = 15;
        int d = 20; // sau int var1, var2, var3, var4; var 1 =...; var 2 =
        int sum4 = a+b+c+d;
        System.out.println(sum4); // sau cum am facut eu
        System.out.println(d%b);

        ++a;
        ++a;
        ++a;
        System.out.println(a); // for (int i=0; i<3;i++){
        b=2;



    }
    //Ex 3 - similar ex 2
    
    //Ex 4
    //boolean cond1 = sum4>10;
    //boolean cond2 =prod4>1000;
    //System.out.println (cond1);
    //System.out.println (cond1);

    //Ex5
    //System.out.println (cond1 || cond2); //vezi pe github



}




















