/*
 * generated by Xtext 2.21.0
 */
package org.xtext.svjd.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.svjd.VideoMontage.ui.internal.VideoMontageActivator;

public class VideoMontageUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return VideoMontageActivator.getInstance().getInjector("org.xtext.svjd.VideoMontage");
	}

}
