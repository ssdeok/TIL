package org.example;

public class MP3Player_2 {
   String model;
   int volume;
   boolean isOn;

    public MP3Player_2(String model, int volume, boolean isOn) {
        this.model = model;
        this.volume = 0;
        this.isOn = false;
    }

    boolean pushPowerButton() {
        if (this.isOn) {
            return this.turnOff();
        } else {
            return this.turnOn();
        }
    }
    boolean turnOn() {
        this.isOn = true;
        this.volume = 40;

        return this.isOn;
    }

    boolean turnOff() {
        this.isOn = false;
        this.volume = 0;
        return this.isOn;
    }

    int increaseVolume() {
        if (!isOn) {
            return 0;
        }
        this.volume += 20;
        if (this.volume >=100) {
            this.volume = 100;
        }
        return this.volume;
    }

    int decreaseVolume() {
        if (!isOn) {
            return 0;
        }
        this.volume -= 20;
        if (this.volume < 0) {
            this.volume = 0;
        }
        return this.volume;
    }

    void showInfo() {
        System.out.printf("model : %s, isOn : %d, volume : %d \n", model, isOn, volume);
    }
}
