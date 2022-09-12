public class LastDigitChecker {
    public static boolean hasSameLastDigit (int x, int y, int z) {
        // Edge Cases
        if (x < 10 || x > 1000 || y < 10 || y > 1000 || z < 10 || z > 1000) {
            return false;
        }

        // Variable Declaration
        int lastDigitx = numberDegenerator(x);
        int lastDigity = numberDegenerator(y);
        int lastDigitz = numberDegenerator(z);

        return lastDigitx == lastDigity || lastDigitx == lastDigitz || lastDigity == lastDigitz;
    }

    private static int numberDegenerator(int number) {
        while (number > 9) {
            number = number % 10;
        }
        return number;
    }
}