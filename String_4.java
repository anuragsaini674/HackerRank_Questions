/*A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise. */

import java.io.*;
import java.util.*;

public class String_4 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder s = new StringBuilder(A);
        s.reverse();
        String B = s.toString();
        if(A.compareTo(B)==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}



