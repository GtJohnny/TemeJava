import java.util.Arrays;

public class Ex2 {

    public static void sorteaza(int[] arr){ // e un insertion sort
        for(int i=0;i<arr.length-1;i++) {
            int max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[max] > arr[j]) {
                    max = j;
                }
            }
            if (max > i) {
                arr[max] ^= arr[i];
                arr[i] ^= arr[max];
                arr[max] ^= arr[i];
            }
        }


    }

    public static void main(String[] args) {
        int[] arr1 = {61,66,31,51,75,21,4};
        int[] arr2 = {6,2,3,67,23,63,12,87,41,65};
        System.out.println("Array1 initial= "+Arrays.toString(arr1));
        System.out.println("Array2 initial= "+Arrays.toString(arr2));

        sorteaza(arr1);
        sorteaza(arr2);
        System.out.println("Array1 sortat = "+Arrays.toString(arr1));
        System.out.println("Array2 sortat = "+Arrays.toString(arr2));

        int i,j;
        int n,m;
        i=j=0;
        n = arr1.length;
        m = arr2.length;
        int[] arr3 = new int[n+m];
        while(i<n && j < m){
            if(arr1[i]<arr2[j]){
                arr3[i+j] = arr1[i++];
            }else{
                arr3[i+j] = arr2[j++];
            }
        }


        while(i<n){
            arr3[i+j] = arr1[i++];
        }
        while(j<m){
            arr3[i+j] = arr2[j++];

        }
        System.out.println("Output: "+Arrays.toString(arr3));
    }
}
