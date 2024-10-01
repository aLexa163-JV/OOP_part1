public class Slytherin extends Hogwarts {

    private int cunning;            //хитрость
    private int determination;      //решительность
    private int ambition;           //амбициозность
    private int resourcefulness;    //находчивость
    private int lustForPower;       //жажда власти

    public Slytherin(String name, int magic, int transgressions, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magic, transgressions);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    //метод, который выводит на экран описание студента
    public void printStudentSlytherin() {
        System.out.println("Студент: " + getName());
        System.out.println("Магия: " + getMagic() + ", трансгрессия: " + getTransgressions() + ", хитрость: " + getCunning() +
                ", решительность: " + getDetermination() + ", амбициозность: " + getAmbition() + ", находчивость: " + getResourcefulness() +
                ", жажда власти: " + getLustForPower());
    }

    //метод подсчета баллов
    public int scoringPoints() {
        int num = getCunning() + getDetermination() + getAmbition() + getResourcefulness() + getLustForPower();
        return num;
    }

    //метод, который сравнивает между собой двух учеников одного факультета по свойствам
    public static void comparingStudentsSlytherin(Slytherin student1, Slytherin student2) {
        if (student1.scoringPoints() > student2.scoringPoints()) {
            System.out.println(student1.getName() + " лучший Слизеринец, чем " + student2.getName());
        } else if (student1.scoringPoints() < student2.scoringPoints()) {
            System.out.println(student2.getName() + " лучший Слизеринец, чем " + student1.getName());
        }
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
}
