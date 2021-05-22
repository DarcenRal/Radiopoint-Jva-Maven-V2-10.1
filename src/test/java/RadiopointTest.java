import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiopointTest {
    @Test
    void increaseMaxVolume() {
        Radiopoint radiopoint = new Radiopoint();
        radiopoint.setCurrentVolume(10);
        radiopoint.increaseVolume();
        assertEquals(10, radiopoint.getCurrentVolume());
    }

    @Test
    void decreaseMinVolume() {
        Radiopoint radiopoint = new Radiopoint();
        radiopoint.setCurrentVolume(0);
        radiopoint.decreaseVolume();
        assertEquals(0, radiopoint.getCurrentVolume());
    }

    @Test
    void switchingChannelDownFromMinimum() {
        Radiopoint radiopoint = new Radiopoint();
        radiopoint.setCurrentChannel(0);
        radiopoint.decreaseChannel();
        assertEquals(9, radiopoint.getCurrentChannel());
    }

    @Test
    void channelSwitchingUpFromMaximum() {
        Radiopoint radiopoint = new Radiopoint();
        radiopoint.setCurrentChannel(9);
        radiopoint.increaseChannel();
        assertEquals(0, radiopoint.getCurrentChannel());
    }

    @Test
    void increaseVolume() {
        Radiopoint radiopoint = new Radiopoint();
        radiopoint.setCurrentVolume(3);
        radiopoint.increaseVolume();
        assertEquals(4, radiopoint.getCurrentVolume());
    }

    @Test
    void decreaseVolume() {
        Radiopoint radiopoint = new Radiopoint();
        radiopoint.setCurrentVolume(3);
        radiopoint.decreaseVolume();
        assertEquals(2, radiopoint.getCurrentVolume());
    }

    @Test
    void increaseChannel() {
        Radiopoint radiopoint = new Radiopoint();
        radiopoint.setCurrentChannel(5);
        radiopoint.increaseChannel();
        assertEquals(6, radiopoint.getCurrentChannel());
    }

    @Test
    void decreaseChannel() {
        Radiopoint radiopoint = new Radiopoint();
        radiopoint.setCurrentChannel(6);
        radiopoint.decreaseChannel();
        assertEquals(5, radiopoint.getCurrentChannel());
    }
    @Test
    public void increaseVolumeFromValue() {
        Radiopoint radiopoint = new Radiopoint();
        radiopoint.setCurrentVolume(19);
        radiopoint.increaseVolume();
        assertEquals(10, radiopoint.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeFromValue() {
        Radiopoint radiopoint = new Radiopoint();
        radiopoint.setCurrentVolume(23);
        radiopoint.decreaseVolume();
        assertEquals(9, radiopoint.getCurrentVolume());
    }
    @Test
    public void increaseChannelFromValue() {
        Radiopoint radiopoint = new Radiopoint();
        radiopoint.setCurrentChannel(19);
        radiopoint.increaseChannel();
        assertEquals(0, radiopoint.getCurrentChannel());
    }

    @Test
    public void decreaseChannelFromValue() {
        Radiopoint radiopoint = new Radiopoint();
        radiopoint.setCurrentChannel(20);
        radiopoint.decreaseChannel();
        assertEquals(8, radiopoint.getCurrentChannel());
    }

    @Test
    public void decreaseChannelFromMinus() {
        Radiopoint radiopoint = new Radiopoint();
        radiopoint.setCurrentChannel(-19);
        radiopoint.decreaseChannel();
        assertEquals(9, radiopoint.getCurrentChannel());
    }

    @Test
    public void decreaseVolumeFromMinus() {
        Radiopoint radiopoint = new Radiopoint();
        radiopoint.setCurrentVolume(-19);
        radiopoint.decreaseVolume();
        assertEquals(0, radiopoint.getCurrentVolume());
    }

}