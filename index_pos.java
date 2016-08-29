Scanner sc=new Scanner(System.in);
        int[] no=new int[6];
        int[] sum=new int[6];
        int max=0,max1=0,j=0;
        int n1,n2;
        for(int i=0;i<6;i++)
        {
            no[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
                int sub=no[i]-no[i+1];
            //System.out.println(" "+no[i]+" "+no[i+1]+" "+sub);
                sum[j]=Math.abs(sub);
                if(max<sum[j])
                    max=sum[j];
                j++;
                //System.out.println(" "+max);
        }   
          System.out.println("ggf "+max);
          for(j=0;j<=5;j++)
        {
            if(max==sum[j]){
                if(max<=no[j]){
                    max1=no[j];
                System.out.println(" "+no[j]);
            }}
            
            }System.out.println(" "+max1);
        }