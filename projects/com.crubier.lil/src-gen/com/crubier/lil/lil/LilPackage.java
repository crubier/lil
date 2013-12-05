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
   * The feature id for the '<em><b>Actor Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIL_MODEL__ACTOR_TYPE = 0;

  /**
   * The feature id for the '<em><b>Data Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIL_MODEL__DATA_TYPE = 1;

  /**
   * The feature id for the '<em><b>Interactor Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIL_MODEL__INTERACTOR_TYPE = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIL_MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ActorTypeDefinitionImpl <em>Actor Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ActorTypeDefinitionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getActorTypeDefinition()
   * @generated
   */
  int ACTOR_TYPE_DEFINITION = 1;

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
  int ACTOR_TYPE = 2;

  /**
   * The feature id for the '<em><b>Base</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_TYPE__BASE = 0;

  /**
   * The feature id for the '<em><b>Custom</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_TYPE__CUSTOM = 1;

  /**
   * The number of structural features of the '<em>Actor Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ActorComponentImpl <em>Actor Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ActorComponentImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getActorComponent()
   * @generated
   */
  int ACTOR_COMPONENT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_COMPONENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_COMPONENT__TYPE = 1;

  /**
   * The number of structural features of the '<em>Actor Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_COMPONENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeDefinitionImpl <em>Data Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeDefinitionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeDefinition()
   * @generated
   */
  int DATA_TYPE_DEFINITION = 4;

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
  int DATA_TYPE = 5;

  /**
   * The feature id for the '<em><b>Base</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__BASE = 0;

  /**
   * The feature id for the '<em><b>Definition Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__DEFINITION_SET = 1;

  /**
   * The feature id for the '<em><b>Custom</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__CUSTOM = 2;

  /**
   * The feature id for the '<em><b>Collection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__COLLECTION = 3;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataDefinitionSetImpl <em>Data Definition Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataDefinitionSetImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataDefinitionSet()
   * @generated
   */
  int DATA_DEFINITION_SET = 6;

  /**
   * The number of structural features of the '<em>Data Definition Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_DEFINITION_SET_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataDefinitionEnumElementImpl <em>Data Definition Enum Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataDefinitionEnumElementImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataDefinitionEnumElement()
   * @generated
   */
  int DATA_DEFINITION_ENUM_ELEMENT = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_DEFINITION_ENUM_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Data Definition Enum Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_DEFINITION_ENUM_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataCollectionTypeImpl <em>Data Collection Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataCollectionTypeImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataCollectionType()
   * @generated
   */
  int DATA_COLLECTION_TYPE = 8;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COLLECTION_TYPE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Mapping</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COLLECTION_TYPE__MAPPING = 1;

  /**
   * The number of structural features of the '<em>Data Collection Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COLLECTION_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataComponentImpl <em>Data Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataComponentImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataComponent()
   * @generated
   */
  int DATA_COMPONENT = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COMPONENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COMPONENT__TYPE = 1;

  /**
   * The number of structural features of the '<em>Data Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COMPONENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorTypeDefinitionImpl <em>Interactor Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorTypeDefinitionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorTypeDefinition()
   * @generated
   */
  int INTERACTOR_TYPE_DEFINITION = 10;

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
  int INTERACTOR_TYPE = 11;

  /**
   * The feature id for the '<em><b>Custom</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_TYPE__CUSTOM = 0;

  /**
   * The number of structural features of the '<em>Interactor Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.EntityImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = 0;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorActorImpl <em>Interactor Actor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorActorImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorActor()
   * @generated
   */
  int INTERACTOR_ACTOR = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_ACTOR__NAME = ENTITY__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_ACTOR__TYPE = ENTITY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Interactor Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_ACTOR_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorDataImpl <em>Interactor Data</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorDataImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorData()
   * @generated
   */
  int INTERACTOR_DATA = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA__TYPE = 1;

  /**
   * The feature id for the '<em><b>Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA__MODE = 2;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA__SOURCE = 3;

  /**
   * The feature id for the '<em><b>Destinations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA__DESTINATIONS = 4;

  /**
   * The number of structural features of the '<em>Interactor Data</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DATA_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorSignalAliasImpl <em>Interactor Signal Alias</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorSignalAliasImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorSignalAlias()
   * @generated
   */
  int INTERACTOR_SIGNAL_ALIAS = 14;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_SIGNAL_ALIAS__SOURCE = 0;

  /**
   * The feature id for the '<em><b>Alias</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_SIGNAL_ALIAS__ALIAS = 1;

  /**
   * The number of structural features of the '<em>Interactor Signal Alias</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_SIGNAL_ALIAS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorComponentImpl <em>Interactor Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorComponentImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorComponent()
   * @generated
   */
  int INTERACTOR_COMPONENT = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_COMPONENT__NAME = ENTITY__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_COMPONENT__TYPE = ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Actors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_COMPONENT__ACTORS = ENTITY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Interactor Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_COMPONENT_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.AccessibleEntityImpl <em>Accessible Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.AccessibleEntityImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getAccessibleEntity()
   * @generated
   */
  int ACCESSIBLE_ENTITY = 16;

  /**
   * The feature id for the '<em><b>Generic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESSIBLE_ENTITY__GENERIC = 0;

  /**
   * The feature id for the '<em><b>Specific</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESSIBLE_ENTITY__SPECIFIC = 1;

  /**
   * The number of structural features of the '<em>Accessible Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESSIBLE_ENTITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ActorAliasImpl <em>Actor Alias</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ActorAliasImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getActorAlias()
   * @generated
   */
  int ACTOR_ALIAS = 18;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_ALIAS__SOURCE = 0;

  /**
   * The feature id for the '<em><b>Alias</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_ALIAS__ALIAS = 1;

  /**
   * The number of structural features of the '<em>Actor Alias</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_ALIAS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorSignalReceptionImpl <em>Interactor Signal Reception</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorSignalReceptionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorSignalReception()
   * @generated
   */
  int INTERACTOR_SIGNAL_RECEPTION = 19;

  /**
   * The feature id for the '<em><b>Instance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_SIGNAL_RECEPTION__INSTANCE = 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_SIGNAL_RECEPTION__SOURCE = 1;

  /**
   * The feature id for the '<em><b>Init</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_SIGNAL_RECEPTION__INIT = 2;

  /**
   * The number of structural features of the '<em>Interactor Signal Reception</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_SIGNAL_RECEPTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorSignalEmissionImpl <em>Interactor Signal Emission</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorSignalEmissionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorSignalEmission()
   * @generated
   */
  int INTERACTOR_SIGNAL_EMISSION = 20;

  /**
   * The feature id for the '<em><b>Instance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_SIGNAL_EMISSION__INSTANCE = 0;

  /**
   * The feature id for the '<em><b>Destination</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_SIGNAL_EMISSION__DESTINATION = 1;

  /**
   * The number of structural features of the '<em>Interactor Signal Emission</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_SIGNAL_EMISSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorBehaviorImpl <em>Interactor Behavior</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorBehaviorImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorBehavior()
   * @generated
   */
  int INTERACTOR_BEHAVIOR = 21;

  /**
   * The feature id for the '<em><b>Cause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR__CAUSE = 0;

  /**
   * The feature id for the '<em><b>Effect</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR__EFFECT = 1;

  /**
   * The number of structural features of the '<em>Interactor Behavior</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorBehaviorCauseImpl <em>Interactor Behavior Cause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorBehaviorCauseImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorBehaviorCause()
   * @generated
   */
  int INTERACTOR_BEHAVIOR_CAUSE = 22;

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
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorBehaviorOnCauseImpl <em>Interactor Behavior On Cause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorBehaviorOnCauseImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorBehaviorOnCause()
   * @generated
   */
  int INTERACTOR_BEHAVIOR_ON_CAUSE = 23;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_ON_CAUSE__GUARD = INTERACTOR_BEHAVIOR_CAUSE__GUARD;

  /**
   * The feature id for the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_ON_CAUSE__EVENT = INTERACTOR_BEHAVIOR_CAUSE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Interactor Behavior On Cause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_ON_CAUSE_FEATURE_COUNT = INTERACTOR_BEHAVIOR_CAUSE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorBehaviorWhenCauseImpl <em>Interactor Behavior When Cause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorBehaviorWhenCauseImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorBehaviorWhenCause()
   * @generated
   */
  int INTERACTOR_BEHAVIOR_WHEN_CAUSE = 24;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_WHEN_CAUSE__GUARD = INTERACTOR_BEHAVIOR_CAUSE__GUARD;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_WHEN_CAUSE__CONDITION = INTERACTOR_BEHAVIOR_CAUSE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Interactor Behavior When Cause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_WHEN_CAUSE_FEATURE_COUNT = INTERACTOR_BEHAVIOR_CAUSE_FEATURE_COUNT + 1;

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
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorBehaviorAlwaysEffectImpl <em>Interactor Behavior Always Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorBehaviorAlwaysEffectImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorBehaviorAlwaysEffect()
   * @generated
   */
  int INTERACTOR_BEHAVIOR_ALWAYS_EFFECT = 26;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_ALWAYS_EFFECT__TARGET = INTERACTOR_BEHAVIOR_EFFECT__TARGET;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_ALWAYS_EFFECT__VALUE = INTERACTOR_BEHAVIOR_EFFECT__VALUE;

  /**
   * The number of structural features of the '<em>Interactor Behavior Always Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_ALWAYS_EFFECT_FEATURE_COUNT = INTERACTOR_BEHAVIOR_EFFECT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorBehaviorSetEffectImpl <em>Interactor Behavior Set Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorBehaviorSetEffectImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorBehaviorSetEffect()
   * @generated
   */
  int INTERACTOR_BEHAVIOR_SET_EFFECT = 27;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_SET_EFFECT__TARGET = INTERACTOR_BEHAVIOR_EFFECT__TARGET;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_SET_EFFECT__VALUE = INTERACTOR_BEHAVIOR_EFFECT__VALUE;

  /**
   * The number of structural features of the '<em>Interactor Behavior Set Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_SET_EFFECT_FEATURE_COUNT = INTERACTOR_BEHAVIOR_EFFECT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorBehaviorTriggerEffectImpl <em>Interactor Behavior Trigger Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorBehaviorTriggerEffectImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorBehaviorTriggerEffect()
   * @generated
   */
  int INTERACTOR_BEHAVIOR_TRIGGER_EFFECT = 28;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_TRIGGER_EFFECT__TARGET = INTERACTOR_BEHAVIOR_EFFECT__TARGET;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_TRIGGER_EFFECT__VALUE = INTERACTOR_BEHAVIOR_EFFECT__VALUE;

  /**
   * The number of structural features of the '<em>Interactor Behavior Trigger Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_BEHAVIOR_TRIGGER_EFFECT_FEATURE_COUNT = INTERACTOR_BEHAVIOR_EFFECT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ExpressionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 29;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ExpressionLiteralCollectionImpl <em>Expression Literal Collection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ExpressionLiteralCollectionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getExpressionLiteralCollection()
   * @generated
   */
  int EXPRESSION_LITERAL_COLLECTION = 30;

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
  int EXPRESSION_LITERAL_SET = 31;

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
  int EXPRESSION_LITERAL_LIST = 32;

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
  int EXPRESSION_CASE = 33;

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
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataDefinitionSetEnumImpl <em>Data Definition Set Enum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataDefinitionSetEnumImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataDefinitionSetEnum()
   * @generated
   */
  int DATA_DEFINITION_SET_ENUM = 36;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_DEFINITION_SET_ENUM__ELEMENT = DATA_DEFINITION_SET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Definition Set Enum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_DEFINITION_SET_ENUM_FEATURE_COUNT = DATA_DEFINITION_SET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataDefinitionSetNumberImpl <em>Data Definition Set Number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataDefinitionSetNumberImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataDefinitionSetNumber()
   * @generated
   */
  int DATA_DEFINITION_SET_NUMBER = 37;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_DEFINITION_SET_NUMBER__ELEMENT = DATA_DEFINITION_SET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Definition Set Number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_DEFINITION_SET_NUMBER_FEATURE_COUNT = DATA_DEFINITION_SET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataDefinitionSetIntervalImpl <em>Data Definition Set Interval</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataDefinitionSetIntervalImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataDefinitionSetInterval()
   * @generated
   */
  int DATA_DEFINITION_SET_INTERVAL = 38;

  /**
   * The feature id for the '<em><b>Inf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_DEFINITION_SET_INTERVAL__INF = DATA_DEFINITION_SET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sup</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_DEFINITION_SET_INTERVAL__SUP = DATA_DEFINITION_SET_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data Definition Set Interval</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_DEFINITION_SET_INTERVAL_FEATURE_COUNT = DATA_DEFINITION_SET_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ExpressionBinaryOperationImpl <em>Expression Binary Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ExpressionBinaryOperationImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getExpressionBinaryOperation()
   * @generated
   */
  int EXPRESSION_BINARY_OPERATION = 39;

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
  int UNARY_OPERATION = 40;

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
   * The meta object id for the '{@link com.crubier.lil.lil.impl.LiteralDataImpl <em>Literal Data</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.LiteralDataImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getLiteralData()
   * @generated
   */
  int LITERAL_DATA = 41;

  /**
   * The feature id for the '<em><b>Data</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_DATA__DATA = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Literal Data</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_DATA_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ExpressionIfImpl <em>Expression If</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ExpressionIfImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getExpressionIf()
   * @generated
   */
  int EXPRESSION_IF = 42;

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
  int EXPRESSION_SWITCH = 43;

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
  int EXPRESSION_FOR_EACH = 44;

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
  int EXPRESSION_FUNCTION_CALL = 45;

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
  int LITERAL_BOOLEAN = 46;

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
  int LITERAL_NULL = 47;

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
  int LITERAL_NUMBER = 48;

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
   * The meta object id for the '{@link com.crubier.lil.lil.impl.LiteralStringImpl <em>Literal String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.LiteralStringImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getLiteralString()
   * @generated
   */
  int LITERAL_STRING = 49;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_STRING__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Literal String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_STRING_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.LiteralEnumImpl <em>Literal Enum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.LiteralEnumImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getLiteralEnum()
   * @generated
   */
  int LITERAL_ENUM = 50;

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
   * The meta object id for the '{@link com.crubier.lil.lil.impl.LiteralTimeImpl <em>Literal Time</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.LiteralTimeImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getLiteralTime()
   * @generated
   */
  int LITERAL_TIME = 51;

  /**
   * The feature id for the '<em><b>Now</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_TIME__NOW = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Year</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_TIME__YEAR = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Month</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_TIME__MONTH = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Day</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_TIME__DAY = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Hour</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_TIME__HOUR = EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Minute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_TIME__MINUTE = EXPRESSION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Second</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_TIME__SECOND = EXPRESSION_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Literal Time</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_TIME_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 7;


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
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.ActorType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base</em>'.
   * @see com.crubier.lil.lil.ActorType#getBase()
   * @see #getActorType()
   * @generated
   */
  EAttribute getActorType_Base();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.ActorType#getCustom <em>Custom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Custom</em>'.
   * @see com.crubier.lil.lil.ActorType#getCustom()
   * @see #getActorType()
   * @generated
   */
  EReference getActorType_Custom();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.ActorComponent <em>Actor Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actor Component</em>'.
   * @see com.crubier.lil.lil.ActorComponent
   * @generated
   */
  EClass getActorComponent();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.ActorComponent#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.crubier.lil.lil.ActorComponent#getName()
   * @see #getActorComponent()
   * @generated
   */
  EAttribute getActorComponent_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.ActorComponent#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.crubier.lil.lil.ActorComponent#getType()
   * @see #getActorComponent()
   * @generated
   */
  EReference getActorComponent_Type();

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
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.DataType#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base</em>'.
   * @see com.crubier.lil.lil.DataType#getBase()
   * @see #getDataType()
   * @generated
   */
  EAttribute getDataType_Base();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.DataType#getDefinitionSet <em>Definition Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Definition Set</em>'.
   * @see com.crubier.lil.lil.DataType#getDefinitionSet()
   * @see #getDataType()
   * @generated
   */
  EReference getDataType_DefinitionSet();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.DataType#getCustom <em>Custom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Custom</em>'.
   * @see com.crubier.lil.lil.DataType#getCustom()
   * @see #getDataType()
   * @generated
   */
  EReference getDataType_Custom();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.DataType#getCollection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Collection</em>'.
   * @see com.crubier.lil.lil.DataType#getCollection()
   * @see #getDataType()
   * @generated
   */
  EReference getDataType_Collection();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataDefinitionSet <em>Data Definition Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Definition Set</em>'.
   * @see com.crubier.lil.lil.DataDefinitionSet
   * @generated
   */
  EClass getDataDefinitionSet();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataDefinitionEnumElement <em>Data Definition Enum Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Definition Enum Element</em>'.
   * @see com.crubier.lil.lil.DataDefinitionEnumElement
   * @generated
   */
  EClass getDataDefinitionEnumElement();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.DataDefinitionEnumElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.crubier.lil.lil.DataDefinitionEnumElement#getName()
   * @see #getDataDefinitionEnumElement()
   * @generated
   */
  EAttribute getDataDefinitionEnumElement_Name();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataCollectionType <em>Data Collection Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Collection Type</em>'.
   * @see com.crubier.lil.lil.DataCollectionType
   * @generated
   */
  EClass getDataCollectionType();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.DataCollectionType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.crubier.lil.lil.DataCollectionType#getType()
   * @see #getDataCollectionType()
   * @generated
   */
  EAttribute getDataCollectionType_Type();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.DataCollectionType#getMapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mapping</em>'.
   * @see com.crubier.lil.lil.DataCollectionType#getMapping()
   * @see #getDataCollectionType()
   * @generated
   */
  EReference getDataCollectionType_Mapping();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataComponent <em>Data Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Component</em>'.
   * @see com.crubier.lil.lil.DataComponent
   * @generated
   */
  EClass getDataComponent();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.DataComponent#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.crubier.lil.lil.DataComponent#getName()
   * @see #getDataComponent()
   * @generated
   */
  EAttribute getDataComponent_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.DataComponent#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.crubier.lil.lil.DataComponent#getType()
   * @see #getDataComponent()
   * @generated
   */
  EReference getDataComponent_Type();

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
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.InteractorType#getCustom <em>Custom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Custom</em>'.
   * @see com.crubier.lil.lil.InteractorType#getCustom()
   * @see #getInteractorType()
   * @generated
   */
  EReference getInteractorType_Custom();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorActor <em>Interactor Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Actor</em>'.
   * @see com.crubier.lil.lil.InteractorActor
   * @generated
   */
  EClass getInteractorActor();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.InteractorActor#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.crubier.lil.lil.InteractorActor#getType()
   * @see #getInteractorActor()
   * @generated
   */
  EReference getInteractorActor_Type();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorData <em>Interactor Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Data</em>'.
   * @see com.crubier.lil.lil.InteractorData
   * @generated
   */
  EClass getInteractorData();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.InteractorData#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.crubier.lil.lil.InteractorData#getName()
   * @see #getInteractorData()
   * @generated
   */
  EAttribute getInteractorData_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.InteractorData#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.crubier.lil.lil.InteractorData#getType()
   * @see #getInteractorData()
   * @generated
   */
  EReference getInteractorData_Type();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.InteractorData#getMode <em>Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mode</em>'.
   * @see com.crubier.lil.lil.InteractorData#getMode()
   * @see #getInteractorData()
   * @generated
   */
  EAttribute getInteractorData_Mode();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.InteractorData#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see com.crubier.lil.lil.InteractorData#getSource()
   * @see #getInteractorData()
   * @generated
   */
  EReference getInteractorData_Source();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.InteractorData#getDestinations <em>Destinations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Destinations</em>'.
   * @see com.crubier.lil.lil.InteractorData#getDestinations()
   * @see #getInteractorData()
   * @generated
   */
  EReference getInteractorData_Destinations();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorSignalAlias <em>Interactor Signal Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Signal Alias</em>'.
   * @see com.crubier.lil.lil.InteractorSignalAlias
   * @generated
   */
  EClass getInteractorSignalAlias();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.InteractorSignalAlias#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see com.crubier.lil.lil.InteractorSignalAlias#getSource()
   * @see #getInteractorSignalAlias()
   * @generated
   */
  EReference getInteractorSignalAlias_Source();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.InteractorSignalAlias#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Alias</em>'.
   * @see com.crubier.lil.lil.InteractorSignalAlias#getAlias()
   * @see #getInteractorSignalAlias()
   * @generated
   */
  EReference getInteractorSignalAlias_Alias();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorComponent <em>Interactor Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Component</em>'.
   * @see com.crubier.lil.lil.InteractorComponent
   * @generated
   */
  EClass getInteractorComponent();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.InteractorComponent#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.crubier.lil.lil.InteractorComponent#getType()
   * @see #getInteractorComponent()
   * @generated
   */
  EReference getInteractorComponent_Type();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.InteractorComponent#getActors <em>Actors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actors</em>'.
   * @see com.crubier.lil.lil.InteractorComponent#getActors()
   * @see #getInteractorComponent()
   * @generated
   */
  EReference getInteractorComponent_Actors();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.AccessibleEntity <em>Accessible Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Accessible Entity</em>'.
   * @see com.crubier.lil.lil.AccessibleEntity
   * @generated
   */
  EClass getAccessibleEntity();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.AccessibleEntity#getGeneric <em>Generic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Generic</em>'.
   * @see com.crubier.lil.lil.AccessibleEntity#getGeneric()
   * @see #getAccessibleEntity()
   * @generated
   */
  EAttribute getAccessibleEntity_Generic();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.AccessibleEntity#getSpecific <em>Specific</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Specific</em>'.
   * @see com.crubier.lil.lil.AccessibleEntity#getSpecific()
   * @see #getAccessibleEntity()
   * @generated
   */
  EReference getAccessibleEntity_Specific();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see com.crubier.lil.lil.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.crubier.lil.lil.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.ActorAlias <em>Actor Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actor Alias</em>'.
   * @see com.crubier.lil.lil.ActorAlias
   * @generated
   */
  EClass getActorAlias();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.ActorAlias#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see com.crubier.lil.lil.ActorAlias#getSource()
   * @see #getActorAlias()
   * @generated
   */
  EReference getActorAlias_Source();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.ActorAlias#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Alias</em>'.
   * @see com.crubier.lil.lil.ActorAlias#getAlias()
   * @see #getActorAlias()
   * @generated
   */
  EReference getActorAlias_Alias();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorSignalReception <em>Interactor Signal Reception</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Signal Reception</em>'.
   * @see com.crubier.lil.lil.InteractorSignalReception
   * @generated
   */
  EClass getInteractorSignalReception();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.InteractorSignalReception#getInstance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Instance</em>'.
   * @see com.crubier.lil.lil.InteractorSignalReception#getInstance()
   * @see #getInteractorSignalReception()
   * @generated
   */
  EReference getInteractorSignalReception_Instance();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.InteractorSignalReception#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see com.crubier.lil.lil.InteractorSignalReception#getSource()
   * @see #getInteractorSignalReception()
   * @generated
   */
  EReference getInteractorSignalReception_Source();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.InteractorSignalReception#isInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Init</em>'.
   * @see com.crubier.lil.lil.InteractorSignalReception#isInit()
   * @see #getInteractorSignalReception()
   * @generated
   */
  EAttribute getInteractorSignalReception_Init();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorSignalEmission <em>Interactor Signal Emission</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Signal Emission</em>'.
   * @see com.crubier.lil.lil.InteractorSignalEmission
   * @generated
   */
  EClass getInteractorSignalEmission();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.InteractorSignalEmission#getInstance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Instance</em>'.
   * @see com.crubier.lil.lil.InteractorSignalEmission#getInstance()
   * @see #getInteractorSignalEmission()
   * @generated
   */
  EReference getInteractorSignalEmission_Instance();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.InteractorSignalEmission#getDestination <em>Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Destination</em>'.
   * @see com.crubier.lil.lil.InteractorSignalEmission#getDestination()
   * @see #getInteractorSignalEmission()
   * @generated
   */
  EReference getInteractorSignalEmission_Destination();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorBehavior <em>Interactor Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Behavior</em>'.
   * @see com.crubier.lil.lil.InteractorBehavior
   * @generated
   */
  EClass getInteractorBehavior();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.InteractorBehavior#getCause <em>Cause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cause</em>'.
   * @see com.crubier.lil.lil.InteractorBehavior#getCause()
   * @see #getInteractorBehavior()
   * @generated
   */
  EReference getInteractorBehavior_Cause();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.InteractorBehavior#getEffect <em>Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Effect</em>'.
   * @see com.crubier.lil.lil.InteractorBehavior#getEffect()
   * @see #getInteractorBehavior()
   * @generated
   */
  EReference getInteractorBehavior_Effect();

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
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorBehaviorOnCause <em>Interactor Behavior On Cause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Behavior On Cause</em>'.
   * @see com.crubier.lil.lil.InteractorBehaviorOnCause
   * @generated
   */
  EClass getInteractorBehaviorOnCause();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.InteractorBehaviorOnCause#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Event</em>'.
   * @see com.crubier.lil.lil.InteractorBehaviorOnCause#getEvent()
   * @see #getInteractorBehaviorOnCause()
   * @generated
   */
  EReference getInteractorBehaviorOnCause_Event();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorBehaviorWhenCause <em>Interactor Behavior When Cause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Behavior When Cause</em>'.
   * @see com.crubier.lil.lil.InteractorBehaviorWhenCause
   * @generated
   */
  EClass getInteractorBehaviorWhenCause();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.InteractorBehaviorWhenCause#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see com.crubier.lil.lil.InteractorBehaviorWhenCause#getCondition()
   * @see #getInteractorBehaviorWhenCause()
   * @generated
   */
  EReference getInteractorBehaviorWhenCause_Condition();

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
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorBehaviorAlwaysEffect <em>Interactor Behavior Always Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Behavior Always Effect</em>'.
   * @see com.crubier.lil.lil.InteractorBehaviorAlwaysEffect
   * @generated
   */
  EClass getInteractorBehaviorAlwaysEffect();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorBehaviorSetEffect <em>Interactor Behavior Set Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Behavior Set Effect</em>'.
   * @see com.crubier.lil.lil.InteractorBehaviorSetEffect
   * @generated
   */
  EClass getInteractorBehaviorSetEffect();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorBehaviorTriggerEffect <em>Interactor Behavior Trigger Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Behavior Trigger Effect</em>'.
   * @see com.crubier.lil.lil.InteractorBehaviorTriggerEffect
   * @generated
   */
  EClass getInteractorBehaviorTriggerEffect();

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
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataDefinitionSetEnum <em>Data Definition Set Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Definition Set Enum</em>'.
   * @see com.crubier.lil.lil.DataDefinitionSetEnum
   * @generated
   */
  EClass getDataDefinitionSetEnum();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.DataDefinitionSetEnum#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Element</em>'.
   * @see com.crubier.lil.lil.DataDefinitionSetEnum#getElement()
   * @see #getDataDefinitionSetEnum()
   * @generated
   */
  EReference getDataDefinitionSetEnum_Element();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataDefinitionSetNumber <em>Data Definition Set Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Definition Set Number</em>'.
   * @see com.crubier.lil.lil.DataDefinitionSetNumber
   * @generated
   */
  EClass getDataDefinitionSetNumber();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.DataDefinitionSetNumber#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Element</em>'.
   * @see com.crubier.lil.lil.DataDefinitionSetNumber#getElement()
   * @see #getDataDefinitionSetNumber()
   * @generated
   */
  EReference getDataDefinitionSetNumber_Element();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataDefinitionSetInterval <em>Data Definition Set Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Definition Set Interval</em>'.
   * @see com.crubier.lil.lil.DataDefinitionSetInterval
   * @generated
   */
  EClass getDataDefinitionSetInterval();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.DataDefinitionSetInterval#getInf <em>Inf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inf</em>'.
   * @see com.crubier.lil.lil.DataDefinitionSetInterval#getInf()
   * @see #getDataDefinitionSetInterval()
   * @generated
   */
  EReference getDataDefinitionSetInterval_Inf();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.DataDefinitionSetInterval#getSup <em>Sup</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sup</em>'.
   * @see com.crubier.lil.lil.DataDefinitionSetInterval#getSup()
   * @see #getDataDefinitionSetInterval()
   * @generated
   */
  EReference getDataDefinitionSetInterval_Sup();

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
   * Returns the meta object for class '{@link com.crubier.lil.lil.LiteralData <em>Literal Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal Data</em>'.
   * @see com.crubier.lil.lil.LiteralData
   * @generated
   */
  EClass getLiteralData();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.LiteralData#getData <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Data</em>'.
   * @see com.crubier.lil.lil.LiteralData#getData()
   * @see #getLiteralData()
   * @generated
   */
  EReference getLiteralData_Data();

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
   * Returns the meta object for class '{@link com.crubier.lil.lil.LiteralString <em>Literal String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal String</em>'.
   * @see com.crubier.lil.lil.LiteralString
   * @generated
   */
  EClass getLiteralString();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.LiteralString#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.crubier.lil.lil.LiteralString#getValue()
   * @see #getLiteralString()
   * @generated
   */
  EAttribute getLiteralString_Value();

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
   * Returns the meta object for class '{@link com.crubier.lil.lil.LiteralTime <em>Literal Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal Time</em>'.
   * @see com.crubier.lil.lil.LiteralTime
   * @generated
   */
  EClass getLiteralTime();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.LiteralTime#isNow <em>Now</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Now</em>'.
   * @see com.crubier.lil.lil.LiteralTime#isNow()
   * @see #getLiteralTime()
   * @generated
   */
  EAttribute getLiteralTime_Now();

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
     * The meta object literal for the '<em><b>Base</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTOR_TYPE__BASE = eINSTANCE.getActorType_Base();

    /**
     * The meta object literal for the '<em><b>Custom</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTOR_TYPE__CUSTOM = eINSTANCE.getActorType_Custom();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.ActorComponentImpl <em>Actor Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.ActorComponentImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getActorComponent()
     * @generated
     */
    EClass ACTOR_COMPONENT = eINSTANCE.getActorComponent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTOR_COMPONENT__NAME = eINSTANCE.getActorComponent_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTOR_COMPONENT__TYPE = eINSTANCE.getActorComponent_Type();

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
     * The meta object literal for the '<em><b>Base</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE__BASE = eINSTANCE.getDataType_Base();

    /**
     * The meta object literal for the '<em><b>Definition Set</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE__DEFINITION_SET = eINSTANCE.getDataType_DefinitionSet();

    /**
     * The meta object literal for the '<em><b>Custom</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE__CUSTOM = eINSTANCE.getDataType_Custom();

    /**
     * The meta object literal for the '<em><b>Collection</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE__COLLECTION = eINSTANCE.getDataType_Collection();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataDefinitionSetImpl <em>Data Definition Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataDefinitionSetImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataDefinitionSet()
     * @generated
     */
    EClass DATA_DEFINITION_SET = eINSTANCE.getDataDefinitionSet();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataDefinitionEnumElementImpl <em>Data Definition Enum Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataDefinitionEnumElementImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataDefinitionEnumElement()
     * @generated
     */
    EClass DATA_DEFINITION_ENUM_ELEMENT = eINSTANCE.getDataDefinitionEnumElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_DEFINITION_ENUM_ELEMENT__NAME = eINSTANCE.getDataDefinitionEnumElement_Name();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataCollectionTypeImpl <em>Data Collection Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataCollectionTypeImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataCollectionType()
     * @generated
     */
    EClass DATA_COLLECTION_TYPE = eINSTANCE.getDataCollectionType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_COLLECTION_TYPE__TYPE = eINSTANCE.getDataCollectionType_Type();

    /**
     * The meta object literal for the '<em><b>Mapping</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_COLLECTION_TYPE__MAPPING = eINSTANCE.getDataCollectionType_Mapping();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataComponentImpl <em>Data Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataComponentImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataComponent()
     * @generated
     */
    EClass DATA_COMPONENT = eINSTANCE.getDataComponent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_COMPONENT__NAME = eINSTANCE.getDataComponent_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_COMPONENT__TYPE = eINSTANCE.getDataComponent_Type();

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
     * The meta object literal for the '<em><b>Custom</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_TYPE__CUSTOM = eINSTANCE.getInteractorType_Custom();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorActorImpl <em>Interactor Actor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorActorImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorActor()
     * @generated
     */
    EClass INTERACTOR_ACTOR = eINSTANCE.getInteractorActor();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_ACTOR__TYPE = eINSTANCE.getInteractorActor_Type();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorDataImpl <em>Interactor Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorDataImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorData()
     * @generated
     */
    EClass INTERACTOR_DATA = eINSTANCE.getInteractorData();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERACTOR_DATA__NAME = eINSTANCE.getInteractorData_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_DATA__TYPE = eINSTANCE.getInteractorData_Type();

    /**
     * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERACTOR_DATA__MODE = eINSTANCE.getInteractorData_Mode();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_DATA__SOURCE = eINSTANCE.getInteractorData_Source();

    /**
     * The meta object literal for the '<em><b>Destinations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_DATA__DESTINATIONS = eINSTANCE.getInteractorData_Destinations();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorSignalAliasImpl <em>Interactor Signal Alias</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorSignalAliasImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorSignalAlias()
     * @generated
     */
    EClass INTERACTOR_SIGNAL_ALIAS = eINSTANCE.getInteractorSignalAlias();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_SIGNAL_ALIAS__SOURCE = eINSTANCE.getInteractorSignalAlias_Source();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_SIGNAL_ALIAS__ALIAS = eINSTANCE.getInteractorSignalAlias_Alias();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorComponentImpl <em>Interactor Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorComponentImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorComponent()
     * @generated
     */
    EClass INTERACTOR_COMPONENT = eINSTANCE.getInteractorComponent();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_COMPONENT__TYPE = eINSTANCE.getInteractorComponent_Type();

    /**
     * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_COMPONENT__ACTORS = eINSTANCE.getInteractorComponent_Actors();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.AccessibleEntityImpl <em>Accessible Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.AccessibleEntityImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getAccessibleEntity()
     * @generated
     */
    EClass ACCESSIBLE_ENTITY = eINSTANCE.getAccessibleEntity();

    /**
     * The meta object literal for the '<em><b>Generic</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACCESSIBLE_ENTITY__GENERIC = eINSTANCE.getAccessibleEntity_Generic();

    /**
     * The meta object literal for the '<em><b>Specific</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACCESSIBLE_ENTITY__SPECIFIC = eINSTANCE.getAccessibleEntity_Specific();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.EntityImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.ActorAliasImpl <em>Actor Alias</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.ActorAliasImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getActorAlias()
     * @generated
     */
    EClass ACTOR_ALIAS = eINSTANCE.getActorAlias();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTOR_ALIAS__SOURCE = eINSTANCE.getActorAlias_Source();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTOR_ALIAS__ALIAS = eINSTANCE.getActorAlias_Alias();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorSignalReceptionImpl <em>Interactor Signal Reception</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorSignalReceptionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorSignalReception()
     * @generated
     */
    EClass INTERACTOR_SIGNAL_RECEPTION = eINSTANCE.getInteractorSignalReception();

    /**
     * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_SIGNAL_RECEPTION__INSTANCE = eINSTANCE.getInteractorSignalReception_Instance();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_SIGNAL_RECEPTION__SOURCE = eINSTANCE.getInteractorSignalReception_Source();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERACTOR_SIGNAL_RECEPTION__INIT = eINSTANCE.getInteractorSignalReception_Init();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorSignalEmissionImpl <em>Interactor Signal Emission</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorSignalEmissionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorSignalEmission()
     * @generated
     */
    EClass INTERACTOR_SIGNAL_EMISSION = eINSTANCE.getInteractorSignalEmission();

    /**
     * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_SIGNAL_EMISSION__INSTANCE = eINSTANCE.getInteractorSignalEmission_Instance();

    /**
     * The meta object literal for the '<em><b>Destination</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_SIGNAL_EMISSION__DESTINATION = eINSTANCE.getInteractorSignalEmission_Destination();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorBehaviorImpl <em>Interactor Behavior</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorBehaviorImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorBehavior()
     * @generated
     */
    EClass INTERACTOR_BEHAVIOR = eINSTANCE.getInteractorBehavior();

    /**
     * The meta object literal for the '<em><b>Cause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_BEHAVIOR__CAUSE = eINSTANCE.getInteractorBehavior_Cause();

    /**
     * The meta object literal for the '<em><b>Effect</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_BEHAVIOR__EFFECT = eINSTANCE.getInteractorBehavior_Effect();

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
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorBehaviorOnCauseImpl <em>Interactor Behavior On Cause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorBehaviorOnCauseImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorBehaviorOnCause()
     * @generated
     */
    EClass INTERACTOR_BEHAVIOR_ON_CAUSE = eINSTANCE.getInteractorBehaviorOnCause();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_BEHAVIOR_ON_CAUSE__EVENT = eINSTANCE.getInteractorBehaviorOnCause_Event();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorBehaviorWhenCauseImpl <em>Interactor Behavior When Cause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorBehaviorWhenCauseImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorBehaviorWhenCause()
     * @generated
     */
    EClass INTERACTOR_BEHAVIOR_WHEN_CAUSE = eINSTANCE.getInteractorBehaviorWhenCause();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_BEHAVIOR_WHEN_CAUSE__CONDITION = eINSTANCE.getInteractorBehaviorWhenCause_Condition();

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
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorBehaviorAlwaysEffectImpl <em>Interactor Behavior Always Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorBehaviorAlwaysEffectImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorBehaviorAlwaysEffect()
     * @generated
     */
    EClass INTERACTOR_BEHAVIOR_ALWAYS_EFFECT = eINSTANCE.getInteractorBehaviorAlwaysEffect();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorBehaviorSetEffectImpl <em>Interactor Behavior Set Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorBehaviorSetEffectImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorBehaviorSetEffect()
     * @generated
     */
    EClass INTERACTOR_BEHAVIOR_SET_EFFECT = eINSTANCE.getInteractorBehaviorSetEffect();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorBehaviorTriggerEffectImpl <em>Interactor Behavior Trigger Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorBehaviorTriggerEffectImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorBehaviorTriggerEffect()
     * @generated
     */
    EClass INTERACTOR_BEHAVIOR_TRIGGER_EFFECT = eINSTANCE.getInteractorBehaviorTriggerEffect();

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
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataDefinitionSetEnumImpl <em>Data Definition Set Enum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataDefinitionSetEnumImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataDefinitionSetEnum()
     * @generated
     */
    EClass DATA_DEFINITION_SET_ENUM = eINSTANCE.getDataDefinitionSetEnum();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_DEFINITION_SET_ENUM__ELEMENT = eINSTANCE.getDataDefinitionSetEnum_Element();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataDefinitionSetNumberImpl <em>Data Definition Set Number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataDefinitionSetNumberImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataDefinitionSetNumber()
     * @generated
     */
    EClass DATA_DEFINITION_SET_NUMBER = eINSTANCE.getDataDefinitionSetNumber();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_DEFINITION_SET_NUMBER__ELEMENT = eINSTANCE.getDataDefinitionSetNumber_Element();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataDefinitionSetIntervalImpl <em>Data Definition Set Interval</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataDefinitionSetIntervalImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataDefinitionSetInterval()
     * @generated
     */
    EClass DATA_DEFINITION_SET_INTERVAL = eINSTANCE.getDataDefinitionSetInterval();

    /**
     * The meta object literal for the '<em><b>Inf</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_DEFINITION_SET_INTERVAL__INF = eINSTANCE.getDataDefinitionSetInterval_Inf();

    /**
     * The meta object literal for the '<em><b>Sup</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_DEFINITION_SET_INTERVAL__SUP = eINSTANCE.getDataDefinitionSetInterval_Sup();

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
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.LiteralDataImpl <em>Literal Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.LiteralDataImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getLiteralData()
     * @generated
     */
    EClass LITERAL_DATA = eINSTANCE.getLiteralData();

    /**
     * The meta object literal for the '<em><b>Data</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LITERAL_DATA__DATA = eINSTANCE.getLiteralData_Data();

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
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.LiteralStringImpl <em>Literal String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.LiteralStringImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getLiteralString()
     * @generated
     */
    EClass LITERAL_STRING = eINSTANCE.getLiteralString();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL_STRING__VALUE = eINSTANCE.getLiteralString_Value();

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
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.LiteralTimeImpl <em>Literal Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.LiteralTimeImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getLiteralTime()
     * @generated
     */
    EClass LITERAL_TIME = eINSTANCE.getLiteralTime();

    /**
     * The meta object literal for the '<em><b>Now</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL_TIME__NOW = eINSTANCE.getLiteralTime_Now();

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
