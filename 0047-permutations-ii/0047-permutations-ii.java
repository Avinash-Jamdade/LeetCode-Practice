public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        boolean[] checked = new boolean[nums.length];
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        solve(nums, checked, list, res);
        return res;
    }

    public void solve(int[] nums, boolean[] checked, List<Integer> ds, List<List<Integer>> res){
        if(ds.size()==nums.length){
            res.add(new ArrayList<Integer>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(checked[i]) continue;
            if(i>0 && nums[i-1]==nums[i] && !checked[i-1] ) continue;
            checked[i]=true;
            ds.add(nums[i]);
            solve(nums,checked,ds,res);
            checked[i]=false;
            ds.remove(ds.size()-1);
        }
    }
}