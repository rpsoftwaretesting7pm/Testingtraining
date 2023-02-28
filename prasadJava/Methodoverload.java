class Methodoverload
{

public static int add(int a,int b)
{

return a+b;

}

public static double add(double a,double b)
{

return a+b;

}
public static long add(long a,long b)
{

return a+b;

}

public static void main(String[] args)
{

System.out.println(add(25,75));
System.out.println(add(25.987,75.8976));
System.out.println(add(22332427675l,75356377987l));

}
}
