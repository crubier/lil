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
   * The feature id for the '<em><b>Definition Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__DEFINITION_SET = 2;

  /**
   * The feature id for the '<em><b>Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__MODE = 3;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__SOURCE = 4;

  /**
   * The feature id for the '<em><b>Destinations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__DESTINATIONS = 5;

  /**
   * The number of structural features of the '<em>Signal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_FEATURE_COUNT = 6;

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
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_SET__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Definition Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_SET_FEATURE_COUNT = 1;

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
   * The feature id for the '<em><b>Base</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__BASE = 0;

  /**
   * The feature id for the '<em><b>Compound</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__COMPOUND = 1;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeCompoundImpl <em>Data Type Compound</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeCompoundImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeCompound()
   * @generated
   */
  int DATA_TYPE_COMPOUND = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_COMPOUND__NAME = 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_COMPOUND__FIELDS = 1;

  /**
   * The number of structural features of the '<em>Data Type Compound</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_COMPOUND_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeCompoundFieldImpl <em>Data Type Compound Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeCompoundFieldImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeCompoundField()
   * @generated
   */
  int DATA_TYPE_COMPOUND_FIELD = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_COMPOUND_FIELD__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_COMPOUND_FIELD__TYPE = 1;

  /**
   * The number of structural features of the '<em>Data Type Compound Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_COMPOUND_FIELD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.BehaviorImpl <em>Behavior</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.BehaviorImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getBehavior()
   * @generated
   */
  int BEHAVIOR = 15;

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
  int CAUSE = 16;

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
  int ON_CAUSE = 17;

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
  int WHEN_CAUSE = 18;

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
  int EFFECT = 19;

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
  int ALWAYS_EFFECT = 20;

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
  int SET_EFFECT = 21;

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
  int TRIGGER_EFFECT = 22;

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
   * The meta object id for the '{@link com.crubier.lil.lil.impl.XExpressionImpl <em>XExpression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.XExpressionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getXExpression()
   * @generated
   */
  int XEXPRESSION = 23;

  /**
   * The number of structural features of the '<em>XExpression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.XCollectionLiteralImpl <em>XCollection Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.XCollectionLiteralImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getXCollectionLiteral()
   * @generated
   */
  int XCOLLECTION_LITERAL = 24;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCOLLECTION_LITERAL__ELEMENTS = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XCollection Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCOLLECTION_LITERAL_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.XSetLiteralImpl <em>XSet Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.XSetLiteralImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getXSetLiteral()
   * @generated
   */
  int XSET_LITERAL = 25;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSET_LITERAL__ELEMENTS = XCOLLECTION_LITERAL__ELEMENTS;

  /**
   * The number of structural features of the '<em>XSet Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSET_LITERAL_FEATURE_COUNT = XCOLLECTION_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.XListLiteralImpl <em>XList Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.XListLiteralImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getXListLiteral()
   * @generated
   */
  int XLIST_LITERAL = 26;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XLIST_LITERAL__ELEMENTS = XCOLLECTION_LITERAL__ELEMENTS;

  /**
   * The number of structural features of the '<em>XList Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XLIST_LITERAL_FEATURE_COUNT = XCOLLECTION_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.XCasePartImpl <em>XCase Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.XCasePartImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getXCasePart()
   * @generated
   */
  int XCASE_PART = 27;

  /**
   * The feature id for the '<em><b>Case</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCASE_PART__CASE = 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCASE_PART__THEN = 1;

  /**
   * The number of structural features of the '<em>XCase Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCASE_PART_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.XEnumElementImpl <em>XEnum Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.XEnumElementImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getXEnumElement()
   * @generated
   */
  int XENUM_ELEMENT = 28;

  /**
   * The number of structural features of the '<em>XEnum Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XENUM_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.XBinaryOperationImpl <em>XBinary Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.XBinaryOperationImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getXBinaryOperation()
   * @generated
   */
  int XBINARY_OPERATION = 29;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBINARY_OPERATION__LEFT_OPERAND = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBINARY_OPERATION__FEATURE = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBINARY_OPERATION__RIGHT_OPERAND = XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>XBinary Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBINARY_OPERATION_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.XUnaryOperationImpl <em>XUnary Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.XUnaryOperationImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getXUnaryOperation()
   * @generated
   */
  int XUNARY_OPERATION = 30;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XUNARY_OPERATION__FEATURE = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XUNARY_OPERATION__OPERAND = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>XUnary Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XUNARY_OPERATION_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.XEnumLiteralImpl <em>XEnum Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.XEnumLiteralImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getXEnumLiteral()
   * @generated
   */
  int XENUM_LITERAL = 31;

  /**
   * The feature id for the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XENUM_LITERAL__ELEMENT = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XENUM_LITERAL__NAME = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>XEnum Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XENUM_LITERAL_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.XSignalLiteralImpl <em>XSignal Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.XSignalLiteralImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getXSignalLiteral()
   * @generated
   */
  int XSIGNAL_LITERAL = 32;

  /**
   * The feature id for the '<em><b>Signal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSIGNAL_LITERAL__SIGNAL = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XSignal Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSIGNAL_LITERAL_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.XIfExpressionImpl <em>XIf Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.XIfExpressionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getXIfExpression()
   * @generated
   */
  int XIF_EXPRESSION = 33;

  /**
   * The feature id for the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XIF_EXPRESSION__IF = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XIF_EXPRESSION__THEN = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XIF_EXPRESSION__ELSE = XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>XIf Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XIF_EXPRESSION_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.XSwitchExpressionImpl <em>XSwitch Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.XSwitchExpressionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getXSwitchExpression()
   * @generated
   */
  int XSWITCH_EXPRESSION = 34;

  /**
   * The feature id for the '<em><b>Switch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSWITCH_EXPRESSION__SWITCH = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSWITCH_EXPRESSION__CASES = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSWITCH_EXPRESSION__DEFAULT = XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>XSwitch Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSWITCH_EXPRESSION_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.XForEachExpressionImpl <em>XFor Each Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.XForEachExpressionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getXForEachExpression()
   * @generated
   */
  int XFOR_EACH_EXPRESSION = 35;

  /**
   * The feature id for the '<em><b>For Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XFOR_EACH_EXPRESSION__FOR_EXPRESSION = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Each Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XFOR_EACH_EXPRESSION__EACH_EXPRESSION = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>XFor Each Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XFOR_EACH_EXPRESSION_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.XFunctionCallExpressionImpl <em>XFunction Call Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.XFunctionCallExpressionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getXFunctionCallExpression()
   * @generated
   */
  int XFUNCTION_CALL_EXPRESSION = 36;

  /**
   * The feature id for the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XFUNCTION_CALL_EXPRESSION__FUNCTION = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XFUNCTION_CALL_EXPRESSION__ARGUMENTS = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>XFunction Call Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XFUNCTION_CALL_EXPRESSION_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.XBooleanLiteralImpl <em>XBoolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.XBooleanLiteralImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getXBooleanLiteral()
   * @generated
   */
  int XBOOLEAN_LITERAL = 37;

  /**
   * The feature id for the '<em><b>Is True</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBOOLEAN_LITERAL__IS_TRUE = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XBoolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBOOLEAN_LITERAL_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.XNullLiteralImpl <em>XNull Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.XNullLiteralImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getXNullLiteral()
   * @generated
   */
  int XNULL_LITERAL = 38;

  /**
   * The number of structural features of the '<em>XNull Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XNULL_LITERAL_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.XNumberLiteralImpl <em>XNumber Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.XNumberLiteralImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getXNumberLiteral()
   * @generated
   */
  int XNUMBER_LITERAL = 39;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XNUMBER_LITERAL__VALUE = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XNumber Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XNUMBER_LITERAL_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.XStringLiteralImpl <em>XString Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.XStringLiteralImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getXStringLiteral()
   * @generated
   */
  int XSTRING_LITERAL = 40;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSTRING_LITERAL__VALUE = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XString Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSTRING_LITERAL_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 1;


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
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.Signal#getDefinitionSet <em>Definition Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Definition Set</em>'.
   * @see com.crubier.lil.lil.Signal#getDefinitionSet()
   * @see #getSignal()
   * @generated
   */
  EReference getSignal_DefinitionSet();

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
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.DefinitionSet#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see com.crubier.lil.lil.DefinitionSet#getElements()
   * @see #getDefinitionSet()
   * @generated
   */
  EReference getDefinitionSet_Elements();

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
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.DataType#getCompound <em>Compound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Compound</em>'.
   * @see com.crubier.lil.lil.DataType#getCompound()
   * @see #getDataType()
   * @generated
   */
  EReference getDataType_Compound();

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
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.DataTypeCompound#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.crubier.lil.lil.DataTypeCompound#getName()
   * @see #getDataTypeCompound()
   * @generated
   */
  EAttribute getDataTypeCompound_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.DataTypeCompound#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see com.crubier.lil.lil.DataTypeCompound#getFields()
   * @see #getDataTypeCompound()
   * @generated
   */
  EReference getDataTypeCompound_Fields();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeCompoundField <em>Data Type Compound Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Compound Field</em>'.
   * @see com.crubier.lil.lil.DataTypeCompoundField
   * @generated
   */
  EClass getDataTypeCompoundField();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.DataTypeCompoundField#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.crubier.lil.lil.DataTypeCompoundField#getName()
   * @see #getDataTypeCompoundField()
   * @generated
   */
  EAttribute getDataTypeCompoundField_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.DataTypeCompoundField#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.crubier.lil.lil.DataTypeCompoundField#getType()
   * @see #getDataTypeCompoundField()
   * @generated
   */
  EReference getDataTypeCompoundField_Type();

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
   * Returns the meta object for class '{@link com.crubier.lil.lil.XExpression <em>XExpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XExpression</em>'.
   * @see com.crubier.lil.lil.XExpression
   * @generated
   */
  EClass getXExpression();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.XCollectionLiteral <em>XCollection Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XCollection Literal</em>'.
   * @see com.crubier.lil.lil.XCollectionLiteral
   * @generated
   */
  EClass getXCollectionLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.XCollectionLiteral#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see com.crubier.lil.lil.XCollectionLiteral#getElements()
   * @see #getXCollectionLiteral()
   * @generated
   */
  EReference getXCollectionLiteral_Elements();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.XSetLiteral <em>XSet Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XSet Literal</em>'.
   * @see com.crubier.lil.lil.XSetLiteral
   * @generated
   */
  EClass getXSetLiteral();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.XListLiteral <em>XList Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XList Literal</em>'.
   * @see com.crubier.lil.lil.XListLiteral
   * @generated
   */
  EClass getXListLiteral();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.XCasePart <em>XCase Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XCase Part</em>'.
   * @see com.crubier.lil.lil.XCasePart
   * @generated
   */
  EClass getXCasePart();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.XCasePart#getCase <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Case</em>'.
   * @see com.crubier.lil.lil.XCasePart#getCase()
   * @see #getXCasePart()
   * @generated
   */
  EReference getXCasePart_Case();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.XCasePart#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see com.crubier.lil.lil.XCasePart#getThen()
   * @see #getXCasePart()
   * @generated
   */
  EReference getXCasePart_Then();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.XEnumElement <em>XEnum Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XEnum Element</em>'.
   * @see com.crubier.lil.lil.XEnumElement
   * @generated
   */
  EClass getXEnumElement();

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
   * Returns the meta object for class '{@link com.crubier.lil.lil.XUnaryOperation <em>XUnary Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XUnary Operation</em>'.
   * @see com.crubier.lil.lil.XUnaryOperation
   * @generated
   */
  EClass getXUnaryOperation();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.XUnaryOperation#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature</em>'.
   * @see com.crubier.lil.lil.XUnaryOperation#getFeature()
   * @see #getXUnaryOperation()
   * @generated
   */
  EAttribute getXUnaryOperation_Feature();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.XUnaryOperation#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand</em>'.
   * @see com.crubier.lil.lil.XUnaryOperation#getOperand()
   * @see #getXUnaryOperation()
   * @generated
   */
  EReference getXUnaryOperation_Operand();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.XEnumLiteral <em>XEnum Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XEnum Literal</em>'.
   * @see com.crubier.lil.lil.XEnumLiteral
   * @generated
   */
  EClass getXEnumLiteral();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.XEnumLiteral#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Element</em>'.
   * @see com.crubier.lil.lil.XEnumLiteral#getElement()
   * @see #getXEnumLiteral()
   * @generated
   */
  EReference getXEnumLiteral_Element();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.XEnumLiteral#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.crubier.lil.lil.XEnumLiteral#getName()
   * @see #getXEnumLiteral()
   * @generated
   */
  EAttribute getXEnumLiteral_Name();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.XSignalLiteral <em>XSignal Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XSignal Literal</em>'.
   * @see com.crubier.lil.lil.XSignalLiteral
   * @generated
   */
  EClass getXSignalLiteral();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.XSignalLiteral#getSignal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Signal</em>'.
   * @see com.crubier.lil.lil.XSignalLiteral#getSignal()
   * @see #getXSignalLiteral()
   * @generated
   */
  EReference getXSignalLiteral_Signal();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.XIfExpression <em>XIf Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XIf Expression</em>'.
   * @see com.crubier.lil.lil.XIfExpression
   * @generated
   */
  EClass getXIfExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.XIfExpression#getIf <em>If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If</em>'.
   * @see com.crubier.lil.lil.XIfExpression#getIf()
   * @see #getXIfExpression()
   * @generated
   */
  EReference getXIfExpression_If();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.XIfExpression#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see com.crubier.lil.lil.XIfExpression#getThen()
   * @see #getXIfExpression()
   * @generated
   */
  EReference getXIfExpression_Then();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.XIfExpression#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see com.crubier.lil.lil.XIfExpression#getElse()
   * @see #getXIfExpression()
   * @generated
   */
  EReference getXIfExpression_Else();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.XSwitchExpression <em>XSwitch Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XSwitch Expression</em>'.
   * @see com.crubier.lil.lil.XSwitchExpression
   * @generated
   */
  EClass getXSwitchExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.XSwitchExpression#getSwitch <em>Switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Switch</em>'.
   * @see com.crubier.lil.lil.XSwitchExpression#getSwitch()
   * @see #getXSwitchExpression()
   * @generated
   */
  EReference getXSwitchExpression_Switch();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.XSwitchExpression#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see com.crubier.lil.lil.XSwitchExpression#getCases()
   * @see #getXSwitchExpression()
   * @generated
   */
  EReference getXSwitchExpression_Cases();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.XSwitchExpression#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default</em>'.
   * @see com.crubier.lil.lil.XSwitchExpression#getDefault()
   * @see #getXSwitchExpression()
   * @generated
   */
  EReference getXSwitchExpression_Default();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.XForEachExpression <em>XFor Each Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XFor Each Expression</em>'.
   * @see com.crubier.lil.lil.XForEachExpression
   * @generated
   */
  EClass getXForEachExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.XForEachExpression#getForExpression <em>For Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>For Expression</em>'.
   * @see com.crubier.lil.lil.XForEachExpression#getForExpression()
   * @see #getXForEachExpression()
   * @generated
   */
  EReference getXForEachExpression_ForExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.XForEachExpression#getEachExpression <em>Each Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Each Expression</em>'.
   * @see com.crubier.lil.lil.XForEachExpression#getEachExpression()
   * @see #getXForEachExpression()
   * @generated
   */
  EReference getXForEachExpression_EachExpression();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.XFunctionCallExpression <em>XFunction Call Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XFunction Call Expression</em>'.
   * @see com.crubier.lil.lil.XFunctionCallExpression
   * @generated
   */
  EClass getXFunctionCallExpression();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.XFunctionCallExpression#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function</em>'.
   * @see com.crubier.lil.lil.XFunctionCallExpression#getFunction()
   * @see #getXFunctionCallExpression()
   * @generated
   */
  EAttribute getXFunctionCallExpression_Function();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.XFunctionCallExpression#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see com.crubier.lil.lil.XFunctionCallExpression#getArguments()
   * @see #getXFunctionCallExpression()
   * @generated
   */
  EReference getXFunctionCallExpression_Arguments();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.XBooleanLiteral <em>XBoolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XBoolean Literal</em>'.
   * @see com.crubier.lil.lil.XBooleanLiteral
   * @generated
   */
  EClass getXBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.XBooleanLiteral#isIsTrue <em>Is True</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is True</em>'.
   * @see com.crubier.lil.lil.XBooleanLiteral#isIsTrue()
   * @see #getXBooleanLiteral()
   * @generated
   */
  EAttribute getXBooleanLiteral_IsTrue();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.XNullLiteral <em>XNull Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XNull Literal</em>'.
   * @see com.crubier.lil.lil.XNullLiteral
   * @generated
   */
  EClass getXNullLiteral();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.XNumberLiteral <em>XNumber Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XNumber Literal</em>'.
   * @see com.crubier.lil.lil.XNumberLiteral
   * @generated
   */
  EClass getXNumberLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.XNumberLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.crubier.lil.lil.XNumberLiteral#getValue()
   * @see #getXNumberLiteral()
   * @generated
   */
  EAttribute getXNumberLiteral_Value();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.XStringLiteral <em>XString Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XString Literal</em>'.
   * @see com.crubier.lil.lil.XStringLiteral
   * @generated
   */
  EClass getXStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.XStringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.crubier.lil.lil.XStringLiteral#getValue()
   * @see #getXStringLiteral()
   * @generated
   */
  EAttribute getXStringLiteral_Value();

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
     * The meta object literal for the '<em><b>Definition Set</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNAL__DEFINITION_SET = eINSTANCE.getSignal_DefinitionSet();

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
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITION_SET__ELEMENTS = eINSTANCE.getDefinitionSet_Elements();

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
     * The meta object literal for the '<em><b>Base</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE__BASE = eINSTANCE.getDataType_Base();

    /**
     * The meta object literal for the '<em><b>Compound</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE__COMPOUND = eINSTANCE.getDataType_Compound();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE_COMPOUND__NAME = eINSTANCE.getDataTypeCompound_Name();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_COMPOUND__FIELDS = eINSTANCE.getDataTypeCompound_Fields();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeCompoundFieldImpl <em>Data Type Compound Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeCompoundFieldImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeCompoundField()
     * @generated
     */
    EClass DATA_TYPE_COMPOUND_FIELD = eINSTANCE.getDataTypeCompoundField();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE_COMPOUND_FIELD__NAME = eINSTANCE.getDataTypeCompoundField_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_COMPOUND_FIELD__TYPE = eINSTANCE.getDataTypeCompoundField_Type();

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
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.XExpressionImpl <em>XExpression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.XExpressionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getXExpression()
     * @generated
     */
    EClass XEXPRESSION = eINSTANCE.getXExpression();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.XCollectionLiteralImpl <em>XCollection Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.XCollectionLiteralImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getXCollectionLiteral()
     * @generated
     */
    EClass XCOLLECTION_LITERAL = eINSTANCE.getXCollectionLiteral();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XCOLLECTION_LITERAL__ELEMENTS = eINSTANCE.getXCollectionLiteral_Elements();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.XSetLiteralImpl <em>XSet Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.XSetLiteralImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getXSetLiteral()
     * @generated
     */
    EClass XSET_LITERAL = eINSTANCE.getXSetLiteral();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.XListLiteralImpl <em>XList Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.XListLiteralImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getXListLiteral()
     * @generated
     */
    EClass XLIST_LITERAL = eINSTANCE.getXListLiteral();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.XCasePartImpl <em>XCase Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.XCasePartImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getXCasePart()
     * @generated
     */
    EClass XCASE_PART = eINSTANCE.getXCasePart();

    /**
     * The meta object literal for the '<em><b>Case</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XCASE_PART__CASE = eINSTANCE.getXCasePart_Case();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XCASE_PART__THEN = eINSTANCE.getXCasePart_Then();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.XEnumElementImpl <em>XEnum Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.XEnumElementImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getXEnumElement()
     * @generated
     */
    EClass XENUM_ELEMENT = eINSTANCE.getXEnumElement();

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
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.XUnaryOperationImpl <em>XUnary Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.XUnaryOperationImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getXUnaryOperation()
     * @generated
     */
    EClass XUNARY_OPERATION = eINSTANCE.getXUnaryOperation();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XUNARY_OPERATION__FEATURE = eINSTANCE.getXUnaryOperation_Feature();

    /**
     * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XUNARY_OPERATION__OPERAND = eINSTANCE.getXUnaryOperation_Operand();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.XEnumLiteralImpl <em>XEnum Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.XEnumLiteralImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getXEnumLiteral()
     * @generated
     */
    EClass XENUM_LITERAL = eINSTANCE.getXEnumLiteral();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XENUM_LITERAL__ELEMENT = eINSTANCE.getXEnumLiteral_Element();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XENUM_LITERAL__NAME = eINSTANCE.getXEnumLiteral_Name();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.XSignalLiteralImpl <em>XSignal Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.XSignalLiteralImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getXSignalLiteral()
     * @generated
     */
    EClass XSIGNAL_LITERAL = eINSTANCE.getXSignalLiteral();

    /**
     * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XSIGNAL_LITERAL__SIGNAL = eINSTANCE.getXSignalLiteral_Signal();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.XIfExpressionImpl <em>XIf Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.XIfExpressionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getXIfExpression()
     * @generated
     */
    EClass XIF_EXPRESSION = eINSTANCE.getXIfExpression();

    /**
     * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XIF_EXPRESSION__IF = eINSTANCE.getXIfExpression_If();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XIF_EXPRESSION__THEN = eINSTANCE.getXIfExpression_Then();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XIF_EXPRESSION__ELSE = eINSTANCE.getXIfExpression_Else();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.XSwitchExpressionImpl <em>XSwitch Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.XSwitchExpressionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getXSwitchExpression()
     * @generated
     */
    EClass XSWITCH_EXPRESSION = eINSTANCE.getXSwitchExpression();

    /**
     * The meta object literal for the '<em><b>Switch</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XSWITCH_EXPRESSION__SWITCH = eINSTANCE.getXSwitchExpression_Switch();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XSWITCH_EXPRESSION__CASES = eINSTANCE.getXSwitchExpression_Cases();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XSWITCH_EXPRESSION__DEFAULT = eINSTANCE.getXSwitchExpression_Default();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.XForEachExpressionImpl <em>XFor Each Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.XForEachExpressionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getXForEachExpression()
     * @generated
     */
    EClass XFOR_EACH_EXPRESSION = eINSTANCE.getXForEachExpression();

    /**
     * The meta object literal for the '<em><b>For Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XFOR_EACH_EXPRESSION__FOR_EXPRESSION = eINSTANCE.getXForEachExpression_ForExpression();

    /**
     * The meta object literal for the '<em><b>Each Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XFOR_EACH_EXPRESSION__EACH_EXPRESSION = eINSTANCE.getXForEachExpression_EachExpression();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.XFunctionCallExpressionImpl <em>XFunction Call Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.XFunctionCallExpressionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getXFunctionCallExpression()
     * @generated
     */
    EClass XFUNCTION_CALL_EXPRESSION = eINSTANCE.getXFunctionCallExpression();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XFUNCTION_CALL_EXPRESSION__FUNCTION = eINSTANCE.getXFunctionCallExpression_Function();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XFUNCTION_CALL_EXPRESSION__ARGUMENTS = eINSTANCE.getXFunctionCallExpression_Arguments();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.XBooleanLiteralImpl <em>XBoolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.XBooleanLiteralImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getXBooleanLiteral()
     * @generated
     */
    EClass XBOOLEAN_LITERAL = eINSTANCE.getXBooleanLiteral();

    /**
     * The meta object literal for the '<em><b>Is True</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XBOOLEAN_LITERAL__IS_TRUE = eINSTANCE.getXBooleanLiteral_IsTrue();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.XNullLiteralImpl <em>XNull Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.XNullLiteralImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getXNullLiteral()
     * @generated
     */
    EClass XNULL_LITERAL = eINSTANCE.getXNullLiteral();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.XNumberLiteralImpl <em>XNumber Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.XNumberLiteralImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getXNumberLiteral()
     * @generated
     */
    EClass XNUMBER_LITERAL = eINSTANCE.getXNumberLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XNUMBER_LITERAL__VALUE = eINSTANCE.getXNumberLiteral_Value();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.XStringLiteralImpl <em>XString Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.XStringLiteralImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getXStringLiteral()
     * @generated
     */
    EClass XSTRING_LITERAL = eINSTANCE.getXStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XSTRING_LITERAL__VALUE = eINSTANCE.getXStringLiteral_Value();

  }

} //LilPackage
