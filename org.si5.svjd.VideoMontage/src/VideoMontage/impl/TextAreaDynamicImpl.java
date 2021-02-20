/**
 */
package VideoMontage.impl;

import VideoMontage.TextAreaDynamic;
import VideoMontage.VideoMontagePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Area Dynamic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link VideoMontage.impl.TextAreaDynamicImpl#getTextSrc <em>Text Src</em>}</li>
 *   <li>{@link VideoMontage.impl.TextAreaDynamicImpl#getLine <em>Line</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextAreaDynamicImpl extends TextAreaImpl implements TextAreaDynamic {
	/**
	 * The default value of the '{@link #getTextSrc() <em>Text Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextSrc()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_SRC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextSrc() <em>Text Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextSrc()
	 * @generated
	 * @ordered
	 */
	protected String textSrc = TEXT_SRC_EDEFAULT;

	/**
	 * The default value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected int line = LINE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextAreaDynamicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideoMontagePackage.Literals.TEXT_AREA_DYNAMIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextSrc() {
		return textSrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextSrc(String newTextSrc) {
		String oldTextSrc = textSrc;
		textSrc = newTextSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.TEXT_AREA_DYNAMIC__TEXT_SRC, oldTextSrc, textSrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLine() {
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine(int newLine) {
		int oldLine = line;
		line = newLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.TEXT_AREA_DYNAMIC__LINE, oldLine, line));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VideoMontagePackage.TEXT_AREA_DYNAMIC__TEXT_SRC:
				return getTextSrc();
			case VideoMontagePackage.TEXT_AREA_DYNAMIC__LINE:
				return getLine();
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
			case VideoMontagePackage.TEXT_AREA_DYNAMIC__TEXT_SRC:
				setTextSrc((String)newValue);
				return;
			case VideoMontagePackage.TEXT_AREA_DYNAMIC__LINE:
				setLine((Integer)newValue);
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
			case VideoMontagePackage.TEXT_AREA_DYNAMIC__TEXT_SRC:
				setTextSrc(TEXT_SRC_EDEFAULT);
				return;
			case VideoMontagePackage.TEXT_AREA_DYNAMIC__LINE:
				setLine(LINE_EDEFAULT);
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
			case VideoMontagePackage.TEXT_AREA_DYNAMIC__TEXT_SRC:
				return TEXT_SRC_EDEFAULT == null ? textSrc != null : !TEXT_SRC_EDEFAULT.equals(textSrc);
			case VideoMontagePackage.TEXT_AREA_DYNAMIC__LINE:
				return line != LINE_EDEFAULT;
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
		result.append(" (textSrc: ");
		result.append(textSrc);
		result.append(", line: ");
		result.append(line);
		result.append(')');
		return result.toString();
	}

} //TextAreaDynamicImpl
