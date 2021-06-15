import java.util.Scanner;

public class tema {
    private static Scanner scanner;

    public static void main(String[] args) {
        createScanner();
        inmultire();
        verificareNumar();
        verificareNumar2();
        calculator();
        numerePare();
    }

    private static void createScanner() {
        scanner=new Scanner(System.in);
    }

    private static void inmultire() {
        System.out.println("Primul numar");

        while (!isInteger()) {
            System.out.println("Primul numar");
        }

        int a= scanner.nextInt();

        System.out.println("Al doilea numar");

        while (!isInteger()) {
            System.out.println("Al doilea numar");
        }

        int b=scanner.nextInt();

        int prod=a*b;

        System.out.println("rezultatul inmultirii este: " +prod);
    }

    private static void verificareNumar() {
        System.out.println("Numarul este:");

        while (!isInteger()) {
            System.out.println("Numarul este");
        }

        int x=scanner.nextInt();

        if (x==5) {
            System.out.println("Numarul este 5");
        } else {
            System.out.println("Numarul nu este 5");
        }
    }

    private static void verificareNumar2() {
        System.out.println("Numarul este:");

        while (!isInteger()) {
            System.out.println("Numarul este");
        }

        int x=scanner.nextInt();

        if (x>0 && x<10) {
            System.out.println("Numarul este mai mic decat 10");
        } else if (x>=10 && x<20) {
            System.out.println("Numarul este intre 10 si 20");
        } else if (x>30) {
            System.out.println("Numarul este mai mare decat 30");
        }
    }

    private static void calculator() {

        System.out.println("Introduceti primul numar");

        while (!isInteger()) {
            System.out.println("Introduceti primul numar");
        }

        int a=scanner.nextInt();

        System.out.println("Introduceti al doilea numar");

        while (!isInteger()) {
            System.out.println("Introduceti al doilea numar");
        }

        int b= scanner.nextInt();

        System.out.println("Introduceti un operator (+, -, *, /)");

        String x=scanner.next();

        while (!isValidOperator(x)) {
            System.out.println("Introduceti un operator (+, -, *, /)");
            x=scanner.next();
        }

        System.out.println(rezultat(a,b,x));


    }

    private static void numerePare() {
        for (int i=0;i<=100;i++) {
            if (i%2==0) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isInteger() {
        if (!scanner.hasNextInt()) {
            System.out.println(scanner.next()+"nu este numar intreg");
            return false;
        } else {
            return true;
        }
    }

    private static boolean isValidOperator (String operator) {
         switch (operator) {
             case "-":
                 return true;
             case "+":
                 return true;
             case "*":
                 return true;
              case "/":
                 return true;
             default:
                 return false;
        }
    }

    private static double rezultat(int a, int b, String x) {
        double rez=0;

        switch (x) {
            case "+":
                rez=a + b;
                break;
            case "-":
                rez=a - b;
                break;
            case "*":
                rez=a * b;
                break;
            case "/":
                rez=(float)a / (float)b;
                break;
        }
        return rez;
    }
}
