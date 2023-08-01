public class Demo6b {
    public static void main(String[] args) {
        
        String name1="Alice";
        int age1 =24;
        String name2="Bobe";
        int age2 =30;
        String firstColour ="\033[034;1m";
        String endColour="\033[030;0m";
        String ageColour="\033[035m";
        
        String fristLine="-".repeat(20)+"+" ;
        String firstLine_2="-".repeat(07)+"+";
        System.out.printf("+%s%s\n",fristLine,firstLine_2) ;
        System.out.printf("|%1$sName%2$24s|%1$10sAge%2$10s|\n",firstColour,endColour);
        System.out.printf("+%s%s\n",fristLine,firstLine_2) ;
        System.out.printf("|%-20s|%s%4d%11s|\n",name1,ageColour,age1,endColour);
        System.out.printf("|%-20s|%s%4d%11s|\n",name2,ageColour,age2,endColour);
        

        System.out.printf("+%s%s\n",fristLine,firstLine_2) ;

    }
        
        
    
}
