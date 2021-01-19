
class ThreeSumSolution {
    public ListListInteger threeSum(int[] nums) {
        int n= nums.length;
        int[] temp; 
        ListListInteger list = new ArrayList();
        Arrays.sort(nums);
    
        for(int i=0;inums.length-2;i++){
            int start = i+1;
            int end = nums.length-1;
            
            while(start  end){
                 if(nums[i] + nums[start] + nums[end] 0)
                    end --;
                 else if(nums[i] + nums[start] + nums[end] 0) 
                    start ++;
                 else {
                    ArrayListInteger elements = new ArrayList();
                    elements.add(nums[i]);
                    elements.add(nums[start]);
                    elements.add(nums[end]);
                    list.add(elements);
                    start ++;
                    end --;
                     
                    while(start  end && nums[start-1] ==nums[start]) start++; 
                    while(start  end && nums[end] ==nums[end+1]) end--; 
                 }   
                
            }
            
            while(i  n-2 && nums[i+1] ==nums[i]) i++;
            
            
        }
        
        return list;
        
    }
}