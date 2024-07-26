/*
1. Default methods are defined when we do not want to implement that function in other class and interfaces which
inherit them
2. Defaults methods can be override in classes which inherit it as well.
*/
interface Camera{
    void takingSnap();
    default void flashOn(){
        Alert();
        System.out.println("Flash is On now for taking photo....");
    }
    private void Alert(){
        System.out.println("Battery is low and you cannot use flash anymore....");
    }
}
interface VideoRecording{
    void simpleRecording();
}
interface wifi{
    String[][] arr = {{"Ali-123", "Hafiz-786", "Usman-123456789"},{"Two_D_Array_Element"}};
    String[][] getNetwork();
    void displayNetworks();
}
class cellPhone{
    void callNumber(){
        System.out.println("Connecting the number....");
    }
    void pickNumber(){
        System.out.println("Picking the call....");
    }
}
class SmartPhone extends cellPhone implements Camera, VideoRecording, wifi{
    public void takingSnap(){
        System.out.println("Taking snap...");
    }
    public void simpleRecording(){
        System.out.println("Simple recording continue....");
    }
    // Here flashOn() method is override, and we can also use it's non-override version as well
    // public void flashOn(){
    //     System.out.println("Flash is On now for taking photo in Smart phone....");
    // }
    public String[][] getNetwork(){
        return arr;
    }
    public void displayNetworks(){
        String[][] tempString = getNetwork();
        System.out.println("Networks:");
        for (String[] element: tempString) {
            for (String element1:element) {
                System.out.println(element1);
            }
        }
    }
}
public class Default_Methods {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.simpleRecording();
        sp.takingSnap();
        sp.callNumber();
        sp.pickNumber();
        sp.flashOn();
        sp.displayNetworks();
        // sp.Alert();        ------> It will throw an error.

    }
}

