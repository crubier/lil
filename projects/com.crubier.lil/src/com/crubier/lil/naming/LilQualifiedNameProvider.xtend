package com.crubier.lil.naming

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import com.crubier.lil.lil.ActorTypeDefinition
import com.crubier.lil.lil.LilModel
import com.crubier.lil.lil.InteractorTypeDefinition
import com.crubier.lil.lil.DataTypeDefinition

class LilQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

  def qualifiedName(LilModel t) {
    return QualifiedName.create(t.name);
  }
  
  def qualifiedName(ActorTypeDefinition t) {
    return QualifiedName.create((t.eContainer as LilModel).name,t.name);
  }	
  
  def qualifiedName(DataTypeDefinition t) {
    return QualifiedName.create((t.eContainer as LilModel).name,t.name);
  }	
  
  def qualifiedName(InteractorTypeDefinition t) {
    return QualifiedName.create((t.eContainer as LilModel).name,t.name);
  }	
	
}