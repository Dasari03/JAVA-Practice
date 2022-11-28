public class DiagonalStar {
    public static void main(String[] args) {
    printSquareStar(4);


    }
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        }
        if (number >= 5) {
            for (int row = number; row > 0; row--) {
                //In the first ot last row
                if (row == number || row == 1) {
                    for (int j = 1; j <= number; j++) {
                        System.out.print("*");
                    }
                }

                //In the first or last column
                if (row > 1 && row < number) {
                    for (int k = 1; k <= number; k++) {
                        if (k == 1 || k == number)
                            System.out.print("*");
                        //When the row number equals the column number
                        if (k == row) {
                            System.out.print("*");

                        }
                        //When the k equals rowCount - row + 1
                        if (k == number - row + 1) {
                            System.out.print("*");

                        } else
                            System.out.print(" ");
                    }
                }

                //When the k equals rowCount - row + 1

                System.out.println();
            }


        }
    }
        }


