        arr a2=new arr();
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter the first element of an array");
        a[0]=sc.nextInt();
        System.out.println("enter the diff between the element");
        j=sc.nextInt();
        for(i=1;i<n;i++)
        {
         a[i]=a[i-1]+j;
            System.out.println(""+a[i]);
        }
        for(i=0;i<n;i++)
        {
          a2.a1(a[i], i);
        }
class arr
{
    void a1(int a,int i)
    {
        if(a==i){
            System.out.println("the element"+a+"is in the position"+i);
        }
    }
}