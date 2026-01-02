class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> fre = new HashMap<>();
        int n = nums.length / 2;
        for (int num : nums) {
            if (fre.containsKey(num)) {
                fre.put(num, fre.get(num) + 1);
            } else {
                fre.put(num, 1);
            }
        }
        for (Integer key : fre.keySet()) {
            if (fre.get(key) == n) {
                return key;
            }
        }
        return -1;

    }
}