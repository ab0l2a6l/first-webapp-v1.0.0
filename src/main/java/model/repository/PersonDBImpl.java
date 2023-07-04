package model.repository;

import model.entity.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonDBImpl implements PersonDB {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public PersonDBImpl() throws Exception {
        System.out.println("before connect");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdb", "root", "Am311865186");
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("after connect");

    }

    public void insert(Person person) throws Exception {
        System.out.println("insering");
        preparedStatement = connection.prepareStatement("insert into person_list values (?,?,?)");
        preparedStatement.setString(1, person.getId());
        preparedStatement.setString(2, person.getName());
        preparedStatement.setString(3, person.getFamily());
        preparedStatement.executeUpdate();
        System.out.println("ok");
    }

    @Override
    public void delete(String id) throws Exception {
        System.out.println("deleting");
        preparedStatement = connection.prepareStatement("delete from person_list where id = ?");
        preparedStatement.setString(1,id);
        preparedStatement.executeUpdate();
        System.out.println("deleted");
    }

    @Override
    public void update(Person person) throws Exception {
        System.out.println("updating");
        preparedStatement = connection.prepareStatement("update person_list set name = ? , family =? where id =? ");
        preparedStatement.setString(1, person.getName());
        preparedStatement.setString(2, person.getFamily());
        preparedStatement.setString(3, person.getId());
        preparedStatement.executeUpdate();
        System.out.println("updated");
    }

    public void close() throws Exception {
        preparedStatement.close();
        connection.close();

    }

    @Override
    public Person getSomeone(String id) throws Exception {
        Person person = new Person();
        preparedStatement = connection.prepareStatement("select  * from person_list where id =?");
        preparedStatement.setString(1,id);
        ResultSet set = preparedStatement.executeQuery();
        if (set.next())
        {
            person.setId(id);
            person.setName(set.getString("name"));
            person.setFamily(set.getString("family"));
        }
        return person;
    }

    @Override
    public List<Person> getPerson() throws Exception {
        System.out.println("before set");
        preparedStatement = connection.prepareStatement("select * from person_list");
        ResultSet set = preparedStatement.executeQuery();
        System.out.println("after set");
        List<Person> list = new ArrayList<>();
        while (set.next()) {
            Person person = new Person();
            person.setId(set.getString("id"));
            person.setName(set.getString("name"));
            person.setFamily(set.getString("family"));

            list.add(person);
        }
        return list;
    }

}
