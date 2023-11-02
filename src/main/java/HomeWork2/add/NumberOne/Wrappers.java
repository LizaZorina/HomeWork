package HomeWork2.add.NumberOne;

public class Wrappers {
    private static final Byte i = new Byte(String.valueOf(3));
    private static final Short g = new Short(String.valueOf(9));
    private static final Integer k = new Integer(79);
    private static final Long l = new Long(52894562);
    private static final Float m = new Float(1.35);
    private static final Double n = new Double(5.78956);
    private static final Character o = new Character('v');
    private static final Boolean p = new Boolean(false);

    public static void main(String[] args) {
        System.out.println("Byte " + i);
        System.out.println("Short " + g);
        System.out.println("Integer " + k);
        System.out.println("Long " + l);
        System.out.println("Float " + m);
        System.out.println("Double " + n);
        System.out.println("Character " + o);
        System.out.println("Boolean " + p);
    }
}