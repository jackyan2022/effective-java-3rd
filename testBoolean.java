public class testBoolean {

    public static void main(String[] args) {
        System.out.println(valueOf(true));
        System.out.println(valueOf(false));
    }

    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }
}
