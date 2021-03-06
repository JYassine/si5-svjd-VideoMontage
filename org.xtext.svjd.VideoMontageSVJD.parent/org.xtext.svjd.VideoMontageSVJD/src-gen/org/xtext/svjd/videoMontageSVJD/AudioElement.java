/**
 * generated by Xtext 2.24.0
 */
package org.xtext.svjd.videoMontageSVJD;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audio Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.svjd.videoMontageSVJD.AudioElement#getStartingmoment <em>Startingmoment</em>}</li>
 *   <li>{@link org.xtext.svjd.videoMontageSVJD.AudioElement#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see org.xtext.svjd.videoMontageSVJD.VideoMontageSVJDPackage#getAudioElement()
 * @model
 * @generated
 */
public interface AudioElement extends Element
{
  /**
   * Returns the value of the '<em><b>Startingmoment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Startingmoment</em>' containment reference.
   * @see #setStartingmoment(StartingMoment)
   * @see org.xtext.svjd.videoMontageSVJD.VideoMontageSVJDPackage#getAudioElement_Startingmoment()
   * @model containment="true"
   * @generated
   */
  StartingMoment getStartingmoment();

  /**
   * Sets the value of the '{@link org.xtext.svjd.videoMontageSVJD.AudioElement#getStartingmoment <em>Startingmoment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Startingmoment</em>' containment reference.
   * @see #getStartingmoment()
   * @generated
   */
  void setStartingmoment(StartingMoment value);

  /**
   * Returns the value of the '<em><b>Transition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transition</em>' containment reference.
   * @see #setTransition(Transition)
   * @see org.xtext.svjd.videoMontageSVJD.VideoMontageSVJDPackage#getAudioElement_Transition()
   * @model containment="true"
   * @generated
   */
  Transition getTransition();

  /**
   * Sets the value of the '{@link org.xtext.svjd.videoMontageSVJD.AudioElement#getTransition <em>Transition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transition</em>' containment reference.
   * @see #getTransition()
   * @generated
   */
  void setTransition(Transition value);

} // AudioElement
