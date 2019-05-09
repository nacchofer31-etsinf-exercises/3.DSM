/**
 */
package Practica6.tests;

import Practica6.Esquema;
import Practica6.Practica6Factory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Esquema</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EsquemaTest extends TestCase {

	/**
	 * The fixture for this Esquema test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Esquema fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EsquemaTest.class);
	}

	/**
	 * Constructs a new Esquema test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsquemaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Esquema test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Esquema fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Esquema test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Esquema getFixture() {
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
		setFixture(Practica6Factory.eINSTANCE.createEsquema());
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

} //EsquemaTest
