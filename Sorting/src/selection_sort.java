import java.util.*;

public class selection_sort {
    public static void main(String[] args) {
        int a[]={5,2,1,7,8};
        for(int i=0;i<a.length-1;i++){
            int min_element=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min_element]){
                    min_element=j;
                }
            }
            int temp=a[min_element];
            a[min_element]=a[i];
            a[i]=temp;
        }
        for(int num:a){
            System.out.println(num);
        }
    }
}
