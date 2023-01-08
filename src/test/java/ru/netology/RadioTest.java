package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetFirstStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetLastStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAboveLast() {
        Radio rad = new Radio();

        rad.setCurrentStation(10);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBelowFirst() {
        Radio rad = new Radio();

        rad.setCurrentStation(-1);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetNextStationAfterLast() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);

        int expected = 0;
        int actual = rad.next();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetNextStationAfterFirst() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);

        int expected = 1;
        int actual = rad.next();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetPrevStationBeforeFirst() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);

        int expected = 9;
        int actual = rad.prev();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetPrevStationBeforeLast() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);

        int expected = 8;
        int actual = rad.prev();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetVolumeUpMin() {
        Radio rad = new Radio();
        rad.currentVolume = 0;

        int expected = 1;
        int actual = rad.up();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetVolumeUpMax() {
        Radio rad = new Radio();
        rad.currentVolume = 10;

        int expected = 10;
        int actual = rad.up();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetVolumeDownMin() {
        Radio rad = new Radio();
        rad.currentVolume = 0;

        int expected = 0;
        int actual = rad.down();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetVolumeDownMax() {
        Radio rad = new Radio();
        rad.currentVolume = 10;

        int expected = 9;
        int actual = rad.down();

        Assertions.assertEquals(expected, actual);
    }
}


