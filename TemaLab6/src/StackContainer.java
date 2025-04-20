public class StackContainer implements Container{
    int ptr=-1;
    @Override
    public Task top() throws ArrayIndexOutOfBoundsException
    {
        if(ptr>=0)
            return arr[ptr];
        else throw  new ArrayIndexOutOfBoundsException("Stiva este goala");
    }

    @Override
    public void push(Task t) throws ArrayIndexOutOfBoundsException {
        if(ptr < MAX_SIZE){
            arr[++ptr] = t;
        }else throw new ArrayIndexOutOfBoundsException("Stiva este deja plina.");
    }

    @Override
    public void pop() throws ArrayIndexOutOfBoundsException{
        if(ptr>0){
            arr[ptr--]=null;
        }else throw new ArrayIndexOutOfBoundsException("Stiva este goala.");
    }

    @Override
    public void clear() {
        while(ptr>0){
            arr[ptr--]=null;
        }
    }

    @Override
    public int size() {
        return ptr+1;
    }
}
