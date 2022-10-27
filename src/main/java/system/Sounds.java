package system;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.InputStream;

public class Sounds implements AutoCloseable {

    private Player player = null;

    private boolean active = false;


    public Sounds(String pathToResource){
        try {
            InputStream in = this.getClass().getResourceAsStream(pathToResource);
            player = new Player(in);
            active = true;
        } catch (JavaLayerException e){

        }
    }

    public void play() throws JavaLayerException {
        player.play();
    }

    public boolean isActive(){
        if (player != null) {
            return true;
        }
        return active;
    }

    @Override
    public void close() throws Exception {
        if (player != null){
            player.close();
        }
    }
}
