/**
 */
package mof.impl;

import java.util.Collection;

import mof.Enlace;
import mof.MofPackage;
import mof.Nodo;
import mof.UMLDiagram;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mof.impl.UMLDiagramImpl#getNodos <em>Nodos</em>}</li>
 *   <li>{@link mof.impl.UMLDiagramImpl#getEnlaces <em>Enlaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UMLDiagramImpl extends EObjectImpl implements UMLDiagram {
	/**
	 * The cached value of the '{@link #getNodos() <em>Nodos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodos()
	 * @generated
	 * @ordered
	 */
	protected EList<Nodo> nodos;

	/**
	 * The cached value of the '{@link #getEnlaces() <em>Enlaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Enlace> enlaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MofPackage.Literals.UML_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Nodo> getNodos() {
		if (nodos == null) {
			nodos = new EObjectContainmentEList<Nodo>(Nodo.class, this, MofPackage.UML_DIAGRAM__NODOS);
		}
		return nodos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Enlace> getEnlaces() {
		if (enlaces == null) {
			enlaces = new EObjectContainmentEList<Enlace>(Enlace.class, this, MofPackage.UML_DIAGRAM__ENLACES);
		}
		return enlaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MofPackage.UML_DIAGRAM__NODOS:
				return ((InternalEList<?>)getNodos()).basicRemove(otherEnd, msgs);
			case MofPackage.UML_DIAGRAM__ENLACES:
				return ((InternalEList<?>)getEnlaces()).basicRemove(otherEnd, msgs);
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
			case MofPackage.UML_DIAGRAM__NODOS:
				return getNodos();
			case MofPackage.UML_DIAGRAM__ENLACES:
				return getEnlaces();
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
			case MofPackage.UML_DIAGRAM__NODOS:
				getNodos().clear();
				getNodos().addAll((Collection<? extends Nodo>)newValue);
				return;
			case MofPackage.UML_DIAGRAM__ENLACES:
				getEnlaces().clear();
				getEnlaces().addAll((Collection<? extends Enlace>)newValue);
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
			case MofPackage.UML_DIAGRAM__NODOS:
				getNodos().clear();
				return;
			case MofPackage.UML_DIAGRAM__ENLACES:
				getEnlaces().clear();
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
			case MofPackage.UML_DIAGRAM__NODOS:
				return nodos != null && !nodos.isEmpty();
			case MofPackage.UML_DIAGRAM__ENLACES:
				return enlaces != null && !enlaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UMLDiagramImpl
