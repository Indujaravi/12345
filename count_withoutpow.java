Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n2=n;
        int n1,count=0,po,sum=0;
        while(n!=0)
        {
            n=n/10;
            count++;
        }
        System.out.println(" "+count);
         while(n2!=0)
        {
            n1=n2%10;
            po=1;
            for(int i=0;i<count;i++)
            {
              po=po*n1;
              }
            sum+=po;
            n2=n2/10;
        }
         System.out.println(" "+sum);
    }