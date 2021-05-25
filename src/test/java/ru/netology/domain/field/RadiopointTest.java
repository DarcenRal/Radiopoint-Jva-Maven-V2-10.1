package ru.netology.domain.field;

import org.junit.jupiter.api.Test;
import ru.netology.domain.field.Radiopoint;

import static org.junit.jupiter.api.Assertions.*;

class RadiopointTest {

    @Test
    void shouldSetNextChannel() {
        Radiopoint radiopoint = new Radiopoint(6,10);
        radiopoint.increaseChannal();
        assertEquals(7, radiopoint.getCurrentChannal());
    }

    @Test
    void shouldSetPreviousChannal() {
        Radiopoint radiopoint = new Radiopoint(6,10);
        radiopoint.decreaseChannal();
        assertEquals(5, radiopoint.getCurrentChannal());
    }

    @Test
    void decreaseVolume() {
        Radiopoint radiopoint = new Radiopoint(100, 0, 30);
        radiopoint.decreaseVolume();
        assertEquals(29, radiopoint.getCurrentVolume());
    }

    @Test
    void increaseVolume() {
        Radiopoint radiopoint = new Radiopoint(100, 0, 30);
        radiopoint.increaseVolume();
        assertEquals(31, radiopoint.getCurrentVolume());
    }

    @Test
    public void increaseVolumeFromMaxVolume() {
        Radiopoint radiopoint = new Radiopoint();
        radiopoint.setCurrentVolume(100);
        radiopoint.increaseVolume();
        assertEquals(100, radiopoint.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeFromMinVolume() {
        Radiopoint radiopoint = new Radiopoint();
        radiopoint.setCurrentVolume(0);
        radiopoint.decreaseVolume();
        assertEquals(0, radiopoint.getCurrentVolume());
    }

    @Test
    public void setDesiredChannel() {
        Radiopoint radiopoint = new Radiopoint(1,10);
        assertEquals(1, radiopoint.getCurrentChannal());
    }
    @Test
    public void increaseChannelFromMax() {
        Radiopoint radiopoint = new Radiopoint();
        radiopoint.setCurrentChannal(10);
        radiopoint.increaseChannal();
        assertEquals(0, radiopoint.getCurrentChannal());
    }

    @Test
    public void increaseVolumeFromValue() {
        Radiopoint radiopoint = new Radiopoint();
        radiopoint.setCurrentVolume(250);
        radiopoint.increaseVolume();
        assertEquals(100, radiopoint.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeFromValue() {
        Radiopoint radiopoint = new Radiopoint();
        radiopoint.setCurrentVolume(250);
        radiopoint.decreaseVolume();
        assertEquals(99, radiopoint.getCurrentVolume());
    }

    @Test
    public void increaseChannelFromValue() {
        Radiopoint radiopoint = new Radiopoint();
        radiopoint.setCurrentChannal(20);
        radiopoint.increaseChannal();
        assertEquals(0, radiopoint.getCurrentChannal());
    }

    @Test
    public void setCurrentChannelOver() {
        Radiopoint radiopoint = new Radiopoint();
        radiopoint.setCurrentChannal(20);
        assertEquals(10, radiopoint.getCurrentChannal());
    }
    @Test
    public void previousChannelFromMinus() {
        Radiopoint radiopoint = new Radiopoint();
        radiopoint.setCurrentChannal(-1);
        assertEquals(0, radiopoint.getCurrentChannal());
    }

    @Test
    public void decreaseVolumeFromMinus() {
        Radiopoint radiopoint = new Radiopoint();
        radiopoint.setCurrentVolume(-10);
        radiopoint.decreaseVolume();
        assertEquals(0, radiopoint.getCurrentVolume());
    }


}