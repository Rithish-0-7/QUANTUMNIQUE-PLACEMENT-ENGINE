import java.util.Scanner;
public class missing_Number
{
	@SuppressWarnings("resource")
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int Sum=0;
	    int res;
	    int arr[]=new int[n-1];
	    for(int i=0;i<n-1;i++){
	        arr[i]=sc.nextInt();
	        Sum+=arr[i];
	    }
	    res=n*(n+1)/2;
	    System.out.println(res-Sum);
	}
}