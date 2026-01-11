import java.util.Scanner;
public class nextDate {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     System.out.print("Enter day: ");
        int day= sc.nextInt();
        System.out.print("Enter month: ");
        int month= sc.nextInt();
        System.out.print("Enter year: ");
        int year= sc.nextInt();

        int daysInMonth;
        // check for february
        if(month==2){
            //check leap year
            if((year%400==0) || (year%4==0 && year%100 !=0)){
                daysInMonth=29;
            } else {
                daysInMonth=28;
            }
        }
        //month with 31 days
        else if (month ==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
            daysInMonth=31;
        } else{
            daysInMonth=30;
        }
        //find next date
        if(day<daysInMonth){
            day+=1;
        } else {
            day=1;
            if(month<12){
                month+=1;
            } else {
                month=1;
                year+=1;
            }
        }

        System.out.println(day +"/" +month +"/" +year);


    }
}
