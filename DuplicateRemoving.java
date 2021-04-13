
public class DuplicateRemoving {
	public static int removeDuplicateElement(int arr[],int n) {
		if(n==0||n==1)
		return n;
	}
	int[] temp = new int[n];
	int j= 0;
	for(int i=0;i<n;i++)
		if(arr[i]!=arr[i+1]) {
			temp[j++]=arr[i];
					
		}
	}
	temp[j++]=arr[n-1];
	for (int i=0;i<j;j++) {
		arr[i]=temp[i];
	}
	return j;
	}
public static void main(String[] args) {
	int arr[]= {10,20,20,20,30,30,30,40,40,50,50,50};
	int lenght = arr.length;
	length = removeDuplicateElement(arr,Length);
	for (int i=0;i<length;i++)
		System.out.println(arr[i]+"");
}