Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(" "+str);
        int ln=str.length();
        int count=0;
        char[] ch=new char[ln];
        ch=str.toCharArray();
            for(int i='a';i<='z';i++)
            {
                for(int j=0;j<ln;j++)
                {
                    if(i==ch[j])
                    {
                        System.out.println(" "+i+" "+ch[j]);
                        count++;
                    }
                }
            }  
        if(count>=26)
                System.out.println("Panagram "+str);
            else
                System.out.println("Not Panagram "+str);
        