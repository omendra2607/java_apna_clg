

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch(button){
            case 1 : System.out.println("addition");
            Scanner add = new Scanner(System.in);
            double a = add.nextDouble();
            double b = add.nextDouble();
            System.out.println(a+b);
            break;

            case 2 :
                System.out.println("subtraction");
                Scanner sub = new Scanner(System.in);
                a = sub.nextDouble();
                b = sub.nextDouble();
                System.out.println(a-b);
                break;

            case 3 :
                System.out.println("multiplication");
                Scanner mul = new Scanner(System.in);
                a = mul.nextDouble();
                b = mul.nextDouble();
                System.out.println(a*b);
                break;

            case 4 :
                System.out.println("division");
                Scanner div = new Scanner(System.in);
                a = div.nextDouble();
                b = div.nextDouble();
                System.out.println(a/b);

            default:
                System.out.println("invalid");
        }
    }
}
