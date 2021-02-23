/**
 */
package VideoMontage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Moment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VideoMontage.RelativeMoment#getMoment <em>Moment</em>}</li>
 *   <li>{@link VideoMontage.RelativeMoment#getValue <em>Value</em>}</li>
 *   <li>{@link VideoMontage.RelativeMoment#getElement <em>Element</em>}</li>
 *   <li>{@link VideoMontage.RelativeMoment#getOperationMoment <em>Operation Moment</em>}</li>
 * </ul>
 *
 * @see VideoMontage.VideoMontagePackage#getRelativeMoment()
 * @model
 * @generated
 */
public interface RelativeMoment extends StartingMoment {
	/**
	 * Returns the value of the '<em><b>Moment</b></em>' attribute.
	 * The literals are from the enumeration {@link VideoMontage.Moment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moment</em>' attribute.
	 * @see VideoMontage.Moment
	 * @see #setMoment(Moment)
	 * @see VideoMontage.VideoMontagePackage#getRelativeMoment_Moment()
	 * @model
	 * @generated
	 */
	Moment getMoment();

	/**
	 * Sets the value of the '{@link VideoMontage.RelativeMoment#getMoment <em>Moment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moment</em>' attribute.
	 * @see VideoMontage.Moment
	 * @see #getMoment()
	 * @generated
	 */
	void setMoment(Moment value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see VideoMontage.VideoMontagePackage#getRelativeMoment_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link VideoMontage.RelativeMoment#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(Element)
	 * @see VideoMontage.VideoMontagePackage#getRelativeMoment_Element()
	 * @model
	 * @generated
	 */
	Element getElement();

	/**
	 * Sets the value of the '{@link VideoMontage.RelativeMoment#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(Element value);

	/**
	 * Returns the value of the '<em><b>Operation Moment</b></em>' attribute.
	 * The literals are from the enumeration {@link VideoMontage.OperationMoment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Moment</em>' attribute.
	 * @see VideoMontage.OperationMoment
	 * @see #setOperationMoment(OperationMoment)
	 * @see VideoMontage.VideoMontagePackage#getRelativeMoment_OperationMoment()
	 * @model
	 * @generated
	 */
	OperationMoment getOperationMoment();

	/**
	 * Sets the value of the '{@link VideoMontage.RelativeMoment#getOperationMoment <em>Operation Moment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Moment</em>' attribute.
	 * @see VideoMontage.OperationMoment
	 * @see #getOperationMoment()
	 * @generated
	 */
	void setOperationMoment(OperationMoment value);

} // RelativeMoment
