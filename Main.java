public class Main {
    public static void main(String[] args) {
        boolean isMGKInSantaRosa = true;
        if(isMGKInSantaRosa){
            System.out.println("MGK is not living in Los Angeles, anymore");
            System.out.println("MGK moved to the northern California.");
        }
        
        double sampleDouble = 20.00;
        double sampleDouble1 = 80.00;
        double sumSampleDoubles = (sampleDouble1 + sampleDouble) * 100.00;
        double sampleRemainder = sumSampleDoubles % 40.00;
        boolean sampleBoolean = sampleRemainder == 0 ? true : false;
        System.out.println(sampleBoolean);
        if(!sampleBoolean){
            System.out.println("Got some remainder");
        }

    }
}