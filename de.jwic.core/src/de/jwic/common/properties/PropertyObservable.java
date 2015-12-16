package de.jwic.common.properties;

/**
 * Any control that has properties that can change from the UI (via user interaction or otherwise)
 * should implement this interface in order to notify interested parties of UI state change
 * Created by boogie on 10/28/14.
 */
public interface PropertyObservable {
	void addPropertyChangedListener(PropertyChangedListener listener);
	void removePropertyChangedListener(PropertyChangedListener listener);
}
