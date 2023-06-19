package Les1;

public class Robot implements Competing {

    int maxHeight;
    int maxLength;
    String name;

    public Robot(int maxHeight, int maxLength, String name) {
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
        this.name = name;
    }

    @Override
    public void jump(int wallHeight) {
        if (wallHeight < maxHeight) {
            System.out.println(name + " перепрыгнул  препятствие в " + wallHeight + "м");
        } else {
            System.out.println(name + " не перепрыгнул  препятствие в " + wallHeight + "м");
        }
    }

    @Override
    public void run(int trackLength) {
        if (trackLength < maxLength) {
            System.out.println(name + " пробежал  препятствие в " + trackLength + "м");
        } else {
            System.out.println(name + " не пробежал  препятствие в " + trackLength + "м");
        }

    }
}
