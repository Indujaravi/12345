for(i=0;i<=11;i++)
        {
            ag=0;
            for(j=0;j<=11;j++)
            {
                if(i==j)
                    continue;
            if(a[i]==a[j]){
                ag=1;
                break;
            }}
                if(ag!=1)
                    System.out.println("the no"+a[i]+"is unique in the array");
            
        }
