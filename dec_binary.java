int n=sc.nextInt();
        int[] t=new int[10];
        int[] b=new int[10];
        String[] t1=new String[100];
        int n1,sum=0,count=0,c;
        String t2;
        for(int i=0;i<=n;i++)
        {while(n!=0)
           { t[i]=n%10;
            t1[i]=Integer.toBinaryString(t[i]);
                //System.out.println(" "+t1[i]+" "+t[i]);
                c=0;
                int k=t1[i].length();
                for(int j=0;j<k;j++)
                {char c1=t1[i].charAt(j);
                    //System.out.println(" "+c1);
                   if(c1=='1'){
                   c++;
                   }}
            b[i]=c;
            n=n/10;
            }}  
        for(int i=0;i<n;i++)
        {for(int j=i+1;j<n;j++)
        {if(b[i]<b[j])
            {t2=t1[i];
                t1[i]=t1[j];
                t1[j]=t2;
            }
            if(b[i]==b[j])
            {if(b[i]<b[j])
                {t2=t1[i];
                t1[i]=t1[j];
                t1[j]=t2;
      }}}}}}
