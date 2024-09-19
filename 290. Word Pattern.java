class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] arr = s.split(" ");
        if(pattern.length() != arr.length) return false;
        for(int i=0;i<arr.length;i++){
            char c = pattern.charAt(i);
            if(!map.containsKey(c)){
                if(map.containsValue(arr[i])){
                    return false;
                }
                map.put(c,arr[i]);
            }else if(!map.get(c).equals(arr[i])){
                return false;
            }
        }
        return true;
    }
}
