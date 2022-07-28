package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    // Тесты на добавления фильмов
    @Test
    public void shouldAddFilms6() {
        PosterManager manager = new PosterManager();

        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");

        String[] actual = manager.findAll();
        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddFilm0() {
        PosterManager manager = new PosterManager();

        String[] actual = manager.findAll();
        String[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddFilm1() {
        PosterManager manager = new PosterManager();

        manager.addFilm("film1");

        String[] actual = manager.findAll();
        String[] expected = {"film1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    // Тесты на проверку вывода фильмов по умолчанию 10
    @Test
    public void shouldAddFilms4AndWithdraw4() {
        PosterManager manager = new PosterManager();

        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");

        String[] actual = manager.findLast();
        String[] expected = {
                "film4",
                "film3",
                "film2",
                "film1",
        };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddFilm0AndWithdraw0() {
        PosterManager manager = new PosterManager();

        String[] actual = manager.findLast();
        String[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddFilm1AndWithdraw1() {
        PosterManager manager = new PosterManager();

        manager.addFilm("film1");

        String[] actual = manager.findLast();
        String[] expected = {"film1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddFilms11AndWithdraw10() {
        PosterManager manager = new PosterManager();
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");
        manager.addFilm("film11");

        String[] actual = manager.findLast();
        String[] expected = {
                "film11",
                "film10",
                "film9",
                "film8",
                "film7",
                "film6",
                "film5",
                "film4",
                "film3",
                "film2"
        };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddFilms10AndWithdraw10() {
        PosterManager manager = new PosterManager();
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");

        String[] actual = manager.findLast();
        String[] expected = {
                "film10",
                "film9",
                "film8",
                "film7",
                "film6",
                "film5",
                "film4",
                "film3",
                "film2",
                "film1"
        };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddFilms9AndWithdraw9() {
        PosterManager manager = new PosterManager();
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");

        String[] actual = manager.findLast();
        String[] expected = {
                "film9",
                "film8",
                "film7",
                "film6",
                "film5",
                "film4",
                "film3",
                "film2",
                "film1"
        };

        Assertions.assertArrayEquals(expected, actual);
    }

    // Тесты на проверку вывода фильмов по лимиту
    @Test
    public void shouldAddFilm12AndWithdrawLimit12() {
        PosterManager manager = new PosterManager(12);
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");
        manager.addFilm("film11");
        manager.addFilm("film12");

        String[] actual = manager.findLast();
        String[] expected = {
                "film12",
                "film11",
                "film10",
                "film9",
                "film8",
                "film7",
                "film6",
                "film5",
                "film4",
                "film3",
                "film2",
                "film1",
        };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddFilm0AndWithdrawLimit0() {
        PosterManager manager = new PosterManager(0);

        String[] actual = manager.findLast();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddFilm1AndWithdrawLimit1() {
        PosterManager manager = new PosterManager(1);

        manager.addFilm("film1");

        String[] actual = manager.findLast();
        String[] expected = {"film1"};
        Assertions.assertArrayEquals(expected, actual);
    }
}
