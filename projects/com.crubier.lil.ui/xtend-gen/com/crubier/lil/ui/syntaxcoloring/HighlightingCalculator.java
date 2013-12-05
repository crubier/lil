package com.crubier.lil.ui.syntaxcoloring;

import com.crubier.lil.lil.DataType;
import com.crubier.lil.lil.InteractorType;
import com.crubier.lil.ui.syntaxcoloring.HighlightingConfiguration;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xtext.XtextLocationInFileProvider;

@SuppressWarnings("all")
public class HighlightingCalculator implements ISemanticHighlightingCalculator {
  public void provideHighlightingFor(final XtextResource resource, final IHighlightedPositionAcceptor acceptor) {
    InputOutput.<String>println("I was called");
    XtextLocationInFileProvider _xtextLocationInFileProvider = new XtextLocationInFileProvider();
    final XtextLocationInFileProvider locationProvider = _xtextLocationInFileProvider;
    final TreeIterator<EObject> iterator = resource.getAllContents();
    boolean _hasNext = iterator.hasNext();
    boolean _while = _hasNext;
    while (_while) {
      {
        final EObject current = iterator.next();
        final ITextRegion region = locationProvider.getSignificantTextRegion(current);
        boolean _matched = false;
        if (!_matched) {
          if (current instanceof InteractorType) {
            final InteractorType _interactorType = (InteractorType)current;
            _matched=true;
            int _offset = region.getOffset();
            int _length = region.getLength();
            acceptor.addPosition(_offset, _length, HighlightingConfiguration.INTERACTOR_ID);
          }
        }
        if (!_matched) {
          if (current instanceof DataType) {
            final DataType _dataType = (DataType)current;
            _matched=true;
            int _offset = region.getOffset();
            int _length = region.getLength();
            acceptor.addPosition(_offset, _length, HighlightingConfiguration.INTERACTOR_ID);
          }
        }
      }
      boolean _hasNext_1 = iterator.hasNext();
      _while = _hasNext_1;
    }
  }
}
