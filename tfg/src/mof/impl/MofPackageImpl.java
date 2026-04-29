/**
 */
package mof.impl;

import mof.Color;
import mof.Enlace;
import mof.FormaExtremoDestino;
import mof.FormaExtremoOrigen;
import mof.Linea;
import mof.MofFactory;
import mof.MofPackage;
import mof.Nodo;
import mof.NodoDos;
import mof.NodoUno;
import mof.UMLDiagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MofPackageImpl extends EPackageImpl implements MofPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodoUnoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodoDosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lineaEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum formaExtremoOrigenEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum formaExtremoDestinoEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see mof.MofPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MofPackageImpl() {
		super(eNS_URI, MofFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MofPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MofPackage init() {
		if (isInited) return (MofPackage)EPackage.Registry.INSTANCE.getEPackage(MofPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMofPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MofPackageImpl theMofPackage = registeredMofPackage instanceof MofPackageImpl ? (MofPackageImpl)registeredMofPackage : new MofPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMofPackage.createPackageContents();

		// Initialize created meta-data
		theMofPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMofPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MofPackage.eNS_URI, theMofPackage);
		return theMofPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUMLDiagram() {
		return umlDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLDiagram_Nodos() {
		return (EReference)umlDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLDiagram_Enlaces() {
		return (EReference)umlDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodo() {
		return nodoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodo_Nombre() {
		return (EAttribute)nodoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodo_Color() {
		return (EAttribute)nodoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodo_ColorBorde() {
		return (EAttribute)nodoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodoUno() {
		return nodoUnoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNodoUno_NodosDos() {
		return (EReference)nodoUnoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodoDos() {
		return nodoDosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodoDos_Forma() {
		return (EAttribute)nodoDosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNodoDos_Linea() {
		return (EAttribute)nodoDosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnlace() {
		return enlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnlace_Texto() {
		return (EAttribute)enlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnlace_Origen() {
		return (EReference)enlaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnlace_Destino() {
		return (EReference)enlaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnlace_Linea() {
		return (EAttribute)enlaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnlace_TextoExtremoOrigen() {
		return (EAttribute)enlaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnlace_TextoExtremoDestino() {
		return (EAttribute)enlaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnlace_FormaExtremoOrigen() {
		return (EAttribute)enlaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnlace_FormaExtremoDestino() {
		return (EAttribute)enlaceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnlace_Color() {
		return (EAttribute)enlaceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getColor() {
		return colorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLinea() {
		return lineaEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFormaExtremoOrigen() {
		return formaExtremoOrigenEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFormaExtremoDestino() {
		return formaExtremoDestinoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MofFactory getMofFactory() {
		return (MofFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		umlDiagramEClass = createEClass(UML_DIAGRAM);
		createEReference(umlDiagramEClass, UML_DIAGRAM__NODOS);
		createEReference(umlDiagramEClass, UML_DIAGRAM__ENLACES);

		nodoEClass = createEClass(NODO);
		createEAttribute(nodoEClass, NODO__NOMBRE);
		createEAttribute(nodoEClass, NODO__COLOR);
		createEAttribute(nodoEClass, NODO__COLOR_BORDE);

		nodoUnoEClass = createEClass(NODO_UNO);
		createEReference(nodoUnoEClass, NODO_UNO__NODOS_DOS);

		nodoDosEClass = createEClass(NODO_DOS);
		createEAttribute(nodoDosEClass, NODO_DOS__FORMA);
		createEAttribute(nodoDosEClass, NODO_DOS__LINEA);

		enlaceEClass = createEClass(ENLACE);
		createEAttribute(enlaceEClass, ENLACE__TEXTO);
		createEReference(enlaceEClass, ENLACE__ORIGEN);
		createEReference(enlaceEClass, ENLACE__DESTINO);
		createEAttribute(enlaceEClass, ENLACE__LINEA);
		createEAttribute(enlaceEClass, ENLACE__TEXTO_EXTREMO_ORIGEN);
		createEAttribute(enlaceEClass, ENLACE__TEXTO_EXTREMO_DESTINO);
		createEAttribute(enlaceEClass, ENLACE__FORMA_EXTREMO_ORIGEN);
		createEAttribute(enlaceEClass, ENLACE__FORMA_EXTREMO_DESTINO);
		createEAttribute(enlaceEClass, ENLACE__COLOR);

		// Create enums
		colorEEnum = createEEnum(COLOR);
		lineaEEnum = createEEnum(LINEA);
		formaExtremoOrigenEEnum = createEEnum(FORMA_EXTREMO_ORIGEN);
		formaExtremoDestinoEEnum = createEEnum(FORMA_EXTREMO_DESTINO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		nodoUnoEClass.getESuperTypes().add(this.getNodo());
		nodoDosEClass.getESuperTypes().add(this.getNodo());

		// Initialize classes and features; add operations and parameters
		initEClass(umlDiagramEClass, UMLDiagram.class, "UMLDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLDiagram_Nodos(), this.getNodo(), null, "nodos", null, 0, -1, UMLDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLDiagram_Enlaces(), this.getEnlace(), null, "enlaces", null, 0, -1, UMLDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodoEClass, Nodo.class, "Nodo", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodo_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Nodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodo_Color(), this.getColor(), "color", "Blanco", 0, 1, Nodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodo_ColorBorde(), this.getColor(), "colorBorde", "Blanco", 0, 1, Nodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodoUnoEClass, NodoUno.class, "NodoUno", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodoUno_NodosDos(), this.getNodoDos(), null, "nodosDos", null, 0, -1, NodoUno.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodoDosEClass, NodoDos.class, "NodoDos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodoDos_Forma(), ecorePackage.getEString(), "forma", null, 0, 1, NodoDos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodoDos_Linea(), this.getLinea(), "linea", "Continua", 0, 1, NodoDos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enlaceEClass, Enlace.class, "Enlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnlace_Texto(), ecorePackage.getEString(), "texto", null, 0, 1, Enlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnlace_Origen(), this.getNodo(), null, "origen", null, 1, 1, Enlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnlace_Destino(), this.getNodo(), null, "destino", null, 1, 1, Enlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnlace_Linea(), this.getLinea(), "linea", "Continua", 0, 1, Enlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnlace_TextoExtremoOrigen(), ecorePackage.getEString(), "textoExtremoOrigen", null, 0, 1, Enlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnlace_TextoExtremoDestino(), ecorePackage.getEString(), "textoExtremoDestino", null, 0, 1, Enlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnlace_FormaExtremoOrigen(), this.getFormaExtremoOrigen(), "formaExtremoOrigen", "Ninguna", 0, 1, Enlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnlace_FormaExtremoDestino(), this.getFormaExtremoDestino(), "formaExtremoDestino", "Ninguna", 0, 1, Enlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnlace_Color(), this.getColor(), "color", "Blanco", 0, 1, Enlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(colorEEnum, Color.class, "Color");
		addEEnumLiteral(colorEEnum, Color.BLANCO);
		addEEnumLiteral(colorEEnum, Color.NEGRO);
		addEEnumLiteral(colorEEnum, Color.ROJO);
		addEEnumLiteral(colorEEnum, Color.VERDE);
		addEEnumLiteral(colorEEnum, Color.AMARILLO);
		addEEnumLiteral(colorEEnum, Color.AZUL);
		addEEnumLiteral(colorEEnum, Color.ROSA);
		addEEnumLiteral(colorEEnum, Color.LILA);
		addEEnumLiteral(colorEEnum, Color.NARANJA);

		initEEnum(lineaEEnum, Linea.class, "Linea");
		addEEnumLiteral(lineaEEnum, Linea.CONTINUA);
		addEEnumLiteral(lineaEEnum, Linea.DISCONTINUA);

		initEEnum(formaExtremoOrigenEEnum, FormaExtremoOrigen.class, "FormaExtremoOrigen");
		addEEnumLiteral(formaExtremoOrigenEEnum, FormaExtremoOrigen.NINGUNA);
		addEEnumLiteral(formaExtremoOrigenEEnum, FormaExtremoOrigen.FLECHA_ABIERTA);
		addEEnumLiteral(formaExtremoOrigenEEnum, FormaExtremoOrigen.FLECHA_CERRADA);

		initEEnum(formaExtremoDestinoEEnum, FormaExtremoDestino.class, "FormaExtremoDestino");
		addEEnumLiteral(formaExtremoDestinoEEnum, FormaExtremoDestino.NINGUNA);
		addEEnumLiteral(formaExtremoDestinoEEnum, FormaExtremoDestino.ROMBO_SIN_RELLENO);
		addEEnumLiteral(formaExtremoDestinoEEnum, FormaExtremoDestino.ROMBO_RELLENO);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf.diagram
		createGmfAnnotations();
		// gmf.node
		createGmf_1Annotations();
		// gmf.compartment
		createGmf_2Annotations();
		// gmf.link
		createGmf_3Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf.diagram";
		addAnnotation
		  (umlDiagramEClass,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.node";
		addAnnotation
		  (nodoUnoEClass,
		   source,
		   new String[] {
			   "label", "nombre",
			   "figure", "rectangle"
		   });
		addAnnotation
		  (nodoDosEClass,
		   source,
		   new String[] {
			   "label", "nombre"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.compartment";
		addAnnotation
		  (getNodoUno_NodosDos(),
		   source,
		   new String[] {
			   "layout", "list",
			   "collapsible", "true"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.link";
		addAnnotation
		  (enlaceEClass,
		   source,
		   new String[] {
			   "source", "origen",
			   "target", "destino",
			   "style", "solid",
			   "target.decoration", "arrow",
			   "label", "texto"
		   });
	}

} //MofPackageImpl
