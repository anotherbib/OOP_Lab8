public class NoCommand implements Commands{
    @Override
    public void execute() {
        System.out.println("No command is assigned to this slot");
    }   
}
