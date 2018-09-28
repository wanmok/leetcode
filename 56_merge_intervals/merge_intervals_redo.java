/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    // @COMPANY Facebook
    // @KEYWORD Array, Sort
    // @NOTE How to sort a List? When to merge?
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() == 0) return new ArrayList<>();
        
        intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
        
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        List<Interval> result = new LinkedList<>();
        
        for (Interval i : intervals) {
            if (i.start <= end) {
                end = Math.max(i.end, end);
            } else {
                result.add(new Interval(start, end));
                start = i.start;
                end = i.end;
            }
        }
        
        result.add(new Interval(start, end));
        
        return result;
    }
}