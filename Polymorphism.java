//Java program to demonstrate constructor overloading//
public class Multiply{
void mul(int a,int b)
{
  System.out.println("Multiplication of two numbers:"+(a*b));
}
void mul(int a,int b,int c)
{
  System.out.println("Multiplication of three numbers:"+(a*b*c));
}
}
public class Polymorphism{
public static void main(String args[]){
Multiply m=new Multiply();
m.mul(5,7);
m.mul(8,7,2);
}
}