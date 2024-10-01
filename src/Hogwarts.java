public class Hogwarts {

    private String name;        //имя
    private int magic;          //магия
    private int transgressions; //сила трансгрессии

    public Hogwarts(String name, int magic, int transgressions) {
        this.name = name;
        this.magic = magic;
        this.transgressions = transgressions;
    }

    //метод подсчета баллов
    public int points() {
        int num = getMagic() + getTransgressions();
        return num;
    }

    //метод, который сравнивает между собой двух учеников разных факультетов
    public static void comparingStudentsHogwarts(Hogwarts student1, Hogwarts student2) {
        if (student1.points() > student2.points()) {
            System.out.println(student1.getName() + " обладает большей мощностью магии, чем " + student2.getName());
        } else if (student1.points() < student2.points()) {
            System.out.println(student2.getName() + " обладает большей мощностью магии, чем " + student1.getName());
        } else {
            System.out.println("Оба ученика равны по силе магии");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgressions() {
        return transgressions;
    }

    public void setTransgressions(int transgressions) {
        this.transgressions = transgressions;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", magic=" + magic +
                ", transgressions=" + transgressions +
                '}';
    }
}
