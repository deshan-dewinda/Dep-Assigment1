public class Demo4 {
    public static void main(String[] args) {
        int day =28;
        int month=12;
        int year =2023;

        int hour = 23;
        int minute = 59;
        int second = 59;
        
        String d = "\033[31m";
        String m ="\033[32m";
        String y ="\033[36m";
        String h ="\033[30m";
        String mi ="\033[35m";
        String s ="\033[39m";
        String e= "\033[30m";
        

        System.out.printf("\"%s%d/%s%d/%s%d%s%3d:%s%d:%s%d\"" ,d,day,m,month,y,year,h,hour,mi,minute,s,second,e);

    }
    
}
