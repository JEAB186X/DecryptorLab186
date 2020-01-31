import java.util.Arrays;
import java.util.HashMap;

/**I am currently doing this to get used to using the git terminal.
 * 
 * You can put you're name here if you want, apparently.
 * 
 * @author Arvid Gustafson : arvidg@iastate.edu
 */

public class Decryptor {
	
    public static void main(String[] args) {
        int[] toDecrypt = {
                101001, 1001101, 1010011, 11010, 10, 10000000, 1001100, 1101011, 11,
                11010, 1001000, 110101, 1001100, 1111111, 11100, 10101, 10, 10000000,
                1001100, 1101011, 1011101, 1, 1100, 1011101, 11010, 111, 111010
        };

        convertBinaryArrayToDecimalArray(toDecrypt);
        System.out.println(Arrays.toString(toDecrypt)); // As a check, the first value will be 41 and the last is 58.

        shiftArrayValues(toDecrypt);
        System.out.println(Arrays.toString(toDecrypt)); // As a check, the first value will be 40 and the last is 55.

        divideArrayValues(toDecrypt);
        System.out.println(Arrays.toString(toDecrypt)); // As a check, the first value will be 8 and the last is 11.

        System.out.println(A1Z26Cypher(toDecrypt));     // As a check, the first word in this String is "hope".
    }


    /**
     * STEP 1: COMPLETE THIS METHOD. ONCE COMPLETED, HAVE THE TEAM MEMBER
     *         WHO COMPLETED THIS MAKE AND PUSH THE COMMIT TO GITHUB.
     *
     * Given an array of binary representations of numbers,
     * converts each value into its decimal representation.
     *
     * HINT: This can be done in two lines of code.
     *
     * @param toDecrypt - The array to be decoded.
     */
    public static void convertBinaryArrayToDecimalArray(int[] toDecrypt) {
<<<<<<< HEAD
        // TODO
        for(int i = 0; i < toDecrypt.length; i++){ 
        	String temp = Integer.toString(toDecrypt[i]); //converts int values to strings 
          	toDecrypt[i] = Integer.parseInt(temp, 2); //parse the string to value of 2 for changing binary to decimal.
		}  
    }


	/**
     * STEP 2: COMPLETE THIS METHOD. ONCE COMPLETED, HAVE THE TEAM MEMBER
     *         WHO COMPLETED THIS MAKE AND PUSH THE COMMIT TO GITHUB.
     *
     * Given an array of decimal ints, perform the following:
     *      If the array index mod 3 == 0, modify its value to be itself - 1.
     *      Else if the array index mod 3 == 1, modify its value to be itself - 2.
     *      Otherwise, modify its value to be itself - 3.
     *
     * HINT: This CAN be done in two lines of logic. Realistically though,
     *       it's easier to read and expectation is about seven lines of code.
     *
     * @param toDecrypt - The array to be decoded.
     */
    public static void shiftArrayValues(int[] toDecrypt) {
		for (int i = 0; i < toDecrypt.length; i++) {
			if (i % 3 == 0) {
				toDecrypt[i] -= 1;
			}
			else if (i % 3 == 1) {
				toDecrypt[i] -= 2;
			}
			else {
				toDecrypt[i] -= 3;
			}
		}
    }
	
    public static void divideArrayValues(int[] toDecrypt) {
        for(int i = 0; i < sizeof(toDecrypt); i++){
        	toDecrypt[i] = toDecrypt[i]/5; 
        }
    }
	
    public static String A1Z26Cypher(int[] toDecrypt) {
		String text = "";
		for (int i = 0; i < toDecrypt.length; i++) {
			if (toDecrypt[i] == 0) {
				text = text + ' ';
			}
			else {
				text = text + (char) (toDecrypt[i] - 1 + 'a');
			}
		}
		
        return text;
    }
}
