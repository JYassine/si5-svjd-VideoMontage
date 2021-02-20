/**
 */
package VideoMontage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audio Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VideoMontage.AudioElement#getName <em>Name</em>}</li>
 *   <li>{@link VideoMontage.AudioElement#getTransition <em>Transition</em>}</li>
 *   <li>{@link VideoMontage.AudioElement#getStartingmoment <em>Startingmoment</em>}</li>
 * </ul>
 *
 * @see VideoMontage.VideoMontagePackage#getAudioElement()
 * @model abstract="true"
 * @generated
 */
public interface AudioElement extends Element {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see VideoMontage.VideoMontagePackage#getAudioElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link VideoMontage.AudioElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference.
	 * @see #setTransition(Transition)
	 * @see VideoMontage.VideoMontagePackage#getAudioElement_Transition()
	 * @model containment="true"
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link VideoMontage.AudioElement#getTransition <em>Transition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' containment reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);

	/**
	 * Returns the value of the '<em><b>Startingmoment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startingmoment</em>' containment reference.
	 * @see #setStartingmoment(StartingMoment)
	 * @see VideoMontage.VideoMontagePackage#getAudioElement_Startingmoment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StartingMoment getStartingmoment();

	/**
	 * Sets the value of the '{@link VideoMontage.AudioElement#getStartingmoment <em>Startingmoment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startingmoment</em>' containment reference.
	 * @see #getStartingmoment()
	 * @generated
	 */
	void setStartingmoment(StartingMoment value);

} // AudioElement
