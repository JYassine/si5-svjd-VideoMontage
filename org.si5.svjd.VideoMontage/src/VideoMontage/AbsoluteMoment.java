/**
 */
package VideoMontage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Absolute Moment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VideoMontage.AbsoluteMoment#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see VideoMontage.VideoMontagePackage#getAbsoluteMoment()
 * @model
 * @generated
 */
public interface AbsoluteMoment extends StartingMoment {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(double)
	 * @see VideoMontage.VideoMontagePackage#getAbsoluteMoment_Time()
	 * @model
	 * @generated
	 */
	double getTime();

	/**
	 * Sets the value of the '{@link VideoMontage.AbsoluteMoment#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(double value);

} // AbsoluteMoment
