package com.epam.campus;

public class App {
    public static void main(String[] args) {
        AudioPlayer musicPlayer = new MusicPlayer();
        VideoPlayer moviePlayer = new MoviePlayer();

        musicPlayer.playAudio("Jazz in Paris");
        musicPlayer.pauseAudio();
        musicPlayer.stopAudio();

        moviePlayer.playVideo("Planet Earth");
        moviePlayer.pauseVideo();
        moviePlayer.stopVideo();
    }
}
