/*
 * generated by Xtext 2.24.0
 */
package org.xtext.svjd.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.svjd.VideoMontageSVJD.ui.internal.VideoMontageSVJDActivator;

public class VideoMontageSVJDUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return VideoMontageSVJDActivator.getInstance().getInjector("org.xtext.svjd.VideoMontageSVJD");
	}

}
