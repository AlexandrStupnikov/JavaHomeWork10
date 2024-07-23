package ru.netology.JavaHomeWork10;

public class Radio {
    //номер текущей радиостанции,
    public int RadioStationNumber;

    public int getRadioStationNumber() {                           // >9 Станции
        return RadioStationNumber;
    }

    public void setRadioStationNumber(int newRadioStationNumber) { // переключение с 0 по 9 станцию
        if (newRadioStationNumber < 0) {
            newRadioStationNumber = 9;
        }
        if (newRadioStationNumber > 9) {
            newRadioStationNumber = 0;
        }

        RadioStationNumber = newRadioStationNumber;
    }

    public void maxRadioStation() {  ////      Максимальная станция
        RadioStationNumber = 9;
    }

    public void increaseRadioStation() {                          /// Переключение выше станции если текущая <9
        if (RadioStationNumber < 9) {
            RadioStationNumber = RadioStationNumber + 1;
        }
    }

    public void decreaseRadioStation() {                           // Переключение ниже станции если текущая > 0
        if (RadioStationNumber > 0) {
            RadioStationNumber = RadioStationNumber - 1;

        }
    }
    // номер текущей радиостанции

    //громкость звука

    public int SoundVolume;

    public void setToMaxVolume() {
        SoundVolume = 100;
    }
    public int getSoundVolume() {
        return SoundVolume;
    }

    public void setIncreaseTheSoundVolume(int newSoundVolume) {
        if (newSoundVolume > 100) {
            newSoundVolume = 100;
        }
        if (newSoundVolume < 0) {
            newSoundVolume = 0;
        }
        SoundVolume = newSoundVolume;
    }
}