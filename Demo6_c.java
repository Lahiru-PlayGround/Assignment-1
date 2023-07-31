public class Demo6_c {
    public static void main(String[] args) {
        
        String colour1 = "\033[31m";
        String noColour = "\033[30m";
        String horLine = "\033[33m|\033[30m";
        String upperLetters = "\033[37;1m";
        String loverLetters = "\033[30;0m";
        int x =3966936;
        int y =8336817;
        String newYork ="\033[32m New \033[30mYork";
        String line = "\033[33m+---------------+------------+------------+\n";

        System.out.printf("%1$s%2$s%7$s %3$-14s%8$s%2$s%7$s %4$-11s%8$s%2$s%7$s %5$-11s%8$s%2$s\n%1$s",line,horLine,"CITY","STATE","POPULATION",noColour,upperLetters,loverLetters);
        System.out.printf("%2$s %3$-14s%2$s %4$-11s%2$s %6$s%5$-,11d%7$s%2$s\n",line,horLine,"Los Angalese","Califoniya",x,colour1,noColour);
        System.out.printf("%2$s%3$s%4$6s%2$s%3$s%4$3s%2$s %6$s%5$-,11d%7$s%2$s\n%1$s",line,horLine,newYork,"",y,colour1,noColour);
    }
    
}
