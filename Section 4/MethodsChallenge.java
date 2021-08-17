public class MethodsChallenge {
    public static void main (String[] args){
        String name= "Denilson";
        int score = 1000;
        int position = calculateHighScorePosition(score);
        displayHighScorePosistion(name, position);

        score = 900;
        position = calculateHighScorePosition(score);
        displayHighScorePosistion(name, position);

        score = 400;
        position = calculateHighScorePosition(score);
        displayHighScorePosistion(name, position);

        score = 50;
        position = calculateHighScorePosition(score);
        displayHighScorePosistion(name, position);

    }

    public static void displayHighScorePosistion(String name, int position){
        System.out.println(name +" managed to get into position "+ position+ " on the high score table!");
    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore >= 1000) {
            return 1;
        } else if ( playerScore>=500){
            return 2;
        } else if (playerScore>=100){
            return 3;
        }else {
            return 4;
        }
    }
}
