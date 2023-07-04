package model.repository;

import model.entity.Person;

import java.util.List;

public interface PersonDB {

    void insert(Person person)throws Exception;

    void delete(String id)throws Exception;

    void update(Person person)throws Exception;

    void close()throws Exception;

    Person getSomeone(String id)throws Exception;

    List<Person> getPerson()throws Exception;
}
