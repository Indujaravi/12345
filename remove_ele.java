Scanner sc=new Scanner(System.in);
        int[] arr=new int[6];
        int[] arr1=new int[6];
        int count=0;
        for(int i=0;i<6;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter no to be deleted");
        int del=sc.nextInt();
        for(int i=0;i<6;i++)
        {
            if(arr[i]==del)
               continue;
            else
                count++;
            for(int j=0;j<count;j++){
                if(arr[i]!=del)
                    arr1[j]=arr[i];
            }
            System.out.println(" "+arr[i]);}
        }