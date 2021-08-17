public class float_and_double {

    public static void main(String[] args) {
        float myMinFloatValue =Float.MIN_VALUE;
        float myMaxFloatValue =Float.MAX_VALUE;
        System.out.println("Float minimum value = " +myMinFloatValue); 
        System.out.println("Float maxium value = " +myMaxFloatValue);

        double myMindoubleValue =Double.MIN_VALUE;
        double myMaxdoubleValue =Double.MAX_VALUE;
        System.out.println("double minimum value = " +myMindoubleValue); 
        System.out.println("double maxium value = " +myMaxdoubleValue); 

        int myIntValue= 5;
        float myFloatValue= (float) 5.25 ; // could also be written as 5f
        double myDoubleValue=5; // could also be written as 5d
        System.out.println("MyIntValue "+ myIntValue);
        System.out.println("MyFloatValue "+ myFloatValue);
        System.out.println("MyDoubleValue "+ myDoubleValue);
        

    }
}