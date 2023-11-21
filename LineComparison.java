import java.util.Scanner;

public class LineComparison {
    public double findLen(int x1,int y1,int x2,int y2){
        return Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1),2));
    }
    public static void main(String[] args){
        System.out.println("Welcome to Line Comparison Computation Program");

        //uc-1 branch length
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter coordinates of point 1: ");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        System.out.println("Enter coordinates of point 2: ");
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        LineComparison lc = new LineComparison();
        double len=lc.findLen(x1,y1,x2,y2);
        System.out.println("Length of the line is : "+len+" units");

        //uc-2 branch equals
        System.out.println("Enter line 1 coordinates");
         x1=sc.nextInt();
         y1=sc.nextInt();
         x2=sc.nextInt();
         y2=sc.nextInt();
         double line1=lc.findLen(x1, y1, x2, y2);
         System.out.println("Enter line 2 coordinates");
         x1=sc.nextInt();
         y1=sc.nextInt();
         x2=sc.nextInt();
         y2=sc.nextInt();
         double line2=lc.findLen(x1, y1, x2, y2);
         if(line1==line2)
         System.out.println("Both of them are of same length that is "+line1);
         else
         System.out.println("Not same length");


         //uc-3 branch name compare
         System.out.println("Enter line 1 coordinates");
         x1=sc.nextInt();
         y1=sc.nextInt();
         x2=sc.nextInt();
         y2=sc.nextInt();
         line1=lc.findLen(x1, y1, x2, y2);
         System.out.println("Enter line 2 coordinates");
         x1=sc.nextInt();
         y1=sc.nextInt();
         x2=sc.nextInt();
         y2=sc.nextInt();
         line2=lc.findLen(x1, y1, x2, y2);
         int comp=Double.compare(line1, line2);
         if(comp==0)
         System.out.println("both have equal lengths");
         else if(comp<0)
         System.out.println("Line 1 is smaller than line 2");
         else
         System.out.println("Line 1 is greater than line 2");
    }
}
