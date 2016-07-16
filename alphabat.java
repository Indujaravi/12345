char c;
BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
ch = (char) inp.read();  
if((ch=>'a' && ch<='z') || (ch>='A'&&ch<='Z'))
    System.out.println("alphabat");
else
   System.out.println("not alphabat");
    