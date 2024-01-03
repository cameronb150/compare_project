

    import java.util.Scanner;


public class LabProgram {
    public static int main(String[] args) {
            /* Type your code here. */
            Scanner scn = new Scanner(System.in);

            int valOne = scn.nextInt();

            int valTwo = scn.nextInt();

            if (valOne <= valTwo) {
                valOne += 5;
                //return valOne;


            } else if (valTwo > valOne) {
                System.out.println("Second integer can't be less than the first.\n");
            }


            return valOne;
        }
    }

