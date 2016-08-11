public class strdiv {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int num=sc.nextInt();
        int[] n=new int[20];
        for(int i=0;i<num;i++)
        {
            n[i]=sc.nextInt();
        }
        if(num%2==0)
        {
            System.out.println("propre array");
        }
        else
        {
            System.out.println("not proper array");
        }