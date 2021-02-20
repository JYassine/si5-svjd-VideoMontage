/**
 */
package VideoMontage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VideoMontage.Transition#getDuration <em>Duration</em>}</li>
 *   <li>{@link VideoMontage.Transition#getAudioelement <em>Audioelement</em>}</li>
 * </ul>
 *
 * @see VideoMontage.VideoMontagePackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(double)
	 * @see VideoMontage.VideoMontagePackage#getTransition_Duration()
	 * @model
	 * @generated
	 */
	double getDuration();

	/**
	 * Sets the value of the '{@link VideoMontage.Transition#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(double value);

	/**
	 * Returns the value of the '<em><b>Audioelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audioelement</em>' containment reference.
	 * @see #setAudioelement(AudioElement)
	 * @see VideoMontage.VideoMontagePackage#getTransition_Audioelement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AudioElement getAudioelement();

	/**
	 * Sets the value of the '{@link VideoMontage.Transition#getAudioelement <em>Audioelement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audioelement</em>' containment reference.
	 * @see #getAudioelement()
	 * @generated
	 */
	void setAudioelement(AudioElement value);

} // Transition
