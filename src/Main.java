public class Main {
    public static void main(String[] args) {
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog += 4;
        cat += 4;
        paper += 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxerWeight2 = 78.2;
        var boxerWeight1 = 82.7;
        System.out.println(boxerWeight1 + boxerWeight2);
        System.out.println(boxerWeight1 - boxerWeight2);
        System.out.println(boxerWeight1 % boxerWeight2);

        var workingHours = 640;
        var workingHoursPersonal = 8;
        var workers = workingHours / workingHoursPersonal;
        var newWorkers = workers + 94;
        var newWorkingTime = newWorkers * workingHoursPersonal;
        System.out.println("Всего работников в компании – " + workers + " человек");
        System.out.println("Если в компании работает " + newWorkers + " человек, то всего " + newWorkingTime + " часов работы может быть поделено между сотрудниками");

    }
}