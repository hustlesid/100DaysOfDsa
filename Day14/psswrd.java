package Day14;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */

    public static int minimumNumber(int n, String password) {
    // Return the minimum number of characters to make the password strong
        // String numbers = "0123456789";
        // String lower_case = "abcdefghijklmnopqrstuvwxyz";
        // String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // String special_characters = "!@#$%^&*()-+";
        int upper =0;
        int lower=0;
        int special=0;
        int number=0;
        int counter=0;
        for(int i =0;i<password.length();i++){
            if(password.charAt(i)>=65 && password.charAt(i)<=90){
                upper++;
            }else if(password.charAt(i)>=97 && password.charAt(i)<=122){
                lower++;
            }else if(password.charAt(i)>=48&&password.charAt(i)<=57){
                number++;
            }else{
                special++;
            }
            if(upper==0){
                counter++;
            }
            if(lower==0){
                counter++;
            }if(special==0){
                counter++;
            }if((password.length()+counter)<6){
                return 6-(password.length());
            }else{
                return counter;
            }
        }
        
    }

}

 class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = Result.minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

