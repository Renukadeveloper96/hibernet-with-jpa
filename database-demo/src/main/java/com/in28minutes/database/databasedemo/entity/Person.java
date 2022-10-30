package com.in28minutes.database.databasedemo.entity;

import javax.xml.crypto.Data;

public class Person {
private int id;
private String name;
private String location;
//private Data birthDate;


public Person() {}
//public Person(int id, String name, String location, Data birthDate) {
//	super();
//	this.id = id;
//	this.name = name;
//	this.location = location;
//	this.birthDate = birthDate;
//}



public int getId() {
	return id;
}

public Person(int id, String name, String location) {
	super();
	this.id = id;
	this.name = name;
	this.location = location;
}
public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}



@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", location=" + location + "]";
}

//public Data getBirthDate() {
//	return birthDate;
//}
//
//public void setBirthDate(Data birthDate) {
//	this.birthDate = birthDate;
//}

//@Override
//public String toString() {
//	return String.format("\nPerson [id=%s,name=%s,location=%s,birthDate=%s]",id,name,location,birthDate);
//}
//@Override
//public String toString() {
//	return String.format("\nPerson [id=%s,name=%s,location=%s]",id,name,location);
//}

}
