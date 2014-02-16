/*
 * Attribution
 * CC BY
 * This license lets others distribute, remix, tweak,
 * and build upon your work, even commercially,
 * as long as they credit you for the original creation.
 * This is the most accommodating of licenses offered.
 * Recommended for maximum dissemination and use of licensed materials.
 *
 * http://creativecommons.org/licenses/by/3.0/
 * http://creativecommons.org/licenses/by/3.0/legalcode
 */
package com.thjug.managedbean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author nuboat
 */
public class FormManagedBeanNGTest {

	private static final Logger LOG = LoggerFactory.getLogger(FormManagedBeanNGTest.class);

	@Test
	public void testAdd() {
		final FormManagedBean instance = new FormManagedBean();
		instance.setLeft(3);
		instance.setRight(7);
		instance.add();

		LOG.debug("{} + {} = {}", 3, 7, 10);

		assertEquals(instance.getResult(), 10);
	}

}
