for(i=0;i<4;i++)
{
 for(j=i+1;j<5;j++){
 sum=a[i]+a[j];
 if(n>0)
  {
   if(min>=n&&n!=0){
      min=n;
      i=a[i];
         i1=a[j];
                f1=1;
            }} else
            {
            if(n>=min2&&n!=0)
                {
                    min2=n;
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
    