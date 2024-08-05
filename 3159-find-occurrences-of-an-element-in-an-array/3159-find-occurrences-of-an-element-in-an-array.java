class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                list.add(i);
            }
        }
        int res[]=new int[queries.length];
        int idx=0;
        for(int q:queries){
            if(q<=list.size()){
                res[idx++]=list.get(q-1);
            }
            else{
                res[idx++]=-1;
            }
        }
        return res;
    }
}
/*
 List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                list.add(i);
            }
        }

        // storing the result
        int[] res = new int[queries.length];
        int idx = 0;
        for (int q : queries) {
            if (q <= list.size()) {
                res[idx++] = list.get(q - 1);
            } else {
                res[idx++] = -1;
            }
        }
        return res;
*/