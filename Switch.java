import java.util.Scanner;

[
public static void main(String[] args)
{
Scanner reader=new Scanner(System.in);
System.out.println("Enter a number");
int n=reader.nextln();
switch(n)
{
case 1:
System.out.println("the number is one");
break;
case 2:
System.out.println("the number is two");
break;
case 3:
System.out.println("the number is three");
default:
System.out.println("the number is invalid");
}
}
}