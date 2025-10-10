class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b); 
            }
        });

        if (arr[0].equals("0")) return "0";

        String result = "";
        for (String s : arr) {
            result += s;
        }

        return result;
    }
}