package lang.print.gaps.task6;

public class FloatTypeCasting {
    public static void roundNumber(float numberToBeRounded) {
        numberToBeRounded = (float) (numberToBeRounded + 0.5);
        System.out.println((int) numberToBeRounded);
    }

    public static void main(String[] args) {
        roundNumber(30.5F);
    }
}
