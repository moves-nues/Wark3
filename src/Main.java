public class Main {
    public static void main(String[] args) {
        //Задача1
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        //Задача2
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        //Задача3
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        //Задача4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Задача5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Задача6,7
        var weightFirst = 78.2;
        var weightSecond = 82.7;
        var totalWeight = weightFirst + weightSecond;
        System.out.println("Общая масса составит " + totalWeight + " кг");
        var differenceWeight = weightSecond - weightFirst;
        System.out.println("Разность масс составит " + differenceWeight + " кг");
        var difference = weightFirst % weightSecond;
        System.out.println("Через остаток разница равна " + difference + " кг");

        //Задача8
        var totalHours = 640;
        var oneEmployee = 8;
        var amountWorkers = totalHours / oneEmployee;
        System.out.println("Всего работников в компании - " + amountWorkers + " человек");
        var newNumberEmployees = amountWorkers + 94;
        var hoursBetweenEmployees = oneEmployee * newNumberEmployees;
        System.out.println("Если в компании работает " + newNumberEmployees + " человека, то всего "
                + hoursBetweenEmployees + " часа работы может быть поделено между сотрудниками");}



}
