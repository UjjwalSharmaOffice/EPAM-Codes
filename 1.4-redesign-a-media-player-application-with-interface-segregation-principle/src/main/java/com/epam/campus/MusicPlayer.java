package com.epam.campus;

public class MusicPlayer implements AudioPlayer {
    private String currentTrack;
    private boolean playing;

    @Override
    public void playAudio(String trackName) {
        currentTrack = trackName;
        playing = true;
        System.out.println("Playing audio track: " + trackName);
    }

    @Override
    public void pauseAudio() {
        if (!playing || currentTrack == null) {
            System.out.println("No audio playing to pause.");
            return;
        }
        playing = false;
        System.out.println("Paused audio track: " + currentTrack);
    }

    @Override
    public void stopAudio() {
        if (currentTrack == null) {
            System.out.println("No audio selected to stop.");
            return;
        }
        playing = false;
        System.out.println("Stopped audio track: " + currentTrack);
        currentTrack = null;
    }

    public String getCurrentTrack() {
        return currentTrack;
    }

    public boolean isPlaying() {
        return playing;
    }
}
