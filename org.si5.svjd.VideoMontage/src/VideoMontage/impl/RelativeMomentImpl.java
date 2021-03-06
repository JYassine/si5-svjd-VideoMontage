/**
 */
package VideoMontage.impl;

import VideoMontage.Element;
import VideoMontage.Moment;
import VideoMontage.OperationMoment;
import VideoMontage.RelativeMoment;
import VideoMontage.VideoMontagePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relative Moment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link VideoMontage.impl.RelativeMomentImpl#getMoment <em>Moment</em>}</li>
 *   <li>{@link VideoMontage.impl.RelativeMomentImpl#getValue <em>Value</em>}</li>
 *   <li>{@link VideoMontage.impl.RelativeMomentImpl#getElement <em>Element</em>}</li>
 *   <li>{@link VideoMontage.impl.RelativeMomentImpl#getOperationMoment <em>Operation Moment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelativeMomentImpl extends StartingMomentImpl implements RelativeMoment {
	/**
	 * The default value of the '{@link #getMoment() <em>Moment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoment()
	 * @generated
	 * @ordered
	 */
	protected static final Moment MOMENT_EDEFAULT = Moment.STARTING;

	/**
	 * The cached value of the '{@link #getMoment() <em>Moment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoment()
	 * @generated
	 * @ordered
	 */
	protected Moment moment = MOMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected Element element;

	/**
	 * The default value of the '{@link #getOperationMoment() <em>Operation Moment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationMoment()
	 * @generated
	 * @ordered
	 */
	protected static final OperationMoment OPERATION_MOMENT_EDEFAULT = OperationMoment.ADDITION;

	/**
	 * The cached value of the '{@link #getOperationMoment() <em>Operation Moment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationMoment()
	 * @generated
	 * @ordered
	 */
	protected OperationMoment operationMoment = OPERATION_MOMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelativeMomentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideoMontagePackage.Literals.RELATIVE_MOMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Moment getMoment() {
		return moment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoment(Moment newMoment) {
		Moment oldMoment = moment;
		moment = newMoment == null ? MOMENT_EDEFAULT : newMoment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.RELATIVE_MOMENT__MOMENT, oldMoment, moment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.RELATIVE_MOMENT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject)element;
			element = (Element)eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VideoMontagePackage.RELATIVE_MOMENT__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(Element newElement) {
		Element oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.RELATIVE_MOMENT__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationMoment getOperationMoment() {
		return operationMoment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationMoment(OperationMoment newOperationMoment) {
		OperationMoment oldOperationMoment = operationMoment;
		operationMoment = newOperationMoment == null ? OPERATION_MOMENT_EDEFAULT : newOperationMoment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.RELATIVE_MOMENT__OPERATION_MOMENT, oldOperationMoment, operationMoment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VideoMontagePackage.RELATIVE_MOMENT__MOMENT:
				return getMoment();
			case VideoMontagePackage.RELATIVE_MOMENT__VALUE:
				return getValue();
			case VideoMontagePackage.RELATIVE_MOMENT__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
			case VideoMontagePackage.RELATIVE_MOMENT__OPERATION_MOMENT:
				return getOperationMoment();
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
			case VideoMontagePackage.RELATIVE_MOMENT__MOMENT:
				setMoment((Moment)newValue);
				return;
			case VideoMontagePackage.RELATIVE_MOMENT__VALUE:
				setValue((Double)newValue);
				return;
			case VideoMontagePackage.RELATIVE_MOMENT__ELEMENT:
				setElement((Element)newValue);
				return;
			case VideoMontagePackage.RELATIVE_MOMENT__OPERATION_MOMENT:
				setOperationMoment((OperationMoment)newValue);
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
			case VideoMontagePackage.RELATIVE_MOMENT__MOMENT:
				setMoment(MOMENT_EDEFAULT);
				return;
			case VideoMontagePackage.RELATIVE_MOMENT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case VideoMontagePackage.RELATIVE_MOMENT__ELEMENT:
				setElement((Element)null);
				return;
			case VideoMontagePackage.RELATIVE_MOMENT__OPERATION_MOMENT:
				setOperationMoment(OPERATION_MOMENT_EDEFAULT);
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
			case VideoMontagePackage.RELATIVE_MOMENT__MOMENT:
				return moment != MOMENT_EDEFAULT;
			case VideoMontagePackage.RELATIVE_MOMENT__VALUE:
				return value != VALUE_EDEFAULT;
			case VideoMontagePackage.RELATIVE_MOMENT__ELEMENT:
				return element != null;
			case VideoMontagePackage.RELATIVE_MOMENT__OPERATION_MOMENT:
				return operationMoment != OPERATION_MOMENT_EDEFAULT;
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
		result.append(" (moment: ");
		result.append(moment);
		result.append(", value: ");
		result.append(value);
		result.append(", operationMoment: ");
		result.append(operationMoment);
		result.append(')');
		return result.toString();
	}

} //RelativeMomentImpl
