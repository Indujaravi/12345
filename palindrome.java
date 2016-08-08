 while(n1!=0)
 {
   n=n1%10;
   n1=n1/10;
   sum+=n;
  }
 int su1=sum;
 while(sum!=0)
  {
    n1=sum%10;
    rev=rev*10+n1;
    sum=sum/10;
   }
if(su1==re)
   System.out.println("palindrome");
else
   System.out.println("not palindrome");
