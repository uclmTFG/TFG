/**
 */
package mof.impl;

import java.util.Collection;

import mof.MofPackage;
import mof.NodoDos;
import mof.NodoUno;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nodo Uno</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mof.impl.NodoUnoImpl#getNodosDos <em>Nodos Dos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodoUnoImpl extends NodoImpl implements NodoUno {
	/**
	 * The cached value of the '{@link #getNodosDos() <em>Nodos Dos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodosDos()
	 * @generated
	 * @ordered
	 */
	protected EList<NodoDos> nodosDos;

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
	public EList<NodoDos> getNodosDos() {
		if (nodosDos == null) {
			nodosDos = new EObjectContainmentEList<NodoDos>(NodoDos.class, this, MofPackage.NODO_UNO__NODOS_DOS);
		}
		return nodosDos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MofPackage.NODO_UNO__NODOS_DOS:
				return ((InternalEList<?>)getNodosDos()).basicRemove(otherEnd, msgs);
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
			case MofPackage.NODO_UNO__NODOS_DOS:
				return getNodosDos();
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
			case MofPackage.NODO_UNO__NODOS_DOS:
				getNodosDos().clear();
				getNodosDos().addAll((Collection<? extends NodoDos>)newValue);
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
			case MofPackage.NODO_UNO__NODOS_DOS:
				getNodosDos().clear();
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
			case MofPackage.NODO_UNO__NODOS_DOS:
				return nodosDos != null && !nodosDos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NodoUnoImpl
