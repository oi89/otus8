package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.CoursePage;
import pages.MainPage;

@Epic("Тесты на страницу курсов")
@DisplayName("Тесты на страницу курсов")
public class CoursePageTest extends BaseTest {
    MainPage mainPage;
    CoursePage coursePage;

    @Test
    @Story("Проверка курса по JavaScript разработке")
    @Description("Тест проверяет заголовок и кнопку записи на странице курса по JavaScript разработке")
    @DisplayName("Проверка курса по JavaScript разработке")
    public void checkJsCoursePageTest() {
        String expectedCourseName = "JavaScript Developer. Professional";
        String expectedButtonName = "Успеть на курс";

        mainPage = new MainPage(driver);
        coursePage = new CoursePage(driver);

        mainPage
                .open()
                .clickMainMenuByName("Курсы")
                .openSecondLevelMenuByName("Программирование")
                .clickSecondLevelMenuByName("JavaScript Developer. Professional");

        Assertions.assertEquals(expectedCourseName, coursePage.getTitleText(),
                String.format("Заголовок страницы должен быть равен %s", expectedCourseName));

        Assertions.assertEquals(expectedButtonName, coursePage.getButtonText(),
                String.format("На странице курса должна быть кнопка %s", expectedButtonName));
    }

    @Test
    @Story("Проверка курса по базам данных")
    @Description("Тест проверяет заголовок и кнопку записи на странице курса по базам данных")
    @DisplayName("Проверка курса по базам данных")
    public void checkDatabaseCoursePageTest() {
        String expectedCourseName = "Базы данных";
        String expectedButtonName = "Успеть на курс";

        mainPage = new MainPage(driver);
        coursePage = new CoursePage(driver);

        mainPage
                .open()
                .clickMainMenuByName("Курсы")
                .openSecondLevelMenuByName("Программирование")
                .clickSecondLevelMenuByName("Базы данных");

        Assertions.assertEquals(expectedCourseName, coursePage.getTitleText(),
                String.format("Заголовок страницы должен быть равен %s", expectedCourseName));

        Assertions.assertEquals(expectedButtonName, coursePage.getButtonText(),
                String.format("На странице курса должна быть кнопка %s", expectedButtonName));
    }

    @Test
    @Story("Проверка курса по тестированию Java QA")
    @Description("Тест проверяет заголовок и кнопку записи на странице курса по тестированию Java QA")
    @DisplayName("Проверка курса по тестированию Java QA")
    public void checkJavaQaCoursePageTest() {
        String expectedCourseName = "Java QA Automation Engineer";
        String expectedButtonName = "Вступительное тестирование";

        mainPage = new MainPage(driver);
        coursePage = new CoursePage(driver);

        mainPage
                .open()
                .clickMainMenuByName("Курсы")
                .openSecondLevelMenuByName("Тестирование")
                .clickSecondLevelMenuByName("Java QA Engineer");

        Assertions.assertEquals(expectedCourseName, coursePage.getTitleText(),
                String.format("Заголовок страницы должен быть равен %s", expectedCourseName));

        Assertions.assertEquals(expectedButtonName, coursePage.getButtonText(),
                String.format("На странице курса должна быть кнопка %s", expectedButtonName));
    }
}
