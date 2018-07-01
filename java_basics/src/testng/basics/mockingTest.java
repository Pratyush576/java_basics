package testng.basics;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testng.demoAPI.demoAPI1;
import testng.demoAPI.demoServece;

import static org.mockito.Mockito.*;

public class mockingTest {
	@InjectMocks
	private demoServece ds = new demoServece();
	@Mock
	private demoAPI1 demo;

	@BeforeMethod(alwaysRun = true)
	public void injectDoubles() {
		MockitoAnnotations.initMocks(this); // This could be pulled up into a
											// shared base class
	}

	@Test
	public void splitsAddressesByComma() {
		when(demo.next()).thenReturn("jim@weirich.com,kent@beck.com");
		System.out.println(demo.next());
		String[] result = ds.split(demo.next());
		assertEquals(result[1], "kent@beck.com");
		// assertThat(result,hasItems("jim@weirich.com","kent@beck.com"));
	}

}
