package functions;

public class permutation {
    public static void main(String[] args) {
        // new-way to initialise
        int[] arr = new int[]{1, 2, 3};
        perm(0, arr.length - 1, arr);
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void disp(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    static void perm(int l, int r, int[] arr) {
        if (l == r) {
            disp(arr);
            return;
        }
        for (int i = l; i <= r; i++) {
            System.out.println("i = " + i);
            System.out.println("l = " + l + " r = " + r);
            swap(arr, l, i);
            perm(l + 1, r, arr);
            //backtrack
            swap(arr, l, i);
        }
    }
}
