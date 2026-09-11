import java.util.*;

class insert {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter index to insert at: ");
        int pos = scn.nextInt();
        System.out.print("Enter value to insert: ");
        int val = scn.nextInt();

        int[] b = new int[a.length + 1];
        for (int i = 0, j = 0; i < b.length; i++) {
            if (i == pos) {
                b[i] = val;
            } else {
                b[i] = a[j++];
            }
        }
        System.out.println("After insert: " + Arrays.toString(b));
        scn.close();
    }
}
