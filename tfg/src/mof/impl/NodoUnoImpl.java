/**
 */
package mof.impl;

import mof.Color;
import mof.Forma;
import mof.MofPackage;
import mof.NodoUno;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nodo Uno</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mof.impl.NodoUnoImpl#getForma <em>Forma</em>}</li>
 *   <li>{@link mof.impl.NodoUnoImpl#getColorBorde <em>Color Borde</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodoUnoImpl extends NodoImpl implements NodoUno {
	/**
	 * The default value of the '{@link #getForma() <em>Forma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForma()
	 * @generated
	 * @ordered
	 */
	protected static final Forma FORMA_EDEFAULT = Forma.RECTANGULO;

	/**
	 * The cached value of the '{@link #getForma() <em>Forma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForma()
	 * @generated
	 * @ordered
	 */
	protected Forma forma = FORMA_EDEFAULT;

	/**
	 * The default value of the '{@link #getColorBorde() <em>Color Borde</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorBorde()
	 * @generated
	 * @ordered
	 */
	protected static final Color COLOR_BORDE_EDEFAULT = Color.BLANCO;

	/**
	 * The cached value of the '{@link #getColorBorde() <em>Color Borde</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorBorde()
	 * @generated
	 * @ordered
	 */
	protected Color colorBorde = COLOR_BORDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodoUnoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MofPackage.Literals.NODO_UNO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Forma getForma() {
		return forma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForma(Forma newForma) {
		Forma oldForma = forma;
		forma = newForma == null ? FORMA_EDEFAULT : newForma;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MofPackage.NODO_UNO__FORMA, oldForma, forma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color getColorBorde() {
		return colorBorde;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColorBorde(Color newColorBorde) {
		Color oldColorBorde = colorBorde;
		colorBorde = newColorBorde == null ? COLOR_BORDE_EDEFAULT : newColorBorde;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MofPackage.NODO_UNO__COLOR_BORDE, oldColorBorde, colorBorde));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MofPackage.NODO_UNO__FORMA:
				return getForma();
			case MofPackage.NODO_UNO__COLOR_BORDE:
				return getColorBorde();
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
			case MofPackage.NODO_UNO__FORMA:
				setForma((Forma)newValue);
				return;
			case MofPackage.NODO_UNO__COLOR_BORDE:
				setColorBorde((Color)newValue);
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
			case MofPackage.NODO_UNO__FORMA:
				setForma(FORMA_EDEFAULT);
				return;
			case MofPackage.NODO_UNO__COLOR_BORDE:
				setColorBorde(COLOR_BORDE_EDEFAULT);
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
			case MofPackage.NODO_UNO__FORMA:
				return forma != FORMA_EDEFAULT;
			case MofPackage.NODO_UNO__COLOR_BORDE:
				return colorBorde != COLOR_BORDE_EDEFAULT;
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
		result.append(" (forma: ");
		result.append(forma);
		result.append(", colorBorde: ");
		result.append(colorBorde);
		result.append(')');
		return result.toString();
	}

} //NodoUnoImpl
