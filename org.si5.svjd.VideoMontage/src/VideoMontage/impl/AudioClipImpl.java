/**
 */
package VideoMontage.impl;

import VideoMontage.Audio;
import VideoMontage.AudioClip;
import VideoMontage.VideoMontagePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audio Clip</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link VideoMontage.impl.AudioClipImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link VideoMontage.impl.AudioClipImpl#getStartCut <em>Start Cut</em>}</li>
 *   <li>{@link VideoMontage.impl.AudioClipImpl#getEndCut <em>End Cut</em>}</li>
 *   <li>{@link VideoMontage.impl.AudioClipImpl#getAudio <em>Audio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AudioClipImpl extends AudioElementImpl implements AudioClip {
	/**
	 * The default value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLUME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected double volume = VOLUME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartCut() <em>Start Cut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartCut()
	 * @generated
	 * @ordered
	 */
	protected static final double START_CUT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStartCut() <em>Start Cut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartCut()
	 * @generated
	 * @ordered
	 */
	protected double startCut = START_CUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndCut() <em>End Cut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndCut()
	 * @generated
	 * @ordered
	 */
	protected static final double END_CUT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEndCut() <em>End Cut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndCut()
	 * @generated
	 * @ordered
	 */
	protected double endCut = END_CUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAudio() <em>Audio</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudio()
	 * @generated
	 * @ordered
	 */
	protected EList<Audio> audio;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AudioClipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideoMontagePackage.Literals.AUDIO_CLIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVolume() {
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolume(double newVolume) {
		double oldVolume = volume;
		volume = newVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.AUDIO_CLIP__VOLUME, oldVolume, volume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStartCut() {
		return startCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartCut(double newStartCut) {
		double oldStartCut = startCut;
		startCut = newStartCut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.AUDIO_CLIP__START_CUT, oldStartCut, startCut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEndCut() {
		return endCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndCut(double newEndCut) {
		double oldEndCut = endCut;
		endCut = newEndCut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.AUDIO_CLIP__END_CUT, oldEndCut, endCut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Audio> getAudio() {
		if (audio == null) {
			audio = new EObjectContainmentEList<Audio>(Audio.class, this, VideoMontagePackage.AUDIO_CLIP__AUDIO);
		}
		return audio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VideoMontagePackage.AUDIO_CLIP__AUDIO:
				return ((InternalEList<?>)getAudio()).basicRemove(otherEnd, msgs);
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
			case VideoMontagePackage.AUDIO_CLIP__VOLUME:
				return getVolume();
			case VideoMontagePackage.AUDIO_CLIP__START_CUT:
				return getStartCut();
			case VideoMontagePackage.AUDIO_CLIP__END_CUT:
				return getEndCut();
			case VideoMontagePackage.AUDIO_CLIP__AUDIO:
				return getAudio();
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
			case VideoMontagePackage.AUDIO_CLIP__VOLUME:
				setVolume((Double)newValue);
				return;
			case VideoMontagePackage.AUDIO_CLIP__START_CUT:
				setStartCut((Double)newValue);
				return;
			case VideoMontagePackage.AUDIO_CLIP__END_CUT:
				setEndCut((Double)newValue);
				return;
			case VideoMontagePackage.AUDIO_CLIP__AUDIO:
				getAudio().clear();
				getAudio().addAll((Collection<? extends Audio>)newValue);
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
			case VideoMontagePackage.AUDIO_CLIP__VOLUME:
				setVolume(VOLUME_EDEFAULT);
				return;
			case VideoMontagePackage.AUDIO_CLIP__START_CUT:
				setStartCut(START_CUT_EDEFAULT);
				return;
			case VideoMontagePackage.AUDIO_CLIP__END_CUT:
				setEndCut(END_CUT_EDEFAULT);
				return;
			case VideoMontagePackage.AUDIO_CLIP__AUDIO:
				getAudio().clear();
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
			case VideoMontagePackage.AUDIO_CLIP__VOLUME:
				return volume != VOLUME_EDEFAULT;
			case VideoMontagePackage.AUDIO_CLIP__START_CUT:
				return startCut != START_CUT_EDEFAULT;
			case VideoMontagePackage.AUDIO_CLIP__END_CUT:
				return endCut != END_CUT_EDEFAULT;
			case VideoMontagePackage.AUDIO_CLIP__AUDIO:
				return audio != null && !audio.isEmpty();
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
		result.append(" (volume: ");
		result.append(volume);
		result.append(", startCut: ");
		result.append(startCut);
		result.append(", endCut: ");
		result.append(endCut);
		result.append(')');
		return result.toString();
	}

} //AudioClipImpl
