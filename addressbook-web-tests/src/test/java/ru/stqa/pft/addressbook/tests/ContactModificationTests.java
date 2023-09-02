package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    app.getNavigationHelper().goToHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Тест", "Тестович", "Тестов", "89131111608", "test@mail.ru"));
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().goToHomePage();
  }
}