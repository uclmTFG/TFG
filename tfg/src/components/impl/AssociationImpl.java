/**
 */
package components.impl;

import components.Association;
import components.ComponentsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link components.impl.AssociationImpl#getRole <em>Role</em>}</li>
 *   <li>{@link components.impl.AssociationImpl#getSourceMultiplicity <em>Source Multiplicity</em>}</li>
 *   <li>{@link components.impl.AssociationImpl#getTargetMultiplicity <em>Target Multiplicity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends RelationshipImpl implements Association {
	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = "uses";

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceMultiplicity() <em>Source Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_MULTIPLICITY_EDEFAULT = "1";

	/**
	 * The cached value of the '{@link #getSourceMultiplicity() <em>Source Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected String sourceMultiplicity = SOURCE_MULTIPLICITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetMultiplicity() <em>Target Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_MULTIPLICITY_EDEFAULT = "*";

	/**
	 * The cached value of the '{@link #getTargetMultiplicity() <em>Target Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected String targetMultiplicity = TARGET_MULTIPLICITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.ASSOCIATION__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceMultiplicity() {
		return sourceMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceMultiplicity(String newSourceMultiplicity) {
		String oldSourceMultiplicity = sourceMultiplicity;
		sourceMultiplicity = newSourceMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.ASSOCIATION__SOURCE_MULTIPLICITY, oldSourceMultiplicity, sourceMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetMultiplicity() {
		return targetMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetMultiplicity(String newTargetMultiplicity) {
		String oldTargetMultiplicity = targetMultiplicity;
		targetMultiplicity = newTargetMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.ASSOCIATION__TARGET_MULTIPLICITY, oldTargetMultiplicity, targetMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentsPackage.ASSOCIATION__ROLE:
				return getRole();
			case ComponentsPackage.ASSOCIATION__SOURCE_MULTIPLICITY:
				return getSourceMultiplicity();
			case ComponentsPackage.ASSOCIATION__TARGET_MULTIPLICITY:
				return getTargetMultiplicity();
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
			case ComponentsPackage.ASSOCIATION__ROLE:
				setRole((String)newValue);
				return;
			case ComponentsPackage.ASSOCIATION__SOURCE_MULTIPLICITY:
				setSourceMultiplicity((String)newValue);
				return;
			case ComponentsPackage.ASSOCIATION__TARGET_MULTIPLICITY:
				setTargetMultiplicity((String)newValue);
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
			case ComponentsPackage.ASSOCIATION__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case ComponentsPackage.ASSOCIATION__SOURCE_MULTIPLICITY:
				setSourceMultiplicity(SOURCE_MULTIPLICITY_EDEFAULT);
				return;
			case ComponentsPackage.ASSOCIATION__TARGET_MULTIPLICITY:
				setTargetMultiplicity(TARGET_MULTIPLICITY_EDEFAULT);
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
			case ComponentsPackage.ASSOCIATION__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case ComponentsPackage.ASSOCIATION__SOURCE_MULTIPLICITY:
				return SOURCE_MULTIPLICITY_EDEFAULT == null ? sourceMultiplicity != null : !SOURCE_MULTIPLICITY_EDEFAULT.equals(sourceMultiplicity);
			case ComponentsPackage.ASSOCIATION__TARGET_MULTIPLICITY:
				return TARGET_MULTIPLICITY_EDEFAULT == null ? targetMultiplicity != null : !TARGET_MULTIPLICITY_EDEFAULT.equals(targetMultiplicity);
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
		result.append(" (role: ");
		result.append(role);
		result.append(", sourceMultiplicity: ");
		result.append(sourceMultiplicity);
		result.append(", targetMultiplicity: ");
		result.append(targetMultiplicity);
		result.append(')');
		return result.toString();
	}

} //AssociationImpl
