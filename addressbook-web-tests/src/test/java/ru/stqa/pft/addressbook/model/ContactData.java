package ru.stqa.pft.addressbook.model;

public class ContactData {
  private  String firstname;
  private  String middlename;
  private  String lastname;
  private  String mobile;
  private  String email;
  private  String group;
  private String contactline;

  public ContactData(String firstname, String middlename, String lastname, String mobile, String email, String group) {
    this.firstname = firstname;
    this.middlename = middlename;
    this.lastname = lastname;
    this.mobile = mobile;
    this.email = email;
    this.group = group;
  }


  public ContactData(String contactline) {

    this.contactline = contactline;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getMiddlename() {
    return middlename;
  }

  public String getLastname() {
    return lastname;
  }

  public String getMobile() {
    return mobile;
  }

  public String getEmail() {
    return email;
  }

  public String getGroup() {
    return group;
  }
}
