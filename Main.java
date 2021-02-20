package package01;

public class Main {

    /* задание 1
     */
    private static float calculate(int a, int b, int c, int d) {
        return a * (b + (c * 1.0f / d));
    }

    private static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    /* задание 2
     */
    private static boolean checkTwoNumbers(int first, int second) {
        int sum = first + second;
        return sum <= 20 && sum >= 10;
    }

    /* задание 3
     */
    private static boolean isPositive(int variable) {
        return variable >= 0;
    }

    /* задание 4
     */
    private static String welcome(String name) {
        System.out.println("Привет, указанное_имя!");
        return "Привет, " + name + "!";
    }
}





