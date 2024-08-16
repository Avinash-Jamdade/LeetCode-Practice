class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String>time=new ArrayList<String>();
        
        for(int hour=0;hour<12;hour++){
            for(int minutes=0;minutes<60;minutes++){
                if(Integer.bitCount(hour)+Integer.bitCount(minutes)==turnedOn){
                    if(minutes<10){
                        time.add(String.format("%d:0%d",hour,minutes));
                    }
                    else{
                        time.add(String.format("%d:%d",hour,minutes));
                    }
                }
            }
        }
        return time;
        
    }
}