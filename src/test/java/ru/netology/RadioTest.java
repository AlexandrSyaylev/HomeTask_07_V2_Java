package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    public void shouldSetAndGetCurrentVolume () { //Max vol 10
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        int actual = radio.getCurrentVolume();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeUpperBoard () { //Max vol 10
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMiddleRange () {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeOneStepToUpperBoard () {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeOneSteptoLowerBoard () { //Max vol 10
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeMiddleRange () {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeLowerBoard () {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeWhenOverBoard(){
        Radio radio = new Radio();
        radio.setCurrentVolume(5); //set midrange vol
        radio.setCurrentVolume(11);
        int actual = radio.getCurrentVolume();
        int expected = 5;
        assertEquals(expected, actual);
    }
    @Test
    public void ShouldSetAndGetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int actual = radio.getCurrentStation();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetStationWhenUpperBoard() { //Max station number 9
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int actual = radio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetStationWhenLowerBoard() { //Max station number 9
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetStationWhenOverBoard() { //Max station number 9
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setCurrentStation(10);
        int actual = radio.getCurrentStation();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldIncreaseCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldLoopNumberStationWhenIncreaseUpperBoard() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldDecreaseCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldLoopNumberStationWhenDecreaseLowerBoard() { //Max station number 9
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

}