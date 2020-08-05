import java.util.Random;

public class RandomHelper {
    public static int nextInt(int min, int max) {
        Random random = new Random();
        return min + random.nextInt(max - min + 1);
    }
}
