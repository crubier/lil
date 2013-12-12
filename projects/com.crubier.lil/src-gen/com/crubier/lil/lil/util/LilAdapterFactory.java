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
      public Adapter caseImportStatement(ImportStatement object)
      {
        return createImportStatementAdapter();
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
      public Adapter caseActorComponentDeclaration(ActorComponentDeclaration object)
      {
        return createActorComponentDeclarationAdapter();
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
      public Adapter caseDataComponentDeclaration(DataComponentDeclaration object)
      {
        return createDataComponentDeclarationAdapter();
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
      public Adapter caseInteractorEntityDeclaration(InteractorEntityDeclaration object)
      {
        return createInteractorEntityDeclarationAdapter();
      }
      @Override
      public Adapter caseInteractorDataDeclaration(InteractorDataDeclaration object)
      {
        return createInteractorDataDeclarationAdapter();
      }
      @Override
      public Adapter caseInteractorActorAlias(InteractorActorAlias object)
      {
        return createInteractorActorAliasAdapter();
      }
      @Override
      public Adapter caseInteractorDataAlias(InteractorDataAlias object)
      {
        return createInteractorDataAliasAdapter();
      }
      @Override
      public Adapter caseInteractorEntity(InteractorEntity object)
      {
        return createInteractorEntityAdapter();
      }
      @Override
      public Adapter caseInteractorDataReception(InteractorDataReception object)
      {
        return createInteractorDataReceptionAdapter();
      }
      @Override
      public Adapter caseInteractorDataEmission(InteractorDataEmission object)
      {
        return createInteractorDataEmissionAdapter();
      }
      @Override
      public Adapter caseInteractorBehaviorDeclaration(InteractorBehaviorDeclaration object)
      {
        return createInteractorBehaviorDeclarationAdapter();
      }
      @Override
      public Adapter caseInteractorBehaviorCause(InteractorBehaviorCause object)
      {
        return createInteractorBehaviorCauseAdapter();
      }
      @Override
      public Adapter caseInteractorBehaviorEffect(InteractorBehaviorEffect object)
      {
        return createInteractorBehaviorEffectAdapter();
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
      public Adapter caseInteractorTypeCustom(InteractorTypeCustom object)
      {
        return createInteractorTypeCustomAdapter();
      }
      @Override
      public Adapter caseInteractorActorDeclaration(InteractorActorDeclaration object)
      {
        return createInteractorActorDeclarationAdapter();
      }
      @Override
      public Adapter caseInteractorComponentDeclaration(InteractorComponentDeclaration object)
      {
        return createInteractorComponentDeclarationAdapter();
      }
      @Override
      public Adapter caseInteractorDataDeclarationEvent(InteractorDataDeclarationEvent object)
      {
        return createInteractorDataDeclarationEventAdapter();
      }
      @Override
      public Adapter caseInteractorDataDeclarationFlow(InteractorDataDeclarationFlow object)
      {
        return createInteractorDataDeclarationFlowAdapter();
      }
      @Override
      public Adapter caseInteractorDataDeclarationConstant(InteractorDataDeclarationConstant object)
      {
        return createInteractorDataDeclarationConstantAdapter();
      }
      @Override
      public Adapter caseInteractorEntityAny(InteractorEntityAny object)
      {
        return createInteractorEntityAnyAdapter();
      }
      @Override
      public Adapter caseInteractorEntitySelf(InteractorEntitySelf object)
      {
        return createInteractorEntitySelfAdapter();
      }
      @Override
      public Adapter caseInteractorEntityOther(InteractorEntityOther object)
      {
        return createInteractorEntityOtherAdapter();
      }
      @Override
      public Adapter caseInteractorEntityParent(InteractorEntityParent object)
      {
        return createInteractorEntityParentAdapter();
      }
      @Override
      public Adapter caseInteractorEntityChild(InteractorEntityChild object)
      {
        return createInteractorEntityChildAdapter();
      }
      @Override
      public Adapter caseInteractorEntityAll(InteractorEntityAll object)
      {
        return createInteractorEntityAllAdapter();
      }
      @Override
      public Adapter caseInteractorEntityActors(InteractorEntityActors object)
      {
        return createInteractorEntityActorsAdapter();
      }
      @Override
      public Adapter caseInteractorEntitySpecific(InteractorEntitySpecific object)
      {
        return createInteractorEntitySpecificAdapter();
      }
      @Override
      public Adapter caseInteractorDataReceptionInternal(InteractorDataReceptionInternal object)
      {
        return createInteractorDataReceptionInternalAdapter();
      }
      @Override
      public Adapter caseInteractorDataReceptionExternal(InteractorDataReceptionExternal object)
      {
        return createInteractorDataReceptionExternalAdapter();
      }
      @Override
      public Adapter caseInteractorDataReceptionInit(InteractorDataReceptionInit object)
      {
        return createInteractorDataReceptionInitAdapter();
      }
      @Override
      public Adapter caseInteractorDataEmissionInternal(InteractorDataEmissionInternal object)
      {
        return createInteractorDataEmissionInternalAdapter();
      }
      @Override
      public Adapter caseInteractorDataEmissionExternal(InteractorDataEmissionExternal object)
      {
        return createInteractorDataEmissionExternalAdapter();
      }
      @Override
      public Adapter caseInteractorBehaviorCauseOn(InteractorBehaviorCauseOn object)
      {
        return createInteractorBehaviorCauseOnAdapter();
      }
      @Override
      public Adapter caseInteractorBehaviorCauseWhen(InteractorBehaviorCauseWhen object)
      {
        return createInteractorBehaviorCauseWhenAdapter();
      }
      @Override
      public Adapter caseInteractorBehaviorEffectAlways(InteractorBehaviorEffectAlways object)
      {
        return createInteractorBehaviorEffectAlwaysAdapter();
      }
      @Override
      public Adapter caseInteractorBehaviorEffectSet(InteractorBehaviorEffectSet object)
      {
        return createInteractorBehaviorEffectSetAdapter();
      }
      @Override
      public Adapter caseInteractorBehaviorEffectTrigger(InteractorBehaviorEffectTrigger object)
      {
        return createInteractorBehaviorEffectTriggerAdapter();
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
      public Adapter caseLiteralTimeNow(LiteralTimeNow object)
      {
        return createLiteralTimeNowAdapter();
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
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.ImportStatement <em>Import Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.ImportStatement
   * @generated
   */
  public Adapter createImportStatementAdapter()
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
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.ActorComponentDeclaration <em>Actor Component Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.ActorComponentDeclaration
   * @generated
   */
  public Adapter createActorComponentDeclarationAdapter()
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
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.DataComponentDeclaration <em>Data Component Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.DataComponentDeclaration
   * @generated
   */
  public Adapter createDataComponentDeclarationAdapter()
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
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorEntityDeclaration <em>Interactor Entity Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorEntityDeclaration
   * @generated
   */
  public Adapter createInteractorEntityDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorDataDeclaration <em>Interactor Data Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorDataDeclaration
   * @generated
   */
  public Adapter createInteractorDataDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorActorAlias <em>Interactor Actor Alias</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorActorAlias
   * @generated
   */
  public Adapter createInteractorActorAliasAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorDataAlias <em>Interactor Data Alias</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorDataAlias
   * @generated
   */
  public Adapter createInteractorDataAliasAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorEntity <em>Interactor Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorEntity
   * @generated
   */
  public Adapter createInteractorEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorDataReception <em>Interactor Data Reception</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorDataReception
   * @generated
   */
  public Adapter createInteractorDataReceptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorDataEmission <em>Interactor Data Emission</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorDataEmission
   * @generated
   */
  public Adapter createInteractorDataEmissionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorBehaviorDeclaration <em>Interactor Behavior Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorBehaviorDeclaration
   * @generated
   */
  public Adapter createInteractorBehaviorDeclarationAdapter()
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
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorTypeCustom <em>Interactor Type Custom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorTypeCustom
   * @generated
   */
  public Adapter createInteractorTypeCustomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorActorDeclaration <em>Interactor Actor Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorActorDeclaration
   * @generated
   */
  public Adapter createInteractorActorDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorComponentDeclaration <em>Interactor Component Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorComponentDeclaration
   * @generated
   */
  public Adapter createInteractorComponentDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorDataDeclarationEvent <em>Interactor Data Declaration Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorDataDeclarationEvent
   * @generated
   */
  public Adapter createInteractorDataDeclarationEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorDataDeclarationFlow <em>Interactor Data Declaration Flow</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorDataDeclarationFlow
   * @generated
   */
  public Adapter createInteractorDataDeclarationFlowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorDataDeclarationConstant <em>Interactor Data Declaration Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorDataDeclarationConstant
   * @generated
   */
  public Adapter createInteractorDataDeclarationConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorEntityAny <em>Interactor Entity Any</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorEntityAny
   * @generated
   */
  public Adapter createInteractorEntityAnyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorEntitySelf <em>Interactor Entity Self</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorEntitySelf
   * @generated
   */
  public Adapter createInteractorEntitySelfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorEntityOther <em>Interactor Entity Other</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorEntityOther
   * @generated
   */
  public Adapter createInteractorEntityOtherAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorEntityParent <em>Interactor Entity Parent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorEntityParent
   * @generated
   */
  public Adapter createInteractorEntityParentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorEntityChild <em>Interactor Entity Child</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorEntityChild
   * @generated
   */
  public Adapter createInteractorEntityChildAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorEntityAll <em>Interactor Entity All</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorEntityAll
   * @generated
   */
  public Adapter createInteractorEntityAllAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorEntityActors <em>Interactor Entity Actors</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorEntityActors
   * @generated
   */
  public Adapter createInteractorEntityActorsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorEntitySpecific <em>Interactor Entity Specific</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorEntitySpecific
   * @generated
   */
  public Adapter createInteractorEntitySpecificAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorDataReceptionInternal <em>Interactor Data Reception Internal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorDataReceptionInternal
   * @generated
   */
  public Adapter createInteractorDataReceptionInternalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorDataReceptionExternal <em>Interactor Data Reception External</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorDataReceptionExternal
   * @generated
   */
  public Adapter createInteractorDataReceptionExternalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorDataReceptionInit <em>Interactor Data Reception Init</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorDataReceptionInit
   * @generated
   */
  public Adapter createInteractorDataReceptionInitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorDataEmissionInternal <em>Interactor Data Emission Internal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorDataEmissionInternal
   * @generated
   */
  public Adapter createInteractorDataEmissionInternalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorDataEmissionExternal <em>Interactor Data Emission External</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorDataEmissionExternal
   * @generated
   */
  public Adapter createInteractorDataEmissionExternalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorBehaviorCauseOn <em>Interactor Behavior Cause On</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorBehaviorCauseOn
   * @generated
   */
  public Adapter createInteractorBehaviorCauseOnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorBehaviorCauseWhen <em>Interactor Behavior Cause When</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorBehaviorCauseWhen
   * @generated
   */
  public Adapter createInteractorBehaviorCauseWhenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorBehaviorEffectAlways <em>Interactor Behavior Effect Always</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorBehaviorEffectAlways
   * @generated
   */
  public Adapter createInteractorBehaviorEffectAlwaysAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorBehaviorEffectSet <em>Interactor Behavior Effect Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorBehaviorEffectSet
   * @generated
   */
  public Adapter createInteractorBehaviorEffectSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.InteractorBehaviorEffectTrigger <em>Interactor Behavior Effect Trigger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.InteractorBehaviorEffectTrigger
   * @generated
   */
  public Adapter createInteractorBehaviorEffectTriggerAdapter()
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
   * Creates a new adapter for an object of class '{@link com.crubier.lil.lil.LiteralTimeNow <em>Literal Time Now</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.crubier.lil.lil.LiteralTimeNow
   * @generated
   */
  public Adapter createLiteralTimeNowAdapter()
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
