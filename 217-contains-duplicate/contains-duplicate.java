class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int n : nums) {
            if (set.contains(n)) {
                return true; // duplicate mil gaya
            }
            set.add(n);
        }

        return false; // koi duplicate nahi mila
    }
}
