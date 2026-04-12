/**
 */
package mof;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mof.MofFactory
 * @model kind="package"
 * @generated
 */
public interface MofPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mof";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mof";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mof";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MofPackage eINSTANCE = mof.impl.MofPackageImpl.init();

	/**
	 * The meta object id for the '{@link mof.impl.UMLDiagramImpl <em>UML Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.impl.UMLDiagramImpl
	 * @see mof.impl.MofPackageImpl#getUMLDiagram()
	 * @generated
	 */
	int UML_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Nodos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__NODOS = 0;

	/**
	 * The feature id for the '<em><b>Enlaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM__ENLACES = 1;

	/**
	 * The number of structural features of the '<em>UML Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mof.impl.NodoImpl <em>Nodo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.impl.NodoImpl
	 * @see mof.impl.MofPackageImpl#getNodo()
	 * @generated
	 */
	int NODO = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Forma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO__FORMA = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO__COLOR = 2;

	/**
	 * The feature id for the '<em><b>Color Borde</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO__COLOR_BORDE = 3;

	/**
	 * The number of structural features of the '<em>Nodo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link mof.impl.EnlaceImpl <em>Enlace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.impl.EnlaceImpl
	 * @see mof.impl.MofPackageImpl#getEnlace()
	 * @generated
	 */
	int ENLACE = 2;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE__ORIGEN = 0;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE__DESTINO = 1;

	/**
	 * The number of structural features of the '<em>Enlace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mof.Color <em>Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.Color
	 * @see mof.impl.MofPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 3;

	/**
	 * The meta object id for the '{@link mof.Forma <em>Forma</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.Forma
	 * @see mof.impl.MofPackageImpl#getForma()
	 * @generated
	 */
	int FORMA = 4;

	/**
	 * The meta object id for the '{@link mof.Linea <em>Linea</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.Linea
	 * @see mof.impl.MofPackageImpl#getLinea()
	 * @generated
	 */
	int LINEA = 5;

	/**
	 * The meta object id for the '{@link mof.Tipo <em>Tipo</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.Tipo
	 * @see mof.impl.MofPackageImpl#getTipo()
	 * @generated
	 */
	int TIPO = 6;

	/**
	 * The meta object id for the '{@link mof.Visibilidad <em>Visibilidad</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.Visibilidad
	 * @see mof.impl.MofPackageImpl#getVisibilidad()
	 * @generated
	 */
	int VISIBILIDAD = 7;

	/**
	 * The meta object id for the '{@link mof.FormaExtremoOrigen <em>Forma Extremo Origen</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.FormaExtremoOrigen
	 * @see mof.impl.MofPackageImpl#getFormaExtremoOrigen()
	 * @generated
	 */
	int FORMA_EXTREMO_ORIGEN = 8;

	/**
	 * The meta object id for the '{@link mof.FormaExtremoDestino <em>Forma Extremo Destino</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.FormaExtremoDestino
	 * @see mof.impl.MofPackageImpl#getFormaExtremoDestino()
	 * @generated
	 */
	int FORMA_EXTREMO_DESTINO = 9;


	/**
	 * Returns the meta object for class '{@link mof.UMLDiagram <em>UML Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Diagram</em>'.
	 * @see mof.UMLDiagram
	 * @generated
	 */
	EClass getUMLDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link mof.UMLDiagram#getNodos <em>Nodos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodos</em>'.
	 * @see mof.UMLDiagram#getNodos()
	 * @see #getUMLDiagram()
	 * @generated
	 */
	EReference getUMLDiagram_Nodos();

	/**
	 * Returns the meta object for the containment reference list '{@link mof.UMLDiagram#getEnlaces <em>Enlaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enlaces</em>'.
	 * @see mof.UMLDiagram#getEnlaces()
	 * @see #getUMLDiagram()
	 * @generated
	 */
	EReference getUMLDiagram_Enlaces();

	/**
	 * Returns the meta object for class '{@link mof.Nodo <em>Nodo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nodo</em>'.
	 * @see mof.Nodo
	 * @generated
	 */
	EClass getNodo();

	/**
	 * Returns the meta object for the attribute '{@link mof.Nodo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see mof.Nodo#getNombre()
	 * @see #getNodo()
	 * @generated
	 */
	EAttribute getNodo_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link mof.Nodo#getForma <em>Forma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forma</em>'.
	 * @see mof.Nodo#getForma()
	 * @see #getNodo()
	 * @generated
	 */
	EAttribute getNodo_Forma();

	/**
	 * Returns the meta object for the attribute '{@link mof.Nodo#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see mof.Nodo#getColor()
	 * @see #getNodo()
	 * @generated
	 */
	EAttribute getNodo_Color();

	/**
	 * Returns the meta object for the attribute '{@link mof.Nodo#getColorBorde <em>Color Borde</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Borde</em>'.
	 * @see mof.Nodo#getColorBorde()
	 * @see #getNodo()
	 * @generated
	 */
	EAttribute getNodo_ColorBorde();

	/**
	 * Returns the meta object for class '{@link mof.Enlace <em>Enlace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enlace</em>'.
	 * @see mof.Enlace
	 * @generated
	 */
	EClass getEnlace();

	/**
	 * Returns the meta object for the reference '{@link mof.Enlace#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origen</em>'.
	 * @see mof.Enlace#getOrigen()
	 * @see #getEnlace()
	 * @generated
	 */
	EReference getEnlace_Origen();

	/**
	 * Returns the meta object for the reference '{@link mof.Enlace#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destino</em>'.
	 * @see mof.Enlace#getDestino()
	 * @see #getEnlace()
	 * @generated
	 */
	EReference getEnlace_Destino();

	/**
	 * Returns the meta object for enum '{@link mof.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color</em>'.
	 * @see mof.Color
	 * @generated
	 */
	EEnum getColor();

	/**
	 * Returns the meta object for enum '{@link mof.Forma <em>Forma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Forma</em>'.
	 * @see mof.Forma
	 * @generated
	 */
	EEnum getForma();

	/**
	 * Returns the meta object for enum '{@link mof.Linea <em>Linea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Linea</em>'.
	 * @see mof.Linea
	 * @generated
	 */
	EEnum getLinea();

	/**
	 * Returns the meta object for enum '{@link mof.Tipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo</em>'.
	 * @see mof.Tipo
	 * @generated
	 */
	EEnum getTipo();

	/**
	 * Returns the meta object for enum '{@link mof.Visibilidad <em>Visibilidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibilidad</em>'.
	 * @see mof.Visibilidad
	 * @generated
	 */
	EEnum getVisibilidad();

	/**
	 * Returns the meta object for enum '{@link mof.FormaExtremoOrigen <em>Forma Extremo Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Forma Extremo Origen</em>'.
	 * @see mof.FormaExtremoOrigen
	 * @generated
	 */
	EEnum getFormaExtremoOrigen();

	/**
	 * Returns the meta object for enum '{@link mof.FormaExtremoDestino <em>Forma Extremo Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Forma Extremo Destino</em>'.
	 * @see mof.FormaExtremoDestino
	 * @generated
	 */
	EEnum getFormaExtremoDestino();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MofFactory getMofFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mof.impl.UMLDiagramImpl <em>UML Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.impl.UMLDiagramImpl
		 * @see mof.impl.MofPackageImpl#getUMLDiagram()
		 * @generated
		 */
		EClass UML_DIAGRAM = eINSTANCE.getUMLDiagram();

		/**
		 * The meta object literal for the '<em><b>Nodos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_DIAGRAM__NODOS = eINSTANCE.getUMLDiagram_Nodos();

		/**
		 * The meta object literal for the '<em><b>Enlaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_DIAGRAM__ENLACES = eINSTANCE.getUMLDiagram_Enlaces();

		/**
		 * The meta object literal for the '{@link mof.impl.NodoImpl <em>Nodo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.impl.NodoImpl
		 * @see mof.impl.MofPackageImpl#getNodo()
		 * @generated
		 */
		EClass NODO = eINSTANCE.getNodo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODO__NOMBRE = eINSTANCE.getNodo_Nombre();

		/**
		 * The meta object literal for the '<em><b>Forma</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODO__FORMA = eINSTANCE.getNodo_Forma();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODO__COLOR = eINSTANCE.getNodo_Color();

		/**
		 * The meta object literal for the '<em><b>Color Borde</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODO__COLOR_BORDE = eINSTANCE.getNodo_ColorBorde();

		/**
		 * The meta object literal for the '{@link mof.impl.EnlaceImpl <em>Enlace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.impl.EnlaceImpl
		 * @see mof.impl.MofPackageImpl#getEnlace()
		 * @generated
		 */
		EClass ENLACE = eINSTANCE.getEnlace();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENLACE__ORIGEN = eINSTANCE.getEnlace_Origen();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENLACE__DESTINO = eINSTANCE.getEnlace_Destino();

		/**
		 * The meta object literal for the '{@link mof.Color <em>Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.Color
		 * @see mof.impl.MofPackageImpl#getColor()
		 * @generated
		 */
		EEnum COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '{@link mof.Forma <em>Forma</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.Forma
		 * @see mof.impl.MofPackageImpl#getForma()
		 * @generated
		 */
		EEnum FORMA = eINSTANCE.getForma();

		/**
		 * The meta object literal for the '{@link mof.Linea <em>Linea</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.Linea
		 * @see mof.impl.MofPackageImpl#getLinea()
		 * @generated
		 */
		EEnum LINEA = eINSTANCE.getLinea();

		/**
		 * The meta object literal for the '{@link mof.Tipo <em>Tipo</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.Tipo
		 * @see mof.impl.MofPackageImpl#getTipo()
		 * @generated
		 */
		EEnum TIPO = eINSTANCE.getTipo();

		/**
		 * The meta object literal for the '{@link mof.Visibilidad <em>Visibilidad</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.Visibilidad
		 * @see mof.impl.MofPackageImpl#getVisibilidad()
		 * @generated
		 */
		EEnum VISIBILIDAD = eINSTANCE.getVisibilidad();

		/**
		 * The meta object literal for the '{@link mof.FormaExtremoOrigen <em>Forma Extremo Origen</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.FormaExtremoOrigen
		 * @see mof.impl.MofPackageImpl#getFormaExtremoOrigen()
		 * @generated
		 */
		EEnum FORMA_EXTREMO_ORIGEN = eINSTANCE.getFormaExtremoOrigen();

		/**
		 * The meta object literal for the '{@link mof.FormaExtremoDestino <em>Forma Extremo Destino</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.FormaExtremoDestino
		 * @see mof.impl.MofPackageImpl#getFormaExtremoDestino()
		 * @generated
		 */
		EEnum FORMA_EXTREMO_DESTINO = eINSTANCE.getFormaExtremoDestino();

	}

} //MofPackage
