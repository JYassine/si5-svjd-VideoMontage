/**
 */
package VideoMontage.impl;

import VideoMontage.AudioElement;
import VideoMontage.StartingMoment;
import VideoMontage.Transition;
import VideoMontage.VideoMontagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audio Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link VideoMontage.impl.AudioElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link VideoMontage.impl.AudioElementImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link VideoMontage.impl.AudioElementImpl#getStartingmoment <em>Startingmoment</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AudioElementImpl extends ElementImpl implements AudioElement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected Transition transition;

	/**
	 * The cached value of the '{@link #getStartingmoment() <em>Startingmoment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingmoment()
	 * @generated
	 * @ordered
	 */
	protected StartingMoment startingmoment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AudioElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideoMontagePackage.Literals.AUDIO_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.AUDIO_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getTransition() {
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransition(Transition newTransition, NotificationChain msgs) {
		Transition oldTransition = transition;
		transition = newTransition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VideoMontagePackage.AUDIO_ELEMENT__TRANSITION, oldTransition, newTransition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransition(Transition newTransition) {
		if (newTransition != transition) {
			NotificationChain msgs = null;
			if (transition != null)
				msgs = ((InternalEObject)transition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VideoMontagePackage.AUDIO_ELEMENT__TRANSITION, null, msgs);
			if (newTransition != null)
				msgs = ((InternalEObject)newTransition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VideoMontagePackage.AUDIO_ELEMENT__TRANSITION, null, msgs);
			msgs = basicSetTransition(newTransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.AUDIO_ELEMENT__TRANSITION, newTransition, newTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartingMoment getStartingmoment() {
		return startingmoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartingmoment(StartingMoment newStartingmoment, NotificationChain msgs) {
		StartingMoment oldStartingmoment = startingmoment;
		startingmoment = newStartingmoment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VideoMontagePackage.AUDIO_ELEMENT__STARTINGMOMENT, oldStartingmoment, newStartingmoment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartingmoment(StartingMoment newStartingmoment) {
		if (newStartingmoment != startingmoment) {
			NotificationChain msgs = null;
			if (startingmoment != null)
				msgs = ((InternalEObject)startingmoment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VideoMontagePackage.AUDIO_ELEMENT__STARTINGMOMENT, null, msgs);
			if (newStartingmoment != null)
				msgs = ((InternalEObject)newStartingmoment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VideoMontagePackage.AUDIO_ELEMENT__STARTINGMOMENT, null, msgs);
			msgs = basicSetStartingmoment(newStartingmoment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.AUDIO_ELEMENT__STARTINGMOMENT, newStartingmoment, newStartingmoment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VideoMontagePackage.AUDIO_ELEMENT__TRANSITION:
				return basicSetTransition(null, msgs);
			case VideoMontagePackage.AUDIO_ELEMENT__STARTINGMOMENT:
				return basicSetStartingmoment(null, msgs);
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
			case VideoMontagePackage.AUDIO_ELEMENT__NAME:
				return getName();
			case VideoMontagePackage.AUDIO_ELEMENT__TRANSITION:
				return getTransition();
			case VideoMontagePackage.AUDIO_ELEMENT__STARTINGMOMENT:
				return getStartingmoment();
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
			case VideoMontagePackage.AUDIO_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case VideoMontagePackage.AUDIO_ELEMENT__TRANSITION:
				setTransition((Transition)newValue);
				return;
			case VideoMontagePackage.AUDIO_ELEMENT__STARTINGMOMENT:
				setStartingmoment((StartingMoment)newValue);
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
			case VideoMontagePackage.AUDIO_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VideoMontagePackage.AUDIO_ELEMENT__TRANSITION:
				setTransition((Transition)null);
				return;
			case VideoMontagePackage.AUDIO_ELEMENT__STARTINGMOMENT:
				setStartingmoment((StartingMoment)null);
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
			case VideoMontagePackage.AUDIO_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VideoMontagePackage.AUDIO_ELEMENT__TRANSITION:
				return transition != null;
			case VideoMontagePackage.AUDIO_ELEMENT__STARTINGMOMENT:
				return startingmoment != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AudioElementImpl
