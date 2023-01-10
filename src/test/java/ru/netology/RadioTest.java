package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetFirstStation() {
        Radio rad = new Radio(20);

        rad.setCurrentStation(0);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetLastStation() {
        Radio rad = new Radio(20);

        rad.setCurrentStation(19);

        int expected = 19;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetLastStationFromTen() {
        Radio rad = new Radio();

        rad.setCurrentStation(10);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetFirstStationFromTen() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLastStationFromTenAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentStation(10);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetFirstStationFromTenBelowMin() {
        Radio rad = new Radio();

        rad.setCurrentStation(-1);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetFirstStationBelowMin() {
        Radio rad = new Radio(20);

        rad.setCurrentStation(-1);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLastStationAboveMax() {
        Radio rad = new Radio(20);

        rad.setCurrentStation(21);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetNextStationAfterLast() {
        Radio rad = new Radio(20);

        rad.setCurrentStation(19);

        int expected = 0;
        int actual = rad.next();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetNextStationAfterFirst() {
        Radio rad = new Radio(20);

        rad.setCurrentStation(0);

        int expected = 1;
        int actual = rad.next();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetPrevStationBeforeFirst() {
        Radio rad = new Radio(20);
        rad.setCurrentStation(0);

        int expected = 19;
        int actual = rad.prev();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetPrevStationBeforeLast() {
        Radio rad = new Radio(20);
        rad.setCurrentStation(19);

        int expected = 18;
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
        rad.currentVolume = 100;

        int expected = 100;
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
        rad.currentVolume = 100;

        int expected = 99;
        int actual = rad.down();

        Assertions.assertEquals(expected, actual);
    }
}

