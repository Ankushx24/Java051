package Unit3;

public class Student implements Comparable<Student> {
    int age;
    String name;
    int roll;

    public Student(int age,String name,int roll) {
        this.age = age;
        this.name = name;
        this.roll = roll;
    }

    public int compareTo(Student st) {
        if(age == st.age)
            return 0;
        return 0;
    }
}
