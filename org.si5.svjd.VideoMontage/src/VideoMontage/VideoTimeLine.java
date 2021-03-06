/**
 */
package VideoMontage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Time Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VideoMontage.VideoTimeLine#getVideos <em>Videos</em>}</li>
 * </ul>
 *
 * @see VideoMontage.VideoMontagePackage#getVideoTimeLine()
 * @model
 * @generated
 */
public interface VideoTimeLine extends EObject {
	/**
	 * Returns the value of the '<em><b>Videos</b></em>' reference list.
	 * The list contents are of type {@link VideoMontage.VideoElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Videos</em>' reference list.
	 * @see VideoMontage.VideoMontagePackage#getVideoTimeLine_Videos()
	 * @model required="true"
	 * @generated
	 */
	EList<VideoElement> getVideos();

} // VideoTimeLine
