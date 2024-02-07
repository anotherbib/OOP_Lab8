public class LiveScoreSubcriber implements Subscriber{
    private String result;

    @Override
    public void update(Source o) {
        this.result = ((LiveScore) o).getResult();
        showResult();
    }

    public void showResult(){
        System.out.println("live result: "+result);
    }
}