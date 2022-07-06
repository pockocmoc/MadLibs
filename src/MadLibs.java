import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


            System.out.println("Укажите любой цвет:");
            String color = in.nextLine();

            System.out.println("Укажите глагол, в прошедшем времени:");
            String pastTenseVerb = in.nextLine();
            System.out.println("Укажите прилагательное мужского рода в родительном падеже (например: глупого)");
            String adjective = in.nextLine();



            System.out.println(color + " дракон " + pastTenseVerb + " на " + adjective + " рыцаря.");
            in.close();

        }

    }
