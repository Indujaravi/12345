Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int k=0;
        char ch2;
        char[] ch=new char[20];
        String str3="";
        ch=str.toCharArray();
        int ln=str.length();
        char[] ch1=new char[ln];
        for(int i=ln-1;i>=0;i--)
        {
            ch2=ch[i];
            for(int j=i-1;j>=0;j--)
            {
                ch1[i]=ch[i];
                if(ch[i]==ch[j]){
                   ch[j]='\0';
                }
            }
            str3=str3+ch[i];
            System.out.println(" "+ch[i]);
        }
       
        System.out.println(""+str3);
        }
}