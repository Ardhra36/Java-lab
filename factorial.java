import java.io.*;
import java.util.Scanner;
class factorial
{
public static void main (String args[]) throws IOException
{
Scanner in= new Scanner(System.in);
int n;
System.out.println("Enter the number: ");
n=in.readInt();
int fact=1;
for(int c=1;c<=n;c++)
{
fact=fact*c;
}
System.out.println("Factorial of the given number: " +fact);
}
}
