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
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author nuboat
 */
@RequestScoped
@ManagedBean(name = "index")
public final class IndexManagedBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private String hello;

	public IndexManagedBean() {
		setHello("Hello World !");
	}

	public String getHello() {
		return hello;
	}

	public void setHello(final String hello) {
		this.hello = hello;
	}

}
