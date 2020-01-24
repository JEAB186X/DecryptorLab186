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
		int temp;
		int mult;
		for(int i = 0; i < toDecrypt.length; i++){
			temp = toDecrypt[i];
			toDecrypt[i] = 0;
			mult = 1;
			while (temp > 0) {
				toDecrypt[i] += (temp % 10) * mult;
				temp /= 10;
				mult *= 2;
			}
		}  
    }
	
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
        for(int i = 0; i < toDecrypt.length; i++){
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
