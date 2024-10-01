public class Ravenclaw extends Hogwarts {

    private int smart;      //ум
    private int wisdom;     //мудрость
    private int witty;      //остроумность
    private int creative;   //творчество

    public Ravenclaw(String name, int magic, int transgressions, int smart, int wisdom, int witty, int creative) {
        super(name, magic, transgressions);
        this.smart = smart;
        this.wisdom = wisdom;
        this.witty = witty;
        this.creative = creative;
    }

    //метод, который выводит на экран описание студента
    public void printStudentRavenclaw() {
        System.out.println("Студент: " + getName());
        System.out.println("Магия: " + getMagic() + ", трансгрессия: " + getTransgressions() + ", ум: " + getSmart() +
                ", мудрость: " + getWisdom() + ", остроумность: " + getWitty() + ", творчество: " + getCreative());
    }

    //метод подсчета баллов
    public int scoringPoints() {
        int num = getSmart() + getWisdom() + getWitty() + getCreative();
        return num;
    }

    //метод, который сравнивает между собой двух учеников одного факультета по свойствам
    public static void comparingStudentsRavenclaw(Ravenclaw student1, Ravenclaw student2) {
        if (student1.scoringPoints() > student2.scoringPoints()) {
            System.out.println(student1.getName() + " лучший Когтевранец, чем " + student2.getName());
        } else if (student1.scoringPoints() < student2.scoringPoints()) {
            System.out.println(student2.getName() + " лучший Когтевранец, чем " + student1.getName());
        }
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

}
