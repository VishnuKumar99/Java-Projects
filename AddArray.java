package test_project;

public class AddArray {
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[5];
        int num = 5;
        for (int i = 0; i < 5; i++) {
            a[i] = i;
        }
        for (int i = 0; i < 5; i++) {
            b[i] = num;
            ++num;
        }
        System.out.print("values of array 'a':");
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i]+" ");

        }
        System.out.print("\nvalues of array 'b':");
        for (int i = 0; i < 5; i++) {
            System.out.print(b[i]+" ");

        }
        for (int i = 0; i < 5; i++) {
            c[i] = a[i] + b[i];
        }
        System.out.print("\nvalues of array 'c':");
        for (int i = 0; i < 5; i++) {
            System.out.print(c[i]+" ");

        }
    }
}
