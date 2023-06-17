class Student{

    public static final int MY_CONST = 7;   //Siendo final no va a cambiar nunca
    public String name;
    public static String studentClass;
    public static int count = 0;

    public Student(){
        count++;
    }

    public void studentName(){  //Métodos no estáticos pueden acceder a datos estáticos
        System.out.println(name + " is enrolled in " + studentClass);
    }

    public static void classInfo(){ //Métodos estáticos no pueden acceder a datos no estáticos
        System.out.println(studentClass);
        //System.out.println(name); da error, lógicamente
    }
}

public class Application {
    public static void main(String[] args) {

        Student.studentClass = "Web Development Fundamentals";
        System.out.println(Student.studentClass);

        Student.classInfo();

        System.out.println("Before creating objects: " + Student.count);

        Student st1 = new Student();
        Student st2 = new Student();

        System.out.println("After creating objects: " + Student.count);

        st1.name = "Steven";
        st2.name = "Daniel";

        st1.studentName();
        st2.studentName();

        System.out.println(Math.E);
        System.out.println(Student.MY_CONST);
    }
}
