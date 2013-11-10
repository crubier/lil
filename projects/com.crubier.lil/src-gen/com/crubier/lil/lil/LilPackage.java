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
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ModelImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Interactors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__INTERACTORS = 0;

  /**
   * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DATA_TYPES = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.InteractorDeclarationImpl <em>Interactor Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.InteractorDeclarationImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorDeclaration()
   * @generated
   */
  int INTERACTOR_DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DECLARATION__ENTITIES = 1;

  /**
   * The feature id for the '<em><b>Signals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DECLARATION__SIGNALS = 2;

  /**
   * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DECLARATION__BEHAVIORS = 3;

  /**
   * The number of structural features of the '<em>Interactor Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTOR_DECLARATION_FEATURE_COUNT = 4;

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
   * The feature id for the '<em><b>Specific</b></em>' containment reference.
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
   * The feature id for the '<em><b>Instance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__INSTANCE = 0;

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
   * The feature id for the '<em><b>Instance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__INSTANCE = 0;

  /**
   * The number of structural features of the '<em>Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ComponentImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 5;

  /**
   * The feature id for the '<em><b>Instance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__INSTANCE = 0;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.EntityDeclarationImpl <em>Entity Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.EntityDeclarationImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getEntityDeclaration()
   * @generated
   */
  int ENTITY_DECLARATION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Entity Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ActorDeclarationImpl <em>Actor Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ActorDeclarationImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getActorDeclaration()
   * @generated
   */
  int ACTOR_DECLARATION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_DECLARATION__NAME = ENTITY_DECLARATION__NAME;

  /**
   * The number of structural features of the '<em>Actor Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_DECLARATION_FEATURE_COUNT = ENTITY_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ActorAliasImpl <em>Actor Alias</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ActorAliasImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getActorAlias()
   * @generated
   */
  int ACTOR_ALIAS = 8;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_ALIAS__SOURCE = 0;

  /**
   * The feature id for the '<em><b>Remote</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_ALIAS__REMOTE = 1;

  /**
   * The number of structural features of the '<em>Actor Alias</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_ALIAS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ComponentDeclarationImpl <em>Component Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ComponentDeclarationImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getComponentDeclaration()
   * @generated
   */
  int COMPONENT_DECLARATION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DECLARATION__NAME = ENTITY_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Interactor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DECLARATION__INTERACTOR = ENTITY_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Aliases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DECLARATION__ALIASES = ENTITY_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Component Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DECLARATION_FEATURE_COUNT = ENTITY_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.EventReceptionImpl <em>Event Reception</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.EventReceptionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getEventReception()
   * @generated
   */
  int EVENT_RECEPTION = 10;

  /**
   * The feature id for the '<em><b>Instance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_RECEPTION__INSTANCE = 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_RECEPTION__SOURCE = 1;

  /**
   * The feature id for the '<em><b>Base</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_RECEPTION__BASE = 2;

  /**
   * The number of structural features of the '<em>Event Reception</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_RECEPTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.FlowReceptionImpl <em>Flow Reception</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.FlowReceptionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getFlowReception()
   * @generated
   */
  int FLOW_RECEPTION = 11;

  /**
   * The feature id for the '<em><b>Instance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_RECEPTION__INSTANCE = 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_RECEPTION__SOURCE = 1;

  /**
   * The number of structural features of the '<em>Flow Reception</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_RECEPTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.EventEmissionImpl <em>Event Emission</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.EventEmissionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getEventEmission()
   * @generated
   */
  int EVENT_EMISSION = 12;

  /**
   * The feature id for the '<em><b>Instance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_EMISSION__INSTANCE = 0;

  /**
   * The feature id for the '<em><b>Destination</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_EMISSION__DESTINATION = 1;

  /**
   * The number of structural features of the '<em>Event Emission</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_EMISSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.FlowEmissionImpl <em>Flow Emission</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.FlowEmissionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getFlowEmission()
   * @generated
   */
  int FLOW_EMISSION = 13;

  /**
   * The feature id for the '<em><b>Instance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_EMISSION__INSTANCE = 0;

  /**
   * The feature id for the '<em><b>Destination</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_EMISSION__DESTINATION = 1;

  /**
   * The number of structural features of the '<em>Flow Emission</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_EMISSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.SignalDeclarationImpl <em>Signal Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.SignalDeclarationImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getSignalDeclaration()
   * @generated
   */
  int SIGNAL_DECLARATION = 14;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_DECLARATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_DECLARATION__NAME = 1;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_DECLARATION__SOURCE = 2;

  /**
   * The feature id for the '<em><b>Destinations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_DECLARATION__DESTINATIONS = 3;

  /**
   * The number of structural features of the '<em>Signal Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_DECLARATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.EventDeclarationImpl <em>Event Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.EventDeclarationImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getEventDeclaration()
   * @generated
   */
  int EVENT_DECLARATION = 15;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DECLARATION__TYPE = SIGNAL_DECLARATION__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DECLARATION__NAME = SIGNAL_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DECLARATION__SOURCE = SIGNAL_DECLARATION__SOURCE;

  /**
   * The feature id for the '<em><b>Destinations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DECLARATION__DESTINATIONS = SIGNAL_DECLARATION__DESTINATIONS;

  /**
   * The number of structural features of the '<em>Event Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DECLARATION_FEATURE_COUNT = SIGNAL_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.FlowDeclarationImpl <em>Flow Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.FlowDeclarationImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getFlowDeclaration()
   * @generated
   */
  int FLOW_DECLARATION = 16;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_DECLARATION__TYPE = SIGNAL_DECLARATION__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_DECLARATION__NAME = SIGNAL_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_DECLARATION__SOURCE = SIGNAL_DECLARATION__SOURCE;

  /**
   * The feature id for the '<em><b>Destinations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_DECLARATION__DESTINATIONS = SIGNAL_DECLARATION__DESTINATIONS;

  /**
   * The number of structural features of the '<em>Flow Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_DECLARATION_FEATURE_COUNT = SIGNAL_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.BehaviorDeclarationImpl <em>Behavior Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.BehaviorDeclarationImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getBehaviorDeclaration()
   * @generated
   */
  int BEHAVIOR_DECLARATION = 17;

  /**
   * The feature id for the '<em><b>Cause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_DECLARATION__CAUSE = 0;

  /**
   * The feature id for the '<em><b>Effects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_DECLARATION__EFFECTS = 1;

  /**
   * The number of structural features of the '<em>Behavior Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.CauseImpl <em>Cause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.CauseImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getCause()
   * @generated
   */
  int CAUSE = 18;

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
  int ON_CAUSE = 19;

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
  int WHEN_CAUSE = 20;

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
  int EFFECT = 21;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT__VALUE = 0;

  /**
   * The number of structural features of the '<em>Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.AlwaysEffectImpl <em>Always Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.AlwaysEffectImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getAlwaysEffect()
   * @generated
   */
  int ALWAYS_EFFECT = 22;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALWAYS_EFFECT__VALUE = EFFECT__VALUE;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALWAYS_EFFECT__TARGET = EFFECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Always Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALWAYS_EFFECT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.SetEffectImpl <em>Set Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.SetEffectImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getSetEffect()
   * @generated
   */
  int SET_EFFECT = 23;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_EFFECT__VALUE = EFFECT__VALUE;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_EFFECT__TARGET = EFFECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Set Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_EFFECT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.TriggerEffectImpl <em>Trigger Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.TriggerEffectImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getTriggerEffect()
   * @generated
   */
  int TRIGGER_EFFECT = 24;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER_EFFECT__VALUE = EFFECT__VALUE;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER_EFFECT__TARGET = EFFECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Trigger Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER_EFFECT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeCompoundDeclarationImpl <em>Data Type Compound Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeCompoundDeclarationImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeCompoundDeclaration()
   * @generated
   */
  int DATA_TYPE_COMPOUND_DECLARATION = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_COMPOUND_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_COMPOUND_DECLARATION__FIELDS = 1;

  /**
   * The number of structural features of the '<em>Data Type Compound Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_COMPOUND_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeCompoundFieldImpl <em>Data Type Compound Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeCompoundFieldImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeCompoundField()
   * @generated
   */
  int DATA_TYPE_COMPOUND_FIELD = 26;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_COMPOUND_FIELD__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_COMPOUND_FIELD__NAME = 1;

  /**
   * The number of structural features of the '<em>Data Type Compound Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_COMPOUND_FIELD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 27;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeCompoundImpl <em>Data Type Compound</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeCompoundImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeCompound()
   * @generated
   */
  int DATA_TYPE_COMPOUND = 28;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_COMPOUND__TYPE = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Type Compound</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_COMPOUND_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeBaseImpl <em>Data Type Base</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeBaseImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeBase()
   * @generated
   */
  int DATA_TYPE_BASE = 29;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_BASE__TYPE = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Type Base</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_BASE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.crubier.lil.lil.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.Model#getInteractors <em>Interactors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interactors</em>'.
   * @see com.crubier.lil.lil.Model#getInteractors()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Interactors();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.Model#getDataTypes <em>Data Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data Types</em>'.
   * @see com.crubier.lil.lil.Model#getDataTypes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_DataTypes();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.InteractorDeclaration <em>Interactor Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interactor Declaration</em>'.
   * @see com.crubier.lil.lil.InteractorDeclaration
   * @generated
   */
  EClass getInteractorDeclaration();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.InteractorDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.crubier.lil.lil.InteractorDeclaration#getName()
   * @see #getInteractorDeclaration()
   * @generated
   */
  EAttribute getInteractorDeclaration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.InteractorDeclaration#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see com.crubier.lil.lil.InteractorDeclaration#getEntities()
   * @see #getInteractorDeclaration()
   * @generated
   */
  EReference getInteractorDeclaration_Entities();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.InteractorDeclaration#getSignals <em>Signals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signals</em>'.
   * @see com.crubier.lil.lil.InteractorDeclaration#getSignals()
   * @see #getInteractorDeclaration()
   * @generated
   */
  EReference getInteractorDeclaration_Signals();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.InteractorDeclaration#getBehaviors <em>Behaviors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Behaviors</em>'.
   * @see com.crubier.lil.lil.InteractorDeclaration#getBehaviors()
   * @see #getInteractorDeclaration()
   * @generated
   */
  EReference getInteractorDeclaration_Behaviors();

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
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.AccessibleEntity#getSpecific <em>Specific</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Specific</em>'.
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
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.Entity#getInstance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Instance</em>'.
   * @see com.crubier.lil.lil.Entity#getInstance()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Instance();

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
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.Actor#getInstance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Instance</em>'.
   * @see com.crubier.lil.lil.Actor#getInstance()
   * @see #getActor()
   * @generated
   */
  EReference getActor_Instance();

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
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.Component#getInstance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Instance</em>'.
   * @see com.crubier.lil.lil.Component#getInstance()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Instance();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.EntityDeclaration <em>Entity Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Declaration</em>'.
   * @see com.crubier.lil.lil.EntityDeclaration
   * @generated
   */
  EClass getEntityDeclaration();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.EntityDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.crubier.lil.lil.EntityDeclaration#getName()
   * @see #getEntityDeclaration()
   * @generated
   */
  EAttribute getEntityDeclaration_Name();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.ActorDeclaration <em>Actor Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actor Declaration</em>'.
   * @see com.crubier.lil.lil.ActorDeclaration
   * @generated
   */
  EClass getActorDeclaration();

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
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.ActorAlias#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see com.crubier.lil.lil.ActorAlias#getSource()
   * @see #getActorAlias()
   * @generated
   */
  EReference getActorAlias_Source();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.ActorAlias#getRemote <em>Remote</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Remote</em>'.
   * @see com.crubier.lil.lil.ActorAlias#getRemote()
   * @see #getActorAlias()
   * @generated
   */
  EReference getActorAlias_Remote();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.ComponentDeclaration <em>Component Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component Declaration</em>'.
   * @see com.crubier.lil.lil.ComponentDeclaration
   * @generated
   */
  EClass getComponentDeclaration();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.ComponentDeclaration#getInteractor <em>Interactor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Interactor</em>'.
   * @see com.crubier.lil.lil.ComponentDeclaration#getInteractor()
   * @see #getComponentDeclaration()
   * @generated
   */
  EReference getComponentDeclaration_Interactor();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.ComponentDeclaration#getAliases <em>Aliases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Aliases</em>'.
   * @see com.crubier.lil.lil.ComponentDeclaration#getAliases()
   * @see #getComponentDeclaration()
   * @generated
   */
  EReference getComponentDeclaration_Aliases();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.EventReception <em>Event Reception</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Reception</em>'.
   * @see com.crubier.lil.lil.EventReception
   * @generated
   */
  EClass getEventReception();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.EventReception#getInstance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Instance</em>'.
   * @see com.crubier.lil.lil.EventReception#getInstance()
   * @see #getEventReception()
   * @generated
   */
  EReference getEventReception_Instance();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.EventReception#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see com.crubier.lil.lil.EventReception#getSource()
   * @see #getEventReception()
   * @generated
   */
  EReference getEventReception_Source();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.EventReception#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base</em>'.
   * @see com.crubier.lil.lil.EventReception#getBase()
   * @see #getEventReception()
   * @generated
   */
  EAttribute getEventReception_Base();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.FlowReception <em>Flow Reception</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow Reception</em>'.
   * @see com.crubier.lil.lil.FlowReception
   * @generated
   */
  EClass getFlowReception();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.FlowReception#getInstance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Instance</em>'.
   * @see com.crubier.lil.lil.FlowReception#getInstance()
   * @see #getFlowReception()
   * @generated
   */
  EReference getFlowReception_Instance();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.FlowReception#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see com.crubier.lil.lil.FlowReception#getSource()
   * @see #getFlowReception()
   * @generated
   */
  EReference getFlowReception_Source();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.EventEmission <em>Event Emission</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Emission</em>'.
   * @see com.crubier.lil.lil.EventEmission
   * @generated
   */
  EClass getEventEmission();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.EventEmission#getInstance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Instance</em>'.
   * @see com.crubier.lil.lil.EventEmission#getInstance()
   * @see #getEventEmission()
   * @generated
   */
  EReference getEventEmission_Instance();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.EventEmission#getDestination <em>Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Destination</em>'.
   * @see com.crubier.lil.lil.EventEmission#getDestination()
   * @see #getEventEmission()
   * @generated
   */
  EReference getEventEmission_Destination();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.FlowEmission <em>Flow Emission</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow Emission</em>'.
   * @see com.crubier.lil.lil.FlowEmission
   * @generated
   */
  EClass getFlowEmission();

  /**
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.FlowEmission#getInstance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Instance</em>'.
   * @see com.crubier.lil.lil.FlowEmission#getInstance()
   * @see #getFlowEmission()
   * @generated
   */
  EReference getFlowEmission_Instance();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.FlowEmission#getDestination <em>Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Destination</em>'.
   * @see com.crubier.lil.lil.FlowEmission#getDestination()
   * @see #getFlowEmission()
   * @generated
   */
  EReference getFlowEmission_Destination();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.SignalDeclaration <em>Signal Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal Declaration</em>'.
   * @see com.crubier.lil.lil.SignalDeclaration
   * @generated
   */
  EClass getSignalDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.SignalDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.crubier.lil.lil.SignalDeclaration#getType()
   * @see #getSignalDeclaration()
   * @generated
   */
  EReference getSignalDeclaration_Type();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.SignalDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.crubier.lil.lil.SignalDeclaration#getName()
   * @see #getSignalDeclaration()
   * @generated
   */
  EAttribute getSignalDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.SignalDeclaration#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see com.crubier.lil.lil.SignalDeclaration#getSource()
   * @see #getSignalDeclaration()
   * @generated
   */
  EReference getSignalDeclaration_Source();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.SignalDeclaration#getDestinations <em>Destinations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Destinations</em>'.
   * @see com.crubier.lil.lil.SignalDeclaration#getDestinations()
   * @see #getSignalDeclaration()
   * @generated
   */
  EReference getSignalDeclaration_Destinations();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.EventDeclaration <em>Event Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Declaration</em>'.
   * @see com.crubier.lil.lil.EventDeclaration
   * @generated
   */
  EClass getEventDeclaration();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.FlowDeclaration <em>Flow Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow Declaration</em>'.
   * @see com.crubier.lil.lil.FlowDeclaration
   * @generated
   */
  EClass getFlowDeclaration();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.BehaviorDeclaration <em>Behavior Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Behavior Declaration</em>'.
   * @see com.crubier.lil.lil.BehaviorDeclaration
   * @generated
   */
  EClass getBehaviorDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.BehaviorDeclaration#getCause <em>Cause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cause</em>'.
   * @see com.crubier.lil.lil.BehaviorDeclaration#getCause()
   * @see #getBehaviorDeclaration()
   * @generated
   */
  EReference getBehaviorDeclaration_Cause();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.BehaviorDeclaration#getEffects <em>Effects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Effects</em>'.
   * @see com.crubier.lil.lil.BehaviorDeclaration#getEffects()
   * @see #getBehaviorDeclaration()
   * @generated
   */
  EReference getBehaviorDeclaration_Effects();

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
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.AlwaysEffect#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see com.crubier.lil.lil.AlwaysEffect#getTarget()
   * @see #getAlwaysEffect()
   * @generated
   */
  EReference getAlwaysEffect_Target();

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
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.SetEffect#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see com.crubier.lil.lil.SetEffect#getTarget()
   * @see #getSetEffect()
   * @generated
   */
  EReference getSetEffect_Target();

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
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.TriggerEffect#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see com.crubier.lil.lil.TriggerEffect#getTarget()
   * @see #getTriggerEffect()
   * @generated
   */
  EReference getTriggerEffect_Target();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeCompoundDeclaration <em>Data Type Compound Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Compound Declaration</em>'.
   * @see com.crubier.lil.lil.DataTypeCompoundDeclaration
   * @generated
   */
  EClass getDataTypeCompoundDeclaration();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.DataTypeCompoundDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.crubier.lil.lil.DataTypeCompoundDeclaration#getName()
   * @see #getDataTypeCompoundDeclaration()
   * @generated
   */
  EAttribute getDataTypeCompoundDeclaration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.DataTypeCompoundDeclaration#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see com.crubier.lil.lil.DataTypeCompoundDeclaration#getFields()
   * @see #getDataTypeCompoundDeclaration()
   * @generated
   */
  EReference getDataTypeCompoundDeclaration_Fields();

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
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see com.crubier.lil.lil.DataType
   * @generated
   */
  EClass getDataType();

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
   * Returns the meta object for the reference '{@link com.crubier.lil.lil.DataTypeCompound#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see com.crubier.lil.lil.DataTypeCompound#getType()
   * @see #getDataTypeCompound()
   * @generated
   */
  EReference getDataTypeCompound_Type();

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
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.ModelImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Interactors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__INTERACTORS = eINSTANCE.getModel_Interactors();

    /**
     * The meta object literal for the '<em><b>Data Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DATA_TYPES = eINSTANCE.getModel_DataTypes();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.InteractorDeclarationImpl <em>Interactor Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.InteractorDeclarationImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getInteractorDeclaration()
     * @generated
     */
    EClass INTERACTOR_DECLARATION = eINSTANCE.getInteractorDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERACTOR_DECLARATION__NAME = eINSTANCE.getInteractorDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_DECLARATION__ENTITIES = eINSTANCE.getInteractorDeclaration_Entities();

    /**
     * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_DECLARATION__SIGNALS = eINSTANCE.getInteractorDeclaration_Signals();

    /**
     * The meta object literal for the '<em><b>Behaviors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTOR_DECLARATION__BEHAVIORS = eINSTANCE.getInteractorDeclaration_Behaviors();

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
     * The meta object literal for the '<em><b>Specific</b></em>' containment reference feature.
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
     * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__INSTANCE = eINSTANCE.getEntity_Instance();

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
     * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTOR__INSTANCE = eINSTANCE.getActor_Instance();

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
     * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__INSTANCE = eINSTANCE.getComponent_Instance();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.EntityDeclarationImpl <em>Entity Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.EntityDeclarationImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getEntityDeclaration()
     * @generated
     */
    EClass ENTITY_DECLARATION = eINSTANCE.getEntityDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY_DECLARATION__NAME = eINSTANCE.getEntityDeclaration_Name();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.ActorDeclarationImpl <em>Actor Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.ActorDeclarationImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getActorDeclaration()
     * @generated
     */
    EClass ACTOR_DECLARATION = eINSTANCE.getActorDeclaration();

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
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTOR_ALIAS__SOURCE = eINSTANCE.getActorAlias_Source();

    /**
     * The meta object literal for the '<em><b>Remote</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTOR_ALIAS__REMOTE = eINSTANCE.getActorAlias_Remote();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.ComponentDeclarationImpl <em>Component Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.ComponentDeclarationImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getComponentDeclaration()
     * @generated
     */
    EClass COMPONENT_DECLARATION = eINSTANCE.getComponentDeclaration();

    /**
     * The meta object literal for the '<em><b>Interactor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_DECLARATION__INTERACTOR = eINSTANCE.getComponentDeclaration_Interactor();

    /**
     * The meta object literal for the '<em><b>Aliases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_DECLARATION__ALIASES = eINSTANCE.getComponentDeclaration_Aliases();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.EventReceptionImpl <em>Event Reception</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.EventReceptionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getEventReception()
     * @generated
     */
    EClass EVENT_RECEPTION = eINSTANCE.getEventReception();

    /**
     * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_RECEPTION__INSTANCE = eINSTANCE.getEventReception_Instance();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_RECEPTION__SOURCE = eINSTANCE.getEventReception_Source();

    /**
     * The meta object literal for the '<em><b>Base</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_RECEPTION__BASE = eINSTANCE.getEventReception_Base();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.FlowReceptionImpl <em>Flow Reception</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.FlowReceptionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getFlowReception()
     * @generated
     */
    EClass FLOW_RECEPTION = eINSTANCE.getFlowReception();

    /**
     * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW_RECEPTION__INSTANCE = eINSTANCE.getFlowReception_Instance();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW_RECEPTION__SOURCE = eINSTANCE.getFlowReception_Source();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.EventEmissionImpl <em>Event Emission</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.EventEmissionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getEventEmission()
     * @generated
     */
    EClass EVENT_EMISSION = eINSTANCE.getEventEmission();

    /**
     * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_EMISSION__INSTANCE = eINSTANCE.getEventEmission_Instance();

    /**
     * The meta object literal for the '<em><b>Destination</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_EMISSION__DESTINATION = eINSTANCE.getEventEmission_Destination();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.FlowEmissionImpl <em>Flow Emission</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.FlowEmissionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getFlowEmission()
     * @generated
     */
    EClass FLOW_EMISSION = eINSTANCE.getFlowEmission();

    /**
     * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW_EMISSION__INSTANCE = eINSTANCE.getFlowEmission_Instance();

    /**
     * The meta object literal for the '<em><b>Destination</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW_EMISSION__DESTINATION = eINSTANCE.getFlowEmission_Destination();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.SignalDeclarationImpl <em>Signal Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.SignalDeclarationImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getSignalDeclaration()
     * @generated
     */
    EClass SIGNAL_DECLARATION = eINSTANCE.getSignalDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNAL_DECLARATION__TYPE = eINSTANCE.getSignalDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGNAL_DECLARATION__NAME = eINSTANCE.getSignalDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNAL_DECLARATION__SOURCE = eINSTANCE.getSignalDeclaration_Source();

    /**
     * The meta object literal for the '<em><b>Destinations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNAL_DECLARATION__DESTINATIONS = eINSTANCE.getSignalDeclaration_Destinations();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.EventDeclarationImpl <em>Event Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.EventDeclarationImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getEventDeclaration()
     * @generated
     */
    EClass EVENT_DECLARATION = eINSTANCE.getEventDeclaration();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.FlowDeclarationImpl <em>Flow Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.FlowDeclarationImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getFlowDeclaration()
     * @generated
     */
    EClass FLOW_DECLARATION = eINSTANCE.getFlowDeclaration();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.BehaviorDeclarationImpl <em>Behavior Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.BehaviorDeclarationImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getBehaviorDeclaration()
     * @generated
     */
    EClass BEHAVIOR_DECLARATION = eINSTANCE.getBehaviorDeclaration();

    /**
     * The meta object literal for the '<em><b>Cause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEHAVIOR_DECLARATION__CAUSE = eINSTANCE.getBehaviorDeclaration_Cause();

    /**
     * The meta object literal for the '<em><b>Effects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEHAVIOR_DECLARATION__EFFECTS = eINSTANCE.getBehaviorDeclaration_Effects();

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
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALWAYS_EFFECT__TARGET = eINSTANCE.getAlwaysEffect_Target();

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
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_EFFECT__TARGET = eINSTANCE.getSetEffect_Target();

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
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRIGGER_EFFECT__TARGET = eINSTANCE.getTriggerEffect_Target();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeCompoundDeclarationImpl <em>Data Type Compound Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeCompoundDeclarationImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeCompoundDeclaration()
     * @generated
     */
    EClass DATA_TYPE_COMPOUND_DECLARATION = eINSTANCE.getDataTypeCompoundDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE_COMPOUND_DECLARATION__NAME = eINSTANCE.getDataTypeCompoundDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_COMPOUND_DECLARATION__FIELDS = eINSTANCE.getDataTypeCompoundDeclaration_Fields();

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
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_COMPOUND_FIELD__TYPE = eINSTANCE.getDataTypeCompoundField_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE_COMPOUND_FIELD__NAME = eINSTANCE.getDataTypeCompoundField_Name();

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
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeCompoundImpl <em>Data Type Compound</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeCompoundImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeCompound()
     * @generated
     */
    EClass DATA_TYPE_COMPOUND = eINSTANCE.getDataTypeCompound();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_COMPOUND__TYPE = eINSTANCE.getDataTypeCompound_Type();

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

  }

} //LilPackage
