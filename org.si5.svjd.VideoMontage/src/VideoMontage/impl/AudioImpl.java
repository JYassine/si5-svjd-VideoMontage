/**
 */
package VideoMontage.impl;

import VideoMontage.Audio;
import VideoMontage.AudioClip;
import VideoMontage.VideoMontagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link VideoMontage.impl.AudioImpl#getPath <em>Path</em>}</li>
 *   <li>{@link VideoMontage.impl.AudioImpl#getAudioclip <em>Audioclip</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AudioImpl extends AudioElementImpl implements Audio {
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
	 * The cached value of the '{@link #getAudioclip() <em>Audioclip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudioclip()
	 * @generated
	 * @ordered
	 */
	protected AudioClip audioclip;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AudioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideoMontagePackage.Literals.AUDIO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.AUDIO__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioClip getAudioclip() {
		return audioclip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAudioclip(AudioClip newAudioclip, NotificationChain msgs) {
		AudioClip oldAudioclip = audioclip;
		audioclip = newAudioclip;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VideoMontagePackage.AUDIO__AUDIOCLIP, oldAudioclip, newAudioclip);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAudioclip(AudioClip newAudioclip) {
		if (newAudioclip != audioclip) {
			NotificationChain msgs = null;
			if (audioclip != null)
				msgs = ((InternalEObject)audioclip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VideoMontagePackage.AUDIO__AUDIOCLIP, null, msgs);
			if (newAudioclip != null)
				msgs = ((InternalEObject)newAudioclip).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VideoMontagePackage.AUDIO__AUDIOCLIP, null, msgs);
			msgs = basicSetAudioclip(newAudioclip, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.AUDIO__AUDIOCLIP, newAudioclip, newAudioclip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VideoMontagePackage.AUDIO__AUDIOCLIP:
				return basicSetAudioclip(null, msgs);
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
			case VideoMontagePackage.AUDIO__PATH:
				return getPath();
			case VideoMontagePackage.AUDIO__AUDIOCLIP:
				return getAudioclip();
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
			case VideoMontagePackage.AUDIO__PATH:
				setPath((String)newValue);
				return;
			case VideoMontagePackage.AUDIO__AUDIOCLIP:
				setAudioclip((AudioClip)newValue);
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
			case VideoMontagePackage.AUDIO__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case VideoMontagePackage.AUDIO__AUDIOCLIP:
				setAudioclip((AudioClip)null);
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
			case VideoMontagePackage.AUDIO__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case VideoMontagePackage.AUDIO__AUDIOCLIP:
				return audioclip != null;
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
		result.append(')');
		return result.toString();
	}

} //AudioImpl
