/**
 */
package VideoMontage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VideoMontage.Audio#getPath <em>Path</em>}</li>
 *   <li>{@link VideoMontage.Audio#getAudioclip <em>Audioclip</em>}</li>
 * </ul>
 *
 * @see VideoMontage.VideoMontagePackage#getAudio()
 * @model
 * @generated
 */
public interface Audio extends AudioElement {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see VideoMontage.VideoMontagePackage#getAudio_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link VideoMontage.Audio#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Audioclip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audioclip</em>' containment reference.
	 * @see #setAudioclip(AudioClip)
	 * @see VideoMontage.VideoMontagePackage#getAudio_Audioclip()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AudioClip getAudioclip();

	/**
	 * Sets the value of the '{@link VideoMontage.Audio#getAudioclip <em>Audioclip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audioclip</em>' containment reference.
	 * @see #getAudioclip()
	 * @generated
	 */
	void setAudioclip(AudioClip value);

} // Audio
