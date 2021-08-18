public class SecandMin {
    public static void main(String[] args){
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        
    }
    public static String getDurationString(int min, int sec){
        if (min<0 || (sec<0 || sec>59)){
            return "Invalid Value";
        }else {
            int hours= min/60;
            int remainMin= min%60;
            String result= hours+"h "+ remainMin+"m "+sec+"s";
            return result;
        }
    }
    public static String getDurationString(int sec){
        if (sec<0){
            return "Invalid Value";
        }else {
            int min= sec/60;
            int remainSec= sec%60;
            return getDurationString(min, remainSec);
        }
     }
}
