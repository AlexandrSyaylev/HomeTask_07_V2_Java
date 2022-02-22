package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    public void shouldSetAndGetCurrentVolume() { //Max vol 10
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        int actual = radio.getCurrentVolume();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentVolumeWhetValueIsOverRange() { //Max vol 10
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeUpperBoard() { //Max vol 10
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMiddleRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeOneStepToUpperBoard() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeOneStepToLowerBoard() { //Max vol 10
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeMiddleRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeLowerBoard() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeWhenOverBoard() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50); //set midrange vol
        radio.setCurrentVolume(101);
        int actual = radio.getCurrentVolume();
        int expected = 50;
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
    public void ShouldSetStationWhenUpperDefaultBoard() { //Max station number 9
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
    public void ShouldSetStationWhenOverDefaultBoard() { //Max station number 9
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
    public void ShouldLoopNumberStationWhenIncreaseUpperDefaultBoard() {
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
    public void ShouldLoopNumberStationWhenDecreaseLowerDefaultBoard() { //Max station number 9
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotSetWhenValueIsOverRange() { //Max station number 9
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setCurrentStation(-1);
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }
    //______________________________Here_Test____Only_for_Set_MaxCount_Of_Stations_______________

    @Test
    public void ShouldSetUserQuantityStations() {
        Radio radio = new Radio(15); //for 15 stations last number is 14
        radio.setCurrentStation(11);
        int actual = radio.getCurrentStation();
        int expected = 11;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetStationWhenUpperUserBoard() { //Max station number 9
        Radio radio = new Radio(15); //for 15 stations last number is 14
        radio.setCurrentStation(14);
        int actual = radio.getCurrentStation();
        int expected = 14;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetStationWhenOverUserBoard() { //Max station number 9
        Radio radio = new Radio(15); //for 15 stations last number is 14
        radio.setCurrentStation(5);
        radio.setCurrentStation(15);
        int actual = radio.getCurrentStation();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldLoopNumberStationWhenIncreaseUpperUserBoard() {
        Radio radio = new Radio(15); //for 15 stations last number is 14
        radio.setCurrentStation(14);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldLoopNumberStationWhenDecreaseLowerUserBoard() { //Max station number 9
        Radio radio = new Radio(15); //for 15 stations last number is 14
        radio.setCurrentStation(0);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 14;
        assertEquals(expected, actual);
    }

}