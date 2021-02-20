/**
 */
package VideoMontage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VideoMontage.Element#getDuration <em>Duration</em>}</li>
 *   <li>{@link VideoMontage.Element#getRelativemoment <em>Relativemoment</em>}</li>
 * </ul>
 *
 * @see VideoMontage.VideoMontagePackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(double)
	 * @see VideoMontage.VideoMontagePackage#getElement_Duration()
	 * @model
	 * @generated
	 */
	double getDuration();

	/**
	 * Sets the value of the '{@link VideoMontage.Element#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(double value);

	/**
	 * Returns the value of the '<em><b>Relativemoment</b></em>' containment reference list.
	 * The list contents are of type {@link VideoMontage.RelativeMoment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relativemoment</em>' containment reference list.
	 * @see VideoMontage.VideoMontagePackage#getElement_Relativemoment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RelativeMoment> getRelativemoment();

} // Element
