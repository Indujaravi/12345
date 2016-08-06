public class sumof35 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=15;i++)
        {
                sum=sum+i;
        }
        System.out.println(" "+sum);
        for(int j=15;j<=45;j++)
        {
            if(j%2!=0)
                sum=sum+j;
        }
        System.out.println(" "+sum);
    }
    
}