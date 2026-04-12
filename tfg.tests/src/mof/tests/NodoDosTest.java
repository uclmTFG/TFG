/**
 */
package mof.tests;

import junit.textui.TestRunner;

import mof.MofFactory;
import mof.NodoDos;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Nodo Dos</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NodoDosTest extends NodoTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NodoDosTest.class);
	}

	/**
	 * Constructs a new Nodo Dos test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodoDosTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Nodo Dos test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NodoDos getFixture() {
		return (NodoDos)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MofFactory.eINSTANCE.createNodoDos());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //NodoDosTest
