/**
 */
package VideoMontage.impl;

import VideoMontage.Clip;
import VideoMontage.Video;
import VideoMontage.VideoMontagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Video</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link VideoMontage.impl.VideoImpl#getPath <em>Path</em>}</li>
 *   <li>{@link VideoMontage.impl.VideoImpl#getName <em>Name</em>}</li>
 *   <li>{@link VideoMontage.impl.VideoImpl#getClip <em>Clip</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VideoImpl extends VideoElementImpl implements Video {
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

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
	 * The cached value of the '{@link #getClip() <em>Clip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClip()
	 * @generated
	 * @ordered
	 */
	protected Clip clip;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideoMontagePackage.Literals.VIDEO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.VIDEO__PATH, oldPath, path));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.VIDEO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clip getClip() {
		return clip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClip(Clip newClip, NotificationChain msgs) {
		Clip oldClip = clip;
		clip = newClip;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VideoMontagePackage.VIDEO__CLIP, oldClip, newClip);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClip(Clip newClip) {
		if (newClip != clip) {
			NotificationChain msgs = null;
			if (clip != null)
				msgs = ((InternalEObject)clip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VideoMontagePackage.VIDEO__CLIP, null, msgs);
			if (newClip != null)
				msgs = ((InternalEObject)newClip).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VideoMontagePackage.VIDEO__CLIP, null, msgs);
			msgs = basicSetClip(newClip, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.VIDEO__CLIP, newClip, newClip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VideoMontagePackage.VIDEO__CLIP:
				return basicSetClip(null, msgs);
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
			case VideoMontagePackage.VIDEO__PATH:
				return getPath();
			case VideoMontagePackage.VIDEO__NAME:
				return getName();
			case VideoMontagePackage.VIDEO__CLIP:
				return getClip();
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
			case VideoMontagePackage.VIDEO__PATH:
				setPath((String)newValue);
				return;
			case VideoMontagePackage.VIDEO__NAME:
				setName((String)newValue);
				return;
			case VideoMontagePackage.VIDEO__CLIP:
				setClip((Clip)newValue);
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
			case VideoMontagePackage.VIDEO__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case VideoMontagePackage.VIDEO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VideoMontagePackage.VIDEO__CLIP:
				setClip((Clip)null);
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
			case VideoMontagePackage.VIDEO__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case VideoMontagePackage.VIDEO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VideoMontagePackage.VIDEO__CLIP:
				return clip != null;
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
		result.append(" (path: ");
		result.append(path);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //VideoImpl
