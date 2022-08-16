package junit.tutorial.ex03.e03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class NetworkResourcesTest {

	@InjectMocks // mockの適応先
	NetworkResources target;

	@Mock // 未完成のNetworkLoaderをmock化する
	NetworkLoader mockNetworkLoader;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() throws IOException {
		String exampleString = "Hello World";
		InputStream inputStream = new ByteArrayInputStream(exampleString.getBytes());
		doReturn(inputStream).when(mockNetworkLoader).getInput();
		
		assertEquals(exampleString, target.load());
	}
	
	
//	@Test
//	void test()  {
//		String exampleString = "Hello World";
//		InputStream inputStream = new ByteArrayInputStream(exampleString.getBytes());
//		doReturn(inputStream).when(mockNetworkLoader).getInput();
//		String result;
//		try {
//			result = target.load();
//			assertEquals(exampleString, result);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

	}
