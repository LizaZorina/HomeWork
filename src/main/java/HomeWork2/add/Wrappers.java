package HomeWork2.add;

public class Wrappers {
    public static void main(String[] args) {
        final Byte i = new Byte(String.valueOf(3));
        final Short g = new Short(String.valueOf(9));
        final Integer k = new Integer(79);
        final Long l = new Long(52894562);
        final Float m = new Float(1.35);
        final Double n = new Double(5.78956);
        final Character o = new Character('v');
        final Boolean p = new Boolean(false);

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