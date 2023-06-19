package Les1;

public class Wall extends Action {

    private int wallHeight;

    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;

    }

    @Override
    public void doIt(Competing competing) {
        competing.jump(wallHeight);
    }


}
