/**
 * generated by Xtext
 */
package com.crubier.lil.generator;

import com.crubier.lil.lil.Interactor;
import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class LilGeneratorJava implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    InputOutput.<String>println("generate Java code");
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Interactor> _filter = Iterables.<Interactor>filter(_iterable, Interactor.class);
    for (final Interactor e : _filter) {
    }
  }
}
