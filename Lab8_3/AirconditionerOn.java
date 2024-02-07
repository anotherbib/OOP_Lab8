public class AirconditionerOn implements Commands{
    private Airconditioner airconditioner;

    public AirconditionerOn(Airconditioner airconditioner) {
        this.airconditioner = airconditioner;
    }

    @Override
    public void execute() {
        airconditioner.on();
        airconditioner.setTemp(25);
    }
}
