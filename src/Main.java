public class Main {
    public static void main(String[] args) {
        String a = "some text";
        String b = "some text";
        String c = new String("some text");

        System.out.println(a == b); // true same object reference
        System.out.println(a.equals(b)); // true
        System.out.println(a.equals(c)); // true comparing values not references
        System.out.println(a == c); // false "new" keyword create a new object in the heap
    }
}