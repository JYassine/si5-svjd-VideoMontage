/**
 */
package VideoMontage.impl;

import VideoMontage.AudioElement;
import VideoMontage.Movie;
import VideoMontage.Subtitle;
import VideoMontage.VideoElement;
import VideoMontage.VideoMontagePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Movie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link VideoMontage.impl.MovieImpl#getAudioelement <em>Audioelement</em>}</li>
 *   <li>{@link VideoMontage.impl.MovieImpl#getVideoelement <em>Videoelement</em>}</li>
 *   <li>{@link VideoMontage.impl.MovieImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link VideoMontage.impl.MovieImpl#getSubtitle <em>Subtitle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MovieImpl extends MinimalEObjectImpl.Container implements Movie {
	/**
	 * The cached value of the '{@link #getAudioelement() <em>Audioelement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudioelement()
	 * @generated
	 * @ordered
	 */
	protected EList<AudioElement> audioelement;

	/**
	 * The cached value of the '{@link #getVideoelement() <em>Videoelement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoelement()
	 * @generated
	 * @ordered
	 */
	protected EList<VideoElement> videoelement;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubtitle() <em>Subtitle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtitle()
	 * @generated
	 * @ordered
	 */
	protected EList<Subtitle> subtitle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MovieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideoMontagePackage.Literals.MOVIE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AudioElement> getAudioelement() {
		if (audioelement == null) {
			audioelement = new EObjectContainmentEList<AudioElement>(AudioElement.class, this, VideoMontagePackage.MOVIE__AUDIOELEMENT);
		}
		return audioelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VideoElement> getVideoelement() {
		if (videoelement == null) {
			videoelement = new EObjectContainmentEList<VideoElement>(VideoElement.class, this, VideoMontagePackage.MOVIE__VIDEOELEMENT);
		}
		return videoelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.MOVIE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subtitle> getSubtitle() {
		if (subtitle == null) {
			subtitle = new EObjectContainmentEList<Subtitle>(Subtitle.class, this, VideoMontagePackage.MOVIE__SUBTITLE);
		}
		return subtitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VideoMontagePackage.MOVIE__AUDIOELEMENT:
				return ((InternalEList<?>)getAudioelement()).basicRemove(otherEnd, msgs);
			case VideoMontagePackage.MOVIE__VIDEOELEMENT:
				return ((InternalEList<?>)getVideoelement()).basicRemove(otherEnd, msgs);
			case VideoMontagePackage.MOVIE__SUBTITLE:
				return ((InternalEList<?>)getSubtitle()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VideoMontagePackage.MOVIE__AUDIOELEMENT:
				return getAudioelement();
			case VideoMontagePackage.MOVIE__VIDEOELEMENT:
				return getVideoelement();
			case VideoMontagePackage.MOVIE__TITLE:
				return getTitle();
			case VideoMontagePackage.MOVIE__SUBTITLE:
				return getSubtitle();
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
			case VideoMontagePackage.MOVIE__AUDIOELEMENT:
				getAudioelement().clear();
				getAudioelement().addAll((Collection<? extends AudioElement>)newValue);
				return;
			case VideoMontagePackage.MOVIE__VIDEOELEMENT:
				getVideoelement().clear();
				getVideoelement().addAll((Collection<? extends VideoElement>)newValue);
				return;
			case VideoMontagePackage.MOVIE__TITLE:
				setTitle((String)newValue);
				return;
			case VideoMontagePackage.MOVIE__SUBTITLE:
				getSubtitle().clear();
				getSubtitle().addAll((Collection<? extends Subtitle>)newValue);
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
			case VideoMontagePackage.MOVIE__AUDIOELEMENT:
				getAudioelement().clear();
				return;
			case VideoMontagePackage.MOVIE__VIDEOELEMENT:
				getVideoelement().clear();
				return;
			case VideoMontagePackage.MOVIE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case VideoMontagePackage.MOVIE__SUBTITLE:
				getSubtitle().clear();
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
			case VideoMontagePackage.MOVIE__AUDIOELEMENT:
				return audioelement != null && !audioelement.isEmpty();
			case VideoMontagePackage.MOVIE__VIDEOELEMENT:
				return videoelement != null && !videoelement.isEmpty();
			case VideoMontagePackage.MOVIE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case VideoMontagePackage.MOVIE__SUBTITLE:
				return subtitle != null && !subtitle.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //MovieImpl
