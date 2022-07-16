import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CountedCompleter;

public class timeAndAgain {
    public static void main(String[] args) {

        int[]list={10, 20, 20, 10, 10, 20, 5, 20};
        int[] equal = new int[list.length];

        int again=0;
        int on = 0;
        int yirmi = 0;

        for(int i = 0; i< list.length; i++){
            for (int j=0; j<list.length; j++){
                if((i !=j ) && (list[i] == list[j])){
                    equal[again++] = list[i];
                    break;
                }
            }
        }

        for (int m = 0; m< equal.length; m ++){
            if (equal[m] == 10){
                on++;
            } else if (equal[m] == 20){
                yirmi++;
            }
        }
        Arrays.sort(equal);
        System.out.println(Arrays.toString(equal));
        System.out.println(on + "\t: adet 10");
        System.out.println(yirmi + "\t: adet 20");

    }
}
