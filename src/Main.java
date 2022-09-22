import static java.lang.Math.min;
import static java.lang.Math.max;

public class Main {
    public static void main(String[] args) {
        //Task 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        //Task 2
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        //Task 3
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        //Task 4
        var friend = 19;
        System.out.println("friend = " + friend);
        friend += 2;
        System.out.println("friend = " + friend);
        friend /= 7;
        System.out.println("friend = " + friend);

        //Task 5
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog *= 10;
        System.out.println("frog = " + frog);
        frog /= 3.5;
        System.out.println("frog = " + frog);
        frog += 4.0;
        System.out.println("frog = " + frog);

        //Task 6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println("Вес первого боксера = " + boxer1 + "кг");
        System.out.println("Вес второго боксера = " + boxer2 + "кг");
        var weightAllBoxer = boxer1 + boxer2;
        System.out.println("Общий вес боксеров = " + weightAllBoxer + "кг");

        //Task 7
        var weightDiffBoxer0 = max(boxer1,boxer2) - min(boxer1,boxer2);
        var weightDiffBoxer1 = max(boxer1,boxer2) % min(boxer1,boxer2);
        System.out.println("Разница весов боксеров (вар 1) = " + weightDiffBoxer0 + "кг");
        System.out.println("Разница весов боксеров (вар 2) = " + weightDiffBoxer1 + "кг");

        //Task 8
        var hour = 640;
        var workDay = 8;
        var worker = 640 / 8;
        System.out.println("Всего работников в компании – " + worker + " человек");
        worker += 94;
        hour = worker * workDay;
        System.out.println("Если в компании работает " + worker + " человек, то всего " + hour + " часов работы может быть поделено между сотрудниками");

    }
}