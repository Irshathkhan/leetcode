class Solution {
    public int mostFrequentEven(int[] arr) {
       Arrays.sort(arr);
		int max = 0;
		int val = Integer.MAX_VALUE;
		int count = 0;
		boolean[] flag = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 2 == 0 && flag[i]==false) {
					count = 0;
					for (int j = 0; j < arr.length; j++) {
						if (arr[i] == arr[j]) {
							count++;
							flag[j] = true;
						}
					}
					if (count >max) {
						max = count;
						val=arr[i];
					}
				
			}
		}
		if (count != 0) {
			return val;
		} else {
			return -1;
		}
    }
}
