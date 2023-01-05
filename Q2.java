import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        System.out.println(Arrays.toString(a));
        copy(a);
        System.out.println(Arrays.toString(a));
    }
    //نسخ عناصر المصفوفة
    public static int[] copy(int a[]) {
        int b[]=new int[6];
        for (int i=0;i<a.length-1;i++)
            b[i] =a[i];
        return b;
    }
}
