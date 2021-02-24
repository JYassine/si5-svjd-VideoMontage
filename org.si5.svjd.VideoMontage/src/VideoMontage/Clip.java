/**
 */
package VideoMontage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clip</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VideoMontage.Clip#getStartCut <em>Start Cut</em>}</li>
 *   <li>{@link VideoMontage.Clip#getEndCut <em>End Cut</em>}</li>
 *   <li>{@link VideoMontage.Clip#getName <em>Name</em>}</li>
 *   <li>{@link VideoMontage.Clip#getVideo <em>Video</em>}</li>
 * </ul>
 *
 * @see VideoMontage.VideoMontagePackage#getClip()
 * @model
 * @generated
 */
public interface Clip extends VideoElement {
	/**
	 * Returns the value of the '<em><b>Start Cut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Cut</em>' attribute.
	 * @see #setStartCut(double)
	 * @see VideoMontage.VideoMontagePackage#getClip_StartCut()
	 * @model
	 * @generated
	 */
	double getStartCut();

	/**
	 * Sets the value of the '{@link VideoMontage.Clip#getStartCut <em>Start Cut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Cut</em>' attribute.
	 * @see #getStartCut()
	 * @generated
	 */
	void setStartCut(double value);

	/**
	 * Returns the value of the '<em><b>End Cut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Cut</em>' attribute.
	 * @see #setEndCut(double)
	 * @see VideoMontage.VideoMontagePackage#getClip_EndCut()
	 * @model
	 * @generated
	 */
	double getEndCut();

	/**
	 * Sets the value of the '{@link VideoMontage.Clip#getEndCut <em>End Cut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Cut</em>' attribute.
	 * @see #getEndCut()
	 * @generated
	 */
	void setEndCut(double value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see VideoMontage.VideoMontagePackage#getClip_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link VideoMontage.Clip#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Video</b></em>' containment reference list.
	 * The list contents are of type {@link VideoMontage.Video}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video</em>' containment reference list.
	 * @see VideoMontage.VideoMontagePackage#getClip_Video()
	 * @model containment="true"
	 * @generated
	 */
	EList<Video> getVideo();

} // Clip
