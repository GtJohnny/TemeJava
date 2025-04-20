//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        OutTask ot = new OutTask("Hello World");

        RandomOutTask rot = new RandomOutTask();

        CounterOutTask cot = new CounterOutTask();

        cot.doTask();

        Task[] arr = {ot,rot,cot};
        for(Task t : arr){
            t.doTask();
        }

    }
}