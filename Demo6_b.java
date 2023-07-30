public class Demo6_b {
    public static void main(String[] args) {
        String colour1 = "\033[31m";
        String noColour = "\033[30m";
        String horLine = "\033[33m|";
        String upperLetters = "\033[34;1m";
        String loverLetters = "\033[30;0m";
        String line = "\033[33m+---------------+----+\n";

        System.out.printf("%6$s%1$s%2$s %4$-14s%3$s%1$s%2$s %5$-3s%3$s%1$s\n%6$s",horLine,upperLetters,loverLetters,"NAME","AGE",line);
        System.out.printf("%1$s%7$s %4$-14s%1$s%6$s %5$-3s%1$s\n",horLine,upperLetters,loverLetters,"Alice","24",colour1,noColour);
        System.out.printf("%1$s%2$s%7$s %4$-14s%3$s%1$s%2$s%6$s %5$-3s%3$s%1$s\n%8$s",horLine,upperLetters,loverLetters,"Bod","30",colour1,noColour,line);
    }
}
    
