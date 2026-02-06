package com.epam.campus;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void musicPlayerHandlesAudioOnlyFlow() {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(buffer));

        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.playAudio("Unit Test Track");
        musicPlayer.pauseAudio();
        musicPlayer.stopAudio();

        System.setOut(originalOut);
        String output = buffer.toString();

        assertTrue(output.contains("Playing audio track: Unit Test Track"));
        assertTrue(output.contains("Paused audio track: Unit Test Track"));
        assertTrue(output.contains("Stopped audio track: Unit Test Track"));
        assertFalse(musicPlayer.isPlaying());
        assertNull(musicPlayer.getCurrentTrack());
    }

    @Test
    public void moviePlayerHandlesVideoOnlyFlow() {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(buffer));

        MoviePlayer moviePlayer = new MoviePlayer();
        moviePlayer.playVideo("Interface Segregation Documentary");
        moviePlayer.pauseVideo();
        moviePlayer.stopVideo();

        System.setOut(originalOut);
        String output = buffer.toString();

        assertTrue(output.contains("Playing video: Interface Segregation Documentary"));
        assertTrue(output.contains("Paused video: Interface Segregation Documentary"));
        assertTrue(output.contains("Stopped video: Interface Segregation Documentary"));
        assertFalse(moviePlayer.isPlaying());
        assertNull(moviePlayer.getCurrentTitle());
    }
}
