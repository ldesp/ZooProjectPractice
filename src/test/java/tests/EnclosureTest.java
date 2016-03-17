
package tests;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import enclosurepackage.EnclosureManager;
import enclosurepackage.EnclosureService;

public class EnclosureTest {

	private EnclosureManager	manager;
	private EnclosureService	service;

	@Before
	public void setup() {
		service = mock(EnclosureService.class);
		manager = new EnclosureManager(service);
	}

	@Test
	public void givenEnclosureService_whenCallRetrieveAllEnclosure_thenNotEmptyList() {
		List<String> expectedList = new ArrayList<>();
		expectedList.add("Lion's Den");
		expectedList.add("Zebra's Enclosure");
		when(service.retrieveAllEnclosuresFromDataBase()).thenReturn(expectedList);
		manager.showEnclosuresClicked();
		int expectedCount = 2;
		assertEquals(expectedCount, manager.getEnclosures().size());
	}
}
