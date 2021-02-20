/**
 */
package VideoMontage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Title</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VideoMontage.Title#getTextarea <em>Textarea</em>}</li>
 *   <li>{@link VideoMontage.Title#getBackgroundColor <em>Background Color</em>}</li>
 * </ul>
 *
 * @see VideoMontage.VideoMontagePackage#getTitle()
 * @model
 * @generated
 */
public interface Title extends VideoElement {
	/**
	 * Returns the value of the '<em><b>Textarea</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textarea</em>' containment reference.
	 * @see #setTextarea(TextArea)
	 * @see VideoMontage.VideoMontagePackage#getTitle_Textarea()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TextArea getTextarea();

	/**
	 * Sets the value of the '{@link VideoMontage.Title#getTextarea <em>Textarea</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textarea</em>' containment reference.
	 * @see #getTextarea()
	 * @generated
	 */
	void setTextarea(TextArea value);

	/**
	 * Returns the value of the '<em><b>Background Color</b></em>' attribute.
	 * The literals are from the enumeration {@link VideoMontage.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Color</em>' attribute.
	 * @see VideoMontage.Color
	 * @see #setBackgroundColor(Color)
	 * @see VideoMontage.VideoMontagePackage#getTitle_BackgroundColor()
	 * @model
	 * @generated
	 */
	Color getBackgroundColor();

	/**
	 * Sets the value of the '{@link VideoMontage.Title#getBackgroundColor <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Color</em>' attribute.
	 * @see VideoMontage.Color
	 * @see #getBackgroundColor()
	 * @generated
	 */
	void setBackgroundColor(Color value);

} // Title
