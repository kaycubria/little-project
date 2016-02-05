package little_project;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kcubria on 2/4/16.
 */
@RestController
@RequestMapping(path = "/people")
public class PersonController {

	@Autowired
	private PersonRepository people;

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		System.out.println("test");
				return "OK";
	}

	@RequestMapping(value = "/{personLastName}", method = RequestMethod.GET)
	public List<Person> getPerson(@PathVariable("personLastName") final String personLastName) {
		return people.findByLastName(personLastName);
	}

}
