public class CounterOutTask implements Task {
    private static int counter =0;

    @Override
    public void doTask() {
        System.out.println(++counter);
    }
}
