public abstract class student {
    int roll;
    public String name;
        private String grade;
    public student(int roll, String name, String grade) {
        this.roll = roll;
        this.name = name;
        this.grade = grade;
    }
    public void  setGrade(String grade) {
        this.grade = grade;
    }
    public String getGrade() {
        return grade;
    }
    public String getGrade(String grade) {
        return grade;
    }

}
