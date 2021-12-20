package javatest.designPattern.mediator;

public class Main {
    public static void main(String[] args) {
       VideoPlayer videoPlayer = new VideoPlayer();
       videoPlayer.execute();

       MusicPlayer musicPlayer = new MusicPlayer();
       musicPlayer.execute();
    }
}
