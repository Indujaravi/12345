Scanner sc=new Scanner(System.in);
        int n1,n2,t,s,sum=0;
        n1=sc.nextInt();
        while(n1!=0){
            t=n1%10;
            sum=(sum*10)+t;
            n1=n1/10;
        }
        System.out.println("num"+sum);
 