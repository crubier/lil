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
   * The feature id for the '<em><b>Interactors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIL_MODEL__INTERACTORS = 0;

  /**
   * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIL_MODEL__DATA_TYPES = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIL_MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorImpl <em>Interactor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractor()
   * @generated
   */
  int INTERACTOR = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR__ENTITIES = 1;

  /**
   * The feature id for the '<em><b>Signals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR__SIGNALS = 2;

  /**
   * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR__BEHAVIORS = 3;

  /**
   * The number of structural features of the '<em>Interactor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.AccessibleEntityImpl <em>Accessible Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.AccessibleEntityImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getAccessibleEntity()
   * @generated
   */
  int ACCESSIBLE_ENTITY = 2;

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
   * The meta object id for the '{@link com.crubier.lil.lil.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.EntityImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 3;

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
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ActorImpl <em>Actor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ActorImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getActor()
   * @generated
   */
  int ACTOR = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__NAME = ENTITY__NAME;

  /**
   * The number of structural features of the '<em>Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ActorAliasImpl <em>Actor Alias</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ActorAliasImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getActorAlias()
   * @generated
   */
  int ACTOR_ALIAS = 5;

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
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ComponentImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = ENTITY__NAME;

  /**
   * The feature id for the '<em><b>Interactor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__INTERACTOR = ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Actors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__ACTORS = ENTITY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.SignalReceptionImpl <em>Signal Reception</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.SignalReceptionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getSignalReception()
   * @generated
   */
  int SIGNAL_RECEPTION = 7;

  /**
   * The feature id for the '<em><b>Instance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_RECEPTION__INSTANCE = 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_RECEPTION__SOURCE = 1;

  /**
   * The feature id for the '<em><b>Init</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_RECEPTION__INIT = 2;

  /**
   * The number of structural features of the '<em>Signal Reception</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_RECEPTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.SignalEmissionImpl <em>Signal Emission</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.SignalEmissionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getSignalEmission()
   * @generated
   */
  int SIGNAL_EMISSION = 8;

  /**
   * The feature id for the '<em><b>Instance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_EMISSION__INSTANCE = 0;

  /**
   * The feature id for the '<em><b>Destination</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_EMISSION__DESTINATION = 1;

  /**
   * The number of structural features of the '<em>Signal Emission</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_EMISSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.SignalImpl <em>Signal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.SignalImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getSignal()
   * @generated
   */
  int SIGNAL = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__TYPE = 1;

  /**
   * The feature id for the '<em><b>Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__MODE = 2;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__SOURCE = 3;

  /**
   * The feature id for the '<em><b>Destinations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__DESTINATIONS = 4;

  /**
   * The number of structural features of the '<em>Signal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DefinitionSetImpl <em>Definition Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DefinitionSetImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDefinitionSet()
   * @generated
   */
  int DEFINITION_SET = 10;

  /**
   * The number of structural features of the '<em>Definition Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_SET_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.SignalAliasImpl <em>Signal Alias</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.SignalAliasImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getSignalAlias()
   * @generated
   */
  int SIGNAL_ALIAS = 11;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_ALIAS__SOURCE = 0;

  /**
   * The feature id for the '<em><b>Alias</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_ALIAS__ALIAS = 1;

  /**
   * The number of structural features of the '<em>Signal Alias</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_ALIAS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 12;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeDefinitionImpl <em>Data Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeDefinitionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeDefinition()
   * @generated
   */
  int DATA_TYPE_DEFINITION = 13;

  /**
   * The number of structural features of the '<em>Data Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_DEFINITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeStructureImpl <em>Data Type Structure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeStructureImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeStructure()
   * @generated
   */
  int DATA_TYPE_STRUCTURE = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_STRUCTURE__NAME = DATA_TYPE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_STRUCTURE__FIELDS = DATA_TYPE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data Type Structure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_STRUCTURE_FEATURE_COUNT = DATA_TYPE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeStructureFieldImpl <em>Data Type Structure Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeStructureFieldImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeStructureField()
   * @generated
   */
  int DATA_TYPE_STRUCTURE_FIELD = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_STRUCTURE_FIELD__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_STRUCTURE_FIELD__TYPE = 1;

  /**
   * The number of structural features of the '<em>Data Type Structure Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_STRUCTURE_FIELD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.BehaviorImpl <em>Behavior</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.BehaviorImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getBehavior()
   * @generated
   */
  int BEHAVIOR = 16;

  /**
   * The feature id for the '<em><b>Cause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR__CAUSE = 0;

  /**
   * The feature id for the '<em><b>Effects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR__EFFECTS = 1;

  /**
   * The number of structural features of the '<em>Behavior</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.CauseImpl <em>Cause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.CauseImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getCause()
   * @generated
   */
  int CAUSE = 17;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAUSE__GUARD = 0;

  /**
   * The number of structural features of the '<em>Cause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.OnCauseImpl <em>On Cause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.OnCauseImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getOnCause()
   * @generated
   */
  int ON_CAUSE = 18;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ON_CAUSE__GUARD = CAUSE__GUARD;

  /**
   * The feature id for the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ON_CAUSE__EVENT = CAUSE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>On Cause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ON_CAUSE_FEATURE_COUNT = CAUSE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.WhenCauseImpl <em>When Cause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.WhenCauseImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getWhenCause()
   * @generated
   */
  int WHEN_CAUSE = 19;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_CAUSE__GUARD = CAUSE__GUARD;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_CAUSE__CONDITION = CAUSE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>When Cause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_CAUSE_FEATURE_COUNT = CAUSE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.EffectImpl <em>Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.EffectImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getEffect()
   * @generated
   */
  int EFFECT = 20;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT__TARGET = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT__VALUE = 1;

  /**
   * The number of structural features of the '<em>Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.AlwaysEffectImpl <em>Always Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.AlwaysEffectImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getAlwaysEffect()
   * @generated
   */
  int ALWAYS_EFFECT = 21;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALWAYS_EFFECT__TARGET = EFFECT__TARGET;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALWAYS_EFFECT__VALUE = EFFECT__VALUE;

  /**
   * The number of structural features of the '<em>Always Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALWAYS_EFFECT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.SetEffectImpl <em>Set Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.SetEffectImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getSetEffect()
   * @generated
   */
  int SET_EFFECT = 22;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_EFFECT__TARGET = EFFECT__TARGET;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_EFFECT__VALUE = EFFECT__VALUE;

  /**
   * The number of structural features of the '<em>Set Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_EFFECT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.TriggerEffectImpl <em>Trigger Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.TriggerEffectImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getTriggerEffect()
   * @generated
   */
  int TRIGGER_EFFECT = 23;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER_EFFECT__TARGET = EFFECT__TARGET;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER_EFFECT__VALUE = EFFECT__VALUE;

  /**
   * The number of structural features of the '<em>Trigger Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER_EFFECT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ExpressionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 24;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.CollectionLiteralImpl <em>Collection Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.CollectionLiteralImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getCollectionLiteral()
   * @generated
   */
  int COLLECTION_LITERAL = 25;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_LITERAL__ELEMENTS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Collection Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.SetLiteralImpl <em>Set Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.SetLiteralImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getSetLiteral()
   * @generated
   */
  int SET_LITERAL = 26;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_LITERAL__ELEMENTS = COLLECTION_LITERAL__ELEMENTS;

  /**
   * The number of structural features of the '<em>Set Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_LITERAL_FEATURE_COUNT = COLLECTION_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ListLiteralImpl <em>List Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ListLiteralImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getListLiteral()
   * @generated
   */
  int LIST_LITERAL = 27;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LITERAL__ELEMENTS = COLLECTION_LITERAL__ELEMENTS;

  /**
   * The number of structural features of the '<em>List Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LITERAL_FEATURE_COUNT = COLLECTION_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.CasePartImpl <em>Case Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.CasePartImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getCasePart()
   * @generated
   */
  int CASE_PART = 28;

  /**
   * The feature id for the '<em><b>Case</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_PART__CASE = 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_PART__THEN = 1;

  /**
   * The number of structural features of the '<em>Case Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_PART_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.EnumElementImpl <em>Enum Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.EnumElementImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getEnumElement()
   * @generated
   */
  int ENUM_ELEMENT = 29;

  /**
   * The number of structural features of the '<em>Enum Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.EnumDefinitionSetImpl <em>Enum Definition Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.EnumDefinitionSetImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getEnumDefinitionSet()
   * @generated
   */
  int ENUM_DEFINITION_SET = 30;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DEFINITION_SET__ELEMENTS = DEFINITION_SET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enum Definition Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DEFINITION_SET_FEATURE_COUNT = DEFINITION_SET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.NumberDefinitionSetImpl <em>Number Definition Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.NumberDefinitionSetImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberDefinitionSet()
   * @generated
   */
  int NUMBER_DEFINITION_SET = 31;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_DEFINITION_SET__ELEMENTS = DEFINITION_SET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number Definition Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_DEFINITION_SET_FEATURE_COUNT = DEFINITION_SET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.NumberDefinitionIntervalImpl <em>Number Definition Interval</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.NumberDefinitionIntervalImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberDefinitionInterval()
   * @generated
   */
  int NUMBER_DEFINITION_INTERVAL = 32;

  /**
   * The feature id for the '<em><b>Inf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_DEFINITION_INTERVAL__INF = DEFINITION_SET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sup</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_DEFINITION_INTERVAL__SUP = DEFINITION_SET_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Number Definition Interval</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_DEFINITION_INTERVAL_FEATURE_COUNT = DEFINITION_SET_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeBaseImpl <em>Data Type Base</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeBaseImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeBase()
   * @generated
   */
  int DATA_TYPE_BASE = 33;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_BASE__TYPE = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Definition Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_BASE__DEFINITION_SET = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data Type Base</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_BASE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeCollectionImpl <em>Data Type Collection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeCollectionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeCollection()
   * @generated
   */
  int DATA_TYPE_COLLECTION = 34;

  /**
   * The feature id for the '<em><b>Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_COLLECTION__MODE = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_COLLECTION__TYPE = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Definition Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_COLLECTION__DEFINITION_SET = DATA_TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Data Type Collection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_COLLECTION_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeCompoundImpl <em>Data Type Compound</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeCompoundImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeCompound()
   * @generated
   */
  int DATA_TYPE_COMPOUND = 35;

  /**
   * The feature id for the '<em><b>Compound</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_COMPOUND__COMPOUND = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Type Compound</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_COMPOUND_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.XBinaryOperationImpl <em>XBinary Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.XBinaryOperationImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getXBinaryOperation()
   * @generated
   */
  int XBINARY_OPERATION = 36;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBINARY_OPERATION__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBINARY_OPERATION__FEATURE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBINARY_OPERATION__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>XBinary Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBINARY_OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.UnaryOperationImpl <em>Unary Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.UnaryOperationImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getUnaryOperation()
   * @generated
   */
  int UNARY_OPERATION = 37;

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
   * The meta object id for the '{@link com.crubier.lil.lil.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.EnumLiteralImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getEnumLiteral()
   * @generated
   */
  int ENUM_LITERAL = 38;

  /**
   * The feature id for the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LITERAL__ELEMENT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LITERAL__NAME = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enum Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.SignalLiteralImpl <em>Signal Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.SignalLiteralImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getSignalLiteral()
   * @generated
   */
  int SIGNAL_LITERAL = 39;

  /**
   * The feature id for the '<em><b>Signal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_LITERAL__SIGNAL = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Signal Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.IfExpressionImpl <em>If Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.IfExpressionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getIfExpression()
   * @generated
   */
  int IF_EXPRESSION = 40;

  /**
   * The feature id for the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_EXPRESSION__IF = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_EXPRESSION__THEN = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_EXPRESSION__ELSE = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>If Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.SwitchExpressionImpl <em>Switch Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.SwitchExpressionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getSwitchExpression()
   * @generated
   */
  int SWITCH_EXPRESSION = 41;

  /**
   * The feature id for the '<em><b>Switch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_EXPRESSION__SWITCH = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_EXPRESSION__CASES = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_EXPRESSION__DEFAULT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Switch Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ForEachExpressionImpl <em>For Each Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ForEachExpressionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getForEachExpression()
   * @generated
   */
  int FOR_EACH_EXPRESSION = 42;

  /**
   * The feature id for the '<em><b>For Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_EACH_EXPRESSION__FOR_EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Each Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_EACH_EXPRESSION__EACH_EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>For Each Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_EACH_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.FunctionCallExpressionImpl <em>Function Call Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.FunctionCallExpressionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getFunctionCallExpression()
   * @generated
   */
  int FUNCTION_CALL_EXPRESSION = 43;

  /**
   * The feature id for the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_EXPRESSION__FUNCTION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_EXPRESSION__ARGUMENTS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function Call Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.BooleanLiteralImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 44;

  /**
   * The feature id for the '<em><b>Is True</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__IS_TRUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.NullLiteralImpl <em>Null Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.NullLiteralImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getNullLiteral()
   * @generated
   */
  int NULL_LITERAL = 45;

  /**
   * The number of structural features of the '<em>Null Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.NumberLiteralImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberLiteral()
   * @generated
   */
  int NUMBER_LITERAL = 46;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.StringLiteralImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 47;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.TimeLiteralNowImpl <em>Time Literal Now</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.TimeLiteralNowImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getTimeLiteralNow()
   * @generated
   */
  int TIME_LITERAL_NOW = 48;

  /**
   * The number of structural features of the '<em>Time Literal Now</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_LITERAL_NOW_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.TimeLiteralImpl <em>Time Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.TimeLiteralImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getTimeLiteral()
   * @generated
   */
  int TIME_LITERAL = 49;

  /**
   * The feature id for the '<em><b>Year</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_LITERAL__YEAR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Month</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_LITERAL__MONTH = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Day</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_LITERAL__DAY = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Hour</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_LITERAL__HOUR = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Minute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_LITERAL__MINUTE = EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Second</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_LITERAL__SECOND = EXPRESSION_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Time Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 6;


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
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.LilModel#getInteractors <em>Interactors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interactors</em>'.
   * @see com.crubier.lil.lil.LilModel#getInteractors()
   * @see #getLilModel()
   * @generated
   */
  EReference getLilModel_Interactors();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.LilModel#getDataTypes <em>Data Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data Types</em>'.
   * @see com.crubier.lil.lil.LilModel#getDataTypes()
   * @see #getLilModel()
   * @generated
   */
  EReference getLilModel_DataTypes();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.Interactor <em>Interactor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor</em>'.
   * @see com.crubier.lil.lil.Interactor
   * @generated
   */
  EClass getInteractor();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.Interactor#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.crubier.lil.lil.Interactor#getName()
   * @see #getInteractor()
   * @generated
   */
  EAttribute getInteractor_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.Interactor#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see com.crubier.lil.lil.Interactor#getEntities()
   * @see #getInteractor()
   * @generated
   */
  EReference getInteractor_Entities();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.Interactor#getSignals <em>Signals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signals</em>'.
   * @see com.crubier.lil.lil.Interactor#getSignals()
   * @see #getInteractor()
   * @generated
   */
  EReference getInteractor_Signals();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.Interactor#getBehaviors <em>Behaviors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Behaviors</em>'.
   * @see com.crubier.lil.lil.Interactor#getBehaviors()
   * @see #getInteractor()
   * @generated
   */
  EReference getInteractor_Behaviors();

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
   * Returns the meta object for class '{@link com.crubier.lil.lil.Actor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actor</em>'.
   * @see com.crubier.lil.lil.Actor
   * @generated
   */
  EClass getActor();

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
   * Returns the meta object for class '{@link com.crubier.lil.lil.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see com.crubier.lil.lil.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.Component#getInteractor <em>Interactor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Interactor</em>'.
   * @see com.crubier.lil.lil.Component#getInteractor()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Interactor();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.Component#getActors <em>Actors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actors</em>'.
   * @see com.crubier.lil.lil.Component#getActors()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Actors();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.SignalReception <em>Signal Reception</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal Reception</em>'.
   * @see com.crubier.lil.lil.SignalReception
   * @generated
   */
  EClass getSignalReception();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.SignalReception#getInstance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Instance</em>'.
   * @see com.crubier.lil.lil.SignalReception#getInstance()
   * @see #getSignalReception()
   * @generated
   */
  EReference getSignalReception_Instance();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.SignalReception#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see com.crubier.lil.lil.SignalReception#getSource()
   * @see #getSignalReception()
   * @generated
   */
  EReference getSignalReception_Source();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.SignalReception#isInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Init</em>'.
   * @see com.crubier.lil.lil.SignalReception#isInit()
   * @see #getSignalReception()
   * @generated
   */
  EAttribute getSignalReception_Init();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.SignalEmission <em>Signal Emission</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal Emission</em>'.
   * @see com.crubier.lil.lil.SignalEmission
   * @generated
   */
  EClass getSignalEmission();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.SignalEmission#getInstance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Instance</em>'.
   * @see com.crubier.lil.lil.SignalEmission#getInstance()
   * @see #getSignalEmission()
   * @generated
   */
  EReference getSignalEmission_Instance();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.SignalEmission#getDestination <em>Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Destination</em>'.
   * @see com.crubier.lil.lil.SignalEmission#getDestination()
   * @see #getSignalEmission()
   * @generated
   */
  EReference getSignalEmission_Destination();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.Signal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal</em>'.
   * @see com.crubier.lil.lil.Signal
   * @generated
   */
  EClass getSignal();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.Signal#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.crubier.lil.lil.Signal#getName()
   * @see #getSignal()
   * @generated
   */
  EAttribute getSignal_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.Signal#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.crubier.lil.lil.Signal#getType()
   * @see #getSignal()
   * @generated
   */
  EReference getSignal_Type();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.Signal#getMode <em>Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mode</em>'.
   * @see com.crubier.lil.lil.Signal#getMode()
   * @see #getSignal()
   * @generated
   */
  EAttribute getSignal_Mode();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.Signal#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see com.crubier.lil.lil.Signal#getSource()
   * @see #getSignal()
   * @generated
   */
  EReference getSignal_Source();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.Signal#getDestinations <em>Destinations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Destinations</em>'.
   * @see com.crubier.lil.lil.Signal#getDestinations()
   * @see #getSignal()
   * @generated
   */
  EReference getSignal_Destinations();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DefinitionSet <em>Definition Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition Set</em>'.
   * @see com.crubier.lil.lil.DefinitionSet
   * @generated
   */
  EClass getDefinitionSet();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.SignalAlias <em>Signal Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal Alias</em>'.
   * @see com.crubier.lil.lil.SignalAlias
   * @generated
   */
  EClass getSignalAlias();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.SignalAlias#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see com.crubier.lil.lil.SignalAlias#getSource()
   * @see #getSignalAlias()
   * @generated
   */
  EReference getSignalAlias_Source();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.SignalAlias#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Alias</em>'.
   * @see com.crubier.lil.lil.SignalAlias#getAlias()
   * @see #getSignalAlias()
   * @generated
   */
  EReference getSignalAlias_Alias();

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
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeDefinition <em>Data Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Definition</em>'.
   * @see com.crubier.lil.lil.DataTypeDefinition
   * @generated
   */
  EClass getDataTypeDefinition();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeStructure <em>Data Type Structure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Structure</em>'.
   * @see com.crubier.lil.lil.DataTypeStructure
   * @generated
   */
  EClass getDataTypeStructure();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.DataTypeStructure#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.crubier.lil.lil.DataTypeStructure#getName()
   * @see #getDataTypeStructure()
   * @generated
   */
  EAttribute getDataTypeStructure_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.DataTypeStructure#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see com.crubier.lil.lil.DataTypeStructure#getFields()
   * @see #getDataTypeStructure()
   * @generated
   */
  EReference getDataTypeStructure_Fields();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeStructureField <em>Data Type Structure Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Structure Field</em>'.
   * @see com.crubier.lil.lil.DataTypeStructureField
   * @generated
   */
  EClass getDataTypeStructureField();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.DataTypeStructureField#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.crubier.lil.lil.DataTypeStructureField#getName()
   * @see #getDataTypeStructureField()
   * @generated
   */
  EAttribute getDataTypeStructureField_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.DataTypeStructureField#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.crubier.lil.lil.DataTypeStructureField#getType()
   * @see #getDataTypeStructureField()
   * @generated
   */
  EReference getDataTypeStructureField_Type();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.Behavior <em>Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Behavior</em>'.
   * @see com.crubier.lil.lil.Behavior
   * @generated
   */
  EClass getBehavior();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.Behavior#getCause <em>Cause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cause</em>'.
   * @see com.crubier.lil.lil.Behavior#getCause()
   * @see #getBehavior()
   * @generated
   */
  EReference getBehavior_Cause();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.Behavior#getEffects <em>Effects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Effects</em>'.
   * @see com.crubier.lil.lil.Behavior#getEffects()
   * @see #getBehavior()
   * @generated
   */
  EReference getBehavior_Effects();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.Cause <em>Cause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cause</em>'.
   * @see com.crubier.lil.lil.Cause
   * @generated
   */
  EClass getCause();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.Cause#getGuard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guard</em>'.
   * @see com.crubier.lil.lil.Cause#getGuard()
   * @see #getCause()
   * @generated
   */
  EReference getCause_Guard();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.OnCause <em>On Cause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>On Cause</em>'.
   * @see com.crubier.lil.lil.OnCause
   * @generated
   */
  EClass getOnCause();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.OnCause#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Event</em>'.
   * @see com.crubier.lil.lil.OnCause#getEvent()
   * @see #getOnCause()
   * @generated
   */
  EReference getOnCause_Event();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.WhenCause <em>When Cause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When Cause</em>'.
   * @see com.crubier.lil.lil.WhenCause
   * @generated
   */
  EClass getWhenCause();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.WhenCause#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see com.crubier.lil.lil.WhenCause#getCondition()
   * @see #getWhenCause()
   * @generated
   */
  EReference getWhenCause_Condition();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.Effect <em>Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Effect</em>'.
   * @see com.crubier.lil.lil.Effect
   * @generated
   */
  EClass getEffect();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.Effect#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see com.crubier.lil.lil.Effect#getTarget()
   * @see #getEffect()
   * @generated
   */
  EReference getEffect_Target();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.Effect#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.crubier.lil.lil.Effect#getValue()
   * @see #getEffect()
   * @generated
   */
  EReference getEffect_Value();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.AlwaysEffect <em>Always Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Always Effect</em>'.
   * @see com.crubier.lil.lil.AlwaysEffect
   * @generated
   */
  EClass getAlwaysEffect();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.SetEffect <em>Set Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Effect</em>'.
   * @see com.crubier.lil.lil.SetEffect
   * @generated
   */
  EClass getSetEffect();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.TriggerEffect <em>Trigger Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trigger Effect</em>'.
   * @see com.crubier.lil.lil.TriggerEffect
   * @generated
   */
  EClass getTriggerEffect();

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
   * Returns the meta object for class '{@link com.crubier.lil.lil.CollectionLiteral <em>Collection Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection Literal</em>'.
   * @see com.crubier.lil.lil.CollectionLiteral
   * @generated
   */
  EClass getCollectionLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.CollectionLiteral#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see com.crubier.lil.lil.CollectionLiteral#getElements()
   * @see #getCollectionLiteral()
   * @generated
   */
  EReference getCollectionLiteral_Elements();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.SetLiteral <em>Set Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Literal</em>'.
   * @see com.crubier.lil.lil.SetLiteral
   * @generated
   */
  EClass getSetLiteral();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.ListLiteral <em>List Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Literal</em>'.
   * @see com.crubier.lil.lil.ListLiteral
   * @generated
   */
  EClass getListLiteral();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.CasePart <em>Case Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case Part</em>'.
   * @see com.crubier.lil.lil.CasePart
   * @generated
   */
  EClass getCasePart();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.CasePart#getCase <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Case</em>'.
   * @see com.crubier.lil.lil.CasePart#getCase()
   * @see #getCasePart()
   * @generated
   */
  EReference getCasePart_Case();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.CasePart#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see com.crubier.lil.lil.CasePart#getThen()
   * @see #getCasePart()
   * @generated
   */
  EReference getCasePart_Then();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.EnumElement <em>Enum Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Element</em>'.
   * @see com.crubier.lil.lil.EnumElement
   * @generated
   */
  EClass getEnumElement();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.EnumDefinitionSet <em>Enum Definition Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Definition Set</em>'.
   * @see com.crubier.lil.lil.EnumDefinitionSet
   * @generated
   */
  EClass getEnumDefinitionSet();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.EnumDefinitionSet#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see com.crubier.lil.lil.EnumDefinitionSet#getElements()
   * @see #getEnumDefinitionSet()
   * @generated
   */
  EReference getEnumDefinitionSet_Elements();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.NumberDefinitionSet <em>Number Definition Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Definition Set</em>'.
   * @see com.crubier.lil.lil.NumberDefinitionSet
   * @generated
   */
  EClass getNumberDefinitionSet();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.NumberDefinitionSet#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see com.crubier.lil.lil.NumberDefinitionSet#getElements()
   * @see #getNumberDefinitionSet()
   * @generated
   */
  EReference getNumberDefinitionSet_Elements();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.NumberDefinitionInterval <em>Number Definition Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Definition Interval</em>'.
   * @see com.crubier.lil.lil.NumberDefinitionInterval
   * @generated
   */
  EClass getNumberDefinitionInterval();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.NumberDefinitionInterval#getInf <em>Inf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inf</em>'.
   * @see com.crubier.lil.lil.NumberDefinitionInterval#getInf()
   * @see #getNumberDefinitionInterval()
   * @generated
   */
  EReference getNumberDefinitionInterval_Inf();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.NumberDefinitionInterval#getSup <em>Sup</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sup</em>'.
   * @see com.crubier.lil.lil.NumberDefinitionInterval#getSup()
   * @see #getNumberDefinitionInterval()
   * @generated
   */
  EReference getNumberDefinitionInterval_Sup();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeBase <em>Data Type Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Base</em>'.
   * @see com.crubier.lil.lil.DataTypeBase
   * @generated
   */
  EClass getDataTypeBase();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.DataTypeBase#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.crubier.lil.lil.DataTypeBase#getType()
   * @see #getDataTypeBase()
   * @generated
   */
  EAttribute getDataTypeBase_Type();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.DataTypeBase#getDefinitionSet <em>Definition Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Definition Set</em>'.
   * @see com.crubier.lil.lil.DataTypeBase#getDefinitionSet()
   * @see #getDataTypeBase()
   * @generated
   */
  EReference getDataTypeBase_DefinitionSet();

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
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.DataTypeCollection#getMode <em>Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mode</em>'.
   * @see com.crubier.lil.lil.DataTypeCollection#getMode()
   * @see #getDataTypeCollection()
   * @generated
   */
  EAttribute getDataTypeCollection_Mode();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.DataTypeCollection#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see com.crubier.lil.lil.DataTypeCollection#getType()
   * @see #getDataTypeCollection()
   * @generated
   */
  EReference getDataTypeCollection_Type();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.DataTypeCollection#getDefinitionSet <em>Definition Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Definition Set</em>'.
   * @see com.crubier.lil.lil.DataTypeCollection#getDefinitionSet()
   * @see #getDataTypeCollection()
   * @generated
   */
  EReference getDataTypeCollection_DefinitionSet();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeCompound <em>Data Type Compound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Compound</em>'.
   * @see com.crubier.lil.lil.DataTypeCompound
   * @generated
   */
  EClass getDataTypeCompound();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.DataTypeCompound#getCompound <em>Compound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Compound</em>'.
   * @see com.crubier.lil.lil.DataTypeCompound#getCompound()
   * @see #getDataTypeCompound()
   * @generated
   */
  EReference getDataTypeCompound_Compound();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.XBinaryOperation <em>XBinary Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XBinary Operation</em>'.
   * @see com.crubier.lil.lil.XBinaryOperation
   * @generated
   */
  EClass getXBinaryOperation();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.XBinaryOperation#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see com.crubier.lil.lil.XBinaryOperation#getLeftOperand()
   * @see #getXBinaryOperation()
   * @generated
   */
  EReference getXBinaryOperation_LeftOperand();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.XBinaryOperation#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature</em>'.
   * @see com.crubier.lil.lil.XBinaryOperation#getFeature()
   * @see #getXBinaryOperation()
   * @generated
   */
  EAttribute getXBinaryOperation_Feature();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.XBinaryOperation#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see com.crubier.lil.lil.XBinaryOperation#getRightOperand()
   * @see #getXBinaryOperation()
   * @generated
   */
  EReference getXBinaryOperation_RightOperand();

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
   * Returns the meta object for class '{@link com.crubier.lil.lil.EnumLiteral <em>Enum Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Literal</em>'.
   * @see com.crubier.lil.lil.EnumLiteral
   * @generated
   */
  EClass getEnumLiteral();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.EnumLiteral#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Element</em>'.
   * @see com.crubier.lil.lil.EnumLiteral#getElement()
   * @see #getEnumLiteral()
   * @generated
   */
  EReference getEnumLiteral_Element();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.EnumLiteral#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.crubier.lil.lil.EnumLiteral#getName()
   * @see #getEnumLiteral()
   * @generated
   */
  EAttribute getEnumLiteral_Name();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.SignalLiteral <em>Signal Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal Literal</em>'.
   * @see com.crubier.lil.lil.SignalLiteral
   * @generated
   */
  EClass getSignalLiteral();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.SignalLiteral#getSignal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Signal</em>'.
   * @see com.crubier.lil.lil.SignalLiteral#getSignal()
   * @see #getSignalLiteral()
   * @generated
   */
  EReference getSignalLiteral_Signal();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.IfExpression <em>If Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Expression</em>'.
   * @see com.crubier.lil.lil.IfExpression
   * @generated
   */
  EClass getIfExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.IfExpression#getIf <em>If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If</em>'.
   * @see com.crubier.lil.lil.IfExpression#getIf()
   * @see #getIfExpression()
   * @generated
   */
  EReference getIfExpression_If();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.IfExpression#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see com.crubier.lil.lil.IfExpression#getThen()
   * @see #getIfExpression()
   * @generated
   */
  EReference getIfExpression_Then();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.IfExpression#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see com.crubier.lil.lil.IfExpression#getElse()
   * @see #getIfExpression()
   * @generated
   */
  EReference getIfExpression_Else();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.SwitchExpression <em>Switch Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch Expression</em>'.
   * @see com.crubier.lil.lil.SwitchExpression
   * @generated
   */
  EClass getSwitchExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.SwitchExpression#getSwitch <em>Switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Switch</em>'.
   * @see com.crubier.lil.lil.SwitchExpression#getSwitch()
   * @see #getSwitchExpression()
   * @generated
   */
  EReference getSwitchExpression_Switch();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.SwitchExpression#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see com.crubier.lil.lil.SwitchExpression#getCases()
   * @see #getSwitchExpression()
   * @generated
   */
  EReference getSwitchExpression_Cases();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.SwitchExpression#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default</em>'.
   * @see com.crubier.lil.lil.SwitchExpression#getDefault()
   * @see #getSwitchExpression()
   * @generated
   */
  EReference getSwitchExpression_Default();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.ForEachExpression <em>For Each Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Each Expression</em>'.
   * @see com.crubier.lil.lil.ForEachExpression
   * @generated
   */
  EClass getForEachExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.ForEachExpression#getForExpression <em>For Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>For Expression</em>'.
   * @see com.crubier.lil.lil.ForEachExpression#getForExpression()
   * @see #getForEachExpression()
   * @generated
   */
  EReference getForEachExpression_ForExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.ForEachExpression#getEachExpression <em>Each Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Each Expression</em>'.
   * @see com.crubier.lil.lil.ForEachExpression#getEachExpression()
   * @see #getForEachExpression()
   * @generated
   */
  EReference getForEachExpression_EachExpression();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.FunctionCallExpression <em>Function Call Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Call Expression</em>'.
   * @see com.crubier.lil.lil.FunctionCallExpression
   * @generated
   */
  EClass getFunctionCallExpression();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.FunctionCallExpression#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function</em>'.
   * @see com.crubier.lil.lil.FunctionCallExpression#getFunction()
   * @see #getFunctionCallExpression()
   * @generated
   */
  EAttribute getFunctionCallExpression_Function();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.FunctionCallExpression#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see com.crubier.lil.lil.FunctionCallExpression#getArguments()
   * @see #getFunctionCallExpression()
   * @generated
   */
  EReference getFunctionCallExpression_Arguments();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal</em>'.
   * @see com.crubier.lil.lil.BooleanLiteral
   * @generated
   */
  EClass getBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.BooleanLiteral#isIsTrue <em>Is True</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is True</em>'.
   * @see com.crubier.lil.lil.BooleanLiteral#isIsTrue()
   * @see #getBooleanLiteral()
   * @generated
   */
  EAttribute getBooleanLiteral_IsTrue();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.NullLiteral <em>Null Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null Literal</em>'.
   * @see com.crubier.lil.lil.NullLiteral
   * @generated
   */
  EClass getNullLiteral();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Literal</em>'.
   * @see com.crubier.lil.lil.NumberLiteral
   * @generated
   */
  EClass getNumberLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.NumberLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.crubier.lil.lil.NumberLiteral#getValue()
   * @see #getNumberLiteral()
   * @generated
   */
  EAttribute getNumberLiteral_Value();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see com.crubier.lil.lil.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.crubier.lil.lil.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.TimeLiteralNow <em>Time Literal Now</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Time Literal Now</em>'.
   * @see com.crubier.lil.lil.TimeLiteralNow
   * @generated
   */
  EClass getTimeLiteralNow();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.TimeLiteral <em>Time Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Time Literal</em>'.
   * @see com.crubier.lil.lil.TimeLiteral
   * @generated
   */
  EClass getTimeLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.TimeLiteral#getYear <em>Year</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Year</em>'.
   * @see com.crubier.lil.lil.TimeLiteral#getYear()
   * @see #getTimeLiteral()
   * @generated
   */
  EAttribute getTimeLiteral_Year();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.TimeLiteral#getMonth <em>Month</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Month</em>'.
   * @see com.crubier.lil.lil.TimeLiteral#getMonth()
   * @see #getTimeLiteral()
   * @generated
   */
  EAttribute getTimeLiteral_Month();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.TimeLiteral#getDay <em>Day</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Day</em>'.
   * @see com.crubier.lil.lil.TimeLiteral#getDay()
   * @see #getTimeLiteral()
   * @generated
   */
  EAttribute getTimeLiteral_Day();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.TimeLiteral#getHour <em>Hour</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hour</em>'.
   * @see com.crubier.lil.lil.TimeLiteral#getHour()
   * @see #getTimeLiteral()
   * @generated
   */
  EAttribute getTimeLiteral_Hour();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.TimeLiteral#getMinute <em>Minute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Minute</em>'.
   * @see com.crubier.lil.lil.TimeLiteral#getMinute()
   * @see #getTimeLiteral()
   * @generated
   */
  EAttribute getTimeLiteral_Minute();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.TimeLiteral#getSecond <em>Second</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Second</em>'.
   * @see com.crubier.lil.lil.TimeLiteral#getSecond()
   * @see #getTimeLiteral()
   * @generated
   */
  EAttribute getTimeLiteral_Second();

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
     * The meta object literal for the '<em><b>Interactors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIL_MODEL__INTERACTORS = eINSTANCE.getLilModel_Interactors();

    /**
     * The meta object literal for the '<em><b>Data Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIL_MODEL__DATA_TYPES = eINSTANCE.getLilModel_DataTypes();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorImpl <em>Interactor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractor()
     * @generated
     */
    EClass INTERACTOR = eINSTANCE.getInteractor();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERACTOR__NAME = eINSTANCE.getInteractor_Name();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR__ENTITIES = eINSTANCE.getInteractor_Entities();

    /**
     * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR__SIGNALS = eINSTANCE.getInteractor_Signals();

    /**
     * The meta object literal for the '<em><b>Behaviors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR__BEHAVIORS = eINSTANCE.getInteractor_Behaviors();

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
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.ActorImpl <em>Actor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.ActorImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getActor()
     * @generated
     */
    EClass ACTOR = eINSTANCE.getActor();

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
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.ComponentImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getComponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
     * The meta object literal for the '<em><b>Interactor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__INTERACTOR = eINSTANCE.getComponent_Interactor();

    /**
     * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__ACTORS = eINSTANCE.getComponent_Actors();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.SignalReceptionImpl <em>Signal Reception</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.SignalReceptionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getSignalReception()
     * @generated
     */
    EClass SIGNAL_RECEPTION = eINSTANCE.getSignalReception();

    /**
     * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNAL_RECEPTION__INSTANCE = eINSTANCE.getSignalReception_Instance();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNAL_RECEPTION__SOURCE = eINSTANCE.getSignalReception_Source();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGNAL_RECEPTION__INIT = eINSTANCE.getSignalReception_Init();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.SignalEmissionImpl <em>Signal Emission</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.SignalEmissionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getSignalEmission()
     * @generated
     */
    EClass SIGNAL_EMISSION = eINSTANCE.getSignalEmission();

    /**
     * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNAL_EMISSION__INSTANCE = eINSTANCE.getSignalEmission_Instance();

    /**
     * The meta object literal for the '<em><b>Destination</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNAL_EMISSION__DESTINATION = eINSTANCE.getSignalEmission_Destination();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.SignalImpl <em>Signal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.SignalImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getSignal()
     * @generated
     */
    EClass SIGNAL = eINSTANCE.getSignal();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGNAL__NAME = eINSTANCE.getSignal_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNAL__TYPE = eINSTANCE.getSignal_Type();

    /**
     * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGNAL__MODE = eINSTANCE.getSignal_Mode();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNAL__SOURCE = eINSTANCE.getSignal_Source();

    /**
     * The meta object literal for the '<em><b>Destinations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNAL__DESTINATIONS = eINSTANCE.getSignal_Destinations();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DefinitionSetImpl <em>Definition Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DefinitionSetImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDefinitionSet()
     * @generated
     */
    EClass DEFINITION_SET = eINSTANCE.getDefinitionSet();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.SignalAliasImpl <em>Signal Alias</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.SignalAliasImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getSignalAlias()
     * @generated
     */
    EClass SIGNAL_ALIAS = eINSTANCE.getSignalAlias();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNAL_ALIAS__SOURCE = eINSTANCE.getSignalAlias_Source();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNAL_ALIAS__ALIAS = eINSTANCE.getSignalAlias_Alias();

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
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeDefinitionImpl <em>Data Type Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeDefinitionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeDefinition()
     * @generated
     */
    EClass DATA_TYPE_DEFINITION = eINSTANCE.getDataTypeDefinition();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeStructureImpl <em>Data Type Structure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeStructureImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeStructure()
     * @generated
     */
    EClass DATA_TYPE_STRUCTURE = eINSTANCE.getDataTypeStructure();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE_STRUCTURE__NAME = eINSTANCE.getDataTypeStructure_Name();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_STRUCTURE__FIELDS = eINSTANCE.getDataTypeStructure_Fields();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeStructureFieldImpl <em>Data Type Structure Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeStructureFieldImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeStructureField()
     * @generated
     */
    EClass DATA_TYPE_STRUCTURE_FIELD = eINSTANCE.getDataTypeStructureField();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE_STRUCTURE_FIELD__NAME = eINSTANCE.getDataTypeStructureField_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_STRUCTURE_FIELD__TYPE = eINSTANCE.getDataTypeStructureField_Type();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.BehaviorImpl <em>Behavior</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.BehaviorImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getBehavior()
     * @generated
     */
    EClass BEHAVIOR = eINSTANCE.getBehavior();

    /**
     * The meta object literal for the '<em><b>Cause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEHAVIOR__CAUSE = eINSTANCE.getBehavior_Cause();

    /**
     * The meta object literal for the '<em><b>Effects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEHAVIOR__EFFECTS = eINSTANCE.getBehavior_Effects();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.CauseImpl <em>Cause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.CauseImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getCause()
     * @generated
     */
    EClass CAUSE = eINSTANCE.getCause();

    /**
     * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAUSE__GUARD = eINSTANCE.getCause_Guard();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.OnCauseImpl <em>On Cause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.OnCauseImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getOnCause()
     * @generated
     */
    EClass ON_CAUSE = eINSTANCE.getOnCause();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ON_CAUSE__EVENT = eINSTANCE.getOnCause_Event();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.WhenCauseImpl <em>When Cause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.WhenCauseImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getWhenCause()
     * @generated
     */
    EClass WHEN_CAUSE = eINSTANCE.getWhenCause();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_CAUSE__CONDITION = eINSTANCE.getWhenCause_Condition();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.EffectImpl <em>Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.EffectImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getEffect()
     * @generated
     */
    EClass EFFECT = eINSTANCE.getEffect();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EFFECT__TARGET = eINSTANCE.getEffect_Target();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EFFECT__VALUE = eINSTANCE.getEffect_Value();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.AlwaysEffectImpl <em>Always Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.AlwaysEffectImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getAlwaysEffect()
     * @generated
     */
    EClass ALWAYS_EFFECT = eINSTANCE.getAlwaysEffect();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.SetEffectImpl <em>Set Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.SetEffectImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getSetEffect()
     * @generated
     */
    EClass SET_EFFECT = eINSTANCE.getSetEffect();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.TriggerEffectImpl <em>Trigger Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.TriggerEffectImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getTriggerEffect()
     * @generated
     */
    EClass TRIGGER_EFFECT = eINSTANCE.getTriggerEffect();

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
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.CollectionLiteralImpl <em>Collection Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.CollectionLiteralImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getCollectionLiteral()
     * @generated
     */
    EClass COLLECTION_LITERAL = eINSTANCE.getCollectionLiteral();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION_LITERAL__ELEMENTS = eINSTANCE.getCollectionLiteral_Elements();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.SetLiteralImpl <em>Set Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.SetLiteralImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getSetLiteral()
     * @generated
     */
    EClass SET_LITERAL = eINSTANCE.getSetLiteral();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.ListLiteralImpl <em>List Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.ListLiteralImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getListLiteral()
     * @generated
     */
    EClass LIST_LITERAL = eINSTANCE.getListLiteral();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.CasePartImpl <em>Case Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.CasePartImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getCasePart()
     * @generated
     */
    EClass CASE_PART = eINSTANCE.getCasePart();

    /**
     * The meta object literal for the '<em><b>Case</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_PART__CASE = eINSTANCE.getCasePart_Case();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_PART__THEN = eINSTANCE.getCasePart_Then();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.EnumElementImpl <em>Enum Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.EnumElementImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getEnumElement()
     * @generated
     */
    EClass ENUM_ELEMENT = eINSTANCE.getEnumElement();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.EnumDefinitionSetImpl <em>Enum Definition Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.EnumDefinitionSetImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getEnumDefinitionSet()
     * @generated
     */
    EClass ENUM_DEFINITION_SET = eINSTANCE.getEnumDefinitionSet();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_DEFINITION_SET__ELEMENTS = eINSTANCE.getEnumDefinitionSet_Elements();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.NumberDefinitionSetImpl <em>Number Definition Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.NumberDefinitionSetImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberDefinitionSet()
     * @generated
     */
    EClass NUMBER_DEFINITION_SET = eINSTANCE.getNumberDefinitionSet();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_DEFINITION_SET__ELEMENTS = eINSTANCE.getNumberDefinitionSet_Elements();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.NumberDefinitionIntervalImpl <em>Number Definition Interval</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.NumberDefinitionIntervalImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberDefinitionInterval()
     * @generated
     */
    EClass NUMBER_DEFINITION_INTERVAL = eINSTANCE.getNumberDefinitionInterval();

    /**
     * The meta object literal for the '<em><b>Inf</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_DEFINITION_INTERVAL__INF = eINSTANCE.getNumberDefinitionInterval_Inf();

    /**
     * The meta object literal for the '<em><b>Sup</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_DEFINITION_INTERVAL__SUP = eINSTANCE.getNumberDefinitionInterval_Sup();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeBaseImpl <em>Data Type Base</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeBaseImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeBase()
     * @generated
     */
    EClass DATA_TYPE_BASE = eINSTANCE.getDataTypeBase();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE_BASE__TYPE = eINSTANCE.getDataTypeBase_Type();

    /**
     * The meta object literal for the '<em><b>Definition Set</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_BASE__DEFINITION_SET = eINSTANCE.getDataTypeBase_DefinitionSet();

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
     * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE_COLLECTION__MODE = eINSTANCE.getDataTypeCollection_Mode();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_COLLECTION__TYPE = eINSTANCE.getDataTypeCollection_Type();

    /**
     * The meta object literal for the '<em><b>Definition Set</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_COLLECTION__DEFINITION_SET = eINSTANCE.getDataTypeCollection_DefinitionSet();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeCompoundImpl <em>Data Type Compound</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeCompoundImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeCompound()
     * @generated
     */
    EClass DATA_TYPE_COMPOUND = eINSTANCE.getDataTypeCompound();

    /**
     * The meta object literal for the '<em><b>Compound</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_COMPOUND__COMPOUND = eINSTANCE.getDataTypeCompound_Compound();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.XBinaryOperationImpl <em>XBinary Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.XBinaryOperationImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getXBinaryOperation()
     * @generated
     */
    EClass XBINARY_OPERATION = eINSTANCE.getXBinaryOperation();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XBINARY_OPERATION__LEFT_OPERAND = eINSTANCE.getXBinaryOperation_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XBINARY_OPERATION__FEATURE = eINSTANCE.getXBinaryOperation_Feature();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XBINARY_OPERATION__RIGHT_OPERAND = eINSTANCE.getXBinaryOperation_RightOperand();

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
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.EnumLiteralImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getEnumLiteral()
     * @generated
     */
    EClass ENUM_LITERAL = eINSTANCE.getEnumLiteral();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_LITERAL__ELEMENT = eINSTANCE.getEnumLiteral_Element();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_LITERAL__NAME = eINSTANCE.getEnumLiteral_Name();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.SignalLiteralImpl <em>Signal Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.SignalLiteralImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getSignalLiteral()
     * @generated
     */
    EClass SIGNAL_LITERAL = eINSTANCE.getSignalLiteral();

    /**
     * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNAL_LITERAL__SIGNAL = eINSTANCE.getSignalLiteral_Signal();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.IfExpressionImpl <em>If Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.IfExpressionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getIfExpression()
     * @generated
     */
    EClass IF_EXPRESSION = eINSTANCE.getIfExpression();

    /**
     * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_EXPRESSION__IF = eINSTANCE.getIfExpression_If();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_EXPRESSION__THEN = eINSTANCE.getIfExpression_Then();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_EXPRESSION__ELSE = eINSTANCE.getIfExpression_Else();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.SwitchExpressionImpl <em>Switch Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.SwitchExpressionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getSwitchExpression()
     * @generated
     */
    EClass SWITCH_EXPRESSION = eINSTANCE.getSwitchExpression();

    /**
     * The meta object literal for the '<em><b>Switch</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_EXPRESSION__SWITCH = eINSTANCE.getSwitchExpression_Switch();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_EXPRESSION__CASES = eINSTANCE.getSwitchExpression_Cases();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_EXPRESSION__DEFAULT = eINSTANCE.getSwitchExpression_Default();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.ForEachExpressionImpl <em>For Each Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.ForEachExpressionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getForEachExpression()
     * @generated
     */
    EClass FOR_EACH_EXPRESSION = eINSTANCE.getForEachExpression();

    /**
     * The meta object literal for the '<em><b>For Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_EACH_EXPRESSION__FOR_EXPRESSION = eINSTANCE.getForEachExpression_ForExpression();

    /**
     * The meta object literal for the '<em><b>Each Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_EACH_EXPRESSION__EACH_EXPRESSION = eINSTANCE.getForEachExpression_EachExpression();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.FunctionCallExpressionImpl <em>Function Call Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.FunctionCallExpressionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getFunctionCallExpression()
     * @generated
     */
    EClass FUNCTION_CALL_EXPRESSION = eINSTANCE.getFunctionCallExpression();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_CALL_EXPRESSION__FUNCTION = eINSTANCE.getFunctionCallExpression_Function();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL_EXPRESSION__ARGUMENTS = eINSTANCE.getFunctionCallExpression_Arguments();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.BooleanLiteralImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getBooleanLiteral()
     * @generated
     */
    EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

    /**
     * The meta object literal for the '<em><b>Is True</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_LITERAL__IS_TRUE = eINSTANCE.getBooleanLiteral_IsTrue();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.NullLiteralImpl <em>Null Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.NullLiteralImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getNullLiteral()
     * @generated
     */
    EClass NULL_LITERAL = eINSTANCE.getNullLiteral();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.NumberLiteralImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberLiteral()
     * @generated
     */
    EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_LITERAL__VALUE = eINSTANCE.getNumberLiteral_Value();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.StringLiteralImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.TimeLiteralNowImpl <em>Time Literal Now</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.TimeLiteralNowImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getTimeLiteralNow()
     * @generated
     */
    EClass TIME_LITERAL_NOW = eINSTANCE.getTimeLiteralNow();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.TimeLiteralImpl <em>Time Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.TimeLiteralImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getTimeLiteral()
     * @generated
     */
    EClass TIME_LITERAL = eINSTANCE.getTimeLiteral();

    /**
     * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_LITERAL__YEAR = eINSTANCE.getTimeLiteral_Year();

    /**
     * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_LITERAL__MONTH = eINSTANCE.getTimeLiteral_Month();

    /**
     * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_LITERAL__DAY = eINSTANCE.getTimeLiteral_Day();

    /**
     * The meta object literal for the '<em><b>Hour</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_LITERAL__HOUR = eINSTANCE.getTimeLiteral_Hour();

    /**
     * The meta object literal for the '<em><b>Minute</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_LITERAL__MINUTE = eINSTANCE.getTimeLiteral_Minute();

    /**
     * The meta object literal for the '<em><b>Second</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_LITERAL__SECOND = eINSTANCE.getTimeLiteral_Second();

  }

} //LilPackage
