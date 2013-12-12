/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see com.crubier.lil.lil.LilFactory
 * @model kind="package"
 * @generated
 */
public interface LilPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "lil";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.crubier.com/lil/Lil";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "lil";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LilPackage eINSTANCE = com.crubier.lil.lil.impl.LilPackageImpl.init();

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.LilModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.LilModelImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getLilModel()
   * @generated
   */
  int LIL_MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIL_MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIL_MODEL__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Actor Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIL_MODEL__ACTOR_TYPE = 2;

  /**
   * The feature id for the '<em><b>Data Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIL_MODEL__DATA_TYPE = 3;

  /**
   * The feature id for the '<em><b>Interactor Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIL_MODEL__INTERACTOR_TYPE = 4;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIL_MODEL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ImportStatementImpl <em>Import Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ImportStatementImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getImportStatement()
   * @generated
   */
  int IMPORT_STATEMENT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_STATEMENT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ActorTypeDefinitionImpl <em>Actor Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ActorTypeDefinitionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getActorTypeDefinition()
   * @generated
   */
  int ACTOR_TYPE_DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_TYPE_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Component</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_TYPE_DEFINITION__COMPONENT = 1;

  /**
   * The number of structural features of the '<em>Actor Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_TYPE_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ActorTypeImpl <em>Actor Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ActorTypeImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getActorType()
   * @generated
   */
  int ACTOR_TYPE = 3;

  /**
   * The number of structural features of the '<em>Actor Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ActorComponentDeclarationImpl <em>Actor Component Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ActorComponentDeclarationImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getActorComponentDeclaration()
   * @generated
   */
  int ACTOR_COMPONENT_DECLARATION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_COMPONENT_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_COMPONENT_DECLARATION__TYPE = 1;

  /**
   * The number of structural features of the '<em>Actor Component Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_COMPONENT_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeDefinitionImpl <em>Data Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeDefinitionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeDefinition()
   * @generated
   */
  int DATA_TYPE_DEFINITION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_DEFINITION__NAME = 0;

  /**
   * The number of structural features of the '<em>Data Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 6;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeSymbolDefinitionSetImpl <em>Data Type Symbol Definition Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeSymbolDefinitionSetImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeSymbolDefinitionSet()
   * @generated
   */
  int DATA_TYPE_SYMBOL_DEFINITION_SET = 7;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_SYMBOL_DEFINITION_SET__ELEMENT = 0;

  /**
   * The number of structural features of the '<em>Data Type Symbol Definition Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_SYMBOL_DEFINITION_SET_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeSymbolDefinitionSetElementImpl <em>Data Type Symbol Definition Set Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeSymbolDefinitionSetElementImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeSymbolDefinitionSetElement()
   * @generated
   */
  int DATA_TYPE_SYMBOL_DEFINITION_SET_ELEMENT = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_SYMBOL_DEFINITION_SET_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Data Type Symbol Definition Set Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_SYMBOL_DEFINITION_SET_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeNumberDefinitionSetImpl <em>Data Type Number Definition Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeNumberDefinitionSetImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeNumberDefinitionSet()
   * @generated
   */
  int DATA_TYPE_NUMBER_DEFINITION_SET = 9;

  /**
   * The number of structural features of the '<em>Data Type Number Definition Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_NUMBER_DEFINITION_SET_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeTextDefinitionSetImpl <em>Data Type Text Definition Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeTextDefinitionSetImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeTextDefinitionSet()
   * @generated
   */
  int DATA_TYPE_TEXT_DEFINITION_SET = 10;

  /**
   * The number of structural features of the '<em>Data Type Text Definition Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_TEXT_DEFINITION_SET_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeTimeDefinitionSetImpl <em>Data Type Time Definition Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeTimeDefinitionSetImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeTimeDefinitionSet()
   * @generated
   */
  int DATA_TYPE_TIME_DEFINITION_SET = 11;

  /**
   * The number of structural features of the '<em>Data Type Time Definition Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_TIME_DEFINITION_SET_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeIdentifierDefinitionSetImpl <em>Data Type Identifier Definition Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeIdentifierDefinitionSetImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeIdentifierDefinitionSet()
   * @generated
   */
  int DATA_TYPE_IDENTIFIER_DEFINITION_SET = 12;

  /**
   * The number of structural features of the '<em>Data Type Identifier Definition Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_IDENTIFIER_DEFINITION_SET_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataComponentDeclarationImpl <em>Data Component Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataComponentDeclarationImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataComponentDeclaration()
   * @generated
   */
  int DATA_COMPONENT_DECLARATION = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COMPONENT_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COMPONENT_DECLARATION__TYPE = 1;

  /**
   * The number of structural features of the '<em>Data Component Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COMPONENT_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorTypeDefinitionImpl <em>Interactor Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorTypeDefinitionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorTypeDefinition()
   * @generated
   */
  int INTERACTOR_TYPE_DEFINITION = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_TYPE_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Actor</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_TYPE_DEFINITION__ACTOR = 1;

  /**
   * The feature id for the '<em><b>Data</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_TYPE_DEFINITION__DATA = 2;

  /**
   * The feature id for the '<em><b>Component</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_TYPE_DEFINITION__COMPONENT = 3;

  /**
   * The feature id for the '<em><b>Behavior</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_TYPE_DEFINITION__BEHAVIOR = 4;

  /**
   * The number of structural features of the '<em>Interactor Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_TYPE_DEFINITION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorTypeImpl <em>Interactor Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorTypeImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorType()
   * @generated
   */
  int INTERACTOR_TYPE = 15;

  /**
   * The number of structural features of the '<em>Interactor Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorEntityDeclarationImpl <em>Interactor Entity Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorEntityDeclarationImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorEntityDeclaration()
   * @generated
   */
  int INTERACTOR_ENTITY_DECLARATION = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_ENTITY_DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Interactor Entity Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_ENTITY_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorDataDeclarationImpl <em>Interactor Data Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorDataDeclarationImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorDataDeclaration()
   * @generated
   */
  int INTERACTOR_DATA_DECLARATION = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_DECLARATION__TYPE = 1;

  /**
   * The number of structural features of the '<em>Interactor Data Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorActorAliasImpl <em>Interactor Actor Alias</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorActorAliasImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorActorAlias()
   * @generated
   */
  int INTERACTOR_ACTOR_ALIAS = 18;

  /**
   * The feature id for the '<em><b>Actor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_ACTOR_ALIAS__ACTOR = 0;

  /**
   * The feature id for the '<em><b>Alias</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_ACTOR_ALIAS__ALIAS = 1;

  /**
   * The number of structural features of the '<em>Interactor Actor Alias</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_ACTOR_ALIAS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorDataAliasImpl <em>Interactor Data Alias</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorDataAliasImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorDataAlias()
   * @generated
   */
  int INTERACTOR_DATA_ALIAS = 19;

  /**
   * The feature id for the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_ALIAS__ENTITY = 0;

  /**
   * The feature id for the '<em><b>Alias</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_ALIAS__ALIAS = 1;

  /**
   * The number of structural features of the '<em>Interactor Data Alias</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_ALIAS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorEntityImpl <em>Interactor Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorEntityImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorEntity()
   * @generated
   */
  int INTERACTOR_ENTITY = 20;

  /**
   * The number of structural features of the '<em>Interactor Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_ENTITY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ExpressionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 26;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorDataReceptionImpl <em>Interactor Data Reception</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorDataReceptionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorDataReception()
   * @generated
   */
  int INTERACTOR_DATA_RECEPTION = 21;

  /**
   * The number of structural features of the '<em>Interactor Data Reception</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_RECEPTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorDataEmissionImpl <em>Interactor Data Emission</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorDataEmissionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorDataEmission()
   * @generated
   */
  int INTERACTOR_DATA_EMISSION = 22;

  /**
   * The feature id for the '<em><b>Data</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_EMISSION__DATA = 0;

  /**
   * The number of structural features of the '<em>Interactor Data Emission</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_EMISSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorBehaviorDeclarationImpl <em>Interactor Behavior Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorBehaviorDeclarationImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorBehaviorDeclaration()
   * @generated
   */
  int INTERACTOR_BEHAVIOR_DECLARATION = 23;

  /**
   * The feature id for the '<em><b>Cause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_DECLARATION__CAUSE = 0;

  /**
   * The feature id for the '<em><b>Effect</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_DECLARATION__EFFECT = 1;

  /**
   * The number of structural features of the '<em>Interactor Behavior Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorBehaviorCauseImpl <em>Interactor Behavior Cause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorBehaviorCauseImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorBehaviorCause()
   * @generated
   */
  int INTERACTOR_BEHAVIOR_CAUSE = 24;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_CAUSE__GUARD = 0;

  /**
   * The number of structural features of the '<em>Interactor Behavior Cause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_CAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorBehaviorEffectImpl <em>Interactor Behavior Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorBehaviorEffectImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorBehaviorEffect()
   * @generated
   */
  int INTERACTOR_BEHAVIOR_EFFECT = 25;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_EFFECT__TARGET = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_EFFECT__VALUE = 1;

  /**
   * The number of structural features of the '<em>Interactor Behavior Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_EFFECT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ExpressionLiteralCollectionImpl <em>Expression Literal Collection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ExpressionLiteralCollectionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getExpressionLiteralCollection()
   * @generated
   */
  int EXPRESSION_LITERAL_COLLECTION = 27;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LITERAL_COLLECTION__ELEMENTS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expression Literal Collection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LITERAL_COLLECTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ExpressionLiteralSetImpl <em>Expression Literal Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ExpressionLiteralSetImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getExpressionLiteralSet()
   * @generated
   */
  int EXPRESSION_LITERAL_SET = 28;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LITERAL_SET__ELEMENTS = EXPRESSION_LITERAL_COLLECTION__ELEMENTS;

  /**
   * The number of structural features of the '<em>Expression Literal Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LITERAL_SET_FEATURE_COUNT = EXPRESSION_LITERAL_COLLECTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ExpressionLiteralListImpl <em>Expression Literal List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ExpressionLiteralListImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getExpressionLiteralList()
   * @generated
   */
  int EXPRESSION_LITERAL_LIST = 29;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LITERAL_LIST__ELEMENTS = EXPRESSION_LITERAL_COLLECTION__ELEMENTS;

  /**
   * The number of structural features of the '<em>Expression Literal List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LITERAL_LIST_FEATURE_COUNT = EXPRESSION_LITERAL_COLLECTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ExpressionCaseImpl <em>Expression Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ExpressionCaseImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getExpressionCase()
   * @generated
   */
  int EXPRESSION_CASE = 30;

  /**
   * The feature id for the '<em><b>Case</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_CASE__CASE = 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_CASE__THEN = 1;

  /**
   * The number of structural features of the '<em>Expression Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_CASE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ActorTypeInputImpl <em>Actor Type Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ActorTypeInputImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getActorTypeInput()
   * @generated
   */
  int ACTOR_TYPE_INPUT = 31;

  /**
   * The number of structural features of the '<em>Actor Type Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_TYPE_INPUT_FEATURE_COUNT = ACTOR_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ActorTypeOutputImpl <em>Actor Type Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ActorTypeOutputImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getActorTypeOutput()
   * @generated
   */
  int ACTOR_TYPE_OUTPUT = 32;

  /**
   * The number of structural features of the '<em>Actor Type Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_TYPE_OUTPUT_FEATURE_COUNT = ACTOR_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ActorTypeCustomImpl <em>Actor Type Custom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ActorTypeCustomImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getActorTypeCustom()
   * @generated
   */
  int ACTOR_TYPE_CUSTOM = 33;

  /**
   * The feature id for the '<em><b>Definition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_TYPE_CUSTOM__DEFINITION = ACTOR_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Actor Type Custom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_TYPE_CUSTOM_FEATURE_COUNT = ACTOR_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeDefinitionCompoundImpl <em>Data Type Definition Compound</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeDefinitionCompoundImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeDefinitionCompound()
   * @generated
   */
  int DATA_TYPE_DEFINITION_COMPOUND = 34;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_DEFINITION_COMPOUND__NAME = DATA_TYPE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Component</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_DEFINITION_COMPOUND__COMPONENT = DATA_TYPE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Type Definition Compound</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_DEFINITION_COMPOUND_FEATURE_COUNT = DATA_TYPE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeDefinitionAliasImpl <em>Data Type Definition Alias</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeDefinitionAliasImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeDefinitionAlias()
   * @generated
   */
  int DATA_TYPE_DEFINITION_ALIAS = 35;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_DEFINITION_ALIAS__NAME = DATA_TYPE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Alias</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_DEFINITION_ALIAS__ALIAS = DATA_TYPE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Type Definition Alias</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_DEFINITION_ALIAS_FEATURE_COUNT = DATA_TYPE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeVoidImpl <em>Data Type Void</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeVoidImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeVoid()
   * @generated
   */
  int DATA_TYPE_VOID = 36;

  /**
   * The number of structural features of the '<em>Data Type Void</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_VOID_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeSymbolImpl <em>Data Type Symbol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeSymbolImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeSymbol()
   * @generated
   */
  int DATA_TYPE_SYMBOL = 37;

  /**
   * The feature id for the '<em><b>Definition Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_SYMBOL__DEFINITION_SET = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Type Symbol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_SYMBOL_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeNumberImpl <em>Data Type Number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeNumberImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeNumber()
   * @generated
   */
  int DATA_TYPE_NUMBER = 38;

  /**
   * The feature id for the '<em><b>Definition Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_NUMBER__DEFINITION_SET = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Type Number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_NUMBER_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeTextImpl <em>Data Type Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeTextImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeText()
   * @generated
   */
  int DATA_TYPE_TEXT = 39;

  /**
   * The feature id for the '<em><b>Definition Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_TEXT__DEFINITION_SET = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Type Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_TEXT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeTimeImpl <em>Data Type Time</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeTimeImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeTime()
   * @generated
   */
  int DATA_TYPE_TIME = 40;

  /**
   * The feature id for the '<em><b>Definition Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_TIME__DEFINITION_SET = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Type Time</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_TIME_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeIdentifierImpl <em>Data Type Identifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeIdentifierImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeIdentifier()
   * @generated
   */
  int DATA_TYPE_IDENTIFIER = 41;

  /**
   * The feature id for the '<em><b>Definition Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_IDENTIFIER__DEFINITION_SET = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Type Identifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_IDENTIFIER_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeCustomImpl <em>Data Type Custom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeCustomImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeCustom()
   * @generated
   */
  int DATA_TYPE_CUSTOM = 42;

  /**
   * The feature id for the '<em><b>Definition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_CUSTOM__DEFINITION = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Type Custom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_CUSTOM_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeCollectionImpl <em>Data Type Collection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeCollectionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeCollection()
   * @generated
   */
  int DATA_TYPE_COLLECTION = 43;

  /**
   * The feature id for the '<em><b>Element Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_COLLECTION__ELEMENT_TYPE = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Type Collection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_COLLECTION_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeSetImpl <em>Data Type Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeSetImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeSet()
   * @generated
   */
  int DATA_TYPE_SET = 44;

  /**
   * The feature id for the '<em><b>Element Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_SET__ELEMENT_TYPE = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Type Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_SET_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeListImpl <em>Data Type List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeListImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeList()
   * @generated
   */
  int DATA_TYPE_LIST = 45;

  /**
   * The feature id for the '<em><b>Element Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_LIST__ELEMENT_TYPE = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Type List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_LIST_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeQueueImpl <em>Data Type Queue</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeQueueImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeQueue()
   * @generated
   */
  int DATA_TYPE_QUEUE = 46;

  /**
   * The feature id for the '<em><b>Element Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_QUEUE__ELEMENT_TYPE = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Type Queue</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_QUEUE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeNumberDefinitionSetSetImpl <em>Data Type Number Definition Set Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeNumberDefinitionSetSetImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeNumberDefinitionSetSet()
   * @generated
   */
  int DATA_TYPE_NUMBER_DEFINITION_SET_SET = 47;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_NUMBER_DEFINITION_SET_SET__ELEMENT = DATA_TYPE_NUMBER_DEFINITION_SET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Type Number Definition Set Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_NUMBER_DEFINITION_SET_SET_FEATURE_COUNT = DATA_TYPE_NUMBER_DEFINITION_SET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeNumberDefinitionSetIntervalImpl <em>Data Type Number Definition Set Interval</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeNumberDefinitionSetIntervalImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeNumberDefinitionSetInterval()
   * @generated
   */
  int DATA_TYPE_NUMBER_DEFINITION_SET_INTERVAL = 48;

  /**
   * The feature id for the '<em><b>Inf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_NUMBER_DEFINITION_SET_INTERVAL__INF = DATA_TYPE_NUMBER_DEFINITION_SET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sup</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_NUMBER_DEFINITION_SET_INTERVAL__SUP = DATA_TYPE_NUMBER_DEFINITION_SET_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data Type Number Definition Set Interval</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_NUMBER_DEFINITION_SET_INTERVAL_FEATURE_COUNT = DATA_TYPE_NUMBER_DEFINITION_SET_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeTextDefinitionSetSetImpl <em>Data Type Text Definition Set Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeTextDefinitionSetSetImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeTextDefinitionSetSet()
   * @generated
   */
  int DATA_TYPE_TEXT_DEFINITION_SET_SET = 49;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_TEXT_DEFINITION_SET_SET__ELEMENT = DATA_TYPE_TEXT_DEFINITION_SET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Type Text Definition Set Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_TEXT_DEFINITION_SET_SET_FEATURE_COUNT = DATA_TYPE_TEXT_DEFINITION_SET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeTimeDefinitionSetSetImpl <em>Data Type Time Definition Set Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeTimeDefinitionSetSetImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeTimeDefinitionSetSet()
   * @generated
   */
  int DATA_TYPE_TIME_DEFINITION_SET_SET = 50;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_TIME_DEFINITION_SET_SET__ELEMENT = DATA_TYPE_TIME_DEFINITION_SET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Type Time Definition Set Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_TIME_DEFINITION_SET_SET_FEATURE_COUNT = DATA_TYPE_TIME_DEFINITION_SET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeTimeDefinitionSetIntervalImpl <em>Data Type Time Definition Set Interval</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeTimeDefinitionSetIntervalImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeTimeDefinitionSetInterval()
   * @generated
   */
  int DATA_TYPE_TIME_DEFINITION_SET_INTERVAL = 51;

  /**
   * The feature id for the '<em><b>Inf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_TIME_DEFINITION_SET_INTERVAL__INF = DATA_TYPE_TIME_DEFINITION_SET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sup</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_TIME_DEFINITION_SET_INTERVAL__SUP = DATA_TYPE_TIME_DEFINITION_SET_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data Type Time Definition Set Interval</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_TIME_DEFINITION_SET_INTERVAL_FEATURE_COUNT = DATA_TYPE_TIME_DEFINITION_SET_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeIdentifierDefinitionSetSetImpl <em>Data Type Identifier Definition Set Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeIdentifierDefinitionSetSetImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeIdentifierDefinitionSetSet()
   * @generated
   */
  int DATA_TYPE_IDENTIFIER_DEFINITION_SET_SET = 52;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_IDENTIFIER_DEFINITION_SET_SET__ELEMENT = DATA_TYPE_IDENTIFIER_DEFINITION_SET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Type Identifier Definition Set Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_IDENTIFIER_DEFINITION_SET_SET_FEATURE_COUNT = DATA_TYPE_IDENTIFIER_DEFINITION_SET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorTypeCustomImpl <em>Interactor Type Custom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorTypeCustomImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorTypeCustom()
   * @generated
   */
  int INTERACTOR_TYPE_CUSTOM = 53;

  /**
   * The feature id for the '<em><b>Definition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_TYPE_CUSTOM__DEFINITION = INTERACTOR_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Interactor Type Custom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_TYPE_CUSTOM_FEATURE_COUNT = INTERACTOR_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorActorDeclarationImpl <em>Interactor Actor Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorActorDeclarationImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorActorDeclaration()
   * @generated
   */
  int INTERACTOR_ACTOR_DECLARATION = 54;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_ACTOR_DECLARATION__NAME = INTERACTOR_ENTITY_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_ACTOR_DECLARATION__TYPE = INTERACTOR_ENTITY_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Interactor Actor Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_ACTOR_DECLARATION_FEATURE_COUNT = INTERACTOR_ENTITY_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorComponentDeclarationImpl <em>Interactor Component Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorComponentDeclarationImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorComponentDeclaration()
   * @generated
   */
  int INTERACTOR_COMPONENT_DECLARATION = 55;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_COMPONENT_DECLARATION__NAME = INTERACTOR_ENTITY_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_COMPONENT_DECLARATION__TYPE = INTERACTOR_ENTITY_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Actors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_COMPONENT_DECLARATION__ACTORS = INTERACTOR_ENTITY_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Interactor Component Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_COMPONENT_DECLARATION_FEATURE_COUNT = INTERACTOR_ENTITY_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorDataDeclarationEventImpl <em>Interactor Data Declaration Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorDataDeclarationEventImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorDataDeclarationEvent()
   * @generated
   */
  int INTERACTOR_DATA_DECLARATION_EVENT = 56;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_DECLARATION_EVENT__NAME = INTERACTOR_DATA_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_DECLARATION_EVENT__TYPE = INTERACTOR_DATA_DECLARATION__TYPE;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_DECLARATION_EVENT__SOURCE = INTERACTOR_DATA_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Destinations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_DECLARATION_EVENT__DESTINATIONS = INTERACTOR_DATA_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Interactor Data Declaration Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_DECLARATION_EVENT_FEATURE_COUNT = INTERACTOR_DATA_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorDataDeclarationFlowImpl <em>Interactor Data Declaration Flow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorDataDeclarationFlowImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorDataDeclarationFlow()
   * @generated
   */
  int INTERACTOR_DATA_DECLARATION_FLOW = 57;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_DECLARATION_FLOW__NAME = INTERACTOR_DATA_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_DECLARATION_FLOW__TYPE = INTERACTOR_DATA_DECLARATION__TYPE;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_DECLARATION_FLOW__SOURCE = INTERACTOR_DATA_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Destinations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_DECLARATION_FLOW__DESTINATIONS = INTERACTOR_DATA_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Interactor Data Declaration Flow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_DECLARATION_FLOW_FEATURE_COUNT = INTERACTOR_DATA_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorDataDeclarationConstantImpl <em>Interactor Data Declaration Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorDataDeclarationConstantImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorDataDeclarationConstant()
   * @generated
   */
  int INTERACTOR_DATA_DECLARATION_CONSTANT = 58;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_DECLARATION_CONSTANT__NAME = INTERACTOR_DATA_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_DECLARATION_CONSTANT__TYPE = INTERACTOR_DATA_DECLARATION__TYPE;

  /**
   * The number of structural features of the '<em>Interactor Data Declaration Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_DECLARATION_CONSTANT_FEATURE_COUNT = INTERACTOR_DATA_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorEntityAnyImpl <em>Interactor Entity Any</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorEntityAnyImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorEntityAny()
   * @generated
   */
  int INTERACTOR_ENTITY_ANY = 59;

  /**
   * The number of structural features of the '<em>Interactor Entity Any</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_ENTITY_ANY_FEATURE_COUNT = INTERACTOR_ENTITY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorEntitySelfImpl <em>Interactor Entity Self</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorEntitySelfImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorEntitySelf()
   * @generated
   */
  int INTERACTOR_ENTITY_SELF = 60;

  /**
   * The number of structural features of the '<em>Interactor Entity Self</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_ENTITY_SELF_FEATURE_COUNT = INTERACTOR_ENTITY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorEntityOtherImpl <em>Interactor Entity Other</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorEntityOtherImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorEntityOther()
   * @generated
   */
  int INTERACTOR_ENTITY_OTHER = 61;

  /**
   * The number of structural features of the '<em>Interactor Entity Other</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_ENTITY_OTHER_FEATURE_COUNT = INTERACTOR_ENTITY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorEntityParentImpl <em>Interactor Entity Parent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorEntityParentImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorEntityParent()
   * @generated
   */
  int INTERACTOR_ENTITY_PARENT = 62;

  /**
   * The number of structural features of the '<em>Interactor Entity Parent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_ENTITY_PARENT_FEATURE_COUNT = INTERACTOR_ENTITY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorEntityChildImpl <em>Interactor Entity Child</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorEntityChildImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorEntityChild()
   * @generated
   */
  int INTERACTOR_ENTITY_CHILD = 63;

  /**
   * The number of structural features of the '<em>Interactor Entity Child</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_ENTITY_CHILD_FEATURE_COUNT = INTERACTOR_ENTITY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorEntityAllImpl <em>Interactor Entity All</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorEntityAllImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorEntityAll()
   * @generated
   */
  int INTERACTOR_ENTITY_ALL = 64;

  /**
   * The number of structural features of the '<em>Interactor Entity All</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_ENTITY_ALL_FEATURE_COUNT = INTERACTOR_ENTITY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorEntityActorsImpl <em>Interactor Entity Actors</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorEntityActorsImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorEntityActors()
   * @generated
   */
  int INTERACTOR_ENTITY_ACTORS = 65;

  /**
   * The number of structural features of the '<em>Interactor Entity Actors</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_ENTITY_ACTORS_FEATURE_COUNT = INTERACTOR_ENTITY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorEntitySpecificImpl <em>Interactor Entity Specific</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorEntitySpecificImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorEntitySpecific()
   * @generated
   */
  int INTERACTOR_ENTITY_SPECIFIC = 66;

  /**
   * The feature id for the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_ENTITY_SPECIFIC__ENTITY = INTERACTOR_ENTITY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Interactor Entity Specific</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_ENTITY_SPECIFIC_FEATURE_COUNT = INTERACTOR_ENTITY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorDataReceptionInternalImpl <em>Interactor Data Reception Internal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorDataReceptionInternalImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorDataReceptionInternal()
   * @generated
   */
  int INTERACTOR_DATA_RECEPTION_INTERNAL = 67;

  /**
   * The feature id for the '<em><b>Data</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_RECEPTION_INTERNAL__DATA = INTERACTOR_DATA_RECEPTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Interactor Data Reception Internal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_RECEPTION_INTERNAL_FEATURE_COUNT = INTERACTOR_DATA_RECEPTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorDataReceptionExternalImpl <em>Interactor Data Reception External</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorDataReceptionExternalImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorDataReceptionExternal()
   * @generated
   */
  int INTERACTOR_DATA_RECEPTION_EXTERNAL = 68;

  /**
   * The feature id for the '<em><b>Data</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_RECEPTION_EXTERNAL__DATA = INTERACTOR_DATA_RECEPTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_RECEPTION_EXTERNAL__SOURCE = INTERACTOR_DATA_RECEPTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Interactor Data Reception External</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_RECEPTION_EXTERNAL_FEATURE_COUNT = INTERACTOR_DATA_RECEPTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorDataReceptionInitImpl <em>Interactor Data Reception Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorDataReceptionInitImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorDataReceptionInit()
   * @generated
   */
  int INTERACTOR_DATA_RECEPTION_INIT = 69;

  /**
   * The number of structural features of the '<em>Interactor Data Reception Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_RECEPTION_INIT_FEATURE_COUNT = INTERACTOR_DATA_RECEPTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorDataEmissionInternalImpl <em>Interactor Data Emission Internal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorDataEmissionInternalImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorDataEmissionInternal()
   * @generated
   */
  int INTERACTOR_DATA_EMISSION_INTERNAL = 70;

  /**
   * The feature id for the '<em><b>Data</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_EMISSION_INTERNAL__DATA = INTERACTOR_DATA_EMISSION__DATA;

  /**
   * The number of structural features of the '<em>Interactor Data Emission Internal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_EMISSION_INTERNAL_FEATURE_COUNT = INTERACTOR_DATA_EMISSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorDataEmissionExternalImpl <em>Interactor Data Emission External</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorDataEmissionExternalImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorDataEmissionExternal()
   * @generated
   */
  int INTERACTOR_DATA_EMISSION_EXTERNAL = 71;

  /**
   * The feature id for the '<em><b>Data</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_EMISSION_EXTERNAL__DATA = INTERACTOR_DATA_EMISSION__DATA;

  /**
   * The feature id for the '<em><b>Destination</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_EMISSION_EXTERNAL__DESTINATION = INTERACTOR_DATA_EMISSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Interactor Data Emission External</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_EMISSION_EXTERNAL_FEATURE_COUNT = INTERACTOR_DATA_EMISSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorBehaviorCauseOnImpl <em>Interactor Behavior Cause On</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorBehaviorCauseOnImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorBehaviorCauseOn()
   * @generated
   */
  int INTERACTOR_BEHAVIOR_CAUSE_ON = 72;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_CAUSE_ON__GUARD = INTERACTOR_BEHAVIOR_CAUSE__GUARD;

  /**
   * The feature id for the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_CAUSE_ON__EVENT = INTERACTOR_BEHAVIOR_CAUSE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Interactor Behavior Cause On</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_CAUSE_ON_FEATURE_COUNT = INTERACTOR_BEHAVIOR_CAUSE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorBehaviorCauseWhenImpl <em>Interactor Behavior Cause When</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorBehaviorCauseWhenImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorBehaviorCauseWhen()
   * @generated
   */
  int INTERACTOR_BEHAVIOR_CAUSE_WHEN = 73;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_CAUSE_WHEN__GUARD = INTERACTOR_BEHAVIOR_CAUSE__GUARD;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_CAUSE_WHEN__CONDITION = INTERACTOR_BEHAVIOR_CAUSE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Interactor Behavior Cause When</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_CAUSE_WHEN_FEATURE_COUNT = INTERACTOR_BEHAVIOR_CAUSE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorBehaviorEffectAlwaysImpl <em>Interactor Behavior Effect Always</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorBehaviorEffectAlwaysImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorBehaviorEffectAlways()
   * @generated
   */
  int INTERACTOR_BEHAVIOR_EFFECT_ALWAYS = 74;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_EFFECT_ALWAYS__TARGET = INTERACTOR_BEHAVIOR_EFFECT__TARGET;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_EFFECT_ALWAYS__VALUE = INTERACTOR_BEHAVIOR_EFFECT__VALUE;

  /**
   * The number of structural features of the '<em>Interactor Behavior Effect Always</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_EFFECT_ALWAYS_FEATURE_COUNT = INTERACTOR_BEHAVIOR_EFFECT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorBehaviorEffectSetImpl <em>Interactor Behavior Effect Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorBehaviorEffectSetImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorBehaviorEffectSet()
   * @generated
   */
  int INTERACTOR_BEHAVIOR_EFFECT_SET = 75;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_EFFECT_SET__TARGET = INTERACTOR_BEHAVIOR_EFFECT__TARGET;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_EFFECT_SET__VALUE = INTERACTOR_BEHAVIOR_EFFECT__VALUE;

  /**
   * The number of structural features of the '<em>Interactor Behavior Effect Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_EFFECT_SET_FEATURE_COUNT = INTERACTOR_BEHAVIOR_EFFECT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorBehaviorEffectTriggerImpl <em>Interactor Behavior Effect Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorBehaviorEffectTriggerImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorBehaviorEffectTrigger()
   * @generated
   */
  int INTERACTOR_BEHAVIOR_EFFECT_TRIGGER = 76;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_EFFECT_TRIGGER__TARGET = INTERACTOR_BEHAVIOR_EFFECT__TARGET;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_EFFECT_TRIGGER__VALUE = INTERACTOR_BEHAVIOR_EFFECT__VALUE;

  /**
   * The number of structural features of the '<em>Interactor Behavior Effect Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_EFFECT_TRIGGER_FEATURE_COUNT = INTERACTOR_BEHAVIOR_EFFECT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ExpressionBinaryOperationImpl <em>Expression Binary Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ExpressionBinaryOperationImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getExpressionBinaryOperation()
   * @generated
   */
  int EXPRESSION_BINARY_OPERATION = 77;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_BINARY_OPERATION__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_BINARY_OPERATION__FEATURE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_BINARY_OPERATION__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Expression Binary Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_BINARY_OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.UnaryOperationImpl <em>Unary Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.UnaryOperationImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getUnaryOperation()
   * @generated
   */
  int UNARY_OPERATION = 78;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OPERATION__FEATURE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OPERATION__OPERAND = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unary Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ExpressionIfImpl <em>Expression If</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ExpressionIfImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getExpressionIf()
   * @generated
   */
  int EXPRESSION_IF = 79;

  /**
   * The feature id for the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_IF__IF = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_IF__THEN = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_IF__ELSE = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Expression If</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_IF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ExpressionSwitchImpl <em>Expression Switch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ExpressionSwitchImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getExpressionSwitch()
   * @generated
   */
  int EXPRESSION_SWITCH = 80;

  /**
   * The feature id for the '<em><b>Switch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_SWITCH__SWITCH = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Case</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_SWITCH__CASE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_SWITCH__DEFAULT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Expression Switch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_SWITCH_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ExpressionForEachImpl <em>Expression For Each</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ExpressionForEachImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getExpressionForEach()
   * @generated
   */
  int EXPRESSION_FOR_EACH = 81;

  /**
   * The feature id for the '<em><b>For Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FOR_EACH__FOR_EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Each Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FOR_EACH__EACH_EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression For Each</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FOR_EACH_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ExpressionFunctionCallImpl <em>Expression Function Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ExpressionFunctionCallImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getExpressionFunctionCall()
   * @generated
   */
  int EXPRESSION_FUNCTION_CALL = 82;

  /**
   * The feature id for the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FUNCTION_CALL__FUNCTION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FUNCTION_CALL__ARGUMENTS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression Function Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FUNCTION_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.LiteralBooleanImpl <em>Literal Boolean</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.LiteralBooleanImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getLiteralBoolean()
   * @generated
   */
  int LITERAL_BOOLEAN = 83;

  /**
   * The feature id for the '<em><b>Is True</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_BOOLEAN__IS_TRUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Literal Boolean</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_BOOLEAN_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.LiteralNullImpl <em>Literal Null</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.LiteralNullImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getLiteralNull()
   * @generated
   */
  int LITERAL_NULL = 84;

  /**
   * The number of structural features of the '<em>Literal Null</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_NULL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.LiteralNumberImpl <em>Literal Number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.LiteralNumberImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getLiteralNumber()
   * @generated
   */
  int LITERAL_NUMBER = 85;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_NUMBER__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Literal Number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_NUMBER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.LiteralTextImpl <em>Literal Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.LiteralTextImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getLiteralText()
   * @generated
   */
  int LITERAL_TEXT = 86;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_TEXT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Literal Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_TEXT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.LiteralEnumImpl <em>Literal Enum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.LiteralEnumImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getLiteralEnum()
   * @generated
   */
  int LITERAL_ENUM = 87;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_ENUM__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Literal Enum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_ENUM_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.LiteralTimeNowImpl <em>Literal Time Now</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.LiteralTimeNowImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getLiteralTimeNow()
   * @generated
   */
  int LITERAL_TIME_NOW = 88;

  /**
   * The number of structural features of the '<em>Literal Time Now</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_TIME_NOW_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.LiteralTimeImpl <em>Literal Time</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.LiteralTimeImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getLiteralTime()
   * @generated
   */
  int LITERAL_TIME = 89;

  /**
   * The feature id for the '<em><b>Year</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_TIME__YEAR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Month</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_TIME__MONTH = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Day</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_TIME__DAY = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Hour</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_TIME__HOUR = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Minute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_TIME__MINUTE = EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Second</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_TIME__SECOND = EXPRESSION_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Literal Time</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_TIME_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 6;


  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.LilModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.crubier.lil.lil.LilModel
   * @generated
   */
  EClass getLilModel();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.LilModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.crubier.lil.lil.LilModel#getName()
   * @see #getLilModel()
   * @generated
   */
  EAttribute getLilModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.LilModel#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see com.crubier.lil.lil.LilModel#getImports()
   * @see #getLilModel()
   * @generated
   */
  EReference getLilModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.LilModel#getActorType <em>Actor Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actor Type</em>'.
   * @see com.crubier.lil.lil.LilModel#getActorType()
   * @see #getLilModel()
   * @generated
   */
  EReference getLilModel_ActorType();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.LilModel#getDataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data Type</em>'.
   * @see com.crubier.lil.lil.LilModel#getDataType()
   * @see #getLilModel()
   * @generated
   */
  EReference getLilModel_DataType();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.LilModel#getInteractorType <em>Interactor Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interactor Type</em>'.
   * @see com.crubier.lil.lil.LilModel#getInteractorType()
   * @see #getLilModel()
   * @generated
   */
  EReference getLilModel_InteractorType();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.ImportStatement <em>Import Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Statement</em>'.
   * @see com.crubier.lil.lil.ImportStatement
   * @generated
   */
  EClass getImportStatement();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.ImportStatement#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see com.crubier.lil.lil.ImportStatement#getImportedNamespace()
   * @see #getImportStatement()
   * @generated
   */
  EAttribute getImportStatement_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.ActorTypeDefinition <em>Actor Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actor Type Definition</em>'.
   * @see com.crubier.lil.lil.ActorTypeDefinition
   * @generated
   */
  EClass getActorTypeDefinition();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.ActorTypeDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.crubier.lil.lil.ActorTypeDefinition#getName()
   * @see #getActorTypeDefinition()
   * @generated
   */
  EAttribute getActorTypeDefinition_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.ActorTypeDefinition#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Component</em>'.
   * @see com.crubier.lil.lil.ActorTypeDefinition#getComponent()
   * @see #getActorTypeDefinition()
   * @generated
   */
  EReference getActorTypeDefinition_Component();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.ActorType <em>Actor Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actor Type</em>'.
   * @see com.crubier.lil.lil.ActorType
   * @generated
   */
  EClass getActorType();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.ActorComponentDeclaration <em>Actor Component Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actor Component Declaration</em>'.
   * @see com.crubier.lil.lil.ActorComponentDeclaration
   * @generated
   */
  EClass getActorComponentDeclaration();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.ActorComponentDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.crubier.lil.lil.ActorComponentDeclaration#getName()
   * @see #getActorComponentDeclaration()
   * @generated
   */
  EAttribute getActorComponentDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.ActorComponentDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.crubier.lil.lil.ActorComponentDeclaration#getType()
   * @see #getActorComponentDeclaration()
   * @generated
   */
  EReference getActorComponentDeclaration_Type();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeDefinition <em>Data Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Definition</em>'.
   * @see com.crubier.lil.lil.DataTypeDefinition
   * @generated
   */
  EClass getDataTypeDefinition();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.DataTypeDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.crubier.lil.lil.DataTypeDefinition#getName()
   * @see #getDataTypeDefinition()
   * @generated
   */
  EAttribute getDataTypeDefinition_Name();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see com.crubier.lil.lil.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeSymbolDefinitionSet <em>Data Type Symbol Definition Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Symbol Definition Set</em>'.
   * @see com.crubier.lil.lil.DataTypeSymbolDefinitionSet
   * @generated
   */
  EClass getDataTypeSymbolDefinitionSet();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.DataTypeSymbolDefinitionSet#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Element</em>'.
   * @see com.crubier.lil.lil.DataTypeSymbolDefinitionSet#getElement()
   * @see #getDataTypeSymbolDefinitionSet()
   * @generated
   */
  EReference getDataTypeSymbolDefinitionSet_Element();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeSymbolDefinitionSetElement <em>Data Type Symbol Definition Set Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Symbol Definition Set Element</em>'.
   * @see com.crubier.lil.lil.DataTypeSymbolDefinitionSetElement
   * @generated
   */
  EClass getDataTypeSymbolDefinitionSetElement();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.DataTypeSymbolDefinitionSetElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.crubier.lil.lil.DataTypeSymbolDefinitionSetElement#getName()
   * @see #getDataTypeSymbolDefinitionSetElement()
   * @generated
   */
  EAttribute getDataTypeSymbolDefinitionSetElement_Name();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeNumberDefinitionSet <em>Data Type Number Definition Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Number Definition Set</em>'.
   * @see com.crubier.lil.lil.DataTypeNumberDefinitionSet
   * @generated
   */
  EClass getDataTypeNumberDefinitionSet();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeTextDefinitionSet <em>Data Type Text Definition Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Text Definition Set</em>'.
   * @see com.crubier.lil.lil.DataTypeTextDefinitionSet
   * @generated
   */
  EClass getDataTypeTextDefinitionSet();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeTimeDefinitionSet <em>Data Type Time Definition Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Time Definition Set</em>'.
   * @see com.crubier.lil.lil.DataTypeTimeDefinitionSet
   * @generated
   */
  EClass getDataTypeTimeDefinitionSet();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeIdentifierDefinitionSet <em>Data Type Identifier Definition Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Identifier Definition Set</em>'.
   * @see com.crubier.lil.lil.DataTypeIdentifierDefinitionSet
   * @generated
   */
  EClass getDataTypeIdentifierDefinitionSet();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataComponentDeclaration <em>Data Component Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Component Declaration</em>'.
   * @see com.crubier.lil.lil.DataComponentDeclaration
   * @generated
   */
  EClass getDataComponentDeclaration();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.DataComponentDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.crubier.lil.lil.DataComponentDeclaration#getName()
   * @see #getDataComponentDeclaration()
   * @generated
   */
  EAttribute getDataComponentDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.DataComponentDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.crubier.lil.lil.DataComponentDeclaration#getType()
   * @see #getDataComponentDeclaration()
   * @generated
   */
  EReference getDataComponentDeclaration_Type();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorTypeDefinition <em>Interactor Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Type Definition</em>'.
   * @see com.crubier.lil.lil.InteractorTypeDefinition
   * @generated
   */
  EClass getInteractorTypeDefinition();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.InteractorTypeDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.crubier.lil.lil.InteractorTypeDefinition#getName()
   * @see #getInteractorTypeDefinition()
   * @generated
   */
  EAttribute getInteractorTypeDefinition_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.InteractorTypeDefinition#getActor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actor</em>'.
   * @see com.crubier.lil.lil.InteractorTypeDefinition#getActor()
   * @see #getInteractorTypeDefinition()
   * @generated
   */
  EReference getInteractorTypeDefinition_Actor();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.InteractorTypeDefinition#getData <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data</em>'.
   * @see com.crubier.lil.lil.InteractorTypeDefinition#getData()
   * @see #getInteractorTypeDefinition()
   * @generated
   */
  EReference getInteractorTypeDefinition_Data();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.InteractorTypeDefinition#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Component</em>'.
   * @see com.crubier.lil.lil.InteractorTypeDefinition#getComponent()
   * @see #getInteractorTypeDefinition()
   * @generated
   */
  EReference getInteractorTypeDefinition_Component();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.InteractorTypeDefinition#getBehavior <em>Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Behavior</em>'.
   * @see com.crubier.lil.lil.InteractorTypeDefinition#getBehavior()
   * @see #getInteractorTypeDefinition()
   * @generated
   */
  EReference getInteractorTypeDefinition_Behavior();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorType <em>Interactor Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Type</em>'.
   * @see com.crubier.lil.lil.InteractorType
   * @generated
   */
  EClass getInteractorType();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorEntityDeclaration <em>Interactor Entity Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Entity Declaration</em>'.
   * @see com.crubier.lil.lil.InteractorEntityDeclaration
   * @generated
   */
  EClass getInteractorEntityDeclaration();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.InteractorEntityDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.crubier.lil.lil.InteractorEntityDeclaration#getName()
   * @see #getInteractorEntityDeclaration()
   * @generated
   */
  EAttribute getInteractorEntityDeclaration_Name();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorDataDeclaration <em>Interactor Data Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Data Declaration</em>'.
   * @see com.crubier.lil.lil.InteractorDataDeclaration
   * @generated
   */
  EClass getInteractorDataDeclaration();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.InteractorDataDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.crubier.lil.lil.InteractorDataDeclaration#getName()
   * @see #getInteractorDataDeclaration()
   * @generated
   */
  EAttribute getInteractorDataDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.InteractorDataDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.crubier.lil.lil.InteractorDataDeclaration#getType()
   * @see #getInteractorDataDeclaration()
   * @generated
   */
  EReference getInteractorDataDeclaration_Type();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorActorAlias <em>Interactor Actor Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Actor Alias</em>'.
   * @see com.crubier.lil.lil.InteractorActorAlias
   * @generated
   */
  EClass getInteractorActorAlias();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.InteractorActorAlias#getActor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Actor</em>'.
   * @see com.crubier.lil.lil.InteractorActorAlias#getActor()
   * @see #getInteractorActorAlias()
   * @generated
   */
  EReference getInteractorActorAlias_Actor();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.InteractorActorAlias#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Alias</em>'.
   * @see com.crubier.lil.lil.InteractorActorAlias#getAlias()
   * @see #getInteractorActorAlias()
   * @generated
   */
  EReference getInteractorActorAlias_Alias();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorDataAlias <em>Interactor Data Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Data Alias</em>'.
   * @see com.crubier.lil.lil.InteractorDataAlias
   * @generated
   */
  EClass getInteractorDataAlias();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.InteractorDataAlias#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entity</em>'.
   * @see com.crubier.lil.lil.InteractorDataAlias#getEntity()
   * @see #getInteractorDataAlias()
   * @generated
   */
  EReference getInteractorDataAlias_Entity();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.InteractorDataAlias#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Alias</em>'.
   * @see com.crubier.lil.lil.InteractorDataAlias#getAlias()
   * @see #getInteractorDataAlias()
   * @generated
   */
  EReference getInteractorDataAlias_Alias();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorEntity <em>Interactor Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Entity</em>'.
   * @see com.crubier.lil.lil.InteractorEntity
   * @generated
   */
  EClass getInteractorEntity();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorDataReception <em>Interactor Data Reception</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Data Reception</em>'.
   * @see com.crubier.lil.lil.InteractorDataReception
   * @generated
   */
  EClass getInteractorDataReception();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorDataEmission <em>Interactor Data Emission</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Data Emission</em>'.
   * @see com.crubier.lil.lil.InteractorDataEmission
   * @generated
   */
  EClass getInteractorDataEmission();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.InteractorDataEmission#getData <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Data</em>'.
   * @see com.crubier.lil.lil.InteractorDataEmission#getData()
   * @see #getInteractorDataEmission()
   * @generated
   */
  EReference getInteractorDataEmission_Data();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorBehaviorDeclaration <em>Interactor Behavior Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Behavior Declaration</em>'.
   * @see com.crubier.lil.lil.InteractorBehaviorDeclaration
   * @generated
   */
  EClass getInteractorBehaviorDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.InteractorBehaviorDeclaration#getCause <em>Cause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cause</em>'.
   * @see com.crubier.lil.lil.InteractorBehaviorDeclaration#getCause()
   * @see #getInteractorBehaviorDeclaration()
   * @generated
   */
  EReference getInteractorBehaviorDeclaration_Cause();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.InteractorBehaviorDeclaration#getEffect <em>Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Effect</em>'.
   * @see com.crubier.lil.lil.InteractorBehaviorDeclaration#getEffect()
   * @see #getInteractorBehaviorDeclaration()
   * @generated
   */
  EReference getInteractorBehaviorDeclaration_Effect();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorBehaviorCause <em>Interactor Behavior Cause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Behavior Cause</em>'.
   * @see com.crubier.lil.lil.InteractorBehaviorCause
   * @generated
   */
  EClass getInteractorBehaviorCause();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.InteractorBehaviorCause#getGuard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guard</em>'.
   * @see com.crubier.lil.lil.InteractorBehaviorCause#getGuard()
   * @see #getInteractorBehaviorCause()
   * @generated
   */
  EReference getInteractorBehaviorCause_Guard();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorBehaviorEffect <em>Interactor Behavior Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Behavior Effect</em>'.
   * @see com.crubier.lil.lil.InteractorBehaviorEffect
   * @generated
   */
  EClass getInteractorBehaviorEffect();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.InteractorBehaviorEffect#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see com.crubier.lil.lil.InteractorBehaviorEffect#getTarget()
   * @see #getInteractorBehaviorEffect()
   * @generated
   */
  EReference getInteractorBehaviorEffect_Target();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.InteractorBehaviorEffect#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.crubier.lil.lil.InteractorBehaviorEffect#getValue()
   * @see #getInteractorBehaviorEffect()
   * @generated
   */
  EReference getInteractorBehaviorEffect_Value();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see com.crubier.lil.lil.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.ExpressionLiteralCollection <em>Expression Literal Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Literal Collection</em>'.
   * @see com.crubier.lil.lil.ExpressionLiteralCollection
   * @generated
   */
  EClass getExpressionLiteralCollection();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.ExpressionLiteralCollection#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see com.crubier.lil.lil.ExpressionLiteralCollection#getElements()
   * @see #getExpressionLiteralCollection()
   * @generated
   */
  EReference getExpressionLiteralCollection_Elements();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.ExpressionLiteralSet <em>Expression Literal Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Literal Set</em>'.
   * @see com.crubier.lil.lil.ExpressionLiteralSet
   * @generated
   */
  EClass getExpressionLiteralSet();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.ExpressionLiteralList <em>Expression Literal List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Literal List</em>'.
   * @see com.crubier.lil.lil.ExpressionLiteralList
   * @generated
   */
  EClass getExpressionLiteralList();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.ExpressionCase <em>Expression Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Case</em>'.
   * @see com.crubier.lil.lil.ExpressionCase
   * @generated
   */
  EClass getExpressionCase();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.ExpressionCase#getCase <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Case</em>'.
   * @see com.crubier.lil.lil.ExpressionCase#getCase()
   * @see #getExpressionCase()
   * @generated
   */
  EReference getExpressionCase_Case();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.ExpressionCase#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see com.crubier.lil.lil.ExpressionCase#getThen()
   * @see #getExpressionCase()
   * @generated
   */
  EReference getExpressionCase_Then();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.ActorTypeInput <em>Actor Type Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actor Type Input</em>'.
   * @see com.crubier.lil.lil.ActorTypeInput
   * @generated
   */
  EClass getActorTypeInput();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.ActorTypeOutput <em>Actor Type Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actor Type Output</em>'.
   * @see com.crubier.lil.lil.ActorTypeOutput
   * @generated
   */
  EClass getActorTypeOutput();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.ActorTypeCustom <em>Actor Type Custom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actor Type Custom</em>'.
   * @see com.crubier.lil.lil.ActorTypeCustom
   * @generated
   */
  EClass getActorTypeCustom();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.ActorTypeCustom#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Definition</em>'.
   * @see com.crubier.lil.lil.ActorTypeCustom#getDefinition()
   * @see #getActorTypeCustom()
   * @generated
   */
  EReference getActorTypeCustom_Definition();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeDefinitionCompound <em>Data Type Definition Compound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Definition Compound</em>'.
   * @see com.crubier.lil.lil.DataTypeDefinitionCompound
   * @generated
   */
  EClass getDataTypeDefinitionCompound();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.DataTypeDefinitionCompound#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Component</em>'.
   * @see com.crubier.lil.lil.DataTypeDefinitionCompound#getComponent()
   * @see #getDataTypeDefinitionCompound()
   * @generated
   */
  EReference getDataTypeDefinitionCompound_Component();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeDefinitionAlias <em>Data Type Definition Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Definition Alias</em>'.
   * @see com.crubier.lil.lil.DataTypeDefinitionAlias
   * @generated
   */
  EClass getDataTypeDefinitionAlias();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.DataTypeDefinitionAlias#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alias</em>'.
   * @see com.crubier.lil.lil.DataTypeDefinitionAlias#getAlias()
   * @see #getDataTypeDefinitionAlias()
   * @generated
   */
  EReference getDataTypeDefinitionAlias_Alias();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeVoid <em>Data Type Void</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Void</em>'.
   * @see com.crubier.lil.lil.DataTypeVoid
   * @generated
   */
  EClass getDataTypeVoid();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeSymbol <em>Data Type Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Symbol</em>'.
   * @see com.crubier.lil.lil.DataTypeSymbol
   * @generated
   */
  EClass getDataTypeSymbol();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.DataTypeSymbol#getDefinitionSet <em>Definition Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Definition Set</em>'.
   * @see com.crubier.lil.lil.DataTypeSymbol#getDefinitionSet()
   * @see #getDataTypeSymbol()
   * @generated
   */
  EReference getDataTypeSymbol_DefinitionSet();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeNumber <em>Data Type Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Number</em>'.
   * @see com.crubier.lil.lil.DataTypeNumber
   * @generated
   */
  EClass getDataTypeNumber();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.DataTypeNumber#getDefinitionSet <em>Definition Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Definition Set</em>'.
   * @see com.crubier.lil.lil.DataTypeNumber#getDefinitionSet()
   * @see #getDataTypeNumber()
   * @generated
   */
  EReference getDataTypeNumber_DefinitionSet();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeText <em>Data Type Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Text</em>'.
   * @see com.crubier.lil.lil.DataTypeText
   * @generated
   */
  EClass getDataTypeText();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.DataTypeText#getDefinitionSet <em>Definition Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Definition Set</em>'.
   * @see com.crubier.lil.lil.DataTypeText#getDefinitionSet()
   * @see #getDataTypeText()
   * @generated
   */
  EReference getDataTypeText_DefinitionSet();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeTime <em>Data Type Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Time</em>'.
   * @see com.crubier.lil.lil.DataTypeTime
   * @generated
   */
  EClass getDataTypeTime();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.DataTypeTime#getDefinitionSet <em>Definition Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Definition Set</em>'.
   * @see com.crubier.lil.lil.DataTypeTime#getDefinitionSet()
   * @see #getDataTypeTime()
   * @generated
   */
  EReference getDataTypeTime_DefinitionSet();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeIdentifier <em>Data Type Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Identifier</em>'.
   * @see com.crubier.lil.lil.DataTypeIdentifier
   * @generated
   */
  EClass getDataTypeIdentifier();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.DataTypeIdentifier#getDefinitionSet <em>Definition Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Definition Set</em>'.
   * @see com.crubier.lil.lil.DataTypeIdentifier#getDefinitionSet()
   * @see #getDataTypeIdentifier()
   * @generated
   */
  EReference getDataTypeIdentifier_DefinitionSet();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeCustom <em>Data Type Custom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Custom</em>'.
   * @see com.crubier.lil.lil.DataTypeCustom
   * @generated
   */
  EClass getDataTypeCustom();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.DataTypeCustom#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Definition</em>'.
   * @see com.crubier.lil.lil.DataTypeCustom#getDefinition()
   * @see #getDataTypeCustom()
   * @generated
   */
  EReference getDataTypeCustom_Definition();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeCollection <em>Data Type Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Collection</em>'.
   * @see com.crubier.lil.lil.DataTypeCollection
   * @generated
   */
  EClass getDataTypeCollection();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.DataTypeCollection#getElementType <em>Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element Type</em>'.
   * @see com.crubier.lil.lil.DataTypeCollection#getElementType()
   * @see #getDataTypeCollection()
   * @generated
   */
  EReference getDataTypeCollection_ElementType();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeSet <em>Data Type Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Set</em>'.
   * @see com.crubier.lil.lil.DataTypeSet
   * @generated
   */
  EClass getDataTypeSet();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.DataTypeSet#getElementType <em>Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element Type</em>'.
   * @see com.crubier.lil.lil.DataTypeSet#getElementType()
   * @see #getDataTypeSet()
   * @generated
   */
  EReference getDataTypeSet_ElementType();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeList <em>Data Type List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type List</em>'.
   * @see com.crubier.lil.lil.DataTypeList
   * @generated
   */
  EClass getDataTypeList();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.DataTypeList#getElementType <em>Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element Type</em>'.
   * @see com.crubier.lil.lil.DataTypeList#getElementType()
   * @see #getDataTypeList()
   * @generated
   */
  EReference getDataTypeList_ElementType();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeQueue <em>Data Type Queue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Queue</em>'.
   * @see com.crubier.lil.lil.DataTypeQueue
   * @generated
   */
  EClass getDataTypeQueue();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.DataTypeQueue#getElementType <em>Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element Type</em>'.
   * @see com.crubier.lil.lil.DataTypeQueue#getElementType()
   * @see #getDataTypeQueue()
   * @generated
   */
  EReference getDataTypeQueue_ElementType();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeNumberDefinitionSetSet <em>Data Type Number Definition Set Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Number Definition Set Set</em>'.
   * @see com.crubier.lil.lil.DataTypeNumberDefinitionSetSet
   * @generated
   */
  EClass getDataTypeNumberDefinitionSetSet();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.DataTypeNumberDefinitionSetSet#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Element</em>'.
   * @see com.crubier.lil.lil.DataTypeNumberDefinitionSetSet#getElement()
   * @see #getDataTypeNumberDefinitionSetSet()
   * @generated
   */
  EReference getDataTypeNumberDefinitionSetSet_Element();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeNumberDefinitionSetInterval <em>Data Type Number Definition Set Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Number Definition Set Interval</em>'.
   * @see com.crubier.lil.lil.DataTypeNumberDefinitionSetInterval
   * @generated
   */
  EClass getDataTypeNumberDefinitionSetInterval();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.DataTypeNumberDefinitionSetInterval#getInf <em>Inf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inf</em>'.
   * @see com.crubier.lil.lil.DataTypeNumberDefinitionSetInterval#getInf()
   * @see #getDataTypeNumberDefinitionSetInterval()
   * @generated
   */
  EReference getDataTypeNumberDefinitionSetInterval_Inf();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.DataTypeNumberDefinitionSetInterval#getSup <em>Sup</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sup</em>'.
   * @see com.crubier.lil.lil.DataTypeNumberDefinitionSetInterval#getSup()
   * @see #getDataTypeNumberDefinitionSetInterval()
   * @generated
   */
  EReference getDataTypeNumberDefinitionSetInterval_Sup();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeTextDefinitionSetSet <em>Data Type Text Definition Set Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Text Definition Set Set</em>'.
   * @see com.crubier.lil.lil.DataTypeTextDefinitionSetSet
   * @generated
   */
  EClass getDataTypeTextDefinitionSetSet();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.DataTypeTextDefinitionSetSet#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Element</em>'.
   * @see com.crubier.lil.lil.DataTypeTextDefinitionSetSet#getElement()
   * @see #getDataTypeTextDefinitionSetSet()
   * @generated
   */
  EReference getDataTypeTextDefinitionSetSet_Element();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeTimeDefinitionSetSet <em>Data Type Time Definition Set Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Time Definition Set Set</em>'.
   * @see com.crubier.lil.lil.DataTypeTimeDefinitionSetSet
   * @generated
   */
  EClass getDataTypeTimeDefinitionSetSet();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.DataTypeTimeDefinitionSetSet#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Element</em>'.
   * @see com.crubier.lil.lil.DataTypeTimeDefinitionSetSet#getElement()
   * @see #getDataTypeTimeDefinitionSetSet()
   * @generated
   */
  EReference getDataTypeTimeDefinitionSetSet_Element();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeTimeDefinitionSetInterval <em>Data Type Time Definition Set Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Time Definition Set Interval</em>'.
   * @see com.crubier.lil.lil.DataTypeTimeDefinitionSetInterval
   * @generated
   */
  EClass getDataTypeTimeDefinitionSetInterval();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.DataTypeTimeDefinitionSetInterval#getInf <em>Inf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inf</em>'.
   * @see com.crubier.lil.lil.DataTypeTimeDefinitionSetInterval#getInf()
   * @see #getDataTypeTimeDefinitionSetInterval()
   * @generated
   */
  EReference getDataTypeTimeDefinitionSetInterval_Inf();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.DataTypeTimeDefinitionSetInterval#getSup <em>Sup</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sup</em>'.
   * @see com.crubier.lil.lil.DataTypeTimeDefinitionSetInterval#getSup()
   * @see #getDataTypeTimeDefinitionSetInterval()
   * @generated
   */
  EReference getDataTypeTimeDefinitionSetInterval_Sup();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeIdentifierDefinitionSetSet <em>Data Type Identifier Definition Set Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Identifier Definition Set Set</em>'.
   * @see com.crubier.lil.lil.DataTypeIdentifierDefinitionSetSet
   * @generated
   */
  EClass getDataTypeIdentifierDefinitionSetSet();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.DataTypeIdentifierDefinitionSetSet#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Element</em>'.
   * @see com.crubier.lil.lil.DataTypeIdentifierDefinitionSetSet#getElement()
   * @see #getDataTypeIdentifierDefinitionSetSet()
   * @generated
   */
  EReference getDataTypeIdentifierDefinitionSetSet_Element();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorTypeCustom <em>Interactor Type Custom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Type Custom</em>'.
   * @see com.crubier.lil.lil.InteractorTypeCustom
   * @generated
   */
  EClass getInteractorTypeCustom();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.InteractorTypeCustom#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Definition</em>'.
   * @see com.crubier.lil.lil.InteractorTypeCustom#getDefinition()
   * @see #getInteractorTypeCustom()
   * @generated
   */
  EReference getInteractorTypeCustom_Definition();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorActorDeclaration <em>Interactor Actor Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Actor Declaration</em>'.
   * @see com.crubier.lil.lil.InteractorActorDeclaration
   * @generated
   */
  EClass getInteractorActorDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.InteractorActorDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.crubier.lil.lil.InteractorActorDeclaration#getType()
   * @see #getInteractorActorDeclaration()
   * @generated
   */
  EReference getInteractorActorDeclaration_Type();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorComponentDeclaration <em>Interactor Component Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Component Declaration</em>'.
   * @see com.crubier.lil.lil.InteractorComponentDeclaration
   * @generated
   */
  EClass getInteractorComponentDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.InteractorComponentDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.crubier.lil.lil.InteractorComponentDeclaration#getType()
   * @see #getInteractorComponentDeclaration()
   * @generated
   */
  EReference getInteractorComponentDeclaration_Type();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.InteractorComponentDeclaration#getActors <em>Actors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actors</em>'.
   * @see com.crubier.lil.lil.InteractorComponentDeclaration#getActors()
   * @see #getInteractorComponentDeclaration()
   * @generated
   */
  EReference getInteractorComponentDeclaration_Actors();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorDataDeclarationEvent <em>Interactor Data Declaration Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Data Declaration Event</em>'.
   * @see com.crubier.lil.lil.InteractorDataDeclarationEvent
   * @generated
   */
  EClass getInteractorDataDeclarationEvent();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.InteractorDataDeclarationEvent#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see com.crubier.lil.lil.InteractorDataDeclarationEvent#getSource()
   * @see #getInteractorDataDeclarationEvent()
   * @generated
   */
  EReference getInteractorDataDeclarationEvent_Source();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.InteractorDataDeclarationEvent#getDestinations <em>Destinations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Destinations</em>'.
   * @see com.crubier.lil.lil.InteractorDataDeclarationEvent#getDestinations()
   * @see #getInteractorDataDeclarationEvent()
   * @generated
   */
  EReference getInteractorDataDeclarationEvent_Destinations();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorDataDeclarationFlow <em>Interactor Data Declaration Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Data Declaration Flow</em>'.
   * @see com.crubier.lil.lil.InteractorDataDeclarationFlow
   * @generated
   */
  EClass getInteractorDataDeclarationFlow();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.InteractorDataDeclarationFlow#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see com.crubier.lil.lil.InteractorDataDeclarationFlow#getSource()
   * @see #getInteractorDataDeclarationFlow()
   * @generated
   */
  EReference getInteractorDataDeclarationFlow_Source();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.InteractorDataDeclarationFlow#getDestinations <em>Destinations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Destinations</em>'.
   * @see com.crubier.lil.lil.InteractorDataDeclarationFlow#getDestinations()
   * @see #getInteractorDataDeclarationFlow()
   * @generated
   */
  EReference getInteractorDataDeclarationFlow_Destinations();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorDataDeclarationConstant <em>Interactor Data Declaration Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Data Declaration Constant</em>'.
   * @see com.crubier.lil.lil.InteractorDataDeclarationConstant
   * @generated
   */
  EClass getInteractorDataDeclarationConstant();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorEntityAny <em>Interactor Entity Any</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Entity Any</em>'.
   * @see com.crubier.lil.lil.InteractorEntityAny
   * @generated
   */
  EClass getInteractorEntityAny();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorEntitySelf <em>Interactor Entity Self</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Entity Self</em>'.
   * @see com.crubier.lil.lil.InteractorEntitySelf
   * @generated
   */
  EClass getInteractorEntitySelf();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorEntityOther <em>Interactor Entity Other</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Entity Other</em>'.
   * @see com.crubier.lil.lil.InteractorEntityOther
   * @generated
   */
  EClass getInteractorEntityOther();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorEntityParent <em>Interactor Entity Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Entity Parent</em>'.
   * @see com.crubier.lil.lil.InteractorEntityParent
   * @generated
   */
  EClass getInteractorEntityParent();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorEntityChild <em>Interactor Entity Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Entity Child</em>'.
   * @see com.crubier.lil.lil.InteractorEntityChild
   * @generated
   */
  EClass getInteractorEntityChild();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorEntityAll <em>Interactor Entity All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Entity All</em>'.
   * @see com.crubier.lil.lil.InteractorEntityAll
   * @generated
   */
  EClass getInteractorEntityAll();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorEntityActors <em>Interactor Entity Actors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Entity Actors</em>'.
   * @see com.crubier.lil.lil.InteractorEntityActors
   * @generated
   */
  EClass getInteractorEntityActors();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorEntitySpecific <em>Interactor Entity Specific</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Entity Specific</em>'.
   * @see com.crubier.lil.lil.InteractorEntitySpecific
   * @generated
   */
  EClass getInteractorEntitySpecific();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.InteractorEntitySpecific#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entity</em>'.
   * @see com.crubier.lil.lil.InteractorEntitySpecific#getEntity()
   * @see #getInteractorEntitySpecific()
   * @generated
   */
  EReference getInteractorEntitySpecific_Entity();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorDataReceptionInternal <em>Interactor Data Reception Internal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Data Reception Internal</em>'.
   * @see com.crubier.lil.lil.InteractorDataReceptionInternal
   * @generated
   */
  EClass getInteractorDataReceptionInternal();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.InteractorDataReceptionInternal#getData <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Data</em>'.
   * @see com.crubier.lil.lil.InteractorDataReceptionInternal#getData()
   * @see #getInteractorDataReceptionInternal()
   * @generated
   */
  EReference getInteractorDataReceptionInternal_Data();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorDataReceptionExternal <em>Interactor Data Reception External</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Data Reception External</em>'.
   * @see com.crubier.lil.lil.InteractorDataReceptionExternal
   * @generated
   */
  EClass getInteractorDataReceptionExternal();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.InteractorDataReceptionExternal#getData <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Data</em>'.
   * @see com.crubier.lil.lil.InteractorDataReceptionExternal#getData()
   * @see #getInteractorDataReceptionExternal()
   * @generated
   */
  EReference getInteractorDataReceptionExternal_Data();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.InteractorDataReceptionExternal#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see com.crubier.lil.lil.InteractorDataReceptionExternal#getSource()
   * @see #getInteractorDataReceptionExternal()
   * @generated
   */
  EReference getInteractorDataReceptionExternal_Source();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorDataReceptionInit <em>Interactor Data Reception Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Data Reception Init</em>'.
   * @see com.crubier.lil.lil.InteractorDataReceptionInit
   * @generated
   */
  EClass getInteractorDataReceptionInit();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorDataEmissionInternal <em>Interactor Data Emission Internal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Data Emission Internal</em>'.
   * @see com.crubier.lil.lil.InteractorDataEmissionInternal
   * @generated
   */
  EClass getInteractorDataEmissionInternal();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorDataEmissionExternal <em>Interactor Data Emission External</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Data Emission External</em>'.
   * @see com.crubier.lil.lil.InteractorDataEmissionExternal
   * @generated
   */
  EClass getInteractorDataEmissionExternal();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.InteractorDataEmissionExternal#getDestination <em>Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Destination</em>'.
   * @see com.crubier.lil.lil.InteractorDataEmissionExternal#getDestination()
   * @see #getInteractorDataEmissionExternal()
   * @generated
   */
  EReference getInteractorDataEmissionExternal_Destination();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorBehaviorCauseOn <em>Interactor Behavior Cause On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Behavior Cause On</em>'.
   * @see com.crubier.lil.lil.InteractorBehaviorCauseOn
   * @generated
   */
  EClass getInteractorBehaviorCauseOn();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.InteractorBehaviorCauseOn#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Event</em>'.
   * @see com.crubier.lil.lil.InteractorBehaviorCauseOn#getEvent()
   * @see #getInteractorBehaviorCauseOn()
   * @generated
   */
  EReference getInteractorBehaviorCauseOn_Event();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorBehaviorCauseWhen <em>Interactor Behavior Cause When</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Behavior Cause When</em>'.
   * @see com.crubier.lil.lil.InteractorBehaviorCauseWhen
   * @generated
   */
  EClass getInteractorBehaviorCauseWhen();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.InteractorBehaviorCauseWhen#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see com.crubier.lil.lil.InteractorBehaviorCauseWhen#getCondition()
   * @see #getInteractorBehaviorCauseWhen()
   * @generated
   */
  EReference getInteractorBehaviorCauseWhen_Condition();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorBehaviorEffectAlways <em>Interactor Behavior Effect Always</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Behavior Effect Always</em>'.
   * @see com.crubier.lil.lil.InteractorBehaviorEffectAlways
   * @generated
   */
  EClass getInteractorBehaviorEffectAlways();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorBehaviorEffectSet <em>Interactor Behavior Effect Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Behavior Effect Set</em>'.
   * @see com.crubier.lil.lil.InteractorBehaviorEffectSet
   * @generated
   */
  EClass getInteractorBehaviorEffectSet();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorBehaviorEffectTrigger <em>Interactor Behavior Effect Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Behavior Effect Trigger</em>'.
   * @see com.crubier.lil.lil.InteractorBehaviorEffectTrigger
   * @generated
   */
  EClass getInteractorBehaviorEffectTrigger();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.ExpressionBinaryOperation <em>Expression Binary Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Binary Operation</em>'.
   * @see com.crubier.lil.lil.ExpressionBinaryOperation
   * @generated
   */
  EClass getExpressionBinaryOperation();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.ExpressionBinaryOperation#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see com.crubier.lil.lil.ExpressionBinaryOperation#getLeftOperand()
   * @see #getExpressionBinaryOperation()
   * @generated
   */
  EReference getExpressionBinaryOperation_LeftOperand();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.ExpressionBinaryOperation#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature</em>'.
   * @see com.crubier.lil.lil.ExpressionBinaryOperation#getFeature()
   * @see #getExpressionBinaryOperation()
   * @generated
   */
  EAttribute getExpressionBinaryOperation_Feature();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.ExpressionBinaryOperation#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see com.crubier.lil.lil.ExpressionBinaryOperation#getRightOperand()
   * @see #getExpressionBinaryOperation()
   * @generated
   */
  EReference getExpressionBinaryOperation_RightOperand();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.UnaryOperation <em>Unary Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Operation</em>'.
   * @see com.crubier.lil.lil.UnaryOperation
   * @generated
   */
  EClass getUnaryOperation();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.UnaryOperation#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature</em>'.
   * @see com.crubier.lil.lil.UnaryOperation#getFeature()
   * @see #getUnaryOperation()
   * @generated
   */
  EAttribute getUnaryOperation_Feature();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.UnaryOperation#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand</em>'.
   * @see com.crubier.lil.lil.UnaryOperation#getOperand()
   * @see #getUnaryOperation()
   * @generated
   */
  EReference getUnaryOperation_Operand();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.ExpressionIf <em>Expression If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression If</em>'.
   * @see com.crubier.lil.lil.ExpressionIf
   * @generated
   */
  EClass getExpressionIf();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.ExpressionIf#getIf <em>If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If</em>'.
   * @see com.crubier.lil.lil.ExpressionIf#getIf()
   * @see #getExpressionIf()
   * @generated
   */
  EReference getExpressionIf_If();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.ExpressionIf#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see com.crubier.lil.lil.ExpressionIf#getThen()
   * @see #getExpressionIf()
   * @generated
   */
  EReference getExpressionIf_Then();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.ExpressionIf#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see com.crubier.lil.lil.ExpressionIf#getElse()
   * @see #getExpressionIf()
   * @generated
   */
  EReference getExpressionIf_Else();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.ExpressionSwitch <em>Expression Switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Switch</em>'.
   * @see com.crubier.lil.lil.ExpressionSwitch
   * @generated
   */
  EClass getExpressionSwitch();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.ExpressionSwitch#getSwitch <em>Switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Switch</em>'.
   * @see com.crubier.lil.lil.ExpressionSwitch#getSwitch()
   * @see #getExpressionSwitch()
   * @generated
   */
  EReference getExpressionSwitch_Switch();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.ExpressionSwitch#getCase <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Case</em>'.
   * @see com.crubier.lil.lil.ExpressionSwitch#getCase()
   * @see #getExpressionSwitch()
   * @generated
   */
  EReference getExpressionSwitch_Case();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.ExpressionSwitch#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default</em>'.
   * @see com.crubier.lil.lil.ExpressionSwitch#getDefault()
   * @see #getExpressionSwitch()
   * @generated
   */
  EReference getExpressionSwitch_Default();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.ExpressionForEach <em>Expression For Each</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression For Each</em>'.
   * @see com.crubier.lil.lil.ExpressionForEach
   * @generated
   */
  EClass getExpressionForEach();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.ExpressionForEach#getForExpression <em>For Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>For Expression</em>'.
   * @see com.crubier.lil.lil.ExpressionForEach#getForExpression()
   * @see #getExpressionForEach()
   * @generated
   */
  EReference getExpressionForEach_ForExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.ExpressionForEach#getEachExpression <em>Each Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Each Expression</em>'.
   * @see com.crubier.lil.lil.ExpressionForEach#getEachExpression()
   * @see #getExpressionForEach()
   * @generated
   */
  EReference getExpressionForEach_EachExpression();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.ExpressionFunctionCall <em>Expression Function Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Function Call</em>'.
   * @see com.crubier.lil.lil.ExpressionFunctionCall
   * @generated
   */
  EClass getExpressionFunctionCall();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.ExpressionFunctionCall#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function</em>'.
   * @see com.crubier.lil.lil.ExpressionFunctionCall#getFunction()
   * @see #getExpressionFunctionCall()
   * @generated
   */
  EAttribute getExpressionFunctionCall_Function();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.ExpressionFunctionCall#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see com.crubier.lil.lil.ExpressionFunctionCall#getArguments()
   * @see #getExpressionFunctionCall()
   * @generated
   */
  EReference getExpressionFunctionCall_Arguments();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.LiteralBoolean <em>Literal Boolean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal Boolean</em>'.
   * @see com.crubier.lil.lil.LiteralBoolean
   * @generated
   */
  EClass getLiteralBoolean();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.LiteralBoolean#isIsTrue <em>Is True</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is True</em>'.
   * @see com.crubier.lil.lil.LiteralBoolean#isIsTrue()
   * @see #getLiteralBoolean()
   * @generated
   */
  EAttribute getLiteralBoolean_IsTrue();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.LiteralNull <em>Literal Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal Null</em>'.
   * @see com.crubier.lil.lil.LiteralNull
   * @generated
   */
  EClass getLiteralNull();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.LiteralNumber <em>Literal Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal Number</em>'.
   * @see com.crubier.lil.lil.LiteralNumber
   * @generated
   */
  EClass getLiteralNumber();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.LiteralNumber#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.crubier.lil.lil.LiteralNumber#getValue()
   * @see #getLiteralNumber()
   * @generated
   */
  EAttribute getLiteralNumber_Value();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.LiteralText <em>Literal Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal Text</em>'.
   * @see com.crubier.lil.lil.LiteralText
   * @generated
   */
  EClass getLiteralText();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.LiteralText#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.crubier.lil.lil.LiteralText#getValue()
   * @see #getLiteralText()
   * @generated
   */
  EAttribute getLiteralText_Value();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.LiteralEnum <em>Literal Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal Enum</em>'.
   * @see com.crubier.lil.lil.LiteralEnum
   * @generated
   */
  EClass getLiteralEnum();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.LiteralEnum#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see com.crubier.lil.lil.LiteralEnum#getValue()
   * @see #getLiteralEnum()
   * @generated
   */
  EReference getLiteralEnum_Value();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.LiteralTimeNow <em>Literal Time Now</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal Time Now</em>'.
   * @see com.crubier.lil.lil.LiteralTimeNow
   * @generated
   */
  EClass getLiteralTimeNow();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.LiteralTime <em>Literal Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal Time</em>'.
   * @see com.crubier.lil.lil.LiteralTime
   * @generated
   */
  EClass getLiteralTime();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.LiteralTime#getYear <em>Year</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Year</em>'.
   * @see com.crubier.lil.lil.LiteralTime#getYear()
   * @see #getLiteralTime()
   * @generated
   */
  EAttribute getLiteralTime_Year();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.LiteralTime#getMonth <em>Month</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Month</em>'.
   * @see com.crubier.lil.lil.LiteralTime#getMonth()
   * @see #getLiteralTime()
   * @generated
   */
  EAttribute getLiteralTime_Month();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.LiteralTime#getDay <em>Day</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Day</em>'.
   * @see com.crubier.lil.lil.LiteralTime#getDay()
   * @see #getLiteralTime()
   * @generated
   */
  EAttribute getLiteralTime_Day();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.LiteralTime#getHour <em>Hour</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hour</em>'.
   * @see com.crubier.lil.lil.LiteralTime#getHour()
   * @see #getLiteralTime()
   * @generated
   */
  EAttribute getLiteralTime_Hour();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.LiteralTime#getMinute <em>Minute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Minute</em>'.
   * @see com.crubier.lil.lil.LiteralTime#getMinute()
   * @see #getLiteralTime()
   * @generated
   */
  EAttribute getLiteralTime_Minute();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.LiteralTime#getSecond <em>Second</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Second</em>'.
   * @see com.crubier.lil.lil.LiteralTime#getSecond()
   * @see #getLiteralTime()
   * @generated
   */
  EAttribute getLiteralTime_Second();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LilFactory getLilFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.LilModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.LilModelImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getLilModel()
     * @generated
     */
    EClass LIL_MODEL = eINSTANCE.getLilModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIL_MODEL__NAME = eINSTANCE.getLilModel_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIL_MODEL__IMPORTS = eINSTANCE.getLilModel_Imports();

    /**
     * The meta object literal for the '<em><b>Actor Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIL_MODEL__ACTOR_TYPE = eINSTANCE.getLilModel_ActorType();

    /**
     * The meta object literal for the '<em><b>Data Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIL_MODEL__DATA_TYPE = eINSTANCE.getLilModel_DataType();

    /**
     * The meta object literal for the '<em><b>Interactor Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIL_MODEL__INTERACTOR_TYPE = eINSTANCE.getLilModel_InteractorType();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.ImportStatementImpl <em>Import Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.ImportStatementImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getImportStatement()
     * @generated
     */
    EClass IMPORT_STATEMENT = eINSTANCE.getImportStatement();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_STATEMENT__IMPORTED_NAMESPACE = eINSTANCE.getImportStatement_ImportedNamespace();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.ActorTypeDefinitionImpl <em>Actor Type Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.ActorTypeDefinitionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getActorTypeDefinition()
     * @generated
     */
    EClass ACTOR_TYPE_DEFINITION = eINSTANCE.getActorTypeDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTOR_TYPE_DEFINITION__NAME = eINSTANCE.getActorTypeDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTOR_TYPE_DEFINITION__COMPONENT = eINSTANCE.getActorTypeDefinition_Component();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.ActorTypeImpl <em>Actor Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.ActorTypeImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getActorType()
     * @generated
     */
    EClass ACTOR_TYPE = eINSTANCE.getActorType();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.ActorComponentDeclarationImpl <em>Actor Component Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.ActorComponentDeclarationImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getActorComponentDeclaration()
     * @generated
     */
    EClass ACTOR_COMPONENT_DECLARATION = eINSTANCE.getActorComponentDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTOR_COMPONENT_DECLARATION__NAME = eINSTANCE.getActorComponentDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTOR_COMPONENT_DECLARATION__TYPE = eINSTANCE.getActorComponentDeclaration_Type();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeDefinitionImpl <em>Data Type Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeDefinitionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeDefinition()
     * @generated
     */
    EClass DATA_TYPE_DEFINITION = eINSTANCE.getDataTypeDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE_DEFINITION__NAME = eINSTANCE.getDataTypeDefinition_Name();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeSymbolDefinitionSetImpl <em>Data Type Symbol Definition Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeSymbolDefinitionSetImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeSymbolDefinitionSet()
     * @generated
     */
    EClass DATA_TYPE_SYMBOL_DEFINITION_SET = eINSTANCE.getDataTypeSymbolDefinitionSet();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_SYMBOL_DEFINITION_SET__ELEMENT = eINSTANCE.getDataTypeSymbolDefinitionSet_Element();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeSymbolDefinitionSetElementImpl <em>Data Type Symbol Definition Set Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeSymbolDefinitionSetElementImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeSymbolDefinitionSetElement()
     * @generated
     */
    EClass DATA_TYPE_SYMBOL_DEFINITION_SET_ELEMENT = eINSTANCE.getDataTypeSymbolDefinitionSetElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE_SYMBOL_DEFINITION_SET_ELEMENT__NAME = eINSTANCE.getDataTypeSymbolDefinitionSetElement_Name();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeNumberDefinitionSetImpl <em>Data Type Number Definition Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeNumberDefinitionSetImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeNumberDefinitionSet()
     * @generated
     */
    EClass DATA_TYPE_NUMBER_DEFINITION_SET = eINSTANCE.getDataTypeNumberDefinitionSet();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeTextDefinitionSetImpl <em>Data Type Text Definition Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeTextDefinitionSetImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeTextDefinitionSet()
     * @generated
     */
    EClass DATA_TYPE_TEXT_DEFINITION_SET = eINSTANCE.getDataTypeTextDefinitionSet();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeTimeDefinitionSetImpl <em>Data Type Time Definition Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeTimeDefinitionSetImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeTimeDefinitionSet()
     * @generated
     */
    EClass DATA_TYPE_TIME_DEFINITION_SET = eINSTANCE.getDataTypeTimeDefinitionSet();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeIdentifierDefinitionSetImpl <em>Data Type Identifier Definition Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeIdentifierDefinitionSetImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeIdentifierDefinitionSet()
     * @generated
     */
    EClass DATA_TYPE_IDENTIFIER_DEFINITION_SET = eINSTANCE.getDataTypeIdentifierDefinitionSet();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataComponentDeclarationImpl <em>Data Component Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataComponentDeclarationImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataComponentDeclaration()
     * @generated
     */
    EClass DATA_COMPONENT_DECLARATION = eINSTANCE.getDataComponentDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_COMPONENT_DECLARATION__NAME = eINSTANCE.getDataComponentDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_COMPONENT_DECLARATION__TYPE = eINSTANCE.getDataComponentDeclaration_Type();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorTypeDefinitionImpl <em>Interactor Type Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorTypeDefinitionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorTypeDefinition()
     * @generated
     */
    EClass INTERACTOR_TYPE_DEFINITION = eINSTANCE.getInteractorTypeDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERACTOR_TYPE_DEFINITION__NAME = eINSTANCE.getInteractorTypeDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Actor</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_TYPE_DEFINITION__ACTOR = eINSTANCE.getInteractorTypeDefinition_Actor();

    /**
     * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_TYPE_DEFINITION__DATA = eINSTANCE.getInteractorTypeDefinition_Data();

    /**
     * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_TYPE_DEFINITION__COMPONENT = eINSTANCE.getInteractorTypeDefinition_Component();

    /**
     * The meta object literal for the '<em><b>Behavior</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_TYPE_DEFINITION__BEHAVIOR = eINSTANCE.getInteractorTypeDefinition_Behavior();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorTypeImpl <em>Interactor Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorTypeImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorType()
     * @generated
     */
    EClass INTERACTOR_TYPE = eINSTANCE.getInteractorType();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorEntityDeclarationImpl <em>Interactor Entity Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorEntityDeclarationImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorEntityDeclaration()
     * @generated
     */
    EClass INTERACTOR_ENTITY_DECLARATION = eINSTANCE.getInteractorEntityDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERACTOR_ENTITY_DECLARATION__NAME = eINSTANCE.getInteractorEntityDeclaration_Name();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorDataDeclarationImpl <em>Interactor Data Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorDataDeclarationImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorDataDeclaration()
     * @generated
     */
    EClass INTERACTOR_DATA_DECLARATION = eINSTANCE.getInteractorDataDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERACTOR_DATA_DECLARATION__NAME = eINSTANCE.getInteractorDataDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_DATA_DECLARATION__TYPE = eINSTANCE.getInteractorDataDeclaration_Type();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorActorAliasImpl <em>Interactor Actor Alias</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorActorAliasImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorActorAlias()
     * @generated
     */
    EClass INTERACTOR_ACTOR_ALIAS = eINSTANCE.getInteractorActorAlias();

    /**
     * The meta object literal for the '<em><b>Actor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_ACTOR_ALIAS__ACTOR = eINSTANCE.getInteractorActorAlias_Actor();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_ACTOR_ALIAS__ALIAS = eINSTANCE.getInteractorActorAlias_Alias();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorDataAliasImpl <em>Interactor Data Alias</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorDataAliasImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorDataAlias()
     * @generated
     */
    EClass INTERACTOR_DATA_ALIAS = eINSTANCE.getInteractorDataAlias();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_DATA_ALIAS__ENTITY = eINSTANCE.getInteractorDataAlias_Entity();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_DATA_ALIAS__ALIAS = eINSTANCE.getInteractorDataAlias_Alias();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorEntityImpl <em>Interactor Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorEntityImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorEntity()
     * @generated
     */
    EClass INTERACTOR_ENTITY = eINSTANCE.getInteractorEntity();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorDataReceptionImpl <em>Interactor Data Reception</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorDataReceptionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorDataReception()
     * @generated
     */
    EClass INTERACTOR_DATA_RECEPTION = eINSTANCE.getInteractorDataReception();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorDataEmissionImpl <em>Interactor Data Emission</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorDataEmissionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorDataEmission()
     * @generated
     */
    EClass INTERACTOR_DATA_EMISSION = eINSTANCE.getInteractorDataEmission();

    /**
     * The meta object literal for the '<em><b>Data</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_DATA_EMISSION__DATA = eINSTANCE.getInteractorDataEmission_Data();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorBehaviorDeclarationImpl <em>Interactor Behavior Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorBehaviorDeclarationImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorBehaviorDeclaration()
     * @generated
     */
    EClass INTERACTOR_BEHAVIOR_DECLARATION = eINSTANCE.getInteractorBehaviorDeclaration();

    /**
     * The meta object literal for the '<em><b>Cause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_BEHAVIOR_DECLARATION__CAUSE = eINSTANCE.getInteractorBehaviorDeclaration_Cause();

    /**
     * The meta object literal for the '<em><b>Effect</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_BEHAVIOR_DECLARATION__EFFECT = eINSTANCE.getInteractorBehaviorDeclaration_Effect();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorBehaviorCauseImpl <em>Interactor Behavior Cause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorBehaviorCauseImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorBehaviorCause()
     * @generated
     */
    EClass INTERACTOR_BEHAVIOR_CAUSE = eINSTANCE.getInteractorBehaviorCause();

    /**
     * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_BEHAVIOR_CAUSE__GUARD = eINSTANCE.getInteractorBehaviorCause_Guard();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorBehaviorEffectImpl <em>Interactor Behavior Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorBehaviorEffectImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorBehaviorEffect()
     * @generated
     */
    EClass INTERACTOR_BEHAVIOR_EFFECT = eINSTANCE.getInteractorBehaviorEffect();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_BEHAVIOR_EFFECT__TARGET = eINSTANCE.getInteractorBehaviorEffect_Target();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_BEHAVIOR_EFFECT__VALUE = eINSTANCE.getInteractorBehaviorEffect_Value();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.ExpressionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.ExpressionLiteralCollectionImpl <em>Expression Literal Collection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.ExpressionLiteralCollectionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getExpressionLiteralCollection()
     * @generated
     */
    EClass EXPRESSION_LITERAL_COLLECTION = eINSTANCE.getExpressionLiteralCollection();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_LITERAL_COLLECTION__ELEMENTS = eINSTANCE.getExpressionLiteralCollection_Elements();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.ExpressionLiteralSetImpl <em>Expression Literal Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.ExpressionLiteralSetImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getExpressionLiteralSet()
     * @generated
     */
    EClass EXPRESSION_LITERAL_SET = eINSTANCE.getExpressionLiteralSet();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.ExpressionLiteralListImpl <em>Expression Literal List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.ExpressionLiteralListImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getExpressionLiteralList()
     * @generated
     */
    EClass EXPRESSION_LITERAL_LIST = eINSTANCE.getExpressionLiteralList();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.ExpressionCaseImpl <em>Expression Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.ExpressionCaseImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getExpressionCase()
     * @generated
     */
    EClass EXPRESSION_CASE = eINSTANCE.getExpressionCase();

    /**
     * The meta object literal for the '<em><b>Case</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_CASE__CASE = eINSTANCE.getExpressionCase_Case();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_CASE__THEN = eINSTANCE.getExpressionCase_Then();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.ActorTypeInputImpl <em>Actor Type Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.ActorTypeInputImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getActorTypeInput()
     * @generated
     */
    EClass ACTOR_TYPE_INPUT = eINSTANCE.getActorTypeInput();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.ActorTypeOutputImpl <em>Actor Type Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.ActorTypeOutputImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getActorTypeOutput()
     * @generated
     */
    EClass ACTOR_TYPE_OUTPUT = eINSTANCE.getActorTypeOutput();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.ActorTypeCustomImpl <em>Actor Type Custom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.ActorTypeCustomImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getActorTypeCustom()
     * @generated
     */
    EClass ACTOR_TYPE_CUSTOM = eINSTANCE.getActorTypeCustom();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTOR_TYPE_CUSTOM__DEFINITION = eINSTANCE.getActorTypeCustom_Definition();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeDefinitionCompoundImpl <em>Data Type Definition Compound</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeDefinitionCompoundImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeDefinitionCompound()
     * @generated
     */
    EClass DATA_TYPE_DEFINITION_COMPOUND = eINSTANCE.getDataTypeDefinitionCompound();

    /**
     * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_DEFINITION_COMPOUND__COMPONENT = eINSTANCE.getDataTypeDefinitionCompound_Component();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeDefinitionAliasImpl <em>Data Type Definition Alias</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeDefinitionAliasImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeDefinitionAlias()
     * @generated
     */
    EClass DATA_TYPE_DEFINITION_ALIAS = eINSTANCE.getDataTypeDefinitionAlias();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_DEFINITION_ALIAS__ALIAS = eINSTANCE.getDataTypeDefinitionAlias_Alias();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeVoidImpl <em>Data Type Void</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeVoidImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeVoid()
     * @generated
     */
    EClass DATA_TYPE_VOID = eINSTANCE.getDataTypeVoid();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeSymbolImpl <em>Data Type Symbol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeSymbolImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeSymbol()
     * @generated
     */
    EClass DATA_TYPE_SYMBOL = eINSTANCE.getDataTypeSymbol();

    /**
     * The meta object literal for the '<em><b>Definition Set</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_SYMBOL__DEFINITION_SET = eINSTANCE.getDataTypeSymbol_DefinitionSet();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeNumberImpl <em>Data Type Number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeNumberImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeNumber()
     * @generated
     */
    EClass DATA_TYPE_NUMBER = eINSTANCE.getDataTypeNumber();

    /**
     * The meta object literal for the '<em><b>Definition Set</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_NUMBER__DEFINITION_SET = eINSTANCE.getDataTypeNumber_DefinitionSet();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeTextImpl <em>Data Type Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeTextImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeText()
     * @generated
     */
    EClass DATA_TYPE_TEXT = eINSTANCE.getDataTypeText();

    /**
     * The meta object literal for the '<em><b>Definition Set</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_TEXT__DEFINITION_SET = eINSTANCE.getDataTypeText_DefinitionSet();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeTimeImpl <em>Data Type Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeTimeImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeTime()
     * @generated
     */
    EClass DATA_TYPE_TIME = eINSTANCE.getDataTypeTime();

    /**
     * The meta object literal for the '<em><b>Definition Set</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_TIME__DEFINITION_SET = eINSTANCE.getDataTypeTime_DefinitionSet();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeIdentifierImpl <em>Data Type Identifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeIdentifierImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeIdentifier()
     * @generated
     */
    EClass DATA_TYPE_IDENTIFIER = eINSTANCE.getDataTypeIdentifier();

    /**
     * The meta object literal for the '<em><b>Definition Set</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_IDENTIFIER__DEFINITION_SET = eINSTANCE.getDataTypeIdentifier_DefinitionSet();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeCustomImpl <em>Data Type Custom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeCustomImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeCustom()
     * @generated
     */
    EClass DATA_TYPE_CUSTOM = eINSTANCE.getDataTypeCustom();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_CUSTOM__DEFINITION = eINSTANCE.getDataTypeCustom_Definition();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeCollectionImpl <em>Data Type Collection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeCollectionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeCollection()
     * @generated
     */
    EClass DATA_TYPE_COLLECTION = eINSTANCE.getDataTypeCollection();

    /**
     * The meta object literal for the '<em><b>Element Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_COLLECTION__ELEMENT_TYPE = eINSTANCE.getDataTypeCollection_ElementType();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeSetImpl <em>Data Type Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeSetImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeSet()
     * @generated
     */
    EClass DATA_TYPE_SET = eINSTANCE.getDataTypeSet();

    /**
     * The meta object literal for the '<em><b>Element Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_SET__ELEMENT_TYPE = eINSTANCE.getDataTypeSet_ElementType();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeListImpl <em>Data Type List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeListImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeList()
     * @generated
     */
    EClass DATA_TYPE_LIST = eINSTANCE.getDataTypeList();

    /**
     * The meta object literal for the '<em><b>Element Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_LIST__ELEMENT_TYPE = eINSTANCE.getDataTypeList_ElementType();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeQueueImpl <em>Data Type Queue</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeQueueImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeQueue()
     * @generated
     */
    EClass DATA_TYPE_QUEUE = eINSTANCE.getDataTypeQueue();

    /**
     * The meta object literal for the '<em><b>Element Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_QUEUE__ELEMENT_TYPE = eINSTANCE.getDataTypeQueue_ElementType();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeNumberDefinitionSetSetImpl <em>Data Type Number Definition Set Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeNumberDefinitionSetSetImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeNumberDefinitionSetSet()
     * @generated
     */
    EClass DATA_TYPE_NUMBER_DEFINITION_SET_SET = eINSTANCE.getDataTypeNumberDefinitionSetSet();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_NUMBER_DEFINITION_SET_SET__ELEMENT = eINSTANCE.getDataTypeNumberDefinitionSetSet_Element();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeNumberDefinitionSetIntervalImpl <em>Data Type Number Definition Set Interval</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeNumberDefinitionSetIntervalImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeNumberDefinitionSetInterval()
     * @generated
     */
    EClass DATA_TYPE_NUMBER_DEFINITION_SET_INTERVAL = eINSTANCE.getDataTypeNumberDefinitionSetInterval();

    /**
     * The meta object literal for the '<em><b>Inf</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_NUMBER_DEFINITION_SET_INTERVAL__INF = eINSTANCE.getDataTypeNumberDefinitionSetInterval_Inf();

    /**
     * The meta object literal for the '<em><b>Sup</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_NUMBER_DEFINITION_SET_INTERVAL__SUP = eINSTANCE.getDataTypeNumberDefinitionSetInterval_Sup();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeTextDefinitionSetSetImpl <em>Data Type Text Definition Set Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeTextDefinitionSetSetImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeTextDefinitionSetSet()
     * @generated
     */
    EClass DATA_TYPE_TEXT_DEFINITION_SET_SET = eINSTANCE.getDataTypeTextDefinitionSetSet();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_TEXT_DEFINITION_SET_SET__ELEMENT = eINSTANCE.getDataTypeTextDefinitionSetSet_Element();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeTimeDefinitionSetSetImpl <em>Data Type Time Definition Set Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeTimeDefinitionSetSetImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeTimeDefinitionSetSet()
     * @generated
     */
    EClass DATA_TYPE_TIME_DEFINITION_SET_SET = eINSTANCE.getDataTypeTimeDefinitionSetSet();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_TIME_DEFINITION_SET_SET__ELEMENT = eINSTANCE.getDataTypeTimeDefinitionSetSet_Element();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeTimeDefinitionSetIntervalImpl <em>Data Type Time Definition Set Interval</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeTimeDefinitionSetIntervalImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeTimeDefinitionSetInterval()
     * @generated
     */
    EClass DATA_TYPE_TIME_DEFINITION_SET_INTERVAL = eINSTANCE.getDataTypeTimeDefinitionSetInterval();

    /**
     * The meta object literal for the '<em><b>Inf</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_TIME_DEFINITION_SET_INTERVAL__INF = eINSTANCE.getDataTypeTimeDefinitionSetInterval_Inf();

    /**
     * The meta object literal for the '<em><b>Sup</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_TIME_DEFINITION_SET_INTERVAL__SUP = eINSTANCE.getDataTypeTimeDefinitionSetInterval_Sup();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeIdentifierDefinitionSetSetImpl <em>Data Type Identifier Definition Set Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeIdentifierDefinitionSetSetImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeIdentifierDefinitionSetSet()
     * @generated
     */
    EClass DATA_TYPE_IDENTIFIER_DEFINITION_SET_SET = eINSTANCE.getDataTypeIdentifierDefinitionSetSet();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_IDENTIFIER_DEFINITION_SET_SET__ELEMENT = eINSTANCE.getDataTypeIdentifierDefinitionSetSet_Element();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorTypeCustomImpl <em>Interactor Type Custom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorTypeCustomImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorTypeCustom()
     * @generated
     */
    EClass INTERACTOR_TYPE_CUSTOM = eINSTANCE.getInteractorTypeCustom();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_TYPE_CUSTOM__DEFINITION = eINSTANCE.getInteractorTypeCustom_Definition();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorActorDeclarationImpl <em>Interactor Actor Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorActorDeclarationImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorActorDeclaration()
     * @generated
     */
    EClass INTERACTOR_ACTOR_DECLARATION = eINSTANCE.getInteractorActorDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_ACTOR_DECLARATION__TYPE = eINSTANCE.getInteractorActorDeclaration_Type();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorComponentDeclarationImpl <em>Interactor Component Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorComponentDeclarationImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorComponentDeclaration()
     * @generated
     */
    EClass INTERACTOR_COMPONENT_DECLARATION = eINSTANCE.getInteractorComponentDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_COMPONENT_DECLARATION__TYPE = eINSTANCE.getInteractorComponentDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_COMPONENT_DECLARATION__ACTORS = eINSTANCE.getInteractorComponentDeclaration_Actors();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorDataDeclarationEventImpl <em>Interactor Data Declaration Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorDataDeclarationEventImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorDataDeclarationEvent()
     * @generated
     */
    EClass INTERACTOR_DATA_DECLARATION_EVENT = eINSTANCE.getInteractorDataDeclarationEvent();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_DATA_DECLARATION_EVENT__SOURCE = eINSTANCE.getInteractorDataDeclarationEvent_Source();

    /**
     * The meta object literal for the '<em><b>Destinations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_DATA_DECLARATION_EVENT__DESTINATIONS = eINSTANCE.getInteractorDataDeclarationEvent_Destinations();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorDataDeclarationFlowImpl <em>Interactor Data Declaration Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorDataDeclarationFlowImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorDataDeclarationFlow()
     * @generated
     */
    EClass INTERACTOR_DATA_DECLARATION_FLOW = eINSTANCE.getInteractorDataDeclarationFlow();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_DATA_DECLARATION_FLOW__SOURCE = eINSTANCE.getInteractorDataDeclarationFlow_Source();

    /**
     * The meta object literal for the '<em><b>Destinations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_DATA_DECLARATION_FLOW__DESTINATIONS = eINSTANCE.getInteractorDataDeclarationFlow_Destinations();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorDataDeclarationConstantImpl <em>Interactor Data Declaration Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorDataDeclarationConstantImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorDataDeclarationConstant()
     * @generated
     */
    EClass INTERACTOR_DATA_DECLARATION_CONSTANT = eINSTANCE.getInteractorDataDeclarationConstant();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorEntityAnyImpl <em>Interactor Entity Any</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorEntityAnyImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorEntityAny()
     * @generated
     */
    EClass INTERACTOR_ENTITY_ANY = eINSTANCE.getInteractorEntityAny();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorEntitySelfImpl <em>Interactor Entity Self</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorEntitySelfImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorEntitySelf()
     * @generated
     */
    EClass INTERACTOR_ENTITY_SELF = eINSTANCE.getInteractorEntitySelf();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorEntityOtherImpl <em>Interactor Entity Other</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorEntityOtherImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorEntityOther()
     * @generated
     */
    EClass INTERACTOR_ENTITY_OTHER = eINSTANCE.getInteractorEntityOther();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorEntityParentImpl <em>Interactor Entity Parent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorEntityParentImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorEntityParent()
     * @generated
     */
    EClass INTERACTOR_ENTITY_PARENT = eINSTANCE.getInteractorEntityParent();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorEntityChildImpl <em>Interactor Entity Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorEntityChildImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorEntityChild()
     * @generated
     */
    EClass INTERACTOR_ENTITY_CHILD = eINSTANCE.getInteractorEntityChild();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorEntityAllImpl <em>Interactor Entity All</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorEntityAllImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorEntityAll()
     * @generated
     */
    EClass INTERACTOR_ENTITY_ALL = eINSTANCE.getInteractorEntityAll();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorEntityActorsImpl <em>Interactor Entity Actors</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorEntityActorsImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorEntityActors()
     * @generated
     */
    EClass INTERACTOR_ENTITY_ACTORS = eINSTANCE.getInteractorEntityActors();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorEntitySpecificImpl <em>Interactor Entity Specific</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorEntitySpecificImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorEntitySpecific()
     * @generated
     */
    EClass INTERACTOR_ENTITY_SPECIFIC = eINSTANCE.getInteractorEntitySpecific();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_ENTITY_SPECIFIC__ENTITY = eINSTANCE.getInteractorEntitySpecific_Entity();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorDataReceptionInternalImpl <em>Interactor Data Reception Internal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorDataReceptionInternalImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorDataReceptionInternal()
     * @generated
     */
    EClass INTERACTOR_DATA_RECEPTION_INTERNAL = eINSTANCE.getInteractorDataReceptionInternal();

    /**
     * The meta object literal for the '<em><b>Data</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_DATA_RECEPTION_INTERNAL__DATA = eINSTANCE.getInteractorDataReceptionInternal_Data();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorDataReceptionExternalImpl <em>Interactor Data Reception External</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorDataReceptionExternalImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorDataReceptionExternal()
     * @generated
     */
    EClass INTERACTOR_DATA_RECEPTION_EXTERNAL = eINSTANCE.getInteractorDataReceptionExternal();

    /**
     * The meta object literal for the '<em><b>Data</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_DATA_RECEPTION_EXTERNAL__DATA = eINSTANCE.getInteractorDataReceptionExternal_Data();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_DATA_RECEPTION_EXTERNAL__SOURCE = eINSTANCE.getInteractorDataReceptionExternal_Source();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorDataReceptionInitImpl <em>Interactor Data Reception Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorDataReceptionInitImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorDataReceptionInit()
     * @generated
     */
    EClass INTERACTOR_DATA_RECEPTION_INIT = eINSTANCE.getInteractorDataReceptionInit();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorDataEmissionInternalImpl <em>Interactor Data Emission Internal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorDataEmissionInternalImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorDataEmissionInternal()
     * @generated
     */
    EClass INTERACTOR_DATA_EMISSION_INTERNAL = eINSTANCE.getInteractorDataEmissionInternal();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorDataEmissionExternalImpl <em>Interactor Data Emission External</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorDataEmissionExternalImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorDataEmissionExternal()
     * @generated
     */
    EClass INTERACTOR_DATA_EMISSION_EXTERNAL = eINSTANCE.getInteractorDataEmissionExternal();

    /**
     * The meta object literal for the '<em><b>Destination</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_DATA_EMISSION_EXTERNAL__DESTINATION = eINSTANCE.getInteractorDataEmissionExternal_Destination();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorBehaviorCauseOnImpl <em>Interactor Behavior Cause On</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorBehaviorCauseOnImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorBehaviorCauseOn()
     * @generated
     */
    EClass INTERACTOR_BEHAVIOR_CAUSE_ON = eINSTANCE.getInteractorBehaviorCauseOn();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_BEHAVIOR_CAUSE_ON__EVENT = eINSTANCE.getInteractorBehaviorCauseOn_Event();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorBehaviorCauseWhenImpl <em>Interactor Behavior Cause When</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorBehaviorCauseWhenImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorBehaviorCauseWhen()
     * @generated
     */
    EClass INTERACTOR_BEHAVIOR_CAUSE_WHEN = eINSTANCE.getInteractorBehaviorCauseWhen();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_BEHAVIOR_CAUSE_WHEN__CONDITION = eINSTANCE.getInteractorBehaviorCauseWhen_Condition();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorBehaviorEffectAlwaysImpl <em>Interactor Behavior Effect Always</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorBehaviorEffectAlwaysImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorBehaviorEffectAlways()
     * @generated
     */
    EClass INTERACTOR_BEHAVIOR_EFFECT_ALWAYS = eINSTANCE.getInteractorBehaviorEffectAlways();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorBehaviorEffectSetImpl <em>Interactor Behavior Effect Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorBehaviorEffectSetImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorBehaviorEffectSet()
     * @generated
     */
    EClass INTERACTOR_BEHAVIOR_EFFECT_SET = eINSTANCE.getInteractorBehaviorEffectSet();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorBehaviorEffectTriggerImpl <em>Interactor Behavior Effect Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorBehaviorEffectTriggerImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorBehaviorEffectTrigger()
     * @generated
     */
    EClass INTERACTOR_BEHAVIOR_EFFECT_TRIGGER = eINSTANCE.getInteractorBehaviorEffectTrigger();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.ExpressionBinaryOperationImpl <em>Expression Binary Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.ExpressionBinaryOperationImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getExpressionBinaryOperation()
     * @generated
     */
    EClass EXPRESSION_BINARY_OPERATION = eINSTANCE.getExpressionBinaryOperation();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_BINARY_OPERATION__LEFT_OPERAND = eINSTANCE.getExpressionBinaryOperation_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_BINARY_OPERATION__FEATURE = eINSTANCE.getExpressionBinaryOperation_Feature();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_BINARY_OPERATION__RIGHT_OPERAND = eINSTANCE.getExpressionBinaryOperation_RightOperand();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.UnaryOperationImpl <em>Unary Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.UnaryOperationImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getUnaryOperation()
     * @generated
     */
    EClass UNARY_OPERATION = eINSTANCE.getUnaryOperation();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNARY_OPERATION__FEATURE = eINSTANCE.getUnaryOperation_Feature();

    /**
     * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_OPERATION__OPERAND = eINSTANCE.getUnaryOperation_Operand();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.ExpressionIfImpl <em>Expression If</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.ExpressionIfImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getExpressionIf()
     * @generated
     */
    EClass EXPRESSION_IF = eINSTANCE.getExpressionIf();

    /**
     * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_IF__IF = eINSTANCE.getExpressionIf_If();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_IF__THEN = eINSTANCE.getExpressionIf_Then();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_IF__ELSE = eINSTANCE.getExpressionIf_Else();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.ExpressionSwitchImpl <em>Expression Switch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.ExpressionSwitchImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getExpressionSwitch()
     * @generated
     */
    EClass EXPRESSION_SWITCH = eINSTANCE.getExpressionSwitch();

    /**
     * The meta object literal for the '<em><b>Switch</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_SWITCH__SWITCH = eINSTANCE.getExpressionSwitch_Switch();

    /**
     * The meta object literal for the '<em><b>Case</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_SWITCH__CASE = eINSTANCE.getExpressionSwitch_Case();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_SWITCH__DEFAULT = eINSTANCE.getExpressionSwitch_Default();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.ExpressionForEachImpl <em>Expression For Each</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.ExpressionForEachImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getExpressionForEach()
     * @generated
     */
    EClass EXPRESSION_FOR_EACH = eINSTANCE.getExpressionForEach();

    /**
     * The meta object literal for the '<em><b>For Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_FOR_EACH__FOR_EXPRESSION = eINSTANCE.getExpressionForEach_ForExpression();

    /**
     * The meta object literal for the '<em><b>Each Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_FOR_EACH__EACH_EXPRESSION = eINSTANCE.getExpressionForEach_EachExpression();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.ExpressionFunctionCallImpl <em>Expression Function Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.ExpressionFunctionCallImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getExpressionFunctionCall()
     * @generated
     */
    EClass EXPRESSION_FUNCTION_CALL = eINSTANCE.getExpressionFunctionCall();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_FUNCTION_CALL__FUNCTION = eINSTANCE.getExpressionFunctionCall_Function();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_FUNCTION_CALL__ARGUMENTS = eINSTANCE.getExpressionFunctionCall_Arguments();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.LiteralBooleanImpl <em>Literal Boolean</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.LiteralBooleanImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getLiteralBoolean()
     * @generated
     */
    EClass LITERAL_BOOLEAN = eINSTANCE.getLiteralBoolean();

    /**
     * The meta object literal for the '<em><b>Is True</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL_BOOLEAN__IS_TRUE = eINSTANCE.getLiteralBoolean_IsTrue();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.LiteralNullImpl <em>Literal Null</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.LiteralNullImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getLiteralNull()
     * @generated
     */
    EClass LITERAL_NULL = eINSTANCE.getLiteralNull();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.LiteralNumberImpl <em>Literal Number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.LiteralNumberImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getLiteralNumber()
     * @generated
     */
    EClass LITERAL_NUMBER = eINSTANCE.getLiteralNumber();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL_NUMBER__VALUE = eINSTANCE.getLiteralNumber_Value();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.LiteralTextImpl <em>Literal Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.LiteralTextImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getLiteralText()
     * @generated
     */
    EClass LITERAL_TEXT = eINSTANCE.getLiteralText();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL_TEXT__VALUE = eINSTANCE.getLiteralText_Value();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.LiteralEnumImpl <em>Literal Enum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.LiteralEnumImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getLiteralEnum()
     * @generated
     */
    EClass LITERAL_ENUM = eINSTANCE.getLiteralEnum();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LITERAL_ENUM__VALUE = eINSTANCE.getLiteralEnum_Value();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.LiteralTimeNowImpl <em>Literal Time Now</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.LiteralTimeNowImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getLiteralTimeNow()
     * @generated
     */
    EClass LITERAL_TIME_NOW = eINSTANCE.getLiteralTimeNow();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.LiteralTimeImpl <em>Literal Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.LiteralTimeImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getLiteralTime()
     * @generated
     */
    EClass LITERAL_TIME = eINSTANCE.getLiteralTime();

    /**
     * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL_TIME__YEAR = eINSTANCE.getLiteralTime_Year();

    /**
     * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL_TIME__MONTH = eINSTANCE.getLiteralTime_Month();

    /**
     * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL_TIME__DAY = eINSTANCE.getLiteralTime_Day();

    /**
     * The meta object literal for the '<em><b>Hour</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL_TIME__HOUR = eINSTANCE.getLiteralTime_Hour();

    /**
     * The meta object literal for the '<em><b>Minute</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL_TIME__MINUTE = eINSTANCE.getLiteralTime_Minute();

    /**
     * The meta object literal for the '<em><b>Second</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL_TIME__SECOND = eINSTANCE.getLiteralTime_Second();

  }

} //LilPackage
