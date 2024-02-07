public class App {
    public static void main(String[] args) {
        Remote remoteControl = new Remote();

        Light bedRoomLight = new Light("Bed Room");
        Light kitchenLight = new Light("Kitchen");
        Airconditioner bedRoomAC = new Airconditioner("Bed Room");

        remoteControl.setCommand(0, new LightOn(bedRoomLight), new LightOff(bedRoomLight));
        remoteControl.setCommand(1, new LightOn(kitchenLight), new LightOff(kitchenLight));
        remoteControl.setCommand(2, new AirconditionerOn(bedRoomAC), new AirconditionerOff(bedRoomAC));

        System.out.println("slot 0, light Bed Room");
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println("--------------------------------");
        System.out.println("slot 1, light Kitchen");
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        System.out.println("--------------------------------");
        System.out.println("slot 2, AC Bed Room");
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        System.out.println("--------------------------------");
        System.out.println("test one unavailable slot, slot 3");
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
    }
}
