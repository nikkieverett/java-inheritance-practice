public interface PlayMusic {
    String getCurrentSong();
    Boolean isPlaying();
    void playPause(String song);
    void stop();
    void volumeup();
    void volumedown();

}
