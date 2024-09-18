class Solution {
    public void rotate(int[] num, int k) {
        int n=num.length;
        k=k%n;
        reverse(num,0,n-1);
        reverse(num,0,k-1);
        reverse(num,k,n-1);
    }
    static void reverse(int[] num,int start,int end){
        while(start<end){
           int temp = num[start];
           num[start] = num[end];
           num[end] = temp;
           start++;
           end--;
        }
    }
}
    // int temp=0;
		// int j=1;
		// for(int i=0;i<num.length-k;i++) {
		// 	if(i+1<k) {
		// 		temp=num[i];
		// 		num[i]=num[k-i];
		// 		num[k-i]=temp;
		// 	}else if(i>=k ) {
		// 		temp = num[i+1];
		// 		num[i+1]= num[num.length-j];
		// 		num[num.length-j]=temp;
		// 		j++;
		// 	}
		// }
		// for(int i=0;i<num.length/2;i++) {
		// 	temp = num[i];
		// 	num[i] = num[num.length-i-1];
		// 	num[num.length-i-1] = temp;
		// }
		// System.out.println(Arrays.toString(num));
