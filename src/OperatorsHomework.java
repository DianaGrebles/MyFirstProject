import org.w3c.dom.ls.LSOutput;

public class OperatorsHomework {

    //Exercitiile 1-6
    public static void main(String[] args) {
        System.out.println(10 * 6);
        System.out.println(10 / 5);
        int x = 10;
        ++x;
        System.out.println(x);
        x += 5;
        System.out.println(x);
        int a = 2;
        int b = 3;
        int sumAB = a + b;
        if (sumAB >= 10) {
            System.out.println("Suma este mai mare decat 10.");
        } else {
            System.out.println("Suma este mai mica decat 10.");
            if (sumAB % 2 == 0) {
                System.out.println("Suma este numar par.");
            }
                int c = 13;
                int d = 13;
                int sumCD = a + b;
                if (sumCD >= 10) {
                    System.out.println("Suma este mai mare decat 10.");
                } else {
                    System.out.println("Suma este mai mica decat 10.");
                    if (sumCD % 2 == 0) {
                        System.out.println("Suma este numar par.");
                    }

                    //Exercitii optionale

                            int var1 = 1;
                            int var2 = 2;
                            int var3 = 3;
                            int var4 = 4;
                            System.out.println(var1 + var2 + var3 + var4);
                            //sau
                            int sum = var1 + var2 + var3 + var4;
                            System.out.println(sum);
                            System.out.println(var1 * var2 * var3 * var4);
                            System.out.println(var4 % var2);
                            ++var1;
                        ++var1;
                        ++var1;
                        System.out.println(var1);
                        //Cum ca sa fie cu 2 unitati?!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                        //var2=-2;//te lamuresti aici
                        System.out.println(var2);
                        Boolean condition1 = var1+var2+var3+var4 > 100;
                        System.out.println(condition1);
                        Boolean condition2 = var1*var2*var3*var4 > 1000;
                    System.out.println("conditia1"+condition1);
                        System.out.println("conditia2"+condition2);
                        //Aici nu stiu sigur!!!!!!!!!!!!!!!!!!!!
                     boolean condition3=condition1||condition2;
                    System.out.println(condition3);
                        boolean condition4= condition1&& condition2;
                    System.out.println(condition4);
                    //System.out.println(condition1=true,||condition2=true);
                    //System.out.println(condition1=true,&&condition2=true);


                        }

                    }}}




