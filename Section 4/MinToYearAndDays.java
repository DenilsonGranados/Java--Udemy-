public class MinToYearAndDays {
    public static void main(String[] args){
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
    public static void printYearsAndDays(long mins){
        if (mins<0){
            System.out.println("Invalid Value");
        }else {
            long numYears= (mins/(60*24*365));
            long numDays= (mins/(60*24))%365;
            System.out.println(mins+" min = "+ numYears+" y and "+ numDays+" d");
        }
    }
}
