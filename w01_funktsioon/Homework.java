import javax.sound.sampled.SourceDataLine;

public class Homework {
    public static void main(String[] args){
        for (int i=1;i<=9; i++){
            for (int j=1;j<=9;j++){
                System.out.printf("%-2d * %-2d = %-3d |", j,i,(i*j));
            }
            System.out.println();
        }
    }
}