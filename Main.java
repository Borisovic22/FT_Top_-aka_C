// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Student student = new Student("Иван К. Е.", 22 );
        System.out.println(student.toString());

        Aspirant aspirant = new Aspirant(
                "Исследование объектно-реляционных баз данных",
                "Сидоров Константин Сергеевич",
                28 );
        System.out.println(aspirant);

        Student student1 = new Student("Петров Сергей Сергеевич", 22);
        System.out.println(student1);

        Student aspirant1 = new Aspirant(
                "Исследование объектно-реляционных баз данных",
                "Сидоров Константин Сергеевич",
                32 );
        System.out.println(aspirant1);

        Ball redBall = new Ball("red");
        Ball blackBall = new Ball("black");
        Ball redBall1 = new Ball("red");
        Ball blackBall1 = new Ball("black");
        System.out.println(redBall.getCountInstance());
        System.out.println(blackBall.getCountInstance());

    }
}