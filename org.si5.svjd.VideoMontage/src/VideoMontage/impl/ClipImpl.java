/**
 */
package VideoMontage.impl;

import VideoMontage.Clip;
import VideoMontage.Video;
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
 * An implementation of the model object '<em><b>Clip</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link VideoMontage.impl.ClipImpl#getStartCut <em>Start Cut</em>}</li>
 *   <li>{@link VideoMontage.impl.ClipImpl#getEndCut <em>End Cut</em>}</li>
 *   <li>{@link VideoMontage.impl.ClipImpl#getName <em>Name</em>}</li>
 *   <li>{@link VideoMontage.impl.ClipImpl#getVideo <em>Video</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClipImpl extends VideoElementImpl implements Clip {
	/**
	 * The default value of the '{@link #getStartCut() <em>Start Cut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartCut()
	 * @generated
	 * @ordered
	 */
	protected static final String START_CUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartCut() <em>Start Cut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartCut()
	 * @generated
	 * @ordered
	 */
	protected String startCut = START_CUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndCut() <em>End Cut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndCut()
	 * @generated
	 * @ordered
	 */
	protected static final String END_CUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndCut() <em>End Cut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndCut()
	 * @generated
	 * @ordered
	 */
	protected String endCut = END_CUT_EDEFAULT;

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
	 * The cached value of the '{@link #getVideo() <em>Video</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideo()
	 * @generated
	 * @ordered
	 */
	protected EList<Video> video;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideoMontagePackage.Literals.CLIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartCut() {
		return startCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartCut(String newStartCut) {
		String oldStartCut = startCut;
		startCut = newStartCut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.CLIP__START_CUT, oldStartCut, startCut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndCut() {
		return endCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndCut(String newEndCut) {
		String oldEndCut = endCut;
		endCut = newEndCut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.CLIP__END_CUT, oldEndCut, endCut));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.CLIP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Video> getVideo() {
		if (video == null) {
			video = new EObjectContainmentEList<Video>(Video.class, this, VideoMontagePackage.CLIP__VIDEO);
		}
		return video;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VideoMontagePackage.CLIP__VIDEO:
				return ((InternalEList<?>)getVideo()).basicRemove(otherEnd, msgs);
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
			case VideoMontagePackage.CLIP__START_CUT:
				return getStartCut();
			case VideoMontagePackage.CLIP__END_CUT:
				return getEndCut();
			case VideoMontagePackage.CLIP__NAME:
				return getName();
			case VideoMontagePackage.CLIP__VIDEO:
				return getVideo();
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
			case VideoMontagePackage.CLIP__START_CUT:
				setStartCut((String)newValue);
				return;
			case VideoMontagePackage.CLIP__END_CUT:
				setEndCut((String)newValue);
				return;
			case VideoMontagePackage.CLIP__NAME:
				setName((String)newValue);
				return;
			case VideoMontagePackage.CLIP__VIDEO:
				getVideo().clear();
				getVideo().addAll((Collection<? extends Video>)newValue);
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
			case VideoMontagePackage.CLIP__START_CUT:
				setStartCut(START_CUT_EDEFAULT);
				return;
			case VideoMontagePackage.CLIP__END_CUT:
				setEndCut(END_CUT_EDEFAULT);
				return;
			case VideoMontagePackage.CLIP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VideoMontagePackage.CLIP__VIDEO:
				getVideo().clear();
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
			case VideoMontagePackage.CLIP__START_CUT:
				return START_CUT_EDEFAULT == null ? startCut != null : !START_CUT_EDEFAULT.equals(startCut);
			case VideoMontagePackage.CLIP__END_CUT:
				return END_CUT_EDEFAULT == null ? endCut != null : !END_CUT_EDEFAULT.equals(endCut);
			case VideoMontagePackage.CLIP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VideoMontagePackage.CLIP__VIDEO:
				return video != null && !video.isEmpty();
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
		result.append(" (startCut: ");
		result.append(startCut);
		result.append(", endCut: ");
		result.append(endCut);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ClipImpl
