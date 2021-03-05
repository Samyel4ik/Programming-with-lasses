package Task3;

//Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
// Создайте массив из десяти элементов такого типа.
// Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
public class Class3 {
    public static void main(String[] args) {

        Student student = new Student();

        Student students[] = new Student[10];

        students[0] = new Student("Petrov", " A.I", 3, student.setGrades(new int[]{2, 3, 4, 5, 6}));
        students[1] = new Student("Petrov", "B.I.", 1, student.setGrades(new int[]{9, 10, 9, 9, 9}));            //+
        students[2] = new Student("Ivanov", "A.S.", 1, student.setGrades(new int[]{2, 10, 3, 9, 9}));
        students[3] = new Student("Pushkin", "A.S.", 2, student.setGrades(new int[]{9, 1, 9, 9, 9}));
        students[4] = new Student("Dostoevskii", "F.M.", 2, student.setGrades(new int[]{9, 10, 9, 9, 9}));        //+
        students[5] = new Student("Shishkin", "I.I.", 1, student.setGrades(new int[]{9, 10, 9, 6, 6}));
        students[6] = new Student("Aivazovskii", "I.K.", 3, student.setGrades(new int[]{9, 1, 4, 9, 9}));
        students[7] = new Student("Mate", "V.V.", 3, student.setGrades(new int[]{9, 10, 9, 9, 9}));              //+
        students[8] = new Student("Preobrazhenkii", "M.T.", 3, student.setGrades(new int[]{9, 10, 7, 8, 9}));
        students[9] = new Student("Solncev", "F.G.", 3, student.setGrades(new int[]{9, 10, 9, 9, 9}));           //+

        System.out.println("Все студенты:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println("---------------");
        System.out.println("Хорошие студенты:");
        for (int i = 0; i < students.length; i++) {
            if (students[i].goodStudentFound()){
                System.out.println(students[i]);
            }
        }
    }
}

class Student {
    private String surname;
    private String initials;
    private int groupNumber;
    private int grades[];

    public Student() {
        int grades[];
    }

    public int[] setGrades(int[] grades) {
        this.grades = new int[5];
        return grades;
    }

    public Student(String surname, String initials, int groupNumber, int grades[]) {
        this.surname = surname;
        this.initials = initials;
        this.groupNumber = groupNumber;
        this.grades = grades;
    }

    boolean goodStudentFound() {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] != 9 && grades[i] != 10)
                return false;
        }
        return true;
    }

    public String toString() {
        return surname + initials + " " + "номер группы - " + groupNumber;
    }
}