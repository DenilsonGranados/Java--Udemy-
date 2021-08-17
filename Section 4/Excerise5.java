public class Excerise5 {
    public static void main(String[] args){
        System.out.println(areEqualByThreeDecimalPlaces(3.1756,3.1755));
    }
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        if ((num1<0 && num2 >0)||(num1>0 && num2<0)){
            return false;
        }else if (Math.abs((num1 *1000)- (num2*1000))<1 && Math.abs((num1 *1000)- (num2*1000))>=0){
            return true;
        }else{
            return false;
        }
    }
}
