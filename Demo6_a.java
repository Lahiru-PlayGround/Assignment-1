public class Demo6_a {
    public static void main(String[] args) {
        int x=5;
        String y = "0%";
        String colour1 ="\033[41m";
        String colour2 ="\033[42m";
        String colour4 ="\033[30m";
        String noColour ="\033[40m";
        System.out.printf("%3$s[%1$6d%4$s%5$s%2$-6s]%6$s\n",x,y,colour1,colour2,colour4,noColour);
    }
    
}
