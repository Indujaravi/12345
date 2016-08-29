Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1[]=str.split("\\s");
       // String str2[]=new String[str/2];
        for(int i=0;i<str.length()-1;i=i+2)
        {
            
            String str2=new StringBuffer(str1[i]).reverse().toString();
            System.out.println(" "+str2);
            
        }