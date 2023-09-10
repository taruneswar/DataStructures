import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static int binary(int a[],int l,int r,int x){
        if(l<=r){
        int mid=(l+r)/2;
        if(a[mid]==x){
            return mid;
        }
        if(a[mid]>x){
           return binary(a,l,mid-1,x);
        }

        return binary(a,mid+1,r,x);

        }return -1;


    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int k=2;
        System.out.println(binary(a,0,a.length-1,k));


    }



    }