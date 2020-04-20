package Question2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        int size=x.nextInt(); // Enter size of an array
        int arr[]=new int[size];//craeting an array of size n
        for(int i=0;i<size;i++){
            int f=x.nextInt();
            arr[i]=f;//intializing array
        }
        Program2 obj =new Program2();
        obj.duplicateDisplay(arr);
    }
}
