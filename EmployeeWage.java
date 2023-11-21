import java.util.Scanner;

public class EmployeeWage {
    public static void main(String[] args){
        System.out.println("Welcome to Employee\r\n" + //
                "Wage Computation\r\n" + //
                "Program-----------------------------------------------------------------");

                //uc1 - branch name attendance
                int attendance= (int)Math.floor(Math.random()*10)%2;
                if(attendance==1)
                System.out.println("Employee is present");
                else
                System.out.println("Employee is absent");

                //uc-2 - branch name wage
                int dailyWage=20*8;
                System.out.println("Daily wage is : Rs. "+dailyWage);
    }
    
}