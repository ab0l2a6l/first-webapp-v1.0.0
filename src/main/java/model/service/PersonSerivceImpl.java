package model.service;

import model.entity.Person;
import model.repository.PersonDB;
import model.repository.PersonDBImpl;

import java.util.ArrayList;
import java.util.List;

public class PersonSerivceImpl implements PersonService{

    PersonDB personDB;

    public void insert(Person person){
        try {
            personDB = new PersonDBImpl();
            personDB.insert(person);
            personDB.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void update(Person person) {
        try {
            personDB = new PersonDBImpl();
            personDB.update(person);
            personDB.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(String id) {
        try {
            personDB = new PersonDBImpl();
            personDB.delete(id);
            personDB.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Person getSomeone(String id) {
        Person person = new Person();
        try {
            personDB = new PersonDBImpl();
         person =personDB.getSomeone(id);
            personDB.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return person;
    }

    @Override
    public List<Person> getPerson() {
        List<Person> list = new ArrayList<>();
        try {
            personDB = new PersonDBImpl();
            list = personDB.getPerson();
            personDB.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

}
