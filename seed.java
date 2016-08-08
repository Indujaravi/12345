Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int no=sc.nextInt();
int n1=0;
while(no!=0)
{
 a[i]=no%10;
 count++;
 i++;
 no=no/10;
}
for(i=0;i<count;i++)
{
 n1=n1*a[i];
}
System.out.println(""+n1);
 