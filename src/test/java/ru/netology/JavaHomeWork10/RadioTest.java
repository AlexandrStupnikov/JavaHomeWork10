package ru.netology.JavaHomeWork10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
    // номер текущей радиостанции

    @Test
    public void shouldSetToMaxRadioStationNumber() { // Максимальная станция
        Radio cond = new Radio();

        cond.setRadioStationNumber(11);

        int expected = 0;
        int actual = cond.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationNumberAboveMax() {        // >10 станции
        Radio cond = new Radio();

        cond.setRadioStationNumber(0);

        int expected = 0;
        int actual = cond.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseRadioStationTest() {   //  Переключение выше станции если текущая <10 (+1)
        Radio cond = new Radio();

        cond.increaseRadioStation();

        int expected = 1;
        int actual = cond.RadioStationNumber;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseRadioStationTest() {   // Переключение ниже станции если текущая > 0 (-1)
        Radio cond = new Radio();

        cond.decreaseRadioStation();

        int expected = 0;
        int actual = cond.RadioStationNumber;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ToAnyRadioStation() { // Переключение с 0 по 9 станцию.
        Radio cond = new Radio();

        cond.setRadioStationNumber(0);

        int expected = 0;
        int actual = cond.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);

    }
    // номер текущей радиостанции
    //громкость звука
    @Test
    public void shouldSetToMaxVolume() {
        Radio cond = new Radio();

        cond.setToMaxVolume();

        int expected = 100;
        int actual = cond.SoundVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void etIncreaseTheSoundVolumeTest() { // Увелечение громкости от 0 до 100.

        Radio cond = new Radio();

        cond.setIncreaseTheSoundVolume(11);

        int expected = 11;
        int actual = cond.getSoundVolume();
        Assertions.assertEquals(expected, actual);






    }
    }