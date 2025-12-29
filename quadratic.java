//Quadratic equation is an equation with degree 2 in the form of ax2 +bx + c = 0 where a, b and c are the coefficients.

import java.util.Scanner;
public class quadratic{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();

        double D = (b*b)-(4*a*c);

        if(D==0){
            double root= -b/(2*a);
            System.out.println("Root= "+root);
        }
        else if (D>0){
            double root1 =(-b+Math.sqrt(D))/(2*a);
            double root2 =(-b-Math.sqrt(D))/(2*a);
            System.out.println("Root1= "+root1);
            System.out.println("Root2= "+root2);
        }
        else{
            System.out.println("The equation has no real roots.");
        }
    }
}