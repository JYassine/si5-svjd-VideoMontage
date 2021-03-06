/**
 */
package VideoMontage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Font</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VideoMontage.Font#getLength <em>Length</em>}</li>
 *   <li>{@link VideoMontage.Font#getFontStyle <em>Font Style</em>}</li>
 * </ul>
 *
 * @see VideoMontage.VideoMontagePackage#getFont()
 * @model
 * @generated
 */
public interface Font extends EObject {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(String)
	 * @see VideoMontage.VideoMontagePackage#getFont_Length()
	 * @model
	 * @generated
	 */
	String getLength();

	/**
	 * Sets the value of the '{@link VideoMontage.Font#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(String value);

	/**
	 * Returns the value of the '<em><b>Font Style</b></em>' attribute.
	 * The literals are from the enumeration {@link VideoMontage.FontStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Style</em>' attribute.
	 * @see VideoMontage.FontStyle
	 * @see #setFontStyle(FontStyle)
	 * @see VideoMontage.VideoMontagePackage#getFont_FontStyle()
	 * @model
	 * @generated
	 */
	FontStyle getFontStyle();

	/**
	 * Sets the value of the '{@link VideoMontage.Font#getFontStyle <em>Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Style</em>' attribute.
	 * @see VideoMontage.FontStyle
	 * @see #getFontStyle()
	 * @generated
	 */
	void setFontStyle(FontStyle value);

} // Font
