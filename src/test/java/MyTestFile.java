package test.java;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;

import main.java.MyMainSrc;
import main.java.Person;

public class MyTestFile {

	@Test
	public void test() {
		
		String test = "test";
		String result = test.substring(2);
		String expected = "st";
		
		assertThat(result, is(expected));
	}
	
	@Test
	public void getBaseList() {
		MyMainSrc mainSrc = new MyMainSrc();
		List<String> myList = mainSrc.getBaseList();
		
		int expected = 3;
		
		assertThat(myList.size(), is(expected));
	}
	
	@Test
	public void mockitoExample() {
		Person testPerson = mock(Person.class);
		
		testPerson.setName("Jason");
		testPerson.setAge(30);
		
		verify(testPerson, times(1)).setName(anyString());
		verify(testPerson, never()).getName();
			
	}
}
