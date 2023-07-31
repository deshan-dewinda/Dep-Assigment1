public class Demo6 {
    public static void main(String[] args) {
        String red="\033[041m";
        String green="\033[042m";
        String a ="\033[040m";
        final int firstInt=5;
        final int secondInt=0;
        String character ="%";
        

        System.out.printf("%5s[%5s%-5s%s%-4s]%s",red,firstInt,green,secondInt,character,a);

    }
    
}
