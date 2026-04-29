/**
 */
package mof.impl;

import mof.Linea;
import mof.MofPackage;
import mof.NodoDos;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nodo Dos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mof.impl.NodoDosImpl#getForma <em>Forma</em>}</li>
 *   <li>{@link mof.impl.NodoDosImpl#getLinea <em>Linea</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodoDosImpl extends NodoImpl implements NodoDos {
	/**
	 * The default value of the '{@link #getForma() <em>Forma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForma()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForma() <em>Forma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForma()
	 * @generated
	 * @ordered
	 */
	protected String forma = FORMA_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinea() <em>Linea</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinea()
	 * @generated
	 * @ordered
	 */
	protected static final Linea LINEA_EDEFAULT = Linea.CONTINUA;

	/**
	 * The cached value of the '{@link #getLinea() <em>Linea</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinea()
	 * @generated
	 * @ordered
	 */
	protected Linea linea = LINEA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodoDosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MofPackage.Literals.NODO_DOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getForma() {
		return forma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForma(String newForma) {
		String oldForma = forma;
		forma = newForma;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MofPackage.NODO_DOS__FORMA, oldForma, forma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Linea getLinea() {
		return linea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinea(Linea newLinea) {
		Linea oldLinea = linea;
		linea = newLinea == null ? LINEA_EDEFAULT : newLinea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MofPackage.NODO_DOS__LINEA, oldLinea, linea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MofPackage.NODO_DOS__FORMA:
				return getForma();
			case MofPackage.NODO_DOS__LINEA:
				return getLinea();
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
			case MofPackage.NODO_DOS__FORMA:
				setForma((String)newValue);
				return;
			case MofPackage.NODO_DOS__LINEA:
				setLinea((Linea)newValue);
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
			case MofPackage.NODO_DOS__FORMA:
				setForma(FORMA_EDEFAULT);
				return;
			case MofPackage.NODO_DOS__LINEA:
				setLinea(LINEA_EDEFAULT);
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
			case MofPackage.NODO_DOS__FORMA:
				return FORMA_EDEFAULT == null ? forma != null : !FORMA_EDEFAULT.equals(forma);
			case MofPackage.NODO_DOS__LINEA:
				return linea != LINEA_EDEFAULT;
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
		result.append(", linea: ");
		result.append(linea);
		result.append(')');
		return result.toString();
	}

} //NodoDosImpl
