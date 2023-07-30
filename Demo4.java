public class Demo4 {
    public static void main(String[] args) {
        int date =28;
        int month =12;
        int year =2023;
        int hour =23;
        int minute =59;
        int second =59;
        String colour1 ="\033[31m";
        String colour2 ="\033[32m";
        String colour3 ="\033[33m";
        String colour4 ="\033[34m";
        String colour5 ="\033[35m";
        String colour6 ="\033[36m";
        String noColour ="\033[30m";
        System.out.printf("%7$s%d%13$s/%8$s%d%13$s/%9$s%d%13$s/%10$s%3d%13$s:%11$s%d%13$s:%12$s%d%13$s\n",month,date,year,hour,minute,second,colour1,colour2,colour3,colour4,colour5,colour6,noColour);

    }
    
}
