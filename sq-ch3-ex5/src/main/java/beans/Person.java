package beans;

import org.springframework.stereotype.Component;

@Component
public class Person {

  private String name = "Ella";

  private final Parrot parrot;

  //    @Autowired //if one constructor so can omit the annotation
  public Person(Parrot parrot) {
    this.parrot = parrot;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Parrot getParrot() {
    return parrot;
  }

  // no setParrot needed
}
