class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> hs = new HashSet<>();
		for (int i = 0; i < emails.length; i++) {
			String st = emails[i];
			int at = st.indexOf("@");
			String et = st.substring(0, at);
			if (et.contains(".")) {
				et = et.replace(".", "");
			}
			if (et.contains("+")) {
				String n = et.substring(et.indexOf("+"));
				et = et.replace(n, "");
			}
			et = et + st.substring(at);
			hs.add(et);
		}
		return hs.size();
    }
}
