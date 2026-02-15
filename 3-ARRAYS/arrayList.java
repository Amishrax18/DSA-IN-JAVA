import java.util.*;
public class arrayList {
    public static void main(String args[]){
        //creation of array list
        ArrayList<Integer> arr =new ArrayList<>();
        //putting elements in array list
        arr.add(21);
        arr.add(23);
        arr.add(18);
        arr.add(45);
        arr.add(41);
        
        System.out.println(arr.get(2));//
       // System.out.println(arr);
        arr.set(2,7);
        System.out.println(arr);
        int n=arr.size();
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        for(int ele : arr)
        System.out.print(ele+" ");
        arr.add(78);
        System.out.println(arr);
        arr.add(2,33);
        System.out.println(arr);
        //to remove the element
        arr.remove(arr.size()-1);
        System.out.print(arr);
        int i=0,j=arr.size()-1;
        while(i<j){
            int temp=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
       // Collections.reverse(arr);
        System.out.print(arr);
    }
}