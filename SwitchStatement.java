public class SwitchStatement {
    public static void main(String[] args) {

        char forTesting = 'E';

        switch (forTesting) {
            case 'A':
                System.out.println("It is " + forTesting);
                break;
            case 'B': case 'C': case 'D': case 'E':
                System.out.println("It is " + forTesting);
                break;
            default:
                System.out.println("no matching character...");
                break;
        }


    }
}

