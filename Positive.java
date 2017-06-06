import java.util.*;
public class Positive
{
public static void main(String arg[])
{
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
if(a==0)
{
System.out.println("Zero");
}
else if(a>0)
{
System.out.println("Positive");
}
else
{
System.out.println("Negative");
}
