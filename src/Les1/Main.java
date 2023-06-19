package Les1;
/*1.	Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
2.	Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
3.	Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
4.	* У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки. Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.*/



public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat(20, 35, "Мурзик");
        Human human1 = new Human (2, 15, "Челик");
        Robot robot1 = new Robot (30, 10, "Робот");
        Wall wall1 = new Wall(10);
        Track track1 = new Track(30);

        track1.doIt(cat1);
        wall1.doIt (cat1);

        track1.doIt(human1);
        wall1.doIt(human1);

        track1.doIt(robot1);
        wall1.doIt(robot1);
        System.out.println("_________Далее результаты из массива__________");

        Cat [] catsArray = {new Cat(50, 50, "Барсик"), new Cat(25, 36, "Рыжик")};
        Human [] humansArray = {new Human(20, 35, "Челик2"), new Human(10, 50, "Челик3")};
        Robot [] robotsArray = {new Robot(40, 50, "Робот2"), new Robot(20, 60, "Робот3")};
        Track [] trackArray = {new Track(49), new Track(80)};
        Wall [] wallsArray = {new Wall(25), new Wall(18)};

        for (Track track: trackArray) {
            for (Cat cat: catsArray) {
                track.doIt (cat);
            }
            for (Human human: humansArray) {
                track.doIt(human);
            }
            for (Robot robot: robotsArray) {
                track.doIt(robot);
            }

        }

        for (Wall wall: wallsArray) {
            for (Cat cat: catsArray) {
                wall.doIt (cat);
            }
            for (Human human: humansArray) {
                wall.doIt(human);
            }
            for (Robot robot: robotsArray) {
                wall.doIt(robot);
            }

        }

    }

}