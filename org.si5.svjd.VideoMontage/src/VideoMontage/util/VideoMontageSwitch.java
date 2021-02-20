/**
 */
package VideoMontage.util;

import VideoMontage.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see VideoMontage.VideoMontagePackage
 * @generated
 */
public class VideoMontageSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VideoMontagePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoMontageSwitch() {
		if (modelPackage == null) {
			modelPackage = VideoMontagePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case VideoMontagePackage.MOVIE: {
				Movie movie = (Movie)theEObject;
				T result = caseMovie(movie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideoMontagePackage.VIDEO_ELEMENT: {
				VideoElement videoElement = (VideoElement)theEObject;
				T result = caseVideoElement(videoElement);
				if (result == null) result = caseElement(videoElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideoMontagePackage.AUDIO_ELEMENT: {
				AudioElement audioElement = (AudioElement)theEObject;
				T result = caseAudioElement(audioElement);
				if (result == null) result = caseElement(audioElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideoMontagePackage.SUBTITLE: {
				Subtitle subtitle = (Subtitle)theEObject;
				T result = caseSubtitle(subtitle);
				if (result == null) result = caseElement(subtitle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideoMontagePackage.TITLE: {
				Title title = (Title)theEObject;
				T result = caseTitle(title);
				if (result == null) result = caseVideoElement(title);
				if (result == null) result = caseElement(title);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideoMontagePackage.CLIP: {
				Clip clip = (Clip)theEObject;
				T result = caseClip(clip);
				if (result == null) result = caseVideoElement(clip);
				if (result == null) result = caseElement(clip);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideoMontagePackage.VIDEO: {
				Video video = (Video)theEObject;
				T result = caseVideo(video);
				if (result == null) result = caseVideoElement(video);
				if (result == null) result = caseElement(video);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideoMontagePackage.AUDIO: {
				Audio audio = (Audio)theEObject;
				T result = caseAudio(audio);
				if (result == null) result = caseAudioElement(audio);
				if (result == null) result = caseElement(audio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideoMontagePackage.AUDIO_CLIP: {
				AudioClip audioClip = (AudioClip)theEObject;
				T result = caseAudioClip(audioClip);
				if (result == null) result = caseAudioElement(audioClip);
				if (result == null) result = caseElement(audioClip);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideoMontagePackage.STARTING_MOMENT: {
				StartingMoment startingMoment = (StartingMoment)theEObject;
				T result = caseStartingMoment(startingMoment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideoMontagePackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideoMontagePackage.RELATIVE_MOMENT: {
				RelativeMoment relativeMoment = (RelativeMoment)theEObject;
				T result = caseRelativeMoment(relativeMoment);
				if (result == null) result = caseStartingMoment(relativeMoment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideoMontagePackage.ABSOLUTE_MOMENT: {
				AbsoluteMoment absoluteMoment = (AbsoluteMoment)theEObject;
				T result = caseAbsoluteMoment(absoluteMoment);
				if (result == null) result = caseStartingMoment(absoluteMoment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideoMontagePackage.TEXT_AREA: {
				TextArea textArea = (TextArea)theEObject;
				T result = caseTextArea(textArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideoMontagePackage.ANIMATION: {
				Animation animation = (Animation)theEObject;
				T result = caseAnimation(animation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideoMontagePackage.TEXT_AREA_DYNAMIC: {
				TextAreaDynamic textAreaDynamic = (TextAreaDynamic)theEObject;
				T result = caseTextAreaDynamic(textAreaDynamic);
				if (result == null) result = caseTextArea(textAreaDynamic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideoMontagePackage.FADE_IN: {
				FadeIn fadeIn = (FadeIn)theEObject;
				T result = caseFadeIn(fadeIn);
				if (result == null) result = caseAnimation(fadeIn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideoMontagePackage.FADE_OUT: {
				FadeOut fadeOut = (FadeOut)theEObject;
				T result = caseFadeOut(fadeOut);
				if (result == null) result = caseAnimation(fadeOut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideoMontagePackage.FONT: {
				Font font = (Font)theEObject;
				T result = caseFont(font);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideoMontagePackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Movie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Movie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMovie(Movie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoElement(VideoElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudioElement(AudioElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtitle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtitle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtitle(Subtitle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Title</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Title</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitle(Title object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clip</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clip</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClip(Clip object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideo(Video object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudio(Audio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio Clip</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio Clip</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudioClip(AudioClip object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Starting Moment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Starting Moment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartingMoment(StartingMoment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Moment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Moment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeMoment(RelativeMoment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Absolute Moment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absolute Moment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsoluteMoment(AbsoluteMoment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextArea(TextArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Animation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Animation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnimation(Animation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Area Dynamic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Area Dynamic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextAreaDynamic(TextAreaDynamic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fade In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fade In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFadeIn(FadeIn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fade Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fade Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFadeOut(FadeOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Font</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Font</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFont(Font object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //VideoMontageSwitch
