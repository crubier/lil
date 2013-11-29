package com.crubier.lil.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.crubier.lil.services.LilGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLilParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'interactor'", "':'", "'any'", "'self'", "'other'", "'parent'", "'child'", "'all'", "'actors'", "'actor'", "'as'", "'with'", "','", "'from'", "'init'", "'to'", "'{'", "'}'", "'['", "']'", "'event'", "'flow'", "'constant'", "'in'", "'set'", "'list'", "'map'", "'of'", "'void'", "'symbol'", "'number'", "'text'", "'time'", "'identifier'", "'structure'", "'on'", "'if'", "'when'", "'always'", "'='", "'trigger'", "'or'", "'and'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'<>'", "'?:'", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'#'", "'('", "')'", "'else'", "'switch'", "'default'", "'case'", "'for'", "'each'", "'Math.abs'", "'Math.acos'", "'Math.acosh'", "'Math.asin'", "'Math.asinh'", "'Math.atan'", "'Math.atanh'", "'Math.atan2'", "'Math.ceil'", "'Math.clip'", "'Math.cos'", "'Math.cosh'", "'Math.exp'", "'Math.floor'", "'Math.fround'", "'Math.hypot'", "'Math.log'", "'Math.log10'", "'Math.log2'", "'Math.max'", "'Math.min'", "'Math.pow'", "'Math.random'", "'Math.round'", "'Math.sign'", "'Math.sin'", "'Math.sinh'", "'Math.sqrt'", "'Math.tan'", "'Math.tanh'", "'Math.trunc'", "'Set.orderby'", "'Set.add'", "'Set.find'", "'Set.change'", "'Set.remove'", "'false'", "'true'", "'null'", "'now'", "'year'", "'month'", "'day'", "'hour'", "'m'", "'minute'", "'s'", "'second'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__125=125;
    public static final int RULE_STRING=5;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int RULE_INT=6;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalLilParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLilParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLilParser.tokenNames; }
    public String getGrammarFileName() { return "../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g"; }



     	private LilGrammarAccess grammarAccess;
     	
        public InternalLilParser(TokenStream input, LilGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "LilModel";	
       	}
       	
       	@Override
       	protected LilGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleLilModel"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:67:1: entryRuleLilModel returns [EObject current=null] : iv_ruleLilModel= ruleLilModel EOF ;
    public final EObject entryRuleLilModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLilModel = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:68:2: (iv_ruleLilModel= ruleLilModel EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:69:2: iv_ruleLilModel= ruleLilModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLilModelRule()); 
            }
            pushFollow(FOLLOW_ruleLilModel_in_entryRuleLilModel75);
            iv_ruleLilModel=ruleLilModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLilModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLilModel85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLilModel"


    // $ANTLR start "ruleLilModel"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:76:1: ruleLilModel returns [EObject current=null] : ( ( (lv_interactors_0_0= ruleInteractor ) ) | ( (lv_dataTypes_1_0= ruleDataTypeDefinition ) ) )* ;
    public final EObject ruleLilModel() throws RecognitionException {
        EObject current = null;

        EObject lv_interactors_0_0 = null;

        EObject lv_dataTypes_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:79:28: ( ( ( (lv_interactors_0_0= ruleInteractor ) ) | ( (lv_dataTypes_1_0= ruleDataTypeDefinition ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:80:1: ( ( (lv_interactors_0_0= ruleInteractor ) ) | ( (lv_dataTypes_1_0= ruleDataTypeDefinition ) ) )*
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:80:1: ( ( (lv_interactors_0_0= ruleInteractor ) ) | ( (lv_dataTypes_1_0= ruleDataTypeDefinition ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }
                else if ( (LA1_0==45) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:80:2: ( (lv_interactors_0_0= ruleInteractor ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:80:2: ( (lv_interactors_0_0= ruleInteractor ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:81:1: (lv_interactors_0_0= ruleInteractor )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:81:1: (lv_interactors_0_0= ruleInteractor )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:82:3: lv_interactors_0_0= ruleInteractor
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLilModelAccess().getInteractorsInteractorParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInteractor_in_ruleLilModel131);
            	    lv_interactors_0_0=ruleInteractor();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLilModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"interactors",
            	              		lv_interactors_0_0, 
            	              		"Interactor");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:99:6: ( (lv_dataTypes_1_0= ruleDataTypeDefinition ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:99:6: ( (lv_dataTypes_1_0= ruleDataTypeDefinition ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:100:1: (lv_dataTypes_1_0= ruleDataTypeDefinition )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:100:1: (lv_dataTypes_1_0= ruleDataTypeDefinition )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:101:3: lv_dataTypes_1_0= ruleDataTypeDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLilModelAccess().getDataTypesDataTypeDefinitionParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDataTypeDefinition_in_ruleLilModel158);
            	    lv_dataTypes_1_0=ruleDataTypeDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLilModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"dataTypes",
            	              		lv_dataTypes_1_0, 
            	              		"DataTypeDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLilModel"


    // $ANTLR start "entryRuleInteractor"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:125:1: entryRuleInteractor returns [EObject current=null] : iv_ruleInteractor= ruleInteractor EOF ;
    public final EObject entryRuleInteractor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractor = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:126:2: (iv_ruleInteractor= ruleInteractor EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:127:2: iv_ruleInteractor= ruleInteractor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorRule()); 
            }
            pushFollow(FOLLOW_ruleInteractor_in_entryRuleInteractor195);
            iv_ruleInteractor=ruleInteractor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractor205); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteractor"


    // $ANTLR start "ruleInteractor"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:134:1: ruleInteractor returns [EObject current=null] : (otherlv_0= 'interactor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_entities_3_0= ruleEntity ) ) | ( (lv_signals_4_0= ruleSignal ) ) | ( (lv_behaviors_5_0= ruleBehavior ) ) )* ) ;
    public final EObject ruleInteractor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_entities_3_0 = null;

        EObject lv_signals_4_0 = null;

        EObject lv_behaviors_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:137:28: ( (otherlv_0= 'interactor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_entities_3_0= ruleEntity ) ) | ( (lv_signals_4_0= ruleSignal ) ) | ( (lv_behaviors_5_0= ruleBehavior ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:138:1: (otherlv_0= 'interactor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_entities_3_0= ruleEntity ) ) | ( (lv_signals_4_0= ruleSignal ) ) | ( (lv_behaviors_5_0= ruleBehavior ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:138:1: (otherlv_0= 'interactor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_entities_3_0= ruleEntity ) ) | ( (lv_signals_4_0= ruleSignal ) ) | ( (lv_behaviors_5_0= ruleBehavior ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:138:3: otherlv_0= 'interactor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_entities_3_0= ruleEntity ) ) | ( (lv_signals_4_0= ruleSignal ) ) | ( (lv_behaviors_5_0= ruleBehavior ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleInteractor242); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInteractorAccess().getInteractorKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:142:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:143:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:143:1: (lv_name_1_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:144:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractor259); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getInteractorAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInteractorRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleInteractor276); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInteractorAccess().getColonKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:164:1: ( ( (lv_entities_3_0= ruleEntity ) ) | ( (lv_signals_4_0= ruleSignal ) ) | ( (lv_behaviors_5_0= ruleBehavior ) ) )*
            loop2:
            do {
                int alt2=4;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==12) ) {
                        switch ( input.LA(3) ) {
                        case 35:
                        case 36:
                        case 37:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                            {
                            alt2=2;
                            }
                            break;
                        case RULE_ID:
                            {
                            int LA2_6 = input.LA(4);

                            if ( ((LA2_6>=31 && LA2_6<=33)) ) {
                                alt2=2;
                            }
                            else if ( (LA2_6==EOF||LA2_6==RULE_ID||LA2_6==11||LA2_6==22||(LA2_6>=45 && LA2_6<=46)||LA2_6==48) ) {
                                alt2=1;
                            }


                            }
                            break;
                        case 20:
                            {
                            alt2=1;
                            }
                            break;

                        }

                    }


                }
                else if ( (LA2_0==46||LA2_0==48) ) {
                    alt2=3;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:164:2: ( (lv_entities_3_0= ruleEntity ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:164:2: ( (lv_entities_3_0= ruleEntity ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:165:1: (lv_entities_3_0= ruleEntity )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:165:1: (lv_entities_3_0= ruleEntity )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:166:3: lv_entities_3_0= ruleEntity
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInteractorAccess().getEntitiesEntityParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEntity_in_ruleInteractor298);
            	    lv_entities_3_0=ruleEntity();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInteractorRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"entities",
            	              		lv_entities_3_0, 
            	              		"Entity");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:183:6: ( (lv_signals_4_0= ruleSignal ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:183:6: ( (lv_signals_4_0= ruleSignal ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:184:1: (lv_signals_4_0= ruleSignal )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:184:1: (lv_signals_4_0= ruleSignal )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:185:3: lv_signals_4_0= ruleSignal
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInteractorAccess().getSignalsSignalParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSignal_in_ruleInteractor325);
            	    lv_signals_4_0=ruleSignal();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInteractorRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"signals",
            	              		lv_signals_4_0, 
            	              		"Signal");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:202:6: ( (lv_behaviors_5_0= ruleBehavior ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:202:6: ( (lv_behaviors_5_0= ruleBehavior ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:203:1: (lv_behaviors_5_0= ruleBehavior )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:203:1: (lv_behaviors_5_0= ruleBehavior )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:204:3: lv_behaviors_5_0= ruleBehavior
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInteractorAccess().getBehaviorsBehaviorParserRuleCall_3_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBehavior_in_ruleInteractor352);
            	    lv_behaviors_5_0=ruleBehavior();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInteractorRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"behaviors",
            	              		lv_behaviors_5_0, 
            	              		"Behavior");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteractor"


    // $ANTLR start "entryRuleAccessibleEntity"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:228:1: entryRuleAccessibleEntity returns [EObject current=null] : iv_ruleAccessibleEntity= ruleAccessibleEntity EOF ;
    public final EObject entryRuleAccessibleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessibleEntity = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:229:2: (iv_ruleAccessibleEntity= ruleAccessibleEntity EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:230:2: iv_ruleAccessibleEntity= ruleAccessibleEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAccessibleEntityRule()); 
            }
            pushFollow(FOLLOW_ruleAccessibleEntity_in_entryRuleAccessibleEntity390);
            iv_ruleAccessibleEntity=ruleAccessibleEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAccessibleEntity; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAccessibleEntity400); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAccessibleEntity"


    // $ANTLR start "ruleAccessibleEntity"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:237:1: ruleAccessibleEntity returns [EObject current=null] : ( ( (lv_generic_0_0= ruleGenericEntity ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleAccessibleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_generic_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:240:28: ( ( ( (lv_generic_0_0= ruleGenericEntity ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:241:1: ( ( (lv_generic_0_0= ruleGenericEntity ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:241:1: ( ( (lv_generic_0_0= ruleGenericEntity ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=13 && LA3_0<=19)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:241:2: ( (lv_generic_0_0= ruleGenericEntity ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:241:2: ( (lv_generic_0_0= ruleGenericEntity ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:242:1: (lv_generic_0_0= ruleGenericEntity )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:242:1: (lv_generic_0_0= ruleGenericEntity )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:243:3: lv_generic_0_0= ruleGenericEntity
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAccessibleEntityAccess().getGenericGenericEntityParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGenericEntity_in_ruleAccessibleEntity446);
                    lv_generic_0_0=ruleGenericEntity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAccessibleEntityRule());
                      	        }
                             		set(
                             			current, 
                             			"generic",
                              		lv_generic_0_0, 
                              		"GenericEntity");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:260:6: ( (otherlv_1= RULE_ID ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:260:6: ( (otherlv_1= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:261:1: (otherlv_1= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:261:1: (otherlv_1= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:262:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAccessibleEntityRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAccessibleEntity472); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getAccessibleEntityAccess().getSpecificEntityCrossReference_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAccessibleEntity"


    // $ANTLR start "entryRuleGenericEntity"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:281:1: entryRuleGenericEntity returns [String current=null] : iv_ruleGenericEntity= ruleGenericEntity EOF ;
    public final String entryRuleGenericEntity() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGenericEntity = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:282:2: (iv_ruleGenericEntity= ruleGenericEntity EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:283:2: iv_ruleGenericEntity= ruleGenericEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGenericEntityRule()); 
            }
            pushFollow(FOLLOW_ruleGenericEntity_in_entryRuleGenericEntity509);
            iv_ruleGenericEntity=ruleGenericEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGenericEntity.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericEntity520); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGenericEntity"


    // $ANTLR start "ruleGenericEntity"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:290:1: ruleGenericEntity returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'any' | kw= 'self' | kw= 'other' | kw= 'parent' | kw= 'child' | kw= 'all' | kw= 'actors' ) ;
    public final AntlrDatatypeRuleToken ruleGenericEntity() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:293:28: ( (kw= 'any' | kw= 'self' | kw= 'other' | kw= 'parent' | kw= 'child' | kw= 'all' | kw= 'actors' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:294:1: (kw= 'any' | kw= 'self' | kw= 'other' | kw= 'parent' | kw= 'child' | kw= 'all' | kw= 'actors' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:294:1: (kw= 'any' | kw= 'self' | kw= 'other' | kw= 'parent' | kw= 'child' | kw= 'all' | kw= 'actors' )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            case 17:
                {
                alt4=5;
                }
                break;
            case 18:
                {
                alt4=6;
                }
                break;
            case 19:
                {
                alt4=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:295:2: kw= 'any'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleGenericEntity558); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getGenericEntityAccess().getAnyKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:302:2: kw= 'self'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleGenericEntity577); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getGenericEntityAccess().getSelfKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:309:2: kw= 'other'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleGenericEntity596); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getGenericEntityAccess().getOtherKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:316:2: kw= 'parent'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleGenericEntity615); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getGenericEntityAccess().getParentKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:323:2: kw= 'child'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleGenericEntity634); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getGenericEntityAccess().getChildKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:330:2: kw= 'all'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleGenericEntity653); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getGenericEntityAccess().getAllKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:337:2: kw= 'actors'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleGenericEntity672); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getGenericEntityAccess().getActorsKeyword_6()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGenericEntity"


    // $ANTLR start "entryRuleEntity"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:350:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:351:2: (iv_ruleEntity= ruleEntity EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:352:2: iv_ruleEntity= ruleEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntityRule()); 
            }
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity712);
            iv_ruleEntity=ruleEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntity; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity722); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:359:1: ruleEntity returns [EObject current=null] : (this_Actor_0= ruleActor | this_Component_1= ruleComponent ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Actor_0 = null;

        EObject this_Component_1 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:362:28: ( (this_Actor_0= ruleActor | this_Component_1= ruleComponent ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:363:1: (this_Actor_0= ruleActor | this_Component_1= ruleComponent )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:363:1: (this_Actor_0= ruleActor | this_Component_1= ruleComponent )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==12) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==20) ) {
                        alt5=1;
                    }
                    else if ( (LA5_2==RULE_ID) ) {
                        alt5=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:364:5: this_Actor_0= ruleActor
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEntityAccess().getActorParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleActor_in_ruleEntity769);
                    this_Actor_0=ruleActor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Actor_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:374:5: this_Component_1= ruleComponent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEntityAccess().getComponentParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComponent_in_ruleEntity796);
                    this_Component_1=ruleComponent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Component_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleActor"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:390:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:391:2: (iv_ruleActor= ruleActor EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:392:2: iv_ruleActor= ruleActor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActorRule()); 
            }
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor831);
            iv_ruleActor=ruleActor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor841); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:399:1: ruleActor returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'actor' ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:402:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'actor' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:403:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'actor' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:403:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'actor' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:403:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'actor'
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:403:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:404:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:404:1: (lv_name_0_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:405:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor883); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getActorAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getActorRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleActor900); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActorAccess().getColonKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleActor912); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getActorAccess().getActorKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleActorAlias"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:437:1: entryRuleActorAlias returns [EObject current=null] : iv_ruleActorAlias= ruleActorAlias EOF ;
    public final EObject entryRuleActorAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActorAlias = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:438:2: (iv_ruleActorAlias= ruleActorAlias EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:439:2: iv_ruleActorAlias= ruleActorAlias EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActorAliasRule()); 
            }
            pushFollow(FOLLOW_ruleActorAlias_in_entryRuleActorAlias948);
            iv_ruleActorAlias=ruleActorAlias();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActorAlias; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActorAlias958); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActorAlias"


    // $ANTLR start "ruleActorAlias"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:446:1: ruleActorAlias returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleActorAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:449:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:450:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:450:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:450:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:450:2: ( (otherlv_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:451:1: (otherlv_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:451:1: (otherlv_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:452:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getActorAliasRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActorAlias1003); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getActorAliasAccess().getSourceActorCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleActorAlias1015); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActorAliasAccess().getAsKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:467:1: ( (otherlv_2= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:468:1: (otherlv_2= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:468:1: (otherlv_2= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:469:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getActorAliasRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActorAlias1035); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getActorAliasAccess().getAliasActorCrossReference_2_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActorAlias"


    // $ANTLR start "entryRuleComponent"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:488:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:489:2: (iv_ruleComponent= ruleComponent EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:490:2: iv_ruleComponent= ruleComponent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentRule()); 
            }
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent1071);
            iv_ruleComponent=ruleComponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent1081); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:497:1: ruleComponent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'with' ( (lv_actors_4_0= ruleActorAlias ) ) (otherlv_5= ',' ( (lv_actors_6_0= ruleActorAlias ) ) )* )? ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_actors_4_0 = null;

        EObject lv_actors_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:500:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'with' ( (lv_actors_4_0= ruleActorAlias ) ) (otherlv_5= ',' ( (lv_actors_6_0= ruleActorAlias ) ) )* )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:501:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'with' ( (lv_actors_4_0= ruleActorAlias ) ) (otherlv_5= ',' ( (lv_actors_6_0= ruleActorAlias ) ) )* )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:501:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'with' ( (lv_actors_4_0= ruleActorAlias ) ) (otherlv_5= ',' ( (lv_actors_6_0= ruleActorAlias ) ) )* )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:501:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'with' ( (lv_actors_4_0= ruleActorAlias ) ) (otherlv_5= ',' ( (lv_actors_6_0= ruleActorAlias ) ) )* )?
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:501:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:502:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:502:1: (lv_name_0_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:503:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponent1123); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getComponentRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleComponent1140); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getComponentAccess().getColonKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:523:1: ( (otherlv_2= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:524:1: (otherlv_2= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:524:1: (otherlv_2= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:525:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getComponentRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponent1160); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getInteractorInteractorCrossReference_2_0()); 
              	
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:536:2: (otherlv_3= 'with' ( (lv_actors_4_0= ruleActorAlias ) ) (otherlv_5= ',' ( (lv_actors_6_0= ruleActorAlias ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:536:4: otherlv_3= 'with' ( (lv_actors_4_0= ruleActorAlias ) ) (otherlv_5= ',' ( (lv_actors_6_0= ruleActorAlias ) ) )*
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleComponent1173); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getWithKeyword_3_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:540:1: ( (lv_actors_4_0= ruleActorAlias ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:541:1: (lv_actors_4_0= ruleActorAlias )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:541:1: (lv_actors_4_0= ruleActorAlias )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:542:3: lv_actors_4_0= ruleActorAlias
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComponentAccess().getActorsActorAliasParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleActorAlias_in_ruleComponent1194);
                    lv_actors_4_0=ruleActorAlias();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getComponentRule());
                      	        }
                             		add(
                             			current, 
                             			"actors",
                              		lv_actors_4_0, 
                              		"ActorAlias");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:558:2: (otherlv_5= ',' ( (lv_actors_6_0= ruleActorAlias ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==23) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:558:4: otherlv_5= ',' ( (lv_actors_6_0= ruleActorAlias ) )
                    	    {
                    	    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleComponent1207); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:562:1: ( (lv_actors_6_0= ruleActorAlias ) )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:563:1: (lv_actors_6_0= ruleActorAlias )
                    	    {
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:563:1: (lv_actors_6_0= ruleActorAlias )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:564:3: lv_actors_6_0= ruleActorAlias
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getComponentAccess().getActorsActorAliasParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleActorAlias_in_ruleComponent1228);
                    	    lv_actors_6_0=ruleActorAlias();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"actors",
                    	              		lv_actors_6_0, 
                    	              		"ActorAlias");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleSignalReception"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:588:1: entryRuleSignalReception returns [EObject current=null] : iv_ruleSignalReception= ruleSignalReception EOF ;
    public final EObject entryRuleSignalReception() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalReception = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:589:2: (iv_ruleSignalReception= ruleSignalReception EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:590:2: iv_ruleSignalReception= ruleSignalReception EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignalReceptionRule()); 
            }
            pushFollow(FOLLOW_ruleSignalReception_in_entryRuleSignalReception1268);
            iv_ruleSignalReception=ruleSignalReception();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignalReception; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalReception1278); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignalReception"


    // $ANTLR start "ruleSignalReception"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:597:1: ruleSignalReception returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleSignalAlias ) ) )? ) | ( (lv_init_3_0= 'init' ) ) ) ;
    public final EObject ruleSignalReception() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_init_3_0=null;
        EObject lv_source_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:600:28: ( ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleSignalAlias ) ) )? ) | ( (lv_init_3_0= 'init' ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:601:1: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleSignalAlias ) ) )? ) | ( (lv_init_3_0= 'init' ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:601:1: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleSignalAlias ) ) )? ) | ( (lv_init_3_0= 'init' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:601:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleSignalAlias ) ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:601:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleSignalAlias ) ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:601:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleSignalAlias ) ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:601:3: ( (otherlv_0= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:602:1: (otherlv_0= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:602:1: (otherlv_0= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:603:3: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getSignalReceptionRule());
                      	        }
                              
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignalReception1324); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_0, grammarAccess.getSignalReceptionAccess().getInstanceSignalCrossReference_0_0_0()); 
                      	
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:614:2: (otherlv_1= 'from' ( (lv_source_2_0= ruleSignalAlias ) ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==24) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:614:4: otherlv_1= 'from' ( (lv_source_2_0= ruleSignalAlias ) )
                            {
                            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleSignalReception1337); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getSignalReceptionAccess().getFromKeyword_0_1_0());
                                  
                            }
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:618:1: ( (lv_source_2_0= ruleSignalAlias ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:619:1: (lv_source_2_0= ruleSignalAlias )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:619:1: (lv_source_2_0= ruleSignalAlias )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:620:3: lv_source_2_0= ruleSignalAlias
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSignalReceptionAccess().getSourceSignalAliasParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSignalAlias_in_ruleSignalReception1358);
                            lv_source_2_0=ruleSignalAlias();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSignalReceptionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"source",
                                      		lv_source_2_0, 
                                      		"SignalAlias");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:637:6: ( (lv_init_3_0= 'init' ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:637:6: ( (lv_init_3_0= 'init' ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:638:1: (lv_init_3_0= 'init' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:638:1: (lv_init_3_0= 'init' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:639:3: lv_init_3_0= 'init'
                    {
                    lv_init_3_0=(Token)match(input,25,FOLLOW_25_in_ruleSignalReception1385); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_init_3_0, grammarAccess.getSignalReceptionAccess().getInitInitKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSignalReceptionRule());
                      	        }
                             		setWithLastConsumed(current, "init", true, "init");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignalReception"


    // $ANTLR start "entryRuleSignalEmission"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:660:1: entryRuleSignalEmission returns [EObject current=null] : iv_ruleSignalEmission= ruleSignalEmission EOF ;
    public final EObject entryRuleSignalEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalEmission = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:661:2: (iv_ruleSignalEmission= ruleSignalEmission EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:662:2: iv_ruleSignalEmission= ruleSignalEmission EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignalEmissionRule()); 
            }
            pushFollow(FOLLOW_ruleSignalEmission_in_entryRuleSignalEmission1434);
            iv_ruleSignalEmission=ruleSignalEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignalEmission; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalEmission1444); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignalEmission"


    // $ANTLR start "ruleSignalEmission"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:669:1: ruleSignalEmission returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_destination_2_0= ruleSignalAlias ) ) )? ) ;
    public final EObject ruleSignalEmission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_destination_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:672:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_destination_2_0= ruleSignalAlias ) ) )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:673:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_destination_2_0= ruleSignalAlias ) ) )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:673:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_destination_2_0= ruleSignalAlias ) ) )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:673:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_destination_2_0= ruleSignalAlias ) ) )?
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:673:2: ( (otherlv_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:674:1: (otherlv_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:674:1: (otherlv_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:675:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSignalEmissionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignalEmission1489); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getSignalEmissionAccess().getInstanceSignalCrossReference_0_0()); 
              	
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:686:2: (otherlv_1= 'to' ( (lv_destination_2_0= ruleSignalAlias ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:686:4: otherlv_1= 'to' ( (lv_destination_2_0= ruleSignalAlias ) )
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleSignalEmission1502); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getSignalEmissionAccess().getToKeyword_1_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:690:1: ( (lv_destination_2_0= ruleSignalAlias ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:691:1: (lv_destination_2_0= ruleSignalAlias )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:691:1: (lv_destination_2_0= ruleSignalAlias )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:692:3: lv_destination_2_0= ruleSignalAlias
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSignalEmissionAccess().getDestinationSignalAliasParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignalAlias_in_ruleSignalEmission1523);
                    lv_destination_2_0=ruleSignalAlias();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSignalEmissionRule());
                      	        }
                             		set(
                             			current, 
                             			"destination",
                              		lv_destination_2_0, 
                              		"SignalAlias");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignalEmission"


    // $ANTLR start "entryRuleSignal"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:716:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:717:2: (iv_ruleSignal= ruleSignal EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:718:2: iv_ruleSignal= ruleSignal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignalRule()); 
            }
            pushFollow(FOLLOW_ruleSignal_in_entryRuleSignal1561);
            iv_ruleSignal=ruleSignal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignal1571); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignal"


    // $ANTLR start "ruleSignal"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:725:1: ruleSignal returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) ( (lv_mode_3_0= ruleSignalMode ) ) (otherlv_4= 'from' ( (lv_source_5_0= ruleSignalAlias ) ) )? (otherlv_6= 'to' ( (lv_destinations_7_0= ruleSignalAlias ) ) )* ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_mode_3_0 = null;

        EObject lv_source_5_0 = null;

        EObject lv_destinations_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:728:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) ( (lv_mode_3_0= ruleSignalMode ) ) (otherlv_4= 'from' ( (lv_source_5_0= ruleSignalAlias ) ) )? (otherlv_6= 'to' ( (lv_destinations_7_0= ruleSignalAlias ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:729:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) ( (lv_mode_3_0= ruleSignalMode ) ) (otherlv_4= 'from' ( (lv_source_5_0= ruleSignalAlias ) ) )? (otherlv_6= 'to' ( (lv_destinations_7_0= ruleSignalAlias ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:729:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) ( (lv_mode_3_0= ruleSignalMode ) ) (otherlv_4= 'from' ( (lv_source_5_0= ruleSignalAlias ) ) )? (otherlv_6= 'to' ( (lv_destinations_7_0= ruleSignalAlias ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:729:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) ( (lv_mode_3_0= ruleSignalMode ) ) (otherlv_4= 'from' ( (lv_source_5_0= ruleSignalAlias ) ) )? (otherlv_6= 'to' ( (lv_destinations_7_0= ruleSignalAlias ) ) )*
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:729:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:730:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:730:1: (lv_name_0_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:731:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal1613); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSignalRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleSignal1630); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSignalAccess().getColonKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:751:1: ( (lv_type_2_0= ruleDataType ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:752:1: (lv_type_2_0= ruleDataType )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:752:1: (lv_type_2_0= ruleDataType )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:753:3: lv_type_2_0= ruleDataType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSignalAccess().getTypeDataTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDataType_in_ruleSignal1651);
            lv_type_2_0=ruleDataType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSignalRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"DataType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:769:2: ( (lv_mode_3_0= ruleSignalMode ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:770:1: (lv_mode_3_0= ruleSignalMode )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:770:1: (lv_mode_3_0= ruleSignalMode )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:771:3: lv_mode_3_0= ruleSignalMode
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSignalAccess().getModeSignalModeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSignalMode_in_ruleSignal1672);
            lv_mode_3_0=ruleSignalMode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSignalRule());
              	        }
                     		set(
                     			current, 
                     			"mode",
                      		lv_mode_3_0, 
                      		"SignalMode");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:787:2: (otherlv_4= 'from' ( (lv_source_5_0= ruleSignalAlias ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:787:4: otherlv_4= 'from' ( (lv_source_5_0= ruleSignalAlias ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleSignal1685); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSignalAccess().getFromKeyword_4_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:791:1: ( (lv_source_5_0= ruleSignalAlias ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:792:1: (lv_source_5_0= ruleSignalAlias )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:792:1: (lv_source_5_0= ruleSignalAlias )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:793:3: lv_source_5_0= ruleSignalAlias
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSignalAccess().getSourceSignalAliasParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignalAlias_in_ruleSignal1706);
                    lv_source_5_0=ruleSignalAlias();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSignalRule());
                      	        }
                             		set(
                             			current, 
                             			"source",
                              		lv_source_5_0, 
                              		"SignalAlias");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:809:4: (otherlv_6= 'to' ( (lv_destinations_7_0= ruleSignalAlias ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:809:6: otherlv_6= 'to' ( (lv_destinations_7_0= ruleSignalAlias ) )
            	    {
            	    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleSignal1721); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getSignalAccess().getToKeyword_5_0());
            	          
            	    }
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:813:1: ( (lv_destinations_7_0= ruleSignalAlias ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:814:1: (lv_destinations_7_0= ruleSignalAlias )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:814:1: (lv_destinations_7_0= ruleSignalAlias )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:815:3: lv_destinations_7_0= ruleSignalAlias
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSignalAccess().getDestinationsSignalAliasParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSignalAlias_in_ruleSignal1742);
            	    lv_destinations_7_0=ruleSignalAlias();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSignalRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"destinations",
            	              		lv_destinations_7_0, 
            	              		"SignalAlias");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignal"


    // $ANTLR start "entryRuleDefinitionSet"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:839:1: entryRuleDefinitionSet returns [EObject current=null] : iv_ruleDefinitionSet= ruleDefinitionSet EOF ;
    public final EObject entryRuleDefinitionSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionSet = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:840:2: (iv_ruleDefinitionSet= ruleDefinitionSet EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:841:2: iv_ruleDefinitionSet= ruleDefinitionSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionSetRule()); 
            }
            pushFollow(FOLLOW_ruleDefinitionSet_in_entryRuleDefinitionSet1780);
            iv_ruleDefinitionSet=ruleDefinitionSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinitionSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinitionSet1790); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinitionSet"


    // $ANTLR start "ruleDefinitionSet"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:848:1: ruleDefinitionSet returns [EObject current=null] : ( ( () otherlv_1= '{' ( (lv_elements_2_0= ruleEnumElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleEnumElement ) ) )* otherlv_5= '}' ) | ( () otherlv_7= '{' ( (lv_elements_8_0= ruleNumberLiteral ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleNumberLiteral ) ) )* otherlv_11= '}' ) | ( () otherlv_13= '[' ( (lv_inf_14_0= ruleNumberLiteral ) ) otherlv_15= ',' ( (lv_sup_16_0= ruleNumberLiteral ) ) otherlv_17= ']' ) ) ;
    public final EObject ruleDefinitionSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;

        EObject lv_elements_8_0 = null;

        EObject lv_elements_10_0 = null;

        EObject lv_inf_14_0 = null;

        EObject lv_sup_16_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:851:28: ( ( ( () otherlv_1= '{' ( (lv_elements_2_0= ruleEnumElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleEnumElement ) ) )* otherlv_5= '}' ) | ( () otherlv_7= '{' ( (lv_elements_8_0= ruleNumberLiteral ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleNumberLiteral ) ) )* otherlv_11= '}' ) | ( () otherlv_13= '[' ( (lv_inf_14_0= ruleNumberLiteral ) ) otherlv_15= ',' ( (lv_sup_16_0= ruleNumberLiteral ) ) otherlv_17= ']' ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:852:1: ( ( () otherlv_1= '{' ( (lv_elements_2_0= ruleEnumElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleEnumElement ) ) )* otherlv_5= '}' ) | ( () otherlv_7= '{' ( (lv_elements_8_0= ruleNumberLiteral ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleNumberLiteral ) ) )* otherlv_11= '}' ) | ( () otherlv_13= '[' ( (lv_inf_14_0= ruleNumberLiteral ) ) otherlv_15= ',' ( (lv_sup_16_0= ruleNumberLiteral ) ) otherlv_17= ']' ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:852:1: ( ( () otherlv_1= '{' ( (lv_elements_2_0= ruleEnumElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleEnumElement ) ) )* otherlv_5= '}' ) | ( () otherlv_7= '{' ( (lv_elements_8_0= ruleNumberLiteral ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleNumberLiteral ) ) )* otherlv_11= '}' ) | ( () otherlv_13= '[' ( (lv_inf_14_0= ruleNumberLiteral ) ) otherlv_15= ',' ( (lv_sup_16_0= ruleNumberLiteral ) ) otherlv_17= ']' ) )
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==68) ) {
                    alt15=1;
                }
                else if ( (LA15_1==RULE_INT) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA15_0==29) ) {
                alt15=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:852:2: ( () otherlv_1= '{' ( (lv_elements_2_0= ruleEnumElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleEnumElement ) ) )* otherlv_5= '}' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:852:2: ( () otherlv_1= '{' ( (lv_elements_2_0= ruleEnumElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleEnumElement ) ) )* otherlv_5= '}' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:852:3: () otherlv_1= '{' ( (lv_elements_2_0= ruleEnumElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleEnumElement ) ) )* otherlv_5= '}'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:852:3: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:853:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDefinitionSetAccess().getEnumDefinitionSetAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleDefinitionSet1837); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDefinitionSetAccess().getLeftCurlyBracketKeyword_0_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:862:1: ( (lv_elements_2_0= ruleEnumElement ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:863:1: (lv_elements_2_0= ruleEnumElement )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:863:1: (lv_elements_2_0= ruleEnumElement )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:864:3: lv_elements_2_0= ruleEnumElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefinitionSetAccess().getElementsEnumElementParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEnumElement_in_ruleDefinitionSet1858);
                    lv_elements_2_0=ruleEnumElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDefinitionSetRule());
                      	        }
                             		add(
                             			current, 
                             			"elements",
                              		lv_elements_2_0, 
                              		"EnumElement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:880:2: (otherlv_3= ',' ( (lv_elements_4_0= ruleEnumElement ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==23) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:880:4: otherlv_3= ',' ( (lv_elements_4_0= ruleEnumElement ) )
                    	    {
                    	    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleDefinitionSet1871); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getDefinitionSetAccess().getCommaKeyword_0_3_0());
                    	          
                    	    }
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:884:1: ( (lv_elements_4_0= ruleEnumElement ) )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:885:1: (lv_elements_4_0= ruleEnumElement )
                    	    {
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:885:1: (lv_elements_4_0= ruleEnumElement )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:886:3: lv_elements_4_0= ruleEnumElement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDefinitionSetAccess().getElementsEnumElementParserRuleCall_0_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEnumElement_in_ruleDefinitionSet1892);
                    	    lv_elements_4_0=ruleEnumElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDefinitionSetRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elements",
                    	              		lv_elements_4_0, 
                    	              		"EnumElement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleDefinitionSet1906); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getDefinitionSetAccess().getRightCurlyBracketKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:907:6: ( () otherlv_7= '{' ( (lv_elements_8_0= ruleNumberLiteral ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleNumberLiteral ) ) )* otherlv_11= '}' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:907:6: ( () otherlv_7= '{' ( (lv_elements_8_0= ruleNumberLiteral ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleNumberLiteral ) ) )* otherlv_11= '}' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:907:7: () otherlv_7= '{' ( (lv_elements_8_0= ruleNumberLiteral ) ) (otherlv_9= ',' ( (lv_elements_10_0= ruleNumberLiteral ) ) )* otherlv_11= '}'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:907:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:908:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDefinitionSetAccess().getNumberDefinitionSetAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleDefinitionSet1935); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getDefinitionSetAccess().getLeftCurlyBracketKeyword_1_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:917:1: ( (lv_elements_8_0= ruleNumberLiteral ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:918:1: (lv_elements_8_0= ruleNumberLiteral )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:918:1: (lv_elements_8_0= ruleNumberLiteral )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:919:3: lv_elements_8_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefinitionSetAccess().getElementsNumberLiteralParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleDefinitionSet1956);
                    lv_elements_8_0=ruleNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDefinitionSetRule());
                      	        }
                             		add(
                             			current, 
                             			"elements",
                              		lv_elements_8_0, 
                              		"NumberLiteral");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:935:2: (otherlv_9= ',' ( (lv_elements_10_0= ruleNumberLiteral ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==23) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:935:4: otherlv_9= ',' ( (lv_elements_10_0= ruleNumberLiteral ) )
                    	    {
                    	    otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleDefinitionSet1969); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_9, grammarAccess.getDefinitionSetAccess().getCommaKeyword_1_3_0());
                    	          
                    	    }
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:939:1: ( (lv_elements_10_0= ruleNumberLiteral ) )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:940:1: (lv_elements_10_0= ruleNumberLiteral )
                    	    {
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:940:1: (lv_elements_10_0= ruleNumberLiteral )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:941:3: lv_elements_10_0= ruleNumberLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDefinitionSetAccess().getElementsNumberLiteralParserRuleCall_1_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleDefinitionSet1990);
                    	    lv_elements_10_0=ruleNumberLiteral();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDefinitionSetRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elements",
                    	              		lv_elements_10_0, 
                    	              		"NumberLiteral");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,28,FOLLOW_28_in_ruleDefinitionSet2004); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getDefinitionSetAccess().getRightCurlyBracketKeyword_1_4());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:962:6: ( () otherlv_13= '[' ( (lv_inf_14_0= ruleNumberLiteral ) ) otherlv_15= ',' ( (lv_sup_16_0= ruleNumberLiteral ) ) otherlv_17= ']' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:962:6: ( () otherlv_13= '[' ( (lv_inf_14_0= ruleNumberLiteral ) ) otherlv_15= ',' ( (lv_sup_16_0= ruleNumberLiteral ) ) otherlv_17= ']' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:962:7: () otherlv_13= '[' ( (lv_inf_14_0= ruleNumberLiteral ) ) otherlv_15= ',' ( (lv_sup_16_0= ruleNumberLiteral ) ) otherlv_17= ']'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:962:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:963:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDefinitionSetAccess().getNumberDefinitionIntervalAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_13=(Token)match(input,29,FOLLOW_29_in_ruleDefinitionSet2033); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getDefinitionSetAccess().getLeftSquareBracketKeyword_2_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:972:1: ( (lv_inf_14_0= ruleNumberLiteral ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:973:1: (lv_inf_14_0= ruleNumberLiteral )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:973:1: (lv_inf_14_0= ruleNumberLiteral )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:974:3: lv_inf_14_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefinitionSetAccess().getInfNumberLiteralParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleDefinitionSet2054);
                    lv_inf_14_0=ruleNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDefinitionSetRule());
                      	        }
                             		set(
                             			current, 
                             			"inf",
                              		lv_inf_14_0, 
                              		"NumberLiteral");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_15=(Token)match(input,23,FOLLOW_23_in_ruleDefinitionSet2066); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getDefinitionSetAccess().getCommaKeyword_2_3());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:994:1: ( (lv_sup_16_0= ruleNumberLiteral ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:995:1: (lv_sup_16_0= ruleNumberLiteral )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:995:1: (lv_sup_16_0= ruleNumberLiteral )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:996:3: lv_sup_16_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefinitionSetAccess().getSupNumberLiteralParserRuleCall_2_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleDefinitionSet2087);
                    lv_sup_16_0=ruleNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDefinitionSetRule());
                      	        }
                             		set(
                             			current, 
                             			"sup",
                              		lv_sup_16_0, 
                              		"NumberLiteral");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,30,FOLLOW_30_in_ruleDefinitionSet2099); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getDefinitionSetAccess().getRightSquareBracketKeyword_2_5());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinitionSet"


    // $ANTLR start "entryRuleSignalAlias"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1024:1: entryRuleSignalAlias returns [EObject current=null] : iv_ruleSignalAlias= ruleSignalAlias EOF ;
    public final EObject entryRuleSignalAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalAlias = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1025:2: (iv_ruleSignalAlias= ruleSignalAlias EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1026:2: iv_ruleSignalAlias= ruleSignalAlias EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignalAliasRule()); 
            }
            pushFollow(FOLLOW_ruleSignalAlias_in_entryRuleSignalAlias2136);
            iv_ruleSignalAlias=ruleSignalAlias();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignalAlias; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalAlias2146); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignalAlias"


    // $ANTLR start "ruleSignalAlias"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1033:1: ruleSignalAlias returns [EObject current=null] : ( ( (lv_source_0_0= ruleAccessibleEntity ) ) (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final EObject ruleSignalAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_source_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1036:28: ( ( ( (lv_source_0_0= ruleAccessibleEntity ) ) (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1037:1: ( ( (lv_source_0_0= ruleAccessibleEntity ) ) (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1037:1: ( ( (lv_source_0_0= ruleAccessibleEntity ) ) (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1037:2: ( (lv_source_0_0= ruleAccessibleEntity ) ) (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )?
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1037:2: ( (lv_source_0_0= ruleAccessibleEntity ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1038:1: (lv_source_0_0= ruleAccessibleEntity )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1038:1: (lv_source_0_0= ruleAccessibleEntity )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1039:3: lv_source_0_0= ruleAccessibleEntity
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSignalAliasAccess().getSourceAccessibleEntityParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAccessibleEntity_in_ruleSignalAlias2192);
            lv_source_0_0=ruleAccessibleEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSignalAliasRule());
              	        }
                     		set(
                     			current, 
                     			"source",
                      		lv_source_0_0, 
                      		"AccessibleEntity");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1055:2: (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1055:4: otherlv_1= 'as' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSignalAlias2205); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getSignalAliasAccess().getAsKeyword_1_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1059:1: ( (otherlv_2= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1060:1: (otherlv_2= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1060:1: (otherlv_2= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1061:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getSignalAliasRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignalAlias2225); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getSignalAliasAccess().getAliasSignalCrossReference_1_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignalAlias"


    // $ANTLR start "entryRuleSignalMode"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1080:1: entryRuleSignalMode returns [String current=null] : iv_ruleSignalMode= ruleSignalMode EOF ;
    public final String entryRuleSignalMode() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignalMode = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1081:2: (iv_ruleSignalMode= ruleSignalMode EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1082:2: iv_ruleSignalMode= ruleSignalMode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignalModeRule()); 
            }
            pushFollow(FOLLOW_ruleSignalMode_in_entryRuleSignalMode2264);
            iv_ruleSignalMode=ruleSignalMode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignalMode.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalMode2275); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignalMode"


    // $ANTLR start "ruleSignalMode"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1089:1: ruleSignalMode returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'event' | kw= 'flow' | kw= 'constant' ) ;
    public final AntlrDatatypeRuleToken ruleSignalMode() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1092:28: ( (kw= 'event' | kw= 'flow' | kw= 'constant' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1093:1: (kw= 'event' | kw= 'flow' | kw= 'constant' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1093:1: (kw= 'event' | kw= 'flow' | kw= 'constant' )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt17=1;
                }
                break;
            case 32:
                {
                alt17=2;
                }
                break;
            case 33:
                {
                alt17=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1094:2: kw= 'event'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleSignalMode2313); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignalModeAccess().getEventKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1101:2: kw= 'flow'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleSignalMode2332); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignalModeAccess().getFlowKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1108:2: kw= 'constant'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleSignalMode2351); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignalModeAccess().getConstantKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignalMode"


    // $ANTLR start "entryRuleDataType"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1121:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1122:2: (iv_ruleDataType= ruleDataType EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1123:2: iv_ruleDataType= ruleDataType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeRule()); 
            }
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType2391);
            iv_ruleDataType=ruleDataType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType2401); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1130:1: ruleDataType returns [EObject current=null] : ( ( () ( (lv_type_1_0= ruleTypeBase ) ) (otherlv_2= 'in' ( (lv_definitionSet_3_0= ruleDefinitionSet ) ) )? ) | ( () ( ( (lv_mode_5_1= 'set' | lv_mode_5_2= 'list' | lv_mode_5_3= 'map' ) ) ) otherlv_6= 'of' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'in' ( (lv_definitionSet_9_0= ruleDefinitionSet ) ) )? ) | ( () ( (otherlv_11= RULE_ID ) ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_mode_5_1=null;
        Token lv_mode_5_2=null;
        Token lv_mode_5_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        EObject lv_definitionSet_3_0 = null;

        EObject lv_definitionSet_9_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1133:28: ( ( ( () ( (lv_type_1_0= ruleTypeBase ) ) (otherlv_2= 'in' ( (lv_definitionSet_3_0= ruleDefinitionSet ) ) )? ) | ( () ( ( (lv_mode_5_1= 'set' | lv_mode_5_2= 'list' | lv_mode_5_3= 'map' ) ) ) otherlv_6= 'of' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'in' ( (lv_definitionSet_9_0= ruleDefinitionSet ) ) )? ) | ( () ( (otherlv_11= RULE_ID ) ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1134:1: ( ( () ( (lv_type_1_0= ruleTypeBase ) ) (otherlv_2= 'in' ( (lv_definitionSet_3_0= ruleDefinitionSet ) ) )? ) | ( () ( ( (lv_mode_5_1= 'set' | lv_mode_5_2= 'list' | lv_mode_5_3= 'map' ) ) ) otherlv_6= 'of' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'in' ( (lv_definitionSet_9_0= ruleDefinitionSet ) ) )? ) | ( () ( (otherlv_11= RULE_ID ) ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1134:1: ( ( () ( (lv_type_1_0= ruleTypeBase ) ) (otherlv_2= 'in' ( (lv_definitionSet_3_0= ruleDefinitionSet ) ) )? ) | ( () ( ( (lv_mode_5_1= 'set' | lv_mode_5_2= 'list' | lv_mode_5_3= 'map' ) ) ) otherlv_6= 'of' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'in' ( (lv_definitionSet_9_0= ruleDefinitionSet ) ) )? ) | ( () ( (otherlv_11= RULE_ID ) ) ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
                {
                alt21=1;
                }
                break;
            case 35:
            case 36:
            case 37:
                {
                alt21=2;
                }
                break;
            case RULE_ID:
                {
                alt21=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1134:2: ( () ( (lv_type_1_0= ruleTypeBase ) ) (otherlv_2= 'in' ( (lv_definitionSet_3_0= ruleDefinitionSet ) ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1134:2: ( () ( (lv_type_1_0= ruleTypeBase ) ) (otherlv_2= 'in' ( (lv_definitionSet_3_0= ruleDefinitionSet ) ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1134:3: () ( (lv_type_1_0= ruleTypeBase ) ) (otherlv_2= 'in' ( (lv_definitionSet_3_0= ruleDefinitionSet ) ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1134:3: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1135:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataTypeAccess().getDataTypeBaseAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1140:2: ( (lv_type_1_0= ruleTypeBase ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1141:1: (lv_type_1_0= ruleTypeBase )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1141:1: (lv_type_1_0= ruleTypeBase )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1142:3: lv_type_1_0= ruleTypeBase
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataTypeAccess().getTypeTypeBaseParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypeBase_in_ruleDataType2457);
                    lv_type_1_0=ruleTypeBase();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_1_0, 
                              		"TypeBase");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1158:2: (otherlv_2= 'in' ( (lv_definitionSet_3_0= ruleDefinitionSet ) ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==34) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1158:4: otherlv_2= 'in' ( (lv_definitionSet_3_0= ruleDefinitionSet ) )
                            {
                            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleDataType2470); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getDataTypeAccess().getInKeyword_0_2_0());
                                  
                            }
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1162:1: ( (lv_definitionSet_3_0= ruleDefinitionSet ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1163:1: (lv_definitionSet_3_0= ruleDefinitionSet )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1163:1: (lv_definitionSet_3_0= ruleDefinitionSet )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1164:3: lv_definitionSet_3_0= ruleDefinitionSet
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDataTypeAccess().getDefinitionSetDefinitionSetParserRuleCall_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDefinitionSet_in_ruleDataType2491);
                            lv_definitionSet_3_0=ruleDefinitionSet();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"definitionSet",
                                      		lv_definitionSet_3_0, 
                                      		"DefinitionSet");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1181:6: ( () ( ( (lv_mode_5_1= 'set' | lv_mode_5_2= 'list' | lv_mode_5_3= 'map' ) ) ) otherlv_6= 'of' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'in' ( (lv_definitionSet_9_0= ruleDefinitionSet ) ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1181:6: ( () ( ( (lv_mode_5_1= 'set' | lv_mode_5_2= 'list' | lv_mode_5_3= 'map' ) ) ) otherlv_6= 'of' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'in' ( (lv_definitionSet_9_0= ruleDefinitionSet ) ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1181:7: () ( ( (lv_mode_5_1= 'set' | lv_mode_5_2= 'list' | lv_mode_5_3= 'map' ) ) ) otherlv_6= 'of' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'in' ( (lv_definitionSet_9_0= ruleDefinitionSet ) ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1181:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1182:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataTypeAccess().getDataTypeCollectionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1187:2: ( ( (lv_mode_5_1= 'set' | lv_mode_5_2= 'list' | lv_mode_5_3= 'map' ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1188:1: ( (lv_mode_5_1= 'set' | lv_mode_5_2= 'list' | lv_mode_5_3= 'map' ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1188:1: ( (lv_mode_5_1= 'set' | lv_mode_5_2= 'list' | lv_mode_5_3= 'map' ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1189:1: (lv_mode_5_1= 'set' | lv_mode_5_2= 'list' | lv_mode_5_3= 'map' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1189:1: (lv_mode_5_1= 'set' | lv_mode_5_2= 'list' | lv_mode_5_3= 'map' )
                    int alt19=3;
                    switch ( input.LA(1) ) {
                    case 35:
                        {
                        alt19=1;
                        }
                        break;
                    case 36:
                        {
                        alt19=2;
                        }
                        break;
                    case 37:
                        {
                        alt19=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }

                    switch (alt19) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1190:3: lv_mode_5_1= 'set'
                            {
                            lv_mode_5_1=(Token)match(input,35,FOLLOW_35_in_ruleDataType2530); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_mode_5_1, grammarAccess.getDataTypeAccess().getModeSetKeyword_1_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getDataTypeRule());
                              	        }
                                     		setWithLastConsumed(current, "mode", lv_mode_5_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1202:8: lv_mode_5_2= 'list'
                            {
                            lv_mode_5_2=(Token)match(input,36,FOLLOW_36_in_ruleDataType2559); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_mode_5_2, grammarAccess.getDataTypeAccess().getModeListKeyword_1_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getDataTypeRule());
                              	        }
                                     		setWithLastConsumed(current, "mode", lv_mode_5_2, null);
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1214:8: lv_mode_5_3= 'map'
                            {
                            lv_mode_5_3=(Token)match(input,37,FOLLOW_37_in_ruleDataType2588); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_mode_5_3, grammarAccess.getDataTypeAccess().getModeMapKeyword_1_1_0_2());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getDataTypeRule());
                              	        }
                                     		setWithLastConsumed(current, "mode", lv_mode_5_3, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleDataType2616); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getDataTypeAccess().getOfKeyword_1_2());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1233:1: ( (otherlv_7= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1234:1: (otherlv_7= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1234:1: (otherlv_7= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1235:3: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getDataTypeRule());
                      	        }
                              
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataType2636); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_7, grammarAccess.getDataTypeAccess().getTypeDataTypeCrossReference_1_3_0()); 
                      	
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1246:2: (otherlv_8= 'in' ( (lv_definitionSet_9_0= ruleDefinitionSet ) ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==34) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1246:4: otherlv_8= 'in' ( (lv_definitionSet_9_0= ruleDefinitionSet ) )
                            {
                            otherlv_8=(Token)match(input,34,FOLLOW_34_in_ruleDataType2649); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getDataTypeAccess().getInKeyword_1_4_0());
                                  
                            }
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1250:1: ( (lv_definitionSet_9_0= ruleDefinitionSet ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1251:1: (lv_definitionSet_9_0= ruleDefinitionSet )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1251:1: (lv_definitionSet_9_0= ruleDefinitionSet )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1252:3: lv_definitionSet_9_0= ruleDefinitionSet
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDataTypeAccess().getDefinitionSetDefinitionSetParserRuleCall_1_4_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDefinitionSet_in_ruleDataType2670);
                            lv_definitionSet_9_0=ruleDefinitionSet();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"definitionSet",
                                      		lv_definitionSet_9_0, 
                                      		"DefinitionSet");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1269:6: ( () ( (otherlv_11= RULE_ID ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1269:6: ( () ( (otherlv_11= RULE_ID ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1269:7: () ( (otherlv_11= RULE_ID ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1269:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1270:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataTypeAccess().getDataTypeCompoundAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1275:2: ( (otherlv_11= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1276:1: (otherlv_11= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1276:1: (otherlv_11= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1277:3: otherlv_11= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getDataTypeRule());
                      	        }
                              
                    }
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataType2709); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_11, grammarAccess.getDataTypeAccess().getCompoundDataTypeStructureCrossReference_2_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleTypeBase"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1296:1: entryRuleTypeBase returns [String current=null] : iv_ruleTypeBase= ruleTypeBase EOF ;
    public final String entryRuleTypeBase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeBase = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1297:2: (iv_ruleTypeBase= ruleTypeBase EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1298:2: iv_ruleTypeBase= ruleTypeBase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeBaseRule()); 
            }
            pushFollow(FOLLOW_ruleTypeBase_in_entryRuleTypeBase2747);
            iv_ruleTypeBase=ruleTypeBase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeBase.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeBase2758); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeBase"


    // $ANTLR start "ruleTypeBase"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1305:1: ruleTypeBase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'void' | kw= 'symbol' | kw= 'number' | kw= 'text' | kw= 'time' | kw= 'identifier' ) ;
    public final AntlrDatatypeRuleToken ruleTypeBase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1308:28: ( (kw= 'void' | kw= 'symbol' | kw= 'number' | kw= 'text' | kw= 'time' | kw= 'identifier' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1309:1: (kw= 'void' | kw= 'symbol' | kw= 'number' | kw= 'text' | kw= 'time' | kw= 'identifier' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1309:1: (kw= 'void' | kw= 'symbol' | kw= 'number' | kw= 'text' | kw= 'time' | kw= 'identifier' )
            int alt22=6;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt22=1;
                }
                break;
            case 40:
                {
                alt22=2;
                }
                break;
            case 41:
                {
                alt22=3;
                }
                break;
            case 42:
                {
                alt22=4;
                }
                break;
            case 43:
                {
                alt22=5;
                }
                break;
            case 44:
                {
                alt22=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1310:2: kw= 'void'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleTypeBase2796); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTypeBaseAccess().getVoidKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1317:2: kw= 'symbol'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleTypeBase2815); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTypeBaseAccess().getSymbolKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1324:2: kw= 'number'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleTypeBase2834); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTypeBaseAccess().getNumberKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1331:2: kw= 'text'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleTypeBase2853); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTypeBaseAccess().getTextKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1338:2: kw= 'time'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleTypeBase2872); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTypeBaseAccess().getTimeKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1345:2: kw= 'identifier'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleTypeBase2891); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTypeBaseAccess().getIdentifierKeyword_5()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeBase"


    // $ANTLR start "entryRuleDataTypeDefinition"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1358:1: entryRuleDataTypeDefinition returns [EObject current=null] : iv_ruleDataTypeDefinition= ruleDataTypeDefinition EOF ;
    public final EObject entryRuleDataTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeDefinition = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1359:2: (iv_ruleDataTypeDefinition= ruleDataTypeDefinition EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1360:2: iv_ruleDataTypeDefinition= ruleDataTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeDefinition_in_entryRuleDataTypeDefinition2931);
            iv_ruleDataTypeDefinition=ruleDataTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeDefinition2941); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataTypeDefinition"


    // $ANTLR start "ruleDataTypeDefinition"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1367:1: ruleDataTypeDefinition returns [EObject current=null] : this_DataTypeStructure_0= ruleDataTypeStructure ;
    public final EObject ruleDataTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_DataTypeStructure_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1370:28: (this_DataTypeStructure_0= ruleDataTypeStructure )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1372:5: this_DataTypeStructure_0= ruleDataTypeStructure
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDataTypeDefinitionAccess().getDataTypeStructureParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleDataTypeStructure_in_ruleDataTypeDefinition2987);
            this_DataTypeStructure_0=ruleDataTypeStructure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DataTypeStructure_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataTypeDefinition"


    // $ANTLR start "entryRuleDataTypeStructure"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1388:1: entryRuleDataTypeStructure returns [EObject current=null] : iv_ruleDataTypeStructure= ruleDataTypeStructure EOF ;
    public final EObject entryRuleDataTypeStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeStructure = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1389:2: (iv_ruleDataTypeStructure= ruleDataTypeStructure EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1390:2: iv_ruleDataTypeStructure= ruleDataTypeStructure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeStructureRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeStructure_in_entryRuleDataTypeStructure3021);
            iv_ruleDataTypeStructure=ruleDataTypeStructure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeStructure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeStructure3031); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataTypeStructure"


    // $ANTLR start "ruleDataTypeStructure"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1397:1: ruleDataTypeStructure returns [EObject current=null] : (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_fields_3_0= ruleDataTypeStructureField ) )* ) ;
    public final EObject ruleDataTypeStructure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_fields_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1400:28: ( (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_fields_3_0= ruleDataTypeStructureField ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1401:1: (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_fields_3_0= ruleDataTypeStructureField ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1401:1: (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_fields_3_0= ruleDataTypeStructureField ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1401:3: otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_fields_3_0= ruleDataTypeStructureField ) )*
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleDataTypeStructure3068); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDataTypeStructureAccess().getStructureKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1405:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1406:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1406:1: (lv_name_1_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1407:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataTypeStructure3085); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getDataTypeStructureAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDataTypeStructureRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDataTypeStructure3102); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDataTypeStructureAccess().getColonKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1427:1: ( (lv_fields_3_0= ruleDataTypeStructureField ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1428:1: (lv_fields_3_0= ruleDataTypeStructureField )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1428:1: (lv_fields_3_0= ruleDataTypeStructureField )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1429:3: lv_fields_3_0= ruleDataTypeStructureField
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDataTypeStructureAccess().getFieldsDataTypeStructureFieldParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDataTypeStructureField_in_ruleDataTypeStructure3123);
            	    lv_fields_3_0=ruleDataTypeStructureField();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDataTypeStructureRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"fields",
            	              		lv_fields_3_0, 
            	              		"DataTypeStructureField");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataTypeStructure"


    // $ANTLR start "entryRuleDataTypeStructureField"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1453:1: entryRuleDataTypeStructureField returns [EObject current=null] : iv_ruleDataTypeStructureField= ruleDataTypeStructureField EOF ;
    public final EObject entryRuleDataTypeStructureField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeStructureField = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1454:2: (iv_ruleDataTypeStructureField= ruleDataTypeStructureField EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1455:2: iv_ruleDataTypeStructureField= ruleDataTypeStructureField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeStructureFieldRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeStructureField_in_entryRuleDataTypeStructureField3160);
            iv_ruleDataTypeStructureField=ruleDataTypeStructureField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeStructureField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeStructureField3170); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataTypeStructureField"


    // $ANTLR start "ruleDataTypeStructureField"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1462:1: ruleDataTypeStructureField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) ) ;
    public final EObject ruleDataTypeStructureField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1465:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1466:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1466:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1466:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1466:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1467:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1467:1: (lv_name_0_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1468:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataTypeStructureField3212); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getDataTypeStructureFieldAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDataTypeStructureFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleDataTypeStructureField3229); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDataTypeStructureFieldAccess().getColonKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1488:1: ( (lv_type_2_0= ruleDataType ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1489:1: (lv_type_2_0= ruleDataType )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1489:1: (lv_type_2_0= ruleDataType )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1490:3: lv_type_2_0= ruleDataType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDataTypeStructureFieldAccess().getTypeDataTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDataType_in_ruleDataTypeStructureField3250);
            lv_type_2_0=ruleDataType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDataTypeStructureFieldRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"DataType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataTypeStructureField"


    // $ANTLR start "entryRuleBehavior"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1514:1: entryRuleBehavior returns [EObject current=null] : iv_ruleBehavior= ruleBehavior EOF ;
    public final EObject entryRuleBehavior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehavior = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1515:2: (iv_ruleBehavior= ruleBehavior EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1516:2: iv_ruleBehavior= ruleBehavior EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBehaviorRule()); 
            }
            pushFollow(FOLLOW_ruleBehavior_in_entryRuleBehavior3286);
            iv_ruleBehavior=ruleBehavior();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBehavior; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBehavior3296); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBehavior"


    // $ANTLR start "ruleBehavior"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1523:1: ruleBehavior returns [EObject current=null] : ( ( (lv_cause_0_0= ruleCause ) ) otherlv_1= ':' ( (lv_effects_2_0= ruleEffect ) )+ ) ;
    public final EObject ruleBehavior() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_cause_0_0 = null;

        EObject lv_effects_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1526:28: ( ( ( (lv_cause_0_0= ruleCause ) ) otherlv_1= ':' ( (lv_effects_2_0= ruleEffect ) )+ ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1527:1: ( ( (lv_cause_0_0= ruleCause ) ) otherlv_1= ':' ( (lv_effects_2_0= ruleEffect ) )+ )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1527:1: ( ( (lv_cause_0_0= ruleCause ) ) otherlv_1= ':' ( (lv_effects_2_0= ruleEffect ) )+ )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1527:2: ( (lv_cause_0_0= ruleCause ) ) otherlv_1= ':' ( (lv_effects_2_0= ruleEffect ) )+
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1527:2: ( (lv_cause_0_0= ruleCause ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1528:1: (lv_cause_0_0= ruleCause )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1528:1: (lv_cause_0_0= ruleCause )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1529:3: lv_cause_0_0= ruleCause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBehaviorAccess().getCauseCauseParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCause_in_ruleBehavior3342);
            lv_cause_0_0=ruleCause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBehaviorRule());
              	        }
                     		set(
                     			current, 
                     			"cause",
                      		lv_cause_0_0, 
                      		"Cause");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleBehavior3354); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBehaviorAccess().getColonKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1549:1: ( (lv_effects_2_0= ruleEffect ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==35||LA24_0==49||LA24_0==51) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1550:1: (lv_effects_2_0= ruleEffect )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1550:1: (lv_effects_2_0= ruleEffect )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1551:3: lv_effects_2_0= ruleEffect
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBehaviorAccess().getEffectsEffectParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEffect_in_ruleBehavior3375);
            	    lv_effects_2_0=ruleEffect();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBehaviorRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"effects",
            	              		lv_effects_2_0, 
            	              		"Effect");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehavior"


    // $ANTLR start "entryRuleCause"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1575:1: entryRuleCause returns [EObject current=null] : iv_ruleCause= ruleCause EOF ;
    public final EObject entryRuleCause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCause = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1576:2: (iv_ruleCause= ruleCause EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1577:2: iv_ruleCause= ruleCause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCauseRule()); 
            }
            pushFollow(FOLLOW_ruleCause_in_entryRuleCause3412);
            iv_ruleCause=ruleCause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCause3422); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCause"


    // $ANTLR start "ruleCause"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1584:1: ruleCause returns [EObject current=null] : (this_OnCause_0= ruleOnCause | this_WhenCause_1= ruleWhenCause ) ;
    public final EObject ruleCause() throws RecognitionException {
        EObject current = null;

        EObject this_OnCause_0 = null;

        EObject this_WhenCause_1 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1587:28: ( (this_OnCause_0= ruleOnCause | this_WhenCause_1= ruleWhenCause ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1588:1: (this_OnCause_0= ruleOnCause | this_WhenCause_1= ruleWhenCause )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1588:1: (this_OnCause_0= ruleOnCause | this_WhenCause_1= ruleWhenCause )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==46) ) {
                alt25=1;
            }
            else if ( (LA25_0==48) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1589:5: this_OnCause_0= ruleOnCause
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCauseAccess().getOnCauseParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOnCause_in_ruleCause3469);
                    this_OnCause_0=ruleOnCause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OnCause_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1599:5: this_WhenCause_1= ruleWhenCause
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCauseAccess().getWhenCauseParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWhenCause_in_ruleCause3496);
                    this_WhenCause_1=ruleWhenCause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_WhenCause_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCause"


    // $ANTLR start "entryRuleOnCause"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1615:1: entryRuleOnCause returns [EObject current=null] : iv_ruleOnCause= ruleOnCause EOF ;
    public final EObject entryRuleOnCause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnCause = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1616:2: (iv_ruleOnCause= ruleOnCause EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1617:2: iv_ruleOnCause= ruleOnCause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOnCauseRule()); 
            }
            pushFollow(FOLLOW_ruleOnCause_in_entryRuleOnCause3531);
            iv_ruleOnCause=ruleOnCause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOnCause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOnCause3541); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOnCause"


    // $ANTLR start "ruleOnCause"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1624:1: ruleOnCause returns [EObject current=null] : (otherlv_0= 'on' ( (lv_event_1_0= ruleSignalReception ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleOnCause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_event_1_0 = null;

        EObject lv_guard_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1627:28: ( (otherlv_0= 'on' ( (lv_event_1_0= ruleSignalReception ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1628:1: (otherlv_0= 'on' ( (lv_event_1_0= ruleSignalReception ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1628:1: (otherlv_0= 'on' ( (lv_event_1_0= ruleSignalReception ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1628:3: otherlv_0= 'on' ( (lv_event_1_0= ruleSignalReception ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleOnCause3578); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOnCauseAccess().getOnKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1632:1: ( (lv_event_1_0= ruleSignalReception ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1633:1: (lv_event_1_0= ruleSignalReception )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1633:1: (lv_event_1_0= ruleSignalReception )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1634:3: lv_event_1_0= ruleSignalReception
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOnCauseAccess().getEventSignalReceptionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSignalReception_in_ruleOnCause3599);
            lv_event_1_0=ruleSignalReception();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOnCauseRule());
              	        }
                     		set(
                     			current, 
                     			"event",
                      		lv_event_1_0, 
                      		"SignalReception");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1650:2: (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==47) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1650:4: otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleOnCause3612); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getOnCauseAccess().getIfKeyword_2_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1654:1: ( (lv_guard_3_0= ruleExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1655:1: (lv_guard_3_0= ruleExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1655:1: (lv_guard_3_0= ruleExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1656:3: lv_guard_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOnCauseAccess().getGuardExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleOnCause3633);
                    lv_guard_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOnCauseRule());
                      	        }
                             		set(
                             			current, 
                             			"guard",
                              		lv_guard_3_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOnCause"


    // $ANTLR start "entryRuleWhenCause"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1680:1: entryRuleWhenCause returns [EObject current=null] : iv_ruleWhenCause= ruleWhenCause EOF ;
    public final EObject entryRuleWhenCause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenCause = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1681:2: (iv_ruleWhenCause= ruleWhenCause EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1682:2: iv_ruleWhenCause= ruleWhenCause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhenCauseRule()); 
            }
            pushFollow(FOLLOW_ruleWhenCause_in_entryRuleWhenCause3671);
            iv_ruleWhenCause=ruleWhenCause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhenCause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenCause3681); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenCause"


    // $ANTLR start "ruleWhenCause"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1689:1: ruleWhenCause returns [EObject current=null] : (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleWhenCause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_condition_1_0 = null;

        EObject lv_guard_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1692:28: ( (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1693:1: (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1693:1: (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1693:3: otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )?
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleWhenCause3718); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhenCauseAccess().getWhenKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1697:1: ( (lv_condition_1_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1698:1: (lv_condition_1_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1698:1: (lv_condition_1_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1699:3: lv_condition_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhenCauseAccess().getConditionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleWhenCause3739);
            lv_condition_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhenCauseRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1715:2: (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==47) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1715:4: otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleWhenCause3752); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getWhenCauseAccess().getIfKeyword_2_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1719:1: ( (lv_guard_3_0= ruleExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1720:1: (lv_guard_3_0= ruleExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1720:1: (lv_guard_3_0= ruleExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1721:3: lv_guard_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getWhenCauseAccess().getGuardExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleWhenCause3773);
                    lv_guard_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getWhenCauseRule());
                      	        }
                             		set(
                             			current, 
                             			"guard",
                              		lv_guard_3_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenCause"


    // $ANTLR start "entryRuleEffect"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1745:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1746:2: (iv_ruleEffect= ruleEffect EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1747:2: iv_ruleEffect= ruleEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEffectRule()); 
            }
            pushFollow(FOLLOW_ruleEffect_in_entryRuleEffect3811);
            iv_ruleEffect=ruleEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffect3821); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffect"


    // $ANTLR start "ruleEffect"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1754:1: ruleEffect returns [EObject current=null] : (this_AlwaysEffect_0= ruleAlwaysEffect | this_SetEffect_1= ruleSetEffect | this_TriggerEffect_2= ruleTriggerEffect ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_AlwaysEffect_0 = null;

        EObject this_SetEffect_1 = null;

        EObject this_TriggerEffect_2 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1757:28: ( (this_AlwaysEffect_0= ruleAlwaysEffect | this_SetEffect_1= ruleSetEffect | this_TriggerEffect_2= ruleTriggerEffect ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1758:1: (this_AlwaysEffect_0= ruleAlwaysEffect | this_SetEffect_1= ruleSetEffect | this_TriggerEffect_2= ruleTriggerEffect )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1758:1: (this_AlwaysEffect_0= ruleAlwaysEffect | this_SetEffect_1= ruleSetEffect | this_TriggerEffect_2= ruleTriggerEffect )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt28=1;
                }
                break;
            case 35:
                {
                alt28=2;
                }
                break;
            case 51:
                {
                alt28=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1759:5: this_AlwaysEffect_0= ruleAlwaysEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getAlwaysEffectParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlwaysEffect_in_ruleEffect3868);
                    this_AlwaysEffect_0=ruleAlwaysEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AlwaysEffect_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1769:5: this_SetEffect_1= ruleSetEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getSetEffectParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSetEffect_in_ruleEffect3895);
                    this_SetEffect_1=ruleSetEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SetEffect_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1779:5: this_TriggerEffect_2= ruleTriggerEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getTriggerEffectParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTriggerEffect_in_ruleEffect3922);
                    this_TriggerEffect_2=ruleTriggerEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TriggerEffect_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEffect"


    // $ANTLR start "entryRuleAlwaysEffect"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1795:1: entryRuleAlwaysEffect returns [EObject current=null] : iv_ruleAlwaysEffect= ruleAlwaysEffect EOF ;
    public final EObject entryRuleAlwaysEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysEffect = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1796:2: (iv_ruleAlwaysEffect= ruleAlwaysEffect EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1797:2: iv_ruleAlwaysEffect= ruleAlwaysEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlwaysEffectRule()); 
            }
            pushFollow(FOLLOW_ruleAlwaysEffect_in_entryRuleAlwaysEffect3957);
            iv_ruleAlwaysEffect=ruleAlwaysEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlwaysEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlwaysEffect3967); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlwaysEffect"


    // $ANTLR start "ruleAlwaysEffect"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1804:1: ruleAlwaysEffect returns [EObject current=null] : (otherlv_0= 'always' ( (lv_target_1_0= ruleSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) ;
    public final EObject ruleAlwaysEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_target_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1807:28: ( (otherlv_0= 'always' ( (lv_target_1_0= ruleSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1808:1: (otherlv_0= 'always' ( (lv_target_1_0= ruleSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1808:1: (otherlv_0= 'always' ( (lv_target_1_0= ruleSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1808:3: otherlv_0= 'always' ( (lv_target_1_0= ruleSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleAlwaysEffect4004); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAlwaysEffectAccess().getAlwaysKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1812:1: ( (lv_target_1_0= ruleSignalEmission ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1813:1: (lv_target_1_0= ruleSignalEmission )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1813:1: (lv_target_1_0= ruleSignalEmission )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1814:3: lv_target_1_0= ruleSignalEmission
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAlwaysEffectAccess().getTargetSignalEmissionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSignalEmission_in_ruleAlwaysEffect4025);
            lv_target_1_0=ruleSignalEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAlwaysEffectRule());
              	        }
                     		set(
                     			current, 
                     			"target",
                      		lv_target_1_0, 
                      		"SignalEmission");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleAlwaysEffect4037); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAlwaysEffectAccess().getEqualsSignKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1834:1: ( (lv_value_3_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1835:1: (lv_value_3_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1835:1: (lv_value_3_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1836:3: lv_value_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAlwaysEffectAccess().getValueExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAlwaysEffect4058);
            lv_value_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAlwaysEffectRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_3_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlwaysEffect"


    // $ANTLR start "entryRuleSetEffect"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1860:1: entryRuleSetEffect returns [EObject current=null] : iv_ruleSetEffect= ruleSetEffect EOF ;
    public final EObject entryRuleSetEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetEffect = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1861:2: (iv_ruleSetEffect= ruleSetEffect EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1862:2: iv_ruleSetEffect= ruleSetEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetEffectRule()); 
            }
            pushFollow(FOLLOW_ruleSetEffect_in_entryRuleSetEffect4094);
            iv_ruleSetEffect=ruleSetEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetEffect4104); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetEffect"


    // $ANTLR start "ruleSetEffect"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1869:1: ruleSetEffect returns [EObject current=null] : (otherlv_0= 'set' ( (lv_target_1_0= ruleSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) ;
    public final EObject ruleSetEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_target_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1872:28: ( (otherlv_0= 'set' ( (lv_target_1_0= ruleSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1873:1: (otherlv_0= 'set' ( (lv_target_1_0= ruleSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1873:1: (otherlv_0= 'set' ( (lv_target_1_0= ruleSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1873:3: otherlv_0= 'set' ( (lv_target_1_0= ruleSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleSetEffect4141); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSetEffectAccess().getSetKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1877:1: ( (lv_target_1_0= ruleSignalEmission ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1878:1: (lv_target_1_0= ruleSignalEmission )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1878:1: (lv_target_1_0= ruleSignalEmission )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1879:3: lv_target_1_0= ruleSignalEmission
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSetEffectAccess().getTargetSignalEmissionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSignalEmission_in_ruleSetEffect4162);
            lv_target_1_0=ruleSignalEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSetEffectRule());
              	        }
                     		set(
                     			current, 
                     			"target",
                      		lv_target_1_0, 
                      		"SignalEmission");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleSetEffect4174); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSetEffectAccess().getEqualsSignKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1899:1: ( (lv_value_3_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1900:1: (lv_value_3_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1900:1: (lv_value_3_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1901:3: lv_value_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSetEffectAccess().getValueExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleSetEffect4195);
            lv_value_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSetEffectRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_3_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetEffect"


    // $ANTLR start "entryRuleTriggerEffect"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1925:1: entryRuleTriggerEffect returns [EObject current=null] : iv_ruleTriggerEffect= ruleTriggerEffect EOF ;
    public final EObject entryRuleTriggerEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerEffect = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1926:2: (iv_ruleTriggerEffect= ruleTriggerEffect EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1927:2: iv_ruleTriggerEffect= ruleTriggerEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTriggerEffectRule()); 
            }
            pushFollow(FOLLOW_ruleTriggerEffect_in_entryRuleTriggerEffect4231);
            iv_ruleTriggerEffect=ruleTriggerEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTriggerEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTriggerEffect4241); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTriggerEffect"


    // $ANTLR start "ruleTriggerEffect"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1934:1: ruleTriggerEffect returns [EObject current=null] : (otherlv_0= 'trigger' ( (lv_target_1_0= ruleSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) ;
    public final EObject ruleTriggerEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_target_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1937:28: ( (otherlv_0= 'trigger' ( (lv_target_1_0= ruleSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1938:1: (otherlv_0= 'trigger' ( (lv_target_1_0= ruleSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1938:1: (otherlv_0= 'trigger' ( (lv_target_1_0= ruleSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1938:3: otherlv_0= 'trigger' ( (lv_target_1_0= ruleSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleTriggerEffect4278); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTriggerEffectAccess().getTriggerKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1942:1: ( (lv_target_1_0= ruleSignalEmission ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1943:1: (lv_target_1_0= ruleSignalEmission )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1943:1: (lv_target_1_0= ruleSignalEmission )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1944:3: lv_target_1_0= ruleSignalEmission
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTriggerEffectAccess().getTargetSignalEmissionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSignalEmission_in_ruleTriggerEffect4299);
            lv_target_1_0=ruleSignalEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTriggerEffectRule());
              	        }
                     		set(
                     			current, 
                     			"target",
                      		lv_target_1_0, 
                      		"SignalEmission");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleTriggerEffect4311); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTriggerEffectAccess().getEqualsSignKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1964:1: ( (lv_value_3_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1965:1: (lv_value_3_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1965:1: (lv_value_3_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1966:3: lv_value_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTriggerEffectAccess().getValueExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleTriggerEffect4332);
            lv_value_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTriggerEffectRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_3_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTriggerEffect"


    // $ANTLR start "entryRuleExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1990:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1991:2: (iv_ruleExpression= ruleExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1992:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression4368);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression4378); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1999:1: ruleExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2002:28: (this_OrExpression_0= ruleOrExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2004:5: this_OrExpression_0= ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOrExpression_in_ruleExpression4424);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOrExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2020:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2021:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2022:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression4458);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression4468); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2029:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2032:28: ( (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleAndExpression ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2033:1: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleAndExpression ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2033:1: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleAndExpression ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2034:5: this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression4515);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2042:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleAndExpression ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==52) ) {
                    int LA29_2 = input.LA(2);

                    if ( (synpred1_InternalLil()) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2042:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleAndExpression ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2042:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2042:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOr ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2047:6: ( () ( (lv_feature_2_0= ruleOpOr ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2047:7: () ( (lv_feature_2_0= ruleOpOr ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2047:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2048:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2053:2: ( (lv_feature_2_0= ruleOpOr ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2054:1: (lv_feature_2_0= ruleOpOr )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2054:1: (lv_feature_2_0= ruleOpOr )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2055:3: lv_feature_2_0= ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrExpressionAccess().getFeatureOpOrParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleOrExpression4564);
            	    lv_feature_2_0=ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"OpOr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2071:4: ( (lv_rightOperand_3_0= ruleAndExpression ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2072:1: (lv_rightOperand_3_0= ruleAndExpression )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2072:1: (lv_rightOperand_3_0= ruleAndExpression )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2073:3: lv_rightOperand_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrExpressionAccess().getRightOperandAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression4587);
            	    lv_rightOperand_3_0=ruleAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"AndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2097:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2098:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2099:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr4626);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr4637); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2106:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'or' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2109:28: (kw= 'or' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2111:2: kw= 'or'
            {
            kw=(Token)match(input,52,FOLLOW_52_in_ruleOpOr4674); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getOrKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleAndExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2124:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2125:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2126:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression4713);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression4723); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2133:1: ruleAndExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EqualityExpression_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2136:28: ( (this_EqualityExpression_0= ruleEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleEqualityExpression ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2137:1: (this_EqualityExpression_0= ruleEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleEqualityExpression ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2137:1: (this_EqualityExpression_0= ruleEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleEqualityExpression ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2138:5: this_EqualityExpression_0= ruleEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleEqualityExpression_in_ruleAndExpression4770);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_EqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2146:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleEqualityExpression ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==53) ) {
                    int LA30_2 = input.LA(2);

                    if ( (synpred2_InternalLil()) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2146:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleEqualityExpression ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2146:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2146:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAnd ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2151:6: ( () ( (lv_feature_2_0= ruleOpAnd ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2151:7: () ( (lv_feature_2_0= ruleOpAnd ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2151:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2152:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2157:2: ( (lv_feature_2_0= ruleOpAnd ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2158:1: (lv_feature_2_0= ruleOpAnd )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2158:1: (lv_feature_2_0= ruleOpAnd )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2159:3: lv_feature_2_0= ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getFeatureOpAndParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleAndExpression4819);
            	    lv_feature_2_0=ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"OpAnd");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2175:4: ( (lv_rightOperand_3_0= ruleEqualityExpression ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2176:1: (lv_rightOperand_3_0= ruleEqualityExpression )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2176:1: (lv_rightOperand_3_0= ruleEqualityExpression )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2177:3: lv_rightOperand_3_0= ruleEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightOperandEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEqualityExpression_in_ruleAndExpression4842);
            	    lv_rightOperand_3_0=ruleEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"EqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2201:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2202:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2203:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd4881);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd4892); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2210:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'and' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2213:28: (kw= 'and' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2215:2: kw= 'and'
            {
            kw=(Token)match(input,53,FOLLOW_53_in_ruleOpAnd4929); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAndKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleEqualityExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2228:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2229:2: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2230:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression4968);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualityExpression4978); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2237:1: ruleEqualityExpression returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleRelationalExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RelationalExpression_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2240:28: ( (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleRelationalExpression ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2241:1: (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleRelationalExpression ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2241:1: (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleRelationalExpression ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2242:5: this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_ruleEqualityExpression5025);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_RelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2250:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleRelationalExpression ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==54) ) {
                    int LA31_2 = input.LA(2);

                    if ( (synpred3_InternalLil()) ) {
                        alt31=1;
                    }


                }
                else if ( (LA31_0==55) ) {
                    int LA31_3 = input.LA(2);

                    if ( (synpred3_InternalLil()) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2250:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleRelationalExpression ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2250:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpEquality ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2250:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpEquality ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2255:6: ( () ( (lv_feature_2_0= ruleOpEquality ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2255:7: () ( (lv_feature_2_0= ruleOpEquality ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2255:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2256:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2261:2: ( (lv_feature_2_0= ruleOpEquality ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2262:1: (lv_feature_2_0= ruleOpEquality )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2262:1: (lv_feature_2_0= ruleOpEquality )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2263:3: lv_feature_2_0= ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getFeatureOpEqualityParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleEqualityExpression5074);
            	    lv_feature_2_0=ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"OpEquality");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2279:4: ( (lv_rightOperand_3_0= ruleRelationalExpression ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2280:1: (lv_rightOperand_3_0= ruleRelationalExpression )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2280:1: (lv_rightOperand_3_0= ruleRelationalExpression )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2281:3: lv_rightOperand_3_0= ruleRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightOperandRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalExpression_in_ruleEqualityExpression5097);
            	    lv_rightOperand_3_0=ruleRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"RelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2305:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2306:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2307:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality5136);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality5147); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2314:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2317:28: ( (kw= '==' | kw= '!=' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2318:1: (kw= '==' | kw= '!=' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2318:1: (kw= '==' | kw= '!=' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==54) ) {
                alt32=1;
            }
            else if ( (LA32_0==55) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2319:2: kw= '=='
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleOpEquality5185); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2326:2: kw= '!='
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleOpEquality5204); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleRelationalExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2339:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2340:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2341:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression5244);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression5254); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2348:1: ruleRelationalExpression returns [EObject current=null] : (this_OtherOperatorExpression_0= ruleOtherOperatorExpression ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_3_0= ruleOtherOperatorExpression ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OtherOperatorExpression_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2351:28: ( (this_OtherOperatorExpression_0= ruleOtherOperatorExpression ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_3_0= ruleOtherOperatorExpression ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2352:1: (this_OtherOperatorExpression_0= ruleOtherOperatorExpression ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_3_0= ruleOtherOperatorExpression ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2352:1: (this_OtherOperatorExpression_0= ruleOtherOperatorExpression ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_3_0= ruleOtherOperatorExpression ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2353:5: this_OtherOperatorExpression_0= ruleOtherOperatorExpression ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_3_0= ruleOtherOperatorExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleOtherOperatorExpression_in_ruleRelationalExpression5301);
            this_OtherOperatorExpression_0=ruleOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2361:1: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_3_0= ruleOtherOperatorExpression ) ) )*
            loop33:
            do {
                int alt33=2;
                switch ( input.LA(1) ) {
                case 56:
                    {
                    int LA33_2 = input.LA(2);

                    if ( (synpred4_InternalLil()) ) {
                        alt33=1;
                    }


                    }
                    break;
                case 57:
                    {
                    int LA33_3 = input.LA(2);

                    if ( (synpred4_InternalLil()) ) {
                        alt33=1;
                    }


                    }
                    break;
                case 58:
                    {
                    int LA33_4 = input.LA(2);

                    if ( (synpred4_InternalLil()) ) {
                        alt33=1;
                    }


                    }
                    break;
                case 59:
                    {
                    int LA33_5 = input.LA(2);

                    if ( (synpred4_InternalLil()) ) {
                        alt33=1;
                    }


                    }
                    break;

                }

                switch (alt33) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2361:2: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_3_0= ruleOtherOperatorExpression ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2361:2: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2361:3: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpCompare ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2366:6: ( () ( (lv_feature_2_0= ruleOpCompare ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2366:7: () ( (lv_feature_2_0= ruleOpCompare ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2366:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2367:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2372:2: ( (lv_feature_2_0= ruleOpCompare ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2373:1: (lv_feature_2_0= ruleOpCompare )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2373:1: (lv_feature_2_0= ruleOpCompare )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2374:3: lv_feature_2_0= ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getFeatureOpCompareParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleRelationalExpression5350);
            	    lv_feature_2_0=ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"OpCompare");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2390:4: ( (lv_rightOperand_3_0= ruleOtherOperatorExpression ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2391:1: (lv_rightOperand_3_0= ruleOtherOperatorExpression )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2391:1: (lv_rightOperand_3_0= ruleOtherOperatorExpression )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2392:3: lv_rightOperand_3_0= ruleOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightOperandOtherOperatorExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOtherOperatorExpression_in_ruleRelationalExpression5373);
            	    lv_rightOperand_3_0=ruleOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"OtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2416:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2417:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2418:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare5412);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare5423); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2425:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<=' | kw= '>=' | kw= '<' | kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2428:28: ( (kw= '<=' | kw= '>=' | kw= '<' | kw= '>' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2429:1: (kw= '<=' | kw= '>=' | kw= '<' | kw= '>' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2429:1: (kw= '<=' | kw= '>=' | kw= '<' | kw= '>' )
            int alt34=4;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt34=1;
                }
                break;
            case 57:
                {
                alt34=2;
                }
                break;
            case 58:
                {
                alt34=3;
                }
                break;
            case 59:
                {
                alt34=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2430:2: kw= '<='
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleOpCompare5461); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2437:2: kw= '>='
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleOpCompare5480); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2444:2: kw= '<'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleOpCompare5499); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2451:2: kw= '>'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleOpCompare5518); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleOtherOperatorExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2464:1: entryRuleOtherOperatorExpression returns [EObject current=null] : iv_ruleOtherOperatorExpression= ruleOtherOperatorExpression EOF ;
    public final EObject entryRuleOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherOperatorExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2465:2: (iv_ruleOtherOperatorExpression= ruleOtherOperatorExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2466:2: iv_ruleOtherOperatorExpression= ruleOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleOtherOperatorExpression_in_entryRuleOtherOperatorExpression5558);
            iv_ruleOtherOperatorExpression=ruleOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherOperatorExpression5568); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOtherOperatorExpression"


    // $ANTLR start "ruleOtherOperatorExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2473:1: ruleOtherOperatorExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleAdditiveExpression ) ) )* ) ;
    public final EObject ruleOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2476:28: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleAdditiveExpression ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2477:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleAdditiveExpression ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2477:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleAdditiveExpression ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2478:5: this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOtherOperatorExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleOtherOperatorExpression5615);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2486:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleAdditiveExpression ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==60) ) {
                    int LA35_2 = input.LA(2);

                    if ( (synpred5_InternalLil()) ) {
                        alt35=1;
                    }


                }
                else if ( (LA35_0==61) ) {
                    int LA35_3 = input.LA(2);

                    if ( (synpred5_InternalLil()) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2486:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleAdditiveExpression ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2486:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2486:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpOther ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2491:6: ( () ( (lv_feature_2_0= ruleOpOther ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2491:7: () ( (lv_feature_2_0= ruleOpOther ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2491:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2492:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2497:2: ( (lv_feature_2_0= ruleOpOther ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2498:1: (lv_feature_2_0= ruleOpOther )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2498:1: (lv_feature_2_0= ruleOpOther )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2499:3: lv_feature_2_0= ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOtherOperatorExpressionAccess().getFeatureOpOtherParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleOtherOperatorExpression5664);
            	    lv_feature_2_0=ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"OpOther");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2515:4: ( (lv_rightOperand_3_0= ruleAdditiveExpression ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2516:1: (lv_rightOperand_3_0= ruleAdditiveExpression )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2516:1: (lv_rightOperand_3_0= ruleAdditiveExpression )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2517:3: lv_rightOperand_3_0= ruleAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOtherOperatorExpressionAccess().getRightOperandAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleOtherOperatorExpression5687);
            	    lv_rightOperand_3_0=ruleAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"AdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2541:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2542:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2543:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther5726);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther5737); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2550:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<>' | kw= '?:' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2553:28: ( (kw= '<>' | kw= '?:' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2554:1: (kw= '<>' | kw= '?:' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2554:1: (kw= '<>' | kw= '?:' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==60) ) {
                alt36=1;
            }
            else if ( (LA36_0==61) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2555:2: kw= '<>'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleOpOther5775); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2562:2: kw= '?:'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleOpOther5794); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleAdditiveExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2575:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2576:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2577:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression5834);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression5844); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2584:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2587:28: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2588:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2588:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleMultiplicativeExpression ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2589:5: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression5891);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2597:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleMultiplicativeExpression ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==62) ) {
                    int LA37_2 = input.LA(2);

                    if ( (synpred6_InternalLil()) ) {
                        alt37=1;
                    }


                }
                else if ( (LA37_0==63) ) {
                    int LA37_3 = input.LA(2);

                    if ( (synpred6_InternalLil()) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2597:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2597:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2597:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpAdd ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2602:6: ( () ( (lv_feature_2_0= ruleOpAdd ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2602:7: () ( (lv_feature_2_0= ruleOpAdd ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2602:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2603:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2608:2: ( (lv_feature_2_0= ruleOpAdd ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2609:1: (lv_feature_2_0= ruleOpAdd )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2609:1: (lv_feature_2_0= ruleOpAdd )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2610:3: lv_feature_2_0= ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getFeatureOpAddParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleAdditiveExpression5940);
            	    lv_feature_2_0=ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"OpAdd");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2626:4: ( (lv_rightOperand_3_0= ruleMultiplicativeExpression ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2627:1: (lv_rightOperand_3_0= ruleMultiplicativeExpression )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2627:1: (lv_rightOperand_3_0= ruleMultiplicativeExpression )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2628:3: lv_rightOperand_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightOperandMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression5963);
            	    lv_rightOperand_3_0=ruleMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"MultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2652:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2653:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2654:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd6002);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd6013); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2661:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2664:28: ( (kw= '+' | kw= '-' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2665:1: (kw= '+' | kw= '-' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2665:1: (kw= '+' | kw= '-' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==62) ) {
                alt38=1;
            }
            else if ( (LA38_0==63) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2666:2: kw= '+'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleOpAdd6051); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2673:2: kw= '-'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleOpAdd6070); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2686:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2687:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2688:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression6110);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression6120); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2695:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleUnaryOperation ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryOperation_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2698:28: ( (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleUnaryOperation ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2699:1: (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleUnaryOperation ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2699:1: (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleUnaryOperation ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2700:5: this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleUnaryOperation_in_ruleMultiplicativeExpression6167);
            this_UnaryOperation_0=ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_UnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2708:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleUnaryOperation ) ) )*
            loop39:
            do {
                int alt39=2;
                switch ( input.LA(1) ) {
                case 64:
                    {
                    int LA39_2 = input.LA(2);

                    if ( (synpred7_InternalLil()) ) {
                        alt39=1;
                    }


                    }
                    break;
                case 65:
                    {
                    int LA39_3 = input.LA(2);

                    if ( (synpred7_InternalLil()) ) {
                        alt39=1;
                    }


                    }
                    break;
                case 66:
                    {
                    int LA39_4 = input.LA(2);

                    if ( (synpred7_InternalLil()) ) {
                        alt39=1;
                    }


                    }
                    break;

                }

                switch (alt39) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2708:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleUnaryOperation ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2708:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMulti ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2708:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_feature_2_0= ruleOpMulti ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2713:6: ( () ( (lv_feature_2_0= ruleOpMulti ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2713:7: () ( (lv_feature_2_0= ruleOpMulti ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2713:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2714:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2719:2: ( (lv_feature_2_0= ruleOpMulti ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2720:1: (lv_feature_2_0= ruleOpMulti )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2720:1: (lv_feature_2_0= ruleOpMulti )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2721:3: lv_feature_2_0= ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getFeatureOpMultiParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleMultiplicativeExpression6216);
            	    lv_feature_2_0=ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"OpMulti");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2737:4: ( (lv_rightOperand_3_0= ruleUnaryOperation ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2738:1: (lv_rightOperand_3_0= ruleUnaryOperation )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2738:1: (lv_rightOperand_3_0= ruleUnaryOperation )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2739:3: lv_rightOperand_3_0= ruleUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightOperandUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUnaryOperation_in_ruleMultiplicativeExpression6239);
            	    lv_rightOperand_3_0=ruleUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"UnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2763:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2764:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2765:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti6278);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti6289); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2772:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2775:28: ( (kw= '*' | kw= '/' | kw= '%' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2776:1: (kw= '*' | kw= '/' | kw= '%' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2776:1: (kw= '*' | kw= '/' | kw= '%' )
            int alt40=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt40=1;
                }
                break;
            case 65:
                {
                alt40=2;
                }
                break;
            case 66:
                {
                alt40=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2777:2: kw= '*'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleOpMulti6327); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2784:2: kw= '/'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleOpMulti6346); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2791:2: kw= '%'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleOpMulti6365); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleUnaryOperation"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2804:1: entryRuleUnaryOperation returns [EObject current=null] : iv_ruleUnaryOperation= ruleUnaryOperation EOF ;
    public final EObject entryRuleUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperation = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2805:2: (iv_ruleUnaryOperation= ruleUnaryOperation EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2806:2: iv_ruleUnaryOperation= ruleUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation6405);
            iv_ruleUnaryOperation=ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryOperation6415); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryOperation"


    // $ANTLR start "ruleUnaryOperation"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2813:1: ruleUnaryOperation returns [EObject current=null] : ( ( () ( (lv_feature_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= rulePrimaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression ) ;
    public final EObject ruleUnaryOperation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_feature_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_PrimaryExpression_3 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2816:28: ( ( ( () ( (lv_feature_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= rulePrimaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2817:1: ( ( () ( (lv_feature_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= rulePrimaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2817:1: ( ( () ( (lv_feature_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= rulePrimaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=62 && LA41_0<=63)||LA41_0==67) ) {
                alt41=1;
            }
            else if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_INT)||LA41_0==27||LA41_0==29||LA41_0==47||(LA41_0>=68 && LA41_0<=69)||LA41_0==72||LA41_0==75||(LA41_0>=77 && LA41_0<=116)) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2817:2: ( () ( (lv_feature_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= rulePrimaryExpression ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2817:2: ( () ( (lv_feature_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= rulePrimaryExpression ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2817:3: () ( (lv_feature_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= rulePrimaryExpression ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2817:3: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2818:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getUnaryOperationAccess().getUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2823:2: ( (lv_feature_1_0= ruleOpUnary ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2824:1: (lv_feature_1_0= ruleOpUnary )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2824:1: (lv_feature_1_0= ruleOpUnary )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2825:3: lv_feature_1_0= ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryOperationAccess().getFeatureOpUnaryParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleUnaryOperation6471);
                    lv_feature_1_0=ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"feature",
                              		lv_feature_1_0, 
                              		"OpUnary");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2841:2: ( (lv_operand_2_0= rulePrimaryExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2842:1: (lv_operand_2_0= rulePrimaryExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2842:1: (lv_operand_2_0= rulePrimaryExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2843:3: lv_operand_2_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryOperationAccess().getOperandPrimaryExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleUnaryOperation6492);
                    lv_operand_2_0=rulePrimaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"PrimaryExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2861:5: this_PrimaryExpression_3= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryOperationAccess().getPrimaryExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleUnaryOperation6521);
                    this_PrimaryExpression_3=rulePrimaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimaryExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2877:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2878:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2879:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary6557);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary6568); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2886:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2889:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2890:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2890:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt42=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt42=1;
                }
                break;
            case 63:
                {
                alt42=2;
                }
                break;
            case 62:
                {
                alt42=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2891:2: kw= '!'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleOpUnary6606); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2898:2: kw= '-'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleOpUnary6625); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2905:2: kw= '+'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleOpUnary6644); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2918:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2919:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2920:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression6684);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression6694); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2927:1: rulePrimaryExpression returns [EObject current=null] : (this_SwitchExpression_0= ruleSwitchExpression | this_IfExpression_1= ruleIfExpression | this_Literal_2= ruleLiteral | this_ForEachExpression_3= ruleForEachExpression | this_FunctionCallExpression_4= ruleFunctionCallExpression | this_ParenthesizedExpression_5= ruleParenthesizedExpression ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SwitchExpression_0 = null;

        EObject this_IfExpression_1 = null;

        EObject this_Literal_2 = null;

        EObject this_ForEachExpression_3 = null;

        EObject this_FunctionCallExpression_4 = null;

        EObject this_ParenthesizedExpression_5 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2930:28: ( (this_SwitchExpression_0= ruleSwitchExpression | this_IfExpression_1= ruleIfExpression | this_Literal_2= ruleLiteral | this_ForEachExpression_3= ruleForEachExpression | this_FunctionCallExpression_4= ruleFunctionCallExpression | this_ParenthesizedExpression_5= ruleParenthesizedExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2931:1: (this_SwitchExpression_0= ruleSwitchExpression | this_IfExpression_1= ruleIfExpression | this_Literal_2= ruleLiteral | this_ForEachExpression_3= ruleForEachExpression | this_FunctionCallExpression_4= ruleFunctionCallExpression | this_ParenthesizedExpression_5= ruleParenthesizedExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2931:1: (this_SwitchExpression_0= ruleSwitchExpression | this_IfExpression_1= ruleIfExpression | this_Literal_2= ruleLiteral | this_ForEachExpression_3= ruleForEachExpression | this_FunctionCallExpression_4= ruleFunctionCallExpression | this_ParenthesizedExpression_5= ruleParenthesizedExpression )
            int alt43=6;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt43=1;
                }
                break;
            case 47:
                {
                alt43=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 27:
            case 29:
            case 68:
            case 113:
            case 114:
            case 115:
            case 116:
                {
                alt43=3;
                }
                break;
            case 75:
                {
                alt43=4;
                }
                break;
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
                {
                alt43=5;
                }
                break;
            case 69:
                {
                alt43=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2932:5: this_SwitchExpression_0= ruleSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getSwitchExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSwitchExpression_in_rulePrimaryExpression6741);
                    this_SwitchExpression_0=ruleSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SwitchExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2942:5: this_IfExpression_1= ruleIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getIfExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIfExpression_in_rulePrimaryExpression6768);
                    this_IfExpression_1=ruleIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IfExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2952:5: this_Literal_2= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_rulePrimaryExpression6795);
                    this_Literal_2=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Literal_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2962:5: this_ForEachExpression_3= ruleForEachExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getForEachExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleForEachExpression_in_rulePrimaryExpression6822);
                    this_ForEachExpression_3=ruleForEachExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ForEachExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2972:5: this_FunctionCallExpression_4= ruleFunctionCallExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFunctionCallExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionCallExpression_in_rulePrimaryExpression6849);
                    this_FunctionCallExpression_4=ruleFunctionCallExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionCallExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2982:5: this_ParenthesizedExpression_5= ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParenthesizedExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression6876);
                    this_ParenthesizedExpression_5=ruleParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ParenthesizedExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2998:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2999:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3000:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral6911);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral6921); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3007:1: ruleLiteral returns [EObject current=null] : (this_CollectionLiteral_0= ruleCollectionLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_TimeLiteral_5= ruleTimeLiteral | ( () otherlv_7= '#' ( (otherlv_8= RULE_ID ) ) ) | ( () ( (otherlv_10= RULE_ID ) ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject this_CollectionLiteral_0 = null;

        EObject this_BooleanLiteral_1 = null;

        EObject this_NumberLiteral_2 = null;

        EObject this_NullLiteral_3 = null;

        EObject this_StringLiteral_4 = null;

        EObject this_TimeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3010:28: ( (this_CollectionLiteral_0= ruleCollectionLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_TimeLiteral_5= ruleTimeLiteral | ( () otherlv_7= '#' ( (otherlv_8= RULE_ID ) ) ) | ( () ( (otherlv_10= RULE_ID ) ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3011:1: (this_CollectionLiteral_0= ruleCollectionLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_TimeLiteral_5= ruleTimeLiteral | ( () otherlv_7= '#' ( (otherlv_8= RULE_ID ) ) ) | ( () ( (otherlv_10= RULE_ID ) ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3011:1: (this_CollectionLiteral_0= ruleCollectionLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_TimeLiteral_5= ruleTimeLiteral | ( () otherlv_7= '#' ( (otherlv_8= RULE_ID ) ) ) | ( () ( (otherlv_10= RULE_ID ) ) ) )
            int alt44=8;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3012:5: this_CollectionLiteral_0= ruleCollectionLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getCollectionLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCollectionLiteral_in_ruleLiteral6968);
                    this_CollectionLiteral_0=ruleCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CollectionLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3022:5: this_BooleanLiteral_1= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteral6995);
                    this_BooleanLiteral_1=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3032:5: this_NumberLiteral_2= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleLiteral7022);
                    this_NumberLiteral_2=ruleNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumberLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3042:5: this_NullLiteral_3= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleLiteral7049);
                    this_NullLiteral_3=ruleNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NullLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3052:5: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral7076);
                    this_StringLiteral_4=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3062:5: this_TimeLiteral_5= ruleTimeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getTimeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTimeLiteral_in_ruleLiteral7103);
                    this_TimeLiteral_5=ruleTimeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TimeLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3071:6: ( () otherlv_7= '#' ( (otherlv_8= RULE_ID ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3071:6: ( () otherlv_7= '#' ( (otherlv_8= RULE_ID ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3071:7: () otherlv_7= '#' ( (otherlv_8= RULE_ID ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3071:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3072:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralAccess().getEnumLiteralAction_6_0(),
                                  current);
                          
                    }

                    }

                    otherlv_7=(Token)match(input,68,FOLLOW_68_in_ruleLiteral7130); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getLiteralAccess().getNumberSignKeyword_6_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3081:1: ( (otherlv_8= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3082:1: (otherlv_8= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3082:1: (otherlv_8= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3083:3: otherlv_8= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralRule());
                      	        }
                              
                    }
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteral7150); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_8, grammarAccess.getLiteralAccess().getElementEnumElementCrossReference_6_2_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3095:6: ( () ( (otherlv_10= RULE_ID ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3095:6: ( () ( (otherlv_10= RULE_ID ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3095:7: () ( (otherlv_10= RULE_ID ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3095:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3096:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralAccess().getSignalLiteralAction_7_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3101:2: ( (otherlv_10= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3102:1: (otherlv_10= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3102:1: (otherlv_10= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3103:3: otherlv_10= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralRule());
                      	        }
                              
                    }
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteral7187); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_10, grammarAccess.getLiteralAccess().getSignalSignalCrossReference_7_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleCollectionLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3122:1: entryRuleCollectionLiteral returns [EObject current=null] : iv_ruleCollectionLiteral= ruleCollectionLiteral EOF ;
    public final EObject entryRuleCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteral = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3123:2: (iv_ruleCollectionLiteral= ruleCollectionLiteral EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3124:2: iv_ruleCollectionLiteral= ruleCollectionLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleCollectionLiteral_in_entryRuleCollectionLiteral7224);
            iv_ruleCollectionLiteral=ruleCollectionLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionLiteral7234); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionLiteral"


    // $ANTLR start "ruleCollectionLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3131:1: ruleCollectionLiteral returns [EObject current=null] : (this_SetLiteral_0= ruleSetLiteral | this_ListLiteral_1= ruleListLiteral ) ;
    public final EObject ruleCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_SetLiteral_0 = null;

        EObject this_ListLiteral_1 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3134:28: ( (this_SetLiteral_0= ruleSetLiteral | this_ListLiteral_1= ruleListLiteral ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3135:1: (this_SetLiteral_0= ruleSetLiteral | this_ListLiteral_1= ruleListLiteral )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3135:1: (this_SetLiteral_0= ruleSetLiteral | this_ListLiteral_1= ruleListLiteral )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==27) ) {
                alt45=1;
            }
            else if ( (LA45_0==29) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3136:5: this_SetLiteral_0= ruleSetLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCollectionLiteralAccess().getSetLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSetLiteral_in_ruleCollectionLiteral7281);
                    this_SetLiteral_0=ruleSetLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SetLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3146:5: this_ListLiteral_1= ruleListLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCollectionLiteralAccess().getListLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleListLiteral_in_ruleCollectionLiteral7308);
                    this_ListLiteral_1=ruleListLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ListLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionLiteral"


    // $ANTLR start "entryRuleSetLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3162:1: entryRuleSetLiteral returns [EObject current=null] : iv_ruleSetLiteral= ruleSetLiteral EOF ;
    public final EObject entryRuleSetLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetLiteral = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3163:2: (iv_ruleSetLiteral= ruleSetLiteral EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3164:2: iv_ruleSetLiteral= ruleSetLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleSetLiteral_in_entryRuleSetLiteral7343);
            iv_ruleSetLiteral=ruleSetLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetLiteral7353); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetLiteral"


    // $ANTLR start "ruleSetLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3171:1: ruleSetLiteral returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleSetLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3174:28: ( ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3175:1: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3175:1: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3175:2: () otherlv_1= '{' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= '}'
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3175:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3176:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSetLiteralAccess().getSetLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleSetLiteral7399); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSetLiteralAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3185:1: ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_ID && LA47_0<=RULE_INT)||LA47_0==27||LA47_0==29||LA47_0==47||(LA47_0>=62 && LA47_0<=63)||(LA47_0>=67 && LA47_0<=69)||LA47_0==72||LA47_0==75||(LA47_0>=77 && LA47_0<=116)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3185:2: ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )*
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3185:2: ( (lv_elements_2_0= ruleExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3186:1: (lv_elements_2_0= ruleExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3186:1: (lv_elements_2_0= ruleExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3187:3: lv_elements_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSetLiteralAccess().getElementsExpressionParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleSetLiteral7421);
                    lv_elements_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSetLiteralRule());
                      	        }
                             		add(
                             			current, 
                             			"elements",
                              		lv_elements_2_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3203:2: (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==23) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3203:4: otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleSetLiteral7434); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getSetLiteralAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3207:1: ( (lv_elements_4_0= ruleExpression ) )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3208:1: (lv_elements_4_0= ruleExpression )
                    	    {
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3208:1: (lv_elements_4_0= ruleExpression )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3209:3: lv_elements_4_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSetLiteralAccess().getElementsExpressionParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleSetLiteral7455);
                    	    lv_elements_4_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSetLiteralRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elements",
                    	              		lv_elements_4_0, 
                    	              		"Expression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleSetLiteral7471); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSetLiteralAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetLiteral"


    // $ANTLR start "entryRuleListLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3237:1: entryRuleListLiteral returns [EObject current=null] : iv_ruleListLiteral= ruleListLiteral EOF ;
    public final EObject entryRuleListLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListLiteral = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3238:2: (iv_ruleListLiteral= ruleListLiteral EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3239:2: iv_ruleListLiteral= ruleListLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleListLiteral_in_entryRuleListLiteral7507);
            iv_ruleListLiteral=ruleListLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleListLiteral7517); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListLiteral"


    // $ANTLR start "ruleListLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3246:1: ruleListLiteral returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleListLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3249:28: ( ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= ']' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3250:1: ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= ']' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3250:1: ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= ']' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3250:2: () otherlv_1= '[' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= ']'
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3250:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3251:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getListLiteralAccess().getListLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleListLiteral7563); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getListLiteralAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3260:1: ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_ID && LA49_0<=RULE_INT)||LA49_0==27||LA49_0==29||LA49_0==47||(LA49_0>=62 && LA49_0<=63)||(LA49_0>=67 && LA49_0<=69)||LA49_0==72||LA49_0==75||(LA49_0>=77 && LA49_0<=116)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3260:2: ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )*
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3260:2: ( (lv_elements_2_0= ruleExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3261:1: (lv_elements_2_0= ruleExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3261:1: (lv_elements_2_0= ruleExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3262:3: lv_elements_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getListLiteralAccess().getElementsExpressionParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleListLiteral7585);
                    lv_elements_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getListLiteralRule());
                      	        }
                             		add(
                             			current, 
                             			"elements",
                              		lv_elements_2_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3278:2: (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==23) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3278:4: otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleListLiteral7598); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getListLiteralAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3282:1: ( (lv_elements_4_0= ruleExpression ) )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3283:1: (lv_elements_4_0= ruleExpression )
                    	    {
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3283:1: (lv_elements_4_0= ruleExpression )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3284:3: lv_elements_4_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getListLiteralAccess().getElementsExpressionParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleListLiteral7619);
                    	    lv_elements_4_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getListLiteralRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elements",
                    	              		lv_elements_4_0, 
                    	              		"Expression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleListLiteral7635); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getListLiteralAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListLiteral"


    // $ANTLR start "entryRuleParenthesizedExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3312:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3313:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3314:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression7671);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedExpression7681); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesizedExpression"


    // $ANTLR start "ruleParenthesizedExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3321:1: ruleParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3324:28: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3325:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3325:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3325:3: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_69_in_ruleParenthesizedExpression7718); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesizedExpression7740);
            this_Expression_1=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Expression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,70,FOLLOW_70_in_ruleParenthesizedExpression7751); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenthesizedExpression"


    // $ANTLR start "entryRuleIfExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3350:1: entryRuleIfExpression returns [EObject current=null] : iv_ruleIfExpression= ruleIfExpression EOF ;
    public final EObject entryRuleIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3351:2: (iv_ruleIfExpression= ruleIfExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3352:2: iv_ruleIfExpression= ruleIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleIfExpression_in_entryRuleIfExpression7787);
            iv_ruleIfExpression=ruleIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfExpression7797); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfExpression"


    // $ANTLR start "ruleIfExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3359:1: ruleIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( (lv_then_5_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) ) ) ) ;
    public final EObject ruleIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3362:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( (lv_then_5_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3363:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( (lv_then_5_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3363:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( (lv_then_5_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3363:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( (lv_then_5_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3363:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3364:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIfExpressionAccess().getIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleIfExpression7843); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,69,FOLLOW_69_in_ruleIfExpression7855); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3377:1: ( (lv_if_3_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3378:1: (lv_if_3_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3378:1: (lv_if_3_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3379:3: lv_if_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpressionAccess().getIfExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleIfExpression7876);
            lv_if_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3395:2: ( ( ')' )=>otherlv_4= ')' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3395:3: ( ')' )=>otherlv_4= ')'
            {
            otherlv_4=(Token)match(input,70,FOLLOW_70_in_ruleIfExpression7896); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3400:2: ( (lv_then_5_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3401:1: (lv_then_5_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3401:1: (lv_then_5_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3402:3: lv_then_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpressionAccess().getThenExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleIfExpression7918);
            lv_then_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3418:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3418:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3418:3: ( ( 'else' )=>otherlv_6= 'else' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3418:4: ( 'else' )=>otherlv_6= 'else'
            {
            otherlv_6=(Token)match(input,71,FOLLOW_71_in_ruleIfExpression7939); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getIfExpressionAccess().getElseKeyword_6_0());
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3423:2: ( (lv_else_7_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3424:1: (lv_else_7_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3424:1: (lv_else_7_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3425:3: lv_else_7_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpressionAccess().getElseExpressionParserRuleCall_6_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleIfExpression7961);
            lv_else_7_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"else",
                      		lv_else_7_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfExpression"


    // $ANTLR start "entryRuleSwitchExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3449:1: entryRuleSwitchExpression returns [EObject current=null] : iv_ruleSwitchExpression= ruleSwitchExpression EOF ;
    public final EObject entryRuleSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3450:2: (iv_ruleSwitchExpression= ruleSwitchExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3451:2: iv_ruleSwitchExpression= ruleSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSwitchExpression_in_entryRuleSwitchExpression7998);
            iv_ruleSwitchExpression=ruleSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitchExpression8008); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSwitchExpression"


    // $ANTLR start "ruleSwitchExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3458:1: ruleSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' otherlv_2= '(' ( (lv_switch_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( ( ( ruleCasePart ) )=> (lv_cases_5_0= ruleCasePart ) )+ ( ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleExpression ) ) )? ) ;
    public final EObject ruleSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_switch_3_0 = null;

        EObject lv_cases_5_0 = null;

        EObject lv_default_8_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3461:28: ( ( () otherlv_1= 'switch' otherlv_2= '(' ( (lv_switch_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( ( ( ruleCasePart ) )=> (lv_cases_5_0= ruleCasePart ) )+ ( ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleExpression ) ) )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3462:1: ( () otherlv_1= 'switch' otherlv_2= '(' ( (lv_switch_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( ( ( ruleCasePart ) )=> (lv_cases_5_0= ruleCasePart ) )+ ( ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleExpression ) ) )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3462:1: ( () otherlv_1= 'switch' otherlv_2= '(' ( (lv_switch_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( ( ( ruleCasePart ) )=> (lv_cases_5_0= ruleCasePart ) )+ ( ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleExpression ) ) )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3462:2: () otherlv_1= 'switch' otherlv_2= '(' ( (lv_switch_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( ( ( ruleCasePart ) )=> (lv_cases_5_0= ruleCasePart ) )+ ( ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleExpression ) ) )?
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3462:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3463:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSwitchExpressionAccess().getSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleSwitchExpression8054); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,69,FOLLOW_69_in_ruleSwitchExpression8066); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSwitchExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3476:1: ( (lv_switch_3_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3477:1: (lv_switch_3_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3477:1: (lv_switch_3_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3478:3: lv_switch_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchExpressionAccess().getSwitchExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleSwitchExpression8087);
            lv_switch_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSwitchExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"switch",
                      		lv_switch_3_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3494:2: ( ( ')' )=>otherlv_4= ')' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3494:3: ( ')' )=>otherlv_4= ')'
            {
            otherlv_4=(Token)match(input,70,FOLLOW_70_in_ruleSwitchExpression8107); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSwitchExpressionAccess().getRightParenthesisKeyword_4());
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3499:2: ( ( ( ruleCasePart ) )=> (lv_cases_5_0= ruleCasePart ) )+
            int cnt50=0;
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==74) ) {
                    int LA50_2 = input.LA(2);

                    if ( (synpred11_InternalLil()) ) {
                        alt50=1;
                    }


                }


                switch (alt50) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3499:3: ( ( ruleCasePart ) )=> (lv_cases_5_0= ruleCasePart )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3504:1: (lv_cases_5_0= ruleCasePart )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3505:3: lv_cases_5_0= ruleCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitchExpressionAccess().getCasesCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCasePart_in_ruleSwitchExpression8139);
            	    lv_cases_5_0=ruleCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_5_0, 
            	              		"CasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt50 >= 1 ) break loop50;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(50, input);
                        throw eee;
                }
                cnt50++;
            } while (true);

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3521:3: ( ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleExpression ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==73) ) {
                int LA51_1 = input.LA(2);

                if ( (synpred12_InternalLil()) ) {
                    alt51=1;
                }
            }
            switch (alt51) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3521:4: ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleExpression ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3521:4: ( ( 'default' )=>otherlv_6= 'default' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3521:5: ( 'default' )=>otherlv_6= 'default'
                    {
                    otherlv_6=(Token)match(input,73,FOLLOW_73_in_ruleSwitchExpression8161); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }

                    }

                    otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleSwitchExpression8174); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3530:1: ( (lv_default_8_0= ruleExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3531:1: (lv_default_8_0= ruleExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3531:1: (lv_default_8_0= ruleExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3532:3: lv_default_8_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSwitchExpressionAccess().getDefaultExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleSwitchExpression8195);
                    lv_default_8_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_8_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSwitchExpression"


    // $ANTLR start "entryRuleCasePart"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3556:1: entryRuleCasePart returns [EObject current=null] : iv_ruleCasePart= ruleCasePart EOF ;
    public final EObject entryRuleCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCasePart = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3557:2: (iv_ruleCasePart= ruleCasePart EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3558:2: iv_ruleCasePart= ruleCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleCasePart_in_entryRuleCasePart8233);
            iv_ruleCasePart=ruleCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCasePart8243); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCasePart"


    // $ANTLR start "ruleCasePart"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3565:1: ruleCasePart returns [EObject current=null] : (otherlv_0= 'case' ( (lv_case_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_then_3_0= ruleExpression ) ) ) ;
    public final EObject ruleCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_case_1_0 = null;

        EObject lv_then_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3568:28: ( (otherlv_0= 'case' ( (lv_case_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_then_3_0= ruleExpression ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3569:1: (otherlv_0= 'case' ( (lv_case_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_then_3_0= ruleExpression ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3569:1: (otherlv_0= 'case' ( (lv_case_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_then_3_0= ruleExpression ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3569:3: otherlv_0= 'case' ( (lv_case_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_then_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleCasePart8280); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCasePartAccess().getCaseKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3573:1: ( (lv_case_1_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3574:1: (lv_case_1_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3574:1: (lv_case_1_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3575:3: lv_case_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCasePartAccess().getCaseExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleCasePart8301);
            lv_case_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"case",
                      		lv_case_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCasePart8313); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCasePartAccess().getColonKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3595:1: ( (lv_then_3_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3596:1: (lv_then_3_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3596:1: (lv_then_3_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3597:3: lv_then_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCasePartAccess().getThenExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleCasePart8334);
            lv_then_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_3_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCasePart"


    // $ANTLR start "entryRuleForEachExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3621:1: entryRuleForEachExpression returns [EObject current=null] : iv_ruleForEachExpression= ruleForEachExpression EOF ;
    public final EObject entryRuleForEachExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEachExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3622:2: (iv_ruleForEachExpression= ruleForEachExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3623:2: iv_ruleForEachExpression= ruleForEachExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForEachExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleForEachExpression_in_entryRuleForEachExpression8370);
            iv_ruleForEachExpression=ruleForEachExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForEachExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForEachExpression8380); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForEachExpression"


    // $ANTLR start "ruleForEachExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3630:1: ruleForEachExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= 'each' otherlv_3= '(' ( (lv_forExpression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_eachExpression_6_0= ruleExpression ) ) ) ;
    public final EObject ruleForEachExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_forExpression_4_0 = null;

        EObject lv_eachExpression_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3633:28: ( ( () otherlv_1= 'for' otherlv_2= 'each' otherlv_3= '(' ( (lv_forExpression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_eachExpression_6_0= ruleExpression ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3634:1: ( () otherlv_1= 'for' otherlv_2= 'each' otherlv_3= '(' ( (lv_forExpression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_eachExpression_6_0= ruleExpression ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3634:1: ( () otherlv_1= 'for' otherlv_2= 'each' otherlv_3= '(' ( (lv_forExpression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_eachExpression_6_0= ruleExpression ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3634:2: () otherlv_1= 'for' otherlv_2= 'each' otherlv_3= '(' ( (lv_forExpression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_eachExpression_6_0= ruleExpression ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3634:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3635:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getForEachExpressionAccess().getForEachExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleForEachExpression8426); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getForEachExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,76,FOLLOW_76_in_ruleForEachExpression8438); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getForEachExpressionAccess().getEachKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,69,FOLLOW_69_in_ruleForEachExpression8450); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getForEachExpressionAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3652:1: ( (lv_forExpression_4_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3653:1: (lv_forExpression_4_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3653:1: (lv_forExpression_4_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3654:3: lv_forExpression_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForEachExpressionAccess().getForExpressionExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleForEachExpression8471);
            lv_forExpression_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForEachExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_4_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,70,FOLLOW_70_in_ruleForEachExpression8483); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getForEachExpressionAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3674:1: ( (lv_eachExpression_6_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3675:1: (lv_eachExpression_6_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3675:1: (lv_eachExpression_6_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3676:3: lv_eachExpression_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForEachExpressionAccess().getEachExpressionExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleForEachExpression8504);
            lv_eachExpression_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForEachExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_6_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForEachExpression"


    // $ANTLR start "entryRuleFunctionCallExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3700:1: entryRuleFunctionCallExpression returns [EObject current=null] : iv_ruleFunctionCallExpression= ruleFunctionCallExpression EOF ;
    public final EObject entryRuleFunctionCallExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3701:2: (iv_ruleFunctionCallExpression= ruleFunctionCallExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3702:2: iv_ruleFunctionCallExpression= ruleFunctionCallExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionCallExpression_in_entryRuleFunctionCallExpression8540);
            iv_ruleFunctionCallExpression=ruleFunctionCallExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCallExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCallExpression8550); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCallExpression"


    // $ANTLR start "ruleFunctionCallExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3709:1: ruleFunctionCallExpression returns [EObject current=null] : ( () ( (lv_function_1_0= ruleBuiltInFunction ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleFunctionCallExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_function_1_0 = null;

        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3712:28: ( ( () ( (lv_function_1_0= ruleBuiltInFunction ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* otherlv_6= ')' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3713:1: ( () ( (lv_function_1_0= ruleBuiltInFunction ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* otherlv_6= ')' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3713:1: ( () ( (lv_function_1_0= ruleBuiltInFunction ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* otherlv_6= ')' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3713:2: () ( (lv_function_1_0= ruleBuiltInFunction ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* otherlv_6= ')'
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3713:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3714:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFunctionCallExpressionAccess().getFunctionCallExpressionAction_0(),
                          current);
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3719:2: ( (lv_function_1_0= ruleBuiltInFunction ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3720:1: (lv_function_1_0= ruleBuiltInFunction )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3720:1: (lv_function_1_0= ruleBuiltInFunction )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3721:3: lv_function_1_0= ruleBuiltInFunction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionCallExpressionAccess().getFunctionBuiltInFunctionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBuiltInFunction_in_ruleFunctionCallExpression8605);
            lv_function_1_0=ruleBuiltInFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionCallExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"function",
                      		lv_function_1_0, 
                      		"BuiltInFunction");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,69,FOLLOW_69_in_ruleFunctionCallExpression8617); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFunctionCallExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3741:1: ( (lv_arguments_3_0= ruleExpression ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=RULE_ID && LA52_0<=RULE_INT)||LA52_0==27||LA52_0==29||LA52_0==47||(LA52_0>=62 && LA52_0<=63)||(LA52_0>=67 && LA52_0<=69)||LA52_0==72||LA52_0==75||(LA52_0>=77 && LA52_0<=116)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3742:1: (lv_arguments_3_0= ruleExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3742:1: (lv_arguments_3_0= ruleExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3743:3: lv_arguments_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallExpressionAccess().getArgumentsExpressionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleFunctionCallExpression8638);
                    lv_arguments_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionCallExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_3_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3759:3: (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==23) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3759:5: otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) )
            	    {
            	    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleFunctionCallExpression8652); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallExpressionAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3763:1: ( (lv_arguments_5_0= ruleExpression ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3764:1: (lv_arguments_5_0= ruleExpression )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3764:1: (lv_arguments_5_0= ruleExpression )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3765:3: lv_arguments_5_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionCallExpressionAccess().getArgumentsExpressionParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleFunctionCallExpression8673);
            	    lv_arguments_5_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFunctionCallExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"arguments",
            	              		lv_arguments_5_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            otherlv_6=(Token)match(input,70,FOLLOW_70_in_ruleFunctionCallExpression8687); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getFunctionCallExpressionAccess().getRightParenthesisKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCallExpression"


    // $ANTLR start "entryRuleBuiltInFunction"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3793:1: entryRuleBuiltInFunction returns [String current=null] : iv_ruleBuiltInFunction= ruleBuiltInFunction EOF ;
    public final String entryRuleBuiltInFunction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBuiltInFunction = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3794:2: (iv_ruleBuiltInFunction= ruleBuiltInFunction EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3795:2: iv_ruleBuiltInFunction= ruleBuiltInFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuiltInFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleBuiltInFunction_in_entryRuleBuiltInFunction8724);
            iv_ruleBuiltInFunction=ruleBuiltInFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuiltInFunction.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltInFunction8735); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBuiltInFunction"


    // $ANTLR start "ruleBuiltInFunction"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3802:1: ruleBuiltInFunction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Math.abs' | kw= 'Math.acos' | kw= 'Math.acosh' | kw= 'Math.asin' | kw= 'Math.asinh' | kw= 'Math.atan' | kw= 'Math.atanh' | kw= 'Math.atan2' | kw= 'Math.ceil' | kw= 'Math.clip' | kw= 'Math.cos' | kw= 'Math.cosh' | kw= 'Math.exp' | kw= 'Math.floor' | kw= 'Math.fround' | kw= 'Math.hypot' | kw= 'Math.log' | kw= 'Math.log10' | kw= 'Math.log2' | kw= 'Math.max' | kw= 'Math.min' | kw= 'Math.pow' | kw= 'Math.random' | kw= 'Math.round' | kw= 'Math.sign' | kw= 'Math.sin' | kw= 'Math.sinh' | kw= 'Math.sqrt' | kw= 'Math.tan' | kw= 'Math.tanh' | kw= 'Math.trunc' | kw= 'Set.orderby' | kw= 'Set.add' | kw= 'Set.find' | kw= 'Set.change' | kw= 'Set.remove' ) ;
    public final AntlrDatatypeRuleToken ruleBuiltInFunction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3805:28: ( (kw= 'Math.abs' | kw= 'Math.acos' | kw= 'Math.acosh' | kw= 'Math.asin' | kw= 'Math.asinh' | kw= 'Math.atan' | kw= 'Math.atanh' | kw= 'Math.atan2' | kw= 'Math.ceil' | kw= 'Math.clip' | kw= 'Math.cos' | kw= 'Math.cosh' | kw= 'Math.exp' | kw= 'Math.floor' | kw= 'Math.fround' | kw= 'Math.hypot' | kw= 'Math.log' | kw= 'Math.log10' | kw= 'Math.log2' | kw= 'Math.max' | kw= 'Math.min' | kw= 'Math.pow' | kw= 'Math.random' | kw= 'Math.round' | kw= 'Math.sign' | kw= 'Math.sin' | kw= 'Math.sinh' | kw= 'Math.sqrt' | kw= 'Math.tan' | kw= 'Math.tanh' | kw= 'Math.trunc' | kw= 'Set.orderby' | kw= 'Set.add' | kw= 'Set.find' | kw= 'Set.change' | kw= 'Set.remove' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3806:1: (kw= 'Math.abs' | kw= 'Math.acos' | kw= 'Math.acosh' | kw= 'Math.asin' | kw= 'Math.asinh' | kw= 'Math.atan' | kw= 'Math.atanh' | kw= 'Math.atan2' | kw= 'Math.ceil' | kw= 'Math.clip' | kw= 'Math.cos' | kw= 'Math.cosh' | kw= 'Math.exp' | kw= 'Math.floor' | kw= 'Math.fround' | kw= 'Math.hypot' | kw= 'Math.log' | kw= 'Math.log10' | kw= 'Math.log2' | kw= 'Math.max' | kw= 'Math.min' | kw= 'Math.pow' | kw= 'Math.random' | kw= 'Math.round' | kw= 'Math.sign' | kw= 'Math.sin' | kw= 'Math.sinh' | kw= 'Math.sqrt' | kw= 'Math.tan' | kw= 'Math.tanh' | kw= 'Math.trunc' | kw= 'Set.orderby' | kw= 'Set.add' | kw= 'Set.find' | kw= 'Set.change' | kw= 'Set.remove' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3806:1: (kw= 'Math.abs' | kw= 'Math.acos' | kw= 'Math.acosh' | kw= 'Math.asin' | kw= 'Math.asinh' | kw= 'Math.atan' | kw= 'Math.atanh' | kw= 'Math.atan2' | kw= 'Math.ceil' | kw= 'Math.clip' | kw= 'Math.cos' | kw= 'Math.cosh' | kw= 'Math.exp' | kw= 'Math.floor' | kw= 'Math.fround' | kw= 'Math.hypot' | kw= 'Math.log' | kw= 'Math.log10' | kw= 'Math.log2' | kw= 'Math.max' | kw= 'Math.min' | kw= 'Math.pow' | kw= 'Math.random' | kw= 'Math.round' | kw= 'Math.sign' | kw= 'Math.sin' | kw= 'Math.sinh' | kw= 'Math.sqrt' | kw= 'Math.tan' | kw= 'Math.tanh' | kw= 'Math.trunc' | kw= 'Set.orderby' | kw= 'Set.add' | kw= 'Set.find' | kw= 'Set.change' | kw= 'Set.remove' )
            int alt54=36;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt54=1;
                }
                break;
            case 78:
                {
                alt54=2;
                }
                break;
            case 79:
                {
                alt54=3;
                }
                break;
            case 80:
                {
                alt54=4;
                }
                break;
            case 81:
                {
                alt54=5;
                }
                break;
            case 82:
                {
                alt54=6;
                }
                break;
            case 83:
                {
                alt54=7;
                }
                break;
            case 84:
                {
                alt54=8;
                }
                break;
            case 85:
                {
                alt54=9;
                }
                break;
            case 86:
                {
                alt54=10;
                }
                break;
            case 87:
                {
                alt54=11;
                }
                break;
            case 88:
                {
                alt54=12;
                }
                break;
            case 89:
                {
                alt54=13;
                }
                break;
            case 90:
                {
                alt54=14;
                }
                break;
            case 91:
                {
                alt54=15;
                }
                break;
            case 92:
                {
                alt54=16;
                }
                break;
            case 93:
                {
                alt54=17;
                }
                break;
            case 94:
                {
                alt54=18;
                }
                break;
            case 95:
                {
                alt54=19;
                }
                break;
            case 96:
                {
                alt54=20;
                }
                break;
            case 97:
                {
                alt54=21;
                }
                break;
            case 98:
                {
                alt54=22;
                }
                break;
            case 99:
                {
                alt54=23;
                }
                break;
            case 100:
                {
                alt54=24;
                }
                break;
            case 101:
                {
                alt54=25;
                }
                break;
            case 102:
                {
                alt54=26;
                }
                break;
            case 103:
                {
                alt54=27;
                }
                break;
            case 104:
                {
                alt54=28;
                }
                break;
            case 105:
                {
                alt54=29;
                }
                break;
            case 106:
                {
                alt54=30;
                }
                break;
            case 107:
                {
                alt54=31;
                }
                break;
            case 108:
                {
                alt54=32;
                }
                break;
            case 109:
                {
                alt54=33;
                }
                break;
            case 110:
                {
                alt54=34;
                }
                break;
            case 111:
                {
                alt54=35;
                }
                break;
            case 112:
                {
                alt54=36;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3807:2: kw= 'Math.abs'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleBuiltInFunction8773); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathAbsKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3814:2: kw= 'Math.acos'
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_ruleBuiltInFunction8792); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathAcosKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3821:2: kw= 'Math.acosh'
                    {
                    kw=(Token)match(input,79,FOLLOW_79_in_ruleBuiltInFunction8811); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathAcoshKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3828:2: kw= 'Math.asin'
                    {
                    kw=(Token)match(input,80,FOLLOW_80_in_ruleBuiltInFunction8830); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathAsinKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3835:2: kw= 'Math.asinh'
                    {
                    kw=(Token)match(input,81,FOLLOW_81_in_ruleBuiltInFunction8849); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathAsinhKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3842:2: kw= 'Math.atan'
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleBuiltInFunction8868); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathAtanKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3849:2: kw= 'Math.atanh'
                    {
                    kw=(Token)match(input,83,FOLLOW_83_in_ruleBuiltInFunction8887); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathAtanhKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3856:2: kw= 'Math.atan2'
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleBuiltInFunction8906); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathAtan2Keyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3863:2: kw= 'Math.ceil'
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruleBuiltInFunction8925); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathCeilKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3870:2: kw= 'Math.clip'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleBuiltInFunction8944); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathClipKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3877:2: kw= 'Math.cos'
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleBuiltInFunction8963); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathCosKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3884:2: kw= 'Math.cosh'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleBuiltInFunction8982); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathCoshKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3891:2: kw= 'Math.exp'
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_ruleBuiltInFunction9001); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathExpKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3898:2: kw= 'Math.floor'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleBuiltInFunction9020); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathFloorKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3905:2: kw= 'Math.fround'
                    {
                    kw=(Token)match(input,91,FOLLOW_91_in_ruleBuiltInFunction9039); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathFroundKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3912:2: kw= 'Math.hypot'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleBuiltInFunction9058); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathHypotKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3919:2: kw= 'Math.log'
                    {
                    kw=(Token)match(input,93,FOLLOW_93_in_ruleBuiltInFunction9077); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathLogKeyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3926:2: kw= 'Math.log10'
                    {
                    kw=(Token)match(input,94,FOLLOW_94_in_ruleBuiltInFunction9096); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathLog10Keyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3933:2: kw= 'Math.log2'
                    {
                    kw=(Token)match(input,95,FOLLOW_95_in_ruleBuiltInFunction9115); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathLog2Keyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3940:2: kw= 'Math.max'
                    {
                    kw=(Token)match(input,96,FOLLOW_96_in_ruleBuiltInFunction9134); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathMaxKeyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3947:2: kw= 'Math.min'
                    {
                    kw=(Token)match(input,97,FOLLOW_97_in_ruleBuiltInFunction9153); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathMinKeyword_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3954:2: kw= 'Math.pow'
                    {
                    kw=(Token)match(input,98,FOLLOW_98_in_ruleBuiltInFunction9172); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathPowKeyword_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3961:2: kw= 'Math.random'
                    {
                    kw=(Token)match(input,99,FOLLOW_99_in_ruleBuiltInFunction9191); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathRandomKeyword_22()); 
                          
                    }

                    }
                    break;
                case 24 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3968:2: kw= 'Math.round'
                    {
                    kw=(Token)match(input,100,FOLLOW_100_in_ruleBuiltInFunction9210); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathRoundKeyword_23()); 
                          
                    }

                    }
                    break;
                case 25 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3975:2: kw= 'Math.sign'
                    {
                    kw=(Token)match(input,101,FOLLOW_101_in_ruleBuiltInFunction9229); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathSignKeyword_24()); 
                          
                    }

                    }
                    break;
                case 26 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3982:2: kw= 'Math.sin'
                    {
                    kw=(Token)match(input,102,FOLLOW_102_in_ruleBuiltInFunction9248); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathSinKeyword_25()); 
                          
                    }

                    }
                    break;
                case 27 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3989:2: kw= 'Math.sinh'
                    {
                    kw=(Token)match(input,103,FOLLOW_103_in_ruleBuiltInFunction9267); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathSinhKeyword_26()); 
                          
                    }

                    }
                    break;
                case 28 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3996:2: kw= 'Math.sqrt'
                    {
                    kw=(Token)match(input,104,FOLLOW_104_in_ruleBuiltInFunction9286); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathSqrtKeyword_27()); 
                          
                    }

                    }
                    break;
                case 29 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4003:2: kw= 'Math.tan'
                    {
                    kw=(Token)match(input,105,FOLLOW_105_in_ruleBuiltInFunction9305); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathTanKeyword_28()); 
                          
                    }

                    }
                    break;
                case 30 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4010:2: kw= 'Math.tanh'
                    {
                    kw=(Token)match(input,106,FOLLOW_106_in_ruleBuiltInFunction9324); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathTanhKeyword_29()); 
                          
                    }

                    }
                    break;
                case 31 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4017:2: kw= 'Math.trunc'
                    {
                    kw=(Token)match(input,107,FOLLOW_107_in_ruleBuiltInFunction9343); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getMathTruncKeyword_30()); 
                          
                    }

                    }
                    break;
                case 32 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4024:2: kw= 'Set.orderby'
                    {
                    kw=(Token)match(input,108,FOLLOW_108_in_ruleBuiltInFunction9362); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getSetOrderbyKeyword_31()); 
                          
                    }

                    }
                    break;
                case 33 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4031:2: kw= 'Set.add'
                    {
                    kw=(Token)match(input,109,FOLLOW_109_in_ruleBuiltInFunction9381); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getSetAddKeyword_32()); 
                          
                    }

                    }
                    break;
                case 34 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4038:2: kw= 'Set.find'
                    {
                    kw=(Token)match(input,110,FOLLOW_110_in_ruleBuiltInFunction9400); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getSetFindKeyword_33()); 
                          
                    }

                    }
                    break;
                case 35 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4045:2: kw= 'Set.change'
                    {
                    kw=(Token)match(input,111,FOLLOW_111_in_ruleBuiltInFunction9419); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getSetChangeKeyword_34()); 
                          
                    }

                    }
                    break;
                case 36 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4052:2: kw= 'Set.remove'
                    {
                    kw=(Token)match(input,112,FOLLOW_112_in_ruleBuiltInFunction9438); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBuiltInFunctionAccess().getSetRemoveKeyword_35()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBuiltInFunction"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4065:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4066:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4067:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral9478);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral9488); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4074:1: ruleBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4077:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4078:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4078:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4078:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4078:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4079:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4084:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==113) ) {
                alt55=1;
            }
            else if ( (LA55_0==114) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4084:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,113,FOLLOW_113_in_ruleBooleanLiteral9535); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4089:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4089:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4090:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4090:1: (lv_isTrue_2_0= 'true' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4091:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,114,FOLLOW_114_in_ruleBooleanLiteral9559); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleNullLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4112:1: entryRuleNullLiteral returns [EObject current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final EObject entryRuleNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteral = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4113:2: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4114:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral9609);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral9619); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNullLiteral"


    // $ANTLR start "ruleNullLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4121:1: ruleNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4124:28: ( ( () otherlv_1= 'null' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4125:1: ( () otherlv_1= 'null' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4125:1: ( () otherlv_1= 'null' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4125:2: () otherlv_1= 'null'
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4125:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4126:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNullLiteralAccess().getNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,115,FOLLOW_115_in_ruleNullLiteral9665); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNullLiteralAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNullLiteral"


    // $ANTLR start "entryRuleNumberLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4143:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4144:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4145:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral9701);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral9711); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4152:1: ruleNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNUMBER ) ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4155:28: ( ( () ( (lv_value_1_0= ruleNUMBER ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4156:1: ( () ( (lv_value_1_0= ruleNUMBER ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4156:1: ( () ( (lv_value_1_0= ruleNUMBER ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4156:2: () ( (lv_value_1_0= ruleNUMBER ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4156:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4157:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNumberLiteralAccess().getNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4162:2: ( (lv_value_1_0= ruleNUMBER ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4163:1: (lv_value_1_0= ruleNUMBER )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4163:1: (lv_value_1_0= ruleNUMBER )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4164:3: lv_value_1_0= ruleNUMBER
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNUMBERParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNUMBER_in_ruleNumberLiteral9766);
            lv_value_1_0=ruleNUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumberLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"NUMBER");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4188:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4189:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4190:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9802);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral9812); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4197:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4200:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4201:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4201:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4201:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4201:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4202:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4207:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4208:1: (lv_value_1_0= RULE_STRING )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4208:1: (lv_value_1_0= RULE_STRING )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4209:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral9863); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleEnumElement"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4233:1: entryRuleEnumElement returns [EObject current=null] : iv_ruleEnumElement= ruleEnumElement EOF ;
    public final EObject entryRuleEnumElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumElement = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4234:2: (iv_ruleEnumElement= ruleEnumElement EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4235:2: iv_ruleEnumElement= ruleEnumElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumElementRule()); 
            }
            pushFollow(FOLLOW_ruleEnumElement_in_entryRuleEnumElement9904);
            iv_ruleEnumElement=ruleEnumElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumElement9914); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumElement"


    // $ANTLR start "ruleEnumElement"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4242:1: ruleEnumElement returns [EObject current=null] : ( () otherlv_1= '#' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4245:28: ( ( () otherlv_1= '#' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4246:1: ( () otherlv_1= '#' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4246:1: ( () otherlv_1= '#' ( (lv_name_2_0= RULE_ID ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4246:2: () otherlv_1= '#' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4246:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4247:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEnumElementAccess().getEnumLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleEnumElement9960); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEnumElementAccess().getNumberSignKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4256:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4257:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4257:1: (lv_name_2_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4258:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumElement9977); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getEnumElementAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumElementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumElement"


    // $ANTLR start "entryRuleTimeLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4282:1: entryRuleTimeLiteral returns [EObject current=null] : iv_ruleTimeLiteral= ruleTimeLiteral EOF ;
    public final EObject entryRuleTimeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeLiteral = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4283:2: (iv_ruleTimeLiteral= ruleTimeLiteral EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4284:2: iv_ruleTimeLiteral= ruleTimeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleTimeLiteral_in_entryRuleTimeLiteral10018);
            iv_ruleTimeLiteral=ruleTimeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeLiteral10028); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeLiteral"


    // $ANTLR start "ruleTimeLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4291:1: ruleTimeLiteral returns [EObject current=null] : ( ( () otherlv_1= 'now' ) | ( () ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' ) ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )? ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )? ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )? ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )? ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )? ) | ( () ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' ) ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )? ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )? ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )? ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )? ) | ( () ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' ) ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )? ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )? ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )? ) | ( () ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' ) ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )? ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )? ) | ( () ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) ) ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )? ) | ( () ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) ) ) ) ;
    public final EObject ruleTimeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_52=null;
        Token otherlv_53=null;
        Token otherlv_55=null;
        Token otherlv_56=null;
        Token otherlv_59=null;
        Token otherlv_60=null;
        AntlrDatatypeRuleToken lv_year_3_0 = null;

        AntlrDatatypeRuleToken lv_month_5_0 = null;

        AntlrDatatypeRuleToken lv_day_7_0 = null;

        AntlrDatatypeRuleToken lv_hour_9_0 = null;

        AntlrDatatypeRuleToken lv_minute_11_0 = null;

        AntlrDatatypeRuleToken lv_second_14_0 = null;

        AntlrDatatypeRuleToken lv_month_18_0 = null;

        AntlrDatatypeRuleToken lv_day_20_0 = null;

        AntlrDatatypeRuleToken lv_hour_22_0 = null;

        AntlrDatatypeRuleToken lv_minute_24_0 = null;

        AntlrDatatypeRuleToken lv_second_27_0 = null;

        AntlrDatatypeRuleToken lv_day_31_0 = null;

        AntlrDatatypeRuleToken lv_hour_33_0 = null;

        AntlrDatatypeRuleToken lv_minute_35_0 = null;

        AntlrDatatypeRuleToken lv_second_38_0 = null;

        AntlrDatatypeRuleToken lv_hour_42_0 = null;

        AntlrDatatypeRuleToken lv_minute_44_0 = null;

        AntlrDatatypeRuleToken lv_second_47_0 = null;

        AntlrDatatypeRuleToken lv_minute_51_0 = null;

        AntlrDatatypeRuleToken lv_second_54_0 = null;

        AntlrDatatypeRuleToken lv_second_58_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4294:28: ( ( ( () otherlv_1= 'now' ) | ( () ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' ) ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )? ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )? ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )? ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )? ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )? ) | ( () ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' ) ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )? ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )? ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )? ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )? ) | ( () ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' ) ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )? ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )? ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )? ) | ( () ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' ) ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )? ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )? ) | ( () ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) ) ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )? ) | ( () ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4295:1: ( ( () otherlv_1= 'now' ) | ( () ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' ) ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )? ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )? ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )? ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )? ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )? ) | ( () ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' ) ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )? ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )? ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )? ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )? ) | ( () ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' ) ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )? ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )? ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )? ) | ( () ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' ) ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )? ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )? ) | ( () ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) ) ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )? ) | ( () ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4295:1: ( ( () otherlv_1= 'now' ) | ( () ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' ) ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )? ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )? ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )? ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )? ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )? ) | ( () ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' ) ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )? ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )? ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )? ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )? ) | ( () ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' ) ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )? ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )? ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )? ) | ( () ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' ) ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )? ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )? ) | ( () ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) ) ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )? ) | ( () ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) ) ) )
            int alt82=7;
            alt82 = dfa82.predict(input);
            switch (alt82) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4295:2: ( () otherlv_1= 'now' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4295:2: ( () otherlv_1= 'now' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4295:3: () otherlv_1= 'now'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4295:3: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4296:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTimeLiteralAccess().getTimeLiteralNowAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,116,FOLLOW_116_in_ruleTimeLiteral10075); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTimeLiteralAccess().getNowKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4306:6: ( () ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' ) ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )? ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )? ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )? ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )? ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4306:6: ( () ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' ) ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )? ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )? ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )? ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )? ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4306:7: () ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' ) ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )? ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )? ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )? ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )? ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4306:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4307:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTimeLiteralAccess().getTimeLiteralAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4312:2: ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4312:3: ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4312:3: ( (lv_year_3_0= ruleNUMBER ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4313:1: (lv_year_3_0= ruleNUMBER )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4313:1: (lv_year_3_0= ruleNUMBER )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4314:3: lv_year_3_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTimeLiteralAccess().getYearNUMBERParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleTimeLiteral10114);
                    lv_year_3_0=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTimeLiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"year",
                              		lv_year_3_0, 
                              		"NUMBER");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,117,FOLLOW_117_in_ruleTimeLiteral10126); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTimeLiteralAccess().getYearKeyword_1_1_1());
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4334:2: ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==RULE_INT) ) {
                        int LA56_1 = input.LA(2);

                        if ( (LA56_1==125) ) {
                            int LA56_3 = input.LA(3);

                            if ( (LA56_3==RULE_INT) ) {
                                int LA56_5 = input.LA(4);

                                if ( (LA56_5==118) ) {
                                    alt56=1;
                                }
                            }
                        }
                        else if ( (LA56_1==118) ) {
                            alt56=1;
                        }
                    }
                    switch (alt56) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4334:3: ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month'
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4334:3: ( (lv_month_5_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4335:1: (lv_month_5_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4335:1: (lv_month_5_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4336:3: lv_month_5_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTimeLiteralAccess().getMonthNUMBERParserRuleCall_1_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleTimeLiteral10149);
                            lv_month_5_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTimeLiteralRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"month",
                                      		lv_month_5_0, 
                                      		"NUMBER");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_6=(Token)match(input,118,FOLLOW_118_in_ruleTimeLiteral10161); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getTimeLiteralAccess().getMonthKeyword_1_2_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4356:3: ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==RULE_INT) ) {
                        int LA57_1 = input.LA(2);

                        if ( (LA57_1==125) ) {
                            int LA57_3 = input.LA(3);

                            if ( (LA57_3==RULE_INT) ) {
                                int LA57_5 = input.LA(4);

                                if ( (LA57_5==119) ) {
                                    alt57=1;
                                }
                            }
                        }
                        else if ( (LA57_1==119) ) {
                            alt57=1;
                        }
                    }
                    switch (alt57) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4356:4: ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day'
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4356:4: ( (lv_day_7_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4357:1: (lv_day_7_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4357:1: (lv_day_7_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4358:3: lv_day_7_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTimeLiteralAccess().getDayNUMBERParserRuleCall_1_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleTimeLiteral10185);
                            lv_day_7_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTimeLiteralRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"day",
                                      		lv_day_7_0, 
                                      		"NUMBER");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_8=(Token)match(input,119,FOLLOW_119_in_ruleTimeLiteral10197); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getTimeLiteralAccess().getDayKeyword_1_3_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4378:3: ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==RULE_INT) ) {
                        int LA58_1 = input.LA(2);

                        if ( (LA58_1==125) ) {
                            int LA58_3 = input.LA(3);

                            if ( (LA58_3==RULE_INT) ) {
                                int LA58_5 = input.LA(4);

                                if ( (LA58_5==120) ) {
                                    alt58=1;
                                }
                            }
                        }
                        else if ( (LA58_1==120) ) {
                            alt58=1;
                        }
                    }
                    switch (alt58) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4378:4: ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour'
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4378:4: ( (lv_hour_9_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4379:1: (lv_hour_9_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4379:1: (lv_hour_9_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4380:3: lv_hour_9_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTimeLiteralAccess().getHourNUMBERParserRuleCall_1_4_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleTimeLiteral10221);
                            lv_hour_9_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTimeLiteralRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"hour",
                                      		lv_hour_9_0, 
                                      		"NUMBER");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_10=(Token)match(input,120,FOLLOW_120_in_ruleTimeLiteral10233); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_10, grammarAccess.getTimeLiteralAccess().getHourKeyword_1_4_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4400:3: ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==RULE_INT) ) {
                        int LA60_1 = input.LA(2);

                        if ( (LA60_1==125) ) {
                            int LA60_3 = input.LA(3);

                            if ( (LA60_3==RULE_INT) ) {
                                int LA60_5 = input.LA(4);

                                if ( ((LA60_5>=121 && LA60_5<=122)) ) {
                                    alt60=1;
                                }
                            }
                        }
                        else if ( ((LA60_1>=121 && LA60_1<=122)) ) {
                            alt60=1;
                        }
                    }
                    switch (alt60) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4400:4: ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4400:4: ( (lv_minute_11_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4401:1: (lv_minute_11_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4401:1: (lv_minute_11_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4402:3: lv_minute_11_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTimeLiteralAccess().getMinuteNUMBERParserRuleCall_1_5_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleTimeLiteral10257);
                            lv_minute_11_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTimeLiteralRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"minute",
                                      		lv_minute_11_0, 
                                      		"NUMBER");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4418:2: (otherlv_12= 'm' | otherlv_13= 'minute' )
                            int alt59=2;
                            int LA59_0 = input.LA(1);

                            if ( (LA59_0==121) ) {
                                alt59=1;
                            }
                            else if ( (LA59_0==122) ) {
                                alt59=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 59, 0, input);

                                throw nvae;
                            }
                            switch (alt59) {
                                case 1 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4418:4: otherlv_12= 'm'
                                    {
                                    otherlv_12=(Token)match(input,121,FOLLOW_121_in_ruleTimeLiteral10270); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_12, grammarAccess.getTimeLiteralAccess().getMKeyword_1_5_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4423:7: otherlv_13= 'minute'
                                    {
                                    otherlv_13=(Token)match(input,122,FOLLOW_122_in_ruleTimeLiteral10288); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_13, grammarAccess.getTimeLiteralAccess().getMinuteKeyword_1_5_1_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4427:4: ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==RULE_INT) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4427:5: ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4427:5: ( (lv_second_14_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4428:1: (lv_second_14_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4428:1: (lv_second_14_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4429:3: lv_second_14_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTimeLiteralAccess().getSecondNUMBERParserRuleCall_1_6_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleTimeLiteral10313);
                            lv_second_14_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTimeLiteralRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"second",
                                      		lv_second_14_0, 
                                      		"NUMBER");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4445:2: (otherlv_15= 's' | otherlv_16= 'second' )
                            int alt61=2;
                            int LA61_0 = input.LA(1);

                            if ( (LA61_0==123) ) {
                                alt61=1;
                            }
                            else if ( (LA61_0==124) ) {
                                alt61=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 61, 0, input);

                                throw nvae;
                            }
                            switch (alt61) {
                                case 1 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4445:4: otherlv_15= 's'
                                    {
                                    otherlv_15=(Token)match(input,123,FOLLOW_123_in_ruleTimeLiteral10326); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_15, grammarAccess.getTimeLiteralAccess().getSKeyword_1_6_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4450:7: otherlv_16= 'second'
                                    {
                                    otherlv_16=(Token)match(input,124,FOLLOW_124_in_ruleTimeLiteral10344); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_16, grammarAccess.getTimeLiteralAccess().getSecondKeyword_1_6_1_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4455:6: ( () ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' ) ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )? ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )? ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )? ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4455:6: ( () ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' ) ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )? ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )? ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )? ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4455:7: () ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' ) ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )? ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )? ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )? ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4455:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4456:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTimeLiteralAccess().getTimeLiteralAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4461:2: ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4461:3: ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4461:3: ( (lv_month_18_0= ruleNUMBER ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4462:1: (lv_month_18_0= ruleNUMBER )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4462:1: (lv_month_18_0= ruleNUMBER )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4463:3: lv_month_18_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTimeLiteralAccess().getMonthNUMBERParserRuleCall_2_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleTimeLiteral10386);
                    lv_month_18_0=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTimeLiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"month",
                              		lv_month_18_0, 
                              		"NUMBER");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_19=(Token)match(input,118,FOLLOW_118_in_ruleTimeLiteral10398); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getTimeLiteralAccess().getMonthKeyword_2_1_1());
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4483:2: ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==RULE_INT) ) {
                        int LA63_1 = input.LA(2);

                        if ( (LA63_1==125) ) {
                            int LA63_3 = input.LA(3);

                            if ( (LA63_3==RULE_INT) ) {
                                int LA63_5 = input.LA(4);

                                if ( (LA63_5==119) ) {
                                    alt63=1;
                                }
                            }
                        }
                        else if ( (LA63_1==119) ) {
                            alt63=1;
                        }
                    }
                    switch (alt63) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4483:3: ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day'
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4483:3: ( (lv_day_20_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4484:1: (lv_day_20_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4484:1: (lv_day_20_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4485:3: lv_day_20_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTimeLiteralAccess().getDayNUMBERParserRuleCall_2_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleTimeLiteral10421);
                            lv_day_20_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTimeLiteralRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"day",
                                      		lv_day_20_0, 
                                      		"NUMBER");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_21=(Token)match(input,119,FOLLOW_119_in_ruleTimeLiteral10433); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_21, grammarAccess.getTimeLiteralAccess().getDayKeyword_2_2_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4505:3: ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==RULE_INT) ) {
                        int LA64_1 = input.LA(2);

                        if ( (LA64_1==125) ) {
                            int LA64_3 = input.LA(3);

                            if ( (LA64_3==RULE_INT) ) {
                                int LA64_5 = input.LA(4);

                                if ( (LA64_5==120) ) {
                                    alt64=1;
                                }
                            }
                        }
                        else if ( (LA64_1==120) ) {
                            alt64=1;
                        }
                    }
                    switch (alt64) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4505:4: ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour'
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4505:4: ( (lv_hour_22_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4506:1: (lv_hour_22_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4506:1: (lv_hour_22_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4507:3: lv_hour_22_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTimeLiteralAccess().getHourNUMBERParserRuleCall_2_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleTimeLiteral10457);
                            lv_hour_22_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTimeLiteralRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"hour",
                                      		lv_hour_22_0, 
                                      		"NUMBER");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_23=(Token)match(input,120,FOLLOW_120_in_ruleTimeLiteral10469); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_23, grammarAccess.getTimeLiteralAccess().getHourKeyword_2_3_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4527:3: ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==RULE_INT) ) {
                        int LA66_1 = input.LA(2);

                        if ( (LA66_1==125) ) {
                            int LA66_3 = input.LA(3);

                            if ( (LA66_3==RULE_INT) ) {
                                int LA66_5 = input.LA(4);

                                if ( ((LA66_5>=121 && LA66_5<=122)) ) {
                                    alt66=1;
                                }
                            }
                        }
                        else if ( ((LA66_1>=121 && LA66_1<=122)) ) {
                            alt66=1;
                        }
                    }
                    switch (alt66) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4527:4: ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4527:4: ( (lv_minute_24_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4528:1: (lv_minute_24_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4528:1: (lv_minute_24_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4529:3: lv_minute_24_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTimeLiteralAccess().getMinuteNUMBERParserRuleCall_2_4_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleTimeLiteral10493);
                            lv_minute_24_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTimeLiteralRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"minute",
                                      		lv_minute_24_0, 
                                      		"NUMBER");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4545:2: (otherlv_25= 'm' | otherlv_26= 'minute' )
                            int alt65=2;
                            int LA65_0 = input.LA(1);

                            if ( (LA65_0==121) ) {
                                alt65=1;
                            }
                            else if ( (LA65_0==122) ) {
                                alt65=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 65, 0, input);

                                throw nvae;
                            }
                            switch (alt65) {
                                case 1 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4545:4: otherlv_25= 'm'
                                    {
                                    otherlv_25=(Token)match(input,121,FOLLOW_121_in_ruleTimeLiteral10506); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_25, grammarAccess.getTimeLiteralAccess().getMKeyword_2_4_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4550:7: otherlv_26= 'minute'
                                    {
                                    otherlv_26=(Token)match(input,122,FOLLOW_122_in_ruleTimeLiteral10524); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_26, grammarAccess.getTimeLiteralAccess().getMinuteKeyword_2_4_1_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4554:4: ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==RULE_INT) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4554:5: ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4554:5: ( (lv_second_27_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4555:1: (lv_second_27_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4555:1: (lv_second_27_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4556:3: lv_second_27_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTimeLiteralAccess().getSecondNUMBERParserRuleCall_2_5_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleTimeLiteral10549);
                            lv_second_27_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTimeLiteralRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"second",
                                      		lv_second_27_0, 
                                      		"NUMBER");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4572:2: (otherlv_28= 's' | otherlv_29= 'second' )
                            int alt67=2;
                            int LA67_0 = input.LA(1);

                            if ( (LA67_0==123) ) {
                                alt67=1;
                            }
                            else if ( (LA67_0==124) ) {
                                alt67=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 67, 0, input);

                                throw nvae;
                            }
                            switch (alt67) {
                                case 1 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4572:4: otherlv_28= 's'
                                    {
                                    otherlv_28=(Token)match(input,123,FOLLOW_123_in_ruleTimeLiteral10562); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_28, grammarAccess.getTimeLiteralAccess().getSKeyword_2_5_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4577:7: otherlv_29= 'second'
                                    {
                                    otherlv_29=(Token)match(input,124,FOLLOW_124_in_ruleTimeLiteral10580); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_29, grammarAccess.getTimeLiteralAccess().getSecondKeyword_2_5_1_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4582:6: ( () ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' ) ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )? ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )? ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4582:6: ( () ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' ) ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )? ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )? ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4582:7: () ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' ) ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )? ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )? ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4582:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4583:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTimeLiteralAccess().getTimeLiteralAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4588:2: ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4588:3: ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4588:3: ( (lv_day_31_0= ruleNUMBER ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4589:1: (lv_day_31_0= ruleNUMBER )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4589:1: (lv_day_31_0= ruleNUMBER )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4590:3: lv_day_31_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTimeLiteralAccess().getDayNUMBERParserRuleCall_3_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleTimeLiteral10622);
                    lv_day_31_0=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTimeLiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"day",
                              		lv_day_31_0, 
                              		"NUMBER");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_32=(Token)match(input,119,FOLLOW_119_in_ruleTimeLiteral10634); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getTimeLiteralAccess().getDayKeyword_3_1_1());
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4610:2: ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==RULE_INT) ) {
                        int LA69_1 = input.LA(2);

                        if ( (LA69_1==125) ) {
                            int LA69_3 = input.LA(3);

                            if ( (LA69_3==RULE_INT) ) {
                                int LA69_5 = input.LA(4);

                                if ( (LA69_5==120) ) {
                                    alt69=1;
                                }
                            }
                        }
                        else if ( (LA69_1==120) ) {
                            alt69=1;
                        }
                    }
                    switch (alt69) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4610:3: ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour'
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4610:3: ( (lv_hour_33_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4611:1: (lv_hour_33_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4611:1: (lv_hour_33_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4612:3: lv_hour_33_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTimeLiteralAccess().getHourNUMBERParserRuleCall_3_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleTimeLiteral10657);
                            lv_hour_33_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTimeLiteralRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"hour",
                                      		lv_hour_33_0, 
                                      		"NUMBER");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_34=(Token)match(input,120,FOLLOW_120_in_ruleTimeLiteral10669); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_34, grammarAccess.getTimeLiteralAccess().getHourKeyword_3_2_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4632:3: ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==RULE_INT) ) {
                        int LA71_1 = input.LA(2);

                        if ( (LA71_1==125) ) {
                            int LA71_3 = input.LA(3);

                            if ( (LA71_3==RULE_INT) ) {
                                int LA71_5 = input.LA(4);

                                if ( ((LA71_5>=121 && LA71_5<=122)) ) {
                                    alt71=1;
                                }
                            }
                        }
                        else if ( ((LA71_1>=121 && LA71_1<=122)) ) {
                            alt71=1;
                        }
                    }
                    switch (alt71) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4632:4: ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4632:4: ( (lv_minute_35_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4633:1: (lv_minute_35_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4633:1: (lv_minute_35_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4634:3: lv_minute_35_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTimeLiteralAccess().getMinuteNUMBERParserRuleCall_3_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleTimeLiteral10693);
                            lv_minute_35_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTimeLiteralRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"minute",
                                      		lv_minute_35_0, 
                                      		"NUMBER");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4650:2: (otherlv_36= 'm' | otherlv_37= 'minute' )
                            int alt70=2;
                            int LA70_0 = input.LA(1);

                            if ( (LA70_0==121) ) {
                                alt70=1;
                            }
                            else if ( (LA70_0==122) ) {
                                alt70=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 70, 0, input);

                                throw nvae;
                            }
                            switch (alt70) {
                                case 1 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4650:4: otherlv_36= 'm'
                                    {
                                    otherlv_36=(Token)match(input,121,FOLLOW_121_in_ruleTimeLiteral10706); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_36, grammarAccess.getTimeLiteralAccess().getMKeyword_3_3_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4655:7: otherlv_37= 'minute'
                                    {
                                    otherlv_37=(Token)match(input,122,FOLLOW_122_in_ruleTimeLiteral10724); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_37, grammarAccess.getTimeLiteralAccess().getMinuteKeyword_3_3_1_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4659:4: ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==RULE_INT) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4659:5: ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4659:5: ( (lv_second_38_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4660:1: (lv_second_38_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4660:1: (lv_second_38_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4661:3: lv_second_38_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTimeLiteralAccess().getSecondNUMBERParserRuleCall_3_4_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleTimeLiteral10749);
                            lv_second_38_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTimeLiteralRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"second",
                                      		lv_second_38_0, 
                                      		"NUMBER");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4677:2: (otherlv_39= 's' | otherlv_40= 'second' )
                            int alt72=2;
                            int LA72_0 = input.LA(1);

                            if ( (LA72_0==123) ) {
                                alt72=1;
                            }
                            else if ( (LA72_0==124) ) {
                                alt72=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 72, 0, input);

                                throw nvae;
                            }
                            switch (alt72) {
                                case 1 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4677:4: otherlv_39= 's'
                                    {
                                    otherlv_39=(Token)match(input,123,FOLLOW_123_in_ruleTimeLiteral10762); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_39, grammarAccess.getTimeLiteralAccess().getSKeyword_3_4_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4682:7: otherlv_40= 'second'
                                    {
                                    otherlv_40=(Token)match(input,124,FOLLOW_124_in_ruleTimeLiteral10780); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_40, grammarAccess.getTimeLiteralAccess().getSecondKeyword_3_4_1_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4687:6: ( () ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' ) ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )? ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4687:6: ( () ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' ) ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )? ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4687:7: () ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' ) ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )? ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4687:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4688:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTimeLiteralAccess().getTimeLiteralAction_4_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4693:2: ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4693:3: ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4693:3: ( (lv_hour_42_0= ruleNUMBER ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4694:1: (lv_hour_42_0= ruleNUMBER )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4694:1: (lv_hour_42_0= ruleNUMBER )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4695:3: lv_hour_42_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTimeLiteralAccess().getHourNUMBERParserRuleCall_4_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleTimeLiteral10822);
                    lv_hour_42_0=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTimeLiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"hour",
                              		lv_hour_42_0, 
                              		"NUMBER");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_43=(Token)match(input,120,FOLLOW_120_in_ruleTimeLiteral10834); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_43, grammarAccess.getTimeLiteralAccess().getHourKeyword_4_1_1());
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4715:2: ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==RULE_INT) ) {
                        int LA75_1 = input.LA(2);

                        if ( (LA75_1==125) ) {
                            int LA75_3 = input.LA(3);

                            if ( (LA75_3==RULE_INT) ) {
                                int LA75_5 = input.LA(4);

                                if ( ((LA75_5>=121 && LA75_5<=122)) ) {
                                    alt75=1;
                                }
                            }
                        }
                        else if ( ((LA75_1>=121 && LA75_1<=122)) ) {
                            alt75=1;
                        }
                    }
                    switch (alt75) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4715:3: ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4715:3: ( (lv_minute_44_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4716:1: (lv_minute_44_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4716:1: (lv_minute_44_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4717:3: lv_minute_44_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTimeLiteralAccess().getMinuteNUMBERParserRuleCall_4_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleTimeLiteral10857);
                            lv_minute_44_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTimeLiteralRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"minute",
                                      		lv_minute_44_0, 
                                      		"NUMBER");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4733:2: (otherlv_45= 'm' | otherlv_46= 'minute' )
                            int alt74=2;
                            int LA74_0 = input.LA(1);

                            if ( (LA74_0==121) ) {
                                alt74=1;
                            }
                            else if ( (LA74_0==122) ) {
                                alt74=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 74, 0, input);

                                throw nvae;
                            }
                            switch (alt74) {
                                case 1 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4733:4: otherlv_45= 'm'
                                    {
                                    otherlv_45=(Token)match(input,121,FOLLOW_121_in_ruleTimeLiteral10870); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_45, grammarAccess.getTimeLiteralAccess().getMKeyword_4_2_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4738:7: otherlv_46= 'minute'
                                    {
                                    otherlv_46=(Token)match(input,122,FOLLOW_122_in_ruleTimeLiteral10888); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_46, grammarAccess.getTimeLiteralAccess().getMinuteKeyword_4_2_1_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4742:4: ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==RULE_INT) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4742:5: ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4742:5: ( (lv_second_47_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4743:1: (lv_second_47_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4743:1: (lv_second_47_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4744:3: lv_second_47_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTimeLiteralAccess().getSecondNUMBERParserRuleCall_4_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleTimeLiteral10913);
                            lv_second_47_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTimeLiteralRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"second",
                                      		lv_second_47_0, 
                                      		"NUMBER");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4760:2: (otherlv_48= 's' | otherlv_49= 'second' )
                            int alt76=2;
                            int LA76_0 = input.LA(1);

                            if ( (LA76_0==123) ) {
                                alt76=1;
                            }
                            else if ( (LA76_0==124) ) {
                                alt76=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 76, 0, input);

                                throw nvae;
                            }
                            switch (alt76) {
                                case 1 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4760:4: otherlv_48= 's'
                                    {
                                    otherlv_48=(Token)match(input,123,FOLLOW_123_in_ruleTimeLiteral10926); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_48, grammarAccess.getTimeLiteralAccess().getSKeyword_4_3_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4765:7: otherlv_49= 'second'
                                    {
                                    otherlv_49=(Token)match(input,124,FOLLOW_124_in_ruleTimeLiteral10944); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_49, grammarAccess.getTimeLiteralAccess().getSecondKeyword_4_3_1_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4770:6: ( () ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) ) ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4770:6: ( () ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) ) ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4770:7: () ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) ) ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4770:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4771:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTimeLiteralAccess().getTimeLiteralAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4776:2: ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4776:3: ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4776:3: ( (lv_minute_51_0= ruleNUMBER ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4777:1: (lv_minute_51_0= ruleNUMBER )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4777:1: (lv_minute_51_0= ruleNUMBER )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4778:3: lv_minute_51_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTimeLiteralAccess().getMinuteNUMBERParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleTimeLiteral10986);
                    lv_minute_51_0=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTimeLiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"minute",
                              		lv_minute_51_0, 
                              		"NUMBER");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4794:2: (otherlv_52= 'm' | otherlv_53= 'minute' )
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==121) ) {
                        alt78=1;
                    }
                    else if ( (LA78_0==122) ) {
                        alt78=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 78, 0, input);

                        throw nvae;
                    }
                    switch (alt78) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4794:4: otherlv_52= 'm'
                            {
                            otherlv_52=(Token)match(input,121,FOLLOW_121_in_ruleTimeLiteral10999); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_52, grammarAccess.getTimeLiteralAccess().getMKeyword_5_1_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4799:7: otherlv_53= 'minute'
                            {
                            otherlv_53=(Token)match(input,122,FOLLOW_122_in_ruleTimeLiteral11017); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_53, grammarAccess.getTimeLiteralAccess().getMinuteKeyword_5_1_1_1());
                                  
                            }

                            }
                            break;

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4803:3: ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==RULE_INT) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4803:4: ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4803:4: ( (lv_second_54_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4804:1: (lv_second_54_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4804:1: (lv_second_54_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4805:3: lv_second_54_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTimeLiteralAccess().getSecondNUMBERParserRuleCall_5_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleTimeLiteral11041);
                            lv_second_54_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTimeLiteralRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"second",
                                      		lv_second_54_0, 
                                      		"NUMBER");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4821:2: (otherlv_55= 's' | otherlv_56= 'second' )
                            int alt79=2;
                            int LA79_0 = input.LA(1);

                            if ( (LA79_0==123) ) {
                                alt79=1;
                            }
                            else if ( (LA79_0==124) ) {
                                alt79=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 79, 0, input);

                                throw nvae;
                            }
                            switch (alt79) {
                                case 1 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4821:4: otherlv_55= 's'
                                    {
                                    otherlv_55=(Token)match(input,123,FOLLOW_123_in_ruleTimeLiteral11054); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_55, grammarAccess.getTimeLiteralAccess().getSKeyword_5_2_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4826:7: otherlv_56= 'second'
                                    {
                                    otherlv_56=(Token)match(input,124,FOLLOW_124_in_ruleTimeLiteral11072); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_56, grammarAccess.getTimeLiteralAccess().getSecondKeyword_5_2_1_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4831:6: ( () ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4831:6: ( () ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4831:7: () ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4831:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4832:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTimeLiteralAccess().getTimeLiteralAction_6_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4837:2: ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4837:3: ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4837:3: ( (lv_second_58_0= ruleNUMBER ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4838:1: (lv_second_58_0= ruleNUMBER )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4838:1: (lv_second_58_0= ruleNUMBER )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4839:3: lv_second_58_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTimeLiteralAccess().getSecondNUMBERParserRuleCall_6_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleTimeLiteral11114);
                    lv_second_58_0=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTimeLiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"second",
                              		lv_second_58_0, 
                              		"NUMBER");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4855:2: (otherlv_59= 's' | otherlv_60= 'second' )
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==123) ) {
                        alt81=1;
                    }
                    else if ( (LA81_0==124) ) {
                        alt81=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 81, 0, input);

                        throw nvae;
                    }
                    switch (alt81) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4855:4: otherlv_59= 's'
                            {
                            otherlv_59=(Token)match(input,123,FOLLOW_123_in_ruleTimeLiteral11127); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_59, grammarAccess.getTimeLiteralAccess().getSKeyword_6_1_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4860:7: otherlv_60= 'second'
                            {
                            otherlv_60=(Token)match(input,124,FOLLOW_124_in_ruleTimeLiteral11145); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_60, grammarAccess.getTimeLiteralAccess().getSecondKeyword_6_1_1_1());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeLiteral"


    // $ANTLR start "entryRuleNUMBER"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4872:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4873:2: (iv_ruleNUMBER= ruleNUMBER EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4874:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMBERRule()); 
            }
            pushFollow(FOLLOW_ruleNUMBER_in_entryRuleNUMBER11185);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMBER.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUMBER11196); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4881:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4884:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4885:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4885:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4885:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNUMBER11236); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4892:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==125) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4893:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,125,FOLLOW_125_in_ruleNUMBER11255); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNUMBERAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNUMBER11270); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_2, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNUMBER"

    // $ANTLR start synpred1_InternalLil
    public final void synpred1_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2042:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2042:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2042:4: ( () ( ( ruleOpOr ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2042:5: () ( ( ruleOpOr ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2042:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2043:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2043:2: ( ( ruleOpOr ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2044:1: ( ruleOpOr )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2044:1: ( ruleOpOr )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2045:1: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred1_InternalLil4534);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalLil

    // $ANTLR start synpred2_InternalLil
    public final void synpred2_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2146:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2146:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2146:4: ( () ( ( ruleOpAnd ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2146:5: () ( ( ruleOpAnd ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2146:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2147:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2147:2: ( ( ruleOpAnd ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2148:1: ( ruleOpAnd )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2148:1: ( ruleOpAnd )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2149:1: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred2_InternalLil4789);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalLil

    // $ANTLR start synpred3_InternalLil
    public final void synpred3_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2250:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2250:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2250:4: ( () ( ( ruleOpEquality ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2250:5: () ( ( ruleOpEquality ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2250:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2251:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2251:2: ( ( ruleOpEquality ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2252:1: ( ruleOpEquality )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2252:1: ( ruleOpEquality )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2253:1: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred3_InternalLil5044);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalLil

    // $ANTLR start synpred4_InternalLil
    public final void synpred4_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2361:3: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2361:4: ( () ( ( ruleOpCompare ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2361:4: ( () ( ( ruleOpCompare ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2361:5: () ( ( ruleOpCompare ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2361:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2362:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2362:2: ( ( ruleOpCompare ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2363:1: ( ruleOpCompare )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2363:1: ( ruleOpCompare )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2364:1: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred4_InternalLil5320);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalLil

    // $ANTLR start synpred5_InternalLil
    public final void synpred5_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2486:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2486:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2486:4: ( () ( ( ruleOpOther ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2486:5: () ( ( ruleOpOther ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2486:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2487:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2487:2: ( ( ruleOpOther ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2488:1: ( ruleOpOther )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2488:1: ( ruleOpOther )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2489:1: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred5_InternalLil5634);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalLil

    // $ANTLR start synpred6_InternalLil
    public final void synpred6_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2597:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2597:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2597:4: ( () ( ( ruleOpAdd ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2597:5: () ( ( ruleOpAdd ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2597:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2598:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2598:2: ( ( ruleOpAdd ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2599:1: ( ruleOpAdd )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2599:1: ( ruleOpAdd )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2600:1: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred6_InternalLil5910);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalLil

    // $ANTLR start synpred7_InternalLil
    public final void synpred7_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2708:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2708:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2708:4: ( () ( ( ruleOpMulti ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2708:5: () ( ( ruleOpMulti ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2708:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2709:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2709:2: ( ( ruleOpMulti ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2710:1: ( ruleOpMulti )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2710:1: ( ruleOpMulti )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2711:1: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred7_InternalLil6186);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalLil

    // $ANTLR start synpred11_InternalLil
    public final void synpred11_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3499:3: ( ( ruleCasePart ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3500:1: ( ruleCasePart )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3500:1: ( ruleCasePart )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3501:1: ruleCasePart
        {
        pushFollow(FOLLOW_ruleCasePart_in_synpred11_InternalLil8122);
        ruleCasePart();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalLil

    // $ANTLR start synpred12_InternalLil
    public final void synpred12_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3521:5: ( 'default' )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3521:7: 'default'
        {
        match(input,73,FOLLOW_73_in_synpred12_InternalLil8153); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalLil

    // Delegated rules

    public final boolean synpred6_InternalLil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalLil_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalLil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalLil_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalLil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalLil_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalLil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalLil_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalLil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalLil_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalLil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalLil_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalLil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalLil_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalLil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalLil_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalLil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalLil_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA44 dfa44 = new DFA44(this);
    protected DFA82 dfa82 = new DFA82(this);
    static final String DFA44_eotS =
        "\14\uffff";
    static final String DFA44_eofS =
        "\3\uffff\1\12\7\uffff\1\12";
    static final String DFA44_minS =
        "\1\4\2\uffff\1\4\5\uffff\1\6\1\uffff\1\4";
    static final String DFA44_maxS =
        "\1\164\2\uffff\1\175\5\uffff\1\6\1\uffff\1\174";
    static final String DFA44_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\7\1\10\1\uffff\1\3\1\uffff";
    static final String DFA44_specialS =
        "\14\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\10\1\5\1\3\24\uffff\1\1\1\uffff\1\1\46\uffff\1\7\54\uffff"+
            "\2\2\1\4\1\6",
            "",
            "",
            "\1\12\6\uffff\2\12\12\uffff\1\12\4\uffff\1\12\1\uffff\1\12"+
            "\4\uffff\1\12\11\uffff\5\12\1\uffff\20\12\3\uffff\2\12\1\uffff"+
            "\2\12\52\uffff\10\6\1\11",
            "",
            "",
            "",
            "",
            "",
            "\1\13",
            "",
            "\1\12\6\uffff\2\12\12\uffff\1\12\4\uffff\1\12\1\uffff\1\12"+
            "\4\uffff\1\12\11\uffff\5\12\1\uffff\20\12\3\uffff\2\12\1\uffff"+
            "\2\12\52\uffff\10\6"
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "3011:1: (this_CollectionLiteral_0= ruleCollectionLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_TimeLiteral_5= ruleTimeLiteral | ( () otherlv_7= '#' ( (otherlv_8= RULE_ID ) ) ) | ( () ( (otherlv_10= RULE_ID ) ) ) )";
        }
    }
    static final String DFA82_eotS =
        "\13\uffff";
    static final String DFA82_eofS =
        "\13\uffff";
    static final String DFA82_minS =
        "\1\6\1\uffff\1\165\1\6\6\uffff\1\165";
    static final String DFA82_maxS =
        "\1\164\1\uffff\1\175\1\6\6\uffff\1\174";
    static final String DFA82_acceptS =
        "\1\uffff\1\1\2\uffff\1\6\1\3\1\2\1\7\1\5\1\4\1\uffff";
    static final String DFA82_specialS =
        "\13\uffff}>";
    static final String[] DFA82_transitionS = {
            "\1\2\155\uffff\1\1",
            "",
            "\1\6\1\5\1\11\1\10\2\4\2\7\1\3",
            "\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\6\1\5\1\11\1\10\2\4\2\7"
    };

    static final short[] DFA82_eot = DFA.unpackEncodedString(DFA82_eotS);
    static final short[] DFA82_eof = DFA.unpackEncodedString(DFA82_eofS);
    static final char[] DFA82_min = DFA.unpackEncodedStringToUnsignedChars(DFA82_minS);
    static final char[] DFA82_max = DFA.unpackEncodedStringToUnsignedChars(DFA82_maxS);
    static final short[] DFA82_accept = DFA.unpackEncodedString(DFA82_acceptS);
    static final short[] DFA82_special = DFA.unpackEncodedString(DFA82_specialS);
    static final short[][] DFA82_transition;

    static {
        int numStates = DFA82_transitionS.length;
        DFA82_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA82_transition[i] = DFA.unpackEncodedString(DFA82_transitionS[i]);
        }
    }

    class DFA82 extends DFA {

        public DFA82(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 82;
            this.eot = DFA82_eot;
            this.eof = DFA82_eof;
            this.min = DFA82_min;
            this.max = DFA82_max;
            this.accept = DFA82_accept;
            this.special = DFA82_special;
            this.transition = DFA82_transition;
        }
        public String getDescription() {
            return "4295:1: ( ( () otherlv_1= 'now' ) | ( () ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' ) ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )? ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )? ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )? ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )? ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )? ) | ( () ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' ) ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )? ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )? ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )? ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )? ) | ( () ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' ) ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )? ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )? ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )? ) | ( () ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' ) ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )? ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )? ) | ( () ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) ) ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )? ) | ( () ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleLilModel_in_entryRuleLilModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLilModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractor_in_ruleLilModel131 = new BitSet(new long[]{0x0000200000000802L});
    public static final BitSet FOLLOW_ruleDataTypeDefinition_in_ruleLilModel158 = new BitSet(new long[]{0x0000200000000802L});
    public static final BitSet FOLLOW_ruleInteractor_in_entryRuleInteractor195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractor205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleInteractor242 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractor259 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInteractor276 = new BitSet(new long[]{0x0001400000000012L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleInteractor298 = new BitSet(new long[]{0x0001400000000012L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleInteractor325 = new BitSet(new long[]{0x0001400000000012L});
    public static final BitSet FOLLOW_ruleBehavior_in_ruleInteractor352 = new BitSet(new long[]{0x0001400000000012L});
    public static final BitSet FOLLOW_ruleAccessibleEntity_in_entryRuleAccessibleEntity390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAccessibleEntity400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericEntity_in_ruleAccessibleEntity446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAccessibleEntity472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericEntity_in_entryRuleGenericEntity509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericEntity520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleGenericEntity558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleGenericEntity577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleGenericEntity596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleGenericEntity615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleGenericEntity634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleGenericEntity653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleGenericEntity672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_ruleEntity769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleEntity796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor883 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleActor900 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleActor912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActorAlias_in_entryRuleActorAlias948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActorAlias958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActorAlias1003 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleActorAlias1015 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActorAlias1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent1071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponent1123 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleComponent1140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponent1160 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleComponent1173 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleActorAlias_in_ruleComponent1194 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleComponent1207 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleActorAlias_in_ruleComponent1228 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleSignalReception_in_entryRuleSignalReception1268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalReception1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignalReception1324 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleSignalReception1337 = new BitSet(new long[]{0x00000000000FE010L});
    public static final BitSet FOLLOW_ruleSignalAlias_in_ruleSignalReception1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSignalReception1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalEmission_in_entryRuleSignalEmission1434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalEmission1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignalEmission1489 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleSignalEmission1502 = new BitSet(new long[]{0x00000000000FE010L});
    public static final BitSet FOLLOW_ruleSignalAlias_in_ruleSignalEmission1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignal1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1613 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSignal1630 = new BitSet(new long[]{0x00001FB800000010L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleSignal1651 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_ruleSignalMode_in_ruleSignal1672 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_24_in_ruleSignal1685 = new BitSet(new long[]{0x00000000000FE010L});
    public static final BitSet FOLLOW_ruleSignalAlias_in_ruleSignal1706 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleSignal1721 = new BitSet(new long[]{0x00000000000FE010L});
    public static final BitSet FOLLOW_ruleSignalAlias_in_ruleSignal1742 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleDefinitionSet_in_entryRuleDefinitionSet1780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitionSet1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleDefinitionSet1837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumElement_in_ruleDefinitionSet1858 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_23_in_ruleDefinitionSet1871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumElement_in_ruleDefinitionSet1892 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_28_in_ruleDefinitionSet1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleDefinitionSet1935 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleDefinitionSet1956 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_23_in_ruleDefinitionSet1969 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleDefinitionSet1990 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_28_in_ruleDefinitionSet2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleDefinitionSet2033 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleDefinitionSet2054 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDefinitionSet2066 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleDefinitionSet2087 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleDefinitionSet2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalAlias_in_entryRuleSignalAlias2136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalAlias2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessibleEntity_in_ruleSignalAlias2192 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleSignalAlias2205 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignalAlias2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalMode_in_entryRuleSignalMode2264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalMode2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleSignalMode2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleSignalMode2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleSignalMode2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType2391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeBase_in_ruleDataType2457 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleDataType2470 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_ruleDefinitionSet_in_ruleDataType2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleDataType2530 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_36_in_ruleDataType2559 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_37_in_ruleDataType2588 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleDataType2616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataType2636 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleDataType2649 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_ruleDefinitionSet_in_ruleDataType2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataType2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeBase_in_entryRuleTypeBase2747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeBase2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleTypeBase2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleTypeBase2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleTypeBase2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleTypeBase2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleTypeBase2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleTypeBase2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeDefinition_in_entryRuleDataTypeDefinition2931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeDefinition2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeStructure_in_ruleDataTypeDefinition2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeStructure_in_entryRuleDataTypeStructure3021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeStructure3031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleDataTypeStructure3068 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataTypeStructure3085 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDataTypeStructure3102 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleDataTypeStructureField_in_ruleDataTypeStructure3123 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleDataTypeStructureField_in_entryRuleDataTypeStructureField3160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeStructureField3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataTypeStructureField3212 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDataTypeStructureField3229 = new BitSet(new long[]{0x00001FB800000010L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleDataTypeStructureField3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBehavior_in_entryRuleBehavior3286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBehavior3296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCause_in_ruleBehavior3342 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBehavior3354 = new BitSet(new long[]{0x000A000800000000L});
    public static final BitSet FOLLOW_ruleEffect_in_ruleBehavior3375 = new BitSet(new long[]{0x000A000800000002L});
    public static final BitSet FOLLOW_ruleCause_in_entryRuleCause3412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCause3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnCause_in_ruleCause3469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenCause_in_ruleCause3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnCause_in_entryRuleOnCause3531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOnCause3541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleOnCause3578 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_ruleSignalReception_in_ruleOnCause3599 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleOnCause3612 = new BitSet(new long[]{0xC000800028000070L,0x001FFFFFFFFFE938L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleOnCause3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenCause_in_entryRuleWhenCause3671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenCause3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleWhenCause3718 = new BitSet(new long[]{0xC000800028000070L,0x001FFFFFFFFFE938L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleWhenCause3739 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleWhenCause3752 = new BitSet(new long[]{0xC000800028000070L,0x001FFFFFFFFFE938L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleWhenCause3773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect3811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffect3821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEffect_in_ruleEffect3868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetEffect_in_ruleEffect3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTriggerEffect_in_ruleEffect3922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEffect_in_entryRuleAlwaysEffect3957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlwaysEffect3967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleAlwaysEffect4004 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignalEmission_in_ruleAlwaysEffect4025 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleAlwaysEffect4037 = new BitSet(new long[]{0xC000800028000070L,0x001FFFFFFFFFE938L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAlwaysEffect4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetEffect_in_entryRuleSetEffect4094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetEffect4104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleSetEffect4141 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignalEmission_in_ruleSetEffect4162 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleSetEffect4174 = new BitSet(new long[]{0xC000800028000070L,0x001FFFFFFFFFE938L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSetEffect4195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTriggerEffect_in_entryRuleTriggerEffect4231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTriggerEffect4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleTriggerEffect4278 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignalEmission_in_ruleTriggerEffect4299 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleTriggerEffect4311 = new BitSet(new long[]{0xC000800028000070L,0x001FFFFFFFFFE938L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTriggerEffect4332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression4368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression4378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleExpression4424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression4458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression4468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression4515 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleOrExpression4564 = new BitSet(new long[]{0xC000800028000070L,0x001FFFFFFFFFE938L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression4587 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr4626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr4637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleOpOr4674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression4713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression4723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_ruleAndExpression4770 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleAndExpression4819 = new BitSet(new long[]{0xC000800028000070L,0x001FFFFFFFFFE938L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_ruleAndExpression4842 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd4881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleOpAnd4929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression4968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualityExpression4978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleEqualityExpression5025 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleEqualityExpression5074 = new BitSet(new long[]{0xC000800028000070L,0x001FFFFFFFFFE938L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleEqualityExpression5097 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality5136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality5147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleOpEquality5185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleOpEquality5204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression5244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression5254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherOperatorExpression_in_ruleRelationalExpression5301 = new BitSet(new long[]{0x0F00000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleRelationalExpression5350 = new BitSet(new long[]{0xC000800028000070L,0x001FFFFFFFFFE938L});
    public static final BitSet FOLLOW_ruleOtherOperatorExpression_in_ruleRelationalExpression5373 = new BitSet(new long[]{0x0F00000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare5412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare5423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleOpCompare5461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleOpCompare5480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleOpCompare5499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleOpCompare5518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherOperatorExpression_in_entryRuleOtherOperatorExpression5558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherOperatorExpression5568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleOtherOperatorExpression5615 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleOtherOperatorExpression5664 = new BitSet(new long[]{0xC000800028000070L,0x001FFFFFFFFFE938L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleOtherOperatorExpression5687 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther5726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther5737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleOpOther5775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleOpOther5794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression5834 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression5844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression5891 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleAdditiveExpression5940 = new BitSet(new long[]{0xC000800028000070L,0x001FFFFFFFFFE938L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression5963 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd6002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd6013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleOpAdd6051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleOpAdd6070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression6110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression6120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_ruleMultiplicativeExpression6167 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleMultiplicativeExpression6216 = new BitSet(new long[]{0xC000800028000070L,0x001FFFFFFFFFE938L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_ruleMultiplicativeExpression6239 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti6278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti6289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleOpMulti6327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleOpMulti6346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleOpMulti6365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation6405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperation6415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleUnaryOperation6471 = new BitSet(new long[]{0xC000800028000070L,0x001FFFFFFFFFE938L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleUnaryOperation6492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleUnaryOperation6521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary6557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary6568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleOpUnary6606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleOpUnary6625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleOpUnary6644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression6684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression6694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchExpression_in_rulePrimaryExpression6741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExpression_in_rulePrimaryExpression6768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimaryExpression6795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForEachExpression_in_rulePrimaryExpression6822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCallExpression_in_rulePrimaryExpression6849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression6876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral6911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral6921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionLiteral_in_ruleLiteral6968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral6995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleLiteral7022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleLiteral7049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral7076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeLiteral_in_ruleLiteral7103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleLiteral7130 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteral7150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteral7187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionLiteral_in_entryRuleCollectionLiteral7224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionLiteral7234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLiteral_in_ruleCollectionLiteral7281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_ruleCollectionLiteral7308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLiteral_in_entryRuleSetLiteral7343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetLiteral7353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSetLiteral7399 = new BitSet(new long[]{0xC000800038000070L,0x001FFFFFFFFFE938L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSetLiteral7421 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_23_in_ruleSetLiteral7434 = new BitSet(new long[]{0xC000800028000070L,0x001FFFFFFFFFE938L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSetLiteral7455 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_28_in_ruleSetLiteral7471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListLiteral_in_entryRuleListLiteral7507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListLiteral7517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleListLiteral7563 = new BitSet(new long[]{0xC000800068000070L,0x001FFFFFFFFFE938L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleListLiteral7585 = new BitSet(new long[]{0x0000000040800000L});
    public static final BitSet FOLLOW_23_in_ruleListLiteral7598 = new BitSet(new long[]{0xC000800028000070L,0x001FFFFFFFFFE938L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleListLiteral7619 = new BitSet(new long[]{0x0000000040800000L});
    public static final BitSet FOLLOW_30_in_ruleListLiteral7635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression7671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression7681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleParenthesizedExpression7718 = new BitSet(new long[]{0xC000800028000070L,0x001FFFFFFFFFE938L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression7740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleParenthesizedExpression7751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExpression_in_entryRuleIfExpression7787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfExpression7797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleIfExpression7843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleIfExpression7855 = new BitSet(new long[]{0xC000800028000070L,0x001FFFFFFFFFE938L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfExpression7876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleIfExpression7896 = new BitSet(new long[]{0xC000800028000070L,0x001FFFFFFFFFE938L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfExpression7918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleIfExpression7939 = new BitSet(new long[]{0xC000800028000070L,0x001FFFFFFFFFE938L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfExpression7961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchExpression_in_entryRuleSwitchExpression7998 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitchExpression8008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleSwitchExpression8054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleSwitchExpression8066 = new BitSet(new long[]{0xC000800028000070L,0x001FFFFFFFFFE938L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSwitchExpression8087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleSwitchExpression8107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleCasePart_in_ruleSwitchExpression8139 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_73_in_ruleSwitchExpression8161 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSwitchExpression8174 = new BitSet(new long[]{0xC000800028000070L,0x001FFFFFFFFFE938L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSwitchExpression8195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCasePart_in_entryRuleCasePart8233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCasePart8243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleCasePart8280 = new BitSet(new long[]{0xC000800028000070L,0x001FFFFFFFFFE938L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCasePart8301 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCasePart8313 = new BitSet(new long[]{0xC000800028000070L,0x001FFFFFFFFFE938L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCasePart8334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForEachExpression_in_entryRuleForEachExpression8370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForEachExpression8380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleForEachExpression8426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleForEachExpression8438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleForEachExpression8450 = new BitSet(new long[]{0xC000800028000070L,0x001FFFFFFFFFE938L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForEachExpression8471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleForEachExpression8483 = new BitSet(new long[]{0xC000800028000070L,0x001FFFFFFFFFE938L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForEachExpression8504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCallExpression_in_entryRuleFunctionCallExpression8540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCallExpression8550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInFunction_in_ruleFunctionCallExpression8605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleFunctionCallExpression8617 = new BitSet(new long[]{0xC000800028800070L,0x001FFFFFFFFFE978L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionCallExpression8638 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000040L});
    public static final BitSet FOLLOW_23_in_ruleFunctionCallExpression8652 = new BitSet(new long[]{0xC000800028000070L,0x001FFFFFFFFFE938L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionCallExpression8673 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleFunctionCallExpression8687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInFunction_in_entryRuleBuiltInFunction8724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltInFunction8735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleBuiltInFunction8773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleBuiltInFunction8792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleBuiltInFunction8811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleBuiltInFunction8830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleBuiltInFunction8849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleBuiltInFunction8868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleBuiltInFunction8887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleBuiltInFunction8906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleBuiltInFunction8925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleBuiltInFunction8944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleBuiltInFunction8963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleBuiltInFunction8982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleBuiltInFunction9001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleBuiltInFunction9020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleBuiltInFunction9039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleBuiltInFunction9058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleBuiltInFunction9077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleBuiltInFunction9096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleBuiltInFunction9115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleBuiltInFunction9134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleBuiltInFunction9153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleBuiltInFunction9172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleBuiltInFunction9191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleBuiltInFunction9210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleBuiltInFunction9229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleBuiltInFunction9248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleBuiltInFunction9267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleBuiltInFunction9286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleBuiltInFunction9305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleBuiltInFunction9324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleBuiltInFunction9343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleBuiltInFunction9362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleBuiltInFunction9381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleBuiltInFunction9400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleBuiltInFunction9419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleBuiltInFunction9438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral9478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral9488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ruleBooleanLiteral9535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleBooleanLiteral9559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral9609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral9619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleNullLiteral9665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral9701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral9711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleNumberLiteral9766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral9812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral9863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumElement_in_entryRuleEnumElement9904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumElement9914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleEnumElement9960 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumElement9977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeLiteral_in_entryRuleTimeLiteral10018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeLiteral10028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleTimeLiteral10075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleTimeLiteral10114 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_ruleTimeLiteral10126 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleTimeLiteral10149 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_ruleTimeLiteral10161 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleTimeLiteral10185 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_ruleTimeLiteral10197 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleTimeLiteral10221 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_ruleTimeLiteral10233 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleTimeLiteral10257 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L});
    public static final BitSet FOLLOW_121_in_ruleTimeLiteral10270 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_122_in_ruleTimeLiteral10288 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleTimeLiteral10313 = new BitSet(new long[]{0x0000000000000000L,0x1800000000000000L});
    public static final BitSet FOLLOW_123_in_ruleTimeLiteral10326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleTimeLiteral10344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleTimeLiteral10386 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_ruleTimeLiteral10398 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleTimeLiteral10421 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_ruleTimeLiteral10433 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleTimeLiteral10457 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_ruleTimeLiteral10469 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleTimeLiteral10493 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L});
    public static final BitSet FOLLOW_121_in_ruleTimeLiteral10506 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_122_in_ruleTimeLiteral10524 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleTimeLiteral10549 = new BitSet(new long[]{0x0000000000000000L,0x1800000000000000L});
    public static final BitSet FOLLOW_123_in_ruleTimeLiteral10562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleTimeLiteral10580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleTimeLiteral10622 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_ruleTimeLiteral10634 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleTimeLiteral10657 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_ruleTimeLiteral10669 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleTimeLiteral10693 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L});
    public static final BitSet FOLLOW_121_in_ruleTimeLiteral10706 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_122_in_ruleTimeLiteral10724 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleTimeLiteral10749 = new BitSet(new long[]{0x0000000000000000L,0x1800000000000000L});
    public static final BitSet FOLLOW_123_in_ruleTimeLiteral10762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleTimeLiteral10780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleTimeLiteral10822 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_ruleTimeLiteral10834 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleTimeLiteral10857 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L});
    public static final BitSet FOLLOW_121_in_ruleTimeLiteral10870 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_122_in_ruleTimeLiteral10888 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleTimeLiteral10913 = new BitSet(new long[]{0x0000000000000000L,0x1800000000000000L});
    public static final BitSet FOLLOW_123_in_ruleTimeLiteral10926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleTimeLiteral10944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleTimeLiteral10986 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L});
    public static final BitSet FOLLOW_121_in_ruleTimeLiteral10999 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_122_in_ruleTimeLiteral11017 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleTimeLiteral11041 = new BitSet(new long[]{0x0000000000000000L,0x1800000000000000L});
    public static final BitSet FOLLOW_123_in_ruleTimeLiteral11054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleTimeLiteral11072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleTimeLiteral11114 = new BitSet(new long[]{0x0000000000000000L,0x1800000000000000L});
    public static final BitSet FOLLOW_123_in_ruleTimeLiteral11127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleTimeLiteral11145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_entryRuleNUMBER11185 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER11196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER11236 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_ruleNUMBER11255 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER11270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred1_InternalLil4534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred2_InternalLil4789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred3_InternalLil5044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred4_InternalLil5320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred5_InternalLil5634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred6_InternalLil5910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred7_InternalLil6186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCasePart_in_synpred11_InternalLil8122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_synpred12_InternalLil8153 = new BitSet(new long[]{0x0000000000000002L});

}