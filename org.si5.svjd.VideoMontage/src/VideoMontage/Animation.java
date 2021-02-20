/**
 */
package VideoMontage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Animation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VideoMontage.Animation#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see VideoMontage.VideoMontagePackage#getAnimation()
 * @model abstract="true"
 * @generated
 */
public interface Animation extends EObject {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(double)
	 * @see VideoMontage.VideoMontagePackage#getAnimation_Duration()
	 * @model
	 * @generated
	 */
	double getDuration();

	/**
	 * Sets the value of the '{@link VideoMontage.Animation#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(double value);

} // Animation
