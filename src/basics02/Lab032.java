package src.basics02;

public class Lab032 {
    public static void main(String[] args) {

        String name = "Manikanta deva"; //string constant pool
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        String name1 = new String("Manikanta deva");//QA? Heap area

    }
}
