// Time Complexity : O(n)
// Space Complexity : O(n) // due to string builder
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< s.length(); i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(int i=0; i< order.length(); i++){
            char c = order.charAt(i);
            if(map.containsKey(c)){
                int cnt = map.get(c);
                for(int j=0; j<cnt; j++){
                    sb.append(c);
                }
                map.remove(c);
            }
        }
        for(char c: map.keySet()){
            int cnt = map.get(c);
            for(int j=0; j< cnt; j++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}