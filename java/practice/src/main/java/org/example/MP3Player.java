package org.example;

public class MP3Player {
    String model;
    int volume;
    boolean isOn;

    public MP3Player(String model) {
        this.model = model;
        this.volume = 0;
        this.isOn = false;
    }

    boolean pushPowerButton(){
        if (this.isOn){
//            this.isOn = false;
//            this.volume = 0;
            return this.turnOff();

        } else {
            return this.turnOn();
        }
    }
        //- 전원 켜기 - 전원을 키고, 볼륨을 40으로 설정
    boolean turnOn(){
        this.isOn = true;
        this.volume = 40;
//        if (성공){
//            return true
//        } else{
//            retur false
//        }
        return this.isOn;
    }
        //- 전원 끄기 - 전원을 끄고, 볼륨을 0으로 설정
    boolean turnOff(){
        this.isOn = false;
        this.volume = 0;
        return this.isOn;
    }
        //- 볼륨 증가 - 볼륨 20 증가 (최대 100)
    int increaseVolume(){
        if (!isOn){
            return 0;
        }
        this.volume += 20;
        if (this.volume > 100){
            this.volume = 100;
        }
        return this.volume;
    }
        //- 볼륨 감소 - 볼륨 20 감소 (최소 0)
    int decreaseVolume(){
        if (!isOn){
            return 0;
        }
        this.volume -= 20;
        if (this.volume < 0){
            this.volume = 0;
        }
//        return this.volume;
        return (this.volume < 0 ? 0 : this.volume);
    }
        //- 정보 조회
    void showInfo(){
        System.out.printf("model : %s , isOn : %b, volume : %d \n", model, isOn, volume);
    }
}
