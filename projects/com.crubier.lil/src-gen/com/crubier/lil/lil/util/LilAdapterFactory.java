/**
 */
package com.crubier.lil.lil.util;

import com.crubier.lil.lil.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.crubier.lil.lil.LilPackage
 * @generated
 */
public class LilAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LilPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LilAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LilPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LilSwitch<Adapter> modelSwitch =
    new LilSwitch<Adapter>()
    {
      @Override
      public Adapter caseLilModel(LilModel object)
      {
        return createLilModelAdapter();
      }
      @Override
      public Adapter caseActorTypeDefinition(ActorTypeDefinition object)
      {
        return createActorTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseActorType(ActorType object)
      {
        return createActorTypeAdapter();
      }
      @Override
      public Adapter caseActorInstanceDeclaration(ActorInstanceDeclaration object)
      {
        return createActorInstanceDeclarationAdapter();
      }
      @Override
      public Adapter caseDataTypeDefinition(DataTypeDefinition object)
      {
        return createDataTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseDataType(DataType object)
      {
        return createDataTypeAdapter();
      }
      @Override
      public Adapter caseDataTypeSymbolDefinitionSet(DataTypeSymbolDefinitionSet object)
      {
        return createDataTypeSymbolDefinitionSetAdapter();
      }
      @Override
      public Adapter caseDataTypeSymbolDefinitionSetElement(DataTypeSymbolDefinitionSetElement object)
      {
        return createDataTypeSymbolDefinitionSetElementAdapter();
      }
      @Override
      public Adapter caseDataTypeNumberDefinitionSet(DataTypeNumberDefinitionSet object)
      {
        return createDataTypeNumberDefinitionSetAdapter();
      }
      @Override
      public Adapter caseDataTypeTextDefinitionSet(DataTypeTextDefinitionSet object)
      {
        return createDataTypeTextDefinitionSetAdapter();
      }
      @Override
      public Adapter caseDataTypeTimeDefinitionSet(DataTypeTimeDefinitionSet object)
      {
        return createDataTypeTimeDefinitionSetAdapter();
      }
      @Override
      public Adapter caseDataTypeIdentifierDefinitionSet(DataTypeIdentifierDefinitionSet object)
      {
        return createDataTypeIdentifierDefinitionSetAdapter();
      }
      @Override
      public Adapter caseDataInstanceDeclaration(DataInstanceDeclaration object)
      {
        return createDataInstanceDeclarationAdapter();
      }
      @Override
      public Adapter caseInteractorTypeDefinition(InteractorTypeDefinition object)
      {
        return createInteractorTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseInteractorType(InteractorType object)
      {
        return createInteractorTypeAdapter();
      }
      @Override
      public Adapter caseInteractorActor(InteractorActor object)
      {
        return createInteractorActorAdapter();
      }
      @Override
      public Adapter caseInteractorData(InteractorData object)
      {
        return createInteractorDataAdapter();
      }
      @Override
      public Adapter caseInteractorSignalAlias(InteractorSignalAlias object)
      {
        return createInteractorSignalAliasAdapter();
      }
      @Override
      public Adapter caseInteractorComponent(InteractorComponent object)
      {
        return createInteractorComponentAdapter();
      }
      @Override
      public Adapter caseAccessibleEntity(AccessibleEntity object)
      {
        return createAccessibleEntityAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseActorAlias(ActorAlias object)
      {
        return createActorAliasAdapter();
      }
      @Override
      public Adapter caseInteractorSignalReception(InteractorSignalReception object)
      {
        return createInteractorSignalReceptionAdapter();
      }
      @Override
      public Adapter caseInteractorSignalEmission(InteractorSignalEmission object)
      {
        return createInteractorSignalEmissionAdapter();
      }
      @Override
      public Adapter caseInteractorBehavior(InteractorBehavior object)
      {
        return createInteractorBehaviorAdapter();
      }
      @Override
      public Adapter caseInteractorBehaviorCause(InteractorBehaviorCause object)
      {
        return createInteractorBehaviorCauseAdapter();
      }
      @Override
      public Adapter caseInteractorBehaviorOnCause(InteractorBehaviorOnCause object)
      {
        return createInteractorBehaviorOnCauseAdapter();
      }
      @Override
      public Adapter caseInteractorBehaviorWhenCause(InteractorBehaviorWhenCause object)
      {
        return createInteractorBehaviorWhenCauseAdapter();
      }
      @Override
      public Adapter caseInteractorBehaviorEffect(InteractorBehaviorEffect object)
      {
        return createInteractorBehaviorEffectAdapter();
      }
      @Override
      public Adapter caseInteractorBehaviorAlwaysEffect(InteractorBehaviorAlwaysEffect object)
      {
        return createInteractorBehaviorAlwaysEffectAdapter();
      }
      @Override
      public Adapter caseInteractorBehaviorSetEffect(InteractorBehaviorSetEffect object)
      {
        return createInteractorBehaviorSetEffectAdapter();
      }
      @Override
      public Adapter caseInteractorBehaviorTriggerEffect(InteractorBehaviorTriggerEffect object)
      {
        return createInteractorBehaviorTriggerEffectAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseExpressionLiteralCollection(ExpressionLiteralCollection object)
      {
        return createExpressionLiteralCollectionAdapter();
      }
      @Override
      public Adapter caseExpressionLiteralSet(ExpressionLiteralSet object)
      {
        return createExpressionLiteralSetAdapter();
      }
      @Override
      public Adapter caseExpressionLiteralList(ExpressionLiteralList object)
      {
        return createExpressionLiteralListAdapter();
      }
      @Override
      public Adapter caseExpressionCase(ExpressionCase object)
      {
        return createExpressionCaseAdapter();
      }
      @Override
      public Adapter caseActorTypeInput(ActorTypeInput object)
      {
        return createActorTypeInputAdapter();
      }
      @Override
      public Adapter caseActorTypeOutput(ActorTypeOutput object)
      {
        return createActorTypeOutputAdapter();
      }
      @Override
      public Adapter caseActorTypeCustom(ActorTypeCustom object)
      {
        return createActorTypeCustomAdapter();
      }
      @Override
      public Adapter caseDataTypeDefinitionCompound(DataTypeDefinitionCompound object)
      {
        return createDataTypeDefinitionCompoundAdapter();
      }
      @Override
      public Adapter caseDataTypeDefinitionAlias(DataTypeDefinitionAlias object)
      {
        return createDataTypeDefinitionAliasAdapter();
      }
      @Override
      public Adapter caseDataTypeVoid(DataTypeVoid object)
      {
        return createDataTypeVoidAdapter();
      }
      @Override
      public Adapter caseDataTypeSymbol(DataTypeSymbol object)
      {
        return createDataTypeSymbolAdapter();
      }
      @Override
      public Adapter caseDataTypeNumber(DataTypeNumber object)
      {
        return createDataTypeNumberAdapter();
      }
      @Override
      public Adapter caseDataTypeText(DataTypeText object)
      {
        return createDataTypeTextAdapter();
      }
      @Override
      public Adapter caseDataTypeTime(DataTypeTime object)
      {
        return createDataTypeTimeAdapter();
      }
      @Override
      public Adapter caseDataTypeIdentifier(DataTypeIdentifier object)
      {
        return createDataTypeIdentifierAdapter();
      }
      @Override
      public Adapter caseDataTypeCustom(DataTypeCustom object)
      {
        return createDataTypeCustomAdapter();
      }
      @Override
      public Adapter caseDataTypeCollection(DataTypeCollection object)
      {
        return createDataTypeCollectionAdapter();
      }
      @Override
      public Adapter caseDataTypeSet(DataTypeSet object)
      {
        return createDataTypeSetAdapter();
      }
      @Override
      public Adapter caseDataTypeList(DataTypeList object)
      {
        return createDataTypeListAdapter();
      }
      @Override
      public Adapter caseDataTypeQueue(DataTypeQueue object)
      {
        return createDataTypeQueueAdapter();
      }
      @Override
      public Adapter caseDataDefinitionEnumElement(DataDefinitionEnumElement object)
      {
        return createDataDefinitionEnumElementAdapter();
      }
      @Override
      public Adapter caseDataTypeNumberDefinitionSetSet(DataTypeNumberDefinitionSetSet object)
      {
        return createDataTypeNumberDefinitionSetSetAdapter();
      }
      @Override
      public Adapter caseDataTypeNumberDefinitionSetInterval(DataTypeNumberDefinitionSetInterval object)
      {
        return createDataTypeNumberDefinitionSetIntervalAdapter();
      }
      @Override
      public Adapter caseDataTypeTextDefinitionSetSet(DataTypeTextDefinitionSetSet object)
      {
        return createDataTypeTextDefinitionSetSetAdapter();
      }
      @Override
      public Adapter caseDataTypeTimeDefinitionSetSet(DataTypeTimeDefinitionSetSet object)
      {
        return createDataTypeTimeDefinitionSetSetAdapter();
      }
      @Override
      public Adapter caseDataTypeTimeDefinitionSetInterval(DataTypeTimeDefinitionSetInterval object)
      {
        return createDataTypeTimeDefinitionSetIntervalAdapter();
      }
      @Override
      public Adapter caseDataTypeIdentifierDefinitionSetSet(DataTypeIdentifierDefinitionSetSet object)
      {
        return createDataTypeIdentifierDefinitionSetSetAdapter();
      }
      @Override
      public Adapter caseExpressionBinaryOperation(ExpressionBinaryOperation object)
      {
        return createExpressionBinaryOperationAdapter();
      }
      @Override
      public Adapter caseUnaryOperation(UnaryOperation object)
      {
        return createUnaryOperationAdapter();
      }
      @Override
      public Adapter caseLiteralData(LiteralData object)
      {
        return createLiteralDataAdapter();
      }
      @Override
      public Adapter caseExpressionIf(ExpressionIf object)
      {
        return createExpressionIfAdapter();
      }
      @Override
      public Adapter caseExpressionSwitch(ExpressionSwitch object)
      {
        return createExpressionSwitchAdapter();
      }
      @Override
      public Adapter caseExpressionForEach(ExpressionForEach object)
      {
        return createExpressionForEachAdapter();
      }
      @Override
      public Adapter caseExpressionFunctionCall(ExpressionFunctionCall object)
      {
        return createExpressionFunctionCallAdapter();
      }
      @Override
      public Adapter caseLiteralBoolean(LiteralBoolean object)
      {
        return createLiteralBooleanAdapter();
      }
      @Override
      public Adapter caseLiteralNull(LiteralNull object)
      {
        return createLiteralNullAdapter();
      }
      @Override
      public Adapter caseLiteralNumber(LiteralNumber object)
      {
        return createLiteralNumberAdapter();
      }
      @Override
      public Adapter caseLiteralText(LiteralText object)
      {
        return createLiteralTextAdapter();
      }
      @Override
      public Adapter caseLiteralEnum(LiteralEnum object)
      {
        return createLiteralEnumAdapter();
      }
      @Override
      public Adapter caseLiteralTime(LiteralTime object)
      {
        return createLiteralTimeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.LilModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.LilModel
   * @generated
   */
  public Adapter createLilModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.ActorTypeDefinition <em>Actor Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.ActorTypeDefinition
   * @generated
   */
  public Adapter createActorTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.ActorType <em>Actor Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.ActorType
   * @generated
   */
  public Adapter createActorTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.ActorInstanceDeclaration <em>Actor Instance Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.ActorInstanceDeclaration
   * @generated
   */
  public Adapter createActorInstanceDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataTypeDefinition <em>Data Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataTypeDefinition
   * @generated
   */
  public Adapter createDataTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataType
   * @generated
   */
  public Adapter createDataTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataTypeSymbolDefinitionSet <em>Data Type Symbol Definition Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataTypeSymbolDefinitionSet
   * @generated
   */
  public Adapter createDataTypeSymbolDefinitionSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataTypeSymbolDefinitionSetElement <em>Data Type Symbol Definition Set Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataTypeSymbolDefinitionSetElement
   * @generated
   */
  public Adapter createDataTypeSymbolDefinitionSetElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataTypeNumberDefinitionSet <em>Data Type Number Definition Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataTypeNumberDefinitionSet
   * @generated
   */
  public Adapter createDataTypeNumberDefinitionSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataTypeTextDefinitionSet <em>Data Type Text Definition Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataTypeTextDefinitionSet
   * @generated
   */
  public Adapter createDataTypeTextDefinitionSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataTypeTimeDefinitionSet <em>Data Type Time Definition Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataTypeTimeDefinitionSet
   * @generated
   */
  public Adapter createDataTypeTimeDefinitionSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataTypeIdentifierDefinitionSet <em>Data Type Identifier Definition Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataTypeIdentifierDefinitionSet
   * @generated
   */
  public Adapter createDataTypeIdentifierDefinitionSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataInstanceDeclaration <em>Data Instance Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataInstanceDeclaration
   * @generated
   */
  public Adapter createDataInstanceDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorTypeDefinition <em>Interactor Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorTypeDefinition
   * @generated
   */
  public Adapter createInteractorTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorType <em>Interactor Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorType
   * @generated
   */
  public Adapter createInteractorTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorActor <em>Interactor Actor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorActor
   * @generated
   */
  public Adapter createInteractorActorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorData <em>Interactor Data</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorData
   * @generated
   */
  public Adapter createInteractorDataAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorSignalAlias <em>Interactor Signal Alias</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorSignalAlias
   * @generated
   */
  public Adapter createInteractorSignalAliasAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorComponent <em>Interactor Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorComponent
   * @generated
   */
  public Adapter createInteractorComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.AccessibleEntity <em>Accessible Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.AccessibleEntity
   * @generated
   */
  public Adapter createAccessibleEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.ActorAlias <em>Actor Alias</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.ActorAlias
   * @generated
   */
  public Adapter createActorAliasAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorSignalReception <em>Interactor Signal Reception</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorSignalReception
   * @generated
   */
  public Adapter createInteractorSignalReceptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorSignalEmission <em>Interactor Signal Emission</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorSignalEmission
   * @generated
   */
  public Adapter createInteractorSignalEmissionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorBehavior <em>Interactor Behavior</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorBehavior
   * @generated
   */
  public Adapter createInteractorBehaviorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorBehaviorCause <em>Interactor Behavior Cause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorBehaviorCause
   * @generated
   */
  public Adapter createInteractorBehaviorCauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorBehaviorOnCause <em>Interactor Behavior On Cause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorBehaviorOnCause
   * @generated
   */
  public Adapter createInteractorBehaviorOnCauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorBehaviorWhenCause <em>Interactor Behavior When Cause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorBehaviorWhenCause
   * @generated
   */
  public Adapter createInteractorBehaviorWhenCauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorBehaviorEffect <em>Interactor Behavior Effect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorBehaviorEffect
   * @generated
   */
  public Adapter createInteractorBehaviorEffectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorBehaviorAlwaysEffect <em>Interactor Behavior Always Effect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorBehaviorAlwaysEffect
   * @generated
   */
  public Adapter createInteractorBehaviorAlwaysEffectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorBehaviorSetEffect <em>Interactor Behavior Set Effect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorBehaviorSetEffect
   * @generated
   */
  public Adapter createInteractorBehaviorSetEffectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorBehaviorTriggerEffect <em>Interactor Behavior Trigger Effect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorBehaviorTriggerEffect
   * @generated
   */
  public Adapter createInteractorBehaviorTriggerEffectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.ExpressionLiteralCollection <em>Expression Literal Collection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.ExpressionLiteralCollection
   * @generated
   */
  public Adapter createExpressionLiteralCollectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.ExpressionLiteralSet <em>Expression Literal Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.ExpressionLiteralSet
   * @generated
   */
  public Adapter createExpressionLiteralSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.ExpressionLiteralList <em>Expression Literal List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.ExpressionLiteralList
   * @generated
   */
  public Adapter createExpressionLiteralListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.ExpressionCase <em>Expression Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.ExpressionCase
   * @generated
   */
  public Adapter createExpressionCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.ActorTypeInput <em>Actor Type Input</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.ActorTypeInput
   * @generated
   */
  public Adapter createActorTypeInputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.ActorTypeOutput <em>Actor Type Output</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.ActorTypeOutput
   * @generated
   */
  public Adapter createActorTypeOutputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.ActorTypeCustom <em>Actor Type Custom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.ActorTypeCustom
   * @generated
   */
  public Adapter createActorTypeCustomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataTypeDefinitionCompound <em>Data Type Definition Compound</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataTypeDefinitionCompound
   * @generated
   */
  public Adapter createDataTypeDefinitionCompoundAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataTypeDefinitionAlias <em>Data Type Definition Alias</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataTypeDefinitionAlias
   * @generated
   */
  public Adapter createDataTypeDefinitionAliasAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataTypeVoid <em>Data Type Void</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataTypeVoid
   * @generated
   */
  public Adapter createDataTypeVoidAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataTypeSymbol <em>Data Type Symbol</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataTypeSymbol
   * @generated
   */
  public Adapter createDataTypeSymbolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataTypeNumber <em>Data Type Number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataTypeNumber
   * @generated
   */
  public Adapter createDataTypeNumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataTypeText <em>Data Type Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataTypeText
   * @generated
   */
  public Adapter createDataTypeTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataTypeTime <em>Data Type Time</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataTypeTime
   * @generated
   */
  public Adapter createDataTypeTimeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataTypeIdentifier <em>Data Type Identifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataTypeIdentifier
   * @generated
   */
  public Adapter createDataTypeIdentifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataTypeCustom <em>Data Type Custom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataTypeCustom
   * @generated
   */
  public Adapter createDataTypeCustomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataTypeCollection <em>Data Type Collection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataTypeCollection
   * @generated
   */
  public Adapter createDataTypeCollectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataTypeSet <em>Data Type Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataTypeSet
   * @generated
   */
  public Adapter createDataTypeSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataTypeList <em>Data Type List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataTypeList
   * @generated
   */
  public Adapter createDataTypeListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataTypeQueue <em>Data Type Queue</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataTypeQueue
   * @generated
   */
  public Adapter createDataTypeQueueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataDefinitionEnumElement <em>Data Definition Enum Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataDefinitionEnumElement
   * @generated
   */
  public Adapter createDataDefinitionEnumElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataTypeNumberDefinitionSetSet <em>Data Type Number Definition Set Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataTypeNumberDefinitionSetSet
   * @generated
   */
  public Adapter createDataTypeNumberDefinitionSetSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataTypeNumberDefinitionSetInterval <em>Data Type Number Definition Set Interval</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataTypeNumberDefinitionSetInterval
   * @generated
   */
  public Adapter createDataTypeNumberDefinitionSetIntervalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataTypeTextDefinitionSetSet <em>Data Type Text Definition Set Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataTypeTextDefinitionSetSet
   * @generated
   */
  public Adapter createDataTypeTextDefinitionSetSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataTypeTimeDefinitionSetSet <em>Data Type Time Definition Set Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataTypeTimeDefinitionSetSet
   * @generated
   */
  public Adapter createDataTypeTimeDefinitionSetSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataTypeTimeDefinitionSetInterval <em>Data Type Time Definition Set Interval</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataTypeTimeDefinitionSetInterval
   * @generated
   */
  public Adapter createDataTypeTimeDefinitionSetIntervalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataTypeIdentifierDefinitionSetSet <em>Data Type Identifier Definition Set Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataTypeIdentifierDefinitionSetSet
   * @generated
   */
  public Adapter createDataTypeIdentifierDefinitionSetSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.ExpressionBinaryOperation <em>Expression Binary Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.ExpressionBinaryOperation
   * @generated
   */
  public Adapter createExpressionBinaryOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.UnaryOperation <em>Unary Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.UnaryOperation
   * @generated
   */
  public Adapter createUnaryOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.LiteralData <em>Literal Data</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.LiteralData
   * @generated
   */
  public Adapter createLiteralDataAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.ExpressionIf <em>Expression If</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.ExpressionIf
   * @generated
   */
  public Adapter createExpressionIfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.ExpressionSwitch <em>Expression Switch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.ExpressionSwitch
   * @generated
   */
  public Adapter createExpressionSwitchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.ExpressionForEach <em>Expression For Each</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.ExpressionForEach
   * @generated
   */
  public Adapter createExpressionForEachAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.ExpressionFunctionCall <em>Expression Function Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.ExpressionFunctionCall
   * @generated
   */
  public Adapter createExpressionFunctionCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.LiteralBoolean <em>Literal Boolean</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.LiteralBoolean
   * @generated
   */
  public Adapter createLiteralBooleanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.LiteralNull <em>Literal Null</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.LiteralNull
   * @generated
   */
  public Adapter createLiteralNullAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.LiteralNumber <em>Literal Number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.LiteralNumber
   * @generated
   */
  public Adapter createLiteralNumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.LiteralText <em>Literal Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.LiteralText
   * @generated
   */
  public Adapter createLiteralTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.LiteralEnum <em>Literal Enum</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.LiteralEnum
   * @generated
   */
  public Adapter createLiteralEnumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.LiteralTime <em>Literal Time</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.LiteralTime
   * @generated
   */
  public Adapter createLiteralTimeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //LilAdapterFactory
