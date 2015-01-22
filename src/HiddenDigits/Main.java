/**
 * Hidden Digits
 *
 * Given a random string, this program will calculate its hidden digits.
 *
 * Hidden digits are calculated as follows:
 * - Each hidden digit corresponds to a lower case letter, in ascending order: 'a'=0, 'b'=1 ... 'j'=9
 * - All other letters and symbols are ignored, except for any digits included in the given string
 * - If no hidden digits are found in the given string, output a relevant message ("NONE")
 *
 * Based on this codeeval challenge:
 * https://www.codeeval.com/open_challenges/122/
 *
 * Author: todyerutz@plainintricacy.wordpress.com
 */

package HiddenDigits;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String output = "";
        char[] HArr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        System.out.println("Please enter your input:");
        String input = in.nextLine();
        in.close();
        for (int i = 0; i < input.length(); i++) {
            if(Character.isDigit(input.charAt(i))){
                output += input.charAt(i);
            }else {
                for (int j = 0; j < HArr.length; j++) {
                    if (input.charAt(i) == HArr[j]) {
                        output += j;
                    }
                }
            }
        }
        if (output.length() > 0) {
            System.out.println("Hidden digits found: " + output);
        } else {
            System.out.println("NONE");
        }
    }
}
