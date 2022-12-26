class Queue {
    private char q[]; // made private
    private int putloc, getloc; // made private

    Queue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }
    
    void put(char ch) {
        if(putloc==q.length); {
            System.out.println(" - Queue is full.");
            return;
        }
        ch = q[putloc++];
    }

    char get() {
        if(getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }
}




public class Queue {
    
}
