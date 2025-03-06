class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> qr=new LinkedList<>();
        Queue<Integer> qd=new LinkedList<>();
        int n=senate.length();
        for(int i=0;i<n;i++){
            if(senate.charAt(i)=='R'){
              qr.add(i);
            }else {
                qd.add(i);
            }
        }
        while(!qr.isEmpty() && !qd.isEmpty()){
            int r_id=qr.poll();
            int d_id=qd.poll();
            if(r_id<d_id){
                qr.add(r_id+n);
            }else{
                qd.add(d_id+n);
            }
        }
    return (qr.size()>qd.size())? "Radiant" : "Dire";   
    }
}