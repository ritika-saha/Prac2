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
    }
}
