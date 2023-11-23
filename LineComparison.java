import java.util.Scanner;
class comparison{
    int x1,x2,y1,y2;
    double len;
    comparison(int a,int b,int c,int d){
        x1=a;
        y1=b;
        x2=c;
        y2=d;
        len=0.0;
    }
    double findLen(){
          len=Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1),2));
        System.out.println("length of line ("+x1+","+y1+") and ("+x2+","+y2+") is : "+len+" units");
        return len;
    }
    boolean isEqual(double l1,double l2){
        return l1==l2;
    }
    void comp(double line1,double line2){
        int comp=Double.compare(line1, line2);
         if(comp==0)
         System.out.println("both have equal lengths---------");
         else if(comp<0)
         System.out.println("Line 1 is smaller than line 2--------");
         else
         System.out.println("Line 1 is greater than line 2----------");
    }
    
    void main(comparison ob1,comparison ob2){
        boolean check=isEqual(ob1.len, ob2.len);
        if(check)
         System.out.println("Both of them are of same length that is -----"+ob1.len);
         else
         System.out.println("Not equal--------");
         comp(ob1.len, ob2.len);
        
    }


}
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

         //uc4- branch name OOPlineCompare
         comparison c1=new comparison(2, 4, 5, 6);
         comparison c2=new comparison(4, 6, 8, 1);
         c1.findLen();
         c2.findLen();
         c1.main(c1, c2);;


         sc.close();
    }
}
