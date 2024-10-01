public class Hufflepuff extends Hogwarts {

    private int hardworking;//трудолюбие
    private int loyal;      //верность
    private int honest;     //честность

    public Hufflepuff(String name, int magic, int transgressions, int hardworking, int loyal, int honest) {
        super(name, magic, transgressions);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    //метод, который выводит на экран описание студента
    public void printStudentHufflepuff() {
        System.out.println("Студент: " + getName());
        System.out.println("Магия: " + getMagic() + ", трансгрессия: " + getTransgressions() + ", трудолюбие; " + getHardworking() +
                ", верность: " + getLoyal() + ", честность: " + getHonest());
    }

    //метод подсчета баллов
    public int scoringPoints() {
        int num = getHardworking() + getLoyal() + getHonest();
        return num;
    }

    //метод, который сравнивает между собой двух учеников одного факультета по свойствам
    public static void comparingStudentsHufflepuff(Hufflepuff student1, Hufflepuff student2) {
        if (student1.scoringPoints() > student2.scoringPoints()) {
            System.out.println(student1.getName() + " лучший Пуффендуец, чем " + student2.getName());
        } else if (student1.scoringPoints() < student2.scoringPoints()) {
            System.out.println(student2.getName() + " лучший Пуффендуец, чем " + student1.getName());
        }
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

}
