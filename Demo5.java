public class Demo5 {
    public static void main(String[] args) {
        
        int firstNum= 978;
        int secondNum=  3;
        int thirdNum = 16;
        int fourthNum= 1484100;
        String firstColour="\033[031m";
        String secondColour="\033[032m";
        String thirdColour = "\033[033m";
        String fourthColour="\033[034m";
        String colourEnd ="\033[030m";


        System.out.printf("%s%03d%s-%s%d%3$s-%s%d%3$s-%s%d%3$s",firstColour,firstNum,colourEnd,secondColour,secondNum,thirdColour,thirdNum,fourthColour,fourthNum);



         
    }
    
}
