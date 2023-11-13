import java.util.Random;

public class MohTabahMaulana {
    public static void main(String[] args) {
        int a = 25;
        int b = 2;

        for (int km =2 ; km <= a; km += b) {
            int primaRandom = generateRandomPrime();
            System.out.println("CheckPoint " + km + " km: " + primaRandom);
        }
    }

    private static int generateRandomPrime() {
        Random random = new Random();
        int randomNum;
        do {
            randomNum = random.nextInt(100) + 1; // Misalnya, batas atas 100
        } while (!prima(randomNum));
        return randomNum;
    }

    private static boolean prima(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}