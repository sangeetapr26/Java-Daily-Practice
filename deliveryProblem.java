import java.util.Scanner;
public class deliveryProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter food type(V for veg and N for non-veg): ");
        int foodType = sc.next().charAt(0);
        System.out.println("Enter distance in kms: ");
        int dist = sc.nextInt();
        System.out.println("Enter quantity: ");
        int qty = sc.nextInt();
        double cost = 0.0;
        if(foodType=='V'|| foodType=='v'){
            cost=12*qty;
        } 
        else if(foodType=='N'|| foodType=='n'){
            cost=15*qty;
        }else{
            System.out.println("Invalid food type");
            return;
        }
        if (dist<=3){
            cost=cost+0;
            System.out.println("Total delivery cost : $"+cost);
        }else if(dist>3 && dist<=6){
            cost=cost+1;
            System.out.println("Total delivery cost : $"+cost);
        }else if(dist>6){
            cost=cost+2;
            System.out.println("Total delivery cost : $"+cost);
        }
    }
}
