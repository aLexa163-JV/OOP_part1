public class Main {
    public static void main(String[] args) {

        //студенты Гриффиндора:
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 10, 15, 20, 30, 40);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 5, 10, 20, 15, 10);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 5, 10, 15, 14, 20);

        //студенты Слизерин:
        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 8, 15, 20, 10, 22, 16, 30);
        Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю", 5, 10, 12, 8, 16, 9, 10);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 7, 12, 15, 6, 5, 18, 25);

        //студенты Пуффендуй:
        Hufflepuff zachariahSmith = new Hufflepuff("Захария Смит", 6, 10, 13, 17, 11);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 5, 13, 11, 12, 13);
        Hufflepuff justinFinch = new Hufflepuff("Джастин Финч-Флетчли", 7, 14, 8, 15, 15);

        //студенты Когтевран:
        Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг", 9, 13, 22, 16, 12, 15);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 5, 15, 20, 11, 15, 20);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 6, 13, 17, 16, 22, 25);

        harryPotter.printStudentGryffindor();//описание студента факультета Гриффиндор
        grahamMontague.printStudentSlytherin();//описание студента факультета Слизерин
        zachariahSmith.printStudentHufflepuff();//описание студента факультета Пуффендуй
        zhouChang.printStudentRavenclaw();//описание студента факультета Когтевран

        //методы, который сравнивают между собой двух учеников одного факультета по свойствам
        Gryffindor.comparingStudentsGryffindor(hermioneGranger, ronWeasley);//Гриффиндор
        Slytherin.comparingStudentsSlytherin(dracoMalfoy, gregoryGoyle);//Слизерин
        Hufflepuff.comparingStudentsHufflepuff(cedricDiggory, justinFinch);//Пуффендуй
        Ravenclaw.comparingStudentsRavenclaw(padmaPatil, marcusBelby);//Когтевран

        //метод, который сравнивает между собой двух учеников разных факультетов
        Hogwarts.comparingStudentsHogwarts(dracoMalfoy, harryPotter);

    }

}