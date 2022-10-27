public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low=1;
        int high=n;
        int result=0;
        while(low<=high){
            int mid= low + (high-low)/2;
            if(isBadVersion(mid)==true){
               result=mid;
                high=mid-1;
            }
            else{              
                low=mid+1;
            }
        }
        return result;
    }
}