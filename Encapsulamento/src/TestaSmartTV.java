public class TestaSmartTV {
    public static void main(String[] args) {
        SmartTV st1 = new SmartTV("LG", "50p", 0,true);

        st1.setVolume(120);
        st1.setVolume(40);
        System.out.println("Volume de st1 " + st1.getVolume());

        SmartTV st2 = new SmartTV("Sansung", "Win 67", 0, true);
        st2.setMarca("Sansung");
        st2.setMarca("Win 67");

        SmartTV  st3 = new SmartTV("Phillco", "96", 0, true);

    }
}
