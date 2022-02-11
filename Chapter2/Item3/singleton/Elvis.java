package Chapter2.Item3.singleton;

public class Elvis {
    public static final Elvis INSTANCE = new Elvis();
    private Elvis() {

    }

    public void leaveTheBuilding() {}
}
