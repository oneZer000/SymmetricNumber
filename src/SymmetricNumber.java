import java.util.Scanner;

public class SymmetricNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите трехзначное число: ");
        int num = in.nextInt();
        int firstDigit = num / 100;
        int lastDigit = num % 10;
        String toggleSymmetry = "";
        if (firstDigit != lastDigit){
            toggleSymmetry = "не";
        }
        System.out.printf("Число %d %sсимметрично", num, toggleSymmetry);
    }
}