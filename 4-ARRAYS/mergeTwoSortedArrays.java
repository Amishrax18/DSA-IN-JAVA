import java.util.*;

public class mergeTwoSortedArrays {

    public static void main(String[] args) {
        int a[] = {2,4,5,6,8};
        int b[] = {1,3,7,9,11,18};
        int c[] = new int[a.length + b.length];

        merge(a, b, c);

        for(int ele : c){
            System.out.print(ele + " ");
        }
    }

    public static void merge(int a[], int b[], int c[]){
        int i = 0, j = 0, k = 0;

        while(i < a.length && j < b.length){
            if(a[i] <= b[j]){
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }

        while(i < a.length){
            c[k] = a[i];
            i++;
            k++;
        }

        while(j < b.length){
            c[k] = b[j];
            j++;
            k++;
        }
    }
}