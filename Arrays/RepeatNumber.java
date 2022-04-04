package Arrays;

public class RepeatNumber {

    static boolean isFind(int[] duplicate, int value) {
        for (int i = 0; i < duplicate.length; i++) {
            if (duplicate[i] == value) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Bir sayı dizisindeki tekrar eden çift sayıları berlirten program

        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 2, 1};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i != j && list[i] % 2 == 0 && list[i] == list[j]) {
                    if (isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for (int i : duplicate) {
            if (!(i == 0)) {
                System.out.print(i + " ");
            }
        }

    }
}
