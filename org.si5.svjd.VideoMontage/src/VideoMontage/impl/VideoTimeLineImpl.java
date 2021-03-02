/**
 */
package VideoMontage.impl;

import VideoMontage.VideoElement;
import VideoMontage.VideoMontagePackage;
import VideoMontage.VideoTimeLine;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Video Time Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link VideoMontage.impl.VideoTimeLineImpl#getVideos <em>Videos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VideoTimeLineImpl extends MinimalEObjectImpl.Container implements VideoTimeLine {
	/**
	 * The cached value of the '{@link #getVideos() <em>Videos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideos()
	 * @generated
	 * @ordered
	 */
	protected EList<VideoElement> videos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoTimeLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideoMontagePackage.Literals.VIDEO_TIME_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VideoElement> getVideos() {
		if (videos == null) {
			videos = new EObjectResolvingEList<VideoElement>(VideoElement.class, this, VideoMontagePackage.VIDEO_TIME_LINE__VIDEOS);
		}
		return videos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VideoMontagePackage.VIDEO_TIME_LINE__VIDEOS:
				return getVideos();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VideoMontagePackage.VIDEO_TIME_LINE__VIDEOS:
				getVideos().clear();
				getVideos().addAll((Collection<? extends VideoElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VideoMontagePackage.VIDEO_TIME_LINE__VIDEOS:
				getVideos().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VideoMontagePackage.VIDEO_TIME_LINE__VIDEOS:
				return videos != null && !videos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VideoTimeLineImpl
