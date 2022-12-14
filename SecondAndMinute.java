public class SecondAndMinute {
    public static void main(String[] args) {
        String answer1 = getDurationString(122, 57);
        System.out.println(answer1);
        String answer11 = getDurationString(5899);
        System.out.println(answer11);
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes <0 || (seconds < 0 || seconds > 59)){
            return "Invalid value";
        }
         int hour = minutes / 60;
        minutes = minutes % 60;
        return hour + "h " + minutes + "m " + seconds + "s";
    }

    public static String getDurationString(int seconds){
        if(seconds < 0){
            return "Invalid value";
        }
        int minsFromSeconds = seconds / 60;
        seconds = seconds % 60;
        return getDurationString(minsFromSeconds, seconds);

    }
}
