// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {
    private Integer buffer;
    private Iterator<Integer> itr;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.itr = iterator;
        if (itr.hasNext())
            buffer = itr.next();
        else
            buffer = null;
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return this.buffer;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer temp = this.buffer;
        if (itr.hasNext())
            this.buffer = itr.next();
        else
            this.buffer = null;
        return temp;
	}

	@Override
	public boolean hasNext() {
	    if (buffer == null)
            return false;
        else
            return true;
	}
}