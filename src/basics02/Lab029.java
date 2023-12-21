package src.basics02;

public class Lab029 {
    public static void main(String[] args) {
        String  s1 = "mani";
        //string constant pool - SCP  / String pool

        //new operator - new object
        String s2 = new String ("mani");
        // new operator is used to create the new object for class
        //it returns the address of the newly created object.
        System.out.println(s2);
        System.out.println(new String("mani"));
    }
}
