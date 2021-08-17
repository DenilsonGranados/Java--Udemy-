public class Methods {
    public static void main(String[] args){
        int nScore= 10000;
        int lvl= 8;
        int bonus= 200;
        boolean GameOver=true;
        calcScore(GameOver, nScore, lvl, bonus);
        }

    // public static void calcScore(boolean GameOver, int nScore, int lvl, int bonus) {
    //     if(GameOver){
    //         int Final= nScore+(lvl*bonus);
    //         Final+=1000;
    //         System.out.println("Final score is "+Final);
    //     }
    // }  
    // If we want to return data, do it this way
    public static int calcScore(boolean GameOver, int nScore, int lvl, int bonus) {
        if(GameOver){
            int Final= nScore+(lvl*bonus);
            Final+=1000;

            return Final;
        } else{
            return -1;
        }
    }  
}

