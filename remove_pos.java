import java.util.*;

class remove_pos {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] result = new int[a.length - 1];
        int pos;
        int j = 0;
        Scanner scn = new Scanner(System.in);
        pos = scn.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (i != pos) {
                result[j] = a[i];
                j++;
            }
        }
        scn.close();
        System.out.println(Arrays.toString(result));
    }
}