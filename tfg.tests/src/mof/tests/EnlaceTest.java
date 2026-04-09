/**
 */
package mof.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mof.Enlace;
import mof.MofFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Enlace</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnlaceTest extends TestCase {

	/**
	 * The fixture for this Enlace test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Enlace fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EnlaceTest.class);
	}

	/**
	 * Constructs a new Enlace test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnlaceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Enlace test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Enlace fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Enlace test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Enlace getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MofFactory.eINSTANCE.createEnlace());
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

} //EnlaceTest
