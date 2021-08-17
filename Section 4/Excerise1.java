public class Excerise1 {
    public static void main(String[] args){
        printConversion(95.75);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour<0){
            return (long) -1; 
        } else {
            double milesPerhour= (kilometersPerHour*(1/1.609));
            milesPerhour= Math.round(milesPerhour);
            return (long) milesPerhour;
        }

    }
    // Part 2
    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour<0){
            System.out.println("Invalid Value");
        }else{
            System.out.println(kilometersPerHour+" km/h = "+ toMilesPerHour(kilometersPerHour)+ " mi/h");
        }
    }
}
