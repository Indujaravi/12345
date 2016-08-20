String str="String with maximum numbers of repeated letters";
        int count=0,n1;
        int ln=str.length();
        System.out.println(" "+ln);
        char[] ch=new char[50];
        char[] nn=new char[50];
        int[] n=new int[10];
        String[] st=new String[10];
        String[] str1=str.split(" ");
        for(int i=0;i<str1.length;i++)
        {count=0;
            ch=str1[i].toCharArray();
            for(int j=0;j<ch.length;j++)
            {
                for(int k=j+1;k<ch.length;k++)
                { 
                    
                 if(ch[j]==ch[k])
                 { 
                     nn[i]=ch[k];
                     //System.out.println(" "+nn[i]);
                     count++;
                     n[i]=count;
                     //System.out.println(count);
                 }//System.out.println(count);
                 else 
                     continue;
                }
            }
            System.out.println(count+" "+nn[i]+" "+n[i]);
        }
        for(int i=0;i<ch.length;i++)
        {int max=0;
            if(max<n[i]){
                max=n[i];
        System.out.println(n[i]+" "+max+" "+str1[max-1]);}
        }