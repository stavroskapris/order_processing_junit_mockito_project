package junit_mockito_project.mockito.spy;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

public class ListTest {
	@Spy
	List<String> myList = new ArrayList<>();

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void test() {
		myList.add("stavros");
		myList.add("punk");

		Mockito.doReturn(3).when(myList).size();
		assertSame(3, myList.size());
	}
}
