/**
 */
package VideoMontage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see VideoMontage.VideoMontagePackage
 * @generated
 */
public interface VideoMontageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VideoMontageFactory eINSTANCE = VideoMontage.impl.VideoMontageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Movie</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Movie</em>'.
	 * @generated
	 */
	Movie createMovie();

	/**
	 * Returns a new object of class '<em>Subtitle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subtitle</em>'.
	 * @generated
	 */
	Subtitle createSubtitle();

	/**
	 * Returns a new object of class '<em>Title</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Title</em>'.
	 * @generated
	 */
	Title createTitle();

	/**
	 * Returns a new object of class '<em>Clip</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clip</em>'.
	 * @generated
	 */
	Clip createClip();

	/**
	 * Returns a new object of class '<em>Video</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Video</em>'.
	 * @generated
	 */
	Video createVideo();

	/**
	 * Returns a new object of class '<em>Audio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audio</em>'.
	 * @generated
	 */
	Audio createAudio();

	/**
	 * Returns a new object of class '<em>Audio Clip</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audio Clip</em>'.
	 * @generated
	 */
	AudioClip createAudioClip();

	/**
	 * Returns a new object of class '<em>Starting Moment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Starting Moment</em>'.
	 * @generated
	 */
	StartingMoment createStartingMoment();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	Element createElement();

	/**
	 * Returns a new object of class '<em>Relative Moment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relative Moment</em>'.
	 * @generated
	 */
	RelativeMoment createRelativeMoment();

	/**
	 * Returns a new object of class '<em>Absolute Moment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Absolute Moment</em>'.
	 * @generated
	 */
	AbsoluteMoment createAbsoluteMoment();

	/**
	 * Returns a new object of class '<em>Text Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Area</em>'.
	 * @generated
	 */
	TextArea createTextArea();

	/**
	 * Returns a new object of class '<em>Text Area Dynamic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Area Dynamic</em>'.
	 * @generated
	 */
	TextAreaDynamic createTextAreaDynamic();

	/**
	 * Returns a new object of class '<em>Fade In</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fade In</em>'.
	 * @generated
	 */
	FadeIn createFadeIn();

	/**
	 * Returns a new object of class '<em>Fade Out</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fade Out</em>'.
	 * @generated
	 */
	FadeOut createFadeOut();

	/**
	 * Returns a new object of class '<em>Font</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Font</em>'.
	 * @generated
	 */
	Font createFont();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VideoMontagePackage getVideoMontagePackage();

} //VideoMontageFactory
