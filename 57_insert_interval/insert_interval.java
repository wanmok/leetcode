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
    // @NOTE Very similar to merge intervals.
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> result = new LinkedList<>();
        if (intervals.size() == 0) {
            result.add(newInterval);
            return result;
        } 
        
        int i = 0;
        while (i < intervals.size() && intervals.get(i).start <= newInterval.start) i ++;
        intervals.add(i, newInterval);
        
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for (Interval it : intervals) {
            if (it.start <= end) {
                end = Math.max(it.end, end);
            } else {
                result.add(new Interval(start, end));
                start = it.start;
                end = it.end;
            }
        }
        
        result.add(new Interval(start, end));
        
        return result;
    }
}