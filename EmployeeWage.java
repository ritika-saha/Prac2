import java.util.Scanner;
/**
 * wage
 */ 
 class wage {
  String employeeType;
  int dailyWage;
  int monthlyWage;
  wage(String et){
    employeeType=et;
    dailyWage=0;
    monthlyWage=0;
  }
  void calcWage(){
    switch (employeeType) {
                    case "yes": System.out.println("Employee is Fulltime");
                    dailyWage=20*8;
                        
                        break;
                    case "no": System.out.println("Employee is part-time");
                    dailyWage=20*4;
                    break;
                
                    default:
                    System.out.println("invalid");
                        break;
                }
    monthlyWage=20*dailyWage;

  }

  void displayWage(){
    System.out.println("daily Wage is Rs: "+dailyWage);
    System.out.println("Monthly Wage is Rs: "+monthlyWage);
  }
  
    
}
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

                //uc-3 branch name parttime
                int parttimeWage=20*4;
                System.out.println("Part-time employee Wage: Rs. "+parttimeWage);

                //uc-4 branch name wageSwitch
                System.out.println("is the Employee Fulltime? yes/no");
                Scanner sc=new Scanner(System.in);
                String s=sc.nextLine();
                switch (s) {
                    case "yes": System.out.println("Daily wage is : Rs. "+dailyWage);
                        
                        break;
                    case "no": System.out.println("Daily wage is : Rs. "+parttimeWage);
                    break;
                
                    default:
                    System.out.println("invalid");
                        break;
                }

                //uc-5 branch name monthlyWage
                int monthlyWage=20*dailyWage;
                System.out.println("Monthly Wage is Rs. "+monthlyWage);

                //uc-6 branch name limitWage
                int Days=20;
                int finalWage=0;
                while(Days>0){
                    Days--;
                    finalWage+=dailyWage;
                }
                System.out.println("wage after 20 days : Rs. "+finalWage);


                //uc-7 branch name uc7_employeeWage
                wage ob=new wage(s);
                ob.calcWage();
                ob.displayWage();




                sc.close();

    }
    
}