import org.jfugue.*;

public class MyMusicApp {
    public static void main(String[] args) {
        Player player = new Player();
        Pattern pattern = new Pattern("C D E F G A B");
        player.play(pattern);
    }
}