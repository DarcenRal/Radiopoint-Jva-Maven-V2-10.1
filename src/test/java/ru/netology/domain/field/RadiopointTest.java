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
        Radiopoint radiopoint = new Radiopoint();
        radiopoint.setCurrentVolume(5);
        radiopoint.decreaseVolume();
        assertEquals(4, radiopoint.getCurrentVolume());
    }

    @Test
    void increaseVolume() {
        Radiopoint radiopoint = new Radiopoint();
        radiopoint.setCurrentVolume(5);
        radiopoint.increaseVolume();
        assertEquals(6, radiopoint.getCurrentVolume());
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
    public void previousChannelFromMin() {
        Radiopoint radiopoint = new Radiopoint(0,80,90,9,20,9);
        radiopoint.decreaseChannal();
        assertEquals(9, radiopoint.getCurrentChannal());
    }

    @Test
    public void setDesiredChannel() {
        Radiopoint radiopoint = new Radiopoint();
        radiopoint.setCurrentChannal(5);
        assertEquals(5, radiopoint.getCurrentChannal());
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
    public void previousChannelFromValue() {
        Radiopoint radiopoint = new Radiopoint();
        radiopoint.setCurrentChannal(20);
        radiopoint.decreaseChannal();
        assertEquals(9, radiopoint.getCurrentChannal());
    }
    @Test
    public void previousChannelFromMinus() {
        Radiopoint radiopoint = new Radiopoint();
        radiopoint.setCurrentChannal(-20);
        radiopoint.decreaseChannal();
        assertEquals(9, radiopoint.getCurrentChannal());
    }

    @Test
    public void decreaseVolumeFromMinus() {
        Radiopoint radiopoint = new Radiopoint();
        radiopoint.setCurrentVolume(-10);
        radiopoint.decreaseVolume();
        assertEquals(0, radiopoint.getCurrentVolume());
    }


}