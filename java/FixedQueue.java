class FixedQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    public FixedQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    public void put(char ch) throws QueueFullException {
        if(putloc==q.length) throw new QueueFullException(q.length);
    }
}



public class FixedQueue {
    
}
