/*Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

Note: You may find the String.split method helpful in completing this challenge.

Input Format

A single string, .

Constraints

 is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
Output Format

On the first line, print an integer, , denoting the number of tokens in string  (they do not need to be unique). Next, print each of the  tokens on a new line in the same order as they appear in input string .

 */

import java.io.*;
import java.util.*;

public class String_6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String sl = s.trim();
        if(sl.length()==0){
            System.out.println(0);
        }
        else{
            String[] arr = sl.split("[!,?._'@ ]+");
            System.out.println(arr.length);
            for(String t:arr){
                System.out.println(t);
            }
        }
        scan.close();
    }
}

