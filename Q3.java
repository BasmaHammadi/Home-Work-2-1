class Q3{
public class g{

    public static void a(int ar[], int n) {
        int i, j, temp;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (ar[j] == i) {
                    temp = ar[j];
                    ar[j] = ar[i];
                    ar[i] = temp;
                    break;
                }
            }
        }
        for (i = 0; i < n; i++) {
            if (ar[i] != i)
                ar[i] = -1;
        }
        System.out.println("Array after Rearranging");
        for (i = 0; i < n; i++)
            System.out.print(ar[i] + " ");
    }
    public static void main(String[] args)
    {
        int n, ar[] = { -1, -1, 6, 1, 9,
                3, 2, -1, 4, -1 };
        n = ar.length;
        a(ar, n);
    }
}}

