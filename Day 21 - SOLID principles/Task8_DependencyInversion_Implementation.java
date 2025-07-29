interface SwitchOnOff {
    void turnOn();
    void turnOff(); // void remoteControl();// void alexaVoiceControl();
}
class LightBulb implements SwitchOnOff {
    public void turnOn() {
        System.out.println("light turned on");
    }
    public void turnOff() {
        System.out.println("light is off");
    }
} // or class fan, class inverter, class washing machine...(in future remote for washing machine
// i can extend without modification..
class Switch { // switch is depending on switchonoff class not on light bulb..
    SwitchOnOff device;
    Switch(SwitchOnOff device) {
        this.device = device;
    }
    void operate() {
        device.turnOn();
        device.turnOff();
    }
    public static void main(String[] args) {
        SwitchOnOff lbulbobj = new LightBulb();
        Switch lightswitch = new Switch(lbulbobj);
        lightswitch.operate();
    }
}