/*
 * generated by Xtext 2.24.0
 */
package org.xtext.svjd.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.svjd.videoMontageSVJD.Movie

@ExtendWith(InjectionExtension)
@InjectWith(VideoMontageSVJDInjectorProvider)
class VideoMontageSVJDParsingTest {
	@Inject
	ParseHelper<Movie> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
	}
}
