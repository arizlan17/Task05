package Task02.Utils;

import java.util.Random;

public class UniqueNumber {

    public static int generateAccountNumber(int min, int max){
        Random random = new Random();
        return random.nextInt((max - min )+min);
    }
}
