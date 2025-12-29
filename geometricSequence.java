import java.util.Scanner;
public class geometricSequence {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int term=1;
        for(int i=1;i<=n;i++){
            System.out.println(term);
            if (i<n){
                term=term*2;
            }
        }
        
    }
}
