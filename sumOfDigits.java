public class sumOfDigits {
    public static void main(String[] args) {
        int num=123456;
        int sum_of_digits=0;
        do{
            int digits=num%10;
            sum_of_digits=sum_of_digits+digits;
            num=num/10;
        }while(num>0);

        System.out.println("Sum of digits: "+sum_of_digits);
    }
    
}
