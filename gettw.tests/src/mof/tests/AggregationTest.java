/**
 */
package mof.tests;

import junit.textui.TestRunner;

import mof.Aggregation;
import mof.MofFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Aggregation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AggregationTest extends RelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AggregationTest.class);
	}

	/**
	 * Constructs a new Aggregation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Aggregation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Aggregation getFixture() {
		return (Aggregation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MofFactory.eINSTANCE.createAggregation());
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

} //AggregationTest
