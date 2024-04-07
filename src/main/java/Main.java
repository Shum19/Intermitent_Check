public class Main {
    public static void main(String[] args) {

        String [] initArray = ArrayUtil.initArray();
        ArrayUtil.printStringArray(initArray);
        System.out.println("\n" + "-".repeat(100));
        ArrayUtil.printStringArray(ArrayUtil.ThreeOrLessArray(initArray));
    }
}
