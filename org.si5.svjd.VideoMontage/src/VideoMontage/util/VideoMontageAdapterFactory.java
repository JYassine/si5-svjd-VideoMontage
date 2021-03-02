/**
 */
package VideoMontage.util;

import VideoMontage.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see VideoMontage.VideoMontagePackage
 * @generated
 */
public class VideoMontageAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VideoMontagePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoMontageAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VideoMontagePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoMontageSwitch<Adapter> modelSwitch =
		new VideoMontageSwitch<Adapter>() {
			@Override
			public Adapter caseMovie(Movie object) {
				return createMovieAdapter();
			}
			@Override
			public Adapter caseVideoElement(VideoElement object) {
				return createVideoElementAdapter();
			}
			@Override
			public Adapter caseAudioElement(AudioElement object) {
				return createAudioElementAdapter();
			}
			@Override
			public Adapter caseSubtitle(Subtitle object) {
				return createSubtitleAdapter();
			}
			@Override
			public Adapter caseTitle(Title object) {
				return createTitleAdapter();
			}
			@Override
			public Adapter caseClip(Clip object) {
				return createClipAdapter();
			}
			@Override
			public Adapter caseVideo(Video object) {
				return createVideoAdapter();
			}
			@Override
			public Adapter caseAudio(Audio object) {
				return createAudioAdapter();
			}
			@Override
			public Adapter caseAudioClip(AudioClip object) {
				return createAudioClipAdapter();
			}
			@Override
			public Adapter caseStartingMoment(StartingMoment object) {
				return createStartingMomentAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseRelativeMoment(RelativeMoment object) {
				return createRelativeMomentAdapter();
			}
			@Override
			public Adapter caseAbsoluteMoment(AbsoluteMoment object) {
				return createAbsoluteMomentAdapter();
			}
			@Override
			public Adapter caseTextArea(TextArea object) {
				return createTextAreaAdapter();
			}
			@Override
			public Adapter caseAnimation(Animation object) {
				return createAnimationAdapter();
			}
			@Override
			public Adapter caseTextAreaDynamic(TextAreaDynamic object) {
				return createTextAreaDynamicAdapter();
			}
			@Override
			public Adapter caseFadeIn(FadeIn object) {
				return createFadeInAdapter();
			}
			@Override
			public Adapter caseFadeOut(FadeOut object) {
				return createFadeOutAdapter();
			}
			@Override
			public Adapter caseFont(Font object) {
				return createFontAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseVideoTimeLine(VideoTimeLine object) {
				return createVideoTimeLineAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link VideoMontage.Movie <em>Movie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VideoMontage.Movie
	 * @generated
	 */
	public Adapter createMovieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VideoMontage.VideoElement <em>Video Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VideoMontage.VideoElement
	 * @generated
	 */
	public Adapter createVideoElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VideoMontage.AudioElement <em>Audio Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VideoMontage.AudioElement
	 * @generated
	 */
	public Adapter createAudioElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VideoMontage.Subtitle <em>Subtitle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VideoMontage.Subtitle
	 * @generated
	 */
	public Adapter createSubtitleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VideoMontage.Title <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VideoMontage.Title
	 * @generated
	 */
	public Adapter createTitleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VideoMontage.Clip <em>Clip</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VideoMontage.Clip
	 * @generated
	 */
	public Adapter createClipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VideoMontage.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VideoMontage.Video
	 * @generated
	 */
	public Adapter createVideoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VideoMontage.Audio <em>Audio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VideoMontage.Audio
	 * @generated
	 */
	public Adapter createAudioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VideoMontage.AudioClip <em>Audio Clip</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VideoMontage.AudioClip
	 * @generated
	 */
	public Adapter createAudioClipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VideoMontage.StartingMoment <em>Starting Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VideoMontage.StartingMoment
	 * @generated
	 */
	public Adapter createStartingMomentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VideoMontage.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VideoMontage.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VideoMontage.RelativeMoment <em>Relative Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VideoMontage.RelativeMoment
	 * @generated
	 */
	public Adapter createRelativeMomentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VideoMontage.AbsoluteMoment <em>Absolute Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VideoMontage.AbsoluteMoment
	 * @generated
	 */
	public Adapter createAbsoluteMomentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VideoMontage.TextArea <em>Text Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VideoMontage.TextArea
	 * @generated
	 */
	public Adapter createTextAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VideoMontage.Animation <em>Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VideoMontage.Animation
	 * @generated
	 */
	public Adapter createAnimationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VideoMontage.TextAreaDynamic <em>Text Area Dynamic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VideoMontage.TextAreaDynamic
	 * @generated
	 */
	public Adapter createTextAreaDynamicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VideoMontage.FadeIn <em>Fade In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VideoMontage.FadeIn
	 * @generated
	 */
	public Adapter createFadeInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VideoMontage.FadeOut <em>Fade Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VideoMontage.FadeOut
	 * @generated
	 */
	public Adapter createFadeOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VideoMontage.Font <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VideoMontage.Font
	 * @generated
	 */
	public Adapter createFontAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VideoMontage.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VideoMontage.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VideoMontage.VideoTimeLine <em>Video Time Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VideoMontage.VideoTimeLine
	 * @generated
	 */
	public Adapter createVideoTimeLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //VideoMontageAdapterFactory
