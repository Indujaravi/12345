Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=sc.nextInt();
        char[] c=s.toCharArray();
        int ln=s.length();
        int count=l;
        char c1=c[0];
        int i=1,j;
        for(i=1;i<ln;i++)
        {
            String ss="";
            ss=ss+c1+s.substring(i, (i+(l-1)));
            System.out.println(" "+ss);
        }