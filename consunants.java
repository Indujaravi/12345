public static void main(String[] args) throws IOException {
        BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
        
        char ch=(char) b1.read();
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println("volwes"+ch);
    }else
            System.out.println("consunants"+ch);
    }
    }
