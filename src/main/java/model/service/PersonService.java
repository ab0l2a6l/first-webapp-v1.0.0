package model.service;

import model.entity.Person;

import java.util.List;

public interface PersonService {

    void insert(Person person);

    void update(Person person);

    void delete(String id);

    Person getSomeone(String id);

    List<Person> getPerson();

}
