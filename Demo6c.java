public class Demo6c {
    public static void main(String[] args) {
        
        String city_1 = "Los Angeles";
        String city_2="New York";

        String state_1="California";
        String state_2="New York";

        float population_1= 3966936;
        float population_2= 8336817;

        String firstLine = "-".repeat(17)+"+";
        String secondLine ="-".repeat(13)+"+";

        String colour_1 = "\033[030;1m";
        String colour_2 = "\033[030;0m";
        String colour_3="\033[035m";
        String colourNew="\033[034m";
        String newYork =String.format("%s%s%s%s%-13s",colourNew,"New",colour_2," ","York");
        String newYork_2 =String.format("%s%s%s%s%-9s",colourNew,"New",colour_2," ","York");



        System.out.printf("+%s%s%2$s\n",firstLine,secondLine);
        System.out.printf("|%s%-17s%5$s|%1$s%-13s%5$s|%1$s%-13s%5$s|\n",colour_1,"CITY","STATE","POPULATION",colour_2);
        System.out.printf("+%s%s%2$s\n",firstLine,secondLine);
        System.out.printf("|%-17s|%-13s|%8s%,-11.0f%s|\n",city_1,state_1,colour_3,population_1,colour_2);
        
       
        System.out.printf("|%s|%s|%8s%,-11.0f%s|\n",newYork,newYork_2,colour_3,population_2,colour_2);
        System.out.printf("+%s%s%2$s\n",firstLine,secondLine);
    }
    
}
