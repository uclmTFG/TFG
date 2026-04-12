/**
 */
package mof.impl;

import java.util.Collection;

import mof.AtributosMetodos;
import mof.MofPackage;
import mof.NodoDos;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nodo Dos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mof.impl.NodoDosImpl#getAtributometodo <em>Atributometodo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodoDosImpl extends NodoImpl implements NodoDos {
	/**
	 * The cached value of the '{@link #getAtributometodo() <em>Atributometodo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributometodo()
	 * @generated
	 * @ordered
	 */
	protected EList<AtributosMetodos> atributometodo;

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
	public EList<AtributosMetodos> getAtributometodo() {
		if (atributometodo == null) {
			atributometodo = new EObjectContainmentEList<AtributosMetodos>(AtributosMetodos.class, this, MofPackage.NODO_DOS__ATRIBUTOMETODO);
		}
		return atributometodo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MofPackage.NODO_DOS__ATRIBUTOMETODO:
				return ((InternalEList<?>)getAtributometodo()).basicRemove(otherEnd, msgs);
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
			case MofPackage.NODO_DOS__ATRIBUTOMETODO:
				return getAtributometodo();
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
			case MofPackage.NODO_DOS__ATRIBUTOMETODO:
				getAtributometodo().clear();
				getAtributometodo().addAll((Collection<? extends AtributosMetodos>)newValue);
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
			case MofPackage.NODO_DOS__ATRIBUTOMETODO:
				getAtributometodo().clear();
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
			case MofPackage.NODO_DOS__ATRIBUTOMETODO:
				return atributometodo != null && !atributometodo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NodoDosImpl
