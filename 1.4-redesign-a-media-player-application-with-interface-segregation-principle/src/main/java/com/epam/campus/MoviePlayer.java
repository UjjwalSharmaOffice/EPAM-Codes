package com.epam.campus;

public class MoviePlayer implements VideoPlayer {
    private String currentTitle;
    private boolean playing;

    @Override
    public void playVideo(String title) {
        currentTitle = title;
        playing = true;
        System.out.println("Playing video: " + title);
    }

    @Override
    public void pauseVideo() {
        if (!playing || currentTitle == null) {
            System.out.println("No video playing to pause.");
            return;
        }
        playing = false;
        System.out.println("Paused video: " + currentTitle);
    }

    @Override
    public void stopVideo() {
        if (currentTitle == null) {
            System.out.println("No video selected to stop.");
            return;
        }
        playing = false;
        System.out.println("Stopped video: " + currentTitle);
        currentTitle = null;
    }

    public String getCurrentTitle() {
        return currentTitle;
    }

    public boolean isPlaying() {
        return playing;
    }
}
