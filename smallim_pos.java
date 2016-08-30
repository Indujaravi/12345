Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
            if(a[i]>a[j])
            {
                a[i]=a[j];
                break;
            }
            else
            {
                a[i]=-1;
                break;
            }
        }}
        if(a[a.length-1]<a[0])
         {
           a[a.length-1]=a[a.length-1];
         }
       else
         a[a.length-1]=-1;
      for(int i=0;i<a.length;i++)
       {
          System.out.println(""+a[i]);
       }