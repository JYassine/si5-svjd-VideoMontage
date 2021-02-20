/**
 */
package VideoMontage.impl;

import VideoMontage.Element;
import VideoMontage.RelativeMoment;
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
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link VideoMontage.impl.ElementImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link VideoMontage.impl.ElementImpl#getRelativemoment <em>Relativemoment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementImpl extends MinimalEObjectImpl.Container implements Element {
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
	 * The cached value of the '{@link #getRelativemoment() <em>Relativemoment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativemoment()
	 * @generated
	 * @ordered
	 */
	protected EList<RelativeMoment> relativemoment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideoMontagePackage.Literals.ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.ELEMENT__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelativeMoment> getRelativemoment() {
		if (relativemoment == null) {
			relativemoment = new EObjectContainmentEList<RelativeMoment>(RelativeMoment.class, this, VideoMontagePackage.ELEMENT__RELATIVEMOMENT);
		}
		return relativemoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VideoMontagePackage.ELEMENT__RELATIVEMOMENT:
				return ((InternalEList<?>)getRelativemoment()).basicRemove(otherEnd, msgs);
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
			case VideoMontagePackage.ELEMENT__DURATION:
				return getDuration();
			case VideoMontagePackage.ELEMENT__RELATIVEMOMENT:
				return getRelativemoment();
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
			case VideoMontagePackage.ELEMENT__DURATION:
				setDuration((Double)newValue);
				return;
			case VideoMontagePackage.ELEMENT__RELATIVEMOMENT:
				getRelativemoment().clear();
				getRelativemoment().addAll((Collection<? extends RelativeMoment>)newValue);
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
			case VideoMontagePackage.ELEMENT__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case VideoMontagePackage.ELEMENT__RELATIVEMOMENT:
				getRelativemoment().clear();
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
			case VideoMontagePackage.ELEMENT__DURATION:
				return duration != DURATION_EDEFAULT;
			case VideoMontagePackage.ELEMENT__RELATIVEMOMENT:
				return relativemoment != null && !relativemoment.isEmpty();
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

} //ElementImpl
