public class Demo3 {
    public static void main(String[] args) {
        int a = 123;
        int b = 456;
        int c = 7890;
        String colour = "\033[32;1m";
        String normal = "\033[30;0m";
        System.out.printf("%s(%d)%s%4d-%d \n",colour,a,normal,b,c);
    }
    
}
