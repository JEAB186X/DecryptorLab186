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
	
    public static void convertBinaryArrayToDecimalArray(int[] toDecrypt) {
		for(int i = 0; i < toDecrypt.length; i++){ 
			String temp = Integer.toString(toDecrypt[i]);
			toDecrypt[i] = Integer.parseInt(temp, 2);
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
        // TODO
    }


    /**
     * STEP 3: COMPLETE THIS METHOD. ONCE COMPLETED, HAVE THE TEAM MEMBER
     *         WHO COMPLETED THIS MAKE AND PUSH THE COMMIT TO GITHUB.
     *
     * Given an array of decimal ints, set the value
     * of each index to be itself divided by 5.
     *
     * HINT: This can be done in two lines of code.
     *
     * @param toDecrypt - The array to be decoded.
     */
    public static void divideArrayValues(int[] toDecrypt) {

        for(int i = 0; i < toDecrypt.length; i++){
        	toDecrypt[i] = toDecrypt[i]/5; 
        }
    }

    /**
     * STEP 4: COMPLETE THIS METHOD. ONCE COMPLETED, HAVE THE TEAM MEMBER
     *         WHO COMPLETED THIS MAKE AND PUSH THE COMMIT TO GITHUB.
     *
     * Given an array of decimal ints, using the A1Z26 Cypher, build a String
     * that correlates each decimal value to a char (Character, a-z).
     *
     * HINT: This can be done in two additional lines of code.
     *
     * @param toDecrypt - The array to be decoded.
     */
    public static String A1Z26Cypher(int[] toDecrypt) {
        HashMap<Integer, Character> cypher = new HashMap<>();
        cypher.put(0, ' ');
        cypher.put(1, 'a');
        cypher.put(2, 'b');
        cypher.put(3, 'c');
        cypher.put(4, 'd');
        cypher.put(5, 'e');
        cypher.put(6, 'f');
        cypher.put(7, 'g');
        cypher.put(8, 'h');
        cypher.put(9, 'i');
        cypher.put(10, 'j');
        cypher.put(11, 'k');
        cypher.put(12, 'l');
        cypher.put(13, 'm');
        cypher.put(14, 'n');
        cypher.put(15, 'o');
        cypher.put(16, 'p');
        cypher.put(17, 'q');
        cypher.put(18, 'r');
        cypher.put(19, 's');
        cypher.put(20, 't');
        cypher.put(21, 'u');
        cypher.put(22, 'v');
        cypher.put(23, 'w');
        cypher.put(24, 'x');
        cypher.put(25, 'y');
        cypher.put(26, 'z');

        StringBuilder solution = new StringBuilder();

        for(int i = 0; i < toDecrypt.length; i++){
            solution.append(cypher.get(toDecrypt[i]));
        }

        solution.append('!');
        return solution.toString();
    }
}
