package Day14;

import java.io.*;


class Result {

   

    public static int minimumNumber(int n, String password) {

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
            
        }
        if(number == 0){
            counter++;
        }
        if(upper==0){
                counter++;
            }
        if(lower==0){
                counter++;
        }
        if(special==0){
                counter++;
            }
        if((password.length()+counter)<6){
                return 6-(password.length());
            }
        if(counter==0){
            return 0;
        }
        else{
                return counter;
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

