
class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i : nums){
            list.add(i);
        }

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            int num = it.next();

            if(num == val){
                it.remove();
            }
        }
        for(int i = 0; i < list.size(); i++){
            nums[i] = list.get(i);
        }
        return list.size();
    }
}