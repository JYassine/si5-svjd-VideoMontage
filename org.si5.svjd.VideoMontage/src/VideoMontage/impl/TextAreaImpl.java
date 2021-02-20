/**
 */
package VideoMontage.impl;

import VideoMontage.Animation;
import VideoMontage.Font;
import VideoMontage.TextArea;
import VideoMontage.VideoMontagePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link VideoMontage.impl.TextAreaImpl#getX <em>X</em>}</li>
 *   <li>{@link VideoMontage.impl.TextAreaImpl#getY <em>Y</em>}</li>
 *   <li>{@link VideoMontage.impl.TextAreaImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link VideoMontage.impl.TextAreaImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link VideoMontage.impl.TextAreaImpl#getText <em>Text</em>}</li>
 *   <li>{@link VideoMontage.impl.TextAreaImpl#getFont <em>Font</em>}</li>
 *   <li>{@link VideoMontage.impl.TextAreaImpl#getAnimation <em>Animation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextAreaImpl extends MinimalEObjectImpl.Container implements TextArea {
	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final int X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected int x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final int Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected int y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected double width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected double height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFont() <em>Font</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
	protected Font font;

	/**
	 * The cached value of the '{@link #getAnimation() <em>Animation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimation()
	 * @generated
	 * @ordered
	 */
	protected EList<Animation> animation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideoMontagePackage.Literals.TEXT_AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(int newX) {
		int oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.TEXT_AREA__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(int newY) {
		int oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.TEXT_AREA__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(double newWidth) {
		double oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.TEXT_AREA__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(double newHeight) {
		double oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.TEXT_AREA__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.TEXT_AREA__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Font getFont() {
		if (font != null && font.eIsProxy()) {
			InternalEObject oldFont = (InternalEObject)font;
			font = (Font)eResolveProxy(oldFont);
			if (font != oldFont) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VideoMontagePackage.TEXT_AREA__FONT, oldFont, font));
			}
		}
		return font;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Font basicGetFont() {
		return font;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFont(Font newFont) {
		Font oldFont = font;
		font = newFont;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoMontagePackage.TEXT_AREA__FONT, oldFont, font));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Animation> getAnimation() {
		if (animation == null) {
			animation = new EObjectContainmentEList<Animation>(Animation.class, this, VideoMontagePackage.TEXT_AREA__ANIMATION);
		}
		return animation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VideoMontagePackage.TEXT_AREA__ANIMATION:
				return ((InternalEList<?>)getAnimation()).basicRemove(otherEnd, msgs);
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
			case VideoMontagePackage.TEXT_AREA__X:
				return getX();
			case VideoMontagePackage.TEXT_AREA__Y:
				return getY();
			case VideoMontagePackage.TEXT_AREA__WIDTH:
				return getWidth();
			case VideoMontagePackage.TEXT_AREA__HEIGHT:
				return getHeight();
			case VideoMontagePackage.TEXT_AREA__TEXT:
				return getText();
			case VideoMontagePackage.TEXT_AREA__FONT:
				if (resolve) return getFont();
				return basicGetFont();
			case VideoMontagePackage.TEXT_AREA__ANIMATION:
				return getAnimation();
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
			case VideoMontagePackage.TEXT_AREA__X:
				setX((Integer)newValue);
				return;
			case VideoMontagePackage.TEXT_AREA__Y:
				setY((Integer)newValue);
				return;
			case VideoMontagePackage.TEXT_AREA__WIDTH:
				setWidth((Double)newValue);
				return;
			case VideoMontagePackage.TEXT_AREA__HEIGHT:
				setHeight((Double)newValue);
				return;
			case VideoMontagePackage.TEXT_AREA__TEXT:
				setText((String)newValue);
				return;
			case VideoMontagePackage.TEXT_AREA__FONT:
				setFont((Font)newValue);
				return;
			case VideoMontagePackage.TEXT_AREA__ANIMATION:
				getAnimation().clear();
				getAnimation().addAll((Collection<? extends Animation>)newValue);
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
			case VideoMontagePackage.TEXT_AREA__X:
				setX(X_EDEFAULT);
				return;
			case VideoMontagePackage.TEXT_AREA__Y:
				setY(Y_EDEFAULT);
				return;
			case VideoMontagePackage.TEXT_AREA__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case VideoMontagePackage.TEXT_AREA__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case VideoMontagePackage.TEXT_AREA__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case VideoMontagePackage.TEXT_AREA__FONT:
				setFont((Font)null);
				return;
			case VideoMontagePackage.TEXT_AREA__ANIMATION:
				getAnimation().clear();
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
			case VideoMontagePackage.TEXT_AREA__X:
				return x != X_EDEFAULT;
			case VideoMontagePackage.TEXT_AREA__Y:
				return y != Y_EDEFAULT;
			case VideoMontagePackage.TEXT_AREA__WIDTH:
				return width != WIDTH_EDEFAULT;
			case VideoMontagePackage.TEXT_AREA__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case VideoMontagePackage.TEXT_AREA__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case VideoMontagePackage.TEXT_AREA__FONT:
				return font != null;
			case VideoMontagePackage.TEXT_AREA__ANIMATION:
				return animation != null && !animation.isEmpty();
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
		result.append(" (x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //TextAreaImpl
