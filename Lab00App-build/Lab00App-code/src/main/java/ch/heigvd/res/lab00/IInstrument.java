package ch.heigvd.res.lab00;

public class IInstrument {
    String color;
    String sound;
    int soundVolume;

    public String play() {
        return sound;
    }

    public int getSoundVolume() {
        return soundVolume;
    }


    public String getColor() {
        return color;
    }
}
