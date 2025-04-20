public interface Container {
    int MAX_SIZE = (1<<16);
    Task[] arr = new Task[MAX_SIZE];
    public Task top();
    abstract void push(Task t);
    abstract void pop();
    abstract void clear();
    abstract int size();
}
