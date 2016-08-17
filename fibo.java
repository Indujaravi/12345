Scanner sc=new Scanner(System.in);
        int input1=sc.nextInt();
        int s1=0,s2=1,s=0,i;
        System.out.println(""+s1);
        System.out.println(""+s2);
        for(i=0;i<input1;i++)
        {
            s=s1+s2;
            s1=s2;
            s2=s;            
        System.out.println(""+s);
        }