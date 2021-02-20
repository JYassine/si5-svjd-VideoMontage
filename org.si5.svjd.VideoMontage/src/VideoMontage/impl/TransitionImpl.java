/**
 */
package VideoMontage.impl;

import VideoMontage.AudioElement;
import VideoMontage.Transition;
import VideoMontage.VideoMontagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link VideoMontage.impl.TransitionImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link VideoMontage.impl.TransitionImpl#getAudioelement <em>Audioelement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final double DURATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected double duration = DURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAudioelement() <em>Audioelement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudioelement()
	 * @generated
	 * @ordered
	 */
	protected AudioElement audioelement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideoMontagePackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(double newDuration) {
		double oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.TRANSITION__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioElement getAudioelement() {
		return audioelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAudioelement(AudioElement newAudioelement, NotificationChain msgs) {
		AudioElement oldAudioelement = audioelement;
		audioelement = newAudioelement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VideoMontagePackage.TRANSITION__AUDIOELEMENT, oldAudioelement, newAudioelement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAudioelement(AudioElement newAudioelement) {
		if (newAudioelement != audioelement) {
			NotificationChain msgs = null;
			if (audioelement != null)
				msgs = ((InternalEObject)audioelement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VideoMontagePackage.TRANSITION__AUDIOELEMENT, null, msgs);
			if (newAudioelement != null)
				msgs = ((InternalEObject)newAudioelement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VideoMontagePackage.TRANSITION__AUDIOELEMENT, null, msgs);
			msgs = basicSetAudioelement(newAudioelement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.TRANSITION__AUDIOELEMENT, newAudioelement, newAudioelement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VideoMontagePackage.TRANSITION__AUDIOELEMENT:
				return basicSetAudioelement(null, msgs);
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
			case VideoMontagePackage.TRANSITION__DURATION:
				return getDuration();
			case VideoMontagePackage.TRANSITION__AUDIOELEMENT:
				return getAudioelement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VideoMontagePackage.TRANSITION__DURATION:
				setDuration((Double)newValue);
				return;
			case VideoMontagePackage.TRANSITION__AUDIOELEMENT:
				setAudioelement((AudioElement)newValue);
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
			case VideoMontagePackage.TRANSITION__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case VideoMontagePackage.TRANSITION__AUDIOELEMENT:
				setAudioelement((AudioElement)null);
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
			case VideoMontagePackage.TRANSITION__DURATION:
				return duration != DURATION_EDEFAULT;
			case VideoMontagePackage.TRANSITION__AUDIOELEMENT:
				return audioelement != null;
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
		result.append(" (duration: ");
		result.append(duration);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
