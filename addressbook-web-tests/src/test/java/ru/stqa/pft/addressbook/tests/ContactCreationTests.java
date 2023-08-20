package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.initContactCreation();
    app.fillContactForm(new ContactData("Тест", "Тестович", "Тестов", "89131111608", "test@mail.ru"));
    app.saveContact();
    app.getNavigationHelper().goToHomePage();
  }
}
