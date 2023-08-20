package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    initContactCreation();
    fillContactForm(new ContactData("Тест", "Тестович", "Тестов", "89131111608", "test@mail.ru"));
    saveContact();
    goToHomePage();
  }
}
