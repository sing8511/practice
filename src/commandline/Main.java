package commandline;

public class Main {

    public static void main(String[] args) {
       for (int i =0 ;i<args.length;i++){
           System.out.println("args["+i+"] is : " + args[i]);
       }
       int n = 99;
        String num = Integer.toString(n);
        
       System.out.println("number is :" + num); 
       String s1 = "99";
       int number = Integer.parseInt(s1);
       System.out.println(number);
       

    }
    
}
