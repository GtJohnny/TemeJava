import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ex1 {

    public static void invers(int[] arr){
        int n = arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            arr[i]^= arr[n-i];
            arr[n-i] ^= arr[i];
            arr[i]^= arr[n-i];
        }
        System.out.println("Vector-ul invers:");
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti un numar cuprins intre 0 si 5 inclusiv");
        int n=0;
        while((n = sc.nextInt())<0 && n>5){
            System.out.println("Numarul trebuie sa fie cuprins intre 0 si 5 inclusiv");
        }

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("v["+i+"]=");
            arr[i] = sc.nextInt();
        }
        invers(arr);


    }
}