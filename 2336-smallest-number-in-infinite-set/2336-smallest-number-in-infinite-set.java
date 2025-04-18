class SmallestInfiniteSet {
    int currSmall=0;
    Set<Integer> set;
    public SmallestInfiniteSet() {
        currSmall=1;
        set= new HashSet<>();
    }
    
    public int popSmallest() {
      if(!set.isEmpty()){
        int min= Collections.min(set);
        set.remove(min);
       return min; 
      }else{
        currSmall++;
       return currSmall-1; 
      }  
    }
    
    public void addBack(int num) {
        if(currSmall>num) set.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */