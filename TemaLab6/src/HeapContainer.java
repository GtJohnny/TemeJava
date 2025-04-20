public class HeapContainer implements Container {
    int front =0;
    int back =0;
    @Override
    public Task top() throws ArrayIndexOutOfBoundsException
    {
        if(front >= back)
            return arr[front-1];
        else throw new ArrayIndexOutOfBoundsException("Heap-ul este gol.");
    }
    public Task back() throws ArrayIndexOutOfBoundsException
    {
        if(back <= front)
            return arr[back];
        else throw new ArrayIndexOutOfBoundsException("Heap-ul este gol.");
    }

    @Override
    public void push(Task t) throws ArrayIndexOutOfBoundsException {
        if(front < MAX_SIZE){
            arr[front++] = t;
        }else throw new ArrayIndexOutOfBoundsException("Heap-ul este deja plin.");
    }

    @Override
    public void pop() throws ArrayIndexOutOfBoundsException{
        if( back <= front){
            arr[back++]=null;
        }else throw new ArrayIndexOutOfBoundsException("Heap-ul este gol.");
    }

    @Override
    public void clear() {
        while(back <=front){
            arr[back++]=null;
        }
    }

    @Override
    public int size() {
        return front-back+1;
    }
}
