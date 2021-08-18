public class Overloading {
    public static void main(String[] args){
        System.out.println(calcFeetAndInchesToCentimeters(5,6));
    }
    public static double calcFeetAndInchesToCentimeters(double num1, double num2){
        if (num1<0){
            return -1;
        }else if (num2<0 || num2>12){
            return -1;
        }else {
            double ftTocenti= num1* 30.48;
            double inTocenti= num2 * 2.54;
            double finalcenti= ftTocenti + inTocenti;
            return finalcenti;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double num1){
        if (num1<0){
            return -1;
        }else{
            double numft= (int)num1/12;
            double numin= num1%12;
            return calcFeetAndInchesToCentimeters(numft, numin);
        }
    }    
}
