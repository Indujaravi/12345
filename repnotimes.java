Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int ln=str.length();
        int[] no=new int[ln];
        char[] ch=new char[ln];
        ch=str.toCharArray();
        for(int i=0;i<ln;i++)
        System.out.println(" "+ch[i]);
        int i,j,n;
        String sum="";
        for(i=0;i<ln;i=i+2)
        {
            for(j=i+1;j<ln;j=j+2)
            {
                no[i]=ch[j];
                n=no[i]-48;
                System.out.println(" "+ch[j]+" "+n);
               for(int k=n;k>0;k--){
                   sum=sum+ch[i];
               }
               break;
            }
        }
         System.out.println("4 "+sum);
    }
}