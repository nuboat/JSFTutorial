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

import java.io.Serializable;
import java.util.LinkedHashMap;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author nuboat
 */
@RequestScoped
@ManagedBean(name = "el")
public class ElManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private final LinkedHashMap<Long, Long> map = new LinkedHashMap<>();

	public ElManagedBean() {
		map.put(1L, 1L);
		map.put(2L, 2L);
	}

	public LinkedHashMap<Long, Long> getMap() {
		return map;
	}
	
}
