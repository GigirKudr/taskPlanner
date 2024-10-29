package ru.netology.tesks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {

    @Test
    public void simpleTaskTest(){
        SimpleTask test = new SimpleTask(2, "Задача");
        test.matches("Задача");

        Boolean expected = true;
        Boolean actual = test.matches("Задача");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void epicTest(){
        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
        Epic test = new Epic(2, subtasks);
        test.matches("Молоко");

        Boolean expected = true;
        Boolean actual = test.matches("Молоко");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void meetingTest(){
        Meeting test = new Meeting(555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");
        test.matches("Молоко");

        Boolean expected = false;
        Boolean actual = test.matches("Молоко");

        Assertions.assertEquals(expected, actual);
    }

}
