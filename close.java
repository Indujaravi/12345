  for(i=0;i<4;i++)
        {
            for(j=i+1;j<5;j++){
                sum=a[i]+a[j];
            if(sum>0)
                {
            if(min>=sum&&sum!=0){
                min=sum;
                i1=a[i];
                i2=a[j];
                f1=1;
            }} else
            {
            if(sum>=min2&&sum!=0)
                {
                    min2=sum;
                    i3=a[i];
                    i4=a[j];
                    f2=1;
                }
            }
        }
    }
    
if(f1==1)
        System.out.println(""+i1+" "+i2);
if(f2==1)
        System.out.println(""+i3+" "+i4);
    