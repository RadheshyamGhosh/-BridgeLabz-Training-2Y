interface LightAction {
    void activate();
}

public class SmartHomeLighting {
    public static void main(String[] args) {
        LightAction motionTrigger = () -> System.out.println("Motion detected! Turning ON hallway lights.");
        LightAction timeOfDayTrigger = () -> System.out.println("Evening detected! Dimming living room lights.");
        LightAction voiceCommandTrigger = () -> System.out.println("Voice command received! Switching color to warm white.");

        System.out.println("--- Smart Home Lighting System ---");
        activateLight(motionTrigger);
        activateLight(timeOfDayTrigger);
        activateLight(voiceCommandTrigger);
    }

    static void activateLight(LightAction action) {
        action.activate();
    }
}
