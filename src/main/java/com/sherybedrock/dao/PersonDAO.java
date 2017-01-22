package com.sherybedrock.dao;

import java.util.List;

import com.sherybedrock.model.Person;

public interface PersonDAO {

	public void save(Person p);

	public List<Person> list();

}
