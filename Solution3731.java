class Solution3731 {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // find min and max correctly
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }

        // check each number between min and max
        for (int num = min; num <= max; num++) {
            boolean found = false;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == num) {
                    found = true;
                    break;
                }
            }
            if (!found) list.add(num);
        }

        return list;
    }
}
