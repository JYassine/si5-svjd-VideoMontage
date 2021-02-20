/**
 */
package VideoMontage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VideoMontage.TextArea#getX <em>X</em>}</li>
 *   <li>{@link VideoMontage.TextArea#getY <em>Y</em>}</li>
 *   <li>{@link VideoMontage.TextArea#getWidth <em>Width</em>}</li>
 *   <li>{@link VideoMontage.TextArea#getHeight <em>Height</em>}</li>
 *   <li>{@link VideoMontage.TextArea#getText <em>Text</em>}</li>
 *   <li>{@link VideoMontage.TextArea#getFont <em>Font</em>}</li>
 *   <li>{@link VideoMontage.TextArea#getAnimation <em>Animation</em>}</li>
 * </ul>
 *
 * @see VideoMontage.VideoMontagePackage#getTextArea()
 * @model
 * @generated
 */
public interface TextArea extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see VideoMontage.VideoMontagePackage#getTextArea_X()
	 * @model
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link VideoMontage.TextArea#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(int)
	 * @see VideoMontage.VideoMontagePackage#getTextArea_Y()
	 * @model
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link VideoMontage.TextArea#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see VideoMontage.VideoMontagePackage#getTextArea_Width()
	 * @model
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link VideoMontage.TextArea#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see VideoMontage.VideoMontagePackage#getTextArea_Height()
	 * @model
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link VideoMontage.TextArea#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see VideoMontage.VideoMontagePackage#getTextArea_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link VideoMontage.TextArea#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Font</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font</em>' reference.
	 * @see #setFont(Font)
	 * @see VideoMontage.VideoMontagePackage#getTextArea_Font()
	 * @model required="true"
	 * @generated
	 */
	Font getFont();

	/**
	 * Sets the value of the '{@link VideoMontage.TextArea#getFont <em>Font</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font</em>' reference.
	 * @see #getFont()
	 * @generated
	 */
	void setFont(Font value);

	/**
	 * Returns the value of the '<em><b>Animation</b></em>' containment reference list.
	 * The list contents are of type {@link VideoMontage.Animation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animation</em>' containment reference list.
	 * @see VideoMontage.VideoMontagePackage#getTextArea_Animation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Animation> getAnimation();

} // TextArea
