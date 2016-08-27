        int ln=no.length();
        int sum=0,val;
        int[] n1=new int[ln];
        char[] ch=new char[ln];
        ch=no.toCharArray();
        for(int i=0;i<ln;i++){
              n1[i]=ch[i]-48;   
        }
        for(int i=0;i<=ln;i++)
        {
            int n2=n1[i];
            int n=n1[i+1];
            //System.out.println(" "+n1[i]+" "+n1[i+1]);
            val=(int)Math.pow(n2, n);
            sum=sum+val;
            System.out.println(" "+sum);
        }