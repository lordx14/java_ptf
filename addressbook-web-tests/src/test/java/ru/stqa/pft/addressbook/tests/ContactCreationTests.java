package ru.stqa.pft.addressbook.tests;

import ru.stqa.pft.addressbook.appmanager.ContactHelper;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;


/**
 * Created by user on 020 20.08.19.
 */
public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("test_name", "test_surname", "test1"), true);
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomePage();
  }
}

