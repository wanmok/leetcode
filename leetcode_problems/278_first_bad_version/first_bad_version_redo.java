/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    // @COMPANY Facebook
    // @KEYWORD Binary Search
    // @NOTE Take care of the subscription.
    public int firstBadVersion(int n) {
        int lo = 1, hi = n;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (isBadVersion(mid))
                hi = mid;
            else 
                lo = mid + 1;
        }
        
        return lo;
    }
}