import java.util.*;
class fibonacci
{
public static void main(String[] args)
{
int a,b=1,c=1,d;
Scanner s=new Scanner(System.in);
a=s.nextInt();
System.out.print(b+" "+c);
for(int i=3;i<=a;i++)
{
d=b+c;
b=c;
c=d;
System.out.print(d+" ");
}
}
}
