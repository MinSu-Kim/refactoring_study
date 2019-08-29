package refactoring_study.extract_superclass;

public class Main {

    public static void main(String[] args) {
        Media music = new Music("좋니");
        Media video = new Video("효리네 민박");
        
        Player musicPlayer = new Player();
        musicPlayer.setMedia(music);
        
        Player videoPlayer = new Player();
        videoPlayer.setMedia(video);
        
        play(musicPlayer);
        play(videoPlayer);
    }

    private static void play(Player player) {
        player.play();
        player.loop();
        player.stop();
    }


}
