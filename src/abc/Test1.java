package abc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test1 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}



	@Test
	void test() {
		 Assertions.assertEquals("Hello world", "hi");
	}

}
