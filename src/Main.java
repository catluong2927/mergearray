import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2,n3,j,k;
        System.out.println("nhập số lượng phần tử mảng 1");
        n1 = sc.nextInt();
        int [] arr1 = new int [n1];
        for(int i=0;i<n1;i++){
            System.out.println("nhập giá trị phần tử thứ "+(i+1)+":");
            arr1[i] = sc.nextInt();
        }
        System.out.println("nhập số lượng phần tử mảng 2");
        n2 = sc.nextInt();
        int [] arr2 = new int [n2];
        for(int i=0;i<n2;i++){
            System.out.println("nhập giá trị phần tử thứ "+(i+1)+":");
            arr2[i] = sc.nextInt();
        }
        n3 = n1+n2;
        int [] arr3 = new int [n3];
        for(int i = j = k = 0;i<arr3.length;i++){
            if(i<=arr1.length -1) {
                arr3[i] = arr1[j];
                j++;
            }else {
                arr3[i] = arr2[k];
                k++;
            }
        }
        System.out.println("phần tử mảng 3: ");
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
    }
}