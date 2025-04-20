public class OutTask implements Task{
    private String message;
    @Override
    public void doTask() {
        System.out.println(message);
    }

    public OutTask(String message){
        this.message = message;
    }


}