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
@ManagedBean(name = "form")
public final class FormManagedBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private int left;
	private int right;
	private int result;

	public void add() {
		result = left+right;
	}

	public int getLeft() {
		return left;
	}

	public void setLeft(final int left) {
		this.left = left;
	}

	public int getRight() {
		return right;
	}

	public void setRight(final int right) {
		this.right = right;
	}

	public int getResult() {
		return result;
	}

}
