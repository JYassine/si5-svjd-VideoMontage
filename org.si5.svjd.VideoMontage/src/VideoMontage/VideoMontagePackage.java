/**
 */
package VideoMontage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see VideoMontage.VideoMontageFactory
 * @model kind="package"
 * @generated
 */
public interface VideoMontagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "VideoMontage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "fr.uns.polytech.al.VideoMontage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "VideoMontage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VideoMontagePackage eINSTANCE = VideoMontage.impl.VideoMontagePackageImpl.init();

	/**
	 * The meta object id for the '{@link VideoMontage.impl.MovieImpl <em>Movie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoMontage.impl.MovieImpl
	 * @see VideoMontage.impl.VideoMontagePackageImpl#getMovie()
	 * @generated
	 */
	int MOVIE = 0;

	/**
	 * The feature id for the '<em><b>Audioelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE__AUDIOELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Videoelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE__VIDEOELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Subtitle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE__SUBTITLE = 3;

	/**
	 * The feature id for the '<em><b>Video Timeline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE__VIDEO_TIMELINE = 4;

	/**
	 * The number of structural features of the '<em>Movie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Movie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link VideoMontage.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoMontage.impl.ElementImpl
	 * @see VideoMontage.impl.VideoMontagePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__DURATION = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link VideoMontage.impl.VideoElementImpl <em>Video Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoMontage.impl.VideoElementImpl
	 * @see VideoMontage.impl.VideoMontagePackageImpl#getVideoElement()
	 * @generated
	 */
	int VIDEO_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_ELEMENT__DURATION = ELEMENT__DURATION;

	/**
	 * The number of structural features of the '<em>Video Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Video Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VideoMontage.impl.AudioElementImpl <em>Audio Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoMontage.impl.AudioElementImpl
	 * @see VideoMontage.impl.VideoMontagePackageImpl#getAudioElement()
	 * @generated
	 */
	int AUDIO_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_ELEMENT__DURATION = ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_ELEMENT__NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_ELEMENT__TRANSITION = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Startingmoment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_ELEMENT__STARTINGMOMENT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Audio Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Audio Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VideoMontage.impl.SubtitleImpl <em>Subtitle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoMontage.impl.SubtitleImpl
	 * @see VideoMontage.impl.VideoMontagePackageImpl#getSubtitle()
	 * @generated
	 */
	int SUBTITLE = 3;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE__DURATION = ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Textarea</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE__TEXTAREA = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Startingmoment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE__STARTINGMOMENT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE__NAME = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Subtitle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Subtitle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VideoMontage.impl.TitleImpl <em>Title</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoMontage.impl.TitleImpl
	 * @see VideoMontage.impl.VideoMontagePackageImpl#getTitle()
	 * @generated
	 */
	int TITLE = 4;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__DURATION = VIDEO_ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Textarea</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__TEXTAREA = VIDEO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__BACKGROUND_COLOR = VIDEO_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__NAME = VIDEO_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_FEATURE_COUNT = VIDEO_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_OPERATION_COUNT = VIDEO_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VideoMontage.impl.ClipImpl <em>Clip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoMontage.impl.ClipImpl
	 * @see VideoMontage.impl.VideoMontagePackageImpl#getClip()
	 * @generated
	 */
	int CLIP = 5;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP__DURATION = VIDEO_ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Start Cut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP__START_CUT = VIDEO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Cut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP__END_CUT = VIDEO_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP__NAME = VIDEO_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Video</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP__VIDEO = VIDEO_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Clip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_FEATURE_COUNT = VIDEO_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Clip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_OPERATION_COUNT = VIDEO_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VideoMontage.impl.VideoImpl <em>Video</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoMontage.impl.VideoImpl
	 * @see VideoMontage.impl.VideoMontagePackageImpl#getVideo()
	 * @generated
	 */
	int VIDEO = 6;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__DURATION = VIDEO_ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__PATH = VIDEO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__NAME = VIDEO_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FEATURE_COUNT = VIDEO_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_OPERATION_COUNT = VIDEO_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VideoMontage.impl.AudioImpl <em>Audio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoMontage.impl.AudioImpl
	 * @see VideoMontage.impl.VideoMontagePackageImpl#getAudio()
	 * @generated
	 */
	int AUDIO = 7;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__DURATION = AUDIO_ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__NAME = AUDIO_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__TRANSITION = AUDIO_ELEMENT__TRANSITION;

	/**
	 * The feature id for the '<em><b>Startingmoment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__STARTINGMOMENT = AUDIO_ELEMENT__STARTINGMOMENT;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__PATH = AUDIO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Audio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_FEATURE_COUNT = AUDIO_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Audio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_OPERATION_COUNT = AUDIO_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VideoMontage.impl.AudioClipImpl <em>Audio Clip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoMontage.impl.AudioClipImpl
	 * @see VideoMontage.impl.VideoMontagePackageImpl#getAudioClip()
	 * @generated
	 */
	int AUDIO_CLIP = 8;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_CLIP__DURATION = AUDIO_ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_CLIP__NAME = AUDIO_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_CLIP__TRANSITION = AUDIO_ELEMENT__TRANSITION;

	/**
	 * The feature id for the '<em><b>Startingmoment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_CLIP__STARTINGMOMENT = AUDIO_ELEMENT__STARTINGMOMENT;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_CLIP__VOLUME = AUDIO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Cut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_CLIP__START_CUT = AUDIO_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Cut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_CLIP__END_CUT = AUDIO_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Audio</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_CLIP__AUDIO = AUDIO_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Audio Clip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_CLIP_FEATURE_COUNT = AUDIO_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Audio Clip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_CLIP_OPERATION_COUNT = AUDIO_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VideoMontage.impl.StartingMomentImpl <em>Starting Moment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoMontage.impl.StartingMomentImpl
	 * @see VideoMontage.impl.VideoMontagePackageImpl#getStartingMoment()
	 * @generated
	 */
	int STARTING_MOMENT = 9;

	/**
	 * The number of structural features of the '<em>Starting Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTING_MOMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Starting Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTING_MOMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link VideoMontage.impl.RelativeMomentImpl <em>Relative Moment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoMontage.impl.RelativeMomentImpl
	 * @see VideoMontage.impl.VideoMontagePackageImpl#getRelativeMoment()
	 * @generated
	 */
	int RELATIVE_MOMENT = 11;

	/**
	 * The feature id for the '<em><b>Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_MOMENT__MOMENT = STARTING_MOMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_MOMENT__VALUE = STARTING_MOMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_MOMENT__ELEMENT = STARTING_MOMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operation Moment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_MOMENT__OPERATION_MOMENT = STARTING_MOMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Relative Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_MOMENT_FEATURE_COUNT = STARTING_MOMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Relative Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_MOMENT_OPERATION_COUNT = STARTING_MOMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VideoMontage.impl.AbsoluteMomentImpl <em>Absolute Moment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoMontage.impl.AbsoluteMomentImpl
	 * @see VideoMontage.impl.VideoMontagePackageImpl#getAbsoluteMoment()
	 * @generated
	 */
	int ABSOLUTE_MOMENT = 12;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_MOMENT__TIME = STARTING_MOMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Absolute Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_MOMENT_FEATURE_COUNT = STARTING_MOMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Absolute Moment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_MOMENT_OPERATION_COUNT = STARTING_MOMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VideoMontage.impl.TextAreaImpl <em>Text Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoMontage.impl.TextAreaImpl
	 * @see VideoMontage.impl.VideoMontagePackageImpl#getTextArea()
	 * @generated
	 */
	int TEXT_AREA = 13;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__Y = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__HEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__TEXT = 4;

	/**
	 * The feature id for the '<em><b>Animation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__ANIMATION = 5;

	/**
	 * The feature id for the '<em><b>Font</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__FONT = 6;

	/**
	 * The number of structural features of the '<em>Text Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Text Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link VideoMontage.impl.AnimationImpl <em>Animation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoMontage.impl.AnimationImpl
	 * @see VideoMontage.impl.VideoMontagePackageImpl#getAnimation()
	 * @generated
	 */
	int ANIMATION = 14;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION__DURATION = 0;

	/**
	 * The number of structural features of the '<em>Animation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Animation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link VideoMontage.impl.TextAreaDynamicImpl <em>Text Area Dynamic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoMontage.impl.TextAreaDynamicImpl
	 * @see VideoMontage.impl.VideoMontagePackageImpl#getTextAreaDynamic()
	 * @generated
	 */
	int TEXT_AREA_DYNAMIC = 15;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_DYNAMIC__X = TEXT_AREA__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_DYNAMIC__Y = TEXT_AREA__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_DYNAMIC__WIDTH = TEXT_AREA__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_DYNAMIC__HEIGHT = TEXT_AREA__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_DYNAMIC__TEXT = TEXT_AREA__TEXT;

	/**
	 * The feature id for the '<em><b>Animation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_DYNAMIC__ANIMATION = TEXT_AREA__ANIMATION;

	/**
	 * The feature id for the '<em><b>Font</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_DYNAMIC__FONT = TEXT_AREA__FONT;

	/**
	 * The feature id for the '<em><b>Text Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_DYNAMIC__TEXT_SRC = TEXT_AREA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_DYNAMIC__LINE = TEXT_AREA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text Area Dynamic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_DYNAMIC_FEATURE_COUNT = TEXT_AREA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Text Area Dynamic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_DYNAMIC_OPERATION_COUNT = TEXT_AREA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VideoMontage.impl.FadeInImpl <em>Fade In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoMontage.impl.FadeInImpl
	 * @see VideoMontage.impl.VideoMontagePackageImpl#getFadeIn()
	 * @generated
	 */
	int FADE_IN = 16;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_IN__DURATION = ANIMATION__DURATION;

	/**
	 * The number of structural features of the '<em>Fade In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_IN_FEATURE_COUNT = ANIMATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fade In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_IN_OPERATION_COUNT = ANIMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VideoMontage.impl.FadeOutImpl <em>Fade Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoMontage.impl.FadeOutImpl
	 * @see VideoMontage.impl.VideoMontagePackageImpl#getFadeOut()
	 * @generated
	 */
	int FADE_OUT = 17;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_OUT__DURATION = ANIMATION__DURATION;

	/**
	 * The number of structural features of the '<em>Fade Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_OUT_FEATURE_COUNT = ANIMATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fade Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_OUT_OPERATION_COUNT = ANIMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VideoMontage.impl.FontImpl <em>Font</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoMontage.impl.FontImpl
	 * @see VideoMontage.impl.VideoMontagePackageImpl#getFont()
	 * @generated
	 */
	int FONT = 18;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__LENGTH = 0;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__FONT_STYLE = 1;

	/**
	 * The number of structural features of the '<em>Font</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Font</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link VideoMontage.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoMontage.impl.TransitionImpl
	 * @see VideoMontage.impl.VideoMontagePackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 19;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__DURATION = 0;

	/**
	 * The feature id for the '<em><b>Audioelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__AUDIOELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link VideoMontage.impl.VideoTimeLineImpl <em>Video Time Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoMontage.impl.VideoTimeLineImpl
	 * @see VideoMontage.impl.VideoMontagePackageImpl#getVideoTimeLine()
	 * @generated
	 */
	int VIDEO_TIME_LINE = 20;

	/**
	 * The feature id for the '<em><b>Videos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_TIME_LINE__VIDEOS = 0;

	/**
	 * The number of structural features of the '<em>Video Time Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_TIME_LINE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Video Time Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_TIME_LINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link VideoMontage.Color <em>Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoMontage.Color
	 * @see VideoMontage.impl.VideoMontagePackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 21;

	/**
	 * The meta object id for the '{@link VideoMontage.Moment <em>Moment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoMontage.Moment
	 * @see VideoMontage.impl.VideoMontagePackageImpl#getMoment()
	 * @generated
	 */
	int MOMENT = 22;


	/**
	 * The meta object id for the '{@link VideoMontage.FontStyle <em>Font Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoMontage.FontStyle
	 * @see VideoMontage.impl.VideoMontagePackageImpl#getFontStyle()
	 * @generated
	 */
	int FONT_STYLE = 23;


	/**
	 * The meta object id for the '{@link VideoMontage.OperationMoment <em>Operation Moment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoMontage.OperationMoment
	 * @see VideoMontage.impl.VideoMontagePackageImpl#getOperationMoment()
	 * @generated
	 */
	int OPERATION_MOMENT = 24;


	/**
	 * Returns the meta object for class '{@link VideoMontage.Movie <em>Movie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Movie</em>'.
	 * @see VideoMontage.Movie
	 * @generated
	 */
	EClass getMovie();

	/**
	 * Returns the meta object for the containment reference list '{@link VideoMontage.Movie#getAudioelement <em>Audioelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Audioelement</em>'.
	 * @see VideoMontage.Movie#getAudioelement()
	 * @see #getMovie()
	 * @generated
	 */
	EReference getMovie_Audioelement();

	/**
	 * Returns the meta object for the containment reference list '{@link VideoMontage.Movie#getVideoelement <em>Videoelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Videoelement</em>'.
	 * @see VideoMontage.Movie#getVideoelement()
	 * @see #getMovie()
	 * @generated
	 */
	EReference getMovie_Videoelement();

	/**
	 * Returns the meta object for the attribute '{@link VideoMontage.Movie#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see VideoMontage.Movie#getTitle()
	 * @see #getMovie()
	 * @generated
	 */
	EAttribute getMovie_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link VideoMontage.Movie#getSubtitle <em>Subtitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subtitle</em>'.
	 * @see VideoMontage.Movie#getSubtitle()
	 * @see #getMovie()
	 * @generated
	 */
	EReference getMovie_Subtitle();

	/**
	 * Returns the meta object for the containment reference '{@link VideoMontage.Movie#getVideoTimeline <em>Video Timeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Video Timeline</em>'.
	 * @see VideoMontage.Movie#getVideoTimeline()
	 * @see #getMovie()
	 * @generated
	 */
	EReference getMovie_VideoTimeline();

	/**
	 * Returns the meta object for class '{@link VideoMontage.VideoElement <em>Video Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Element</em>'.
	 * @see VideoMontage.VideoElement
	 * @generated
	 */
	EClass getVideoElement();

	/**
	 * Returns the meta object for class '{@link VideoMontage.AudioElement <em>Audio Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio Element</em>'.
	 * @see VideoMontage.AudioElement
	 * @generated
	 */
	EClass getAudioElement();

	/**
	 * Returns the meta object for the attribute '{@link VideoMontage.AudioElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see VideoMontage.AudioElement#getName()
	 * @see #getAudioElement()
	 * @generated
	 */
	EAttribute getAudioElement_Name();

	/**
	 * Returns the meta object for the containment reference '{@link VideoMontage.AudioElement#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transition</em>'.
	 * @see VideoMontage.AudioElement#getTransition()
	 * @see #getAudioElement()
	 * @generated
	 */
	EReference getAudioElement_Transition();

	/**
	 * Returns the meta object for the containment reference '{@link VideoMontage.AudioElement#getStartingmoment <em>Startingmoment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Startingmoment</em>'.
	 * @see VideoMontage.AudioElement#getStartingmoment()
	 * @see #getAudioElement()
	 * @generated
	 */
	EReference getAudioElement_Startingmoment();

	/**
	 * Returns the meta object for class '{@link VideoMontage.Subtitle <em>Subtitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtitle</em>'.
	 * @see VideoMontage.Subtitle
	 * @generated
	 */
	EClass getSubtitle();

	/**
	 * Returns the meta object for the containment reference '{@link VideoMontage.Subtitle#getTextarea <em>Textarea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Textarea</em>'.
	 * @see VideoMontage.Subtitle#getTextarea()
	 * @see #getSubtitle()
	 * @generated
	 */
	EReference getSubtitle_Textarea();

	/**
	 * Returns the meta object for the containment reference '{@link VideoMontage.Subtitle#getStartingmoment <em>Startingmoment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Startingmoment</em>'.
	 * @see VideoMontage.Subtitle#getStartingmoment()
	 * @see #getSubtitle()
	 * @generated
	 */
	EReference getSubtitle_Startingmoment();

	/**
	 * Returns the meta object for the attribute '{@link VideoMontage.Subtitle#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see VideoMontage.Subtitle#getName()
	 * @see #getSubtitle()
	 * @generated
	 */
	EAttribute getSubtitle_Name();

	/**
	 * Returns the meta object for class '{@link VideoMontage.Title <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title</em>'.
	 * @see VideoMontage.Title
	 * @generated
	 */
	EClass getTitle();

	/**
	 * Returns the meta object for the containment reference '{@link VideoMontage.Title#getTextarea <em>Textarea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Textarea</em>'.
	 * @see VideoMontage.Title#getTextarea()
	 * @see #getTitle()
	 * @generated
	 */
	EReference getTitle_Textarea();

	/**
	 * Returns the meta object for the attribute '{@link VideoMontage.Title#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see VideoMontage.Title#getBackgroundColor()
	 * @see #getTitle()
	 * @generated
	 */
	EAttribute getTitle_BackgroundColor();

	/**
	 * Returns the meta object for the attribute '{@link VideoMontage.Title#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see VideoMontage.Title#getName()
	 * @see #getTitle()
	 * @generated
	 */
	EAttribute getTitle_Name();

	/**
	 * Returns the meta object for class '{@link VideoMontage.Clip <em>Clip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clip</em>'.
	 * @see VideoMontage.Clip
	 * @generated
	 */
	EClass getClip();

	/**
	 * Returns the meta object for the attribute '{@link VideoMontage.Clip#getStartCut <em>Start Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Cut</em>'.
	 * @see VideoMontage.Clip#getStartCut()
	 * @see #getClip()
	 * @generated
	 */
	EAttribute getClip_StartCut();

	/**
	 * Returns the meta object for the attribute '{@link VideoMontage.Clip#getEndCut <em>End Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Cut</em>'.
	 * @see VideoMontage.Clip#getEndCut()
	 * @see #getClip()
	 * @generated
	 */
	EAttribute getClip_EndCut();

	/**
	 * Returns the meta object for the attribute '{@link VideoMontage.Clip#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see VideoMontage.Clip#getName()
	 * @see #getClip()
	 * @generated
	 */
	EAttribute getClip_Name();

	/**
	 * Returns the meta object for the reference '{@link VideoMontage.Clip#getVideo <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Video</em>'.
	 * @see VideoMontage.Clip#getVideo()
	 * @see #getClip()
	 * @generated
	 */
	EReference getClip_Video();

	/**
	 * Returns the meta object for class '{@link VideoMontage.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video</em>'.
	 * @see VideoMontage.Video
	 * @generated
	 */
	EClass getVideo();

	/**
	 * Returns the meta object for the attribute '{@link VideoMontage.Video#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see VideoMontage.Video#getPath()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Path();

	/**
	 * Returns the meta object for the attribute '{@link VideoMontage.Video#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see VideoMontage.Video#getName()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Name();

	/**
	 * Returns the meta object for class '{@link VideoMontage.Audio <em>Audio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio</em>'.
	 * @see VideoMontage.Audio
	 * @generated
	 */
	EClass getAudio();

	/**
	 * Returns the meta object for the attribute '{@link VideoMontage.Audio#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see VideoMontage.Audio#getPath()
	 * @see #getAudio()
	 * @generated
	 */
	EAttribute getAudio_Path();

	/**
	 * Returns the meta object for class '{@link VideoMontage.AudioClip <em>Audio Clip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio Clip</em>'.
	 * @see VideoMontage.AudioClip
	 * @generated
	 */
	EClass getAudioClip();

	/**
	 * Returns the meta object for the attribute '{@link VideoMontage.AudioClip#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see VideoMontage.AudioClip#getVolume()
	 * @see #getAudioClip()
	 * @generated
	 */
	EAttribute getAudioClip_Volume();

	/**
	 * Returns the meta object for the attribute '{@link VideoMontage.AudioClip#getStartCut <em>Start Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Cut</em>'.
	 * @see VideoMontage.AudioClip#getStartCut()
	 * @see #getAudioClip()
	 * @generated
	 */
	EAttribute getAudioClip_StartCut();

	/**
	 * Returns the meta object for the attribute '{@link VideoMontage.AudioClip#getEndCut <em>End Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Cut</em>'.
	 * @see VideoMontage.AudioClip#getEndCut()
	 * @see #getAudioClip()
	 * @generated
	 */
	EAttribute getAudioClip_EndCut();

	/**
	 * Returns the meta object for the reference list '{@link VideoMontage.AudioClip#getAudio <em>Audio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Audio</em>'.
	 * @see VideoMontage.AudioClip#getAudio()
	 * @see #getAudioClip()
	 * @generated
	 */
	EReference getAudioClip_Audio();

	/**
	 * Returns the meta object for class '{@link VideoMontage.StartingMoment <em>Starting Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Starting Moment</em>'.
	 * @see VideoMontage.StartingMoment
	 * @generated
	 */
	EClass getStartingMoment();

	/**
	 * Returns the meta object for class '{@link VideoMontage.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see VideoMontage.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link VideoMontage.Element#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see VideoMontage.Element#getDuration()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Duration();

	/**
	 * Returns the meta object for class '{@link VideoMontage.RelativeMoment <em>Relative Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Moment</em>'.
	 * @see VideoMontage.RelativeMoment
	 * @generated
	 */
	EClass getRelativeMoment();

	/**
	 * Returns the meta object for the attribute '{@link VideoMontage.RelativeMoment#getMoment <em>Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Moment</em>'.
	 * @see VideoMontage.RelativeMoment#getMoment()
	 * @see #getRelativeMoment()
	 * @generated
	 */
	EAttribute getRelativeMoment_Moment();

	/**
	 * Returns the meta object for the attribute '{@link VideoMontage.RelativeMoment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see VideoMontage.RelativeMoment#getValue()
	 * @see #getRelativeMoment()
	 * @generated
	 */
	EAttribute getRelativeMoment_Value();

	/**
	 * Returns the meta object for the reference '{@link VideoMontage.RelativeMoment#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see VideoMontage.RelativeMoment#getElement()
	 * @see #getRelativeMoment()
	 * @generated
	 */
	EReference getRelativeMoment_Element();

	/**
	 * Returns the meta object for the attribute '{@link VideoMontage.RelativeMoment#getOperationMoment <em>Operation Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Moment</em>'.
	 * @see VideoMontage.RelativeMoment#getOperationMoment()
	 * @see #getRelativeMoment()
	 * @generated
	 */
	EAttribute getRelativeMoment_OperationMoment();

	/**
	 * Returns the meta object for class '{@link VideoMontage.AbsoluteMoment <em>Absolute Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absolute Moment</em>'.
	 * @see VideoMontage.AbsoluteMoment
	 * @generated
	 */
	EClass getAbsoluteMoment();

	/**
	 * Returns the meta object for the attribute '{@link VideoMontage.AbsoluteMoment#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see VideoMontage.AbsoluteMoment#getTime()
	 * @see #getAbsoluteMoment()
	 * @generated
	 */
	EAttribute getAbsoluteMoment_Time();

	/**
	 * Returns the meta object for class '{@link VideoMontage.TextArea <em>Text Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Area</em>'.
	 * @see VideoMontage.TextArea
	 * @generated
	 */
	EClass getTextArea();

	/**
	 * Returns the meta object for the attribute '{@link VideoMontage.TextArea#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see VideoMontage.TextArea#getX()
	 * @see #getTextArea()
	 * @generated
	 */
	EAttribute getTextArea_X();

	/**
	 * Returns the meta object for the attribute '{@link VideoMontage.TextArea#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see VideoMontage.TextArea#getY()
	 * @see #getTextArea()
	 * @generated
	 */
	EAttribute getTextArea_Y();

	/**
	 * Returns the meta object for the attribute '{@link VideoMontage.TextArea#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see VideoMontage.TextArea#getWidth()
	 * @see #getTextArea()
	 * @generated
	 */
	EAttribute getTextArea_Width();

	/**
	 * Returns the meta object for the attribute '{@link VideoMontage.TextArea#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see VideoMontage.TextArea#getHeight()
	 * @see #getTextArea()
	 * @generated
	 */
	EAttribute getTextArea_Height();

	/**
	 * Returns the meta object for the attribute '{@link VideoMontage.TextArea#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see VideoMontage.TextArea#getText()
	 * @see #getTextArea()
	 * @generated
	 */
	EAttribute getTextArea_Text();

	/**
	 * Returns the meta object for the reference '{@link VideoMontage.TextArea#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Font</em>'.
	 * @see VideoMontage.TextArea#getFont()
	 * @see #getTextArea()
	 * @generated
	 */
	EReference getTextArea_Font();

	/**
	 * Returns the meta object for the containment reference list '{@link VideoMontage.TextArea#getAnimation <em>Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Animation</em>'.
	 * @see VideoMontage.TextArea#getAnimation()
	 * @see #getTextArea()
	 * @generated
	 */
	EReference getTextArea_Animation();

	/**
	 * Returns the meta object for class '{@link VideoMontage.Animation <em>Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animation</em>'.
	 * @see VideoMontage.Animation
	 * @generated
	 */
	EClass getAnimation();

	/**
	 * Returns the meta object for the attribute '{@link VideoMontage.Animation#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see VideoMontage.Animation#getDuration()
	 * @see #getAnimation()
	 * @generated
	 */
	EAttribute getAnimation_Duration();

	/**
	 * Returns the meta object for class '{@link VideoMontage.TextAreaDynamic <em>Text Area Dynamic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Area Dynamic</em>'.
	 * @see VideoMontage.TextAreaDynamic
	 * @generated
	 */
	EClass getTextAreaDynamic();

	/**
	 * Returns the meta object for the attribute '{@link VideoMontage.TextAreaDynamic#getTextSrc <em>Text Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Src</em>'.
	 * @see VideoMontage.TextAreaDynamic#getTextSrc()
	 * @see #getTextAreaDynamic()
	 * @generated
	 */
	EAttribute getTextAreaDynamic_TextSrc();

	/**
	 * Returns the meta object for the attribute '{@link VideoMontage.TextAreaDynamic#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see VideoMontage.TextAreaDynamic#getLine()
	 * @see #getTextAreaDynamic()
	 * @generated
	 */
	EAttribute getTextAreaDynamic_Line();

	/**
	 * Returns the meta object for class '{@link VideoMontage.FadeIn <em>Fade In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fade In</em>'.
	 * @see VideoMontage.FadeIn
	 * @generated
	 */
	EClass getFadeIn();

	/**
	 * Returns the meta object for class '{@link VideoMontage.FadeOut <em>Fade Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fade Out</em>'.
	 * @see VideoMontage.FadeOut
	 * @generated
	 */
	EClass getFadeOut();

	/**
	 * Returns the meta object for class '{@link VideoMontage.Font <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Font</em>'.
	 * @see VideoMontage.Font
	 * @generated
	 */
	EClass getFont();

	/**
	 * Returns the meta object for the attribute '{@link VideoMontage.Font#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see VideoMontage.Font#getLength()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Length();

	/**
	 * Returns the meta object for the attribute '{@link VideoMontage.Font#getFontStyle <em>Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Style</em>'.
	 * @see VideoMontage.Font#getFontStyle()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_FontStyle();

	/**
	 * Returns the meta object for class '{@link VideoMontage.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see VideoMontage.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link VideoMontage.Transition#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see VideoMontage.Transition#getDuration()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Duration();

	/**
	 * Returns the meta object for the containment reference '{@link VideoMontage.Transition#getAudioelement <em>Audioelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Audioelement</em>'.
	 * @see VideoMontage.Transition#getAudioelement()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Audioelement();

	/**
	 * Returns the meta object for class '{@link VideoMontage.VideoTimeLine <em>Video Time Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Time Line</em>'.
	 * @see VideoMontage.VideoTimeLine
	 * @generated
	 */
	EClass getVideoTimeLine();

	/**
	 * Returns the meta object for the reference list '{@link VideoMontage.VideoTimeLine#getVideos <em>Videos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Videos</em>'.
	 * @see VideoMontage.VideoTimeLine#getVideos()
	 * @see #getVideoTimeLine()
	 * @generated
	 */
	EReference getVideoTimeLine_Videos();

	/**
	 * Returns the meta object for enum '{@link VideoMontage.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color</em>'.
	 * @see VideoMontage.Color
	 * @generated
	 */
	EEnum getColor();

	/**
	 * Returns the meta object for enum '{@link VideoMontage.Moment <em>Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Moment</em>'.
	 * @see VideoMontage.Moment
	 * @generated
	 */
	EEnum getMoment();

	/**
	 * Returns the meta object for enum '{@link VideoMontage.FontStyle <em>Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Font Style</em>'.
	 * @see VideoMontage.FontStyle
	 * @generated
	 */
	EEnum getFontStyle();

	/**
	 * Returns the meta object for enum '{@link VideoMontage.OperationMoment <em>Operation Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Moment</em>'.
	 * @see VideoMontage.OperationMoment
	 * @generated
	 */
	EEnum getOperationMoment();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VideoMontageFactory getVideoMontageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link VideoMontage.impl.MovieImpl <em>Movie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoMontage.impl.MovieImpl
		 * @see VideoMontage.impl.VideoMontagePackageImpl#getMovie()
		 * @generated
		 */
		EClass MOVIE = eINSTANCE.getMovie();

		/**
		 * The meta object literal for the '<em><b>Audioelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVIE__AUDIOELEMENT = eINSTANCE.getMovie_Audioelement();

		/**
		 * The meta object literal for the '<em><b>Videoelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVIE__VIDEOELEMENT = eINSTANCE.getMovie_Videoelement();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVIE__TITLE = eINSTANCE.getMovie_Title();

		/**
		 * The meta object literal for the '<em><b>Subtitle</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVIE__SUBTITLE = eINSTANCE.getMovie_Subtitle();

		/**
		 * The meta object literal for the '<em><b>Video Timeline</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVIE__VIDEO_TIMELINE = eINSTANCE.getMovie_VideoTimeline();

		/**
		 * The meta object literal for the '{@link VideoMontage.impl.VideoElementImpl <em>Video Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoMontage.impl.VideoElementImpl
		 * @see VideoMontage.impl.VideoMontagePackageImpl#getVideoElement()
		 * @generated
		 */
		EClass VIDEO_ELEMENT = eINSTANCE.getVideoElement();

		/**
		 * The meta object literal for the '{@link VideoMontage.impl.AudioElementImpl <em>Audio Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoMontage.impl.AudioElementImpl
		 * @see VideoMontage.impl.VideoMontagePackageImpl#getAudioElement()
		 * @generated
		 */
		EClass AUDIO_ELEMENT = eINSTANCE.getAudioElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_ELEMENT__NAME = eINSTANCE.getAudioElement_Name();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO_ELEMENT__TRANSITION = eINSTANCE.getAudioElement_Transition();

		/**
		 * The meta object literal for the '<em><b>Startingmoment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO_ELEMENT__STARTINGMOMENT = eINSTANCE.getAudioElement_Startingmoment();

		/**
		 * The meta object literal for the '{@link VideoMontage.impl.SubtitleImpl <em>Subtitle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoMontage.impl.SubtitleImpl
		 * @see VideoMontage.impl.VideoMontagePackageImpl#getSubtitle()
		 * @generated
		 */
		EClass SUBTITLE = eINSTANCE.getSubtitle();

		/**
		 * The meta object literal for the '<em><b>Textarea</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTITLE__TEXTAREA = eINSTANCE.getSubtitle_Textarea();

		/**
		 * The meta object literal for the '<em><b>Startingmoment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTITLE__STARTINGMOMENT = eINSTANCE.getSubtitle_Startingmoment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBTITLE__NAME = eINSTANCE.getSubtitle_Name();

		/**
		 * The meta object literal for the '{@link VideoMontage.impl.TitleImpl <em>Title</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoMontage.impl.TitleImpl
		 * @see VideoMontage.impl.VideoMontagePackageImpl#getTitle()
		 * @generated
		 */
		EClass TITLE = eINSTANCE.getTitle();

		/**
		 * The meta object literal for the '<em><b>Textarea</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TITLE__TEXTAREA = eINSTANCE.getTitle_Textarea();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE__BACKGROUND_COLOR = eINSTANCE.getTitle_BackgroundColor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE__NAME = eINSTANCE.getTitle_Name();

		/**
		 * The meta object literal for the '{@link VideoMontage.impl.ClipImpl <em>Clip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoMontage.impl.ClipImpl
		 * @see VideoMontage.impl.VideoMontagePackageImpl#getClip()
		 * @generated
		 */
		EClass CLIP = eINSTANCE.getClip();

		/**
		 * The meta object literal for the '<em><b>Start Cut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIP__START_CUT = eINSTANCE.getClip_StartCut();

		/**
		 * The meta object literal for the '<em><b>End Cut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIP__END_CUT = eINSTANCE.getClip_EndCut();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIP__NAME = eINSTANCE.getClip_Name();

		/**
		 * The meta object literal for the '<em><b>Video</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIP__VIDEO = eINSTANCE.getClip_Video();

		/**
		 * The meta object literal for the '{@link VideoMontage.impl.VideoImpl <em>Video</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoMontage.impl.VideoImpl
		 * @see VideoMontage.impl.VideoMontagePackageImpl#getVideo()
		 * @generated
		 */
		EClass VIDEO = eINSTANCE.getVideo();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__PATH = eINSTANCE.getVideo_Path();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__NAME = eINSTANCE.getVideo_Name();

		/**
		 * The meta object literal for the '{@link VideoMontage.impl.AudioImpl <em>Audio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoMontage.impl.AudioImpl
		 * @see VideoMontage.impl.VideoMontagePackageImpl#getAudio()
		 * @generated
		 */
		EClass AUDIO = eINSTANCE.getAudio();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO__PATH = eINSTANCE.getAudio_Path();

		/**
		 * The meta object literal for the '{@link VideoMontage.impl.AudioClipImpl <em>Audio Clip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoMontage.impl.AudioClipImpl
		 * @see VideoMontage.impl.VideoMontagePackageImpl#getAudioClip()
		 * @generated
		 */
		EClass AUDIO_CLIP = eINSTANCE.getAudioClip();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_CLIP__VOLUME = eINSTANCE.getAudioClip_Volume();

		/**
		 * The meta object literal for the '<em><b>Start Cut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_CLIP__START_CUT = eINSTANCE.getAudioClip_StartCut();

		/**
		 * The meta object literal for the '<em><b>End Cut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_CLIP__END_CUT = eINSTANCE.getAudioClip_EndCut();

		/**
		 * The meta object literal for the '<em><b>Audio</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO_CLIP__AUDIO = eINSTANCE.getAudioClip_Audio();

		/**
		 * The meta object literal for the '{@link VideoMontage.impl.StartingMomentImpl <em>Starting Moment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoMontage.impl.StartingMomentImpl
		 * @see VideoMontage.impl.VideoMontagePackageImpl#getStartingMoment()
		 * @generated
		 */
		EClass STARTING_MOMENT = eINSTANCE.getStartingMoment();

		/**
		 * The meta object literal for the '{@link VideoMontage.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoMontage.impl.ElementImpl
		 * @see VideoMontage.impl.VideoMontagePackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__DURATION = eINSTANCE.getElement_Duration();

		/**
		 * The meta object literal for the '{@link VideoMontage.impl.RelativeMomentImpl <em>Relative Moment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoMontage.impl.RelativeMomentImpl
		 * @see VideoMontage.impl.VideoMontagePackageImpl#getRelativeMoment()
		 * @generated
		 */
		EClass RELATIVE_MOMENT = eINSTANCE.getRelativeMoment();

		/**
		 * The meta object literal for the '<em><b>Moment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_MOMENT__MOMENT = eINSTANCE.getRelativeMoment_Moment();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_MOMENT__VALUE = eINSTANCE.getRelativeMoment_Value();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIVE_MOMENT__ELEMENT = eINSTANCE.getRelativeMoment_Element();

		/**
		 * The meta object literal for the '<em><b>Operation Moment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_MOMENT__OPERATION_MOMENT = eINSTANCE.getRelativeMoment_OperationMoment();

		/**
		 * The meta object literal for the '{@link VideoMontage.impl.AbsoluteMomentImpl <em>Absolute Moment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoMontage.impl.AbsoluteMomentImpl
		 * @see VideoMontage.impl.VideoMontagePackageImpl#getAbsoluteMoment()
		 * @generated
		 */
		EClass ABSOLUTE_MOMENT = eINSTANCE.getAbsoluteMoment();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSOLUTE_MOMENT__TIME = eINSTANCE.getAbsoluteMoment_Time();

		/**
		 * The meta object literal for the '{@link VideoMontage.impl.TextAreaImpl <em>Text Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoMontage.impl.TextAreaImpl
		 * @see VideoMontage.impl.VideoMontagePackageImpl#getTextArea()
		 * @generated
		 */
		EClass TEXT_AREA = eINSTANCE.getTextArea();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_AREA__X = eINSTANCE.getTextArea_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_AREA__Y = eINSTANCE.getTextArea_Y();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_AREA__WIDTH = eINSTANCE.getTextArea_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_AREA__HEIGHT = eINSTANCE.getTextArea_Height();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_AREA__TEXT = eINSTANCE.getTextArea_Text();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_AREA__FONT = eINSTANCE.getTextArea_Font();

		/**
		 * The meta object literal for the '<em><b>Animation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_AREA__ANIMATION = eINSTANCE.getTextArea_Animation();

		/**
		 * The meta object literal for the '{@link VideoMontage.impl.AnimationImpl <em>Animation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoMontage.impl.AnimationImpl
		 * @see VideoMontage.impl.VideoMontagePackageImpl#getAnimation()
		 * @generated
		 */
		EClass ANIMATION = eINSTANCE.getAnimation();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION__DURATION = eINSTANCE.getAnimation_Duration();

		/**
		 * The meta object literal for the '{@link VideoMontage.impl.TextAreaDynamicImpl <em>Text Area Dynamic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoMontage.impl.TextAreaDynamicImpl
		 * @see VideoMontage.impl.VideoMontagePackageImpl#getTextAreaDynamic()
		 * @generated
		 */
		EClass TEXT_AREA_DYNAMIC = eINSTANCE.getTextAreaDynamic();

		/**
		 * The meta object literal for the '<em><b>Text Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_AREA_DYNAMIC__TEXT_SRC = eINSTANCE.getTextAreaDynamic_TextSrc();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_AREA_DYNAMIC__LINE = eINSTANCE.getTextAreaDynamic_Line();

		/**
		 * The meta object literal for the '{@link VideoMontage.impl.FadeInImpl <em>Fade In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoMontage.impl.FadeInImpl
		 * @see VideoMontage.impl.VideoMontagePackageImpl#getFadeIn()
		 * @generated
		 */
		EClass FADE_IN = eINSTANCE.getFadeIn();

		/**
		 * The meta object literal for the '{@link VideoMontage.impl.FadeOutImpl <em>Fade Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoMontage.impl.FadeOutImpl
		 * @see VideoMontage.impl.VideoMontagePackageImpl#getFadeOut()
		 * @generated
		 */
		EClass FADE_OUT = eINSTANCE.getFadeOut();

		/**
		 * The meta object literal for the '{@link VideoMontage.impl.FontImpl <em>Font</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoMontage.impl.FontImpl
		 * @see VideoMontage.impl.VideoMontagePackageImpl#getFont()
		 * @generated
		 */
		EClass FONT = eINSTANCE.getFont();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__LENGTH = eINSTANCE.getFont_Length();

		/**
		 * The meta object literal for the '<em><b>Font Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__FONT_STYLE = eINSTANCE.getFont_FontStyle();

		/**
		 * The meta object literal for the '{@link VideoMontage.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoMontage.impl.TransitionImpl
		 * @see VideoMontage.impl.VideoMontagePackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__DURATION = eINSTANCE.getTransition_Duration();

		/**
		 * The meta object literal for the '<em><b>Audioelement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__AUDIOELEMENT = eINSTANCE.getTransition_Audioelement();

		/**
		 * The meta object literal for the '{@link VideoMontage.impl.VideoTimeLineImpl <em>Video Time Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoMontage.impl.VideoTimeLineImpl
		 * @see VideoMontage.impl.VideoMontagePackageImpl#getVideoTimeLine()
		 * @generated
		 */
		EClass VIDEO_TIME_LINE = eINSTANCE.getVideoTimeLine();

		/**
		 * The meta object literal for the '<em><b>Videos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIDEO_TIME_LINE__VIDEOS = eINSTANCE.getVideoTimeLine_Videos();

		/**
		 * The meta object literal for the '{@link VideoMontage.Color <em>Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoMontage.Color
		 * @see VideoMontage.impl.VideoMontagePackageImpl#getColor()
		 * @generated
		 */
		EEnum COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '{@link VideoMontage.Moment <em>Moment</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoMontage.Moment
		 * @see VideoMontage.impl.VideoMontagePackageImpl#getMoment()
		 * @generated
		 */
		EEnum MOMENT = eINSTANCE.getMoment();

		/**
		 * The meta object literal for the '{@link VideoMontage.FontStyle <em>Font Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoMontage.FontStyle
		 * @see VideoMontage.impl.VideoMontagePackageImpl#getFontStyle()
		 * @generated
		 */
		EEnum FONT_STYLE = eINSTANCE.getFontStyle();

		/**
		 * The meta object literal for the '{@link VideoMontage.OperationMoment <em>Operation Moment</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoMontage.OperationMoment
		 * @see VideoMontage.impl.VideoMontagePackageImpl#getOperationMoment()
		 * @generated
		 */
		EEnum OPERATION_MOMENT = eINSTANCE.getOperationMoment();

	}

} //VideoMontagePackage
