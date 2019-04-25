package car.console;

import car.console.Channel;
import car.console.Band;

/**
 * Car Radio implementation
 *
 * TODO limit frequency for each band
 * TODO add constructor (initial state)
 */
public class Radio {
    final Integer MAX_CHANNELS = 6;

    public Radio() {
        currentVolume = 20;
    }

    Channel channels[];
    Integer currentFrequency;
    Integer currentVolume;
    Band currentBand;

    public void volumeUp() {
        currentVolume++;
    }
    public void volumeDown() { 
        currentVolume--;
    }

    public void tuneUp() {
        currentFrequency++;
    }
    public void tuneDown() {
        currentFrequency--;
    }

    public void switchBand(Band band) {
        currentBand = band;
    }

    /**
     * Finds next tune
     * Seek left off due to complexity
     *
     */
    public void seekUp() {}
    public void seekDown() {}

    public void saveChannel(Integer position) {
        if (position < MAX_CHANNELS ) {
            Channel channel = new Channel();
            channel.band = currentBand;
            channel.frequency = currentFrequency; 
            channels[position] = channel;
        }
    }

    public String showState() {
        return "C: " + currentVolume + " B:" + currentBand + " F:" + currentFrequency;
    }
}

