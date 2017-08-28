public class Smartphone implements Comparable<Smartphone>, PlayMusic, Camera{

    private String brand;
    private String model;

    private String currentSong;
    private boolean isPlaying;
    private Integer volume;
    private Integer zoomLevel;

    public Smartphone(String brand, String model){
        this.brand = brand;
        this.model = model;
        currentSong = "Not playing";
        isPlaying = false;
        volume = 100;
    }

    @Override
    public int compareTo(Smartphone o) {
        return 0;
    }

    //Camera interface
    @Override
    public void takePicture() {
        System.out.println("Shutter sound");
    }
    @Override
    public void zoomIn() {
        this.zoomLevel += 1;
        System.out.println("");
    }
    @Override
    public void zoomOut() {

    }
    @Override
    public void flash() {

    }


    //PlayMusic interface
    @Override
    public String getCurrentSong() {
        return currentSong;
    }
    public Integer getVolume() {
        return this.volume;
    }
    @Override
    public Boolean isPlaying() {
        return this.isPlaying;
    }
    @Override
    public void playPause(String song) {
        this.currentSong = song;
        this.isPlaying = true;
    }
    @Override
    public void stop() {
        this.isPlaying = false;
    }
    @Override
    public void volumeup() {
        this.volume += 5;
    }
    @Override
    public void volumedown() {
        this.volume -= 5;
    }


}
