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
        //Excercitiul 1 - 18.10.2023//
        int a = 5;
        int b = 10;
        int c = 15;
        int d = 20;
        int sum4 = 100 + 50;
        int sum5 = sum1 + 50;
        System.out.println(sum1);
        System.out.println(sum2);

    }
}





















