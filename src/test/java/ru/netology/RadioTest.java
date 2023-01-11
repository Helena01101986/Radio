package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetStationFromTenOverMax() {
        Radio rad = new Radio();

        rad.setCurrentStation(10);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLastStationFromTen() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationFromTenBeforeMax() {
        Radio rad = new Radio();

        rad.setCurrentStation(8);

        int expected = 8;
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
    public void shouldSetStationFromTenBelowMin() {
        Radio rad = new Radio();

        rad.setCurrentStation(-1);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationFromTenAfterMin() {
        Radio rad = new Radio();

        rad.setCurrentStation(1);

        int expected = 1;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetFirstStation() {
        Radio rad = new Radio(20);

        rad.setCurrentStation(0);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAfterMin() {
        Radio rad = new Radio(20);

        rad.setCurrentStation(1);

        int expected = 1;
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
    public void shouldSetStationBelowMin() {
        Radio rad = new Radio(20);

        rad.setCurrentStation(-1);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAboveMax() {
        Radio rad = new Radio(20);

        rad.setCurrentStation(20);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBeforeMax() {
        Radio rad = new Radio(20);

        rad.setCurrentStation(18);

        int expected = 18;
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
    public void shouldGetNextStationBeforeLast() {
        Radio rad = new Radio(20);

        rad.setCurrentStation(18);

        int expected = 19;
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
    public void shouldGetNextStationAfterSecond() {
        Radio rad = new Radio(20);

        rad.setCurrentStation(1);

        int expected = 2;
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
    public void shouldGetPrevStationBeforeSecond() {
        Radio rad = new Radio(20);
        rad.setCurrentStation(1);

        int expected = 0;
        int actual = rad.prev();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetPrevStationBeforeLast() {
        Radio rad = new Radio(20);
        rad.setCurrentStation(18);

        int expected = 17;
        int actual = rad.prev();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldGetPrevStationAfterLast() {
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
    public void shouldGetVolumeUpOverMin() {
        Radio rad = new Radio();
        rad.currentVolume = 1;

        int expected = 2;
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
    public void shouldGetVolumeUpBelowMax() {
        Radio rad = new Radio();
        rad.currentVolume = 99;

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
    public void shouldGetVolumeDownOverMin() {
        Radio rad = new Radio();
        rad.currentVolume = 1;

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

    @Test
    public void shouldGetVolumeDownBelowMax() {
        Radio rad = new Radio();
        rad.currentVolume = 99;

        int expected = 98;
        int actual = rad.down();

        Assertions.assertEquals(expected, actual);
    }
}

