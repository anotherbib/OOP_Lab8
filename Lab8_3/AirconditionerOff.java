public class AirconditionerOff implements Commands{
    private Airconditioner airconditioner;

    public AirconditionerOff(Airconditioner airconditioner) {
        this.airconditioner = airconditioner;
    }

    @Override
    public void execute() {
        airconditioner.off();
    }
}
