package Unit2;

public class LambdaDemo1 {
    public static void main(String[] args) {
        NumericTest isEven = (int n)->n%2==0;
            System.out.println(isEven.isEven(12));
//
//        if(isEven.isEven(13){
//            System.out.println("number is even");
//        }else{
//            System.out.println("number is not even");
//        }
    }
}
