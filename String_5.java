/*Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Returns

boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false. */

import java.util.Scanner;

public class String_5 {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();
        char Aarray[] = a.toCharArray();
        char Barray[] = b.toCharArray();
        for(int i=0;i<Aarray.length;i++){
            for(int j=0;j<Aarray.length;j++){
                if(Aarray[i]>Aarray[j]){
                    char temp = Aarray[i];
                    Aarray[i] = Aarray[j];
                    Aarray[j] = temp;
                } 
            }
        }
        for(int i=0;i<Barray.length;i++){
            for(int j=0;j<Barray.length;j++){
                if(Barray[i]>Barray[j]){
                    char temp = Barray[i];
                    Barray[i] = Barray[j];
                    Barray[j] = temp;
                } 
            }
        }
        String as = new String(Aarray);
        String bs = new String(Barray);
        if(as.compareTo(bs)==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}