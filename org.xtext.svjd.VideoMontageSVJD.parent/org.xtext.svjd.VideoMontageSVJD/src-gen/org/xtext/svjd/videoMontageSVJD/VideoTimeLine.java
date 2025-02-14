/**
 * generated by Xtext 2.24.0
 */
package org.xtext.svjd.videoMontageSVJD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Time Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.svjd.videoMontageSVJD.VideoTimeLine#getVideos <em>Videos</em>}</li>
 * </ul>
 *
 * @see org.xtext.svjd.videoMontageSVJD.VideoMontageSVJDPackage#getVideoTimeLine()
 * @model
 * @generated
 */
public interface VideoTimeLine extends EObject
{
  /**
   * Returns the value of the '<em><b>Videos</b></em>' reference list.
   * The list contents are of type {@link org.xtext.svjd.videoMontageSVJD.VideoElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Videos</em>' reference list.
   * @see org.xtext.svjd.videoMontageSVJD.VideoMontageSVJDPackage#getVideoTimeLine_Videos()
   * @model
   * @generated
   */
  EList<VideoElement> getVideos();

} // VideoTimeLine
