package de.jwic.mobile.common.enableable;

import de.jwic.base.Control;

/**
 * Created by boogie on 10/29/14.
 */
public final class EnableableHandler implements Enableable{
	private final Control control;
	private boolean enabled;

	public EnableableHandler(Control control) {
		this.control = control;
	}

	@Override
	public void enable() {
		this.setEnabled(true);
	}

	@Override
	public void disable() {
		this.setEnabled(false);
	}

	@Override
	public boolean isEnabled() {
		return this.enabled;
	}

	@Override
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
		control.requireRedraw();
	}
}
