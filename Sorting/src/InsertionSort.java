import java.util.Arrays;

public class InsertionSort {


    public static void main(String[] args) {
        int a[]={12,11,13,5,6};
        for(int i=0;i<a.length-1;i++){
            while(a[i]>a[i+1]){
                int temp=a[i+1];
                a[i+1]=a[i];
                a[i]=temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
