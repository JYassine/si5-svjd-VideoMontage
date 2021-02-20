/**
 */
package VideoMontage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Movie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VideoMontage.Movie#getAudioelement <em>Audioelement</em>}</li>
 *   <li>{@link VideoMontage.Movie#getVideoelement <em>Videoelement</em>}</li>
 *   <li>{@link VideoMontage.Movie#getTitle <em>Title</em>}</li>
 *   <li>{@link VideoMontage.Movie#getSubtitle <em>Subtitle</em>}</li>
 * </ul>
 *
 * @see VideoMontage.VideoMontagePackage#getMovie()
 * @model
 * @generated
 */
public interface Movie extends EObject {
	/**
	 * Returns the value of the '<em><b>Audioelement</b></em>' containment reference list.
	 * The list contents are of type {@link VideoMontage.AudioElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audioelement</em>' containment reference list.
	 * @see VideoMontage.VideoMontagePackage#getMovie_Audioelement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AudioElement> getAudioelement();

	/**
	 * Returns the value of the '<em><b>Videoelement</b></em>' containment reference list.
	 * The list contents are of type {@link VideoMontage.VideoElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Videoelement</em>' containment reference list.
	 * @see VideoMontage.VideoMontagePackage#getMovie_Videoelement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<VideoElement> getVideoelement();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see VideoMontage.VideoMontagePackage#getMovie_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link VideoMontage.Movie#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Subtitle</b></em>' containment reference list.
	 * The list contents are of type {@link VideoMontage.Subtitle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtitle</em>' containment reference list.
	 * @see VideoMontage.VideoMontagePackage#getMovie_Subtitle()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Subtitle> getSubtitle();

} // Movie
