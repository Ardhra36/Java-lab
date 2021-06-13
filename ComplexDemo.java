import java.io.*;
import java.util.Scanner;
class ComplexNo
{
int real;
int imaginary;
void read()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a real part:");
real=s.nextInt();
System.out.println("Enter imaginary part:");
imaginary=s.nextInt();
}
void display()
{
System.out.println(real+"+"+imaginary+"i");
}
ComplexNo addComplexNo(ComplexNo C)
{
ComplexNo D=new ComplexNo();
D.real=real+C.real;
D.imaginary=imaginary+C.imaginary;
return(D);
}
}
class ComplexDemo
{
public static void main(String[] args)
{
ComplexNo c1=new ComplexNo();
ComplexNo c2=new ComplexNo();
ComplexNo c3=new ComplexNo();
c1.read();
c2.read();
c1.display();
c2.display();
c3=c1.addComplexNo(c2);
c3.display();
}
}
