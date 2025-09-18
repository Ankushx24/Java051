package Unit3;
import java.util.ArrayList;
import java.util.Collections;

public class StudentObjects {
    public static void main(String[] args) {
        ArrayList<Student> stobj = new ArrayList<>();
        stobj.add(new Student(21,"vijay",100));
        stobj.add(new Student(22,"abhi",103));
        stobj.add(new Student(24,"Rahul",105));
        stobj.add(new Student(27,"ramesh",103));
        stobj.add(new Student(20,"gyan",107));
        Collections.sort(stobj);
        for(Student st: stobj){
            System.out.println("Name "+ st.name+"Age"+st.age+"Roll no"+st.roll);
        }

    }
}
