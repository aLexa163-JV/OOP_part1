public class Gryffindor extends Hogwarts {

    private int nobility;   //благородство
    private int honor;      //честь
    private int bravery;    //храбрость


    public Gryffindor(String name, int magic, int transgressions, int nobility, int honor, int bravery) {
        super(name, magic, transgressions);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    //метод, который выводит на экран описание студента
    public void printStudentGryffindor() {
        System.out.println("Студент: " + getName());
        System.out.println("Магия: " + getMagic() + ", трансгрессия: " + getTransgressions() +
                ", благородство: " + getNobility() + ", честь: " + getHonor() + ", храбрость: " + getBravery());
    }

    //метод подсчета баллов
    public int scoringPoints() {
        int num = getNobility() + getHonor() + getBravery();
        return num;
    }

    //метод, который сравнивает между собой двух учеников одного факультета по свойствам
    public static void comparingStudentsGryffindor(Gryffindor student1, Gryffindor student2) {
        if (student1.scoringPoints() > student2.scoringPoints()) {
            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + student2.getName());
        } else if (student1.scoringPoints() < student2.scoringPoints()) {
            System.out.println(student2.getName() + " лучший Гриффиндорец, чем " + student1.getName());
        }
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

}
