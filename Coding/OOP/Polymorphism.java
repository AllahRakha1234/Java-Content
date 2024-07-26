/*
                    ****************  Polymorphism  **************
!. You can use only those features whose reference you use
2. Example   ----->   Camera1 cam1 = new SmartPhone1(); ====> In this example you can use only features of Camera1 but
not of SmartPhone1 totally
3. But when we use SmartPhone1 sp1 = new SmartPhone1(); ===> Then we can use every method and attributes
*/
interface Camera1{
    void takingSnap();
    default void flashOn(){
        Alert();     // Alert() is calling here.
        System.out.println("Flash is On now for taking photo....");
    }
    private void Alert(){
        System.out.println("Battery is low and you cannot use flash anymore....");
    }
}
interface VideoRecording1{
    void simpleRecording();
}
interface wifi1{
    String[][] arr = {{"Ali-123", "Hafiz-786", "Usman-123456789"},{"Two_D_Array_Element"}};
    String[][] getNetwork();
    void displayNetworks();
}
class cellPhone1{
    void callNumber(){
        System.out.println("Connecting the number....");
    }
    void pickNumber(){
        System.out.println("Picking the call....");
    }
}
class SmartPhone1 extends cellPhone1 implements Camera1, VideoRecording1, wifi1{
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
public class Polymorphism {
    public static void main(String[] args) {
        Camera1 cam1 = new SmartPhone1();
        cam1.flashOn();
        cam1.takingSnap();

        VideoRecording1 vr = new SmartPhone1();
        vr.simpleRecording();

        wifi1 wf = new SmartPhone1();
        wf.getNetwork();
        wf.displayNetworks();

        cellPhone1 cp = new SmartPhone1();
        cp.callNumber();
        cp.pickNumber();

        SmartPhone1 sp = new SmartPhone1();
        System.out.println("*******************************************************************");
        sp.flashOn();
        sp.takingSnap();
        sp.simpleRecording();
        sp.getNetwork();
        sp.displayNetworks();
        sp.callNumber();
        sp.pickNumber();
        // Other ways to call methods are not allowed
        // Example
//         cam1.callNumber();                  ----> Thrown an error
//         cam1.pickNumber();                  ----> Thrown an error
    }
}

