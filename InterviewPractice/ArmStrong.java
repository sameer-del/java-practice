package InterviewPractice;

public class ArmStrong {
    public static void main(String[] args) {
        int num = 53;
        if (isArm(num)) {
            System.out.println("armstrong number");
        } else {
            System.out.println("not a armstrong number");
        }
    }

    public static boolean isArm(int num) {
        int original = num;
        int len = 0;
        double result = 0;
        while (num > 0) {
            num = num / 10;
            len++;
        }
        num = original;

        while (num > 0) {
            int temp = num % 10;
            result = result + Math.pow(temp, len);
            num = num / 10;
        }
        return original == result;

    }
}
