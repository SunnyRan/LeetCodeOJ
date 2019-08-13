package typeinfo;//: typeinfo/Position.java

class Position {
  private String title;
  private initialization.Person person;
  public Position(String jobTitle, initialization.Person employee) {
    title = jobTitle;
    person = employee;
    if(person == null)
      person = initialization.Person.NULL;
  }
  public Position(String jobTitle) {
    title = jobTitle;
    person = initialization.Person.NULL;
  }	
  public String getTitle() { return title; }
  public void setTitle(String newTitle) {
    title = newTitle;
  }
  public initialization.Person getPerson() { return person; }
  public void setPerson(initialization.Person newPerson) {
    person = newPerson;
    if(person == null)
      person = initialization.Person.NULL;
  }
  public String toString() {
    return "Position: " + title + " " + person;
  }
} ///:~
