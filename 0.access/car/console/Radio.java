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

    Channel channels[];
    Integer currentFrequency;
    Integer currentVolume;
    Band currentBand;

    public void volumeUp() {
        currentVolume++;
    }
    void volumeDown() { 
        currentVolume--;
    }

    void tuneUp() {
        currentFrequency++;
    }
    void tuneDown() {
        currentFrequency--;
    }

    void switchBand(Band band) {
        currentBand = band;
    }

    /**
     * Finds next tune
     * Seek left off due to complexity
     *
     */
    void seekUp() {}
    void seekDown() {}

    void saveChannel(Integer position) {
        if (position < MAX_CHANNELS ) {
            Channel channel = new Channel();
            channel.band = currentBand;
            channel.frequency = currentFrequency; 
            channels[position] = channel;
        }
    }
}

