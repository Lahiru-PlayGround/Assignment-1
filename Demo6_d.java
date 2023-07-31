public class Demo6_d {
    public static void main(String[] args) {
        
        String colour1 = "\033[31m";
        String colour2 = "\033[32m";
        String colour3 = "\033[34m";
        String noColour = "\033[30m";
        String horLine = "\033[33m|\033[30m";
        String upperLetters = "\033[37;1m";
        String loverLetters = "\033[30;0m";
        float x =0.99f;
        float y =1.49f;
        int a =5;
        int b=10;
        String newYork ="\033[32m New \033[30mYork";
        String line = "\033[33m+----------+----------+--------+\n";

        System.out.printf("%1$s%2$s%7$s %3$-9s%8$s%2$s%7$s %4$-9s%8$s%2$s%7$s %5$-7s%8$s%2$s\n%1$s",line,horLine,"ITEM","QUANTITY","PRICE",noColour,upperLetters,loverLetters);
        System.out.printf("%2$s %3$-9s%2$s %8$s%4$9s%9$s%2$s %7$s$%6$s%5$-6s%9$s%2$s\n",line,horLine,"Apple",a,x,colour1,colour2,colour3,noColour);
        System.out.printf("%2$s %3$-9s%2$s %8$s%4$9s%9$s%2$s %7$s$%6$s%5$-6s%9$s%2$s\n%1$s",line,horLine,"orange",b,y,colour1,colour2,colour3,noColour);
    }
    
}