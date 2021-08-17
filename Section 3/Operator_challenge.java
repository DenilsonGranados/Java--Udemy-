public class Operator_challenge {
    public static void main(String[] args){
        double nValue= 20.00;
        double nVal2=80.00;
        double nFirst= (nVal2+nValue) *100;
        double nRemainder= nFirst%40.0;
        boolean nBool= (nRemainder==0) ? true: false;
        System.out.println(nBool);
        if (!nBool){
            System.out.println("Got some remainder");
        }
    }
}
