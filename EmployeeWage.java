import java.util.Scanner;
import java.util.ArrayList;
/**
 * wage
 */ 

  class wagePerCompany implements EmployeeWageCalculator {
  String employeeType;
  String companyName;
  int dailyWage;
  int monthlyWage;
  int days;
  int hours;
  int rate;
  wagePerCompany(String et,String cn,int d,int h,int r){
    employeeType=et;
    companyName=cn;
    days=d;
    hours=h;
    rate=r;
    dailyWage=0;
    monthlyWage=0;
  }
  @Override
  public void calcWage(){
    switch (employeeType) {
                    case "yes": System.out.println("Employee is Fulltime");
                    dailyWage=rate*hours;
                        
                        break;
                    case "no": System.out.println("Employee is part-time");
                    dailyWage=rate*(hours/2);
                    break;
                
                    default:
                    System.out.println("invalid");
                        break;
                }
    monthlyWage=days*dailyWage;

  }

  @Override
  public void displayWage(){
    System.out.println("--------------------"+companyName+"-----------------");
    System.out.println("daily Wage is Rs: "+dailyWage);
    System.out.println("Monthly Wage is Rs: "+monthlyWage);
  }
  
    
}

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

                //uc-8 branch name uc8_employeeWage
                System.out.println("ENTER COMPANY NAME, wage, number of working days and working hours per month");
                String name=sc.nextLine();
                int w=sc.nextInt();
                int days=sc.nextInt();
                int hrs=sc.nextInt();
                sc.nextLine();
                System.out.println("is the Employee fulltime?(yes/no)");
                String t=sc.next();
                wagePerCompany ob1=new wagePerCompany(t, name, days, hrs,w);
                ob1.calcWage();
                ob1.displayWage();

                sc.nextLine();
                 System.out.println("ENTER COMPANY NAME, wage, number of working days and working hours per month");
                 name=sc.nextLine();
                 w=sc.nextInt();
                 days=sc.nextInt();
                 hrs=sc.nextInt();
                 sc.nextLine();
                System.out.println("is the Employee fulltime?(yes/no)");
                 t=sc.next();
                wagePerCompany ob2=new wagePerCompany(t, name, days, hrs,w);
                ob2.calcWage();
                ob2.displayWage();

                sc.nextLine();
                 System.out.println("ENTER COMPANY NAME, wage, number of working days and working hours per month");
                 name=sc.nextLine();
                 w=sc.nextInt();
                 days=sc.nextInt();
                 hrs=sc.nextInt();
                 sc.nextLine();
                System.out.println("is the Employee fulltime?(yes/no)");
                 t=sc.next();
                wagePerCompany ob3=new wagePerCompany(t, name, days, hrs,w);
                ob3.calcWage();
                ob3.displayWage();

                // branch - multipleCompanies
                ArrayList<wagePerCompany> companyList=new ArrayList<>();
                companyList.add(ob1);
                companyList.add(ob2);
                companyList.add(ob3);
                System.out.println("Companies added to list");

                // branch wageInterface for implementing interface

                //branch companyQuery

                System.out.println("---------------------------------------------------------");
                System.out.println("Enter the name of the company whose wage you want to find out: ----");
                sc.nextLine();
                name=sc.nextLine();
                for(int i=0;i<companyList.size();i++){
                  if(companyList.get(i).companyName.equalsIgnoreCase(name)){
                    System.out.println("Wage of the company is Rs. "+companyList.get(i).monthlyWage);
                  }
                }
                sc.close();

    }
    
}