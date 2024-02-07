public class Remote {
    private Commands[] ons;
    private Commands[] offs;

    public Remote() {
        ons = new Commands[6];
        offs = new Commands[6];

        Commands noCommand = new NoCommand();
        for (int i = 0; i < 6; i++) {
            ons[i] = noCommand;
            offs[i] = noCommand;
        }
    }

    public void setCommand(int slot, Commands on, Commands off) {
        ons[slot] = on;
        offs[slot] = off;
    }

    public void onButtonWasPushed(int slot) {
        ons[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offs[slot].execute();
    }
}
