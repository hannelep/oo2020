import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


/**
 * Division
 */
public class Division {

    public static void main(String[] args) throws IOException {
        //loen failist andmed
        File file = new File ("arvud.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        //loen failist rea, kuna tean et failis üks rida siis loen ühe rea
        String line = br.readLine();
        //failist loetud rea poolitan kohast, kus on "," ning arvud panen arraysse
        String[] lineData = line.split(",");

        br.close(); //sulgen 

        //Stringid muudan arvudeks
        int a = Integer.parseInt(lineData[0]);
        int b = Integer.parseInt(lineData[1]);

        
        Division d = new Division();
        int answer = d.divide(a, b);
        if(answer == 1234567890) {
            System.out.println("Nulliga ei saa jagada");
        } else {
            int length = String.valueOf(answer).length();
            System.out.println(a + " * " + b + " = " + answer);
            for( int i = 0; i < length; i++){
                //int value =(int)answer;
                String numberString = Integer.toString(answer);
                char letterChar = numberString.charAt(i);
                //System.out.println(letterChar);
                int theDigit = Integer.parseInt("" + letterChar);
                Multiplication m = new Multiplication();
                int answer2 = m.multiply(b, theDigit);
                //System.out.println(b + " * " + theDigit + " = " + answer2 );
                System.out.println(answer2); 
                
            }
        }

    }

    public int divide(int a, int b) {
        int divide;
        if(b == 0) {
            //kui nulliga ei jagu, tagastab selle arvu, hetkel teisiti ei oska
            divide = 1234567890;

        } else {
            divide = a/b;    
        }
        return divide;

    }

    




    


}