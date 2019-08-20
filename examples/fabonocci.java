public class fabonocci
{
public static void main(String [] args)
{
int a=1,b=0,t=0,n=10;
for(int i=0;i<n;i++)
{
t=a+b;
a=b;
b=t;
System.out.println(t);
}

}
}

