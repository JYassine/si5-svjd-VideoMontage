/**
 */
package VideoMontage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VideoMontage.Video#getPath <em>Path</em>}</li>
 *   <li>{@link VideoMontage.Video#getName <em>Name</em>}</li>
 *   <li>{@link VideoMontage.Video#getClip <em>Clip</em>}</li>
 * </ul>
 *
 * @see VideoMontage.VideoMontagePackage#getVideo()
 * @model
 * @generated
 */
public interface Video extends VideoElement {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see VideoMontage.VideoMontagePackage#getVideo_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link VideoMontage.Video#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see VideoMontage.VideoMontagePackage#getVideo_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link VideoMontage.Video#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Clip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clip</em>' containment reference.
	 * @see #setClip(Clip)
	 * @see VideoMontage.VideoMontagePackage#getVideo_Clip()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Clip getClip();

	/**
	 * Sets the value of the '{@link VideoMontage.Video#getClip <em>Clip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clip</em>' containment reference.
	 * @see #getClip()
	 * @generated
	 */
	void setClip(Clip value);

} // Video
