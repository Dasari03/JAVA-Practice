public class ExpressionsStatementsCodeblocksMethods {
    public static void main(String[] args){
        introduction("Kevin", 35);
        introduction("Min Kim", 35);
        System.out.println("*****************************");
        String intro = introduction1("Mingyun Kim");
        System.out.println(intro);

        System.out.println("*****************************");

        int result = calculateHighScorePosition(700);
        System.out.println(result);
        displayHighScorePosition("MGK", result);
    }

    public static void introduction(String name, int age){
        System.out.println("My name is " + name + " and I am " + age + " year-old.");
    }

    public static String introduction1(String name){
        return "Your name is " + name;
    }

    public static void displayHighScorePosition(String name, int score){
        System.out.println(name + "managed to get into position " + score + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score){
        if(score >= 1000) {
            return 1;
        }

        else if(score >= 500 && score < 1000) {
            return 2;
        }

        else if(score >= 100 && score < 500) {
            return 3;
        }

        else {
            return 4;
        }

    }


}
