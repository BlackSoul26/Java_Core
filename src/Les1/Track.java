package Les1;

import org.w3c.dom.ls.LSOutput;

public class Track  extends Action{

    private int trackLength;

    public Track(int trackLength) {
        this.trackLength = trackLength;
    }

    @Override
    public void doIt(Competing competing) {
        competing.run(trackLength);


    }



}
