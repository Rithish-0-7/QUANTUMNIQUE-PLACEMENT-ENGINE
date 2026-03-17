import java.util.*;
public class secondLargest {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int max1 = 0;
        int max2 = 0;
        int arr[]=new int[n];
        for (int i = 0; i<n ; i++) {
            arr[i]= sc.nextInt();
        }
        if(arr[0]>arr[1]){
            max1=arr[0];
            max2=arr[1];
        }
        else if (arr[1]>arr[0]){
            max1=arr[1];
            max2=arr[0];
        }
        for(int i=2;i<n;i++){
            if(max1<arr[i]){
                max2=max1;
                max1=arr[i];
            }
            else if(max2<arr[i]){
                max2=arr[i];
            }
        }
        System.out.println(max2);
    }
}
