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
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO__COLOR = 1;

	/**
	 * The number of structural features of the '<em>Nodo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mof.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.impl.PackageImpl
	 * @see mof.impl.MofPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NOMBRE = NODO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__COLOR = NODO__COLOR;

	/**
	 * The feature id for the '<em><b>Nodos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NODOS = NODO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = NODO_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mof.impl.NodoUnoImpl <em>Nodo Uno</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.impl.NodoUnoImpl
	 * @see mof.impl.MofPackageImpl#getNodoUno()
	 * @generated
	 */
	int NODO_UNO = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO_UNO__NOMBRE = NODO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO_UNO__COLOR = NODO__COLOR;

	/**
	 * The feature id for the '<em><b>Forma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO_UNO__FORMA = NODO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color Borde</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO_UNO__COLOR_BORDE = NODO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Nodo Uno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO_UNO_FEATURE_COUNT = NODO_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mof.impl.NodoDosImpl <em>Nodo Dos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.impl.NodoDosImpl
	 * @see mof.impl.MofPackageImpl#getNodoDos()
	 * @generated
	 */
	int NODO_DOS = 4;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO_DOS__NOMBRE = NODO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO_DOS__COLOR = NODO__COLOR;

	/**
	 * The feature id for the '<em><b>Atributometodo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO_DOS__ATRIBUTOMETODO = NODO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nodo Dos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO_DOS_FEATURE_COUNT = NODO_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mof.impl.AtributosMetodosImpl <em>Atributos Metodos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.impl.AtributosMetodosImpl
	 * @see mof.impl.MofPackageImpl#getAtributosMetodos()
	 * @generated
	 */
	int ATRIBUTOS_METODOS = 5;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTOS_METODOS__NOMBRE = NODO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTOS_METODOS__COLOR = NODO__COLOR;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTOS_METODOS__TIPO = NODO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visibilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTOS_METODOS__VISIBILIDAD = NODO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Atributos Metodos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTOS_METODOS_FEATURE_COUNT = NODO_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mof.impl.EnlaceImpl <em>Enlace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.impl.EnlaceImpl
	 * @see mof.impl.MofPackageImpl#getEnlace()
	 * @generated
	 */
	int ENLACE = 6;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE__TEXTO = 0;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE__ORIGEN = 1;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE__DESTINO = 2;

	/**
	 * The feature id for the '<em><b>Linea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE__LINEA = 3;

	/**
	 * The feature id for the '<em><b>Texto Extremo Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE__TEXTO_EXTREMO_ORIGEN = 4;

	/**
	 * The feature id for the '<em><b>Texto Extremo Destino</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE__TEXTO_EXTREMO_DESTINO = 5;

	/**
	 * The feature id for the '<em><b>Forma Extremo Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE__FORMA_EXTREMO_ORIGEN = 6;

	/**
	 * The feature id for the '<em><b>Forma Extremo Destino</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE__FORMA_EXTREMO_DESTINO = 7;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE__COLOR = 8;

	/**
	 * The number of structural features of the '<em>Enlace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link mof.Color <em>Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.Color
	 * @see mof.impl.MofPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 7;

	/**
	 * The meta object id for the '{@link mof.Forma <em>Forma</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.Forma
	 * @see mof.impl.MofPackageImpl#getForma()
	 * @generated
	 */
	int FORMA = 8;

	/**
	 * The meta object id for the '{@link mof.Linea <em>Linea</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.Linea
	 * @see mof.impl.MofPackageImpl#getLinea()
	 * @generated
	 */
	int LINEA = 9;

	/**
	 * The meta object id for the '{@link mof.Tipo <em>Tipo</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.Tipo
	 * @see mof.impl.MofPackageImpl#getTipo()
	 * @generated
	 */
	int TIPO = 10;

	/**
	 * The meta object id for the '{@link mof.Visibilidad <em>Visibilidad</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.Visibilidad
	 * @see mof.impl.MofPackageImpl#getVisibilidad()
	 * @generated
	 */
	int VISIBILIDAD = 11;

	/**
	 * The meta object id for the '{@link mof.FormaExtremoOrigen <em>Forma Extremo Origen</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.FormaExtremoOrigen
	 * @see mof.impl.MofPackageImpl#getFormaExtremoOrigen()
	 * @generated
	 */
	int FORMA_EXTREMO_ORIGEN = 12;

	/**
	 * The meta object id for the '{@link mof.FormaExtremoDestino <em>Forma Extremo Destino</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mof.FormaExtremoDestino
	 * @see mof.impl.MofPackageImpl#getFormaExtremoDestino()
	 * @generated
	 */
	int FORMA_EXTREMO_DESTINO = 13;


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
	 * Returns the meta object for class '{@link mof.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see mof.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link mof.Package#getNodos <em>Nodos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodos</em>'.
	 * @see mof.Package#getNodos()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Nodos();

	/**
	 * Returns the meta object for class '{@link mof.NodoUno <em>Nodo Uno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nodo Uno</em>'.
	 * @see mof.NodoUno
	 * @generated
	 */
	EClass getNodoUno();

	/**
	 * Returns the meta object for the attribute '{@link mof.NodoUno#getForma <em>Forma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forma</em>'.
	 * @see mof.NodoUno#getForma()
	 * @see #getNodoUno()
	 * @generated
	 */
	EAttribute getNodoUno_Forma();

	/**
	 * Returns the meta object for the attribute '{@link mof.NodoUno#getColorBorde <em>Color Borde</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Borde</em>'.
	 * @see mof.NodoUno#getColorBorde()
	 * @see #getNodoUno()
	 * @generated
	 */
	EAttribute getNodoUno_ColorBorde();

	/**
	 * Returns the meta object for class '{@link mof.NodoDos <em>Nodo Dos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nodo Dos</em>'.
	 * @see mof.NodoDos
	 * @generated
	 */
	EClass getNodoDos();

	/**
	 * Returns the meta object for the containment reference list '{@link mof.NodoDos#getAtributometodo <em>Atributometodo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributometodo</em>'.
	 * @see mof.NodoDos#getAtributometodo()
	 * @see #getNodoDos()
	 * @generated
	 */
	EReference getNodoDos_Atributometodo();

	/**
	 * Returns the meta object for class '{@link mof.AtributosMetodos <em>Atributos Metodos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributos Metodos</em>'.
	 * @see mof.AtributosMetodos
	 * @generated
	 */
	EClass getAtributosMetodos();

	/**
	 * Returns the meta object for the attribute '{@link mof.AtributosMetodos#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see mof.AtributosMetodos#getTipo()
	 * @see #getAtributosMetodos()
	 * @generated
	 */
	EAttribute getAtributosMetodos_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link mof.AtributosMetodos#getVisibilidad <em>Visibilidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibilidad</em>'.
	 * @see mof.AtributosMetodos#getVisibilidad()
	 * @see #getAtributosMetodos()
	 * @generated
	 */
	EAttribute getAtributosMetodos_Visibilidad();

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
	 * Returns the meta object for the attribute '{@link mof.Enlace#getTexto <em>Texto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texto</em>'.
	 * @see mof.Enlace#getTexto()
	 * @see #getEnlace()
	 * @generated
	 */
	EAttribute getEnlace_Texto();

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
	 * Returns the meta object for the attribute '{@link mof.Enlace#getLinea <em>Linea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Linea</em>'.
	 * @see mof.Enlace#getLinea()
	 * @see #getEnlace()
	 * @generated
	 */
	EAttribute getEnlace_Linea();

	/**
	 * Returns the meta object for the attribute '{@link mof.Enlace#getTextoExtremoOrigen <em>Texto Extremo Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texto Extremo Origen</em>'.
	 * @see mof.Enlace#getTextoExtremoOrigen()
	 * @see #getEnlace()
	 * @generated
	 */
	EAttribute getEnlace_TextoExtremoOrigen();

	/**
	 * Returns the meta object for the attribute '{@link mof.Enlace#getTextoExtremoDestino <em>Texto Extremo Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texto Extremo Destino</em>'.
	 * @see mof.Enlace#getTextoExtremoDestino()
	 * @see #getEnlace()
	 * @generated
	 */
	EAttribute getEnlace_TextoExtremoDestino();

	/**
	 * Returns the meta object for the attribute '{@link mof.Enlace#getFormaExtremoOrigen <em>Forma Extremo Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forma Extremo Origen</em>'.
	 * @see mof.Enlace#getFormaExtremoOrigen()
	 * @see #getEnlace()
	 * @generated
	 */
	EAttribute getEnlace_FormaExtremoOrigen();

	/**
	 * Returns the meta object for the attribute '{@link mof.Enlace#getFormaExtremoDestino <em>Forma Extremo Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forma Extremo Destino</em>'.
	 * @see mof.Enlace#getFormaExtremoDestino()
	 * @see #getEnlace()
	 * @generated
	 */
	EAttribute getEnlace_FormaExtremoDestino();

	/**
	 * Returns the meta object for the attribute '{@link mof.Enlace#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see mof.Enlace#getColor()
	 * @see #getEnlace()
	 * @generated
	 */
	EAttribute getEnlace_Color();

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
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODO__COLOR = eINSTANCE.getNodo_Color();

		/**
		 * The meta object literal for the '{@link mof.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.impl.PackageImpl
		 * @see mof.impl.MofPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Nodos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__NODOS = eINSTANCE.getPackage_Nodos();

		/**
		 * The meta object literal for the '{@link mof.impl.NodoUnoImpl <em>Nodo Uno</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.impl.NodoUnoImpl
		 * @see mof.impl.MofPackageImpl#getNodoUno()
		 * @generated
		 */
		EClass NODO_UNO = eINSTANCE.getNodoUno();

		/**
		 * The meta object literal for the '<em><b>Forma</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODO_UNO__FORMA = eINSTANCE.getNodoUno_Forma();

		/**
		 * The meta object literal for the '<em><b>Color Borde</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODO_UNO__COLOR_BORDE = eINSTANCE.getNodoUno_ColorBorde();

		/**
		 * The meta object literal for the '{@link mof.impl.NodoDosImpl <em>Nodo Dos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.impl.NodoDosImpl
		 * @see mof.impl.MofPackageImpl#getNodoDos()
		 * @generated
		 */
		EClass NODO_DOS = eINSTANCE.getNodoDos();

		/**
		 * The meta object literal for the '<em><b>Atributometodo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODO_DOS__ATRIBUTOMETODO = eINSTANCE.getNodoDos_Atributometodo();

		/**
		 * The meta object literal for the '{@link mof.impl.AtributosMetodosImpl <em>Atributos Metodos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mof.impl.AtributosMetodosImpl
		 * @see mof.impl.MofPackageImpl#getAtributosMetodos()
		 * @generated
		 */
		EClass ATRIBUTOS_METODOS = eINSTANCE.getAtributosMetodos();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTOS_METODOS__TIPO = eINSTANCE.getAtributosMetodos_Tipo();

		/**
		 * The meta object literal for the '<em><b>Visibilidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTOS_METODOS__VISIBILIDAD = eINSTANCE.getAtributosMetodos_Visibilidad();

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
		 * The meta object literal for the '<em><b>Texto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENLACE__TEXTO = eINSTANCE.getEnlace_Texto();

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
		 * The meta object literal for the '<em><b>Linea</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENLACE__LINEA = eINSTANCE.getEnlace_Linea();

		/**
		 * The meta object literal for the '<em><b>Texto Extremo Origen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENLACE__TEXTO_EXTREMO_ORIGEN = eINSTANCE.getEnlace_TextoExtremoOrigen();

		/**
		 * The meta object literal for the '<em><b>Texto Extremo Destino</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENLACE__TEXTO_EXTREMO_DESTINO = eINSTANCE.getEnlace_TextoExtremoDestino();

		/**
		 * The meta object literal for the '<em><b>Forma Extremo Origen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENLACE__FORMA_EXTREMO_ORIGEN = eINSTANCE.getEnlace_FormaExtremoOrigen();

		/**
		 * The meta object literal for the '<em><b>Forma Extremo Destino</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENLACE__FORMA_EXTREMO_DESTINO = eINSTANCE.getEnlace_FormaExtremoDestino();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENLACE__COLOR = eINSTANCE.getEnlace_Color();

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
