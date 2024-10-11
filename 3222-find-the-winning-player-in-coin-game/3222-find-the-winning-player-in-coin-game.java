class Solution {
    public String losingPlayer(int x, int y) {
        boolean alice=true;
        while(x>0&&y>3){
            x--;
            y-=4;
            alice=!alice;
        }
        if(alice) return "Bob";
        return "Alice";
    }
}