package Unit1;

public class CollegeStudent1 extends student1 {
    public int roll;
    public CollegeStudent1(String address, int roll) {
        super(address);
        this.roll = roll;
    }
    public void show_roll(){
        System.out.println("Roll no is "+ roll);
    }
}
