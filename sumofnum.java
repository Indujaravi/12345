Scanner sc=new Scanner(System.in);
        String  no=sc.next();
        int ln=no.length();
        int[] no1=new int[ln];
        int sum=0;
        char[] ch=new char[ln];
        ch=no.toCharArray();
        for(int i=0;i<ln;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                int n=ch[j]-48;       
                sum=sum+n;
            }
            //System.out.println(" "+sum);
        }
        System.out.println(" "+sum);