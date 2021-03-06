/**
 */
package VideoMontage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audio Clip</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VideoMontage.AudioClip#getVolume <em>Volume</em>}</li>
 *   <li>{@link VideoMontage.AudioClip#getStartCut <em>Start Cut</em>}</li>
 *   <li>{@link VideoMontage.AudioClip#getEndCut <em>End Cut</em>}</li>
 *   <li>{@link VideoMontage.AudioClip#getAudio <em>Audio</em>}</li>
 * </ul>
 *
 * @see VideoMontage.VideoMontagePackage#getAudioClip()
 * @model
 * @generated
 */
public interface AudioClip extends AudioElement {
	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see #setVolume(double)
	 * @see VideoMontage.VideoMontagePackage#getAudioClip_Volume()
	 * @model
	 * @generated
	 */
	double getVolume();

	/**
	 * Sets the value of the '{@link VideoMontage.AudioClip#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(double value);

	/**
	 * Returns the value of the '<em><b>Start Cut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Cut</em>' attribute.
	 * @see #setStartCut(double)
	 * @see VideoMontage.VideoMontagePackage#getAudioClip_StartCut()
	 * @model
	 * @generated
	 */
	double getStartCut();

	/**
	 * Sets the value of the '{@link VideoMontage.AudioClip#getStartCut <em>Start Cut</em>}' attribute.
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
	 * @see VideoMontage.VideoMontagePackage#getAudioClip_EndCut()
	 * @model
	 * @generated
	 */
	double getEndCut();

	/**
	 * Sets the value of the '{@link VideoMontage.AudioClip#getEndCut <em>End Cut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Cut</em>' attribute.
	 * @see #getEndCut()
	 * @generated
	 */
	void setEndCut(double value);

	/**
	 * Returns the value of the '<em><b>Audio</b></em>' reference list.
	 * The list contents are of type {@link VideoMontage.Audio}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audio</em>' reference list.
	 * @see VideoMontage.VideoMontagePackage#getAudioClip_Audio()
	 * @model
	 * @generated
	 */
	EList<Audio> getAudio();

} // AudioClip
