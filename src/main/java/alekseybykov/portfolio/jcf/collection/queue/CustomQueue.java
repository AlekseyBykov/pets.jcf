//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.jcf.collection.queue;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-10-10
 */
public class CustomQueue {

    private int initialCapacity;
    private long[] queue;
    private int frontFlag;
    private int rearFlag;
    private int counter;

    public CustomQueue(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        this.queue = new long[initialCapacity];
        this.frontFlag = 0;
        this.rearFlag = -1;
        this.counter = 0;
    }

    public boolean isEmpty() {
        return counter == 0;
    }

    public void add(long item) {
        if (rearFlag == initialCapacity - 1) {
            rearFlag = -1;
        }

        queue[++rearFlag] = item;
        counter++;
    }

    public long poll() {
        long item = queue[frontFlag++];

        if (frontFlag == initialCapacity) {
            frontFlag = 0;
        }

        counter--;
        return item;
    }
}
