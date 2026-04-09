/**
 */
package mof.tests;

import junit.textui.TestRunner;

import mof.Clas;
import mof.MofFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Clas</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClasTest extends NodeoneTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClasTest.class);
	}

	/**
	 * Constructs a new Clas test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClasTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Clas test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Clas getFixture() {
		return (Clas)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MofFactory.eINSTANCE.createClas());
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

} //ClasTest
