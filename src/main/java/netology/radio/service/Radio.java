package netology.radio.service;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume != 100) {
            currentVolume++;
            return;
        }

    }

    public void reduceVolume() {
        if (currentVolume != 0) {
            currentVolume--;
            return;
        }
    }

    // public void increaseVolumeOverMax() {
    //     if (currentVolume > 100) {
    //         currentVolume = 100;
    //     }
    // }

    // public void reduceVolumeUnderMinimum() {
    //     if (currentVolume < 0) {
    //         currentVolume = 0;
    //     }
    // }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setNextRadioStation() {
        if (currentRadioStation != 9) {
            currentRadioStation++;
            return;
        }
        currentRadioStation = 0;
    }

    public void setPrevRadioStation() {
        if (currentRadioStation != 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = 9;
        }

    }

    // public void setNextRadioStationOverMax() {
    //     if (currentRadioStation > 9) {
    //         currentRadioStation = 0;
    //     }
    // }

    // public void setPreviousRadioStationUnderMinimum() {
    //     if (currentRadioStation < 0) {
    //         currentRadioStation = 9;
    //     }
    // }

    //public void setToMaxStation() {
    //    currentRadioStation = 9;
    //}

    // public void setToMinStation() {
    //     currentRadioStation = 0;
    // }


}