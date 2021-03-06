/**
 * generated by Xtext 2.24.0
 */
package org.xtext.svjd.videoMontageSVJD;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.svjd.videoMontageSVJD.Transition#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.xtext.svjd.videoMontageSVJD.Transition#getAudioelement <em>Audioelement</em>}</li>
 * </ul>
 *
 * @see org.xtext.svjd.videoMontageSVJD.VideoMontageSVJDPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject
{
  /**
   * Returns the value of the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duration</em>' attribute.
   * @see #setDuration(double)
   * @see org.xtext.svjd.videoMontageSVJD.VideoMontageSVJDPackage#getTransition_Duration()
   * @model
   * @generated
   */
  double getDuration();

  /**
   * Sets the value of the '{@link org.xtext.svjd.videoMontageSVJD.Transition#getDuration <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duration</em>' attribute.
   * @see #getDuration()
   * @generated
   */
  void setDuration(double value);

  /**
   * Returns the value of the '<em><b>Audioelement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Audioelement</em>' containment reference.
   * @see #setAudioelement(AudioElement)
   * @see org.xtext.svjd.videoMontageSVJD.VideoMontageSVJDPackage#getTransition_Audioelement()
   * @model containment="true"
   * @generated
   */
  AudioElement getAudioelement();

  /**
   * Sets the value of the '{@link org.xtext.svjd.videoMontageSVJD.Transition#getAudioelement <em>Audioelement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Audioelement</em>' containment reference.
   * @see #getAudioelement()
   * @generated
   */
  void setAudioelement(AudioElement value);

} // Transition
