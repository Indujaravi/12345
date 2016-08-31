Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,c,j,k=0,to=0;
        int[] a=new int[99];
        for(i=10;i<99;i++)
        {
        for(j=2;j<=i;j++)    
        {
            if(i%j==0)
            {
                break;
            }}
            if(i==j) 
            {
             a[k]=i;
             k++;
            }
        }
        for(i=0;i<a.length;i++)
        { c = 0;
            for(j=i;j<a.length;j++)
            {c++;
                to=to+a[j];
                if(to==n)
                {
                 System.out.println(" "+c);
                 break;
                }
            }
        }