public class Demo5 {
    public static void main(String[] args) {
        int a =978;
        int b =3;
        int c =16;
        int d =14841000;
        String colour1 ="\033[31m";
        String colour2 ="\033[32m";
        String colour3 ="\033[33m";
        String colour4 ="\033[35m";
        String noColour ="\033[30m";
        System.out.printf("%5$s%d%9$s-%6$s%d%9$s-%7$s%d%9$s-%8$s%d%9$s\n",a,b,c,d,colour1,colour2,colour3,colour4,noColour);
    }
    
}