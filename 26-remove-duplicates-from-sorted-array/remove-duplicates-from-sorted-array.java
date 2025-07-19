class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> arL = new ArrayList<>();
        if(nums.length > 0){
            arL.add(nums[0]);
        }
        for(int i = 0; i < nums.length; i++){
                if(arL.contains(nums[i]) == true){
                    continue;
                }
                else{
                    arL.add(nums[i]);
                }
        }
        for (int i = 0; i < arL.size(); i++) {
            nums[i] = arL.get(i);
        }
        return arL.size();
    }
}