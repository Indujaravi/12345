 {
        int[] a={1,2,3,10,9,4,5,7,7,7,7,8};
        int i,fl = 0,j;
        for(i=0;i<=11;i++)
        {
            for(j=i+1;j<11;j++)
            {
                if(fl==1)
                    continue;
                if(a[i]==a[j]){
                fl=1;
                System.out.println("the first element which is repeated is"+a[i]);
                break;
         }}
               
                    
            
        }
   