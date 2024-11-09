package ru.netology.tesks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {

    @Test
    public void simpleTaskMatches() {
        SimpleTask test = new SimpleTask(2, "Задача");
        Boolean actual = test.matches("Задача");

        Assertions.assertTrue(actual);
    }

    @Test
    public void simpleTaskNotMatches() {
        SimpleTask test = new SimpleTask(2, "Задача");
        Boolean actual = test.matches("Конь");

        Assertions.assertFalse(actual);
    }

    @Test
    public void epicMatches() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic test = new Epic(2, subtasks);
        Boolean actual = test.matches("Молоко");


        Assertions.assertTrue(actual);
    }

    @Test
    public void epicNotMatches() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic test = new Epic(2, subtasks);
        Boolean actual = test.matches("Сметана");


        Assertions.assertFalse(actual);
    }

    @Test
    public void meetingMatchesTopic() {
        Meeting test = new Meeting(555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");
        Boolean actual = test.matches("Выкатка 3й версии приложения");

        Assertions.assertTrue(actual);
    }

    @Test
    public void meetingNotMatches() {
        Meeting test = new Meeting(555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");
        Boolean actual = test.matches("Приложение ВТБ");

        Assertions.assertFalse(actual);
    }

    @Test
    public void meetingMatchesProject() {
        Meeting test = new Meeting(555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");
        Boolean actual = test.matches("Приложение НетоБанка");

        Assertions.assertTrue(actual);
    }

}
