import java.util.*;
class file
{
public static void main(String[] args)
{
int n,c=0,sum=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();
for(int i=0;i<n;i++)
if(c==i)
for(int j=0;j<n;j++)
sum=sum+arr[j]-arr[c];
c++;
System.out.print(sum);
}
}
}
