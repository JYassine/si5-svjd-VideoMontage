/**
 */
package VideoMontage.impl;

import VideoMontage.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VideoMontageFactoryImpl extends EFactoryImpl implements VideoMontageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VideoMontageFactory init() {
		try {
			VideoMontageFactory theVideoMontageFactory = (VideoMontageFactory)EPackage.Registry.INSTANCE.getEFactory(VideoMontagePackage.eNS_URI);
			if (theVideoMontageFactory != null) {
				return theVideoMontageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VideoMontageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoMontageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VideoMontagePackage.MOVIE: return createMovie();
			case VideoMontagePackage.SUBTITLE: return createSubtitle();
			case VideoMontagePackage.TITLE: return createTitle();
			case VideoMontagePackage.CLIP: return createClip();
			case VideoMontagePackage.VIDEO: return createVideo();
			case VideoMontagePackage.AUDIO: return createAudio();
			case VideoMontagePackage.AUDIO_CLIP: return createAudioClip();
			case VideoMontagePackage.STARTING_MOMENT: return createStartingMoment();
			case VideoMontagePackage.ELEMENT: return createElement();
			case VideoMontagePackage.RELATIVE_MOMENT: return createRelativeMoment();
			case VideoMontagePackage.ABSOLUTE_MOMENT: return createAbsoluteMoment();
			case VideoMontagePackage.TEXT_AREA: return createTextArea();
			case VideoMontagePackage.TEXT_AREA_DYNAMIC: return createTextAreaDynamic();
			case VideoMontagePackage.FADE_IN: return createFadeIn();
			case VideoMontagePackage.FADE_OUT: return createFadeOut();
			case VideoMontagePackage.FONT: return createFont();
			case VideoMontagePackage.TRANSITION: return createTransition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case VideoMontagePackage.COLOR:
				return createColorFromString(eDataType, initialValue);
			case VideoMontagePackage.MOMENT:
				return createMomentFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case VideoMontagePackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			case VideoMontagePackage.MOMENT:
				return convertMomentToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Movie createMovie() {
		MovieImpl movie = new MovieImpl();
		return movie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subtitle createSubtitle() {
		SubtitleImpl subtitle = new SubtitleImpl();
		return subtitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Title createTitle() {
		TitleImpl title = new TitleImpl();
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clip createClip() {
		ClipImpl clip = new ClipImpl();
		return clip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Video createVideo() {
		VideoImpl video = new VideoImpl();
		return video;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Audio createAudio() {
		AudioImpl audio = new AudioImpl();
		return audio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioClip createAudioClip() {
		AudioClipImpl audioClip = new AudioClipImpl();
		return audioClip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartingMoment createStartingMoment() {
		StartingMomentImpl startingMoment = new StartingMomentImpl();
		return startingMoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeMoment createRelativeMoment() {
		RelativeMomentImpl relativeMoment = new RelativeMomentImpl();
		return relativeMoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsoluteMoment createAbsoluteMoment() {
		AbsoluteMomentImpl absoluteMoment = new AbsoluteMomentImpl();
		return absoluteMoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextArea createTextArea() {
		TextAreaImpl textArea = new TextAreaImpl();
		return textArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextAreaDynamic createTextAreaDynamic() {
		TextAreaDynamicImpl textAreaDynamic = new TextAreaDynamicImpl();
		return textAreaDynamic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FadeIn createFadeIn() {
		FadeInImpl fadeIn = new FadeInImpl();
		return fadeIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FadeOut createFadeOut() {
		FadeOutImpl fadeOut = new FadeOutImpl();
		return fadeOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Font createFont() {
		FontImpl font = new FontImpl();
		return font;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColorFromString(EDataType eDataType, String initialValue) {
		Color result = Color.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Moment createMomentFromString(EDataType eDataType, String initialValue) {
		Moment result = Moment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMomentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoMontagePackage getVideoMontagePackage() {
		return (VideoMontagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VideoMontagePackage getPackage() {
		return VideoMontagePackage.eINSTANCE;
	}

} //VideoMontageFactoryImpl
