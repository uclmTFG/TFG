/**
 */
package components;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link components.Relationship#getSource <em>Source</em>}</li>
 *   <li>{@link components.Relationship#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see components.ComponentsPackage#getRelationship()
 * @model abstract="true"
 * @generated
 */
public interface Relationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Classifier)
	 * @see components.ComponentsPackage#getRelationship_Source()
	 * @model required="true"
	 * @generated
	 */
	Classifier getSource();

	/**
	 * Sets the value of the '{@link components.Relationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Classifier value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Classifier)
	 * @see components.ComponentsPackage#getRelationship_Target()
	 * @model required="true"
	 * @generated
	 */
	Classifier getTarget();

	/**
	 * Sets the value of the '{@link components.Relationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Classifier value);

} // Relationship
