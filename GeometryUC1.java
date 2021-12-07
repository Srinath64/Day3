import java.util.Scanner;
class GeometryUC1
{
public static void main (String[ ] args)
{
Scanner sc=new Scanner (System.in);
int x1, x2,y1,y2;
double d;

System.out.println("Enter the co-ordinates of  first point");
x1=sc.nextInt();
y1=sc.nextInt();
System.out.println("Enter the co-ordinates of second point");
x2=sc.nextInt();
y2=sc.nextInt();
d=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
System.out.println("Distance between first point ("+x1+","+y1+") & second point ("+x2+","+y2+") = "+ d);
}
}
