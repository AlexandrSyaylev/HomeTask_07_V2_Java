package ru.netology;

public class Radio {
    private int currentVolume = 0;
    //private int maximumVolume = 100;
    private int currentStation = 0;
    private int maximumStations = 10;

    public Radio(int maximumStations) {
        this.maximumStations = maximumStations;
    }

    public Radio() {

    }

    public void nextStation() {
        currentStation++;
        if (currentStation >= maximumStations) {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = maximumStations - 1;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation >= 0 & currentStation < maximumStations) {
            this.currentStation = currentStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= 0 & currentVolume <= 100) {
            this.currentVolume = currentVolume;
        }
    }
}
