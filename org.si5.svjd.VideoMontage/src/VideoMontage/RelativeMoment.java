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

} // RelativeMoment
