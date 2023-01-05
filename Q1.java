//Q1:
import java.util.Arrays;

public class Q1 {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        System.out.println(Arrays.toString(a));
        reverse(a);
        System.out.println(Arrays.toString(a));
    }
    //عكس عناصر المصفوفة
    public static void reverse(int a[]) {

        int n=a.length-1;
        for (int i=0;i<a.length/2;i++)
        {
            int  temp=a[i];
            a[i]=a[n];
            a[n]=temp;
            n--;

        }
    }


}
