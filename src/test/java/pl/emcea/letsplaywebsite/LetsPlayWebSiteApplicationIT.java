package pl.emcea.letsplaywebsite;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.fail;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LetsPlayWebSiteApplicationIT {

	@Test
	public void contextLoads() {
	}

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
}

