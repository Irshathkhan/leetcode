class Solution {
    public String capitalizeTitle(String title) {
        String[] arr = title.split(" ");
		String res = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > 2) {
				res += arr[i].toUpperCase().charAt(0);
				for (int j = 1; j < arr[i].length(); j++) {
					res += arr[i].toLowerCase().charAt(j);
				}
				res +=" ";
			} else {
				res += arr[i].toLowerCase()+" ";
			}
		}
		return res.trim();
    }
}
