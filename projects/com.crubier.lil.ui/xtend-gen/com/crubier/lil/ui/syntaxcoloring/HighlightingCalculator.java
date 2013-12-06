package com.crubier.lil.ui.syntaxcoloring;

import com.crubier.lil.lil.ActorType;
import com.crubier.lil.lil.ActorTypeDefinition;
import com.crubier.lil.lil.DataDefinitionEnumElement;
import com.crubier.lil.lil.DataType;
import com.crubier.lil.lil.DataTypeDefinition;
import com.crubier.lil.lil.InteractorType;
import com.crubier.lil.lil.InteractorTypeDefinition;
import com.crubier.lil.lil.LiteralBoolean;
import com.crubier.lil.lil.LiteralEnum;
import com.crubier.lil.lil.LiteralNull;
import com.crubier.lil.lil.LiteralNumber;
import com.crubier.lil.lil.LiteralString;
import com.crubier.lil.lil.LiteralTime;
import com.crubier.lil.ui.syntaxcoloring.HighlightingConfiguration;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.impl.TerminalRuleImpl;
import org.eclipse.xtext.resource.DefaultLocationInFileProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;

@SuppressWarnings("all")
public class HighlightingCalculator implements ISemanticHighlightingCalculator {
  public void provideHighlightingFor(final XtextResource resource, final IHighlightedPositionAcceptor acceptor) {
    DefaultLocationInFileProvider _defaultLocationInFileProvider = new DefaultLocationInFileProvider();
    final DefaultLocationInFileProvider locationProvider = _defaultLocationInFileProvider;
    final TreeIterator<EObject> iterator = resource.getAllContents();
    boolean _hasNext = iterator.hasNext();
    boolean _while = _hasNext;
    while (_while) {
      {
        final EObject current = iterator.next();
        final ITextRegion region = locationProvider.getSignificantTextRegion(current);
        final ITextRegion regionf = locationProvider.getFullTextRegion(current);
        boolean _matched = false;
        if (!_matched) {
          if (current instanceof InteractorType) {
            final InteractorType _interactorType = (InteractorType)current;
            _matched=true;
            int _offset = regionf.getOffset();
            int _length = regionf.getLength();
            acceptor.addPosition(_offset, _length, HighlightingConfiguration.INTERACTOR_ID);
          }
        }
        if (!_matched) {
          if (current instanceof InteractorTypeDefinition) {
            final InteractorTypeDefinition _interactorTypeDefinition = (InteractorTypeDefinition)current;
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
            int _offset = regionf.getOffset();
            String _elvis = null;
            String _base = _dataType.getBase();
            if (_base != null) {
              _elvis = _base;
            } else {
              DataTypeDefinition _custom = _dataType.getCustom();
              String _name = _custom.getName();
              _elvis = ObjectExtensions.<String>operator_elvis(_base, _name);
            }
            int _length = _elvis.length();
            acceptor.addPosition(_offset, _length, HighlightingConfiguration.DATA_ID);
          }
        }
        if (!_matched) {
          if (current instanceof DataTypeDefinition) {
            final DataTypeDefinition _dataTypeDefinition = (DataTypeDefinition)current;
            _matched=true;
            int _offset = region.getOffset();
            int _length = region.getLength();
            acceptor.addPosition(_offset, _length, HighlightingConfiguration.DATA_ID);
          }
        }
        if (!_matched) {
          if (current instanceof ActorType) {
            final ActorType _actorType = (ActorType)current;
            _matched=true;
            int _offset = regionf.getOffset();
            int _length = regionf.getLength();
            acceptor.addPosition(_offset, _length, HighlightingConfiguration.ACTOR_ID);
          }
        }
        if (!_matched) {
          if (current instanceof ActorTypeDefinition) {
            final ActorTypeDefinition _actorTypeDefinition = (ActorTypeDefinition)current;
            _matched=true;
            int _offset = region.getOffset();
            int _length = region.getLength();
            acceptor.addPosition(_offset, _length, HighlightingConfiguration.ACTOR_ID);
          }
        }
        if (!_matched) {
          if (current instanceof LiteralBoolean) {
            final LiteralBoolean _literalBoolean = (LiteralBoolean)current;
            _matched=true;
            int _offset = regionf.getOffset();
            int _length = regionf.getLength();
            acceptor.addPosition(_offset, _length, HighlightingConfiguration.LITERAL_ID);
          }
        }
        if (!_matched) {
          if (current instanceof LiteralNull) {
            final LiteralNull _literalNull = (LiteralNull)current;
            _matched=true;
            int _offset = regionf.getOffset();
            int _length = regionf.getLength();
            acceptor.addPosition(_offset, _length, HighlightingConfiguration.LITERAL_ID);
          }
        }
        if (!_matched) {
          if (current instanceof LiteralNumber) {
            final LiteralNumber _literalNumber = (LiteralNumber)current;
            _matched=true;
            int _offset = regionf.getOffset();
            int _length = regionf.getLength();
            acceptor.addPosition(_offset, _length, HighlightingConfiguration.LITERAL_ID);
          }
        }
        if (!_matched) {
          if (current instanceof LiteralString) {
            final LiteralString _literalString = (LiteralString)current;
            _matched=true;
            int _offset = regionf.getOffset();
            int _length = regionf.getLength();
            acceptor.addPosition(_offset, _length, HighlightingConfiguration.LITERAL_ID);
          }
        }
        if (!_matched) {
          if (current instanceof LiteralEnum) {
            final LiteralEnum _literalEnum = (LiteralEnum)current;
            _matched=true;
            int _offset = regionf.getOffset();
            int _length = regionf.getLength();
            acceptor.addPosition(_offset, _length, HighlightingConfiguration.LITERAL_ID);
          }
        }
        if (!_matched) {
          if (current instanceof DataDefinitionEnumElement) {
            final DataDefinitionEnumElement _dataDefinitionEnumElement = (DataDefinitionEnumElement)current;
            _matched=true;
            int _offset = regionf.getOffset();
            int _length = regionf.getLength();
            acceptor.addPosition(_offset, _length, HighlightingConfiguration.LITERAL_ID);
          }
        }
        if (!_matched) {
          if (current instanceof LiteralTime) {
            final LiteralTime _literalTime = (LiteralTime)current;
            _matched=true;
            int _offset = regionf.getOffset();
            int _length = regionf.getLength();
            acceptor.addPosition(_offset, _length, HighlightingConfiguration.LITERAL_ID);
          }
        }
        if (!_matched) {
          if (current instanceof TerminalRuleImpl) {
            final TerminalRuleImpl _terminalRuleImpl = (TerminalRuleImpl)current;
            _matched=true;
            int _offset = region.getOffset();
            int _length = region.getLength();
            acceptor.addPosition(_offset, _length, HighlightingConfiguration.SPECIAL_ID);
          }
        }
      }
      boolean _hasNext_1 = iterator.hasNext();
      _while = _hasNext_1;
    }
  }
}
