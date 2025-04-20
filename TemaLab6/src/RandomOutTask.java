public class RandomOutTask implements Task{
    private int nr;

    public RandomOutTask() {
        nr = (int) Math.round(Math.random()*1000000);
    }

    @Override
    public void doTask() {
        System.out.println(nr);
    }


}
