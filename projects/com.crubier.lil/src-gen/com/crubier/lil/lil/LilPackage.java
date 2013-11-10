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
   * The meta object id for the '{@link com.crubier.lil.lil.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.ExpressionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 25;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeDeclarationImpl <em>Data Type Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeDeclarationImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeDeclaration()
   * @generated
   */
  int DATA_TYPE_DECLARATION = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_DECLARATION__FIELDS = 1;

  /**
   * The number of structural features of the '<em>Data Type Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.FieldImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getField()
   * @generated
   */
  int FIELD = 27;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = 1;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.DataTypeImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 28;

  /**
   * The feature id for the '<em><b>Compound</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__COMPOUND = 0;

  /**
   * The feature id for the '<em><b>Base</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__BASE = 1;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.BooleanExpressionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getBooleanExpression()
   * @generated
   */
  int BOOLEAN_EXPRESSION = 29;

  /**
   * The number of structural features of the '<em>Boolean Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.NumberExpressionImpl <em>Number Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.NumberExpressionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberExpression()
   * @generated
   */
  int NUMBER_EXPRESSION = 30;

  /**
   * The number of structural features of the '<em>Number Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.NumberSwitchExpressionNumberCaseImpl <em>Number Switch Expression Number Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.NumberSwitchExpressionNumberCaseImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberSwitchExpressionNumberCase()
   * @generated
   */
  int NUMBER_SWITCH_EXPRESSION_NUMBER_CASE = 31;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_SWITCH_EXPRESSION_NUMBER_CASE__CONDITION = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_SWITCH_EXPRESSION_NUMBER_CASE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Number Switch Expression Number Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_SWITCH_EXPRESSION_NUMBER_CASE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.NumberSwitchExpressionTextCaseImpl <em>Number Switch Expression Text Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.NumberSwitchExpressionTextCaseImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberSwitchExpressionTextCase()
   * @generated
   */
  int NUMBER_SWITCH_EXPRESSION_TEXT_CASE = 32;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_SWITCH_EXPRESSION_TEXT_CASE__CONDITION = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_SWITCH_EXPRESSION_TEXT_CASE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Number Switch Expression Text Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_SWITCH_EXPRESSION_TEXT_CASE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.TextExpressionImpl <em>Text Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.TextExpressionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getTextExpression()
   * @generated
   */
  int TEXT_EXPRESSION = 33;

  /**
   * The number of structural features of the '<em>Text Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.BooleanDisjonctionImpl <em>Boolean Disjonction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.BooleanDisjonctionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getBooleanDisjonction()
   * @generated
   */
  int BOOLEAN_DISJONCTION = 34;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_DISJONCTION__LEFT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_DISJONCTION__RIGHT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Boolean Disjonction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_DISJONCTION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.BooleanConjonctionImpl <em>Boolean Conjonction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.BooleanConjonctionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getBooleanConjonction()
   * @generated
   */
  int BOOLEAN_CONJONCTION = 35;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_CONJONCTION__LEFT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_CONJONCTION__RIGHT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Boolean Conjonction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_CONJONCTION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.BooleanNegationImpl <em>Boolean Negation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.BooleanNegationImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getBooleanNegation()
   * @generated
   */
  int BOOLEAN_NEGATION = 36;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_NEGATION__OPERAND = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Negation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_NEGATION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.BooleanLiteralImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 37;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__VALUE = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.NumberIfExpressionImpl <em>Number If Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.NumberIfExpressionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberIfExpression()
   * @generated
   */
  int NUMBER_IF_EXPRESSION = 38;

  /**
   * The feature id for the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_IF_EXPRESSION__IF = NUMBER_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_IF_EXPRESSION__THEN = NUMBER_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_IF_EXPRESSION__ELSE = NUMBER_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Number If Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_IF_EXPRESSION_FEATURE_COUNT = NUMBER_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.NumberSwitchExpressionNumberImpl <em>Number Switch Expression Number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.NumberSwitchExpressionNumberImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberSwitchExpressionNumber()
   * @generated
   */
  int NUMBER_SWITCH_EXPRESSION_NUMBER = 39;

  /**
   * The feature id for the '<em><b>Switch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_SWITCH_EXPRESSION_NUMBER__SWITCH = NUMBER_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_SWITCH_EXPRESSION_NUMBER__CASES = NUMBER_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_SWITCH_EXPRESSION_NUMBER__DEFAULT = NUMBER_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Number Switch Expression Number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_SWITCH_EXPRESSION_NUMBER_FEATURE_COUNT = NUMBER_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.NumberSwitchExpressionTextImpl <em>Number Switch Expression Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.NumberSwitchExpressionTextImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberSwitchExpressionText()
   * @generated
   */
  int NUMBER_SWITCH_EXPRESSION_TEXT = 40;

  /**
   * The feature id for the '<em><b>Switch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_SWITCH_EXPRESSION_TEXT__SWITCH = NUMBER_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_SWITCH_EXPRESSION_TEXT__CASES = NUMBER_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_SWITCH_EXPRESSION_TEXT__DEFAULT = NUMBER_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Number Switch Expression Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_SWITCH_EXPRESSION_TEXT_FEATURE_COUNT = NUMBER_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.NumberAdditionImpl <em>Number Addition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.NumberAdditionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberAddition()
   * @generated
   */
  int NUMBER_ADDITION = 41;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_ADDITION__LEFT = NUMBER_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_ADDITION__RIGHT = NUMBER_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Number Addition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_ADDITION_FEATURE_COUNT = NUMBER_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.NumberSubstractionImpl <em>Number Substraction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.NumberSubstractionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberSubstraction()
   * @generated
   */
  int NUMBER_SUBSTRACTION = 42;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_SUBSTRACTION__LEFT = NUMBER_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_SUBSTRACTION__RIGHT = NUMBER_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Number Substraction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_SUBSTRACTION_FEATURE_COUNT = NUMBER_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.NumberMultiplicationImpl <em>Number Multiplication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.NumberMultiplicationImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberMultiplication()
   * @generated
   */
  int NUMBER_MULTIPLICATION = 43;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_MULTIPLICATION__LEFT = NUMBER_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_MULTIPLICATION__RIGHT = NUMBER_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Number Multiplication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_MULTIPLICATION_FEATURE_COUNT = NUMBER_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.NumberDivisionImpl <em>Number Division</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.NumberDivisionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberDivision()
   * @generated
   */
  int NUMBER_DIVISION = 44;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_DIVISION__LEFT = NUMBER_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_DIVISION__RIGHT = NUMBER_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Number Division</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_DIVISION_FEATURE_COUNT = NUMBER_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.NumberModuloImpl <em>Number Modulo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.NumberModuloImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberModulo()
   * @generated
   */
  int NUMBER_MODULO = 45;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_MODULO__LEFT = NUMBER_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_MODULO__RIGHT = NUMBER_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Number Modulo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_MODULO_FEATURE_COUNT = NUMBER_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.NumberPowerImpl <em>Number Power</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.NumberPowerImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberPower()
   * @generated
   */
  int NUMBER_POWER = 46;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_POWER__LEFT = NUMBER_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_POWER__RIGHT = NUMBER_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Number Power</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_POWER_FEATURE_COUNT = NUMBER_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.NumberOppositionImpl <em>Number Opposition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.NumberOppositionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberOpposition()
   * @generated
   */
  int NUMBER_OPPOSITION = 47;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_OPPOSITION__OPERAND = NUMBER_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number Opposition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_OPPOSITION_FEATURE_COUNT = NUMBER_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.NumberLiteralImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberLiteral()
   * @generated
   */
  int NUMBER_LITERAL = 48;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__VALUE = NUMBER_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL_FEATURE_COUNT = NUMBER_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.NumberFunctionExpressionImpl <em>Number Function Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.NumberFunctionExpressionImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberFunctionExpression()
   * @generated
   */
  int NUMBER_FUNCTION_EXPRESSION = 49;

  /**
   * The feature id for the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_FUNCTION_EXPRESSION__FUNCTION = NUMBER_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_FUNCTION_EXPRESSION__ARGUMENTS = NUMBER_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Number Function Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_FUNCTION_EXPRESSION_FEATURE_COUNT = NUMBER_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.TextJoinImpl <em>Text Join</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.TextJoinImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getTextJoin()
   * @generated
   */
  int TEXT_JOIN = 50;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_JOIN__LEFT = TEXT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_JOIN__RIGHT = TEXT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Text Join</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_JOIN_FEATURE_COUNT = TEXT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.crubier.lil.lil.impl.TextLiteralImpl <em>Text Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.crubier.lil.lil.impl.TextLiteralImpl
   * @see com.crubier.lil.lil.impl.LilPackageImpl#getTextLiteral()
   * @generated
   */
  int TEXT_LITERAL = 51;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_LITERAL__VALUE = TEXT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Text Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_LITERAL_FEATURE_COUNT = TEXT_EXPRESSION_FEATURE_COUNT + 1;


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
   * Returns the meta object for class '{@link com.crubier.lil.lil.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see com.crubier.lil.lil.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.DataTypeDeclaration <em>Data Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Declaration</em>'.
   * @see com.crubier.lil.lil.DataTypeDeclaration
   * @generated
   */
  EClass getDataTypeDeclaration();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.DataTypeDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.crubier.lil.lil.DataTypeDeclaration#getName()
   * @see #getDataTypeDeclaration()
   * @generated
   */
  EAttribute getDataTypeDeclaration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.DataTypeDeclaration#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see com.crubier.lil.lil.DataTypeDeclaration#getFields()
   * @see #getDataTypeDeclaration()
   * @generated
   */
  EReference getDataTypeDeclaration_Fields();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see com.crubier.lil.lil.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.Field#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.crubier.lil.lil.Field#getType()
   * @see #getField()
   * @generated
   */
  EReference getField_Type();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.Field#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.crubier.lil.lil.Field#getName()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Name();

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
   * Returns the meta object for class '{@link com.crubier.lil.lil.BooleanExpression <em>Boolean Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Expression</em>'.
   * @see com.crubier.lil.lil.BooleanExpression
   * @generated
   */
  EClass getBooleanExpression();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.NumberExpression <em>Number Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Expression</em>'.
   * @see com.crubier.lil.lil.NumberExpression
   * @generated
   */
  EClass getNumberExpression();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.NumberSwitchExpressionNumberCase <em>Number Switch Expression Number Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Switch Expression Number Case</em>'.
   * @see com.crubier.lil.lil.NumberSwitchExpressionNumberCase
   * @generated
   */
  EClass getNumberSwitchExpressionNumberCase();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.NumberSwitchExpressionNumberCase#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see com.crubier.lil.lil.NumberSwitchExpressionNumberCase#getCondition()
   * @see #getNumberSwitchExpressionNumberCase()
   * @generated
   */
  EReference getNumberSwitchExpressionNumberCase_Condition();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.NumberSwitchExpressionNumberCase#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.crubier.lil.lil.NumberSwitchExpressionNumberCase#getValue()
   * @see #getNumberSwitchExpressionNumberCase()
   * @generated
   */
  EReference getNumberSwitchExpressionNumberCase_Value();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.NumberSwitchExpressionTextCase <em>Number Switch Expression Text Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Switch Expression Text Case</em>'.
   * @see com.crubier.lil.lil.NumberSwitchExpressionTextCase
   * @generated
   */
  EClass getNumberSwitchExpressionTextCase();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.NumberSwitchExpressionTextCase#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see com.crubier.lil.lil.NumberSwitchExpressionTextCase#getCondition()
   * @see #getNumberSwitchExpressionTextCase()
   * @generated
   */
  EReference getNumberSwitchExpressionTextCase_Condition();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.NumberSwitchExpressionTextCase#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.crubier.lil.lil.NumberSwitchExpressionTextCase#getValue()
   * @see #getNumberSwitchExpressionTextCase()
   * @generated
   */
  EReference getNumberSwitchExpressionTextCase_Value();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.TextExpression <em>Text Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Expression</em>'.
   * @see com.crubier.lil.lil.TextExpression
   * @generated
   */
  EClass getTextExpression();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.BooleanDisjonction <em>Boolean Disjonction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Disjonction</em>'.
   * @see com.crubier.lil.lil.BooleanDisjonction
   * @generated
   */
  EClass getBooleanDisjonction();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.BooleanDisjonction#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.crubier.lil.lil.BooleanDisjonction#getLeft()
   * @see #getBooleanDisjonction()
   * @generated
   */
  EReference getBooleanDisjonction_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.BooleanDisjonction#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.crubier.lil.lil.BooleanDisjonction#getRight()
   * @see #getBooleanDisjonction()
   * @generated
   */
  EReference getBooleanDisjonction_Right();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.BooleanConjonction <em>Boolean Conjonction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Conjonction</em>'.
   * @see com.crubier.lil.lil.BooleanConjonction
   * @generated
   */
  EClass getBooleanConjonction();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.BooleanConjonction#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.crubier.lil.lil.BooleanConjonction#getLeft()
   * @see #getBooleanConjonction()
   * @generated
   */
  EReference getBooleanConjonction_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.BooleanConjonction#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.crubier.lil.lil.BooleanConjonction#getRight()
   * @see #getBooleanConjonction()
   * @generated
   */
  EReference getBooleanConjonction_Right();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.BooleanNegation <em>Boolean Negation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Negation</em>'.
   * @see com.crubier.lil.lil.BooleanNegation
   * @generated
   */
  EClass getBooleanNegation();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.BooleanNegation#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand</em>'.
   * @see com.crubier.lil.lil.BooleanNegation#getOperand()
   * @see #getBooleanNegation()
   * @generated
   */
  EReference getBooleanNegation_Operand();

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
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.BooleanLiteral#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.crubier.lil.lil.BooleanLiteral#isValue()
   * @see #getBooleanLiteral()
   * @generated
   */
  EAttribute getBooleanLiteral_Value();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.NumberIfExpression <em>Number If Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number If Expression</em>'.
   * @see com.crubier.lil.lil.NumberIfExpression
   * @generated
   */
  EClass getNumberIfExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.NumberIfExpression#getIf <em>If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If</em>'.
   * @see com.crubier.lil.lil.NumberIfExpression#getIf()
   * @see #getNumberIfExpression()
   * @generated
   */
  EReference getNumberIfExpression_If();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.NumberIfExpression#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see com.crubier.lil.lil.NumberIfExpression#getThen()
   * @see #getNumberIfExpression()
   * @generated
   */
  EReference getNumberIfExpression_Then();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.NumberIfExpression#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see com.crubier.lil.lil.NumberIfExpression#getElse()
   * @see #getNumberIfExpression()
   * @generated
   */
  EReference getNumberIfExpression_Else();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.NumberSwitchExpressionNumber <em>Number Switch Expression Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Switch Expression Number</em>'.
   * @see com.crubier.lil.lil.NumberSwitchExpressionNumber
   * @generated
   */
  EClass getNumberSwitchExpressionNumber();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.NumberSwitchExpressionNumber#getSwitch <em>Switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Switch</em>'.
   * @see com.crubier.lil.lil.NumberSwitchExpressionNumber#getSwitch()
   * @see #getNumberSwitchExpressionNumber()
   * @generated
   */
  EReference getNumberSwitchExpressionNumber_Switch();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.NumberSwitchExpressionNumber#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see com.crubier.lil.lil.NumberSwitchExpressionNumber#getCases()
   * @see #getNumberSwitchExpressionNumber()
   * @generated
   */
  EReference getNumberSwitchExpressionNumber_Cases();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.NumberSwitchExpressionNumber#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default</em>'.
   * @see com.crubier.lil.lil.NumberSwitchExpressionNumber#getDefault()
   * @see #getNumberSwitchExpressionNumber()
   * @generated
   */
  EReference getNumberSwitchExpressionNumber_Default();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.NumberSwitchExpressionText <em>Number Switch Expression Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Switch Expression Text</em>'.
   * @see com.crubier.lil.lil.NumberSwitchExpressionText
   * @generated
   */
  EClass getNumberSwitchExpressionText();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.NumberSwitchExpressionText#getSwitch <em>Switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Switch</em>'.
   * @see com.crubier.lil.lil.NumberSwitchExpressionText#getSwitch()
   * @see #getNumberSwitchExpressionText()
   * @generated
   */
  EReference getNumberSwitchExpressionText_Switch();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.NumberSwitchExpressionText#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see com.crubier.lil.lil.NumberSwitchExpressionText#getCases()
   * @see #getNumberSwitchExpressionText()
   * @generated
   */
  EReference getNumberSwitchExpressionText_Cases();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.NumberSwitchExpressionText#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default</em>'.
   * @see com.crubier.lil.lil.NumberSwitchExpressionText#getDefault()
   * @see #getNumberSwitchExpressionText()
   * @generated
   */
  EReference getNumberSwitchExpressionText_Default();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.NumberAddition <em>Number Addition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Addition</em>'.
   * @see com.crubier.lil.lil.NumberAddition
   * @generated
   */
  EClass getNumberAddition();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.NumberAddition#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.crubier.lil.lil.NumberAddition#getLeft()
   * @see #getNumberAddition()
   * @generated
   */
  EReference getNumberAddition_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.NumberAddition#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.crubier.lil.lil.NumberAddition#getRight()
   * @see #getNumberAddition()
   * @generated
   */
  EReference getNumberAddition_Right();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.NumberSubstraction <em>Number Substraction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Substraction</em>'.
   * @see com.crubier.lil.lil.NumberSubstraction
   * @generated
   */
  EClass getNumberSubstraction();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.NumberSubstraction#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.crubier.lil.lil.NumberSubstraction#getLeft()
   * @see #getNumberSubstraction()
   * @generated
   */
  EReference getNumberSubstraction_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.NumberSubstraction#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.crubier.lil.lil.NumberSubstraction#getRight()
   * @see #getNumberSubstraction()
   * @generated
   */
  EReference getNumberSubstraction_Right();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.NumberMultiplication <em>Number Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Multiplication</em>'.
   * @see com.crubier.lil.lil.NumberMultiplication
   * @generated
   */
  EClass getNumberMultiplication();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.NumberMultiplication#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.crubier.lil.lil.NumberMultiplication#getLeft()
   * @see #getNumberMultiplication()
   * @generated
   */
  EReference getNumberMultiplication_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.NumberMultiplication#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.crubier.lil.lil.NumberMultiplication#getRight()
   * @see #getNumberMultiplication()
   * @generated
   */
  EReference getNumberMultiplication_Right();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.NumberDivision <em>Number Division</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Division</em>'.
   * @see com.crubier.lil.lil.NumberDivision
   * @generated
   */
  EClass getNumberDivision();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.NumberDivision#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.crubier.lil.lil.NumberDivision#getLeft()
   * @see #getNumberDivision()
   * @generated
   */
  EReference getNumberDivision_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.NumberDivision#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.crubier.lil.lil.NumberDivision#getRight()
   * @see #getNumberDivision()
   * @generated
   */
  EReference getNumberDivision_Right();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.NumberModulo <em>Number Modulo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Modulo</em>'.
   * @see com.crubier.lil.lil.NumberModulo
   * @generated
   */
  EClass getNumberModulo();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.NumberModulo#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.crubier.lil.lil.NumberModulo#getLeft()
   * @see #getNumberModulo()
   * @generated
   */
  EReference getNumberModulo_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.NumberModulo#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.crubier.lil.lil.NumberModulo#getRight()
   * @see #getNumberModulo()
   * @generated
   */
  EReference getNumberModulo_Right();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.NumberPower <em>Number Power</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Power</em>'.
   * @see com.crubier.lil.lil.NumberPower
   * @generated
   */
  EClass getNumberPower();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.NumberPower#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.crubier.lil.lil.NumberPower#getLeft()
   * @see #getNumberPower()
   * @generated
   */
  EReference getNumberPower_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.NumberPower#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.crubier.lil.lil.NumberPower#getRight()
   * @see #getNumberPower()
   * @generated
   */
  EReference getNumberPower_Right();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.NumberOpposition <em>Number Opposition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Opposition</em>'.
   * @see com.crubier.lil.lil.NumberOpposition
   * @generated
   */
  EClass getNumberOpposition();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.NumberOpposition#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand</em>'.
   * @see com.crubier.lil.lil.NumberOpposition#getOperand()
   * @see #getNumberOpposition()
   * @generated
   */
  EReference getNumberOpposition_Operand();

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
   * Returns the meta object for class '{@link com.crubier.lil.lil.NumberFunctionExpression <em>Number Function Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Function Expression</em>'.
   * @see com.crubier.lil.lil.NumberFunctionExpression
   * @generated
   */
  EClass getNumberFunctionExpression();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.NumberFunctionExpression#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function</em>'.
   * @see com.crubier.lil.lil.NumberFunctionExpression#getFunction()
   * @see #getNumberFunctionExpression()
   * @generated
   */
  EAttribute getNumberFunctionExpression_Function();

  /**
   * Returns the meta object for the containment reference list '{@link com.crubier.lil.lil.NumberFunctionExpression#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see com.crubier.lil.lil.NumberFunctionExpression#getArguments()
   * @see #getNumberFunctionExpression()
   * @generated
   */
  EReference getNumberFunctionExpression_Arguments();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.TextJoin <em>Text Join</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Join</em>'.
   * @see com.crubier.lil.lil.TextJoin
   * @generated
   */
  EClass getTextJoin();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.TextJoin#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.crubier.lil.lil.TextJoin#getLeft()
   * @see #getTextJoin()
   * @generated
   */
  EReference getTextJoin_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.crubier.lil.lil.TextJoin#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.crubier.lil.lil.TextJoin#getRight()
   * @see #getTextJoin()
   * @generated
   */
  EReference getTextJoin_Right();

  /**
   * Returns the meta object for class '{@link com.crubier.lil.lil.TextLiteral <em>Text Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Literal</em>'.
   * @see com.crubier.lil.lil.TextLiteral
   * @generated
   */
  EClass getTextLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.crubier.lil.lil.TextLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.crubier.lil.lil.TextLiteral#getValue()
   * @see #getTextLiteral()
   * @generated
   */
  EAttribute getTextLiteral_Value();

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
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.ExpressionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.DataTypeDeclarationImpl <em>Data Type Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.DataTypeDeclarationImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getDataTypeDeclaration()
     * @generated
     */
    EClass DATA_TYPE_DECLARATION = eINSTANCE.getDataTypeDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE_DECLARATION__NAME = eINSTANCE.getDataTypeDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_DECLARATION__FIELDS = eINSTANCE.getDataTypeDeclaration_Fields();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.FieldImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__TYPE = eINSTANCE.getField_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__NAME = eINSTANCE.getField_Name();

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
     * The meta object literal for the '<em><b>Compound</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE__COMPOUND = eINSTANCE.getDataType_Compound();

    /**
     * The meta object literal for the '<em><b>Base</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE__BASE = eINSTANCE.getDataType_Base();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.BooleanExpressionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getBooleanExpression()
     * @generated
     */
    EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.NumberExpressionImpl <em>Number Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.NumberExpressionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberExpression()
     * @generated
     */
    EClass NUMBER_EXPRESSION = eINSTANCE.getNumberExpression();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.NumberSwitchExpressionNumberCaseImpl <em>Number Switch Expression Number Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.NumberSwitchExpressionNumberCaseImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberSwitchExpressionNumberCase()
     * @generated
     */
    EClass NUMBER_SWITCH_EXPRESSION_NUMBER_CASE = eINSTANCE.getNumberSwitchExpressionNumberCase();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_SWITCH_EXPRESSION_NUMBER_CASE__CONDITION = eINSTANCE.getNumberSwitchExpressionNumberCase_Condition();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_SWITCH_EXPRESSION_NUMBER_CASE__VALUE = eINSTANCE.getNumberSwitchExpressionNumberCase_Value();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.NumberSwitchExpressionTextCaseImpl <em>Number Switch Expression Text Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.NumberSwitchExpressionTextCaseImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberSwitchExpressionTextCase()
     * @generated
     */
    EClass NUMBER_SWITCH_EXPRESSION_TEXT_CASE = eINSTANCE.getNumberSwitchExpressionTextCase();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_SWITCH_EXPRESSION_TEXT_CASE__CONDITION = eINSTANCE.getNumberSwitchExpressionTextCase_Condition();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_SWITCH_EXPRESSION_TEXT_CASE__VALUE = eINSTANCE.getNumberSwitchExpressionTextCase_Value();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.TextExpressionImpl <em>Text Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.TextExpressionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getTextExpression()
     * @generated
     */
    EClass TEXT_EXPRESSION = eINSTANCE.getTextExpression();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.BooleanDisjonctionImpl <em>Boolean Disjonction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.BooleanDisjonctionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getBooleanDisjonction()
     * @generated
     */
    EClass BOOLEAN_DISJONCTION = eINSTANCE.getBooleanDisjonction();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_DISJONCTION__LEFT = eINSTANCE.getBooleanDisjonction_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_DISJONCTION__RIGHT = eINSTANCE.getBooleanDisjonction_Right();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.BooleanConjonctionImpl <em>Boolean Conjonction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.BooleanConjonctionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getBooleanConjonction()
     * @generated
     */
    EClass BOOLEAN_CONJONCTION = eINSTANCE.getBooleanConjonction();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_CONJONCTION__LEFT = eINSTANCE.getBooleanConjonction_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_CONJONCTION__RIGHT = eINSTANCE.getBooleanConjonction_Right();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.BooleanNegationImpl <em>Boolean Negation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.BooleanNegationImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getBooleanNegation()
     * @generated
     */
    EClass BOOLEAN_NEGATION = eINSTANCE.getBooleanNegation();

    /**
     * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_NEGATION__OPERAND = eINSTANCE.getBooleanNegation_Operand();

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
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.NumberIfExpressionImpl <em>Number If Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.NumberIfExpressionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberIfExpression()
     * @generated
     */
    EClass NUMBER_IF_EXPRESSION = eINSTANCE.getNumberIfExpression();

    /**
     * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_IF_EXPRESSION__IF = eINSTANCE.getNumberIfExpression_If();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_IF_EXPRESSION__THEN = eINSTANCE.getNumberIfExpression_Then();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_IF_EXPRESSION__ELSE = eINSTANCE.getNumberIfExpression_Else();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.NumberSwitchExpressionNumberImpl <em>Number Switch Expression Number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.NumberSwitchExpressionNumberImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberSwitchExpressionNumber()
     * @generated
     */
    EClass NUMBER_SWITCH_EXPRESSION_NUMBER = eINSTANCE.getNumberSwitchExpressionNumber();

    /**
     * The meta object literal for the '<em><b>Switch</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_SWITCH_EXPRESSION_NUMBER__SWITCH = eINSTANCE.getNumberSwitchExpressionNumber_Switch();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_SWITCH_EXPRESSION_NUMBER__CASES = eINSTANCE.getNumberSwitchExpressionNumber_Cases();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_SWITCH_EXPRESSION_NUMBER__DEFAULT = eINSTANCE.getNumberSwitchExpressionNumber_Default();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.NumberSwitchExpressionTextImpl <em>Number Switch Expression Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.NumberSwitchExpressionTextImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberSwitchExpressionText()
     * @generated
     */
    EClass NUMBER_SWITCH_EXPRESSION_TEXT = eINSTANCE.getNumberSwitchExpressionText();

    /**
     * The meta object literal for the '<em><b>Switch</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_SWITCH_EXPRESSION_TEXT__SWITCH = eINSTANCE.getNumberSwitchExpressionText_Switch();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_SWITCH_EXPRESSION_TEXT__CASES = eINSTANCE.getNumberSwitchExpressionText_Cases();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_SWITCH_EXPRESSION_TEXT__DEFAULT = eINSTANCE.getNumberSwitchExpressionText_Default();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.NumberAdditionImpl <em>Number Addition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.NumberAdditionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberAddition()
     * @generated
     */
    EClass NUMBER_ADDITION = eINSTANCE.getNumberAddition();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_ADDITION__LEFT = eINSTANCE.getNumberAddition_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_ADDITION__RIGHT = eINSTANCE.getNumberAddition_Right();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.NumberSubstractionImpl <em>Number Substraction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.NumberSubstractionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberSubstraction()
     * @generated
     */
    EClass NUMBER_SUBSTRACTION = eINSTANCE.getNumberSubstraction();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_SUBSTRACTION__LEFT = eINSTANCE.getNumberSubstraction_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_SUBSTRACTION__RIGHT = eINSTANCE.getNumberSubstraction_Right();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.NumberMultiplicationImpl <em>Number Multiplication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.NumberMultiplicationImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberMultiplication()
     * @generated
     */
    EClass NUMBER_MULTIPLICATION = eINSTANCE.getNumberMultiplication();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_MULTIPLICATION__LEFT = eINSTANCE.getNumberMultiplication_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_MULTIPLICATION__RIGHT = eINSTANCE.getNumberMultiplication_Right();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.NumberDivisionImpl <em>Number Division</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.NumberDivisionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberDivision()
     * @generated
     */
    EClass NUMBER_DIVISION = eINSTANCE.getNumberDivision();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_DIVISION__LEFT = eINSTANCE.getNumberDivision_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_DIVISION__RIGHT = eINSTANCE.getNumberDivision_Right();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.NumberModuloImpl <em>Number Modulo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.NumberModuloImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberModulo()
     * @generated
     */
    EClass NUMBER_MODULO = eINSTANCE.getNumberModulo();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_MODULO__LEFT = eINSTANCE.getNumberModulo_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_MODULO__RIGHT = eINSTANCE.getNumberModulo_Right();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.NumberPowerImpl <em>Number Power</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.NumberPowerImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberPower()
     * @generated
     */
    EClass NUMBER_POWER = eINSTANCE.getNumberPower();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_POWER__LEFT = eINSTANCE.getNumberPower_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_POWER__RIGHT = eINSTANCE.getNumberPower_Right();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.NumberOppositionImpl <em>Number Opposition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.NumberOppositionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberOpposition()
     * @generated
     */
    EClass NUMBER_OPPOSITION = eINSTANCE.getNumberOpposition();

    /**
     * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_OPPOSITION__OPERAND = eINSTANCE.getNumberOpposition_Operand();

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
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.NumberFunctionExpressionImpl <em>Number Function Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.NumberFunctionExpressionImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getNumberFunctionExpression()
     * @generated
     */
    EClass NUMBER_FUNCTION_EXPRESSION = eINSTANCE.getNumberFunctionExpression();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_FUNCTION_EXPRESSION__FUNCTION = eINSTANCE.getNumberFunctionExpression_Function();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_FUNCTION_EXPRESSION__ARGUMENTS = eINSTANCE.getNumberFunctionExpression_Arguments();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.TextJoinImpl <em>Text Join</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.TextJoinImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getTextJoin()
     * @generated
     */
    EClass TEXT_JOIN = eINSTANCE.getTextJoin();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT_JOIN__LEFT = eINSTANCE.getTextJoin_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT_JOIN__RIGHT = eINSTANCE.getTextJoin_Right();

    /**
     * The meta object literal for the '{@link com.crubier.lil.lil.impl.TextLiteralImpl <em>Text Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.crubier.lil.lil.impl.TextLiteralImpl
     * @see com.crubier.lil.lil.impl.LilPackageImpl#getTextLiteral()
     * @generated
     */
    EClass TEXT_LITERAL = eINSTANCE.getTextLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_LITERAL__VALUE = eINSTANCE.getTextLiteral_Value();

  }

} //LilPackage
