public class prime100 {
    public static void main(String[] args) {
        int i,j,count=0;
        int cn=0;
        int[] ab=new int[100];
        int[] bc=new int[100];
        for(i=2;i<100;i++)
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
                ab[cn]=i;
                //System.out.println(ab[cn]);==========>stores in array
                cn++;
              // System.out.println(i);
            }
          }
        int m,n = 0,c1=0,n1;
        for(i=0;i<cn-1;i++)
                {int sum=0;
                    n1=ab[i];
                    if(n1>9){
                           // System.out.println(""+ab[i]);
                       n=n1;}
                     while(n!=0){
                       m=n%10;
                       sum=sum+m;
                         //System.out.println(""+sum);
                       n=n/10;}
        for(j=2;j<sum;j++)
            {
                if(sum%j==0)
                {
                  break;
                }   
            }
            if(sum==j){
                   System.out.println(""+sum);
            }
                      
    }}}
    

