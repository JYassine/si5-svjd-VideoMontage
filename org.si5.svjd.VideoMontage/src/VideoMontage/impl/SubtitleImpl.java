/**
 */
package VideoMontage.impl;

import VideoMontage.StartingMoment;
import VideoMontage.Subtitle;
import VideoMontage.TextArea;
import VideoMontage.VideoMontagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subtitle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link VideoMontage.impl.SubtitleImpl#getTextarea <em>Textarea</em>}</li>
 *   <li>{@link VideoMontage.impl.SubtitleImpl#getStartingmoment <em>Startingmoment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubtitleImpl extends ElementImpl implements Subtitle {
	/**
	 * The cached value of the '{@link #getTextarea() <em>Textarea</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextarea()
	 * @generated
	 * @ordered
	 */
	protected TextArea textarea;

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
	protected SubtitleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideoMontagePackage.Literals.SUBTITLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextArea getTextarea() {
		return textarea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextarea(TextArea newTextarea, NotificationChain msgs) {
		TextArea oldTextarea = textarea;
		textarea = newTextarea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VideoMontagePackage.SUBTITLE__TEXTAREA, oldTextarea, newTextarea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextarea(TextArea newTextarea) {
		if (newTextarea != textarea) {
			NotificationChain msgs = null;
			if (textarea != null)
				msgs = ((InternalEObject)textarea).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VideoMontagePackage.SUBTITLE__TEXTAREA, null, msgs);
			if (newTextarea != null)
				msgs = ((InternalEObject)newTextarea).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VideoMontagePackage.SUBTITLE__TEXTAREA, null, msgs);
			msgs = basicSetTextarea(newTextarea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.SUBTITLE__TEXTAREA, newTextarea, newTextarea));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VideoMontagePackage.SUBTITLE__STARTINGMOMENT, oldStartingmoment, newStartingmoment);
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
				msgs = ((InternalEObject)startingmoment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VideoMontagePackage.SUBTITLE__STARTINGMOMENT, null, msgs);
			if (newStartingmoment != null)
				msgs = ((InternalEObject)newStartingmoment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VideoMontagePackage.SUBTITLE__STARTINGMOMENT, null, msgs);
			msgs = basicSetStartingmoment(newStartingmoment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.SUBTITLE__STARTINGMOMENT, newStartingmoment, newStartingmoment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VideoMontagePackage.SUBTITLE__TEXTAREA:
				return basicSetTextarea(null, msgs);
			case VideoMontagePackage.SUBTITLE__STARTINGMOMENT:
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
			case VideoMontagePackage.SUBTITLE__TEXTAREA:
				return getTextarea();
			case VideoMontagePackage.SUBTITLE__STARTINGMOMENT:
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
			case VideoMontagePackage.SUBTITLE__TEXTAREA:
				setTextarea((TextArea)newValue);
				return;
			case VideoMontagePackage.SUBTITLE__STARTINGMOMENT:
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
			case VideoMontagePackage.SUBTITLE__TEXTAREA:
				setTextarea((TextArea)null);
				return;
			case VideoMontagePackage.SUBTITLE__STARTINGMOMENT:
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
			case VideoMontagePackage.SUBTITLE__TEXTAREA:
				return textarea != null;
			case VideoMontagePackage.SUBTITLE__STARTINGMOMENT:
				return startingmoment != null;
		}
		return super.eIsSet(featureID);
	}

} //SubtitleImpl
