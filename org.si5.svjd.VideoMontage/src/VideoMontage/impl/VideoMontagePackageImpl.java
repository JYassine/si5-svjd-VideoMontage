/**
 */
package VideoMontage.impl;

import VideoMontage.AbsoluteMoment;
import VideoMontage.Animation;
import VideoMontage.Audio;
import VideoMontage.AudioClip;
import VideoMontage.AudioElement;
import VideoMontage.Clip;
import VideoMontage.Color;
import VideoMontage.Element;
import VideoMontage.FadeIn;
import VideoMontage.FadeOut;
import VideoMontage.Font;
import VideoMontage.FontStyle;
import VideoMontage.Moment;
import VideoMontage.Movie;
import VideoMontage.OperationMoment;
import VideoMontage.RelativeMoment;
import VideoMontage.StartingMoment;
import VideoMontage.Subtitle;
import VideoMontage.TextArea;
import VideoMontage.TextAreaDynamic;
import VideoMontage.Title;
import VideoMontage.Transition;
import VideoMontage.Video;
import VideoMontage.VideoElement;
import VideoMontage.VideoMontageFactory;
import VideoMontage.VideoMontagePackage;

import VideoMontage.VideoTimeLine;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VideoMontagePackageImpl extends EPackageImpl implements VideoMontagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass movieEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subtitleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass titleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioClipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startingMomentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeMomentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absoluteMomentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass animationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textAreaDynamicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fadeInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fadeOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fontEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoTimeLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum momentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fontStyleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationMomentEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see VideoMontage.VideoMontagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VideoMontagePackageImpl() {
		super(eNS_URI, VideoMontageFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link VideoMontagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VideoMontagePackage init() {
		if (isInited) return (VideoMontagePackage)EPackage.Registry.INSTANCE.getEPackage(VideoMontagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredVideoMontagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		VideoMontagePackageImpl theVideoMontagePackage = registeredVideoMontagePackage instanceof VideoMontagePackageImpl ? (VideoMontagePackageImpl)registeredVideoMontagePackage : new VideoMontagePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theVideoMontagePackage.createPackageContents();

		// Initialize created meta-data
		theVideoMontagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVideoMontagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VideoMontagePackage.eNS_URI, theVideoMontagePackage);
		return theVideoMontagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMovie() {
		return movieEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMovie_Audioelement() {
		return (EReference)movieEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMovie_Videoelement() {
		return (EReference)movieEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMovie_Title() {
		return (EAttribute)movieEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMovie_Subtitle() {
		return (EReference)movieEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMovie_VideoTimeline() {
		return (EReference)movieEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoElement() {
		return videoElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAudioElement() {
		return audioElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioElement_Name() {
		return (EAttribute)audioElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudioElement_Transition() {
		return (EReference)audioElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudioElement_Startingmoment() {
		return (EReference)audioElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubtitle() {
		return subtitleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubtitle_Textarea() {
		return (EReference)subtitleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubtitle_Startingmoment() {
		return (EReference)subtitleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubtitle_Name() {
		return (EAttribute)subtitleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTitle() {
		return titleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTitle_Textarea() {
		return (EReference)titleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitle_BackgroundColor() {
		return (EAttribute)titleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitle_Name() {
		return (EAttribute)titleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClip() {
		return clipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClip_StartCut() {
		return (EAttribute)clipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClip_EndCut() {
		return (EAttribute)clipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClip_Name() {
		return (EAttribute)clipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClip_Video() {
		return (EReference)clipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideo() {
		return videoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideo_Path() {
		return (EAttribute)videoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideo_Name() {
		return (EAttribute)videoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAudio() {
		return audioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudio_Path() {
		return (EAttribute)audioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAudioClip() {
		return audioClipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioClip_Volume() {
		return (EAttribute)audioClipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioClip_StartCut() {
		return (EAttribute)audioClipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioClip_EndCut() {
		return (EAttribute)audioClipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudioClip_Audio() {
		return (EReference)audioClipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartingMoment() {
		return startingMomentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Duration() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativeMoment() {
		return relativeMomentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeMoment_Moment() {
		return (EAttribute)relativeMomentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeMoment_Value() {
		return (EAttribute)relativeMomentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelativeMoment_Element() {
		return (EReference)relativeMomentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeMoment_OperationMoment() {
		return (EAttribute)relativeMomentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbsoluteMoment() {
		return absoluteMomentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbsoluteMoment_Time() {
		return (EAttribute)absoluteMomentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextArea() {
		return textAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextArea_X() {
		return (EAttribute)textAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextArea_Y() {
		return (EAttribute)textAreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextArea_Width() {
		return (EAttribute)textAreaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextArea_Height() {
		return (EAttribute)textAreaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextArea_Text() {
		return (EAttribute)textAreaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextArea_Font() {
		return (EReference)textAreaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextArea_Animation() {
		return (EReference)textAreaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnimation() {
		return animationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimation_Duration() {
		return (EAttribute)animationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextAreaDynamic() {
		return textAreaDynamicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextAreaDynamic_TextSrc() {
		return (EAttribute)textAreaDynamicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextAreaDynamic_Line() {
		return (EAttribute)textAreaDynamicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFadeIn() {
		return fadeInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFadeOut() {
		return fadeOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFont() {
		return fontEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Length() {
		return (EAttribute)fontEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_FontStyle() {
		return (EAttribute)fontEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Duration() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Audioelement() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoTimeLine() {
		return videoTimeLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVideoTimeLine_Videos() {
		return (EReference)videoTimeLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColor() {
		return colorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMoment() {
		return momentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFontStyle() {
		return fontStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperationMoment() {
		return operationMomentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoMontageFactory getVideoMontageFactory() {
		return (VideoMontageFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		movieEClass = createEClass(MOVIE);
		createEReference(movieEClass, MOVIE__AUDIOELEMENT);
		createEReference(movieEClass, MOVIE__VIDEOELEMENT);
		createEAttribute(movieEClass, MOVIE__TITLE);
		createEReference(movieEClass, MOVIE__SUBTITLE);
		createEReference(movieEClass, MOVIE__VIDEO_TIMELINE);

		videoElementEClass = createEClass(VIDEO_ELEMENT);

		audioElementEClass = createEClass(AUDIO_ELEMENT);
		createEAttribute(audioElementEClass, AUDIO_ELEMENT__NAME);
		createEReference(audioElementEClass, AUDIO_ELEMENT__TRANSITION);
		createEReference(audioElementEClass, AUDIO_ELEMENT__STARTINGMOMENT);

		subtitleEClass = createEClass(SUBTITLE);
		createEReference(subtitleEClass, SUBTITLE__TEXTAREA);
		createEReference(subtitleEClass, SUBTITLE__STARTINGMOMENT);
		createEAttribute(subtitleEClass, SUBTITLE__NAME);

		titleEClass = createEClass(TITLE);
		createEReference(titleEClass, TITLE__TEXTAREA);
		createEAttribute(titleEClass, TITLE__BACKGROUND_COLOR);
		createEAttribute(titleEClass, TITLE__NAME);

		clipEClass = createEClass(CLIP);
		createEAttribute(clipEClass, CLIP__START_CUT);
		createEAttribute(clipEClass, CLIP__END_CUT);
		createEAttribute(clipEClass, CLIP__NAME);
		createEReference(clipEClass, CLIP__VIDEO);

		videoEClass = createEClass(VIDEO);
		createEAttribute(videoEClass, VIDEO__PATH);
		createEAttribute(videoEClass, VIDEO__NAME);

		audioEClass = createEClass(AUDIO);
		createEAttribute(audioEClass, AUDIO__PATH);

		audioClipEClass = createEClass(AUDIO_CLIP);
		createEAttribute(audioClipEClass, AUDIO_CLIP__VOLUME);
		createEAttribute(audioClipEClass, AUDIO_CLIP__START_CUT);
		createEAttribute(audioClipEClass, AUDIO_CLIP__END_CUT);
		createEReference(audioClipEClass, AUDIO_CLIP__AUDIO);

		startingMomentEClass = createEClass(STARTING_MOMENT);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__DURATION);

		relativeMomentEClass = createEClass(RELATIVE_MOMENT);
		createEAttribute(relativeMomentEClass, RELATIVE_MOMENT__MOMENT);
		createEAttribute(relativeMomentEClass, RELATIVE_MOMENT__VALUE);
		createEReference(relativeMomentEClass, RELATIVE_MOMENT__ELEMENT);
		createEAttribute(relativeMomentEClass, RELATIVE_MOMENT__OPERATION_MOMENT);

		absoluteMomentEClass = createEClass(ABSOLUTE_MOMENT);
		createEAttribute(absoluteMomentEClass, ABSOLUTE_MOMENT__TIME);

		textAreaEClass = createEClass(TEXT_AREA);
		createEAttribute(textAreaEClass, TEXT_AREA__X);
		createEAttribute(textAreaEClass, TEXT_AREA__Y);
		createEAttribute(textAreaEClass, TEXT_AREA__WIDTH);
		createEAttribute(textAreaEClass, TEXT_AREA__HEIGHT);
		createEAttribute(textAreaEClass, TEXT_AREA__TEXT);
		createEReference(textAreaEClass, TEXT_AREA__ANIMATION);
		createEReference(textAreaEClass, TEXT_AREA__FONT);

		animationEClass = createEClass(ANIMATION);
		createEAttribute(animationEClass, ANIMATION__DURATION);

		textAreaDynamicEClass = createEClass(TEXT_AREA_DYNAMIC);
		createEAttribute(textAreaDynamicEClass, TEXT_AREA_DYNAMIC__TEXT_SRC);
		createEAttribute(textAreaDynamicEClass, TEXT_AREA_DYNAMIC__LINE);

		fadeInEClass = createEClass(FADE_IN);

		fadeOutEClass = createEClass(FADE_OUT);

		fontEClass = createEClass(FONT);
		createEAttribute(fontEClass, FONT__LENGTH);
		createEAttribute(fontEClass, FONT__FONT_STYLE);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__DURATION);
		createEReference(transitionEClass, TRANSITION__AUDIOELEMENT);

		videoTimeLineEClass = createEClass(VIDEO_TIME_LINE);
		createEReference(videoTimeLineEClass, VIDEO_TIME_LINE__VIDEOS);

		// Create enums
		colorEEnum = createEEnum(COLOR);
		momentEEnum = createEEnum(MOMENT);
		fontStyleEEnum = createEEnum(FONT_STYLE);
		operationMomentEEnum = createEEnum(OPERATION_MOMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		videoElementEClass.getESuperTypes().add(this.getElement());
		audioElementEClass.getESuperTypes().add(this.getElement());
		subtitleEClass.getESuperTypes().add(this.getElement());
		titleEClass.getESuperTypes().add(this.getVideoElement());
		clipEClass.getESuperTypes().add(this.getVideoElement());
		videoEClass.getESuperTypes().add(this.getVideoElement());
		audioEClass.getESuperTypes().add(this.getAudioElement());
		audioClipEClass.getESuperTypes().add(this.getAudioElement());
		relativeMomentEClass.getESuperTypes().add(this.getStartingMoment());
		absoluteMomentEClass.getESuperTypes().add(this.getStartingMoment());
		textAreaDynamicEClass.getESuperTypes().add(this.getTextArea());
		fadeInEClass.getESuperTypes().add(this.getAnimation());
		fadeOutEClass.getESuperTypes().add(this.getAnimation());

		// Initialize classes, features, and operations; add parameters
		initEClass(movieEClass, Movie.class, "Movie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMovie_Audioelement(), this.getAudioElement(), null, "audioelement", null, 0, -1, Movie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMovie_Videoelement(), this.getVideoElement(), null, "videoelement", null, 1, -1, Movie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMovie_Title(), ecorePackage.getEString(), "title", null, 0, 1, Movie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMovie_Subtitle(), this.getSubtitle(), null, "subtitle", null, 0, -1, Movie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMovie_VideoTimeline(), this.getVideoTimeLine(), null, "VideoTimeline", null, 1, 1, Movie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(videoElementEClass, VideoElement.class, "VideoElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(audioElementEClass, AudioElement.class, "AudioElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAudioElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, AudioElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAudioElement_Transition(), this.getTransition(), null, "transition", null, 0, 1, AudioElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAudioElement_Startingmoment(), this.getStartingMoment(), null, "startingmoment", null, 1, 1, AudioElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subtitleEClass, Subtitle.class, "Subtitle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubtitle_Textarea(), this.getTextArea(), null, "textarea", null, 1, 1, Subtitle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubtitle_Startingmoment(), this.getStartingMoment(), null, "startingmoment", null, 1, 1, Subtitle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubtitle_Name(), ecorePackage.getEString(), "name", null, 0, 1, Subtitle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(titleEClass, Title.class, "Title", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTitle_Textarea(), this.getTextArea(), null, "textarea", null, 1, 1, Title.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTitle_BackgroundColor(), this.getColor(), "backgroundColor", null, 0, 1, Title.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTitle_Name(), ecorePackage.getEString(), "name", null, 0, 1, Title.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clipEClass, Clip.class, "Clip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClip_StartCut(), ecorePackage.getEDouble(), "startCut", null, 0, 1, Clip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClip_EndCut(), ecorePackage.getEDouble(), "endCut", null, 0, 1, Clip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClip_Name(), ecorePackage.getEString(), "name", null, 0, 1, Clip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClip_Video(), this.getVideo(), null, "video", null, 1, 1, Clip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(videoEClass, Video.class, "Video", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVideo_Path(), ecorePackage.getEString(), "path", null, 0, 1, Video.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVideo_Name(), ecorePackage.getEString(), "name", null, 0, 1, Video.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(audioEClass, Audio.class, "Audio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAudio_Path(), ecorePackage.getEString(), "path", null, 0, 1, Audio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(audioClipEClass, AudioClip.class, "AudioClip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAudioClip_Volume(), ecorePackage.getEDouble(), "volume", null, 0, 1, AudioClip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioClip_StartCut(), ecorePackage.getEDouble(), "startCut", null, 0, 1, AudioClip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioClip_EndCut(), ecorePackage.getEDouble(), "endCut", null, 0, 1, AudioClip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAudioClip_Audio(), this.getAudio(), null, "audio", null, 0, -1, AudioClip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startingMomentEClass, StartingMoment.class, "StartingMoment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Duration(), ecorePackage.getEDouble(), "duration", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relativeMomentEClass, RelativeMoment.class, "RelativeMoment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelativeMoment_Moment(), this.getMoment(), "moment", null, 0, 1, RelativeMoment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelativeMoment_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, RelativeMoment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelativeMoment_Element(), this.getElement(), null, "element", null, 0, 1, RelativeMoment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelativeMoment_OperationMoment(), this.getOperationMoment(), "operationMoment", null, 0, 1, RelativeMoment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(absoluteMomentEClass, AbsoluteMoment.class, "AbsoluteMoment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbsoluteMoment_Time(), ecorePackage.getEDouble(), "time", null, 0, 1, AbsoluteMoment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textAreaEClass, TextArea.class, "TextArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextArea_X(), ecorePackage.getEInt(), "x", null, 0, 1, TextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextArea_Y(), ecorePackage.getEInt(), "y", null, 0, 1, TextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextArea_Width(), ecorePackage.getEDouble(), "width", null, 0, 1, TextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextArea_Height(), ecorePackage.getEDouble(), "height", null, 0, 1, TextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextArea_Text(), ecorePackage.getEString(), "text", null, 0, 1, TextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextArea_Animation(), this.getAnimation(), null, "animation", null, 0, -1, TextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextArea_Font(), this.getFont(), null, "font", null, 0, 1, TextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(animationEClass, Animation.class, "Animation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnimation_Duration(), ecorePackage.getEDouble(), "duration", null, 0, 1, Animation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textAreaDynamicEClass, TextAreaDynamic.class, "TextAreaDynamic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextAreaDynamic_TextSrc(), ecorePackage.getEString(), "textSrc", null, 0, 1, TextAreaDynamic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextAreaDynamic_Line(), ecorePackage.getEInt(), "line", null, 0, 1, TextAreaDynamic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fadeInEClass, FadeIn.class, "FadeIn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fadeOutEClass, FadeOut.class, "FadeOut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fontEClass, Font.class, "Font", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFont_Length(), ecorePackage.getEString(), "length", null, 0, 1, Font.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFont_FontStyle(), this.getFontStyle(), "fontStyle", null, 0, 1, Font.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Duration(), ecorePackage.getEDouble(), "duration", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Audioelement(), this.getAudioElement(), null, "audioelement", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(videoTimeLineEClass, VideoTimeLine.class, "VideoTimeLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVideoTimeLine_Videos(), this.getVideoElement(), null, "videos", null, 1, -1, VideoTimeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(colorEEnum, Color.class, "Color");
		addEEnumLiteral(colorEEnum, Color.BLACK);

		initEEnum(momentEEnum, Moment.class, "Moment");
		addEEnumLiteral(momentEEnum, Moment.STARTING);
		addEEnumLiteral(momentEEnum, Moment.ENDING);

		initEEnum(fontStyleEEnum, FontStyle.class, "FontStyle");
		addEEnumLiteral(fontStyleEEnum, FontStyle.COMIC_SANS_MS);

		initEEnum(operationMomentEEnum, OperationMoment.class, "OperationMoment");
		addEEnumLiteral(operationMomentEEnum, OperationMoment.ADDITION);
		addEEnumLiteral(operationMomentEEnum, OperationMoment.SOUSTRACTION);

		// Create resource
		createResource(eNS_URI);
	}

} //VideoMontagePackageImpl
