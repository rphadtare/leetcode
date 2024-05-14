package leetcode.arr.solutions;

public class Student {

    //name, roll_no, std
    private String name;
    private int roll_no, std;

    //school name should be applicable/same for all students
    private static String school_name;

    static{
        System.out.println("inside static block..");
        school_name = "Modern High School";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public int getStd() {
        return std;
    }

    public void setStd(int std) {
        this.std = std;
    }

    public static String getSchool_name() {
        return school_name;
    }

    public static void setSchool_name(String school_name) {
        Student.school_name = school_name;
    }

    public Student(String name, int roll_no, int std) {
        this.name = name;
        this.roll_no = roll_no;
        this.std = std;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll_no=" + roll_no +
                ", std=" + std +
                '}';
    }

    public static void main(String[] args) {
        Student s1 = new Student("Rushi", 1, 5);
        Student s2 = new Student("Rohit", 2, 5);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println("Above students are of school - " + Student.getSchool_name());

    }
}
