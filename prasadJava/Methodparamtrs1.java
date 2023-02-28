class Methodparamtrs1
{

public static void Add(int a,int b)
{

int sum=a+b;
System.out.println("The sum of "+a+" and "+b+ " is "+sum);

}

public static void main(String[] args)
{

System.out.println("Main Starts");
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter First Number");
int a=scn.nextInt();
System.out.println("Enter Second Number");
int b=scn.nextInt();
Add(a,b);
System.out.println("Main Ends");

}

}
