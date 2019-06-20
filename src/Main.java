public class Main {

    public static void main(String[] args) {
        System.out.println("Inches\tMillimeters");
        for (int i = 1; i <= 15; i++) {
            System.out.println(i + " ->\t" + String.format("%.1f", inchToMilli(i)));
        }

        System.out.println("\nInches\tMillimeters");
        int i = 1;
        while (i <= 15) {
            System.out.println(i + " ->\t" + String.format("%.1f", inchToMilli(i)));
            i++;
        }

        System.out.println("\nInches\tMillimeters");
        i = 1;
        do {
            System.out.println(i + " ->\t" + String.format("%.1f", inchToMilli(i)));
            i++;
        } while (i <= 15);
    }

    private static float inchToMilli(int inches) {
        return inches * 25.40f;
    }
}
