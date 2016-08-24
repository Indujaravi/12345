Scanner sc=new Scanner(System.in);
      int no=sc.nextInt();
      int i,j,n1;
      int c=0;
      int[] a=new int[100];
      for(i=2;i<no;i++)
      {       
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                  break;
                }   
            }
            
            if(i==j)
            {
               a[c]=i;
               System.out.println(a[c]);
               c++;
            }
            }
      for(i=0;i<c;i++)
      {
          for(j=i+1;j<no;j++)
          {
              n1=a[i]+a[j];
              
              if(no==n1)
               System.out.println(" "+a[i]+" "+a[j]);   //System.out.println(" "+n1);
          }
      }
      }