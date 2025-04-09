public class Iphone implements WebNavigator, MediaPlayer, VideoPlayer, App{

    private String model;
    private int year;
    private String iosVersion;
    private String storage;

    public Iphone(String model, int year, String iosVersion, String storage) {
        this.model = model;
        this.year = year;
        this.iosVersion = iosVersion;
        this.storage = storage;
    }



}
