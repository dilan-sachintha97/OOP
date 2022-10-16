public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("Dian", "Matara", "Male", 25,"0717329326");
        System.out.println(student1.getName());

        Student student2 = new Student();
        student2.setName("Charith");
        student2.setAddress("Matara");
        student2.setAge(26);
        student2.setGender("Male");
        // He has no mobile phone;  => that's why we want no arg constructor

        System.out.println(student2.getContact());
        System.out.println(student2.getName());
        System.out.println(student2.getAddress());

    }
}
