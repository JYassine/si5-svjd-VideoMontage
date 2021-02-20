/**
 */
package VideoMontage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subtitle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VideoMontage.Subtitle#getTextarea <em>Textarea</em>}</li>
 *   <li>{@link VideoMontage.Subtitle#getStartingmoment <em>Startingmoment</em>}</li>
 * </ul>
 *
 * @see VideoMontage.VideoMontagePackage#getSubtitle()
 * @model
 * @generated
 */
public interface Subtitle extends Element {
	/**
	 * Returns the value of the '<em><b>Textarea</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textarea</em>' containment reference.
	 * @see #setTextarea(TextArea)
	 * @see VideoMontage.VideoMontagePackage#getSubtitle_Textarea()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TextArea getTextarea();

	/**
	 * Sets the value of the '{@link VideoMontage.Subtitle#getTextarea <em>Textarea</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textarea</em>' containment reference.
	 * @see #getTextarea()
	 * @generated
	 */
	void setTextarea(TextArea value);

	/**
	 * Returns the value of the '<em><b>Startingmoment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startingmoment</em>' containment reference.
	 * @see #setStartingmoment(StartingMoment)
	 * @see VideoMontage.VideoMontagePackage#getSubtitle_Startingmoment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StartingMoment getStartingmoment();

	/**
	 * Sets the value of the '{@link VideoMontage.Subtitle#getStartingmoment <em>Startingmoment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startingmoment</em>' containment reference.
	 * @see #getStartingmoment()
	 * @generated
	 */
	void setStartingmoment(StartingMoment value);

} // Subtitle
