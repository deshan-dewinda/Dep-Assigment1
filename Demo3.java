public class Demo3 {
    public static void main(String[] args) {
        
        int telephnum_1=123;
        int telephnum_2=456;
        int telephnum_3=7890;

        String a= "\033[45m";
        String b= "\033[40m";

        
        System.out.printf("(%s%s%s)%s-%s",a,telephnum_1,b,telephnum_2,telephnum_3);



    }
    
}
