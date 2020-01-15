package com.fish.rpc.test.hello;

import com.fish.rpc.test.dto.Person;

public interface ISayHello {
	void hello();
	String echo(String speak);
	Integer helloInt();
	Integer savePerson(Person person);
	Person getPersion();
	double why();
}
