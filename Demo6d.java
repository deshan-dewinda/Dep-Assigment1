public class Demo6d {
    public static void main(String[] args) {
        
        String firstLine="-".repeat(10)+"+";
        String secondLine="-".repeat(7)+"+";
        String colour_1="\033[30;1m";
        String colour_2="\033[30;0m";

        double appleQty=5;
        double orangeQty=10;

        double applePrice = 0.99;
        double orangePrice =1.49;


        String colour_Qut="\033[034m";
        String colour_End="\033[030;0m";
        String colour_Price="\033[035;1m";
        String colour$ ="\033[032m";


        System.out.printf("+%s%1$s%2$s\n",firstLine,secondLine);
        System.out.printf("|%s%-10s%s|%1$2s%4$-10s%3$s|%1$2s%5$-7s%3$s|\n",colour_1,"ITEM",colour_2,"QUANTITY","PRICE");
        System.out.printf("+%s%1$s%2$s\n",firstLine,secondLine);
        System.out.printf("|%-10s|%s%10.0f%s|%s%2s%s%-5.2f%s|\n","Apple",colour_Qut,appleQty,colour_End,colour$,"$",colour_Price,applePrice,colour_End);
        System.out.printf("|%-10s|%s%10.0f%s|%s%2s%s%-5.2f%s|\n","Orange",colour_Qut,orangeQty,colour_End,colour$,"$",colour_Price,orangePrice,colour_End);
        System.out.printf("+%s%1$s%2$s\n",firstLine,secondLine);
    }
    
}
