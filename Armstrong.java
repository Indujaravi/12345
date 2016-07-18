 while(n1!=0)
        {
            n2=n1%10;
            t=n2*n2*n2;
            sum=sum+t;
            n=n1/10;
        }
        if(sum==n1)
        System.out.println("it is a armstrong"+n1);
        else
            System.out.println("not a armstrong");
    }