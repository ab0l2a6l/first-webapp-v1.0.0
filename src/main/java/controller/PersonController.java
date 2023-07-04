package controller;

import model.entity.Person;
import model.service.PersonSerivceImpl;
import model.service.PersonService;

import java.util.List;

public class PersonController {

    PersonService personService = new PersonSerivceImpl();

    public void insert(Person person) {
        personService.insert(person);
    }

    public List<Person> getPerson() {
        System.out.println("controller");
        List<Person> list = personService.getPerson();
        System.out.println("list controller");
        System.out.println(list);
        return list;
    }

    public void delete(String id) {
        personService.delete(id);
    }

    public void update(Person person) {
        personService.update(person);
    }

    public Person getSomeone(String id) {
        return personService.getSomeone(id);
    }
}
