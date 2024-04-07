public class ArrayUtil {
    public static String [] initArray(){
        System.out.printf("Input the size of Array-> ");
        int size = Inputs.InputInt();
        System.out.println();
        String [] array = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Input %s element of array -> ", i+1);
            array[i] = Inputs.InputString();
        }
        return array;
    }
    private static int findSize(String [] arr){
        int newSize = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() <= 3 ){newSize++;}
        }
        return newSize;
    }
    public static String [] ThreeOrLessArray(String[] arr){
        String [] newArray = new String[findSize(arr)];
        int i = 0;
        int j = 0;
        while ( i < newArray.length) {
            if (arr[j].length() <= 3 ){
                newArray[i] = arr[j];
                i++;
                j++;
            }else j++;
        }
        return newArray;
    }

    public static void printStringArray(String [] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i < array.length-1 ) {
                System.out.printf("%s, ", array[i]);
            }
            else {
                System.out.printf("%s", array[i]);
            }
        }
        System.out.print("]");
    }

}
