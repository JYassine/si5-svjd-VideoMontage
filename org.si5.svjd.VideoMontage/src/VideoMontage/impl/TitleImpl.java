/**
 */
package VideoMontage.impl;

import VideoMontage.Color;
import VideoMontage.TextArea;
import VideoMontage.Title;
import VideoMontage.VideoMontagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Title</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link VideoMontage.impl.TitleImpl#getTextarea <em>Textarea</em>}</li>
 *   <li>{@link VideoMontage.impl.TitleImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link VideoMontage.impl.TitleImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TitleImpl extends VideoElementImpl implements Title {
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
	 * The default value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color BACKGROUND_COLOR_EDEFAULT = Color.BLACK;

	/**
	 * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected Color backgroundColor = BACKGROUND_COLOR_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TitleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideoMontagePackage.Literals.TITLE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VideoMontagePackage.TITLE__TEXTAREA, oldTextarea, newTextarea);
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
				msgs = ((InternalEObject)textarea).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VideoMontagePackage.TITLE__TEXTAREA, null, msgs);
			if (newTextarea != null)
				msgs = ((InternalEObject)newTextarea).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VideoMontagePackage.TITLE__TEXTAREA, null, msgs);
			msgs = basicSetTextarea(newTextarea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.TITLE__TEXTAREA, newTextarea, newTextarea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundColor(Color newBackgroundColor) {
		Color oldBackgroundColor = backgroundColor;
		backgroundColor = newBackgroundColor == null ? BACKGROUND_COLOR_EDEFAULT : newBackgroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.TITLE__BACKGROUND_COLOR, oldBackgroundColor, backgroundColor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.TITLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VideoMontagePackage.TITLE__TEXTAREA:
				return basicSetTextarea(null, msgs);
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
			case VideoMontagePackage.TITLE__TEXTAREA:
				return getTextarea();
			case VideoMontagePackage.TITLE__BACKGROUND_COLOR:
				return getBackgroundColor();
			case VideoMontagePackage.TITLE__NAME:
				return getName();
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
			case VideoMontagePackage.TITLE__TEXTAREA:
				setTextarea((TextArea)newValue);
				return;
			case VideoMontagePackage.TITLE__BACKGROUND_COLOR:
				setBackgroundColor((Color)newValue);
				return;
			case VideoMontagePackage.TITLE__NAME:
				setName((String)newValue);
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
			case VideoMontagePackage.TITLE__TEXTAREA:
				setTextarea((TextArea)null);
				return;
			case VideoMontagePackage.TITLE__BACKGROUND_COLOR:
				setBackgroundColor(BACKGROUND_COLOR_EDEFAULT);
				return;
			case VideoMontagePackage.TITLE__NAME:
				setName(NAME_EDEFAULT);
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
			case VideoMontagePackage.TITLE__TEXTAREA:
				return textarea != null;
			case VideoMontagePackage.TITLE__BACKGROUND_COLOR:
				return backgroundColor != BACKGROUND_COLOR_EDEFAULT;
			case VideoMontagePackage.TITLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (backgroundColor: ");
		result.append(backgroundColor);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TitleImpl
