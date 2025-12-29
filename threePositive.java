import java.util.Scanner;
public class threePositive {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int product;
        if(a==7){
            product =b*c;
            System.out.println(product);
        }else if(b==7){
            System.out.println(c);
        }else if(c==7){
            System.out.println(-1);
        }else{
            product =a*b*c;
            System.out.println(product);
        }

    }
}
