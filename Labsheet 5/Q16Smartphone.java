interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class Smartphone implements Camera, MusicPlayer {
    public void takePhoto() {
        System.out.println("Taking a photo.");
    }

    public void playMusic() {
        System.out.println("Playing music.");
    }
}

public class Q16Smartphone {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();

        s.takePhoto();
        s.playMusic();
    }
}