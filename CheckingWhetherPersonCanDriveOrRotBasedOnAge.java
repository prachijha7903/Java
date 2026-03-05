import java.util.Scanner ;

public class CheckAge{
    static void Check(int age ){
        
        if (age >= 18){
            System.out.println("You can drive");
        }else{
        System.out.println("You cannot drive");
    }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter your Age : ");
        int age = sc.nextInt();
        Check(age);
    }

}
