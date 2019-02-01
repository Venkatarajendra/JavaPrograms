package package1;

public class NonRepeated {

	public static void main(String[] args) {
		
		int[] arr = {1,3,2,3,2,1,5,6};
		int len = arr.length;
		int flag=0, count=0;
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if (i!=j) {
					if(arr[i]!=arr[j]) {
						flag = 1;					
					}
					else {
						flag=0;
						break;
					}
				}				
				
			}
			
			if (flag==1) {
				count = count+1;
				System.out.println("Non Repeated elements are: "+arr[i]+" ");
				
			}
			
		}

	}

}
