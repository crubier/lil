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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'actor'", "':'", "'input'", "'output'", "'data'", "'void'", "'symbol'", "'in'", "'number'", "'text'", "'time'", "'identifier'", "'collection'", "'set'", "'list'", "'queue'", "'{'", "','", "'}'", "'#'", "'['", "']'", "'interactor'", "'from'", "'to'", "'as'", "'event'", "'flow'", "'constant'", "'with'", "'any'", "'self'", "'other'", "'parent'", "'child'", "'all'", "'actors'", "'init'", "'on'", "'if'", "'when'", "'always'", "'='", "'trigger'", "'or'", "'and'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'<>'", "'?:'", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'('", "')'", "'else'", "'switch'", "'default'", "'case'", "'for'", "'each'", "'math.abs'", "'math.acos'", "'math.acosh'", "'math.asin'", "'math.asinh'", "'math.atan'", "'math.atanh'", "'math.atan2'", "'math.ceil'", "'math.clip'", "'math.cos'", "'math.cosh'", "'math.exp'", "'math.floor'", "'math.fround'", "'math.hypot'", "'math.log'", "'math.log10'", "'math.log2'", "'math.max'", "'math.min'", "'math.pow'", "'math.random'", "'math.round'", "'math.sign'", "'math.sin'", "'math.sinh'", "'math.sqrt'", "'math.tan'", "'math.tanh'", "'math.trunc'", "'false'", "'true'", "'null'", "'now'", "'year'", "'month'", "'day'", "'hour'", "'m'", "'minute'", "'s'", "'second'", "'.'"
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:76:1: ruleLilModel returns [EObject current=null] : ( ( (lv_actorType_0_0= ruleActorTypeDefinition ) ) | ( (lv_dataType_1_0= ruleDataTypeDefinition ) ) | ( (lv_interactorType_2_0= ruleInteractorTypeDefinition ) ) )* ;
    public final EObject ruleLilModel() throws RecognitionException {
        EObject current = null;

        EObject lv_actorType_0_0 = null;

        EObject lv_dataType_1_0 = null;

        EObject lv_interactorType_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:79:28: ( ( ( (lv_actorType_0_0= ruleActorTypeDefinition ) ) | ( (lv_dataType_1_0= ruleDataTypeDefinition ) ) | ( (lv_interactorType_2_0= ruleInteractorTypeDefinition ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:80:1: ( ( (lv_actorType_0_0= ruleActorTypeDefinition ) ) | ( (lv_dataType_1_0= ruleDataTypeDefinition ) ) | ( (lv_interactorType_2_0= ruleInteractorTypeDefinition ) ) )*
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:80:1: ( ( (lv_actorType_0_0= ruleActorTypeDefinition ) ) | ( (lv_dataType_1_0= ruleDataTypeDefinition ) ) | ( (lv_interactorType_2_0= ruleInteractorTypeDefinition ) ) )*
            loop1:
            do {
                int alt1=4;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    switch ( input.LA(2) ) {
                    case 15:
                        {
                        alt1=2;
                        }
                        break;
                    case 11:
                        {
                        alt1=1;
                        }
                        break;
                    case 33:
                        {
                        alt1=3;
                        }
                        break;

                    }

                }


                switch (alt1) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:80:2: ( (lv_actorType_0_0= ruleActorTypeDefinition ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:80:2: ( (lv_actorType_0_0= ruleActorTypeDefinition ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:81:1: (lv_actorType_0_0= ruleActorTypeDefinition )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:81:1: (lv_actorType_0_0= ruleActorTypeDefinition )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:82:3: lv_actorType_0_0= ruleActorTypeDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLilModelAccess().getActorTypeActorTypeDefinitionParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleActorTypeDefinition_in_ruleLilModel131);
            	    lv_actorType_0_0=ruleActorTypeDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLilModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"actorType",
            	              		lv_actorType_0_0, 
            	              		"ActorTypeDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:99:6: ( (lv_dataType_1_0= ruleDataTypeDefinition ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:99:6: ( (lv_dataType_1_0= ruleDataTypeDefinition ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:100:1: (lv_dataType_1_0= ruleDataTypeDefinition )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:100:1: (lv_dataType_1_0= ruleDataTypeDefinition )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:101:3: lv_dataType_1_0= ruleDataTypeDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLilModelAccess().getDataTypeDataTypeDefinitionParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDataTypeDefinition_in_ruleLilModel158);
            	    lv_dataType_1_0=ruleDataTypeDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLilModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"dataType",
            	              		lv_dataType_1_0, 
            	              		"DataTypeDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:118:6: ( (lv_interactorType_2_0= ruleInteractorTypeDefinition ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:118:6: ( (lv_interactorType_2_0= ruleInteractorTypeDefinition ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:119:1: (lv_interactorType_2_0= ruleInteractorTypeDefinition )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:119:1: (lv_interactorType_2_0= ruleInteractorTypeDefinition )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:120:3: lv_interactorType_2_0= ruleInteractorTypeDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLilModelAccess().getInteractorTypeInteractorTypeDefinitionParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInteractorTypeDefinition_in_ruleLilModel185);
            	    lv_interactorType_2_0=ruleInteractorTypeDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLilModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"interactorType",
            	              		lv_interactorType_2_0, 
            	              		"InteractorTypeDefinition");
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


    // $ANTLR start "entryRuleActorTypeDefinition"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:144:1: entryRuleActorTypeDefinition returns [EObject current=null] : iv_ruleActorTypeDefinition= ruleActorTypeDefinition EOF ;
    public final EObject entryRuleActorTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActorTypeDefinition = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:145:2: (iv_ruleActorTypeDefinition= ruleActorTypeDefinition EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:146:2: iv_ruleActorTypeDefinition= ruleActorTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActorTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleActorTypeDefinition_in_entryRuleActorTypeDefinition222);
            iv_ruleActorTypeDefinition=ruleActorTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActorTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActorTypeDefinition232); if (state.failed) return current;

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
    // $ANTLR end "entryRuleActorTypeDefinition"


    // $ANTLR start "ruleActorTypeDefinition"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:153:1: ruleActorTypeDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'actor' otherlv_2= ':' ( (lv_component_3_0= ruleActorInstanceDeclaration ) )* ) ;
    public final EObject ruleActorTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_component_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:156:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'actor' otherlv_2= ':' ( (lv_component_3_0= ruleActorInstanceDeclaration ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:157:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'actor' otherlv_2= ':' ( (lv_component_3_0= ruleActorInstanceDeclaration ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:157:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'actor' otherlv_2= ':' ( (lv_component_3_0= ruleActorInstanceDeclaration ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:157:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'actor' otherlv_2= ':' ( (lv_component_3_0= ruleActorInstanceDeclaration ) )*
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:157:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:158:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:158:1: (lv_name_0_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:159:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActorTypeDefinition274); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getActorTypeDefinitionAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getActorTypeDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleActorTypeDefinition291); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActorTypeDefinitionAccess().getActorKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleActorTypeDefinition303); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getActorTypeDefinitionAccess().getColonKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:183:1: ( (lv_component_3_0= ruleActorInstanceDeclaration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==12) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:184:1: (lv_component_3_0= ruleActorInstanceDeclaration )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:184:1: (lv_component_3_0= ruleActorInstanceDeclaration )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:185:3: lv_component_3_0= ruleActorInstanceDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getActorTypeDefinitionAccess().getComponentActorInstanceDeclarationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleActorInstanceDeclaration_in_ruleActorTypeDefinition324);
            	    lv_component_3_0=ruleActorInstanceDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getActorTypeDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"component",
            	              		lv_component_3_0, 
            	              		"ActorInstanceDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
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
    // $ANTLR end "ruleActorTypeDefinition"


    // $ANTLR start "entryRuleActorType"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:209:1: entryRuleActorType returns [EObject current=null] : iv_ruleActorType= ruleActorType EOF ;
    public final EObject entryRuleActorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActorType = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:210:2: (iv_ruleActorType= ruleActorType EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:211:2: iv_ruleActorType= ruleActorType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActorTypeRule()); 
            }
            pushFollow(FOLLOW_ruleActorType_in_entryRuleActorType361);
            iv_ruleActorType=ruleActorType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActorType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActorType371); if (state.failed) return current;

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
    // $ANTLR end "entryRuleActorType"


    // $ANTLR start "ruleActorType"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:218:1: ruleActorType returns [EObject current=null] : ( ( () otherlv_1= 'input' ) | ( () otherlv_3= 'output' ) | ( () ( (otherlv_5= RULE_ID ) ) ) ) ;
    public final EObject ruleActorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:221:28: ( ( ( () otherlv_1= 'input' ) | ( () otherlv_3= 'output' ) | ( () ( (otherlv_5= RULE_ID ) ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:222:1: ( ( () otherlv_1= 'input' ) | ( () otherlv_3= 'output' ) | ( () ( (otherlv_5= RULE_ID ) ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:222:1: ( ( () otherlv_1= 'input' ) | ( () otherlv_3= 'output' ) | ( () ( (otherlv_5= RULE_ID ) ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:222:2: ( () otherlv_1= 'input' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:222:2: ( () otherlv_1= 'input' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:222:3: () otherlv_1= 'input'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:222:3: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:223:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getActorTypeAccess().getActorTypeInputAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleActorType418); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getActorTypeAccess().getInputKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:233:6: ( () otherlv_3= 'output' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:233:6: ( () otherlv_3= 'output' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:233:7: () otherlv_3= 'output'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:233:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:234:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getActorTypeAccess().getActorTypeOutputAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleActorType447); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getActorTypeAccess().getOutputKeyword_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:244:6: ( () ( (otherlv_5= RULE_ID ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:244:6: ( () ( (otherlv_5= RULE_ID ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:244:7: () ( (otherlv_5= RULE_ID ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:244:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:245:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getActorTypeAccess().getActorTypeCustomAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:250:2: ( (otherlv_5= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:251:1: (otherlv_5= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:251:1: (otherlv_5= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:252:3: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getActorTypeRule());
                      	        }
                              
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActorType484); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_5, grammarAccess.getActorTypeAccess().getDefinitionActorTypeDefinitionCrossReference_2_1_0()); 
                      	
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
    // $ANTLR end "ruleActorType"


    // $ANTLR start "entryRuleActorInstanceDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:271:1: entryRuleActorInstanceDeclaration returns [EObject current=null] : iv_ruleActorInstanceDeclaration= ruleActorInstanceDeclaration EOF ;
    public final EObject entryRuleActorInstanceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActorInstanceDeclaration = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:272:2: (iv_ruleActorInstanceDeclaration= ruleActorInstanceDeclaration EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:273:2: iv_ruleActorInstanceDeclaration= ruleActorInstanceDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActorInstanceDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleActorInstanceDeclaration_in_entryRuleActorInstanceDeclaration521);
            iv_ruleActorInstanceDeclaration=ruleActorInstanceDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActorInstanceDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActorInstanceDeclaration531); if (state.failed) return current;

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
    // $ANTLR end "entryRuleActorInstanceDeclaration"


    // $ANTLR start "ruleActorInstanceDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:280:1: ruleActorInstanceDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleActorType ) ) ) ;
    public final EObject ruleActorInstanceDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:283:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleActorType ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:284:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleActorType ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:284:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleActorType ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:284:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleActorType ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:284:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:285:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:285:1: (lv_name_0_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:286:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActorInstanceDeclaration573); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getActorInstanceDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getActorInstanceDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleActorInstanceDeclaration590); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActorInstanceDeclarationAccess().getColonKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:306:1: ( (lv_type_2_0= ruleActorType ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:307:1: (lv_type_2_0= ruleActorType )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:307:1: (lv_type_2_0= ruleActorType )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:308:3: lv_type_2_0= ruleActorType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActorInstanceDeclarationAccess().getTypeActorTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleActorType_in_ruleActorInstanceDeclaration611);
            lv_type_2_0=ruleActorType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getActorInstanceDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"ActorType");
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
    // $ANTLR end "ruleActorInstanceDeclaration"


    // $ANTLR start "entryRuleDataTypeDefinition"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:332:1: entryRuleDataTypeDefinition returns [EObject current=null] : iv_ruleDataTypeDefinition= ruleDataTypeDefinition EOF ;
    public final EObject entryRuleDataTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeDefinition = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:333:2: (iv_ruleDataTypeDefinition= ruleDataTypeDefinition EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:334:2: iv_ruleDataTypeDefinition= ruleDataTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeDefinition_in_entryRuleDataTypeDefinition647);
            iv_ruleDataTypeDefinition=ruleDataTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeDefinition657); if (state.failed) return current;

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:341:1: ruleDataTypeDefinition returns [EObject current=null] : ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'data' otherlv_3= ':' ( (lv_component_4_0= ruleDataInstanceDeclaration ) )* ) | ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= 'data' otherlv_8= ':' ( (lv_alias_9_0= ruleDataType ) ) ) ) ;
    public final EObject ruleDataTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_component_4_0 = null;

        EObject lv_alias_9_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:344:28: ( ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'data' otherlv_3= ':' ( (lv_component_4_0= ruleDataInstanceDeclaration ) )* ) | ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= 'data' otherlv_8= ':' ( (lv_alias_9_0= ruleDataType ) ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:345:1: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'data' otherlv_3= ':' ( (lv_component_4_0= ruleDataInstanceDeclaration ) )* ) | ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= 'data' otherlv_8= ':' ( (lv_alias_9_0= ruleDataType ) ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:345:1: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'data' otherlv_3= ':' ( (lv_component_4_0= ruleDataInstanceDeclaration ) )* ) | ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= 'data' otherlv_8= ':' ( (lv_alias_9_0= ruleDataType ) ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==15) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==12) ) {
                        switch ( input.LA(4) ) {
                        case RULE_ID:
                            {
                            int LA5_4 = input.LA(5);

                            if ( ((LA5_4>=11 && LA5_4<=12)||LA5_4==15||LA5_4==33) ) {
                                alt5=1;
                            }
                            else if ( (LA5_4==EOF||LA5_4==RULE_ID||(LA5_4>=23 && LA5_4<=26)) ) {
                                alt5=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 4, input);

                                throw nvae;
                            }
                            }
                            break;
                        case EOF:
                            {
                            alt5=1;
                            }
                            break;
                        case 16:
                        case 17:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            {
                            alt5=2;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 3, input);

                            throw nvae;
                        }

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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:345:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'data' otherlv_3= ':' ( (lv_component_4_0= ruleDataInstanceDeclaration ) )* )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:345:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'data' otherlv_3= ':' ( (lv_component_4_0= ruleDataInstanceDeclaration ) )* )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:345:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'data' otherlv_3= ':' ( (lv_component_4_0= ruleDataInstanceDeclaration ) )*
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:345:3: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:346:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataTypeDefinitionAccess().getDataTypeDefinitionCompoundAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:351:2: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:352:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:352:1: (lv_name_1_0= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:353:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataTypeDefinition709); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_1_0, grammarAccess.getDataTypeDefinitionAccess().getNameIDTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDataTypeDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleDataTypeDefinition726); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getDataTypeDefinitionAccess().getDataKeyword_0_2());
                          
                    }
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleDataTypeDefinition738); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDataTypeDefinitionAccess().getColonKeyword_0_3());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:377:1: ( (lv_component_4_0= ruleDataInstanceDeclaration ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            int LA4_2 = input.LA(2);

                            if ( (LA4_2==12) ) {
                                alt4=1;
                            }


                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:378:1: (lv_component_4_0= ruleDataInstanceDeclaration )
                    	    {
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:378:1: (lv_component_4_0= ruleDataInstanceDeclaration )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:379:3: lv_component_4_0= ruleDataInstanceDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDataTypeDefinitionAccess().getComponentDataInstanceDeclarationParserRuleCall_0_4_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDataInstanceDeclaration_in_ruleDataTypeDefinition759);
                    	    lv_component_4_0=ruleDataInstanceDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDataTypeDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"component",
                    	              		lv_component_4_0, 
                    	              		"DataInstanceDeclaration");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:396:6: ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= 'data' otherlv_8= ':' ( (lv_alias_9_0= ruleDataType ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:396:6: ( () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= 'data' otherlv_8= ':' ( (lv_alias_9_0= ruleDataType ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:396:7: () ( (lv_name_6_0= RULE_ID ) ) otherlv_7= 'data' otherlv_8= ':' ( (lv_alias_9_0= ruleDataType ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:396:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:397:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataTypeDefinitionAccess().getDataTypeDefinitionAliasAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:402:2: ( (lv_name_6_0= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:403:1: (lv_name_6_0= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:403:1: (lv_name_6_0= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:404:3: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataTypeDefinition794); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_6_0, grammarAccess.getDataTypeDefinitionAccess().getNameIDTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDataTypeDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_6_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleDataTypeDefinition811); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getDataTypeDefinitionAccess().getDataKeyword_1_2());
                          
                    }
                    otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleDataTypeDefinition823); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getDataTypeDefinitionAccess().getColonKeyword_1_3());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:428:1: ( (lv_alias_9_0= ruleDataType ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:429:1: (lv_alias_9_0= ruleDataType )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:429:1: (lv_alias_9_0= ruleDataType )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:430:3: lv_alias_9_0= ruleDataType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataTypeDefinitionAccess().getAliasDataTypeParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDataType_in_ruleDataTypeDefinition844);
                    lv_alias_9_0=ruleDataType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataTypeDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"alias",
                              		lv_alias_9_0, 
                              		"DataType");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleDataTypeDefinition"


    // $ANTLR start "entryRuleDataType"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:454:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:455:2: (iv_ruleDataType= ruleDataType EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:456:2: iv_ruleDataType= ruleDataType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeRule()); 
            }
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType881);
            iv_ruleDataType=ruleDataType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType891); if (state.failed) return current;

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:463:1: ruleDataType returns [EObject current=null] : ( ( ( () otherlv_1= 'void' ) | ( () otherlv_3= 'symbol' (otherlv_4= 'in' ( (lv_definitionSet_5_0= ruleDataTypeSymbolDefinitionSet ) ) )? ) | ( () otherlv_7= 'number' (otherlv_8= 'in' ( (lv_definitionSet_9_0= ruleDataTypeNumberDefinitionSet ) ) )? ) | ( () otherlv_11= 'text' (otherlv_12= 'in' ( (lv_definitionSet_13_0= ruleDataTypeTextDefinitionSet ) ) )? ) | ( () otherlv_15= 'time' (otherlv_16= 'in' ( (lv_definitionSet_17_0= ruleDataTypeTimeDefinitionSet ) ) )? ) | ( () otherlv_19= 'identifier' (otherlv_20= 'in' ( (lv_definitionSet_21_0= ruleDataTypeIdentifierDefinitionSet ) ) )? ) | ( () ( (otherlv_23= RULE_ID ) ) ) ) ( ( ( () 'collection' ) )=> ( () otherlv_25= 'collection' ) )* ( ( ( () 'set' ) )=> ( () otherlv_27= 'set' ) )* ( ( ( () 'list' ) )=> ( () otherlv_29= 'list' ) )* ( ( ( () 'queue' ) )=> ( () otherlv_31= 'queue' ) )* ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        EObject lv_definitionSet_5_0 = null;

        EObject lv_definitionSet_9_0 = null;

        EObject lv_definitionSet_13_0 = null;

        EObject lv_definitionSet_17_0 = null;

        EObject lv_definitionSet_21_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:466:28: ( ( ( ( () otherlv_1= 'void' ) | ( () otherlv_3= 'symbol' (otherlv_4= 'in' ( (lv_definitionSet_5_0= ruleDataTypeSymbolDefinitionSet ) ) )? ) | ( () otherlv_7= 'number' (otherlv_8= 'in' ( (lv_definitionSet_9_0= ruleDataTypeNumberDefinitionSet ) ) )? ) | ( () otherlv_11= 'text' (otherlv_12= 'in' ( (lv_definitionSet_13_0= ruleDataTypeTextDefinitionSet ) ) )? ) | ( () otherlv_15= 'time' (otherlv_16= 'in' ( (lv_definitionSet_17_0= ruleDataTypeTimeDefinitionSet ) ) )? ) | ( () otherlv_19= 'identifier' (otherlv_20= 'in' ( (lv_definitionSet_21_0= ruleDataTypeIdentifierDefinitionSet ) ) )? ) | ( () ( (otherlv_23= RULE_ID ) ) ) ) ( ( ( () 'collection' ) )=> ( () otherlv_25= 'collection' ) )* ( ( ( () 'set' ) )=> ( () otherlv_27= 'set' ) )* ( ( ( () 'list' ) )=> ( () otherlv_29= 'list' ) )* ( ( ( () 'queue' ) )=> ( () otherlv_31= 'queue' ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:467:1: ( ( ( () otherlv_1= 'void' ) | ( () otherlv_3= 'symbol' (otherlv_4= 'in' ( (lv_definitionSet_5_0= ruleDataTypeSymbolDefinitionSet ) ) )? ) | ( () otherlv_7= 'number' (otherlv_8= 'in' ( (lv_definitionSet_9_0= ruleDataTypeNumberDefinitionSet ) ) )? ) | ( () otherlv_11= 'text' (otherlv_12= 'in' ( (lv_definitionSet_13_0= ruleDataTypeTextDefinitionSet ) ) )? ) | ( () otherlv_15= 'time' (otherlv_16= 'in' ( (lv_definitionSet_17_0= ruleDataTypeTimeDefinitionSet ) ) )? ) | ( () otherlv_19= 'identifier' (otherlv_20= 'in' ( (lv_definitionSet_21_0= ruleDataTypeIdentifierDefinitionSet ) ) )? ) | ( () ( (otherlv_23= RULE_ID ) ) ) ) ( ( ( () 'collection' ) )=> ( () otherlv_25= 'collection' ) )* ( ( ( () 'set' ) )=> ( () otherlv_27= 'set' ) )* ( ( ( () 'list' ) )=> ( () otherlv_29= 'list' ) )* ( ( ( () 'queue' ) )=> ( () otherlv_31= 'queue' ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:467:1: ( ( ( () otherlv_1= 'void' ) | ( () otherlv_3= 'symbol' (otherlv_4= 'in' ( (lv_definitionSet_5_0= ruleDataTypeSymbolDefinitionSet ) ) )? ) | ( () otherlv_7= 'number' (otherlv_8= 'in' ( (lv_definitionSet_9_0= ruleDataTypeNumberDefinitionSet ) ) )? ) | ( () otherlv_11= 'text' (otherlv_12= 'in' ( (lv_definitionSet_13_0= ruleDataTypeTextDefinitionSet ) ) )? ) | ( () otherlv_15= 'time' (otherlv_16= 'in' ( (lv_definitionSet_17_0= ruleDataTypeTimeDefinitionSet ) ) )? ) | ( () otherlv_19= 'identifier' (otherlv_20= 'in' ( (lv_definitionSet_21_0= ruleDataTypeIdentifierDefinitionSet ) ) )? ) | ( () ( (otherlv_23= RULE_ID ) ) ) ) ( ( ( () 'collection' ) )=> ( () otherlv_25= 'collection' ) )* ( ( ( () 'set' ) )=> ( () otherlv_27= 'set' ) )* ( ( ( () 'list' ) )=> ( () otherlv_29= 'list' ) )* ( ( ( () 'queue' ) )=> ( () otherlv_31= 'queue' ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:467:2: ( ( () otherlv_1= 'void' ) | ( () otherlv_3= 'symbol' (otherlv_4= 'in' ( (lv_definitionSet_5_0= ruleDataTypeSymbolDefinitionSet ) ) )? ) | ( () otherlv_7= 'number' (otherlv_8= 'in' ( (lv_definitionSet_9_0= ruleDataTypeNumberDefinitionSet ) ) )? ) | ( () otherlv_11= 'text' (otherlv_12= 'in' ( (lv_definitionSet_13_0= ruleDataTypeTextDefinitionSet ) ) )? ) | ( () otherlv_15= 'time' (otherlv_16= 'in' ( (lv_definitionSet_17_0= ruleDataTypeTimeDefinitionSet ) ) )? ) | ( () otherlv_19= 'identifier' (otherlv_20= 'in' ( (lv_definitionSet_21_0= ruleDataTypeIdentifierDefinitionSet ) ) )? ) | ( () ( (otherlv_23= RULE_ID ) ) ) ) ( ( ( () 'collection' ) )=> ( () otherlv_25= 'collection' ) )* ( ( ( () 'set' ) )=> ( () otherlv_27= 'set' ) )* ( ( ( () 'list' ) )=> ( () otherlv_29= 'list' ) )* ( ( ( () 'queue' ) )=> ( () otherlv_31= 'queue' ) )*
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:467:2: ( ( () otherlv_1= 'void' ) | ( () otherlv_3= 'symbol' (otherlv_4= 'in' ( (lv_definitionSet_5_0= ruleDataTypeSymbolDefinitionSet ) ) )? ) | ( () otherlv_7= 'number' (otherlv_8= 'in' ( (lv_definitionSet_9_0= ruleDataTypeNumberDefinitionSet ) ) )? ) | ( () otherlv_11= 'text' (otherlv_12= 'in' ( (lv_definitionSet_13_0= ruleDataTypeTextDefinitionSet ) ) )? ) | ( () otherlv_15= 'time' (otherlv_16= 'in' ( (lv_definitionSet_17_0= ruleDataTypeTimeDefinitionSet ) ) )? ) | ( () otherlv_19= 'identifier' (otherlv_20= 'in' ( (lv_definitionSet_21_0= ruleDataTypeIdentifierDefinitionSet ) ) )? ) | ( () ( (otherlv_23= RULE_ID ) ) ) )
            int alt11=7;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt11=1;
                }
                break;
            case 17:
                {
                alt11=2;
                }
                break;
            case 19:
                {
                alt11=3;
                }
                break;
            case 20:
                {
                alt11=4;
                }
                break;
            case 21:
                {
                alt11=5;
                }
                break;
            case 22:
                {
                alt11=6;
                }
                break;
            case RULE_ID:
                {
                alt11=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:467:3: ( () otherlv_1= 'void' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:467:3: ( () otherlv_1= 'void' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:467:4: () otherlv_1= 'void'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:467:4: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:468:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataTypeAccess().getDataTypeVoidAction_0_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleDataType939); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDataTypeAccess().getVoidKeyword_0_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:478:6: ( () otherlv_3= 'symbol' (otherlv_4= 'in' ( (lv_definitionSet_5_0= ruleDataTypeSymbolDefinitionSet ) ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:478:6: ( () otherlv_3= 'symbol' (otherlv_4= 'in' ( (lv_definitionSet_5_0= ruleDataTypeSymbolDefinitionSet ) ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:478:7: () otherlv_3= 'symbol' (otherlv_4= 'in' ( (lv_definitionSet_5_0= ruleDataTypeSymbolDefinitionSet ) ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:478:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:479:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataTypeAccess().getDataTypeSymbolAction_0_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleDataType968); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDataTypeAccess().getSymbolKeyword_0_1_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:488:1: (otherlv_4= 'in' ( (lv_definitionSet_5_0= ruleDataTypeSymbolDefinitionSet ) ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==18) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:488:3: otherlv_4= 'in' ( (lv_definitionSet_5_0= ruleDataTypeSymbolDefinitionSet ) )
                            {
                            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleDataType981); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getDataTypeAccess().getInKeyword_0_1_2_0());
                                  
                            }
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:492:1: ( (lv_definitionSet_5_0= ruleDataTypeSymbolDefinitionSet ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:493:1: (lv_definitionSet_5_0= ruleDataTypeSymbolDefinitionSet )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:493:1: (lv_definitionSet_5_0= ruleDataTypeSymbolDefinitionSet )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:494:3: lv_definitionSet_5_0= ruleDataTypeSymbolDefinitionSet
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDataTypeAccess().getDefinitionSetDataTypeSymbolDefinitionSetParserRuleCall_0_1_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDataTypeSymbolDefinitionSet_in_ruleDataType1002);
                            lv_definitionSet_5_0=ruleDataTypeSymbolDefinitionSet();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"definitionSet",
                                      		lv_definitionSet_5_0, 
                                      		"DataTypeSymbolDefinitionSet");
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:511:6: ( () otherlv_7= 'number' (otherlv_8= 'in' ( (lv_definitionSet_9_0= ruleDataTypeNumberDefinitionSet ) ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:511:6: ( () otherlv_7= 'number' (otherlv_8= 'in' ( (lv_definitionSet_9_0= ruleDataTypeNumberDefinitionSet ) ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:511:7: () otherlv_7= 'number' (otherlv_8= 'in' ( (lv_definitionSet_9_0= ruleDataTypeNumberDefinitionSet ) ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:511:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:512:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataTypeAccess().getDataTypeNumberAction_0_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleDataType1033); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getDataTypeAccess().getNumberKeyword_0_2_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:521:1: (otherlv_8= 'in' ( (lv_definitionSet_9_0= ruleDataTypeNumberDefinitionSet ) ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==18) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:521:3: otherlv_8= 'in' ( (lv_definitionSet_9_0= ruleDataTypeNumberDefinitionSet ) )
                            {
                            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleDataType1046); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getDataTypeAccess().getInKeyword_0_2_2_0());
                                  
                            }
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:525:1: ( (lv_definitionSet_9_0= ruleDataTypeNumberDefinitionSet ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:526:1: (lv_definitionSet_9_0= ruleDataTypeNumberDefinitionSet )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:526:1: (lv_definitionSet_9_0= ruleDataTypeNumberDefinitionSet )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:527:3: lv_definitionSet_9_0= ruleDataTypeNumberDefinitionSet
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDataTypeAccess().getDefinitionSetDataTypeNumberDefinitionSetParserRuleCall_0_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDataTypeNumberDefinitionSet_in_ruleDataType1067);
                            lv_definitionSet_9_0=ruleDataTypeNumberDefinitionSet();

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
                                      		"DataTypeNumberDefinitionSet");
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
                case 4 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:544:6: ( () otherlv_11= 'text' (otherlv_12= 'in' ( (lv_definitionSet_13_0= ruleDataTypeTextDefinitionSet ) ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:544:6: ( () otherlv_11= 'text' (otherlv_12= 'in' ( (lv_definitionSet_13_0= ruleDataTypeTextDefinitionSet ) ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:544:7: () otherlv_11= 'text' (otherlv_12= 'in' ( (lv_definitionSet_13_0= ruleDataTypeTextDefinitionSet ) ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:544:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:545:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataTypeAccess().getDataTypeTextAction_0_3_0(),
                                  current);
                          
                    }

                    }

                    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleDataType1098); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getDataTypeAccess().getTextKeyword_0_3_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:554:1: (otherlv_12= 'in' ( (lv_definitionSet_13_0= ruleDataTypeTextDefinitionSet ) ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==18) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:554:3: otherlv_12= 'in' ( (lv_definitionSet_13_0= ruleDataTypeTextDefinitionSet ) )
                            {
                            otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleDataType1111); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_12, grammarAccess.getDataTypeAccess().getInKeyword_0_3_2_0());
                                  
                            }
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:558:1: ( (lv_definitionSet_13_0= ruleDataTypeTextDefinitionSet ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:559:1: (lv_definitionSet_13_0= ruleDataTypeTextDefinitionSet )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:559:1: (lv_definitionSet_13_0= ruleDataTypeTextDefinitionSet )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:560:3: lv_definitionSet_13_0= ruleDataTypeTextDefinitionSet
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDataTypeAccess().getDefinitionSetDataTypeTextDefinitionSetParserRuleCall_0_3_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDataTypeTextDefinitionSet_in_ruleDataType1132);
                            lv_definitionSet_13_0=ruleDataTypeTextDefinitionSet();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"definitionSet",
                                      		lv_definitionSet_13_0, 
                                      		"DataTypeTextDefinitionSet");
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
                case 5 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:577:6: ( () otherlv_15= 'time' (otherlv_16= 'in' ( (lv_definitionSet_17_0= ruleDataTypeTimeDefinitionSet ) ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:577:6: ( () otherlv_15= 'time' (otherlv_16= 'in' ( (lv_definitionSet_17_0= ruleDataTypeTimeDefinitionSet ) ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:577:7: () otherlv_15= 'time' (otherlv_16= 'in' ( (lv_definitionSet_17_0= ruleDataTypeTimeDefinitionSet ) ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:577:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:578:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataTypeAccess().getDataTypeTimeAction_0_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_15=(Token)match(input,21,FOLLOW_21_in_ruleDataType1163); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getDataTypeAccess().getTimeKeyword_0_4_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:587:1: (otherlv_16= 'in' ( (lv_definitionSet_17_0= ruleDataTypeTimeDefinitionSet ) ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==18) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:587:3: otherlv_16= 'in' ( (lv_definitionSet_17_0= ruleDataTypeTimeDefinitionSet ) )
                            {
                            otherlv_16=(Token)match(input,18,FOLLOW_18_in_ruleDataType1176); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_16, grammarAccess.getDataTypeAccess().getInKeyword_0_4_2_0());
                                  
                            }
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:591:1: ( (lv_definitionSet_17_0= ruleDataTypeTimeDefinitionSet ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:592:1: (lv_definitionSet_17_0= ruleDataTypeTimeDefinitionSet )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:592:1: (lv_definitionSet_17_0= ruleDataTypeTimeDefinitionSet )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:593:3: lv_definitionSet_17_0= ruleDataTypeTimeDefinitionSet
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDataTypeAccess().getDefinitionSetDataTypeTimeDefinitionSetParserRuleCall_0_4_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDataTypeTimeDefinitionSet_in_ruleDataType1197);
                            lv_definitionSet_17_0=ruleDataTypeTimeDefinitionSet();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"definitionSet",
                                      		lv_definitionSet_17_0, 
                                      		"DataTypeTimeDefinitionSet");
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
                case 6 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:610:6: ( () otherlv_19= 'identifier' (otherlv_20= 'in' ( (lv_definitionSet_21_0= ruleDataTypeIdentifierDefinitionSet ) ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:610:6: ( () otherlv_19= 'identifier' (otherlv_20= 'in' ( (lv_definitionSet_21_0= ruleDataTypeIdentifierDefinitionSet ) ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:610:7: () otherlv_19= 'identifier' (otherlv_20= 'in' ( (lv_definitionSet_21_0= ruleDataTypeIdentifierDefinitionSet ) ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:610:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:611:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataTypeAccess().getDataTypeIdentifierAction_0_5_0(),
                                  current);
                          
                    }

                    }

                    otherlv_19=(Token)match(input,22,FOLLOW_22_in_ruleDataType1228); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getDataTypeAccess().getIdentifierKeyword_0_5_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:620:1: (otherlv_20= 'in' ( (lv_definitionSet_21_0= ruleDataTypeIdentifierDefinitionSet ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==18) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:620:3: otherlv_20= 'in' ( (lv_definitionSet_21_0= ruleDataTypeIdentifierDefinitionSet ) )
                            {
                            otherlv_20=(Token)match(input,18,FOLLOW_18_in_ruleDataType1241); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_20, grammarAccess.getDataTypeAccess().getInKeyword_0_5_2_0());
                                  
                            }
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:624:1: ( (lv_definitionSet_21_0= ruleDataTypeIdentifierDefinitionSet ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:625:1: (lv_definitionSet_21_0= ruleDataTypeIdentifierDefinitionSet )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:625:1: (lv_definitionSet_21_0= ruleDataTypeIdentifierDefinitionSet )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:626:3: lv_definitionSet_21_0= ruleDataTypeIdentifierDefinitionSet
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDataTypeAccess().getDefinitionSetDataTypeIdentifierDefinitionSetParserRuleCall_0_5_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDataTypeIdentifierDefinitionSet_in_ruleDataType1262);
                            lv_definitionSet_21_0=ruleDataTypeIdentifierDefinitionSet();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"definitionSet",
                                      		lv_definitionSet_21_0, 
                                      		"DataTypeIdentifierDefinitionSet");
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
                case 7 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:643:6: ( () ( (otherlv_23= RULE_ID ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:643:6: ( () ( (otherlv_23= RULE_ID ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:643:7: () ( (otherlv_23= RULE_ID ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:643:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:644:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataTypeAccess().getDataTypeCustomAction_0_6_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:649:2: ( (otherlv_23= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:650:1: (otherlv_23= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:650:1: (otherlv_23= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:651:3: otherlv_23= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getDataTypeRule());
                      	        }
                              
                    }
                    otherlv_23=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataType1301); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_23, grammarAccess.getDataTypeAccess().getDefinitionDataTypeDefinitionCrossReference_0_6_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:662:4: ( ( ( () 'collection' ) )=> ( () otherlv_25= 'collection' ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) && (synpred1_InternalLil())) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:662:5: ( ( () 'collection' ) )=> ( () otherlv_25= 'collection' )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:664:5: ( () otherlv_25= 'collection' )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:664:6: () otherlv_25= 'collection'
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:664:6: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:665:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getDataTypeAccess().getDataTypeCollectionElementTypeAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_25=(Token)match(input,23,FOLLOW_23_in_ruleDataType1338); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_25, grammarAccess.getDataTypeAccess().getCollectionKeyword_1_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:674:4: ( ( ( () 'set' ) )=> ( () otherlv_27= 'set' ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) && (synpred2_InternalLil())) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:674:5: ( ( () 'set' ) )=> ( () otherlv_27= 'set' )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:676:5: ( () otherlv_27= 'set' )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:676:6: () otherlv_27= 'set'
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:676:6: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:677:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getDataTypeAccess().getDataTypeSetElementTypeAction_2_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_27=(Token)match(input,24,FOLLOW_24_in_ruleDataType1376); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_27, grammarAccess.getDataTypeAccess().getSetKeyword_2_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:686:4: ( ( ( () 'list' ) )=> ( () otherlv_29= 'list' ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) && (synpred3_InternalLil())) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:686:5: ( ( () 'list' ) )=> ( () otherlv_29= 'list' )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:688:5: ( () otherlv_29= 'list' )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:688:6: () otherlv_29= 'list'
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:688:6: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:689:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getDataTypeAccess().getDataTypeListElementTypeAction_3_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_29=(Token)match(input,25,FOLLOW_25_in_ruleDataType1414); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_29, grammarAccess.getDataTypeAccess().getListKeyword_3_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:698:4: ( ( ( () 'queue' ) )=> ( () otherlv_31= 'queue' ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) && (synpred4_InternalLil())) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:698:5: ( ( () 'queue' ) )=> ( () otherlv_31= 'queue' )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:700:5: ( () otherlv_31= 'queue' )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:700:6: () otherlv_31= 'queue'
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:700:6: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:701:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getDataTypeAccess().getDataTypeQueueElementTypeAction_4_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_31=(Token)match(input,26,FOLLOW_26_in_ruleDataType1452); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_31, grammarAccess.getDataTypeAccess().getQueueKeyword_4_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleDataTypeSymbolDefinitionSet"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:718:1: entryRuleDataTypeSymbolDefinitionSet returns [EObject current=null] : iv_ruleDataTypeSymbolDefinitionSet= ruleDataTypeSymbolDefinitionSet EOF ;
    public final EObject entryRuleDataTypeSymbolDefinitionSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeSymbolDefinitionSet = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:719:2: (iv_ruleDataTypeSymbolDefinitionSet= ruleDataTypeSymbolDefinitionSet EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:720:2: iv_ruleDataTypeSymbolDefinitionSet= ruleDataTypeSymbolDefinitionSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeSymbolDefinitionSetRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeSymbolDefinitionSet_in_entryRuleDataTypeSymbolDefinitionSet1491);
            iv_ruleDataTypeSymbolDefinitionSet=ruleDataTypeSymbolDefinitionSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeSymbolDefinitionSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeSymbolDefinitionSet1501); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataTypeSymbolDefinitionSet"


    // $ANTLR start "ruleDataTypeSymbolDefinitionSet"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:727:1: ruleDataTypeSymbolDefinitionSet returns [EObject current=null] : (otherlv_0= '{' ( (lv_element_1_0= ruleDataTypeSymbolDefinitionSetElement ) ) (otherlv_2= ',' ( (lv_element_3_0= ruleDataTypeSymbolDefinitionSetElement ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleDataTypeSymbolDefinitionSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_element_1_0 = null;

        EObject lv_element_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:730:28: ( (otherlv_0= '{' ( (lv_element_1_0= ruleDataTypeSymbolDefinitionSetElement ) ) (otherlv_2= ',' ( (lv_element_3_0= ruleDataTypeSymbolDefinitionSetElement ) ) )* otherlv_4= '}' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:731:1: (otherlv_0= '{' ( (lv_element_1_0= ruleDataTypeSymbolDefinitionSetElement ) ) (otherlv_2= ',' ( (lv_element_3_0= ruleDataTypeSymbolDefinitionSetElement ) ) )* otherlv_4= '}' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:731:1: (otherlv_0= '{' ( (lv_element_1_0= ruleDataTypeSymbolDefinitionSetElement ) ) (otherlv_2= ',' ( (lv_element_3_0= ruleDataTypeSymbolDefinitionSetElement ) ) )* otherlv_4= '}' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:731:3: otherlv_0= '{' ( (lv_element_1_0= ruleDataTypeSymbolDefinitionSetElement ) ) (otherlv_2= ',' ( (lv_element_3_0= ruleDataTypeSymbolDefinitionSetElement ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleDataTypeSymbolDefinitionSet1538); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDataTypeSymbolDefinitionSetAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:735:1: ( (lv_element_1_0= ruleDataTypeSymbolDefinitionSetElement ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:736:1: (lv_element_1_0= ruleDataTypeSymbolDefinitionSetElement )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:736:1: (lv_element_1_0= ruleDataTypeSymbolDefinitionSetElement )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:737:3: lv_element_1_0= ruleDataTypeSymbolDefinitionSetElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDataTypeSymbolDefinitionSetAccess().getElementDataTypeSymbolDefinitionSetElementParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDataTypeSymbolDefinitionSetElement_in_ruleDataTypeSymbolDefinitionSet1559);
            lv_element_1_0=ruleDataTypeSymbolDefinitionSetElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDataTypeSymbolDefinitionSetRule());
              	        }
                     		add(
                     			current, 
                     			"element",
                      		lv_element_1_0, 
                      		"DataTypeSymbolDefinitionSetElement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:753:2: (otherlv_2= ',' ( (lv_element_3_0= ruleDataTypeSymbolDefinitionSetElement ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==28) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:753:4: otherlv_2= ',' ( (lv_element_3_0= ruleDataTypeSymbolDefinitionSetElement ) )
            	    {
            	    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleDataTypeSymbolDefinitionSet1572); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getDataTypeSymbolDefinitionSetAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:757:1: ( (lv_element_3_0= ruleDataTypeSymbolDefinitionSetElement ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:758:1: (lv_element_3_0= ruleDataTypeSymbolDefinitionSetElement )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:758:1: (lv_element_3_0= ruleDataTypeSymbolDefinitionSetElement )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:759:3: lv_element_3_0= ruleDataTypeSymbolDefinitionSetElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDataTypeSymbolDefinitionSetAccess().getElementDataTypeSymbolDefinitionSetElementParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDataTypeSymbolDefinitionSetElement_in_ruleDataTypeSymbolDefinitionSet1593);
            	    lv_element_3_0=ruleDataTypeSymbolDefinitionSetElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDataTypeSymbolDefinitionSetRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"element",
            	              		lv_element_3_0, 
            	              		"DataTypeSymbolDefinitionSetElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleDataTypeSymbolDefinitionSet1607); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getDataTypeSymbolDefinitionSetAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleDataTypeSymbolDefinitionSet"


    // $ANTLR start "entryRuleDataTypeSymbolDefinitionSetElement"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:787:1: entryRuleDataTypeSymbolDefinitionSetElement returns [EObject current=null] : iv_ruleDataTypeSymbolDefinitionSetElement= ruleDataTypeSymbolDefinitionSetElement EOF ;
    public final EObject entryRuleDataTypeSymbolDefinitionSetElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeSymbolDefinitionSetElement = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:788:2: (iv_ruleDataTypeSymbolDefinitionSetElement= ruleDataTypeSymbolDefinitionSetElement EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:789:2: iv_ruleDataTypeSymbolDefinitionSetElement= ruleDataTypeSymbolDefinitionSetElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeSymbolDefinitionSetElementRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeSymbolDefinitionSetElement_in_entryRuleDataTypeSymbolDefinitionSetElement1643);
            iv_ruleDataTypeSymbolDefinitionSetElement=ruleDataTypeSymbolDefinitionSetElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeSymbolDefinitionSetElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeSymbolDefinitionSetElement1653); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataTypeSymbolDefinitionSetElement"


    // $ANTLR start "ruleDataTypeSymbolDefinitionSetElement"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:796:1: ruleDataTypeSymbolDefinitionSetElement returns [EObject current=null] : ( () otherlv_1= '#' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDataTypeSymbolDefinitionSetElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:799:28: ( ( () otherlv_1= '#' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:800:1: ( () otherlv_1= '#' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:800:1: ( () otherlv_1= '#' ( (lv_name_2_0= RULE_ID ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:800:2: () otherlv_1= '#' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:800:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:801:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDataTypeSymbolDefinitionSetElementAccess().getDataDefinitionEnumElementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleDataTypeSymbolDefinitionSetElement1699); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDataTypeSymbolDefinitionSetElementAccess().getNumberSignKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:810:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:811:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:811:1: (lv_name_2_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:812:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataTypeSymbolDefinitionSetElement1716); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getDataTypeSymbolDefinitionSetElementAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDataTypeSymbolDefinitionSetElementRule());
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
    // $ANTLR end "ruleDataTypeSymbolDefinitionSetElement"


    // $ANTLR start "entryRuleDataTypeNumberDefinitionSet"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:836:1: entryRuleDataTypeNumberDefinitionSet returns [EObject current=null] : iv_ruleDataTypeNumberDefinitionSet= ruleDataTypeNumberDefinitionSet EOF ;
    public final EObject entryRuleDataTypeNumberDefinitionSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeNumberDefinitionSet = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:837:2: (iv_ruleDataTypeNumberDefinitionSet= ruleDataTypeNumberDefinitionSet EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:838:2: iv_ruleDataTypeNumberDefinitionSet= ruleDataTypeNumberDefinitionSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeNumberDefinitionSetRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeNumberDefinitionSet_in_entryRuleDataTypeNumberDefinitionSet1757);
            iv_ruleDataTypeNumberDefinitionSet=ruleDataTypeNumberDefinitionSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeNumberDefinitionSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeNumberDefinitionSet1767); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataTypeNumberDefinitionSet"


    // $ANTLR start "ruleDataTypeNumberDefinitionSet"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:845:1: ruleDataTypeNumberDefinitionSet returns [EObject current=null] : ( ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralNumber ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralNumber ) ) )* otherlv_5= '}' ) | ( () otherlv_7= '[' ( (lv_inf_8_0= ruleLiteralNumber ) ) otherlv_9= ',' ( (lv_sup_10_0= ruleLiteralNumber ) ) otherlv_11= ']' ) ) ;
    public final EObject ruleDataTypeNumberDefinitionSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_element_2_0 = null;

        EObject lv_element_4_0 = null;

        EObject lv_inf_8_0 = null;

        EObject lv_sup_10_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:848:28: ( ( ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralNumber ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralNumber ) ) )* otherlv_5= '}' ) | ( () otherlv_7= '[' ( (lv_inf_8_0= ruleLiteralNumber ) ) otherlv_9= ',' ( (lv_sup_10_0= ruleLiteralNumber ) ) otherlv_11= ']' ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:849:1: ( ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralNumber ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralNumber ) ) )* otherlv_5= '}' ) | ( () otherlv_7= '[' ( (lv_inf_8_0= ruleLiteralNumber ) ) otherlv_9= ',' ( (lv_sup_10_0= ruleLiteralNumber ) ) otherlv_11= ']' ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:849:1: ( ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralNumber ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralNumber ) ) )* otherlv_5= '}' ) | ( () otherlv_7= '[' ( (lv_inf_8_0= ruleLiteralNumber ) ) otherlv_9= ',' ( (lv_sup_10_0= ruleLiteralNumber ) ) otherlv_11= ']' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            else if ( (LA18_0==31) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:849:2: ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralNumber ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralNumber ) ) )* otherlv_5= '}' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:849:2: ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralNumber ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralNumber ) ) )* otherlv_5= '}' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:849:3: () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralNumber ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralNumber ) ) )* otherlv_5= '}'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:849:3: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:850:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataTypeNumberDefinitionSetAccess().getDataTypeNumberDefinitionSetSetAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleDataTypeNumberDefinitionSet1814); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDataTypeNumberDefinitionSetAccess().getLeftCurlyBracketKeyword_0_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:859:1: ( (lv_element_2_0= ruleLiteralNumber ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:860:1: (lv_element_2_0= ruleLiteralNumber )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:860:1: (lv_element_2_0= ruleLiteralNumber )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:861:3: lv_element_2_0= ruleLiteralNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataTypeNumberDefinitionSetAccess().getElementLiteralNumberParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralNumber_in_ruleDataTypeNumberDefinitionSet1835);
                    lv_element_2_0=ruleLiteralNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataTypeNumberDefinitionSetRule());
                      	        }
                             		add(
                             			current, 
                             			"element",
                              		lv_element_2_0, 
                              		"LiteralNumber");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:877:2: (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralNumber ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==28) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:877:4: otherlv_3= ',' ( (lv_element_4_0= ruleLiteralNumber ) )
                    	    {
                    	    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleDataTypeNumberDefinitionSet1848); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getDataTypeNumberDefinitionSetAccess().getCommaKeyword_0_3_0());
                    	          
                    	    }
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:881:1: ( (lv_element_4_0= ruleLiteralNumber ) )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:882:1: (lv_element_4_0= ruleLiteralNumber )
                    	    {
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:882:1: (lv_element_4_0= ruleLiteralNumber )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:883:3: lv_element_4_0= ruleLiteralNumber
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDataTypeNumberDefinitionSetAccess().getElementLiteralNumberParserRuleCall_0_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleLiteralNumber_in_ruleDataTypeNumberDefinitionSet1869);
                    	    lv_element_4_0=ruleLiteralNumber();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDataTypeNumberDefinitionSetRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"element",
                    	              		lv_element_4_0, 
                    	              		"LiteralNumber");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleDataTypeNumberDefinitionSet1883); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getDataTypeNumberDefinitionSetAccess().getRightCurlyBracketKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:904:6: ( () otherlv_7= '[' ( (lv_inf_8_0= ruleLiteralNumber ) ) otherlv_9= ',' ( (lv_sup_10_0= ruleLiteralNumber ) ) otherlv_11= ']' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:904:6: ( () otherlv_7= '[' ( (lv_inf_8_0= ruleLiteralNumber ) ) otherlv_9= ',' ( (lv_sup_10_0= ruleLiteralNumber ) ) otherlv_11= ']' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:904:7: () otherlv_7= '[' ( (lv_inf_8_0= ruleLiteralNumber ) ) otherlv_9= ',' ( (lv_sup_10_0= ruleLiteralNumber ) ) otherlv_11= ']'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:904:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:905:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataTypeNumberDefinitionSetAccess().getDataTypeNumberDefinitionSetIntervalAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_7=(Token)match(input,31,FOLLOW_31_in_ruleDataTypeNumberDefinitionSet1912); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getDataTypeNumberDefinitionSetAccess().getLeftSquareBracketKeyword_1_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:914:1: ( (lv_inf_8_0= ruleLiteralNumber ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:915:1: (lv_inf_8_0= ruleLiteralNumber )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:915:1: (lv_inf_8_0= ruleLiteralNumber )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:916:3: lv_inf_8_0= ruleLiteralNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataTypeNumberDefinitionSetAccess().getInfLiteralNumberParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralNumber_in_ruleDataTypeNumberDefinitionSet1933);
                    lv_inf_8_0=ruleLiteralNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataTypeNumberDefinitionSetRule());
                      	        }
                             		set(
                             			current, 
                             			"inf",
                              		lv_inf_8_0, 
                              		"LiteralNumber");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleDataTypeNumberDefinitionSet1945); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getDataTypeNumberDefinitionSetAccess().getCommaKeyword_1_3());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:936:1: ( (lv_sup_10_0= ruleLiteralNumber ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:937:1: (lv_sup_10_0= ruleLiteralNumber )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:937:1: (lv_sup_10_0= ruleLiteralNumber )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:938:3: lv_sup_10_0= ruleLiteralNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataTypeNumberDefinitionSetAccess().getSupLiteralNumberParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralNumber_in_ruleDataTypeNumberDefinitionSet1966);
                    lv_sup_10_0=ruleLiteralNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataTypeNumberDefinitionSetRule());
                      	        }
                             		set(
                             			current, 
                             			"sup",
                              		lv_sup_10_0, 
                              		"LiteralNumber");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,32,FOLLOW_32_in_ruleDataTypeNumberDefinitionSet1978); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getDataTypeNumberDefinitionSetAccess().getRightSquareBracketKeyword_1_5());
                          
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
    // $ANTLR end "ruleDataTypeNumberDefinitionSet"


    // $ANTLR start "entryRuleDataTypeTextDefinitionSet"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:966:1: entryRuleDataTypeTextDefinitionSet returns [EObject current=null] : iv_ruleDataTypeTextDefinitionSet= ruleDataTypeTextDefinitionSet EOF ;
    public final EObject entryRuleDataTypeTextDefinitionSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeTextDefinitionSet = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:967:2: (iv_ruleDataTypeTextDefinitionSet= ruleDataTypeTextDefinitionSet EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:968:2: iv_ruleDataTypeTextDefinitionSet= ruleDataTypeTextDefinitionSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeTextDefinitionSetRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeTextDefinitionSet_in_entryRuleDataTypeTextDefinitionSet2015);
            iv_ruleDataTypeTextDefinitionSet=ruleDataTypeTextDefinitionSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeTextDefinitionSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeTextDefinitionSet2025); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataTypeTextDefinitionSet"


    // $ANTLR start "ruleDataTypeTextDefinitionSet"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:975:1: ruleDataTypeTextDefinitionSet returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralText ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralText ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleDataTypeTextDefinitionSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_2_0 = null;

        EObject lv_element_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:978:28: ( ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralText ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralText ) ) )* otherlv_5= '}' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:979:1: ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralText ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralText ) ) )* otherlv_5= '}' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:979:1: ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralText ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralText ) ) )* otherlv_5= '}' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:979:2: () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralText ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralText ) ) )* otherlv_5= '}'
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:979:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:980:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDataTypeTextDefinitionSetAccess().getDataTypeTextDefinitionSetSetAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleDataTypeTextDefinitionSet2071); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDataTypeTextDefinitionSetAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:989:1: ( (lv_element_2_0= ruleLiteralText ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:990:1: (lv_element_2_0= ruleLiteralText )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:990:1: (lv_element_2_0= ruleLiteralText )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:991:3: lv_element_2_0= ruleLiteralText
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDataTypeTextDefinitionSetAccess().getElementLiteralTextParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteralText_in_ruleDataTypeTextDefinitionSet2092);
            lv_element_2_0=ruleLiteralText();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDataTypeTextDefinitionSetRule());
              	        }
                     		add(
                     			current, 
                     			"element",
                      		lv_element_2_0, 
                      		"LiteralText");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1007:2: (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralText ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==28) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1007:4: otherlv_3= ',' ( (lv_element_4_0= ruleLiteralText ) )
            	    {
            	    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleDataTypeTextDefinitionSet2105); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getDataTypeTextDefinitionSetAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1011:1: ( (lv_element_4_0= ruleLiteralText ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1012:1: (lv_element_4_0= ruleLiteralText )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1012:1: (lv_element_4_0= ruleLiteralText )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1013:3: lv_element_4_0= ruleLiteralText
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDataTypeTextDefinitionSetAccess().getElementLiteralTextParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLiteralText_in_ruleDataTypeTextDefinitionSet2126);
            	    lv_element_4_0=ruleLiteralText();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDataTypeTextDefinitionSetRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"element",
            	              		lv_element_4_0, 
            	              		"LiteralText");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleDataTypeTextDefinitionSet2140); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDataTypeTextDefinitionSetAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleDataTypeTextDefinitionSet"


    // $ANTLR start "entryRuleDataTypeTimeDefinitionSet"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1041:1: entryRuleDataTypeTimeDefinitionSet returns [EObject current=null] : iv_ruleDataTypeTimeDefinitionSet= ruleDataTypeTimeDefinitionSet EOF ;
    public final EObject entryRuleDataTypeTimeDefinitionSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeTimeDefinitionSet = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1042:2: (iv_ruleDataTypeTimeDefinitionSet= ruleDataTypeTimeDefinitionSet EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1043:2: iv_ruleDataTypeTimeDefinitionSet= ruleDataTypeTimeDefinitionSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeTimeDefinitionSetRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeTimeDefinitionSet_in_entryRuleDataTypeTimeDefinitionSet2176);
            iv_ruleDataTypeTimeDefinitionSet=ruleDataTypeTimeDefinitionSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeTimeDefinitionSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeTimeDefinitionSet2186); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataTypeTimeDefinitionSet"


    // $ANTLR start "ruleDataTypeTimeDefinitionSet"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1050:1: ruleDataTypeTimeDefinitionSet returns [EObject current=null] : ( ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralTime ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralTime ) ) )* otherlv_5= '}' ) | ( () otherlv_7= '[' ( (lv_inf_8_0= ruleLiteralTime ) ) otherlv_9= ',' ( (lv_sup_10_0= ruleLiteralTime ) ) otherlv_11= ']' ) ) ;
    public final EObject ruleDataTypeTimeDefinitionSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_element_2_0 = null;

        EObject lv_element_4_0 = null;

        EObject lv_inf_8_0 = null;

        EObject lv_sup_10_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1053:28: ( ( ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralTime ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralTime ) ) )* otherlv_5= '}' ) | ( () otherlv_7= '[' ( (lv_inf_8_0= ruleLiteralTime ) ) otherlv_9= ',' ( (lv_sup_10_0= ruleLiteralTime ) ) otherlv_11= ']' ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1054:1: ( ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralTime ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralTime ) ) )* otherlv_5= '}' ) | ( () otherlv_7= '[' ( (lv_inf_8_0= ruleLiteralTime ) ) otherlv_9= ',' ( (lv_sup_10_0= ruleLiteralTime ) ) otherlv_11= ']' ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1054:1: ( ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralTime ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralTime ) ) )* otherlv_5= '}' ) | ( () otherlv_7= '[' ( (lv_inf_8_0= ruleLiteralTime ) ) otherlv_9= ',' ( (lv_sup_10_0= ruleLiteralTime ) ) otherlv_11= ']' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            else if ( (LA21_0==31) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1054:2: ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralTime ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralTime ) ) )* otherlv_5= '}' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1054:2: ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralTime ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralTime ) ) )* otherlv_5= '}' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1054:3: () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralTime ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralTime ) ) )* otherlv_5= '}'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1054:3: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1055:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataTypeTimeDefinitionSetAccess().getDataTypeTimeDefinitionSetSetAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleDataTypeTimeDefinitionSet2233); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDataTypeTimeDefinitionSetAccess().getLeftCurlyBracketKeyword_0_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1064:1: ( (lv_element_2_0= ruleLiteralTime ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1065:1: (lv_element_2_0= ruleLiteralTime )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1065:1: (lv_element_2_0= ruleLiteralTime )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1066:3: lv_element_2_0= ruleLiteralTime
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataTypeTimeDefinitionSetAccess().getElementLiteralTimeParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralTime_in_ruleDataTypeTimeDefinitionSet2254);
                    lv_element_2_0=ruleLiteralTime();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataTypeTimeDefinitionSetRule());
                      	        }
                             		add(
                             			current, 
                             			"element",
                              		lv_element_2_0, 
                              		"LiteralTime");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1082:2: (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralTime ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==28) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1082:4: otherlv_3= ',' ( (lv_element_4_0= ruleLiteralTime ) )
                    	    {
                    	    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleDataTypeTimeDefinitionSet2267); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getDataTypeTimeDefinitionSetAccess().getCommaKeyword_0_3_0());
                    	          
                    	    }
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1086:1: ( (lv_element_4_0= ruleLiteralTime ) )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1087:1: (lv_element_4_0= ruleLiteralTime )
                    	    {
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1087:1: (lv_element_4_0= ruleLiteralTime )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1088:3: lv_element_4_0= ruleLiteralTime
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDataTypeTimeDefinitionSetAccess().getElementLiteralTimeParserRuleCall_0_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleLiteralTime_in_ruleDataTypeTimeDefinitionSet2288);
                    	    lv_element_4_0=ruleLiteralTime();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDataTypeTimeDefinitionSetRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"element",
                    	              		lv_element_4_0, 
                    	              		"LiteralTime");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleDataTypeTimeDefinitionSet2302); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getDataTypeTimeDefinitionSetAccess().getRightCurlyBracketKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1109:6: ( () otherlv_7= '[' ( (lv_inf_8_0= ruleLiteralTime ) ) otherlv_9= ',' ( (lv_sup_10_0= ruleLiteralTime ) ) otherlv_11= ']' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1109:6: ( () otherlv_7= '[' ( (lv_inf_8_0= ruleLiteralTime ) ) otherlv_9= ',' ( (lv_sup_10_0= ruleLiteralTime ) ) otherlv_11= ']' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1109:7: () otherlv_7= '[' ( (lv_inf_8_0= ruleLiteralTime ) ) otherlv_9= ',' ( (lv_sup_10_0= ruleLiteralTime ) ) otherlv_11= ']'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1109:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1110:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDataTypeTimeDefinitionSetAccess().getDataTypeTimeDefinitionSetIntervalAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_7=(Token)match(input,31,FOLLOW_31_in_ruleDataTypeTimeDefinitionSet2331); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getDataTypeTimeDefinitionSetAccess().getLeftSquareBracketKeyword_1_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1119:1: ( (lv_inf_8_0= ruleLiteralTime ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1120:1: (lv_inf_8_0= ruleLiteralTime )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1120:1: (lv_inf_8_0= ruleLiteralTime )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1121:3: lv_inf_8_0= ruleLiteralTime
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataTypeTimeDefinitionSetAccess().getInfLiteralTimeParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralTime_in_ruleDataTypeTimeDefinitionSet2352);
                    lv_inf_8_0=ruleLiteralTime();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataTypeTimeDefinitionSetRule());
                      	        }
                             		set(
                             			current, 
                             			"inf",
                              		lv_inf_8_0, 
                              		"LiteralTime");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleDataTypeTimeDefinitionSet2364); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getDataTypeTimeDefinitionSetAccess().getCommaKeyword_1_3());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1141:1: ( (lv_sup_10_0= ruleLiteralTime ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1142:1: (lv_sup_10_0= ruleLiteralTime )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1142:1: (lv_sup_10_0= ruleLiteralTime )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1143:3: lv_sup_10_0= ruleLiteralTime
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataTypeTimeDefinitionSetAccess().getSupLiteralTimeParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralTime_in_ruleDataTypeTimeDefinitionSet2385);
                    lv_sup_10_0=ruleLiteralTime();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataTypeTimeDefinitionSetRule());
                      	        }
                             		set(
                             			current, 
                             			"sup",
                              		lv_sup_10_0, 
                              		"LiteralTime");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,32,FOLLOW_32_in_ruleDataTypeTimeDefinitionSet2397); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getDataTypeTimeDefinitionSetAccess().getRightSquareBracketKeyword_1_5());
                          
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
    // $ANTLR end "ruleDataTypeTimeDefinitionSet"


    // $ANTLR start "entryRuleDataTypeIdentifierDefinitionSet"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1171:1: entryRuleDataTypeIdentifierDefinitionSet returns [EObject current=null] : iv_ruleDataTypeIdentifierDefinitionSet= ruleDataTypeIdentifierDefinitionSet EOF ;
    public final EObject entryRuleDataTypeIdentifierDefinitionSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeIdentifierDefinitionSet = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1172:2: (iv_ruleDataTypeIdentifierDefinitionSet= ruleDataTypeIdentifierDefinitionSet EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1173:2: iv_ruleDataTypeIdentifierDefinitionSet= ruleDataTypeIdentifierDefinitionSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeIdentifierDefinitionSetRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeIdentifierDefinitionSet_in_entryRuleDataTypeIdentifierDefinitionSet2434);
            iv_ruleDataTypeIdentifierDefinitionSet=ruleDataTypeIdentifierDefinitionSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeIdentifierDefinitionSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeIdentifierDefinitionSet2444); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataTypeIdentifierDefinitionSet"


    // $ANTLR start "ruleDataTypeIdentifierDefinitionSet"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1180:1: ruleDataTypeIdentifierDefinitionSet returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralNumber ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralNumber ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleDataTypeIdentifierDefinitionSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_2_0 = null;

        EObject lv_element_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1183:28: ( ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralNumber ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralNumber ) ) )* otherlv_5= '}' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1184:1: ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralNumber ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralNumber ) ) )* otherlv_5= '}' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1184:1: ( () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralNumber ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralNumber ) ) )* otherlv_5= '}' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1184:2: () otherlv_1= '{' ( (lv_element_2_0= ruleLiteralNumber ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralNumber ) ) )* otherlv_5= '}'
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1184:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1185:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDataTypeIdentifierDefinitionSetAccess().getDataTypeIdentifierDefinitionSetSetAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleDataTypeIdentifierDefinitionSet2490); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDataTypeIdentifierDefinitionSetAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1194:1: ( (lv_element_2_0= ruleLiteralNumber ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1195:1: (lv_element_2_0= ruleLiteralNumber )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1195:1: (lv_element_2_0= ruleLiteralNumber )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1196:3: lv_element_2_0= ruleLiteralNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDataTypeIdentifierDefinitionSetAccess().getElementLiteralNumberParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteralNumber_in_ruleDataTypeIdentifierDefinitionSet2511);
            lv_element_2_0=ruleLiteralNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDataTypeIdentifierDefinitionSetRule());
              	        }
                     		add(
                     			current, 
                     			"element",
                      		lv_element_2_0, 
                      		"LiteralNumber");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1212:2: (otherlv_3= ',' ( (lv_element_4_0= ruleLiteralNumber ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==28) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1212:4: otherlv_3= ',' ( (lv_element_4_0= ruleLiteralNumber ) )
            	    {
            	    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleDataTypeIdentifierDefinitionSet2524); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getDataTypeIdentifierDefinitionSetAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1216:1: ( (lv_element_4_0= ruleLiteralNumber ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1217:1: (lv_element_4_0= ruleLiteralNumber )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1217:1: (lv_element_4_0= ruleLiteralNumber )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1218:3: lv_element_4_0= ruleLiteralNumber
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDataTypeIdentifierDefinitionSetAccess().getElementLiteralNumberParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLiteralNumber_in_ruleDataTypeIdentifierDefinitionSet2545);
            	    lv_element_4_0=ruleLiteralNumber();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDataTypeIdentifierDefinitionSetRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"element",
            	              		lv_element_4_0, 
            	              		"LiteralNumber");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleDataTypeIdentifierDefinitionSet2559); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDataTypeIdentifierDefinitionSetAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleDataTypeIdentifierDefinitionSet"


    // $ANTLR start "entryRuleDataInstanceDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1246:1: entryRuleDataInstanceDeclaration returns [EObject current=null] : iv_ruleDataInstanceDeclaration= ruleDataInstanceDeclaration EOF ;
    public final EObject entryRuleDataInstanceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataInstanceDeclaration = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1247:2: (iv_ruleDataInstanceDeclaration= ruleDataInstanceDeclaration EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1248:2: iv_ruleDataInstanceDeclaration= ruleDataInstanceDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataInstanceDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDataInstanceDeclaration_in_entryRuleDataInstanceDeclaration2595);
            iv_ruleDataInstanceDeclaration=ruleDataInstanceDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataInstanceDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataInstanceDeclaration2605); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataInstanceDeclaration"


    // $ANTLR start "ruleDataInstanceDeclaration"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1255:1: ruleDataInstanceDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) ) ;
    public final EObject ruleDataInstanceDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1258:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1259:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1259:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1259:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1259:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1260:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1260:1: (lv_name_0_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1261:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataInstanceDeclaration2647); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getDataInstanceDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDataInstanceDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleDataInstanceDeclaration2664); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDataInstanceDeclarationAccess().getColonKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1281:1: ( (lv_type_2_0= ruleDataType ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1282:1: (lv_type_2_0= ruleDataType )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1282:1: (lv_type_2_0= ruleDataType )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1283:3: lv_type_2_0= ruleDataType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDataInstanceDeclarationAccess().getTypeDataTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDataType_in_ruleDataInstanceDeclaration2685);
            lv_type_2_0=ruleDataType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDataInstanceDeclarationRule());
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
    // $ANTLR end "ruleDataInstanceDeclaration"


    // $ANTLR start "entryRuleInteractorTypeDefinition"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1307:1: entryRuleInteractorTypeDefinition returns [EObject current=null] : iv_ruleInteractorTypeDefinition= ruleInteractorTypeDefinition EOF ;
    public final EObject entryRuleInteractorTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorTypeDefinition = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1308:2: (iv_ruleInteractorTypeDefinition= ruleInteractorTypeDefinition EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1309:2: iv_ruleInteractorTypeDefinition= ruleInteractorTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorTypeDefinition_in_entryRuleInteractorTypeDefinition2721);
            iv_ruleInteractorTypeDefinition=ruleInteractorTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorTypeDefinition2731); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorTypeDefinition"


    // $ANTLR start "ruleInteractorTypeDefinition"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1316:1: ruleInteractorTypeDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'interactor' otherlv_2= ':' ( ( (lv_actor_3_0= ruleInteractorActor ) ) | ( (lv_data_4_0= ruleInteractorData ) ) | ( (lv_component_5_0= ruleInteractorComponent ) ) | ( (lv_behavior_6_0= ruleInteractorBehavior ) ) )* ) ;
    public final EObject ruleInteractorTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_actor_3_0 = null;

        EObject lv_data_4_0 = null;

        EObject lv_component_5_0 = null;

        EObject lv_behavior_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1319:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'interactor' otherlv_2= ':' ( ( (lv_actor_3_0= ruleInteractorActor ) ) | ( (lv_data_4_0= ruleInteractorData ) ) | ( (lv_component_5_0= ruleInteractorComponent ) ) | ( (lv_behavior_6_0= ruleInteractorBehavior ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1320:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'interactor' otherlv_2= ':' ( ( (lv_actor_3_0= ruleInteractorActor ) ) | ( (lv_data_4_0= ruleInteractorData ) ) | ( (lv_component_5_0= ruleInteractorComponent ) ) | ( (lv_behavior_6_0= ruleInteractorBehavior ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1320:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'interactor' otherlv_2= ':' ( ( (lv_actor_3_0= ruleInteractorActor ) ) | ( (lv_data_4_0= ruleInteractorData ) ) | ( (lv_component_5_0= ruleInteractorComponent ) ) | ( (lv_behavior_6_0= ruleInteractorBehavior ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1320:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'interactor' otherlv_2= ':' ( ( (lv_actor_3_0= ruleInteractorActor ) ) | ( (lv_data_4_0= ruleInteractorData ) ) | ( (lv_component_5_0= ruleInteractorComponent ) ) | ( (lv_behavior_6_0= ruleInteractorBehavior ) ) )*
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1320:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1321:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1321:1: (lv_name_0_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1322:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractorTypeDefinition2773); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getInteractorTypeDefinitionAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInteractorTypeDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleInteractorTypeDefinition2790); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInteractorTypeDefinitionAccess().getInteractorKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleInteractorTypeDefinition2802); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInteractorTypeDefinitionAccess().getColonKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1346:1: ( ( (lv_actor_3_0= ruleInteractorActor ) ) | ( (lv_data_4_0= ruleInteractorData ) ) | ( (lv_component_5_0= ruleInteractorComponent ) ) | ( (lv_behavior_6_0= ruleInteractorBehavior ) ) )*
            loop23:
            do {
                int alt23=5;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    int LA23_2 = input.LA(2);

                    if ( (LA23_2==12) ) {
                        switch ( input.LA(3) ) {
                        case 16:
                        case 17:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            {
                            alt23=2;
                            }
                            break;
                        case RULE_ID:
                            {
                            switch ( input.LA(4) ) {
                            case 11:
                                {
                                alt23=1;
                                }
                                break;
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 37:
                            case 38:
                            case 39:
                                {
                                alt23=2;
                                }
                                break;
                            case 33:
                                {
                                alt23=3;
                                }
                                break;

                            }

                            }
                            break;
                        case 13:
                        case 14:
                            {
                            alt23=1;
                            }
                            break;

                        }

                    }


                }
                else if ( (LA23_0==49||LA23_0==51) ) {
                    alt23=4;
                }


                switch (alt23) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1346:2: ( (lv_actor_3_0= ruleInteractorActor ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1346:2: ( (lv_actor_3_0= ruleInteractorActor ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1347:1: (lv_actor_3_0= ruleInteractorActor )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1347:1: (lv_actor_3_0= ruleInteractorActor )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1348:3: lv_actor_3_0= ruleInteractorActor
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInteractorTypeDefinitionAccess().getActorInteractorActorParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInteractorActor_in_ruleInteractorTypeDefinition2824);
            	    lv_actor_3_0=ruleInteractorActor();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInteractorTypeDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"actor",
            	              		lv_actor_3_0, 
            	              		"InteractorActor");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1365:6: ( (lv_data_4_0= ruleInteractorData ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1365:6: ( (lv_data_4_0= ruleInteractorData ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1366:1: (lv_data_4_0= ruleInteractorData )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1366:1: (lv_data_4_0= ruleInteractorData )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1367:3: lv_data_4_0= ruleInteractorData
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInteractorTypeDefinitionAccess().getDataInteractorDataParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInteractorData_in_ruleInteractorTypeDefinition2851);
            	    lv_data_4_0=ruleInteractorData();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInteractorTypeDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"data",
            	              		lv_data_4_0, 
            	              		"InteractorData");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1384:6: ( (lv_component_5_0= ruleInteractorComponent ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1384:6: ( (lv_component_5_0= ruleInteractorComponent ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1385:1: (lv_component_5_0= ruleInteractorComponent )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1385:1: (lv_component_5_0= ruleInteractorComponent )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1386:3: lv_component_5_0= ruleInteractorComponent
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInteractorTypeDefinitionAccess().getComponentInteractorComponentParserRuleCall_3_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInteractorComponent_in_ruleInteractorTypeDefinition2878);
            	    lv_component_5_0=ruleInteractorComponent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInteractorTypeDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"component",
            	              		lv_component_5_0, 
            	              		"InteractorComponent");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1403:6: ( (lv_behavior_6_0= ruleInteractorBehavior ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1403:6: ( (lv_behavior_6_0= ruleInteractorBehavior ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1404:1: (lv_behavior_6_0= ruleInteractorBehavior )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1404:1: (lv_behavior_6_0= ruleInteractorBehavior )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1405:3: lv_behavior_6_0= ruleInteractorBehavior
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInteractorTypeDefinitionAccess().getBehaviorInteractorBehaviorParserRuleCall_3_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInteractorBehavior_in_ruleInteractorTypeDefinition2905);
            	    lv_behavior_6_0=ruleInteractorBehavior();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInteractorTypeDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"behavior",
            	              		lv_behavior_6_0, 
            	              		"InteractorBehavior");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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
    // $ANTLR end "ruleInteractorTypeDefinition"


    // $ANTLR start "entryRuleInteractorType"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1429:1: entryRuleInteractorType returns [EObject current=null] : iv_ruleInteractorType= ruleInteractorType EOF ;
    public final EObject entryRuleInteractorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorType = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1430:2: (iv_ruleInteractorType= ruleInteractorType EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1431:2: iv_ruleInteractorType= ruleInteractorType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorTypeRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorType_in_entryRuleInteractorType2943);
            iv_ruleInteractorType=ruleInteractorType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorType2953); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorType"


    // $ANTLR start "ruleInteractorType"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1438:1: ruleInteractorType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleInteractorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1441:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1442:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1442:1: ( (otherlv_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1443:1: (otherlv_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1443:1: (otherlv_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1444:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInteractorTypeRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractorType2997); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getInteractorTypeAccess().getCustomInteractorTypeDefinitionCrossReference_0()); 
              	
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
    // $ANTLR end "ruleInteractorType"


    // $ANTLR start "entryRuleInteractorActor"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1463:1: entryRuleInteractorActor returns [EObject current=null] : iv_ruleInteractorActor= ruleInteractorActor EOF ;
    public final EObject entryRuleInteractorActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorActor = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1464:2: (iv_ruleInteractorActor= ruleInteractorActor EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1465:2: iv_ruleInteractorActor= ruleInteractorActor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorActorRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorActor_in_entryRuleInteractorActor3032);
            iv_ruleInteractorActor=ruleInteractorActor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorActor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorActor3042); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorActor"


    // $ANTLR start "ruleInteractorActor"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1472:1: ruleInteractorActor returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleActorType ) ) otherlv_3= 'actor' ) ;
    public final EObject ruleInteractorActor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1475:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleActorType ) ) otherlv_3= 'actor' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1476:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleActorType ) ) otherlv_3= 'actor' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1476:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleActorType ) ) otherlv_3= 'actor' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1476:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleActorType ) ) otherlv_3= 'actor'
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1476:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1477:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1477:1: (lv_name_0_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1478:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractorActor3084); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getInteractorActorAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInteractorActorRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleInteractorActor3101); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInteractorActorAccess().getColonKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1498:1: ( (lv_type_2_0= ruleActorType ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1499:1: (lv_type_2_0= ruleActorType )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1499:1: (lv_type_2_0= ruleActorType )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1500:3: lv_type_2_0= ruleActorType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInteractorActorAccess().getTypeActorTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleActorType_in_ruleInteractorActor3122);
            lv_type_2_0=ruleActorType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInteractorActorRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"ActorType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleInteractorActor3134); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInteractorActorAccess().getActorKeyword_3());
                  
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
    // $ANTLR end "ruleInteractorActor"


    // $ANTLR start "entryRuleInteractorData"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1528:1: entryRuleInteractorData returns [EObject current=null] : iv_ruleInteractorData= ruleInteractorData EOF ;
    public final EObject entryRuleInteractorData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorData = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1529:2: (iv_ruleInteractorData= ruleInteractorData EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1530:2: iv_ruleInteractorData= ruleInteractorData EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorDataRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorData_in_entryRuleInteractorData3170);
            iv_ruleInteractorData=ruleInteractorData();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorData; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorData3180); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorData"


    // $ANTLR start "ruleInteractorData"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1537:1: ruleInteractorData returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) ( (lv_mode_3_0= ruleInteractorDataComponentMode ) ) (otherlv_4= 'from' ( (lv_source_5_0= ruleInteractorSignalAlias ) ) )? (otherlv_6= 'to' ( (lv_destinations_7_0= ruleInteractorSignalAlias ) ) )* ) ;
    public final EObject ruleInteractorData() throws RecognitionException {
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
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1540:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) ( (lv_mode_3_0= ruleInteractorDataComponentMode ) ) (otherlv_4= 'from' ( (lv_source_5_0= ruleInteractorSignalAlias ) ) )? (otherlv_6= 'to' ( (lv_destinations_7_0= ruleInteractorSignalAlias ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1541:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) ( (lv_mode_3_0= ruleInteractorDataComponentMode ) ) (otherlv_4= 'from' ( (lv_source_5_0= ruleInteractorSignalAlias ) ) )? (otherlv_6= 'to' ( (lv_destinations_7_0= ruleInteractorSignalAlias ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1541:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) ( (lv_mode_3_0= ruleInteractorDataComponentMode ) ) (otherlv_4= 'from' ( (lv_source_5_0= ruleInteractorSignalAlias ) ) )? (otherlv_6= 'to' ( (lv_destinations_7_0= ruleInteractorSignalAlias ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1541:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) ( (lv_mode_3_0= ruleInteractorDataComponentMode ) ) (otherlv_4= 'from' ( (lv_source_5_0= ruleInteractorSignalAlias ) ) )? (otherlv_6= 'to' ( (lv_destinations_7_0= ruleInteractorSignalAlias ) ) )*
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1541:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1542:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1542:1: (lv_name_0_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1543:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractorData3222); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getInteractorDataAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInteractorDataRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleInteractorData3239); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInteractorDataAccess().getColonKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1563:1: ( (lv_type_2_0= ruleDataType ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1564:1: (lv_type_2_0= ruleDataType )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1564:1: (lv_type_2_0= ruleDataType )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1565:3: lv_type_2_0= ruleDataType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInteractorDataAccess().getTypeDataTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDataType_in_ruleInteractorData3260);
            lv_type_2_0=ruleDataType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInteractorDataRule());
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

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1581:2: ( (lv_mode_3_0= ruleInteractorDataComponentMode ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1582:1: (lv_mode_3_0= ruleInteractorDataComponentMode )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1582:1: (lv_mode_3_0= ruleInteractorDataComponentMode )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1583:3: lv_mode_3_0= ruleInteractorDataComponentMode
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInteractorDataAccess().getModeInteractorDataComponentModeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInteractorDataComponentMode_in_ruleInteractorData3281);
            lv_mode_3_0=ruleInteractorDataComponentMode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInteractorDataRule());
              	        }
                     		set(
                     			current, 
                     			"mode",
                      		lv_mode_3_0, 
                      		"InteractorDataComponentMode");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1599:2: (otherlv_4= 'from' ( (lv_source_5_0= ruleInteractorSignalAlias ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1599:4: otherlv_4= 'from' ( (lv_source_5_0= ruleInteractorSignalAlias ) )
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleInteractorData3294); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getInteractorDataAccess().getFromKeyword_4_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1603:1: ( (lv_source_5_0= ruleInteractorSignalAlias ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1604:1: (lv_source_5_0= ruleInteractorSignalAlias )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1604:1: (lv_source_5_0= ruleInteractorSignalAlias )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1605:3: lv_source_5_0= ruleInteractorSignalAlias
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInteractorDataAccess().getSourceInteractorSignalAliasParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInteractorSignalAlias_in_ruleInteractorData3315);
                    lv_source_5_0=ruleInteractorSignalAlias();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInteractorDataRule());
                      	        }
                             		set(
                             			current, 
                             			"source",
                              		lv_source_5_0, 
                              		"InteractorSignalAlias");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1621:4: (otherlv_6= 'to' ( (lv_destinations_7_0= ruleInteractorSignalAlias ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==35) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1621:6: otherlv_6= 'to' ( (lv_destinations_7_0= ruleInteractorSignalAlias ) )
            	    {
            	    otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleInteractorData3330); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getInteractorDataAccess().getToKeyword_5_0());
            	          
            	    }
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1625:1: ( (lv_destinations_7_0= ruleInteractorSignalAlias ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1626:1: (lv_destinations_7_0= ruleInteractorSignalAlias )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1626:1: (lv_destinations_7_0= ruleInteractorSignalAlias )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1627:3: lv_destinations_7_0= ruleInteractorSignalAlias
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInteractorDataAccess().getDestinationsInteractorSignalAliasParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInteractorSignalAlias_in_ruleInteractorData3351);
            	    lv_destinations_7_0=ruleInteractorSignalAlias();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInteractorDataRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"destinations",
            	              		lv_destinations_7_0, 
            	              		"InteractorSignalAlias");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // $ANTLR end "ruleInteractorData"


    // $ANTLR start "entryRuleInteractorSignalAlias"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1651:1: entryRuleInteractorSignalAlias returns [EObject current=null] : iv_ruleInteractorSignalAlias= ruleInteractorSignalAlias EOF ;
    public final EObject entryRuleInteractorSignalAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorSignalAlias = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1652:2: (iv_ruleInteractorSignalAlias= ruleInteractorSignalAlias EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1653:2: iv_ruleInteractorSignalAlias= ruleInteractorSignalAlias EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorSignalAliasRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorSignalAlias_in_entryRuleInteractorSignalAlias3389);
            iv_ruleInteractorSignalAlias=ruleInteractorSignalAlias();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorSignalAlias; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorSignalAlias3399); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorSignalAlias"


    // $ANTLR start "ruleInteractorSignalAlias"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1660:1: ruleInteractorSignalAlias returns [EObject current=null] : ( ( (lv_source_0_0= ruleAccessibleEntity ) ) (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final EObject ruleInteractorSignalAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_source_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1663:28: ( ( ( (lv_source_0_0= ruleAccessibleEntity ) ) (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1664:1: ( ( (lv_source_0_0= ruleAccessibleEntity ) ) (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1664:1: ( ( (lv_source_0_0= ruleAccessibleEntity ) ) (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1664:2: ( (lv_source_0_0= ruleAccessibleEntity ) ) (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )?
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1664:2: ( (lv_source_0_0= ruleAccessibleEntity ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1665:1: (lv_source_0_0= ruleAccessibleEntity )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1665:1: (lv_source_0_0= ruleAccessibleEntity )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1666:3: lv_source_0_0= ruleAccessibleEntity
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInteractorSignalAliasAccess().getSourceAccessibleEntityParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAccessibleEntity_in_ruleInteractorSignalAlias3445);
            lv_source_0_0=ruleAccessibleEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInteractorSignalAliasRule());
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

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1682:2: (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1682:4: otherlv_1= 'as' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleInteractorSignalAlias3458); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getInteractorSignalAliasAccess().getAsKeyword_1_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1686:1: ( (otherlv_2= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1687:1: (otherlv_2= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1687:1: (otherlv_2= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1688:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getInteractorSignalAliasRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractorSignalAlias3478); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getInteractorSignalAliasAccess().getAliasInteractorDataCrossReference_1_1_0()); 
                      	
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
    // $ANTLR end "ruleInteractorSignalAlias"


    // $ANTLR start "entryRuleInteractorDataComponentMode"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1707:1: entryRuleInteractorDataComponentMode returns [String current=null] : iv_ruleInteractorDataComponentMode= ruleInteractorDataComponentMode EOF ;
    public final String entryRuleInteractorDataComponentMode() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteractorDataComponentMode = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1708:2: (iv_ruleInteractorDataComponentMode= ruleInteractorDataComponentMode EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1709:2: iv_ruleInteractorDataComponentMode= ruleInteractorDataComponentMode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorDataComponentModeRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorDataComponentMode_in_entryRuleInteractorDataComponentMode3517);
            iv_ruleInteractorDataComponentMode=ruleInteractorDataComponentMode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorDataComponentMode.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorDataComponentMode3528); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorDataComponentMode"


    // $ANTLR start "ruleInteractorDataComponentMode"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1716:1: ruleInteractorDataComponentMode returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'event' | kw= 'flow' | kw= 'constant' ) ;
    public final AntlrDatatypeRuleToken ruleInteractorDataComponentMode() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1719:28: ( (kw= 'event' | kw= 'flow' | kw= 'constant' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1720:1: (kw= 'event' | kw= 'flow' | kw= 'constant' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1720:1: (kw= 'event' | kw= 'flow' | kw= 'constant' )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt27=1;
                }
                break;
            case 38:
                {
                alt27=2;
                }
                break;
            case 39:
                {
                alt27=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1721:2: kw= 'event'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleInteractorDataComponentMode3566); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getInteractorDataComponentModeAccess().getEventKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1728:2: kw= 'flow'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleInteractorDataComponentMode3585); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getInteractorDataComponentModeAccess().getFlowKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1735:2: kw= 'constant'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleInteractorDataComponentMode3604); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getInteractorDataComponentModeAccess().getConstantKeyword_2()); 
                          
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
    // $ANTLR end "ruleInteractorDataComponentMode"


    // $ANTLR start "entryRuleInteractorComponent"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1748:1: entryRuleInteractorComponent returns [EObject current=null] : iv_ruleInteractorComponent= ruleInteractorComponent EOF ;
    public final EObject entryRuleInteractorComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorComponent = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1749:2: (iv_ruleInteractorComponent= ruleInteractorComponent EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1750:2: iv_ruleInteractorComponent= ruleInteractorComponent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorComponentRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorComponent_in_entryRuleInteractorComponent3644);
            iv_ruleInteractorComponent=ruleInteractorComponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorComponent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorComponent3654); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorComponent"


    // $ANTLR start "ruleInteractorComponent"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1757:1: ruleInteractorComponent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleInteractorType ) ) otherlv_3= 'interactor' (otherlv_4= 'with' ( (lv_actors_5_0= ruleActorAlias ) ) (otherlv_6= ',' ( (lv_actors_7_0= ruleActorAlias ) ) )* )? ) ;
    public final EObject ruleInteractorComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_type_2_0 = null;

        EObject lv_actors_5_0 = null;

        EObject lv_actors_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1760:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleInteractorType ) ) otherlv_3= 'interactor' (otherlv_4= 'with' ( (lv_actors_5_0= ruleActorAlias ) ) (otherlv_6= ',' ( (lv_actors_7_0= ruleActorAlias ) ) )* )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1761:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleInteractorType ) ) otherlv_3= 'interactor' (otherlv_4= 'with' ( (lv_actors_5_0= ruleActorAlias ) ) (otherlv_6= ',' ( (lv_actors_7_0= ruleActorAlias ) ) )* )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1761:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleInteractorType ) ) otherlv_3= 'interactor' (otherlv_4= 'with' ( (lv_actors_5_0= ruleActorAlias ) ) (otherlv_6= ',' ( (lv_actors_7_0= ruleActorAlias ) ) )* )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1761:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleInteractorType ) ) otherlv_3= 'interactor' (otherlv_4= 'with' ( (lv_actors_5_0= ruleActorAlias ) ) (otherlv_6= ',' ( (lv_actors_7_0= ruleActorAlias ) ) )* )?
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1761:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1762:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1762:1: (lv_name_0_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1763:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractorComponent3696); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getInteractorComponentAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInteractorComponentRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleInteractorComponent3713); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInteractorComponentAccess().getColonKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1783:1: ( (lv_type_2_0= ruleInteractorType ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1784:1: (lv_type_2_0= ruleInteractorType )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1784:1: (lv_type_2_0= ruleInteractorType )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1785:3: lv_type_2_0= ruleInteractorType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInteractorComponentAccess().getTypeInteractorTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInteractorType_in_ruleInteractorComponent3734);
            lv_type_2_0=ruleInteractorType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInteractorComponentRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"InteractorType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleInteractorComponent3746); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInteractorComponentAccess().getInteractorKeyword_3());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1805:1: (otherlv_4= 'with' ( (lv_actors_5_0= ruleActorAlias ) ) (otherlv_6= ',' ( (lv_actors_7_0= ruleActorAlias ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==40) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1805:3: otherlv_4= 'with' ( (lv_actors_5_0= ruleActorAlias ) ) (otherlv_6= ',' ( (lv_actors_7_0= ruleActorAlias ) ) )*
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleInteractorComponent3759); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getInteractorComponentAccess().getWithKeyword_4_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1809:1: ( (lv_actors_5_0= ruleActorAlias ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1810:1: (lv_actors_5_0= ruleActorAlias )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1810:1: (lv_actors_5_0= ruleActorAlias )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1811:3: lv_actors_5_0= ruleActorAlias
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInteractorComponentAccess().getActorsActorAliasParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleActorAlias_in_ruleInteractorComponent3780);
                    lv_actors_5_0=ruleActorAlias();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInteractorComponentRule());
                      	        }
                             		add(
                             			current, 
                             			"actors",
                              		lv_actors_5_0, 
                              		"ActorAlias");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1827:2: (otherlv_6= ',' ( (lv_actors_7_0= ruleActorAlias ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==28) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1827:4: otherlv_6= ',' ( (lv_actors_7_0= ruleActorAlias ) )
                    	    {
                    	    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleInteractorComponent3793); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getInteractorComponentAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1831:1: ( (lv_actors_7_0= ruleActorAlias ) )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1832:1: (lv_actors_7_0= ruleActorAlias )
                    	    {
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1832:1: (lv_actors_7_0= ruleActorAlias )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1833:3: lv_actors_7_0= ruleActorAlias
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInteractorComponentAccess().getActorsActorAliasParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleActorAlias_in_ruleInteractorComponent3814);
                    	    lv_actors_7_0=ruleActorAlias();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInteractorComponentRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"actors",
                    	              		lv_actors_7_0, 
                    	              		"ActorAlias");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
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
    // $ANTLR end "ruleInteractorComponent"


    // $ANTLR start "entryRuleAccessibleEntity"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1857:1: entryRuleAccessibleEntity returns [EObject current=null] : iv_ruleAccessibleEntity= ruleAccessibleEntity EOF ;
    public final EObject entryRuleAccessibleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessibleEntity = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1858:2: (iv_ruleAccessibleEntity= ruleAccessibleEntity EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1859:2: iv_ruleAccessibleEntity= ruleAccessibleEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAccessibleEntityRule()); 
            }
            pushFollow(FOLLOW_ruleAccessibleEntity_in_entryRuleAccessibleEntity3854);
            iv_ruleAccessibleEntity=ruleAccessibleEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAccessibleEntity; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAccessibleEntity3864); if (state.failed) return current;

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1866:1: ruleAccessibleEntity returns [EObject current=null] : ( ( (lv_generic_0_0= ruleGenericEntity ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleAccessibleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_generic_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1869:28: ( ( ( (lv_generic_0_0= ruleGenericEntity ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1870:1: ( ( (lv_generic_0_0= ruleGenericEntity ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1870:1: ( ( (lv_generic_0_0= ruleGenericEntity ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=41 && LA30_0<=47)) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_ID) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1870:2: ( (lv_generic_0_0= ruleGenericEntity ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1870:2: ( (lv_generic_0_0= ruleGenericEntity ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1871:1: (lv_generic_0_0= ruleGenericEntity )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1871:1: (lv_generic_0_0= ruleGenericEntity )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1872:3: lv_generic_0_0= ruleGenericEntity
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAccessibleEntityAccess().getGenericGenericEntityParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGenericEntity_in_ruleAccessibleEntity3910);
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1889:6: ( (otherlv_1= RULE_ID ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1889:6: ( (otherlv_1= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1890:1: (otherlv_1= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1890:1: (otherlv_1= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1891:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAccessibleEntityRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAccessibleEntity3936); if (state.failed) return current;
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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1910:1: entryRuleGenericEntity returns [String current=null] : iv_ruleGenericEntity= ruleGenericEntity EOF ;
    public final String entryRuleGenericEntity() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGenericEntity = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1911:2: (iv_ruleGenericEntity= ruleGenericEntity EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1912:2: iv_ruleGenericEntity= ruleGenericEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGenericEntityRule()); 
            }
            pushFollow(FOLLOW_ruleGenericEntity_in_entryRuleGenericEntity3973);
            iv_ruleGenericEntity=ruleGenericEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGenericEntity.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericEntity3984); if (state.failed) return current;

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1919:1: ruleGenericEntity returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'any' | kw= 'self' | kw= 'other' | kw= 'parent' | kw= 'child' | kw= 'all' | kw= 'actors' ) ;
    public final AntlrDatatypeRuleToken ruleGenericEntity() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1922:28: ( (kw= 'any' | kw= 'self' | kw= 'other' | kw= 'parent' | kw= 'child' | kw= 'all' | kw= 'actors' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1923:1: (kw= 'any' | kw= 'self' | kw= 'other' | kw= 'parent' | kw= 'child' | kw= 'all' | kw= 'actors' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1923:1: (kw= 'any' | kw= 'self' | kw= 'other' | kw= 'parent' | kw= 'child' | kw= 'all' | kw= 'actors' )
            int alt31=7;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt31=1;
                }
                break;
            case 42:
                {
                alt31=2;
                }
                break;
            case 43:
                {
                alt31=3;
                }
                break;
            case 44:
                {
                alt31=4;
                }
                break;
            case 45:
                {
                alt31=5;
                }
                break;
            case 46:
                {
                alt31=6;
                }
                break;
            case 47:
                {
                alt31=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1924:2: kw= 'any'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleGenericEntity4022); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getGenericEntityAccess().getAnyKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1931:2: kw= 'self'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleGenericEntity4041); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getGenericEntityAccess().getSelfKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1938:2: kw= 'other'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleGenericEntity4060); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getGenericEntityAccess().getOtherKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1945:2: kw= 'parent'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleGenericEntity4079); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getGenericEntityAccess().getParentKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1952:2: kw= 'child'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleGenericEntity4098); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getGenericEntityAccess().getChildKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1959:2: kw= 'all'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleGenericEntity4117); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getGenericEntityAccess().getAllKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1966:2: kw= 'actors'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleGenericEntity4136); if (state.failed) return current;
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


    // $ANTLR start "entryRuleActorAlias"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1981:1: entryRuleActorAlias returns [EObject current=null] : iv_ruleActorAlias= ruleActorAlias EOF ;
    public final EObject entryRuleActorAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActorAlias = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1982:2: (iv_ruleActorAlias= ruleActorAlias EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1983:2: iv_ruleActorAlias= ruleActorAlias EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActorAliasRule()); 
            }
            pushFollow(FOLLOW_ruleActorAlias_in_entryRuleActorAlias4178);
            iv_ruleActorAlias=ruleActorAlias();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActorAlias; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActorAlias4188); if (state.failed) return current;

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1990:1: ruleActorAlias returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleActorAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1993:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1994:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1994:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1994:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'as' ( (otherlv_2= RULE_ID ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1994:2: ( (otherlv_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1995:1: (otherlv_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1995:1: (otherlv_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:1996:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getActorAliasRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActorAlias4233); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getActorAliasAccess().getSourceInteractorActorCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleActorAlias4245); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActorAliasAccess().getAsKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2011:1: ( (otherlv_2= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2012:1: (otherlv_2= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2012:1: (otherlv_2= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2013:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getActorAliasRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActorAlias4265); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getActorAliasAccess().getAliasInteractorActorCrossReference_2_0()); 
              	
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


    // $ANTLR start "entryRuleInteractorSignalReception"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2032:1: entryRuleInteractorSignalReception returns [EObject current=null] : iv_ruleInteractorSignalReception= ruleInteractorSignalReception EOF ;
    public final EObject entryRuleInteractorSignalReception() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorSignalReception = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2033:2: (iv_ruleInteractorSignalReception= ruleInteractorSignalReception EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2034:2: iv_ruleInteractorSignalReception= ruleInteractorSignalReception EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorSignalReceptionRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorSignalReception_in_entryRuleInteractorSignalReception4301);
            iv_ruleInteractorSignalReception=ruleInteractorSignalReception();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorSignalReception; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorSignalReception4311); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorSignalReception"


    // $ANTLR start "ruleInteractorSignalReception"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2041:1: ruleInteractorSignalReception returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleInteractorSignalAlias ) ) )? ) | ( (lv_init_3_0= 'init' ) ) ) ;
    public final EObject ruleInteractorSignalReception() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_init_3_0=null;
        EObject lv_source_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2044:28: ( ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleInteractorSignalAlias ) ) )? ) | ( (lv_init_3_0= 'init' ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2045:1: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleInteractorSignalAlias ) ) )? ) | ( (lv_init_3_0= 'init' ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2045:1: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleInteractorSignalAlias ) ) )? ) | ( (lv_init_3_0= 'init' ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            else if ( (LA33_0==48) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2045:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleInteractorSignalAlias ) ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2045:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleInteractorSignalAlias ) ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2045:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'from' ( (lv_source_2_0= ruleInteractorSignalAlias ) ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2045:3: ( (otherlv_0= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2046:1: (otherlv_0= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2046:1: (otherlv_0= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2047:3: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getInteractorSignalReceptionRule());
                      	        }
                              
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractorSignalReception4357); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_0, grammarAccess.getInteractorSignalReceptionAccess().getInstanceInteractorDataCrossReference_0_0_0()); 
                      	
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2058:2: (otherlv_1= 'from' ( (lv_source_2_0= ruleInteractorSignalAlias ) ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==34) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2058:4: otherlv_1= 'from' ( (lv_source_2_0= ruleInteractorSignalAlias ) )
                            {
                            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleInteractorSignalReception4370); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getInteractorSignalReceptionAccess().getFromKeyword_0_1_0());
                                  
                            }
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2062:1: ( (lv_source_2_0= ruleInteractorSignalAlias ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2063:1: (lv_source_2_0= ruleInteractorSignalAlias )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2063:1: (lv_source_2_0= ruleInteractorSignalAlias )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2064:3: lv_source_2_0= ruleInteractorSignalAlias
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInteractorSignalReceptionAccess().getSourceInteractorSignalAliasParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleInteractorSignalAlias_in_ruleInteractorSignalReception4391);
                            lv_source_2_0=ruleInteractorSignalAlias();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getInteractorSignalReceptionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"source",
                                      		lv_source_2_0, 
                                      		"InteractorSignalAlias");
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2081:6: ( (lv_init_3_0= 'init' ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2081:6: ( (lv_init_3_0= 'init' ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2082:1: (lv_init_3_0= 'init' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2082:1: (lv_init_3_0= 'init' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2083:3: lv_init_3_0= 'init'
                    {
                    lv_init_3_0=(Token)match(input,48,FOLLOW_48_in_ruleInteractorSignalReception4418); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_init_3_0, grammarAccess.getInteractorSignalReceptionAccess().getInitInitKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInteractorSignalReceptionRule());
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
    // $ANTLR end "ruleInteractorSignalReception"


    // $ANTLR start "entryRuleInteractorSignalEmission"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2104:1: entryRuleInteractorSignalEmission returns [EObject current=null] : iv_ruleInteractorSignalEmission= ruleInteractorSignalEmission EOF ;
    public final EObject entryRuleInteractorSignalEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorSignalEmission = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2105:2: (iv_ruleInteractorSignalEmission= ruleInteractorSignalEmission EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2106:2: iv_ruleInteractorSignalEmission= ruleInteractorSignalEmission EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorSignalEmissionRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorSignalEmission_in_entryRuleInteractorSignalEmission4467);
            iv_ruleInteractorSignalEmission=ruleInteractorSignalEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorSignalEmission; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorSignalEmission4477); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorSignalEmission"


    // $ANTLR start "ruleInteractorSignalEmission"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2113:1: ruleInteractorSignalEmission returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_destination_2_0= ruleInteractorSignalAlias ) ) )? ) ;
    public final EObject ruleInteractorSignalEmission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_destination_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2116:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_destination_2_0= ruleInteractorSignalAlias ) ) )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2117:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_destination_2_0= ruleInteractorSignalAlias ) ) )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2117:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_destination_2_0= ruleInteractorSignalAlias ) ) )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2117:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'to' ( (lv_destination_2_0= ruleInteractorSignalAlias ) ) )?
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2117:2: ( (otherlv_0= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2118:1: (otherlv_0= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2118:1: (otherlv_0= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2119:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInteractorSignalEmissionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteractorSignalEmission4522); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getInteractorSignalEmissionAccess().getInstanceInteractorDataCrossReference_0_0()); 
              	
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2130:2: (otherlv_1= 'to' ( (lv_destination_2_0= ruleInteractorSignalAlias ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==35) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2130:4: otherlv_1= 'to' ( (lv_destination_2_0= ruleInteractorSignalAlias ) )
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleInteractorSignalEmission4535); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getInteractorSignalEmissionAccess().getToKeyword_1_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2134:1: ( (lv_destination_2_0= ruleInteractorSignalAlias ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2135:1: (lv_destination_2_0= ruleInteractorSignalAlias )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2135:1: (lv_destination_2_0= ruleInteractorSignalAlias )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2136:3: lv_destination_2_0= ruleInteractorSignalAlias
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInteractorSignalEmissionAccess().getDestinationInteractorSignalAliasParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInteractorSignalAlias_in_ruleInteractorSignalEmission4556);
                    lv_destination_2_0=ruleInteractorSignalAlias();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInteractorSignalEmissionRule());
                      	        }
                             		set(
                             			current, 
                             			"destination",
                              		lv_destination_2_0, 
                              		"InteractorSignalAlias");
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
    // $ANTLR end "ruleInteractorSignalEmission"


    // $ANTLR start "entryRuleInteractorBehavior"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2160:1: entryRuleInteractorBehavior returns [EObject current=null] : iv_ruleInteractorBehavior= ruleInteractorBehavior EOF ;
    public final EObject entryRuleInteractorBehavior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorBehavior = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2161:2: (iv_ruleInteractorBehavior= ruleInteractorBehavior EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2162:2: iv_ruleInteractorBehavior= ruleInteractorBehavior EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorBehaviorRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorBehavior_in_entryRuleInteractorBehavior4594);
            iv_ruleInteractorBehavior=ruleInteractorBehavior();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorBehavior; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorBehavior4604); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorBehavior"


    // $ANTLR start "ruleInteractorBehavior"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2169:1: ruleInteractorBehavior returns [EObject current=null] : ( ( (lv_cause_0_0= ruleInteractorBehaviorCause ) ) otherlv_1= ':' ( (lv_effect_2_0= ruleInteractorBehaviorEffect ) )+ ) ;
    public final EObject ruleInteractorBehavior() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_cause_0_0 = null;

        EObject lv_effect_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2172:28: ( ( ( (lv_cause_0_0= ruleInteractorBehaviorCause ) ) otherlv_1= ':' ( (lv_effect_2_0= ruleInteractorBehaviorEffect ) )+ ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2173:1: ( ( (lv_cause_0_0= ruleInteractorBehaviorCause ) ) otherlv_1= ':' ( (lv_effect_2_0= ruleInteractorBehaviorEffect ) )+ )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2173:1: ( ( (lv_cause_0_0= ruleInteractorBehaviorCause ) ) otherlv_1= ':' ( (lv_effect_2_0= ruleInteractorBehaviorEffect ) )+ )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2173:2: ( (lv_cause_0_0= ruleInteractorBehaviorCause ) ) otherlv_1= ':' ( (lv_effect_2_0= ruleInteractorBehaviorEffect ) )+
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2173:2: ( (lv_cause_0_0= ruleInteractorBehaviorCause ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2174:1: (lv_cause_0_0= ruleInteractorBehaviorCause )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2174:1: (lv_cause_0_0= ruleInteractorBehaviorCause )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2175:3: lv_cause_0_0= ruleInteractorBehaviorCause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInteractorBehaviorAccess().getCauseInteractorBehaviorCauseParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInteractorBehaviorCause_in_ruleInteractorBehavior4650);
            lv_cause_0_0=ruleInteractorBehaviorCause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorRule());
              	        }
                     		set(
                     			current, 
                     			"cause",
                      		lv_cause_0_0, 
                      		"InteractorBehaviorCause");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleInteractorBehavior4662); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInteractorBehaviorAccess().getColonKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2195:1: ( (lv_effect_2_0= ruleInteractorBehaviorEffect ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==24||LA35_0==52||LA35_0==54) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2196:1: (lv_effect_2_0= ruleInteractorBehaviorEffect )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2196:1: (lv_effect_2_0= ruleInteractorBehaviorEffect )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2197:3: lv_effect_2_0= ruleInteractorBehaviorEffect
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInteractorBehaviorAccess().getEffectInteractorBehaviorEffectParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInteractorBehaviorEffect_in_ruleInteractorBehavior4683);
            	    lv_effect_2_0=ruleInteractorBehaviorEffect();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"effect",
            	              		lv_effect_2_0, 
            	              		"InteractorBehaviorEffect");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
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
    // $ANTLR end "ruleInteractorBehavior"


    // $ANTLR start "entryRuleInteractorBehaviorCause"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2221:1: entryRuleInteractorBehaviorCause returns [EObject current=null] : iv_ruleInteractorBehaviorCause= ruleInteractorBehaviorCause EOF ;
    public final EObject entryRuleInteractorBehaviorCause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorBehaviorCause = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2222:2: (iv_ruleInteractorBehaviorCause= ruleInteractorBehaviorCause EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2223:2: iv_ruleInteractorBehaviorCause= ruleInteractorBehaviorCause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorBehaviorCauseRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorBehaviorCause_in_entryRuleInteractorBehaviorCause4720);
            iv_ruleInteractorBehaviorCause=ruleInteractorBehaviorCause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorBehaviorCause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorBehaviorCause4730); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorBehaviorCause"


    // $ANTLR start "ruleInteractorBehaviorCause"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2230:1: ruleInteractorBehaviorCause returns [EObject current=null] : (this_InteractorBehaviorOnCause_0= ruleInteractorBehaviorOnCause | this_InteractorBehaviorWhenCause_1= ruleInteractorBehaviorWhenCause ) ;
    public final EObject ruleInteractorBehaviorCause() throws RecognitionException {
        EObject current = null;

        EObject this_InteractorBehaviorOnCause_0 = null;

        EObject this_InteractorBehaviorWhenCause_1 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2233:28: ( (this_InteractorBehaviorOnCause_0= ruleInteractorBehaviorOnCause | this_InteractorBehaviorWhenCause_1= ruleInteractorBehaviorWhenCause ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2234:1: (this_InteractorBehaviorOnCause_0= ruleInteractorBehaviorOnCause | this_InteractorBehaviorWhenCause_1= ruleInteractorBehaviorWhenCause )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2234:1: (this_InteractorBehaviorOnCause_0= ruleInteractorBehaviorOnCause | this_InteractorBehaviorWhenCause_1= ruleInteractorBehaviorWhenCause )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==49) ) {
                alt36=1;
            }
            else if ( (LA36_0==51) ) {
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2235:5: this_InteractorBehaviorOnCause_0= ruleInteractorBehaviorOnCause
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInteractorBehaviorCauseAccess().getInteractorBehaviorOnCauseParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInteractorBehaviorOnCause_in_ruleInteractorBehaviorCause4777);
                    this_InteractorBehaviorOnCause_0=ruleInteractorBehaviorOnCause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InteractorBehaviorOnCause_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2245:5: this_InteractorBehaviorWhenCause_1= ruleInteractorBehaviorWhenCause
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInteractorBehaviorCauseAccess().getInteractorBehaviorWhenCauseParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInteractorBehaviorWhenCause_in_ruleInteractorBehaviorCause4804);
                    this_InteractorBehaviorWhenCause_1=ruleInteractorBehaviorWhenCause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InteractorBehaviorWhenCause_1; 
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
    // $ANTLR end "ruleInteractorBehaviorCause"


    // $ANTLR start "entryRuleInteractorBehaviorOnCause"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2261:1: entryRuleInteractorBehaviorOnCause returns [EObject current=null] : iv_ruleInteractorBehaviorOnCause= ruleInteractorBehaviorOnCause EOF ;
    public final EObject entryRuleInteractorBehaviorOnCause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorBehaviorOnCause = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2262:2: (iv_ruleInteractorBehaviorOnCause= ruleInteractorBehaviorOnCause EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2263:2: iv_ruleInteractorBehaviorOnCause= ruleInteractorBehaviorOnCause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorBehaviorOnCauseRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorBehaviorOnCause_in_entryRuleInteractorBehaviorOnCause4839);
            iv_ruleInteractorBehaviorOnCause=ruleInteractorBehaviorOnCause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorBehaviorOnCause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorBehaviorOnCause4849); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorBehaviorOnCause"


    // $ANTLR start "ruleInteractorBehaviorOnCause"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2270:1: ruleInteractorBehaviorOnCause returns [EObject current=null] : (otherlv_0= 'on' ( (lv_event_1_0= ruleInteractorSignalReception ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleInteractorBehaviorOnCause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_event_1_0 = null;

        EObject lv_guard_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2273:28: ( (otherlv_0= 'on' ( (lv_event_1_0= ruleInteractorSignalReception ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2274:1: (otherlv_0= 'on' ( (lv_event_1_0= ruleInteractorSignalReception ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2274:1: (otherlv_0= 'on' ( (lv_event_1_0= ruleInteractorSignalReception ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2274:3: otherlv_0= 'on' ( (lv_event_1_0= ruleInteractorSignalReception ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )?
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleInteractorBehaviorOnCause4886); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInteractorBehaviorOnCauseAccess().getOnKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2278:1: ( (lv_event_1_0= ruleInteractorSignalReception ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2279:1: (lv_event_1_0= ruleInteractorSignalReception )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2279:1: (lv_event_1_0= ruleInteractorSignalReception )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2280:3: lv_event_1_0= ruleInteractorSignalReception
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInteractorBehaviorOnCauseAccess().getEventInteractorSignalReceptionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInteractorSignalReception_in_ruleInteractorBehaviorOnCause4907);
            lv_event_1_0=ruleInteractorSignalReception();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorOnCauseRule());
              	        }
                     		set(
                     			current, 
                     			"event",
                      		lv_event_1_0, 
                      		"InteractorSignalReception");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2296:2: (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==50) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2296:4: otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleInteractorBehaviorOnCause4920); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getInteractorBehaviorOnCauseAccess().getIfKeyword_2_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2300:1: ( (lv_guard_3_0= ruleExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2301:1: (lv_guard_3_0= ruleExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2301:1: (lv_guard_3_0= ruleExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2302:3: lv_guard_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInteractorBehaviorOnCauseAccess().getGuardExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleInteractorBehaviorOnCause4941);
                    lv_guard_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorOnCauseRule());
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
    // $ANTLR end "ruleInteractorBehaviorOnCause"


    // $ANTLR start "entryRuleInteractorBehaviorWhenCause"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2326:1: entryRuleInteractorBehaviorWhenCause returns [EObject current=null] : iv_ruleInteractorBehaviorWhenCause= ruleInteractorBehaviorWhenCause EOF ;
    public final EObject entryRuleInteractorBehaviorWhenCause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorBehaviorWhenCause = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2327:2: (iv_ruleInteractorBehaviorWhenCause= ruleInteractorBehaviorWhenCause EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2328:2: iv_ruleInteractorBehaviorWhenCause= ruleInteractorBehaviorWhenCause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorBehaviorWhenCauseRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorBehaviorWhenCause_in_entryRuleInteractorBehaviorWhenCause4979);
            iv_ruleInteractorBehaviorWhenCause=ruleInteractorBehaviorWhenCause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorBehaviorWhenCause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorBehaviorWhenCause4989); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorBehaviorWhenCause"


    // $ANTLR start "ruleInteractorBehaviorWhenCause"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2335:1: ruleInteractorBehaviorWhenCause returns [EObject current=null] : (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleInteractorBehaviorWhenCause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_condition_1_0 = null;

        EObject lv_guard_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2338:28: ( (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2339:1: (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2339:1: (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2339:3: otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )?
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleInteractorBehaviorWhenCause5026); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInteractorBehaviorWhenCauseAccess().getWhenKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2343:1: ( (lv_condition_1_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2344:1: (lv_condition_1_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2344:1: (lv_condition_1_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2345:3: lv_condition_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInteractorBehaviorWhenCauseAccess().getConditionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleInteractorBehaviorWhenCause5047);
            lv_condition_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorWhenCauseRule());
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

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2361:2: (otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==50) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2361:4: otherlv_2= 'if' ( (lv_guard_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleInteractorBehaviorWhenCause5060); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getInteractorBehaviorWhenCauseAccess().getIfKeyword_2_0());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2365:1: ( (lv_guard_3_0= ruleExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2366:1: (lv_guard_3_0= ruleExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2366:1: (lv_guard_3_0= ruleExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2367:3: lv_guard_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInteractorBehaviorWhenCauseAccess().getGuardExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleInteractorBehaviorWhenCause5081);
                    lv_guard_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorWhenCauseRule());
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
    // $ANTLR end "ruleInteractorBehaviorWhenCause"


    // $ANTLR start "entryRuleInteractorBehaviorEffect"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2391:1: entryRuleInteractorBehaviorEffect returns [EObject current=null] : iv_ruleInteractorBehaviorEffect= ruleInteractorBehaviorEffect EOF ;
    public final EObject entryRuleInteractorBehaviorEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorBehaviorEffect = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2392:2: (iv_ruleInteractorBehaviorEffect= ruleInteractorBehaviorEffect EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2393:2: iv_ruleInteractorBehaviorEffect= ruleInteractorBehaviorEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorBehaviorEffectRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorBehaviorEffect_in_entryRuleInteractorBehaviorEffect5119);
            iv_ruleInteractorBehaviorEffect=ruleInteractorBehaviorEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorBehaviorEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorBehaviorEffect5129); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorBehaviorEffect"


    // $ANTLR start "ruleInteractorBehaviorEffect"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2400:1: ruleInteractorBehaviorEffect returns [EObject current=null] : (this_InteractorBehaviorAlwaysEffect_0= ruleInteractorBehaviorAlwaysEffect | this_InteractorBehaviorSetEffect_1= ruleInteractorBehaviorSetEffect | this_InteractorBehaviorTriggerEffect_2= ruleInteractorBehaviorTriggerEffect ) ;
    public final EObject ruleInteractorBehaviorEffect() throws RecognitionException {
        EObject current = null;

        EObject this_InteractorBehaviorAlwaysEffect_0 = null;

        EObject this_InteractorBehaviorSetEffect_1 = null;

        EObject this_InteractorBehaviorTriggerEffect_2 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2403:28: ( (this_InteractorBehaviorAlwaysEffect_0= ruleInteractorBehaviorAlwaysEffect | this_InteractorBehaviorSetEffect_1= ruleInteractorBehaviorSetEffect | this_InteractorBehaviorTriggerEffect_2= ruleInteractorBehaviorTriggerEffect ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2404:1: (this_InteractorBehaviorAlwaysEffect_0= ruleInteractorBehaviorAlwaysEffect | this_InteractorBehaviorSetEffect_1= ruleInteractorBehaviorSetEffect | this_InteractorBehaviorTriggerEffect_2= ruleInteractorBehaviorTriggerEffect )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2404:1: (this_InteractorBehaviorAlwaysEffect_0= ruleInteractorBehaviorAlwaysEffect | this_InteractorBehaviorSetEffect_1= ruleInteractorBehaviorSetEffect | this_InteractorBehaviorTriggerEffect_2= ruleInteractorBehaviorTriggerEffect )
            int alt39=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt39=1;
                }
                break;
            case 24:
                {
                alt39=2;
                }
                break;
            case 54:
                {
                alt39=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2405:5: this_InteractorBehaviorAlwaysEffect_0= ruleInteractorBehaviorAlwaysEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInteractorBehaviorEffectAccess().getInteractorBehaviorAlwaysEffectParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInteractorBehaviorAlwaysEffect_in_ruleInteractorBehaviorEffect5176);
                    this_InteractorBehaviorAlwaysEffect_0=ruleInteractorBehaviorAlwaysEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InteractorBehaviorAlwaysEffect_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2415:5: this_InteractorBehaviorSetEffect_1= ruleInteractorBehaviorSetEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInteractorBehaviorEffectAccess().getInteractorBehaviorSetEffectParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInteractorBehaviorSetEffect_in_ruleInteractorBehaviorEffect5203);
                    this_InteractorBehaviorSetEffect_1=ruleInteractorBehaviorSetEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InteractorBehaviorSetEffect_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2425:5: this_InteractorBehaviorTriggerEffect_2= ruleInteractorBehaviorTriggerEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInteractorBehaviorEffectAccess().getInteractorBehaviorTriggerEffectParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInteractorBehaviorTriggerEffect_in_ruleInteractorBehaviorEffect5230);
                    this_InteractorBehaviorTriggerEffect_2=ruleInteractorBehaviorTriggerEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InteractorBehaviorTriggerEffect_2; 
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
    // $ANTLR end "ruleInteractorBehaviorEffect"


    // $ANTLR start "entryRuleInteractorBehaviorAlwaysEffect"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2441:1: entryRuleInteractorBehaviorAlwaysEffect returns [EObject current=null] : iv_ruleInteractorBehaviorAlwaysEffect= ruleInteractorBehaviorAlwaysEffect EOF ;
    public final EObject entryRuleInteractorBehaviorAlwaysEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorBehaviorAlwaysEffect = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2442:2: (iv_ruleInteractorBehaviorAlwaysEffect= ruleInteractorBehaviorAlwaysEffect EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2443:2: iv_ruleInteractorBehaviorAlwaysEffect= ruleInteractorBehaviorAlwaysEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorBehaviorAlwaysEffectRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorBehaviorAlwaysEffect_in_entryRuleInteractorBehaviorAlwaysEffect5265);
            iv_ruleInteractorBehaviorAlwaysEffect=ruleInteractorBehaviorAlwaysEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorBehaviorAlwaysEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorBehaviorAlwaysEffect5275); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorBehaviorAlwaysEffect"


    // $ANTLR start "ruleInteractorBehaviorAlwaysEffect"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2450:1: ruleInteractorBehaviorAlwaysEffect returns [EObject current=null] : (otherlv_0= 'always' ( (lv_target_1_0= ruleInteractorSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) ;
    public final EObject ruleInteractorBehaviorAlwaysEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_target_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2453:28: ( (otherlv_0= 'always' ( (lv_target_1_0= ruleInteractorSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2454:1: (otherlv_0= 'always' ( (lv_target_1_0= ruleInteractorSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2454:1: (otherlv_0= 'always' ( (lv_target_1_0= ruleInteractorSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2454:3: otherlv_0= 'always' ( (lv_target_1_0= ruleInteractorSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleInteractorBehaviorAlwaysEffect5312); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInteractorBehaviorAlwaysEffectAccess().getAlwaysKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2458:1: ( (lv_target_1_0= ruleInteractorSignalEmission ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2459:1: (lv_target_1_0= ruleInteractorSignalEmission )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2459:1: (lv_target_1_0= ruleInteractorSignalEmission )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2460:3: lv_target_1_0= ruleInteractorSignalEmission
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInteractorBehaviorAlwaysEffectAccess().getTargetInteractorSignalEmissionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInteractorSignalEmission_in_ruleInteractorBehaviorAlwaysEffect5333);
            lv_target_1_0=ruleInteractorSignalEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorAlwaysEffectRule());
              	        }
                     		set(
                     			current, 
                     			"target",
                      		lv_target_1_0, 
                      		"InteractorSignalEmission");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleInteractorBehaviorAlwaysEffect5345); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInteractorBehaviorAlwaysEffectAccess().getEqualsSignKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2480:1: ( (lv_value_3_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2481:1: (lv_value_3_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2481:1: (lv_value_3_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2482:3: lv_value_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInteractorBehaviorAlwaysEffectAccess().getValueExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleInteractorBehaviorAlwaysEffect5366);
            lv_value_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorAlwaysEffectRule());
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
    // $ANTLR end "ruleInteractorBehaviorAlwaysEffect"


    // $ANTLR start "entryRuleInteractorBehaviorSetEffect"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2506:1: entryRuleInteractorBehaviorSetEffect returns [EObject current=null] : iv_ruleInteractorBehaviorSetEffect= ruleInteractorBehaviorSetEffect EOF ;
    public final EObject entryRuleInteractorBehaviorSetEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorBehaviorSetEffect = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2507:2: (iv_ruleInteractorBehaviorSetEffect= ruleInteractorBehaviorSetEffect EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2508:2: iv_ruleInteractorBehaviorSetEffect= ruleInteractorBehaviorSetEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorBehaviorSetEffectRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorBehaviorSetEffect_in_entryRuleInteractorBehaviorSetEffect5402);
            iv_ruleInteractorBehaviorSetEffect=ruleInteractorBehaviorSetEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorBehaviorSetEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorBehaviorSetEffect5412); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorBehaviorSetEffect"


    // $ANTLR start "ruleInteractorBehaviorSetEffect"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2515:1: ruleInteractorBehaviorSetEffect returns [EObject current=null] : (otherlv_0= 'set' ( (lv_target_1_0= ruleInteractorSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) ;
    public final EObject ruleInteractorBehaviorSetEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_target_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2518:28: ( (otherlv_0= 'set' ( (lv_target_1_0= ruleInteractorSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2519:1: (otherlv_0= 'set' ( (lv_target_1_0= ruleInteractorSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2519:1: (otherlv_0= 'set' ( (lv_target_1_0= ruleInteractorSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2519:3: otherlv_0= 'set' ( (lv_target_1_0= ruleInteractorSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleInteractorBehaviorSetEffect5449); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInteractorBehaviorSetEffectAccess().getSetKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2523:1: ( (lv_target_1_0= ruleInteractorSignalEmission ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2524:1: (lv_target_1_0= ruleInteractorSignalEmission )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2524:1: (lv_target_1_0= ruleInteractorSignalEmission )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2525:3: lv_target_1_0= ruleInteractorSignalEmission
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInteractorBehaviorSetEffectAccess().getTargetInteractorSignalEmissionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInteractorSignalEmission_in_ruleInteractorBehaviorSetEffect5470);
            lv_target_1_0=ruleInteractorSignalEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorSetEffectRule());
              	        }
                     		set(
                     			current, 
                     			"target",
                      		lv_target_1_0, 
                      		"InteractorSignalEmission");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleInteractorBehaviorSetEffect5482); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInteractorBehaviorSetEffectAccess().getEqualsSignKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2545:1: ( (lv_value_3_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2546:1: (lv_value_3_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2546:1: (lv_value_3_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2547:3: lv_value_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInteractorBehaviorSetEffectAccess().getValueExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleInteractorBehaviorSetEffect5503);
            lv_value_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorSetEffectRule());
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
    // $ANTLR end "ruleInteractorBehaviorSetEffect"


    // $ANTLR start "entryRuleInteractorBehaviorTriggerEffect"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2571:1: entryRuleInteractorBehaviorTriggerEffect returns [EObject current=null] : iv_ruleInteractorBehaviorTriggerEffect= ruleInteractorBehaviorTriggerEffect EOF ;
    public final EObject entryRuleInteractorBehaviorTriggerEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractorBehaviorTriggerEffect = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2572:2: (iv_ruleInteractorBehaviorTriggerEffect= ruleInteractorBehaviorTriggerEffect EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2573:2: iv_ruleInteractorBehaviorTriggerEffect= ruleInteractorBehaviorTriggerEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractorBehaviorTriggerEffectRule()); 
            }
            pushFollow(FOLLOW_ruleInteractorBehaviorTriggerEffect_in_entryRuleInteractorBehaviorTriggerEffect5539);
            iv_ruleInteractorBehaviorTriggerEffect=ruleInteractorBehaviorTriggerEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractorBehaviorTriggerEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteractorBehaviorTriggerEffect5549); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractorBehaviorTriggerEffect"


    // $ANTLR start "ruleInteractorBehaviorTriggerEffect"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2580:1: ruleInteractorBehaviorTriggerEffect returns [EObject current=null] : (otherlv_0= 'trigger' ( (lv_target_1_0= ruleInteractorSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) ;
    public final EObject ruleInteractorBehaviorTriggerEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_target_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2583:28: ( (otherlv_0= 'trigger' ( (lv_target_1_0= ruleInteractorSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2584:1: (otherlv_0= 'trigger' ( (lv_target_1_0= ruleInteractorSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2584:1: (otherlv_0= 'trigger' ( (lv_target_1_0= ruleInteractorSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2584:3: otherlv_0= 'trigger' ( (lv_target_1_0= ruleInteractorSignalEmission ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleInteractorBehaviorTriggerEffect5586); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInteractorBehaviorTriggerEffectAccess().getTriggerKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2588:1: ( (lv_target_1_0= ruleInteractorSignalEmission ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2589:1: (lv_target_1_0= ruleInteractorSignalEmission )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2589:1: (lv_target_1_0= ruleInteractorSignalEmission )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2590:3: lv_target_1_0= ruleInteractorSignalEmission
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInteractorBehaviorTriggerEffectAccess().getTargetInteractorSignalEmissionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInteractorSignalEmission_in_ruleInteractorBehaviorTriggerEffect5607);
            lv_target_1_0=ruleInteractorSignalEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorTriggerEffectRule());
              	        }
                     		set(
                     			current, 
                     			"target",
                      		lv_target_1_0, 
                      		"InteractorSignalEmission");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleInteractorBehaviorTriggerEffect5619); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInteractorBehaviorTriggerEffectAccess().getEqualsSignKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2610:1: ( (lv_value_3_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2611:1: (lv_value_3_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2611:1: (lv_value_3_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2612:3: lv_value_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInteractorBehaviorTriggerEffectAccess().getValueExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleInteractorBehaviorTriggerEffect5640);
            lv_value_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInteractorBehaviorTriggerEffectRule());
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
    // $ANTLR end "ruleInteractorBehaviorTriggerEffect"


    // $ANTLR start "entryRuleExpression"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2636:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2637:2: (iv_ruleExpression= ruleExpression EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2638:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression5676);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression5686); if (state.failed) return current;

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2645:1: ruleExpression returns [EObject current=null] : this_ExpressionOr_0= ruleExpressionOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionOr_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2648:28: (this_ExpressionOr_0= ruleExpressionOr )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2650:5: this_ExpressionOr_0= ruleExpressionOr
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getExpressionOrParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleExpressionOr_in_ruleExpression5732);
            this_ExpressionOr_0=ruleExpressionOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExpressionOr_0; 
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


    // $ANTLR start "entryRuleExpressionOr"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2666:1: entryRuleExpressionOr returns [EObject current=null] : iv_ruleExpressionOr= ruleExpressionOr EOF ;
    public final EObject entryRuleExpressionOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionOr = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2667:2: (iv_ruleExpressionOr= ruleExpressionOr EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2668:2: iv_ruleExpressionOr= ruleExpressionOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionOrRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionOr_in_entryRuleExpressionOr5766);
            iv_ruleExpressionOr=ruleExpressionOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionOr5776); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionOr"


    // $ANTLR start "ruleExpressionOr"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2675:1: ruleExpressionOr returns [EObject current=null] : (this_ExpressionAnd_0= ruleExpressionAnd ( ( ( ( () ( ( ruleExpressionOrOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOrOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAnd ) ) )* ) ;
    public final EObject ruleExpressionOr() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionAnd_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2678:28: ( (this_ExpressionAnd_0= ruleExpressionAnd ( ( ( ( () ( ( ruleExpressionOrOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOrOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAnd ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2679:1: (this_ExpressionAnd_0= ruleExpressionAnd ( ( ( ( () ( ( ruleExpressionOrOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOrOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAnd ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2679:1: (this_ExpressionAnd_0= ruleExpressionAnd ( ( ( ( () ( ( ruleExpressionOrOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOrOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAnd ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2680:5: this_ExpressionAnd_0= ruleExpressionAnd ( ( ( ( () ( ( ruleExpressionOrOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOrOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAnd ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionOrAccess().getExpressionAndParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpressionAnd_in_ruleExpressionOr5823);
            this_ExpressionAnd_0=ruleExpressionAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExpressionAnd_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2688:1: ( ( ( ( () ( ( ruleExpressionOrOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOrOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAnd ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==55) ) {
                    int LA40_2 = input.LA(2);

                    if ( (synpred5_InternalLil()) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2688:2: ( ( ( () ( ( ruleExpressionOrOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOrOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAnd ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2688:2: ( ( ( () ( ( ruleExpressionOrOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOrOp ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2688:3: ( ( () ( ( ruleExpressionOrOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOrOp ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2693:6: ( () ( (lv_feature_2_0= ruleExpressionOrOp ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2693:7: () ( (lv_feature_2_0= ruleExpressionOrOp ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2693:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2694:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpressionOrAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2699:2: ( (lv_feature_2_0= ruleExpressionOrOp ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2700:1: (lv_feature_2_0= ruleExpressionOrOp )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2700:1: (lv_feature_2_0= ruleExpressionOrOp )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2701:3: lv_feature_2_0= ruleExpressionOrOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionOrAccess().getFeatureExpressionOrOpParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionOrOp_in_ruleExpressionOr5872);
            	    lv_feature_2_0=ruleExpressionOrOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionOrRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"ExpressionOrOp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2717:4: ( (lv_rightOperand_3_0= ruleExpressionAnd ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2718:1: (lv_rightOperand_3_0= ruleExpressionAnd )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2718:1: (lv_rightOperand_3_0= ruleExpressionAnd )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2719:3: lv_rightOperand_3_0= ruleExpressionAnd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionOrAccess().getRightOperandExpressionAndParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionAnd_in_ruleExpressionOr5895);
            	    lv_rightOperand_3_0=ruleExpressionAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionOrRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"ExpressionAnd");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // $ANTLR end "ruleExpressionOr"


    // $ANTLR start "entryRuleExpressionOrOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2743:1: entryRuleExpressionOrOp returns [String current=null] : iv_ruleExpressionOrOp= ruleExpressionOrOp EOF ;
    public final String entryRuleExpressionOrOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionOrOp = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2744:2: (iv_ruleExpressionOrOp= ruleExpressionOrOp EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2745:2: iv_ruleExpressionOrOp= ruleExpressionOrOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionOrOpRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionOrOp_in_entryRuleExpressionOrOp5934);
            iv_ruleExpressionOrOp=ruleExpressionOrOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionOrOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionOrOp5945); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionOrOp"


    // $ANTLR start "ruleExpressionOrOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2752:1: ruleExpressionOrOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'or' ;
    public final AntlrDatatypeRuleToken ruleExpressionOrOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2755:28: (kw= 'or' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2757:2: kw= 'or'
            {
            kw=(Token)match(input,55,FOLLOW_55_in_ruleExpressionOrOp5982); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getExpressionOrOpAccess().getOrKeyword()); 
                  
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
    // $ANTLR end "ruleExpressionOrOp"


    // $ANTLR start "entryRuleExpressionAnd"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2770:1: entryRuleExpressionAnd returns [EObject current=null] : iv_ruleExpressionAnd= ruleExpressionAnd EOF ;
    public final EObject entryRuleExpressionAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionAnd = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2771:2: (iv_ruleExpressionAnd= ruleExpressionAnd EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2772:2: iv_ruleExpressionAnd= ruleExpressionAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionAndRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionAnd_in_entryRuleExpressionAnd6021);
            iv_ruleExpressionAnd=ruleExpressionAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionAnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionAnd6031); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionAnd"


    // $ANTLR start "ruleExpressionAnd"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2779:1: ruleExpressionAnd returns [EObject current=null] : (this_ExpressionEquality_0= ruleExpressionEquality ( ( ( ( () ( ( ruleExpressionAndOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAndOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionEquality ) ) )* ) ;
    public final EObject ruleExpressionAnd() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionEquality_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2782:28: ( (this_ExpressionEquality_0= ruleExpressionEquality ( ( ( ( () ( ( ruleExpressionAndOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAndOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionEquality ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2783:1: (this_ExpressionEquality_0= ruleExpressionEquality ( ( ( ( () ( ( ruleExpressionAndOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAndOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionEquality ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2783:1: (this_ExpressionEquality_0= ruleExpressionEquality ( ( ( ( () ( ( ruleExpressionAndOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAndOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionEquality ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2784:5: this_ExpressionEquality_0= ruleExpressionEquality ( ( ( ( () ( ( ruleExpressionAndOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAndOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionEquality ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAndAccess().getExpressionEqualityParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpressionEquality_in_ruleExpressionAnd6078);
            this_ExpressionEquality_0=ruleExpressionEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExpressionEquality_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2792:1: ( ( ( ( () ( ( ruleExpressionAndOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAndOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionEquality ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==56) ) {
                    int LA41_2 = input.LA(2);

                    if ( (synpred6_InternalLil()) ) {
                        alt41=1;
                    }


                }


                switch (alt41) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2792:2: ( ( ( () ( ( ruleExpressionAndOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAndOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionEquality ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2792:2: ( ( ( () ( ( ruleExpressionAndOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAndOp ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2792:3: ( ( () ( ( ruleExpressionAndOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAndOp ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2797:6: ( () ( (lv_feature_2_0= ruleExpressionAndOp ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2797:7: () ( (lv_feature_2_0= ruleExpressionAndOp ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2797:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2798:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpressionAndAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2803:2: ( (lv_feature_2_0= ruleExpressionAndOp ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2804:1: (lv_feature_2_0= ruleExpressionAndOp )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2804:1: (lv_feature_2_0= ruleExpressionAndOp )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2805:3: lv_feature_2_0= ruleExpressionAndOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionAndAccess().getFeatureExpressionAndOpParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionAndOp_in_ruleExpressionAnd6127);
            	    lv_feature_2_0=ruleExpressionAndOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionAndRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"ExpressionAndOp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2821:4: ( (lv_rightOperand_3_0= ruleExpressionEquality ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2822:1: (lv_rightOperand_3_0= ruleExpressionEquality )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2822:1: (lv_rightOperand_3_0= ruleExpressionEquality )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2823:3: lv_rightOperand_3_0= ruleExpressionEquality
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionAndAccess().getRightOperandExpressionEqualityParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionEquality_in_ruleExpressionAnd6150);
            	    lv_rightOperand_3_0=ruleExpressionEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionAndRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"ExpressionEquality");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // $ANTLR end "ruleExpressionAnd"


    // $ANTLR start "entryRuleExpressionAndOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2847:1: entryRuleExpressionAndOp returns [String current=null] : iv_ruleExpressionAndOp= ruleExpressionAndOp EOF ;
    public final String entryRuleExpressionAndOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionAndOp = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2848:2: (iv_ruleExpressionAndOp= ruleExpressionAndOp EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2849:2: iv_ruleExpressionAndOp= ruleExpressionAndOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionAndOpRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionAndOp_in_entryRuleExpressionAndOp6189);
            iv_ruleExpressionAndOp=ruleExpressionAndOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionAndOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionAndOp6200); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionAndOp"


    // $ANTLR start "ruleExpressionAndOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2856:1: ruleExpressionAndOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'and' ;
    public final AntlrDatatypeRuleToken ruleExpressionAndOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2859:28: (kw= 'and' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2861:2: kw= 'and'
            {
            kw=(Token)match(input,56,FOLLOW_56_in_ruleExpressionAndOp6237); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getExpressionAndOpAccess().getAndKeyword()); 
                  
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
    // $ANTLR end "ruleExpressionAndOp"


    // $ANTLR start "entryRuleExpressionEquality"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2874:1: entryRuleExpressionEquality returns [EObject current=null] : iv_ruleExpressionEquality= ruleExpressionEquality EOF ;
    public final EObject entryRuleExpressionEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionEquality = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2875:2: (iv_ruleExpressionEquality= ruleExpressionEquality EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2876:2: iv_ruleExpressionEquality= ruleExpressionEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionEquality_in_entryRuleExpressionEquality6276);
            iv_ruleExpressionEquality=ruleExpressionEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionEquality; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionEquality6286); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionEquality"


    // $ANTLR start "ruleExpressionEquality"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2883:1: ruleExpressionEquality returns [EObject current=null] : (this_ExpressionCompare_0= ruleExpressionCompare ( ( ( ( () ( ( ruleExpressionEqualityOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionEqualityOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionCompare ) ) )* ) ;
    public final EObject ruleExpressionEquality() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionCompare_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2886:28: ( (this_ExpressionCompare_0= ruleExpressionCompare ( ( ( ( () ( ( ruleExpressionEqualityOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionEqualityOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionCompare ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2887:1: (this_ExpressionCompare_0= ruleExpressionCompare ( ( ( ( () ( ( ruleExpressionEqualityOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionEqualityOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionCompare ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2887:1: (this_ExpressionCompare_0= ruleExpressionCompare ( ( ( ( () ( ( ruleExpressionEqualityOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionEqualityOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionCompare ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2888:5: this_ExpressionCompare_0= ruleExpressionCompare ( ( ( ( () ( ( ruleExpressionEqualityOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionEqualityOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionCompare ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionEqualityAccess().getExpressionCompareParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpressionCompare_in_ruleExpressionEquality6333);
            this_ExpressionCompare_0=ruleExpressionCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExpressionCompare_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2896:1: ( ( ( ( () ( ( ruleExpressionEqualityOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionEqualityOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionCompare ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==57) ) {
                    int LA42_2 = input.LA(2);

                    if ( (synpred7_InternalLil()) ) {
                        alt42=1;
                    }


                }
                else if ( (LA42_0==58) ) {
                    int LA42_3 = input.LA(2);

                    if ( (synpred7_InternalLil()) ) {
                        alt42=1;
                    }


                }


                switch (alt42) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2896:2: ( ( ( () ( ( ruleExpressionEqualityOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionEqualityOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionCompare ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2896:2: ( ( ( () ( ( ruleExpressionEqualityOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionEqualityOp ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2896:3: ( ( () ( ( ruleExpressionEqualityOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionEqualityOp ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2901:6: ( () ( (lv_feature_2_0= ruleExpressionEqualityOp ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2901:7: () ( (lv_feature_2_0= ruleExpressionEqualityOp ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2901:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2902:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpressionEqualityAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2907:2: ( (lv_feature_2_0= ruleExpressionEqualityOp ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2908:1: (lv_feature_2_0= ruleExpressionEqualityOp )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2908:1: (lv_feature_2_0= ruleExpressionEqualityOp )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2909:3: lv_feature_2_0= ruleExpressionEqualityOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionEqualityAccess().getFeatureExpressionEqualityOpParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionEqualityOp_in_ruleExpressionEquality6382);
            	    lv_feature_2_0=ruleExpressionEqualityOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionEqualityRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"ExpressionEqualityOp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2925:4: ( (lv_rightOperand_3_0= ruleExpressionCompare ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2926:1: (lv_rightOperand_3_0= ruleExpressionCompare )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2926:1: (lv_rightOperand_3_0= ruleExpressionCompare )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2927:3: lv_rightOperand_3_0= ruleExpressionCompare
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionEqualityAccess().getRightOperandExpressionCompareParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionCompare_in_ruleExpressionEquality6405);
            	    lv_rightOperand_3_0=ruleExpressionCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionEqualityRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"ExpressionCompare");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // $ANTLR end "ruleExpressionEquality"


    // $ANTLR start "entryRuleExpressionEqualityOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2951:1: entryRuleExpressionEqualityOp returns [String current=null] : iv_ruleExpressionEqualityOp= ruleExpressionEqualityOp EOF ;
    public final String entryRuleExpressionEqualityOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionEqualityOp = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2952:2: (iv_ruleExpressionEqualityOp= ruleExpressionEqualityOp EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2953:2: iv_ruleExpressionEqualityOp= ruleExpressionEqualityOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionEqualityOpRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionEqualityOp_in_entryRuleExpressionEqualityOp6444);
            iv_ruleExpressionEqualityOp=ruleExpressionEqualityOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionEqualityOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionEqualityOp6455); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionEqualityOp"


    // $ANTLR start "ruleExpressionEqualityOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2960:1: ruleExpressionEqualityOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleExpressionEqualityOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2963:28: ( (kw= '==' | kw= '!=' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2964:1: (kw= '==' | kw= '!=' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2964:1: (kw= '==' | kw= '!=' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==57) ) {
                alt43=1;
            }
            else if ( (LA43_0==58) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2965:2: kw= '=='
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleExpressionEqualityOp6493); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionEqualityOpAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2972:2: kw= '!='
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleExpressionEqualityOp6512); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionEqualityOpAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
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
    // $ANTLR end "ruleExpressionEqualityOp"


    // $ANTLR start "entryRuleExpressionCompare"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2985:1: entryRuleExpressionCompare returns [EObject current=null] : iv_ruleExpressionCompare= ruleExpressionCompare EOF ;
    public final EObject entryRuleExpressionCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionCompare = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2986:2: (iv_ruleExpressionCompare= ruleExpressionCompare EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2987:2: iv_ruleExpressionCompare= ruleExpressionCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionCompareRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionCompare_in_entryRuleExpressionCompare6552);
            iv_ruleExpressionCompare=ruleExpressionCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionCompare; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionCompare6562); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionCompare"


    // $ANTLR start "ruleExpressionCompare"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2994:1: ruleExpressionCompare returns [EObject current=null] : (this_ExpressionOther_0= ruleExpressionOther ( ( ( ( () ( ( ruleExpressionCompareOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionCompareOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionOther ) ) )* ) ;
    public final EObject ruleExpressionCompare() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionOther_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2997:28: ( (this_ExpressionOther_0= ruleExpressionOther ( ( ( ( () ( ( ruleExpressionCompareOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionCompareOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionOther ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2998:1: (this_ExpressionOther_0= ruleExpressionOther ( ( ( ( () ( ( ruleExpressionCompareOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionCompareOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionOther ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2998:1: (this_ExpressionOther_0= ruleExpressionOther ( ( ( ( () ( ( ruleExpressionCompareOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionCompareOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionOther ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2999:5: this_ExpressionOther_0= ruleExpressionOther ( ( ( ( () ( ( ruleExpressionCompareOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionCompareOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionOther ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionCompareAccess().getExpressionOtherParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpressionOther_in_ruleExpressionCompare6609);
            this_ExpressionOther_0=ruleExpressionOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExpressionOther_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3007:1: ( ( ( ( () ( ( ruleExpressionCompareOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionCompareOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionOther ) ) )*
            loop44:
            do {
                int alt44=2;
                switch ( input.LA(1) ) {
                case 59:
                    {
                    int LA44_2 = input.LA(2);

                    if ( (synpred8_InternalLil()) ) {
                        alt44=1;
                    }


                    }
                    break;
                case 60:
                    {
                    int LA44_3 = input.LA(2);

                    if ( (synpred8_InternalLil()) ) {
                        alt44=1;
                    }


                    }
                    break;
                case 61:
                    {
                    int LA44_4 = input.LA(2);

                    if ( (synpred8_InternalLil()) ) {
                        alt44=1;
                    }


                    }
                    break;
                case 62:
                    {
                    int LA44_5 = input.LA(2);

                    if ( (synpred8_InternalLil()) ) {
                        alt44=1;
                    }


                    }
                    break;

                }

                switch (alt44) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3007:2: ( ( ( () ( ( ruleExpressionCompareOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionCompareOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionOther ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3007:2: ( ( ( () ( ( ruleExpressionCompareOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionCompareOp ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3007:3: ( ( () ( ( ruleExpressionCompareOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionCompareOp ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3012:6: ( () ( (lv_feature_2_0= ruleExpressionCompareOp ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3012:7: () ( (lv_feature_2_0= ruleExpressionCompareOp ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3012:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3013:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpressionCompareAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3018:2: ( (lv_feature_2_0= ruleExpressionCompareOp ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3019:1: (lv_feature_2_0= ruleExpressionCompareOp )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3019:1: (lv_feature_2_0= ruleExpressionCompareOp )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3020:3: lv_feature_2_0= ruleExpressionCompareOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionCompareAccess().getFeatureExpressionCompareOpParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionCompareOp_in_ruleExpressionCompare6658);
            	    lv_feature_2_0=ruleExpressionCompareOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionCompareRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"ExpressionCompareOp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3036:4: ( (lv_rightOperand_3_0= ruleExpressionOther ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3037:1: (lv_rightOperand_3_0= ruleExpressionOther )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3037:1: (lv_rightOperand_3_0= ruleExpressionOther )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3038:3: lv_rightOperand_3_0= ruleExpressionOther
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionCompareAccess().getRightOperandExpressionOtherParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionOther_in_ruleExpressionCompare6681);
            	    lv_rightOperand_3_0=ruleExpressionOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionCompareRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"ExpressionOther");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // $ANTLR end "ruleExpressionCompare"


    // $ANTLR start "entryRuleExpressionCompareOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3062:1: entryRuleExpressionCompareOp returns [String current=null] : iv_ruleExpressionCompareOp= ruleExpressionCompareOp EOF ;
    public final String entryRuleExpressionCompareOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionCompareOp = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3063:2: (iv_ruleExpressionCompareOp= ruleExpressionCompareOp EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3064:2: iv_ruleExpressionCompareOp= ruleExpressionCompareOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionCompareOpRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionCompareOp_in_entryRuleExpressionCompareOp6720);
            iv_ruleExpressionCompareOp=ruleExpressionCompareOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionCompareOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionCompareOp6731); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionCompareOp"


    // $ANTLR start "ruleExpressionCompareOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3071:1: ruleExpressionCompareOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<=' | kw= '>=' | kw= '<' | kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleExpressionCompareOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3074:28: ( (kw= '<=' | kw= '>=' | kw= '<' | kw= '>' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3075:1: (kw= '<=' | kw= '>=' | kw= '<' | kw= '>' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3075:1: (kw= '<=' | kw= '>=' | kw= '<' | kw= '>' )
            int alt45=4;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt45=1;
                }
                break;
            case 60:
                {
                alt45=2;
                }
                break;
            case 61:
                {
                alt45=3;
                }
                break;
            case 62:
                {
                alt45=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3076:2: kw= '<='
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleExpressionCompareOp6769); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionCompareOpAccess().getLessThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3083:2: kw= '>='
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleExpressionCompareOp6788); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionCompareOpAccess().getGreaterThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3090:2: kw= '<'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleExpressionCompareOp6807); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionCompareOpAccess().getLessThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3097:2: kw= '>'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleExpressionCompareOp6826); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionCompareOpAccess().getGreaterThanSignKeyword_3()); 
                          
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
    // $ANTLR end "ruleExpressionCompareOp"


    // $ANTLR start "entryRuleExpressionOther"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3110:1: entryRuleExpressionOther returns [EObject current=null] : iv_ruleExpressionOther= ruleExpressionOther EOF ;
    public final EObject entryRuleExpressionOther() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionOther = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3111:2: (iv_ruleExpressionOther= ruleExpressionOther EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3112:2: iv_ruleExpressionOther= ruleExpressionOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionOtherRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionOther_in_entryRuleExpressionOther6866);
            iv_ruleExpressionOther=ruleExpressionOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionOther; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionOther6876); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionOther"


    // $ANTLR start "ruleExpressionOther"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3119:1: ruleExpressionOther returns [EObject current=null] : (this_ExpressionAddition_0= ruleExpressionAddition ( ( ( ( () ( ( ruleExpressionOtherOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOtherOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAddition ) ) )* ) ;
    public final EObject ruleExpressionOther() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionAddition_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3122:28: ( (this_ExpressionAddition_0= ruleExpressionAddition ( ( ( ( () ( ( ruleExpressionOtherOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOtherOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAddition ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3123:1: (this_ExpressionAddition_0= ruleExpressionAddition ( ( ( ( () ( ( ruleExpressionOtherOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOtherOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAddition ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3123:1: (this_ExpressionAddition_0= ruleExpressionAddition ( ( ( ( () ( ( ruleExpressionOtherOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOtherOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAddition ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3124:5: this_ExpressionAddition_0= ruleExpressionAddition ( ( ( ( () ( ( ruleExpressionOtherOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOtherOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAddition ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionOtherAccess().getExpressionAdditionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpressionAddition_in_ruleExpressionOther6923);
            this_ExpressionAddition_0=ruleExpressionAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExpressionAddition_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3132:1: ( ( ( ( () ( ( ruleExpressionOtherOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOtherOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAddition ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==63) ) {
                    int LA46_2 = input.LA(2);

                    if ( (synpred9_InternalLil()) ) {
                        alt46=1;
                    }


                }
                else if ( (LA46_0==64) ) {
                    int LA46_3 = input.LA(2);

                    if ( (synpred9_InternalLil()) ) {
                        alt46=1;
                    }


                }


                switch (alt46) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3132:2: ( ( ( () ( ( ruleExpressionOtherOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOtherOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionAddition ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3132:2: ( ( ( () ( ( ruleExpressionOtherOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOtherOp ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3132:3: ( ( () ( ( ruleExpressionOtherOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionOtherOp ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3137:6: ( () ( (lv_feature_2_0= ruleExpressionOtherOp ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3137:7: () ( (lv_feature_2_0= ruleExpressionOtherOp ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3137:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3138:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpressionOtherAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3143:2: ( (lv_feature_2_0= ruleExpressionOtherOp ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3144:1: (lv_feature_2_0= ruleExpressionOtherOp )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3144:1: (lv_feature_2_0= ruleExpressionOtherOp )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3145:3: lv_feature_2_0= ruleExpressionOtherOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionOtherAccess().getFeatureExpressionOtherOpParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionOtherOp_in_ruleExpressionOther6972);
            	    lv_feature_2_0=ruleExpressionOtherOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionOtherRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"ExpressionOtherOp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3161:4: ( (lv_rightOperand_3_0= ruleExpressionAddition ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3162:1: (lv_rightOperand_3_0= ruleExpressionAddition )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3162:1: (lv_rightOperand_3_0= ruleExpressionAddition )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3163:3: lv_rightOperand_3_0= ruleExpressionAddition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionOtherAccess().getRightOperandExpressionAdditionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionAddition_in_ruleExpressionOther6995);
            	    lv_rightOperand_3_0=ruleExpressionAddition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionOtherRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"ExpressionAddition");
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
    // $ANTLR end "ruleExpressionOther"


    // $ANTLR start "entryRuleExpressionOtherOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3187:1: entryRuleExpressionOtherOp returns [String current=null] : iv_ruleExpressionOtherOp= ruleExpressionOtherOp EOF ;
    public final String entryRuleExpressionOtherOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionOtherOp = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3188:2: (iv_ruleExpressionOtherOp= ruleExpressionOtherOp EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3189:2: iv_ruleExpressionOtherOp= ruleExpressionOtherOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionOtherOpRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionOtherOp_in_entryRuleExpressionOtherOp7034);
            iv_ruleExpressionOtherOp=ruleExpressionOtherOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionOtherOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionOtherOp7045); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionOtherOp"


    // $ANTLR start "ruleExpressionOtherOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3196:1: ruleExpressionOtherOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<>' | kw= '?:' ) ;
    public final AntlrDatatypeRuleToken ruleExpressionOtherOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3199:28: ( (kw= '<>' | kw= '?:' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3200:1: (kw= '<>' | kw= '?:' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3200:1: (kw= '<>' | kw= '?:' )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==63) ) {
                alt47=1;
            }
            else if ( (LA47_0==64) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3201:2: kw= '<>'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleExpressionOtherOp7083); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionOtherOpAccess().getLessThanSignGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3208:2: kw= '?:'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleExpressionOtherOp7102); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionOtherOpAccess().getQuestionMarkColonKeyword_1()); 
                          
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
    // $ANTLR end "ruleExpressionOtherOp"


    // $ANTLR start "entryRuleExpressionAddition"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3221:1: entryRuleExpressionAddition returns [EObject current=null] : iv_ruleExpressionAddition= ruleExpressionAddition EOF ;
    public final EObject entryRuleExpressionAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionAddition = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3222:2: (iv_ruleExpressionAddition= ruleExpressionAddition EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3223:2: iv_ruleExpressionAddition= ruleExpressionAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionAddition_in_entryRuleExpressionAddition7142);
            iv_ruleExpressionAddition=ruleExpressionAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionAddition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionAddition7152); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionAddition"


    // $ANTLR start "ruleExpressionAddition"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3230:1: ruleExpressionAddition returns [EObject current=null] : (this_ExpressionMultiplication_0= ruleExpressionMultiplication ( ( ( ( () ( ( ruleExpressionAdditionOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAdditionOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionMultiplication ) ) )* ) ;
    public final EObject ruleExpressionAddition() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionMultiplication_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3233:28: ( (this_ExpressionMultiplication_0= ruleExpressionMultiplication ( ( ( ( () ( ( ruleExpressionAdditionOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAdditionOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionMultiplication ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3234:1: (this_ExpressionMultiplication_0= ruleExpressionMultiplication ( ( ( ( () ( ( ruleExpressionAdditionOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAdditionOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionMultiplication ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3234:1: (this_ExpressionMultiplication_0= ruleExpressionMultiplication ( ( ( ( () ( ( ruleExpressionAdditionOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAdditionOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionMultiplication ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3235:5: this_ExpressionMultiplication_0= ruleExpressionMultiplication ( ( ( ( () ( ( ruleExpressionAdditionOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAdditionOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAdditionAccess().getExpressionMultiplicationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpressionMultiplication_in_ruleExpressionAddition7199);
            this_ExpressionMultiplication_0=ruleExpressionMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExpressionMultiplication_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3243:1: ( ( ( ( () ( ( ruleExpressionAdditionOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAdditionOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionMultiplication ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==65) ) {
                    int LA48_2 = input.LA(2);

                    if ( (synpred10_InternalLil()) ) {
                        alt48=1;
                    }


                }
                else if ( (LA48_0==66) ) {
                    int LA48_3 = input.LA(2);

                    if ( (synpred10_InternalLil()) ) {
                        alt48=1;
                    }


                }


                switch (alt48) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3243:2: ( ( ( () ( ( ruleExpressionAdditionOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAdditionOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionMultiplication ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3243:2: ( ( ( () ( ( ruleExpressionAdditionOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAdditionOp ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3243:3: ( ( () ( ( ruleExpressionAdditionOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionAdditionOp ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3248:6: ( () ( (lv_feature_2_0= ruleExpressionAdditionOp ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3248:7: () ( (lv_feature_2_0= ruleExpressionAdditionOp ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3248:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3249:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpressionAdditionAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3254:2: ( (lv_feature_2_0= ruleExpressionAdditionOp ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3255:1: (lv_feature_2_0= ruleExpressionAdditionOp )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3255:1: (lv_feature_2_0= ruleExpressionAdditionOp )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3256:3: lv_feature_2_0= ruleExpressionAdditionOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionAdditionAccess().getFeatureExpressionAdditionOpParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionAdditionOp_in_ruleExpressionAddition7248);
            	    lv_feature_2_0=ruleExpressionAdditionOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionAdditionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"ExpressionAdditionOp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3272:4: ( (lv_rightOperand_3_0= ruleExpressionMultiplication ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3273:1: (lv_rightOperand_3_0= ruleExpressionMultiplication )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3273:1: (lv_rightOperand_3_0= ruleExpressionMultiplication )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3274:3: lv_rightOperand_3_0= ruleExpressionMultiplication
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionAdditionAccess().getRightOperandExpressionMultiplicationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionMultiplication_in_ruleExpressionAddition7271);
            	    lv_rightOperand_3_0=ruleExpressionMultiplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionAdditionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"ExpressionMultiplication");
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
    // $ANTLR end "ruleExpressionAddition"


    // $ANTLR start "entryRuleExpressionAdditionOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3298:1: entryRuleExpressionAdditionOp returns [String current=null] : iv_ruleExpressionAdditionOp= ruleExpressionAdditionOp EOF ;
    public final String entryRuleExpressionAdditionOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionAdditionOp = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3299:2: (iv_ruleExpressionAdditionOp= ruleExpressionAdditionOp EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3300:2: iv_ruleExpressionAdditionOp= ruleExpressionAdditionOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionAdditionOpRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionAdditionOp_in_entryRuleExpressionAdditionOp7310);
            iv_ruleExpressionAdditionOp=ruleExpressionAdditionOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionAdditionOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionAdditionOp7321); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionAdditionOp"


    // $ANTLR start "ruleExpressionAdditionOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3307:1: ruleExpressionAdditionOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleExpressionAdditionOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3310:28: ( (kw= '+' | kw= '-' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3311:1: (kw= '+' | kw= '-' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3311:1: (kw= '+' | kw= '-' )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==65) ) {
                alt49=1;
            }
            else if ( (LA49_0==66) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3312:2: kw= '+'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleExpressionAdditionOp7359); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionAdditionOpAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3319:2: kw= '-'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleExpressionAdditionOp7378); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionAdditionOpAccess().getHyphenMinusKeyword_1()); 
                          
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
    // $ANTLR end "ruleExpressionAdditionOp"


    // $ANTLR start "entryRuleExpressionMultiplication"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3332:1: entryRuleExpressionMultiplication returns [EObject current=null] : iv_ruleExpressionMultiplication= ruleExpressionMultiplication EOF ;
    public final EObject entryRuleExpressionMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionMultiplication = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3333:2: (iv_ruleExpressionMultiplication= ruleExpressionMultiplication EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3334:2: iv_ruleExpressionMultiplication= ruleExpressionMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionMultiplication_in_entryRuleExpressionMultiplication7418);
            iv_ruleExpressionMultiplication=ruleExpressionMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionMultiplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionMultiplication7428); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionMultiplication"


    // $ANTLR start "ruleExpressionMultiplication"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3341:1: ruleExpressionMultiplication returns [EObject current=null] : (this_ExpressionUnary_0= ruleExpressionUnary ( ( ( ( () ( ( ruleExpressionMultiplicationOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionUnary ) ) )* ) ;
    public final EObject ruleExpressionMultiplication() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionUnary_0 = null;

        AntlrDatatypeRuleToken lv_feature_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3344:28: ( (this_ExpressionUnary_0= ruleExpressionUnary ( ( ( ( () ( ( ruleExpressionMultiplicationOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionUnary ) ) )* ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3345:1: (this_ExpressionUnary_0= ruleExpressionUnary ( ( ( ( () ( ( ruleExpressionMultiplicationOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionUnary ) ) )* )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3345:1: (this_ExpressionUnary_0= ruleExpressionUnary ( ( ( ( () ( ( ruleExpressionMultiplicationOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionUnary ) ) )* )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3346:5: this_ExpressionUnary_0= ruleExpressionUnary ( ( ( ( () ( ( ruleExpressionMultiplicationOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionUnary ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionMultiplicationAccess().getExpressionUnaryParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpressionUnary_in_ruleExpressionMultiplication7475);
            this_ExpressionUnary_0=ruleExpressionUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExpressionUnary_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3354:1: ( ( ( ( () ( ( ruleExpressionMultiplicationOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionUnary ) ) )*
            loop50:
            do {
                int alt50=2;
                switch ( input.LA(1) ) {
                case 67:
                    {
                    int LA50_2 = input.LA(2);

                    if ( (synpred11_InternalLil()) ) {
                        alt50=1;
                    }


                    }
                    break;
                case 68:
                    {
                    int LA50_3 = input.LA(2);

                    if ( (synpred11_InternalLil()) ) {
                        alt50=1;
                    }


                    }
                    break;
                case 69:
                    {
                    int LA50_4 = input.LA(2);

                    if ( (synpred11_InternalLil()) ) {
                        alt50=1;
                    }


                    }
                    break;

                }

                switch (alt50) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3354:2: ( ( ( () ( ( ruleExpressionMultiplicationOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) ) ) ) ( (lv_rightOperand_3_0= ruleExpressionUnary ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3354:2: ( ( ( () ( ( ruleExpressionMultiplicationOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3354:3: ( ( () ( ( ruleExpressionMultiplicationOp ) ) ) )=> ( () ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3359:6: ( () ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3359:7: () ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3359:7: ()
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3360:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpressionMultiplicationAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3365:2: ( (lv_feature_2_0= ruleExpressionMultiplicationOp ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3366:1: (lv_feature_2_0= ruleExpressionMultiplicationOp )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3366:1: (lv_feature_2_0= ruleExpressionMultiplicationOp )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3367:3: lv_feature_2_0= ruleExpressionMultiplicationOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionMultiplicationAccess().getFeatureExpressionMultiplicationOpParserRuleCall_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionMultiplicationOp_in_ruleExpressionMultiplication7524);
            	    lv_feature_2_0=ruleExpressionMultiplicationOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionMultiplicationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"feature",
            	              		lv_feature_2_0, 
            	              		"ExpressionMultiplicationOp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3383:4: ( (lv_rightOperand_3_0= ruleExpressionUnary ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3384:1: (lv_rightOperand_3_0= ruleExpressionUnary )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3384:1: (lv_rightOperand_3_0= ruleExpressionUnary )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3385:3: lv_rightOperand_3_0= ruleExpressionUnary
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionMultiplicationAccess().getRightOperandExpressionUnaryParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionUnary_in_ruleExpressionMultiplication7547);
            	    lv_rightOperand_3_0=ruleExpressionUnary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionMultiplicationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"ExpressionUnary");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // $ANTLR end "ruleExpressionMultiplication"


    // $ANTLR start "entryRuleExpressionMultiplicationOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3409:1: entryRuleExpressionMultiplicationOp returns [String current=null] : iv_ruleExpressionMultiplicationOp= ruleExpressionMultiplicationOp EOF ;
    public final String entryRuleExpressionMultiplicationOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionMultiplicationOp = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3410:2: (iv_ruleExpressionMultiplicationOp= ruleExpressionMultiplicationOp EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3411:2: iv_ruleExpressionMultiplicationOp= ruleExpressionMultiplicationOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionMultiplicationOpRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionMultiplicationOp_in_entryRuleExpressionMultiplicationOp7586);
            iv_ruleExpressionMultiplicationOp=ruleExpressionMultiplicationOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionMultiplicationOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionMultiplicationOp7597); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionMultiplicationOp"


    // $ANTLR start "ruleExpressionMultiplicationOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3418:1: ruleExpressionMultiplicationOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleExpressionMultiplicationOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3421:28: ( (kw= '*' | kw= '/' | kw= '%' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3422:1: (kw= '*' | kw= '/' | kw= '%' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3422:1: (kw= '*' | kw= '/' | kw= '%' )
            int alt51=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt51=1;
                }
                break;
            case 68:
                {
                alt51=2;
                }
                break;
            case 69:
                {
                alt51=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3423:2: kw= '*'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleExpressionMultiplicationOp7635); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionMultiplicationOpAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3430:2: kw= '/'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleExpressionMultiplicationOp7654); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionMultiplicationOpAccess().getSolidusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3437:2: kw= '%'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleExpressionMultiplicationOp7673); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionMultiplicationOpAccess().getPercentSignKeyword_2()); 
                          
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
    // $ANTLR end "ruleExpressionMultiplicationOp"


    // $ANTLR start "entryRuleExpressionUnary"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3450:1: entryRuleExpressionUnary returns [EObject current=null] : iv_ruleExpressionUnary= ruleExpressionUnary EOF ;
    public final EObject entryRuleExpressionUnary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionUnary = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3451:2: (iv_ruleExpressionUnary= ruleExpressionUnary EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3452:2: iv_ruleExpressionUnary= ruleExpressionUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionUnary_in_entryRuleExpressionUnary7713);
            iv_ruleExpressionUnary=ruleExpressionUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionUnary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionUnary7723); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionUnary"


    // $ANTLR start "ruleExpressionUnary"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3459:1: ruleExpressionUnary returns [EObject current=null] : ( ( () ( (lv_feature_1_0= ruleExpressionUnaryOp ) ) ( (lv_operand_2_0= ruleExpressionPrimary ) ) ) | this_ExpressionPrimary_3= ruleExpressionPrimary ) ;
    public final EObject ruleExpressionUnary() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_feature_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_ExpressionPrimary_3 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3462:28: ( ( ( () ( (lv_feature_1_0= ruleExpressionUnaryOp ) ) ( (lv_operand_2_0= ruleExpressionPrimary ) ) ) | this_ExpressionPrimary_3= ruleExpressionPrimary ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3463:1: ( ( () ( (lv_feature_1_0= ruleExpressionUnaryOp ) ) ( (lv_operand_2_0= ruleExpressionPrimary ) ) ) | this_ExpressionPrimary_3= ruleExpressionPrimary )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3463:1: ( ( () ( (lv_feature_1_0= ruleExpressionUnaryOp ) ) ( (lv_operand_2_0= ruleExpressionPrimary ) ) ) | this_ExpressionPrimary_3= ruleExpressionPrimary )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=65 && LA52_0<=66)||LA52_0==70) ) {
                alt52=1;
            }
            else if ( ((LA52_0>=RULE_ID && LA52_0<=RULE_INT)||LA52_0==27||(LA52_0>=30 && LA52_0<=31)||LA52_0==50||LA52_0==71||LA52_0==74||LA52_0==77||(LA52_0>=79 && LA52_0<=113)) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3463:2: ( () ( (lv_feature_1_0= ruleExpressionUnaryOp ) ) ( (lv_operand_2_0= ruleExpressionPrimary ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3463:2: ( () ( (lv_feature_1_0= ruleExpressionUnaryOp ) ) ( (lv_operand_2_0= ruleExpressionPrimary ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3463:3: () ( (lv_feature_1_0= ruleExpressionUnaryOp ) ) ( (lv_operand_2_0= ruleExpressionPrimary ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3463:3: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3464:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpressionUnaryAccess().getUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3469:2: ( (lv_feature_1_0= ruleExpressionUnaryOp ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3470:1: (lv_feature_1_0= ruleExpressionUnaryOp )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3470:1: (lv_feature_1_0= ruleExpressionUnaryOp )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3471:3: lv_feature_1_0= ruleExpressionUnaryOp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionUnaryAccess().getFeatureExpressionUnaryOpParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpressionUnaryOp_in_ruleExpressionUnary7779);
                    lv_feature_1_0=ruleExpressionUnaryOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionUnaryRule());
                      	        }
                             		set(
                             			current, 
                             			"feature",
                              		lv_feature_1_0, 
                              		"ExpressionUnaryOp");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3487:2: ( (lv_operand_2_0= ruleExpressionPrimary ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3488:1: (lv_operand_2_0= ruleExpressionPrimary )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3488:1: (lv_operand_2_0= ruleExpressionPrimary )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3489:3: lv_operand_2_0= ruleExpressionPrimary
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionUnaryAccess().getOperandExpressionPrimaryParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpressionPrimary_in_ruleExpressionUnary7800);
                    lv_operand_2_0=ruleExpressionPrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionUnaryRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"ExpressionPrimary");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3507:5: this_ExpressionPrimary_3= ruleExpressionPrimary
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionUnaryAccess().getExpressionPrimaryParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionPrimary_in_ruleExpressionUnary7829);
                    this_ExpressionPrimary_3=ruleExpressionPrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExpressionPrimary_3; 
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
    // $ANTLR end "ruleExpressionUnary"


    // $ANTLR start "entryRuleExpressionUnaryOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3523:1: entryRuleExpressionUnaryOp returns [String current=null] : iv_ruleExpressionUnaryOp= ruleExpressionUnaryOp EOF ;
    public final String entryRuleExpressionUnaryOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionUnaryOp = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3524:2: (iv_ruleExpressionUnaryOp= ruleExpressionUnaryOp EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3525:2: iv_ruleExpressionUnaryOp= ruleExpressionUnaryOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionUnaryOpRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionUnaryOp_in_entryRuleExpressionUnaryOp7865);
            iv_ruleExpressionUnaryOp=ruleExpressionUnaryOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionUnaryOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionUnaryOp7876); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionUnaryOp"


    // $ANTLR start "ruleExpressionUnaryOp"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3532:1: ruleExpressionUnaryOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleExpressionUnaryOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3535:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3536:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3536:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt53=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt53=1;
                }
                break;
            case 66:
                {
                alt53=2;
                }
                break;
            case 65:
                {
                alt53=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3537:2: kw= '!'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleExpressionUnaryOp7914); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionUnaryOpAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3544:2: kw= '-'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleExpressionUnaryOp7933); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionUnaryOpAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3551:2: kw= '+'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleExpressionUnaryOp7952); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionUnaryOpAccess().getPlusSignKeyword_2()); 
                          
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
    // $ANTLR end "ruleExpressionUnaryOp"


    // $ANTLR start "entryRuleExpressionPrimary"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3564:1: entryRuleExpressionPrimary returns [EObject current=null] : iv_ruleExpressionPrimary= ruleExpressionPrimary EOF ;
    public final EObject entryRuleExpressionPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionPrimary = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3565:2: (iv_ruleExpressionPrimary= ruleExpressionPrimary EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3566:2: iv_ruleExpressionPrimary= ruleExpressionPrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionPrimaryRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionPrimary_in_entryRuleExpressionPrimary7992);
            iv_ruleExpressionPrimary=ruleExpressionPrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionPrimary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionPrimary8002); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionPrimary"


    // $ANTLR start "ruleExpressionPrimary"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3573:1: ruleExpressionPrimary returns [EObject current=null] : (this_ExpressionSwitch_0= ruleExpressionSwitch | this_ExpressionIf_1= ruleExpressionIf | this_ExpressionLiteral_2= ruleExpressionLiteral | this_ExpressionForEach_3= ruleExpressionForEach | this_ExpressionFunctionCall_4= ruleExpressionFunctionCall | this_ExpressionParenthesized_5= ruleExpressionParenthesized ) ;
    public final EObject ruleExpressionPrimary() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionSwitch_0 = null;

        EObject this_ExpressionIf_1 = null;

        EObject this_ExpressionLiteral_2 = null;

        EObject this_ExpressionForEach_3 = null;

        EObject this_ExpressionFunctionCall_4 = null;

        EObject this_ExpressionParenthesized_5 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3576:28: ( (this_ExpressionSwitch_0= ruleExpressionSwitch | this_ExpressionIf_1= ruleExpressionIf | this_ExpressionLiteral_2= ruleExpressionLiteral | this_ExpressionForEach_3= ruleExpressionForEach | this_ExpressionFunctionCall_4= ruleExpressionFunctionCall | this_ExpressionParenthesized_5= ruleExpressionParenthesized ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3577:1: (this_ExpressionSwitch_0= ruleExpressionSwitch | this_ExpressionIf_1= ruleExpressionIf | this_ExpressionLiteral_2= ruleExpressionLiteral | this_ExpressionForEach_3= ruleExpressionForEach | this_ExpressionFunctionCall_4= ruleExpressionFunctionCall | this_ExpressionParenthesized_5= ruleExpressionParenthesized )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3577:1: (this_ExpressionSwitch_0= ruleExpressionSwitch | this_ExpressionIf_1= ruleExpressionIf | this_ExpressionLiteral_2= ruleExpressionLiteral | this_ExpressionForEach_3= ruleExpressionForEach | this_ExpressionFunctionCall_4= ruleExpressionFunctionCall | this_ExpressionParenthesized_5= ruleExpressionParenthesized )
            int alt54=6;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt54=1;
                }
                break;
            case 50:
                {
                alt54=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 27:
            case 30:
            case 31:
            case 110:
            case 111:
            case 112:
            case 113:
                {
                alt54=3;
                }
                break;
            case 77:
                {
                alt54=4;
                }
                break;
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
                {
                alt54=5;
                }
                break;
            case 71:
                {
                alt54=6;
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3578:5: this_ExpressionSwitch_0= ruleExpressionSwitch
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionPrimaryAccess().getExpressionSwitchParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionSwitch_in_ruleExpressionPrimary8049);
                    this_ExpressionSwitch_0=ruleExpressionSwitch();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExpressionSwitch_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3588:5: this_ExpressionIf_1= ruleExpressionIf
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionPrimaryAccess().getExpressionIfParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionIf_in_ruleExpressionPrimary8076);
                    this_ExpressionIf_1=ruleExpressionIf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExpressionIf_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3598:5: this_ExpressionLiteral_2= ruleExpressionLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionPrimaryAccess().getExpressionLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionLiteral_in_ruleExpressionPrimary8103);
                    this_ExpressionLiteral_2=ruleExpressionLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExpressionLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3608:5: this_ExpressionForEach_3= ruleExpressionForEach
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionPrimaryAccess().getExpressionForEachParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionForEach_in_ruleExpressionPrimary8130);
                    this_ExpressionForEach_3=ruleExpressionForEach();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExpressionForEach_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3618:5: this_ExpressionFunctionCall_4= ruleExpressionFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionPrimaryAccess().getExpressionFunctionCallParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionFunctionCall_in_ruleExpressionPrimary8157);
                    this_ExpressionFunctionCall_4=ruleExpressionFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExpressionFunctionCall_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3628:5: this_ExpressionParenthesized_5= ruleExpressionParenthesized
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionPrimaryAccess().getExpressionParenthesizedParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionParenthesized_in_ruleExpressionPrimary8184);
                    this_ExpressionParenthesized_5=ruleExpressionParenthesized();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExpressionParenthesized_5; 
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
    // $ANTLR end "ruleExpressionPrimary"


    // $ANTLR start "entryRuleExpressionLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3644:1: entryRuleExpressionLiteral returns [EObject current=null] : iv_ruleExpressionLiteral= ruleExpressionLiteral EOF ;
    public final EObject entryRuleExpressionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLiteral = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3645:2: (iv_ruleExpressionLiteral= ruleExpressionLiteral EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3646:2: iv_ruleExpressionLiteral= ruleExpressionLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionLiteral_in_entryRuleExpressionLiteral8219);
            iv_ruleExpressionLiteral=ruleExpressionLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionLiteral8229); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionLiteral"


    // $ANTLR start "ruleExpressionLiteral"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3653:1: ruleExpressionLiteral returns [EObject current=null] : (this_ExpressionLiteralCollection_0= ruleExpressionLiteralCollection | this_LiteralBoolean_1= ruleLiteralBoolean | this_LiteralNumber_2= ruleLiteralNumber | this_LiteralNull_3= ruleLiteralNull | this_LiteralText_4= ruleLiteralText | this_LiteralTime_5= ruleLiteralTime | this_LiteralEnum_6= ruleLiteralEnum | ( () ( (otherlv_8= RULE_ID ) ) ) ) ;
    public final EObject ruleExpressionLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_8=null;
        EObject this_ExpressionLiteralCollection_0 = null;

        EObject this_LiteralBoolean_1 = null;

        EObject this_LiteralNumber_2 = null;

        EObject this_LiteralNull_3 = null;

        EObject this_LiteralText_4 = null;

        EObject this_LiteralTime_5 = null;

        EObject this_LiteralEnum_6 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3656:28: ( (this_ExpressionLiteralCollection_0= ruleExpressionLiteralCollection | this_LiteralBoolean_1= ruleLiteralBoolean | this_LiteralNumber_2= ruleLiteralNumber | this_LiteralNull_3= ruleLiteralNull | this_LiteralText_4= ruleLiteralText | this_LiteralTime_5= ruleLiteralTime | this_LiteralEnum_6= ruleLiteralEnum | ( () ( (otherlv_8= RULE_ID ) ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3657:1: (this_ExpressionLiteralCollection_0= ruleExpressionLiteralCollection | this_LiteralBoolean_1= ruleLiteralBoolean | this_LiteralNumber_2= ruleLiteralNumber | this_LiteralNull_3= ruleLiteralNull | this_LiteralText_4= ruleLiteralText | this_LiteralTime_5= ruleLiteralTime | this_LiteralEnum_6= ruleLiteralEnum | ( () ( (otherlv_8= RULE_ID ) ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3657:1: (this_ExpressionLiteralCollection_0= ruleExpressionLiteralCollection | this_LiteralBoolean_1= ruleLiteralBoolean | this_LiteralNumber_2= ruleLiteralNumber | this_LiteralNull_3= ruleLiteralNull | this_LiteralText_4= ruleLiteralText | this_LiteralTime_5= ruleLiteralTime | this_LiteralEnum_6= ruleLiteralEnum | ( () ( (otherlv_8= RULE_ID ) ) ) )
            int alt55=8;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3658:5: this_ExpressionLiteralCollection_0= ruleExpressionLiteralCollection
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionLiteralAccess().getExpressionLiteralCollectionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionLiteralCollection_in_ruleExpressionLiteral8276);
                    this_ExpressionLiteralCollection_0=ruleExpressionLiteralCollection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExpressionLiteralCollection_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3668:5: this_LiteralBoolean_1= ruleLiteralBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionLiteralAccess().getLiteralBooleanParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralBoolean_in_ruleExpressionLiteral8303);
                    this_LiteralBoolean_1=ruleLiteralBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LiteralBoolean_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3678:5: this_LiteralNumber_2= ruleLiteralNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionLiteralAccess().getLiteralNumberParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralNumber_in_ruleExpressionLiteral8330);
                    this_LiteralNumber_2=ruleLiteralNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LiteralNumber_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3688:5: this_LiteralNull_3= ruleLiteralNull
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionLiteralAccess().getLiteralNullParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralNull_in_ruleExpressionLiteral8357);
                    this_LiteralNull_3=ruleLiteralNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LiteralNull_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3698:5: this_LiteralText_4= ruleLiteralText
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionLiteralAccess().getLiteralTextParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralText_in_ruleExpressionLiteral8384);
                    this_LiteralText_4=ruleLiteralText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LiteralText_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3708:5: this_LiteralTime_5= ruleLiteralTime
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionLiteralAccess().getLiteralTimeParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralTime_in_ruleExpressionLiteral8411);
                    this_LiteralTime_5=ruleLiteralTime();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LiteralTime_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3718:5: this_LiteralEnum_6= ruleLiteralEnum
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionLiteralAccess().getLiteralEnumParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralEnum_in_ruleExpressionLiteral8438);
                    this_LiteralEnum_6=ruleLiteralEnum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LiteralEnum_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3727:6: ( () ( (otherlv_8= RULE_ID ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3727:6: ( () ( (otherlv_8= RULE_ID ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3727:7: () ( (otherlv_8= RULE_ID ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3727:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3728:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpressionLiteralAccess().getLiteralDataAction_7_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3733:2: ( (otherlv_8= RULE_ID ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3734:1: (otherlv_8= RULE_ID )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3734:1: (otherlv_8= RULE_ID )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3735:3: otherlv_8= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpressionLiteralRule());
                      	        }
                              
                    }
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpressionLiteral8473); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_8, grammarAccess.getExpressionLiteralAccess().getDataInteractorDataCrossReference_7_1_0()); 
                      	
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
    // $ANTLR end "ruleExpressionLiteral"


    // $ANTLR start "entryRuleExpressionLiteralCollection"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3754:1: entryRuleExpressionLiteralCollection returns [EObject current=null] : iv_ruleExpressionLiteralCollection= ruleExpressionLiteralCollection EOF ;
    public final EObject entryRuleExpressionLiteralCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLiteralCollection = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3755:2: (iv_ruleExpressionLiteralCollection= ruleExpressionLiteralCollection EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3756:2: iv_ruleExpressionLiteralCollection= ruleExpressionLiteralCollection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLiteralCollectionRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionLiteralCollection_in_entryRuleExpressionLiteralCollection8510);
            iv_ruleExpressionLiteralCollection=ruleExpressionLiteralCollection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLiteralCollection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionLiteralCollection8520); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionLiteralCollection"


    // $ANTLR start "ruleExpressionLiteralCollection"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3763:1: ruleExpressionLiteralCollection returns [EObject current=null] : (this_ExpressionLiteralSet_0= ruleExpressionLiteralSet | this_ExpressionLiteralList_1= ruleExpressionLiteralList ) ;
    public final EObject ruleExpressionLiteralCollection() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionLiteralSet_0 = null;

        EObject this_ExpressionLiteralList_1 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3766:28: ( (this_ExpressionLiteralSet_0= ruleExpressionLiteralSet | this_ExpressionLiteralList_1= ruleExpressionLiteralList ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3767:1: (this_ExpressionLiteralSet_0= ruleExpressionLiteralSet | this_ExpressionLiteralList_1= ruleExpressionLiteralList )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3767:1: (this_ExpressionLiteralSet_0= ruleExpressionLiteralSet | this_ExpressionLiteralList_1= ruleExpressionLiteralList )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==27) ) {
                alt56=1;
            }
            else if ( (LA56_0==31) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3768:5: this_ExpressionLiteralSet_0= ruleExpressionLiteralSet
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionLiteralCollectionAccess().getExpressionLiteralSetParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionLiteralSet_in_ruleExpressionLiteralCollection8567);
                    this_ExpressionLiteralSet_0=ruleExpressionLiteralSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExpressionLiteralSet_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3778:5: this_ExpressionLiteralList_1= ruleExpressionLiteralList
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionLiteralCollectionAccess().getExpressionLiteralListParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionLiteralList_in_ruleExpressionLiteralCollection8594);
                    this_ExpressionLiteralList_1=ruleExpressionLiteralList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExpressionLiteralList_1; 
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
    // $ANTLR end "ruleExpressionLiteralCollection"


    // $ANTLR start "entryRuleExpressionLiteralSet"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3794:1: entryRuleExpressionLiteralSet returns [EObject current=null] : iv_ruleExpressionLiteralSet= ruleExpressionLiteralSet EOF ;
    public final EObject entryRuleExpressionLiteralSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLiteralSet = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3795:2: (iv_ruleExpressionLiteralSet= ruleExpressionLiteralSet EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3796:2: iv_ruleExpressionLiteralSet= ruleExpressionLiteralSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLiteralSetRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionLiteralSet_in_entryRuleExpressionLiteralSet8629);
            iv_ruleExpressionLiteralSet=ruleExpressionLiteralSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLiteralSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionLiteralSet8639); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionLiteralSet"


    // $ANTLR start "ruleExpressionLiteralSet"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3803:1: ruleExpressionLiteralSet returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleExpressionLiteralSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3806:28: ( ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3807:1: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3807:1: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3807:2: () otherlv_1= '{' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= '}'
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3807:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3808:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExpressionLiteralSetAccess().getExpressionLiteralSetAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleExpressionLiteralSet8685); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExpressionLiteralSetAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3817:1: ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=RULE_ID && LA58_0<=RULE_INT)||LA58_0==27||(LA58_0>=30 && LA58_0<=31)||LA58_0==50||(LA58_0>=65 && LA58_0<=66)||(LA58_0>=70 && LA58_0<=71)||LA58_0==74||LA58_0==77||(LA58_0>=79 && LA58_0<=113)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3817:2: ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )*
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3817:2: ( (lv_elements_2_0= ruleExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3818:1: (lv_elements_2_0= ruleExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3818:1: (lv_elements_2_0= ruleExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3819:3: lv_elements_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionLiteralSetAccess().getElementsExpressionParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionLiteralSet8707);
                    lv_elements_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionLiteralSetRule());
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

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3835:2: (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==28) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3835:4: otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleExpressionLiteralSet8720); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getExpressionLiteralSetAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3839:1: ( (lv_elements_4_0= ruleExpression ) )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3840:1: (lv_elements_4_0= ruleExpression )
                    	    {
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3840:1: (lv_elements_4_0= ruleExpression )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3841:3: lv_elements_4_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getExpressionLiteralSetAccess().getElementsExpressionParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionLiteralSet8741);
                    	    lv_elements_4_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getExpressionLiteralSetRule());
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
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleExpressionLiteralSet8757); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getExpressionLiteralSetAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleExpressionLiteralSet"


    // $ANTLR start "entryRuleExpressionLiteralList"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3869:1: entryRuleExpressionLiteralList returns [EObject current=null] : iv_ruleExpressionLiteralList= ruleExpressionLiteralList EOF ;
    public final EObject entryRuleExpressionLiteralList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLiteralList = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3870:2: (iv_ruleExpressionLiteralList= ruleExpressionLiteralList EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3871:2: iv_ruleExpressionLiteralList= ruleExpressionLiteralList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLiteralListRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionLiteralList_in_entryRuleExpressionLiteralList8793);
            iv_ruleExpressionLiteralList=ruleExpressionLiteralList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLiteralList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionLiteralList8803); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionLiteralList"


    // $ANTLR start "ruleExpressionLiteralList"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3878:1: ruleExpressionLiteralList returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleExpressionLiteralList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3881:28: ( ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= ']' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3882:1: ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= ']' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3882:1: ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= ']' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3882:2: () otherlv_1= '[' ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )? otherlv_5= ']'
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3882:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3883:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExpressionLiteralListAccess().getExpressionLiteralListAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleExpressionLiteralList8849); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExpressionLiteralListAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3892:1: ( ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=RULE_ID && LA60_0<=RULE_INT)||LA60_0==27||(LA60_0>=30 && LA60_0<=31)||LA60_0==50||(LA60_0>=65 && LA60_0<=66)||(LA60_0>=70 && LA60_0<=71)||LA60_0==74||LA60_0==77||(LA60_0>=79 && LA60_0<=113)) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3892:2: ( (lv_elements_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )*
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3892:2: ( (lv_elements_2_0= ruleExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3893:1: (lv_elements_2_0= ruleExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3893:1: (lv_elements_2_0= ruleExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3894:3: lv_elements_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionLiteralListAccess().getElementsExpressionParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionLiteralList8871);
                    lv_elements_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionLiteralListRule());
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

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3910:2: (otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==28) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3910:4: otherlv_3= ',' ( (lv_elements_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleExpressionLiteralList8884); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getExpressionLiteralListAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3914:1: ( (lv_elements_4_0= ruleExpression ) )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3915:1: (lv_elements_4_0= ruleExpression )
                    	    {
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3915:1: (lv_elements_4_0= ruleExpression )
                    	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3916:3: lv_elements_4_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getExpressionLiteralListAccess().getElementsExpressionParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionLiteralList8905);
                    	    lv_elements_4_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getExpressionLiteralListRule());
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
                    	    break loop59;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleExpressionLiteralList8921); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getExpressionLiteralListAccess().getRightSquareBracketKeyword_3());
                  
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
    // $ANTLR end "ruleExpressionLiteralList"


    // $ANTLR start "entryRuleExpressionParenthesized"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3944:1: entryRuleExpressionParenthesized returns [EObject current=null] : iv_ruleExpressionParenthesized= ruleExpressionParenthesized EOF ;
    public final EObject entryRuleExpressionParenthesized() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionParenthesized = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3945:2: (iv_ruleExpressionParenthesized= ruleExpressionParenthesized EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3946:2: iv_ruleExpressionParenthesized= ruleExpressionParenthesized EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionParenthesizedRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionParenthesized_in_entryRuleExpressionParenthesized8957);
            iv_ruleExpressionParenthesized=ruleExpressionParenthesized();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionParenthesized; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionParenthesized8967); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionParenthesized"


    // $ANTLR start "ruleExpressionParenthesized"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3953:1: ruleExpressionParenthesized returns [EObject current=null] : (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) ;
    public final EObject ruleExpressionParenthesized() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3956:28: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3957:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3957:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3957:3: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleExpressionParenthesized9004); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExpressionParenthesizedAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionParenthesizedAccess().getExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionParenthesized9026);
            this_Expression_1=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Expression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,72,FOLLOW_72_in_ruleExpressionParenthesized9037); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExpressionParenthesizedAccess().getRightParenthesisKeyword_2());
                  
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
    // $ANTLR end "ruleExpressionParenthesized"


    // $ANTLR start "entryRuleExpressionIf"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3982:1: entryRuleExpressionIf returns [EObject current=null] : iv_ruleExpressionIf= ruleExpressionIf EOF ;
    public final EObject entryRuleExpressionIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionIf = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3983:2: (iv_ruleExpressionIf= ruleExpressionIf EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3984:2: iv_ruleExpressionIf= ruleExpressionIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionIfRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionIf_in_entryRuleExpressionIf9073);
            iv_ruleExpressionIf=ruleExpressionIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionIf; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionIf9083); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionIf"


    // $ANTLR start "ruleExpressionIf"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3991:1: ruleExpressionIf returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( (lv_then_5_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) ) ) ) ;
    public final EObject ruleExpressionIf() throws RecognitionException {
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
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3994:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( (lv_then_5_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3995:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( (lv_then_5_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3995:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( (lv_then_5_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3995:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( (lv_then_5_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3995:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3996:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExpressionIfAccess().getExpressionIfAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleExpressionIf9129); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExpressionIfAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,71,FOLLOW_71_in_ruleExpressionIf9141); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExpressionIfAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4009:1: ( (lv_if_3_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4010:1: (lv_if_3_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4010:1: (lv_if_3_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4011:3: lv_if_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionIfAccess().getIfExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionIf9162);
            lv_if_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExpressionIfRule());
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

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4027:2: ( ( ')' )=>otherlv_4= ')' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4027:3: ( ')' )=>otherlv_4= ')'
            {
            otherlv_4=(Token)match(input,72,FOLLOW_72_in_ruleExpressionIf9182); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getExpressionIfAccess().getRightParenthesisKeyword_4());
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4032:2: ( (lv_then_5_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4033:1: (lv_then_5_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4033:1: (lv_then_5_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4034:3: lv_then_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionIfAccess().getThenExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionIf9204);
            lv_then_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExpressionIfRule());
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

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4050:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4050:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleExpression ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4050:3: ( ( 'else' )=>otherlv_6= 'else' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4050:4: ( 'else' )=>otherlv_6= 'else'
            {
            otherlv_6=(Token)match(input,73,FOLLOW_73_in_ruleExpressionIf9225); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getExpressionIfAccess().getElseKeyword_6_0());
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4055:2: ( (lv_else_7_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4056:1: (lv_else_7_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4056:1: (lv_else_7_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4057:3: lv_else_7_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionIfAccess().getElseExpressionParserRuleCall_6_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionIf9247);
            lv_else_7_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExpressionIfRule());
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
    // $ANTLR end "ruleExpressionIf"


    // $ANTLR start "entryRuleExpressionSwitch"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4081:1: entryRuleExpressionSwitch returns [EObject current=null] : iv_ruleExpressionSwitch= ruleExpressionSwitch EOF ;
    public final EObject entryRuleExpressionSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionSwitch = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4082:2: (iv_ruleExpressionSwitch= ruleExpressionSwitch EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4083:2: iv_ruleExpressionSwitch= ruleExpressionSwitch EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionSwitchRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionSwitch_in_entryRuleExpressionSwitch9284);
            iv_ruleExpressionSwitch=ruleExpressionSwitch();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionSwitch; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionSwitch9294); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionSwitch"


    // $ANTLR start "ruleExpressionSwitch"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4090:1: ruleExpressionSwitch returns [EObject current=null] : ( () otherlv_1= 'switch' otherlv_2= '(' ( (lv_switch_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( ( ( ruleExpressionCase ) )=> (lv_case_5_0= ruleExpressionCase ) )+ ( ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleExpression ) ) )? ) ;
    public final EObject ruleExpressionSwitch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_switch_3_0 = null;

        EObject lv_case_5_0 = null;

        EObject lv_default_8_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4093:28: ( ( () otherlv_1= 'switch' otherlv_2= '(' ( (lv_switch_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( ( ( ruleExpressionCase ) )=> (lv_case_5_0= ruleExpressionCase ) )+ ( ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleExpression ) ) )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4094:1: ( () otherlv_1= 'switch' otherlv_2= '(' ( (lv_switch_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( ( ( ruleExpressionCase ) )=> (lv_case_5_0= ruleExpressionCase ) )+ ( ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleExpression ) ) )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4094:1: ( () otherlv_1= 'switch' otherlv_2= '(' ( (lv_switch_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( ( ( ruleExpressionCase ) )=> (lv_case_5_0= ruleExpressionCase ) )+ ( ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleExpression ) ) )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4094:2: () otherlv_1= 'switch' otherlv_2= '(' ( (lv_switch_3_0= ruleExpression ) ) ( ( ')' )=>otherlv_4= ')' ) ( ( ( ruleExpressionCase ) )=> (lv_case_5_0= ruleExpressionCase ) )+ ( ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleExpression ) ) )?
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4094:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4095:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExpressionSwitchAccess().getExpressionSwitchAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleExpressionSwitch9340); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExpressionSwitchAccess().getSwitchKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,71,FOLLOW_71_in_ruleExpressionSwitch9352); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExpressionSwitchAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4108:1: ( (lv_switch_3_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4109:1: (lv_switch_3_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4109:1: (lv_switch_3_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4110:3: lv_switch_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionSwitchAccess().getSwitchExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionSwitch9373);
            lv_switch_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExpressionSwitchRule());
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

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4126:2: ( ( ')' )=>otherlv_4= ')' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4126:3: ( ')' )=>otherlv_4= ')'
            {
            otherlv_4=(Token)match(input,72,FOLLOW_72_in_ruleExpressionSwitch9393); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getExpressionSwitchAccess().getRightParenthesisKeyword_4());
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4131:2: ( ( ( ruleExpressionCase ) )=> (lv_case_5_0= ruleExpressionCase ) )+
            int cnt61=0;
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==76) ) {
                    int LA61_2 = input.LA(2);

                    if ( (synpred15_InternalLil()) ) {
                        alt61=1;
                    }


                }


                switch (alt61) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4131:3: ( ( ruleExpressionCase ) )=> (lv_case_5_0= ruleExpressionCase )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4136:1: (lv_case_5_0= ruleExpressionCase )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4137:3: lv_case_5_0= ruleExpressionCase
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionSwitchAccess().getCaseExpressionCaseParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionCase_in_ruleExpressionSwitch9425);
            	    lv_case_5_0=ruleExpressionCase();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionSwitchRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"case",
            	              		lv_case_5_0, 
            	              		"ExpressionCase");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt61 >= 1 ) break loop61;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
            } while (true);

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4153:3: ( ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleExpression ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==75) ) {
                int LA62_1 = input.LA(2);

                if ( (synpred16_InternalLil()) ) {
                    alt62=1;
                }
            }
            switch (alt62) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4153:4: ( ( 'default' )=>otherlv_6= 'default' ) otherlv_7= ':' ( (lv_default_8_0= ruleExpression ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4153:4: ( ( 'default' )=>otherlv_6= 'default' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4153:5: ( 'default' )=>otherlv_6= 'default'
                    {
                    otherlv_6=(Token)match(input,75,FOLLOW_75_in_ruleExpressionSwitch9447); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getExpressionSwitchAccess().getDefaultKeyword_6_0());
                          
                    }

                    }

                    otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleExpressionSwitch9460); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getExpressionSwitchAccess().getColonKeyword_6_1());
                          
                    }
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4162:1: ( (lv_default_8_0= ruleExpression ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4163:1: (lv_default_8_0= ruleExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4163:1: (lv_default_8_0= ruleExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4164:3: lv_default_8_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionSwitchAccess().getDefaultExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionSwitch9481);
                    lv_default_8_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionSwitchRule());
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
    // $ANTLR end "ruleExpressionSwitch"


    // $ANTLR start "entryRuleExpressionCase"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4188:1: entryRuleExpressionCase returns [EObject current=null] : iv_ruleExpressionCase= ruleExpressionCase EOF ;
    public final EObject entryRuleExpressionCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionCase = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4189:2: (iv_ruleExpressionCase= ruleExpressionCase EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4190:2: iv_ruleExpressionCase= ruleExpressionCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionCaseRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionCase_in_entryRuleExpressionCase9519);
            iv_ruleExpressionCase=ruleExpressionCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionCase; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionCase9529); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionCase"


    // $ANTLR start "ruleExpressionCase"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4197:1: ruleExpressionCase returns [EObject current=null] : (otherlv_0= 'case' ( (lv_case_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_then_3_0= ruleExpression ) ) ) ;
    public final EObject ruleExpressionCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_case_1_0 = null;

        EObject lv_then_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4200:28: ( (otherlv_0= 'case' ( (lv_case_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_then_3_0= ruleExpression ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4201:1: (otherlv_0= 'case' ( (lv_case_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_then_3_0= ruleExpression ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4201:1: (otherlv_0= 'case' ( (lv_case_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_then_3_0= ruleExpression ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4201:3: otherlv_0= 'case' ( (lv_case_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_then_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleExpressionCase9566); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExpressionCaseAccess().getCaseKeyword_0());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4205:1: ( (lv_case_1_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4206:1: (lv_case_1_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4206:1: (lv_case_1_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4207:3: lv_case_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionCaseAccess().getCaseExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionCase9587);
            lv_case_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExpressionCaseRule());
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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleExpressionCase9599); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExpressionCaseAccess().getColonKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4227:1: ( (lv_then_3_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4228:1: (lv_then_3_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4228:1: (lv_then_3_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4229:3: lv_then_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionCaseAccess().getThenExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionCase9620);
            lv_then_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExpressionCaseRule());
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
    // $ANTLR end "ruleExpressionCase"


    // $ANTLR start "entryRuleExpressionForEach"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4253:1: entryRuleExpressionForEach returns [EObject current=null] : iv_ruleExpressionForEach= ruleExpressionForEach EOF ;
    public final EObject entryRuleExpressionForEach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionForEach = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4254:2: (iv_ruleExpressionForEach= ruleExpressionForEach EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4255:2: iv_ruleExpressionForEach= ruleExpressionForEach EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionForEachRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionForEach_in_entryRuleExpressionForEach9656);
            iv_ruleExpressionForEach=ruleExpressionForEach();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionForEach; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionForEach9666); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionForEach"


    // $ANTLR start "ruleExpressionForEach"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4262:1: ruleExpressionForEach returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= 'each' otherlv_3= '(' ( (lv_forExpression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_eachExpression_6_0= ruleExpression ) ) ) ;
    public final EObject ruleExpressionForEach() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_forExpression_4_0 = null;

        EObject lv_eachExpression_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4265:28: ( ( () otherlv_1= 'for' otherlv_2= 'each' otherlv_3= '(' ( (lv_forExpression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_eachExpression_6_0= ruleExpression ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4266:1: ( () otherlv_1= 'for' otherlv_2= 'each' otherlv_3= '(' ( (lv_forExpression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_eachExpression_6_0= ruleExpression ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4266:1: ( () otherlv_1= 'for' otherlv_2= 'each' otherlv_3= '(' ( (lv_forExpression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_eachExpression_6_0= ruleExpression ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4266:2: () otherlv_1= 'for' otherlv_2= 'each' otherlv_3= '(' ( (lv_forExpression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_eachExpression_6_0= ruleExpression ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4266:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4267:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExpressionForEachAccess().getExpressionForEachAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleExpressionForEach9712); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExpressionForEachAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,78,FOLLOW_78_in_ruleExpressionForEach9724); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExpressionForEachAccess().getEachKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,71,FOLLOW_71_in_ruleExpressionForEach9736); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getExpressionForEachAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4284:1: ( (lv_forExpression_4_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4285:1: (lv_forExpression_4_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4285:1: (lv_forExpression_4_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4286:3: lv_forExpression_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionForEachAccess().getForExpressionExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionForEach9757);
            lv_forExpression_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExpressionForEachRule());
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

            otherlv_5=(Token)match(input,72,FOLLOW_72_in_ruleExpressionForEach9769); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getExpressionForEachAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4306:1: ( (lv_eachExpression_6_0= ruleExpression ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4307:1: (lv_eachExpression_6_0= ruleExpression )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4307:1: (lv_eachExpression_6_0= ruleExpression )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4308:3: lv_eachExpression_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionForEachAccess().getEachExpressionExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionForEach9790);
            lv_eachExpression_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExpressionForEachRule());
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
    // $ANTLR end "ruleExpressionForEach"


    // $ANTLR start "entryRuleExpressionFunctionCall"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4332:1: entryRuleExpressionFunctionCall returns [EObject current=null] : iv_ruleExpressionFunctionCall= ruleExpressionFunctionCall EOF ;
    public final EObject entryRuleExpressionFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionFunctionCall = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4333:2: (iv_ruleExpressionFunctionCall= ruleExpressionFunctionCall EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4334:2: iv_ruleExpressionFunctionCall= ruleExpressionFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionFunctionCallRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionFunctionCall_in_entryRuleExpressionFunctionCall9826);
            iv_ruleExpressionFunctionCall=ruleExpressionFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionFunctionCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionFunctionCall9836); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionFunctionCall"


    // $ANTLR start "ruleExpressionFunctionCall"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4341:1: ruleExpressionFunctionCall returns [EObject current=null] : ( () ( (lv_function_1_0= ruleExpressionFunctionCallBase ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleExpressionFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_function_1_0 = null;

        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4344:28: ( ( () ( (lv_function_1_0= ruleExpressionFunctionCallBase ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* otherlv_6= ')' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4345:1: ( () ( (lv_function_1_0= ruleExpressionFunctionCallBase ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* otherlv_6= ')' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4345:1: ( () ( (lv_function_1_0= ruleExpressionFunctionCallBase ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* otherlv_6= ')' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4345:2: () ( (lv_function_1_0= ruleExpressionFunctionCallBase ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* otherlv_6= ')'
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4345:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4346:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExpressionFunctionCallAccess().getExpressionFunctionCallAction_0(),
                          current);
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4351:2: ( (lv_function_1_0= ruleExpressionFunctionCallBase ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4352:1: (lv_function_1_0= ruleExpressionFunctionCallBase )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4352:1: (lv_function_1_0= ruleExpressionFunctionCallBase )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4353:3: lv_function_1_0= ruleExpressionFunctionCallBase
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionFunctionCallAccess().getFunctionExpressionFunctionCallBaseParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpressionFunctionCallBase_in_ruleExpressionFunctionCall9891);
            lv_function_1_0=ruleExpressionFunctionCallBase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExpressionFunctionCallRule());
              	        }
                     		set(
                     			current, 
                     			"function",
                      		lv_function_1_0, 
                      		"ExpressionFunctionCallBase");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,71,FOLLOW_71_in_ruleExpressionFunctionCall9903); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExpressionFunctionCallAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4373:1: ( (lv_arguments_3_0= ruleExpression ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=RULE_ID && LA63_0<=RULE_INT)||LA63_0==27||(LA63_0>=30 && LA63_0<=31)||LA63_0==50||(LA63_0>=65 && LA63_0<=66)||(LA63_0>=70 && LA63_0<=71)||LA63_0==74||LA63_0==77||(LA63_0>=79 && LA63_0<=113)) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4374:1: (lv_arguments_3_0= ruleExpression )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4374:1: (lv_arguments_3_0= ruleExpression )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4375:3: lv_arguments_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionFunctionCallAccess().getArgumentsExpressionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionFunctionCall9924);
                    lv_arguments_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionFunctionCallRule());
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

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4391:3: (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==28) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4391:5: otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) )
            	    {
            	    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleExpressionFunctionCall9938); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getExpressionFunctionCallAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4395:1: ( (lv_arguments_5_0= ruleExpression ) )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4396:1: (lv_arguments_5_0= ruleExpression )
            	    {
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4396:1: (lv_arguments_5_0= ruleExpression )
            	    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4397:3: lv_arguments_5_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionFunctionCallAccess().getArgumentsExpressionParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionFunctionCall9959);
            	    lv_arguments_5_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionFunctionCallRule());
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
            	    break loop64;
                }
            } while (true);

            otherlv_6=(Token)match(input,72,FOLLOW_72_in_ruleExpressionFunctionCall9973); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getExpressionFunctionCallAccess().getRightParenthesisKeyword_5());
                  
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
    // $ANTLR end "ruleExpressionFunctionCall"


    // $ANTLR start "entryRuleExpressionFunctionCallBase"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4425:1: entryRuleExpressionFunctionCallBase returns [String current=null] : iv_ruleExpressionFunctionCallBase= ruleExpressionFunctionCallBase EOF ;
    public final String entryRuleExpressionFunctionCallBase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionFunctionCallBase = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4426:2: (iv_ruleExpressionFunctionCallBase= ruleExpressionFunctionCallBase EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4427:2: iv_ruleExpressionFunctionCallBase= ruleExpressionFunctionCallBase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionFunctionCallBaseRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionFunctionCallBase_in_entryRuleExpressionFunctionCallBase10010);
            iv_ruleExpressionFunctionCallBase=ruleExpressionFunctionCallBase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionFunctionCallBase.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionFunctionCallBase10021); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionFunctionCallBase"


    // $ANTLR start "ruleExpressionFunctionCallBase"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4434:1: ruleExpressionFunctionCallBase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'math.abs' | kw= 'math.acos' | kw= 'math.acosh' | kw= 'math.asin' | kw= 'math.asinh' | kw= 'math.atan' | kw= 'math.atanh' | kw= 'math.atan2' | kw= 'math.ceil' | kw= 'math.clip' | kw= 'math.cos' | kw= 'math.cosh' | kw= 'math.exp' | kw= 'math.floor' | kw= 'math.fround' | kw= 'math.hypot' | kw= 'math.log' | kw= 'math.log10' | kw= 'math.log2' | kw= 'math.max' | kw= 'math.min' | kw= 'math.pow' | kw= 'math.random' | kw= 'math.round' | kw= 'math.sign' | kw= 'math.sin' | kw= 'math.sinh' | kw= 'math.sqrt' | kw= 'math.tan' | kw= 'math.tanh' | kw= 'math.trunc' ) ;
    public final AntlrDatatypeRuleToken ruleExpressionFunctionCallBase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4437:28: ( (kw= 'math.abs' | kw= 'math.acos' | kw= 'math.acosh' | kw= 'math.asin' | kw= 'math.asinh' | kw= 'math.atan' | kw= 'math.atanh' | kw= 'math.atan2' | kw= 'math.ceil' | kw= 'math.clip' | kw= 'math.cos' | kw= 'math.cosh' | kw= 'math.exp' | kw= 'math.floor' | kw= 'math.fround' | kw= 'math.hypot' | kw= 'math.log' | kw= 'math.log10' | kw= 'math.log2' | kw= 'math.max' | kw= 'math.min' | kw= 'math.pow' | kw= 'math.random' | kw= 'math.round' | kw= 'math.sign' | kw= 'math.sin' | kw= 'math.sinh' | kw= 'math.sqrt' | kw= 'math.tan' | kw= 'math.tanh' | kw= 'math.trunc' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4438:1: (kw= 'math.abs' | kw= 'math.acos' | kw= 'math.acosh' | kw= 'math.asin' | kw= 'math.asinh' | kw= 'math.atan' | kw= 'math.atanh' | kw= 'math.atan2' | kw= 'math.ceil' | kw= 'math.clip' | kw= 'math.cos' | kw= 'math.cosh' | kw= 'math.exp' | kw= 'math.floor' | kw= 'math.fround' | kw= 'math.hypot' | kw= 'math.log' | kw= 'math.log10' | kw= 'math.log2' | kw= 'math.max' | kw= 'math.min' | kw= 'math.pow' | kw= 'math.random' | kw= 'math.round' | kw= 'math.sign' | kw= 'math.sin' | kw= 'math.sinh' | kw= 'math.sqrt' | kw= 'math.tan' | kw= 'math.tanh' | kw= 'math.trunc' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4438:1: (kw= 'math.abs' | kw= 'math.acos' | kw= 'math.acosh' | kw= 'math.asin' | kw= 'math.asinh' | kw= 'math.atan' | kw= 'math.atanh' | kw= 'math.atan2' | kw= 'math.ceil' | kw= 'math.clip' | kw= 'math.cos' | kw= 'math.cosh' | kw= 'math.exp' | kw= 'math.floor' | kw= 'math.fround' | kw= 'math.hypot' | kw= 'math.log' | kw= 'math.log10' | kw= 'math.log2' | kw= 'math.max' | kw= 'math.min' | kw= 'math.pow' | kw= 'math.random' | kw= 'math.round' | kw= 'math.sign' | kw= 'math.sin' | kw= 'math.sinh' | kw= 'math.sqrt' | kw= 'math.tan' | kw= 'math.tanh' | kw= 'math.trunc' )
            int alt65=31;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt65=1;
                }
                break;
            case 80:
                {
                alt65=2;
                }
                break;
            case 81:
                {
                alt65=3;
                }
                break;
            case 82:
                {
                alt65=4;
                }
                break;
            case 83:
                {
                alt65=5;
                }
                break;
            case 84:
                {
                alt65=6;
                }
                break;
            case 85:
                {
                alt65=7;
                }
                break;
            case 86:
                {
                alt65=8;
                }
                break;
            case 87:
                {
                alt65=9;
                }
                break;
            case 88:
                {
                alt65=10;
                }
                break;
            case 89:
                {
                alt65=11;
                }
                break;
            case 90:
                {
                alt65=12;
                }
                break;
            case 91:
                {
                alt65=13;
                }
                break;
            case 92:
                {
                alt65=14;
                }
                break;
            case 93:
                {
                alt65=15;
                }
                break;
            case 94:
                {
                alt65=16;
                }
                break;
            case 95:
                {
                alt65=17;
                }
                break;
            case 96:
                {
                alt65=18;
                }
                break;
            case 97:
                {
                alt65=19;
                }
                break;
            case 98:
                {
                alt65=20;
                }
                break;
            case 99:
                {
                alt65=21;
                }
                break;
            case 100:
                {
                alt65=22;
                }
                break;
            case 101:
                {
                alt65=23;
                }
                break;
            case 102:
                {
                alt65=24;
                }
                break;
            case 103:
                {
                alt65=25;
                }
                break;
            case 104:
                {
                alt65=26;
                }
                break;
            case 105:
                {
                alt65=27;
                }
                break;
            case 106:
                {
                alt65=28;
                }
                break;
            case 107:
                {
                alt65=29;
                }
                break;
            case 108:
                {
                alt65=30;
                }
                break;
            case 109:
                {
                alt65=31;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4439:2: kw= 'math.abs'
                    {
                    kw=(Token)match(input,79,FOLLOW_79_in_ruleExpressionFunctionCallBase10059); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathAbsKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4446:2: kw= 'math.acos'
                    {
                    kw=(Token)match(input,80,FOLLOW_80_in_ruleExpressionFunctionCallBase10078); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathAcosKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4453:2: kw= 'math.acosh'
                    {
                    kw=(Token)match(input,81,FOLLOW_81_in_ruleExpressionFunctionCallBase10097); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathAcoshKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4460:2: kw= 'math.asin'
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleExpressionFunctionCallBase10116); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathAsinKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4467:2: kw= 'math.asinh'
                    {
                    kw=(Token)match(input,83,FOLLOW_83_in_ruleExpressionFunctionCallBase10135); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathAsinhKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4474:2: kw= 'math.atan'
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleExpressionFunctionCallBase10154); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathAtanKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4481:2: kw= 'math.atanh'
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruleExpressionFunctionCallBase10173); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathAtanhKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4488:2: kw= 'math.atan2'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleExpressionFunctionCallBase10192); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathAtan2Keyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4495:2: kw= 'math.ceil'
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleExpressionFunctionCallBase10211); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathCeilKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4502:2: kw= 'math.clip'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleExpressionFunctionCallBase10230); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathClipKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4509:2: kw= 'math.cos'
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_ruleExpressionFunctionCallBase10249); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathCosKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4516:2: kw= 'math.cosh'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleExpressionFunctionCallBase10268); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathCoshKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4523:2: kw= 'math.exp'
                    {
                    kw=(Token)match(input,91,FOLLOW_91_in_ruleExpressionFunctionCallBase10287); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathExpKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4530:2: kw= 'math.floor'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleExpressionFunctionCallBase10306); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathFloorKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4537:2: kw= 'math.fround'
                    {
                    kw=(Token)match(input,93,FOLLOW_93_in_ruleExpressionFunctionCallBase10325); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathFroundKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4544:2: kw= 'math.hypot'
                    {
                    kw=(Token)match(input,94,FOLLOW_94_in_ruleExpressionFunctionCallBase10344); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathHypotKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4551:2: kw= 'math.log'
                    {
                    kw=(Token)match(input,95,FOLLOW_95_in_ruleExpressionFunctionCallBase10363); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathLogKeyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4558:2: kw= 'math.log10'
                    {
                    kw=(Token)match(input,96,FOLLOW_96_in_ruleExpressionFunctionCallBase10382); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathLog10Keyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4565:2: kw= 'math.log2'
                    {
                    kw=(Token)match(input,97,FOLLOW_97_in_ruleExpressionFunctionCallBase10401); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathLog2Keyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4572:2: kw= 'math.max'
                    {
                    kw=(Token)match(input,98,FOLLOW_98_in_ruleExpressionFunctionCallBase10420); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathMaxKeyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4579:2: kw= 'math.min'
                    {
                    kw=(Token)match(input,99,FOLLOW_99_in_ruleExpressionFunctionCallBase10439); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathMinKeyword_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4586:2: kw= 'math.pow'
                    {
                    kw=(Token)match(input,100,FOLLOW_100_in_ruleExpressionFunctionCallBase10458); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathPowKeyword_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4593:2: kw= 'math.random'
                    {
                    kw=(Token)match(input,101,FOLLOW_101_in_ruleExpressionFunctionCallBase10477); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathRandomKeyword_22()); 
                          
                    }

                    }
                    break;
                case 24 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4600:2: kw= 'math.round'
                    {
                    kw=(Token)match(input,102,FOLLOW_102_in_ruleExpressionFunctionCallBase10496); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathRoundKeyword_23()); 
                          
                    }

                    }
                    break;
                case 25 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4607:2: kw= 'math.sign'
                    {
                    kw=(Token)match(input,103,FOLLOW_103_in_ruleExpressionFunctionCallBase10515); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathSignKeyword_24()); 
                          
                    }

                    }
                    break;
                case 26 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4614:2: kw= 'math.sin'
                    {
                    kw=(Token)match(input,104,FOLLOW_104_in_ruleExpressionFunctionCallBase10534); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathSinKeyword_25()); 
                          
                    }

                    }
                    break;
                case 27 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4621:2: kw= 'math.sinh'
                    {
                    kw=(Token)match(input,105,FOLLOW_105_in_ruleExpressionFunctionCallBase10553); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathSinhKeyword_26()); 
                          
                    }

                    }
                    break;
                case 28 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4628:2: kw= 'math.sqrt'
                    {
                    kw=(Token)match(input,106,FOLLOW_106_in_ruleExpressionFunctionCallBase10572); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathSqrtKeyword_27()); 
                          
                    }

                    }
                    break;
                case 29 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4635:2: kw= 'math.tan'
                    {
                    kw=(Token)match(input,107,FOLLOW_107_in_ruleExpressionFunctionCallBase10591); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathTanKeyword_28()); 
                          
                    }

                    }
                    break;
                case 30 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4642:2: kw= 'math.tanh'
                    {
                    kw=(Token)match(input,108,FOLLOW_108_in_ruleExpressionFunctionCallBase10610); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathTanhKeyword_29()); 
                          
                    }

                    }
                    break;
                case 31 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4649:2: kw= 'math.trunc'
                    {
                    kw=(Token)match(input,109,FOLLOW_109_in_ruleExpressionFunctionCallBase10629); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExpressionFunctionCallBaseAccess().getMathTruncKeyword_30()); 
                          
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
    // $ANTLR end "ruleExpressionFunctionCallBase"


    // $ANTLR start "entryRuleLiteralBoolean"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4662:1: entryRuleLiteralBoolean returns [EObject current=null] : iv_ruleLiteralBoolean= ruleLiteralBoolean EOF ;
    public final EObject entryRuleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralBoolean = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4663:2: (iv_ruleLiteralBoolean= ruleLiteralBoolean EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4664:2: iv_ruleLiteralBoolean= ruleLiteralBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean10669);
            iv_ruleLiteralBoolean=ruleLiteralBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralBoolean; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralBoolean10679); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralBoolean"


    // $ANTLR start "ruleLiteralBoolean"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4671:1: ruleLiteralBoolean returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4674:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4675:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4675:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4675:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4675:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4676:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLiteralBooleanAccess().getLiteralBooleanAction_0(),
                          current);
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4681:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==110) ) {
                alt66=1;
            }
            else if ( (LA66_0==111) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4681:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,110,FOLLOW_110_in_ruleLiteralBoolean10726); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getLiteralBooleanAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4686:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4686:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4687:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4687:1: (lv_isTrue_2_0= 'true' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4688:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,111,FOLLOW_111_in_ruleLiteralBoolean10750); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getLiteralBooleanAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralBooleanRule());
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
    // $ANTLR end "ruleLiteralBoolean"


    // $ANTLR start "entryRuleLiteralNull"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4709:1: entryRuleLiteralNull returns [EObject current=null] : iv_ruleLiteralNull= ruleLiteralNull EOF ;
    public final EObject entryRuleLiteralNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralNull = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4710:2: (iv_ruleLiteralNull= ruleLiteralNull EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4711:2: iv_ruleLiteralNull= ruleLiteralNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralNullRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralNull_in_entryRuleLiteralNull10800);
            iv_ruleLiteralNull=ruleLiteralNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralNull; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralNull10810); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralNull"


    // $ANTLR start "ruleLiteralNull"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4718:1: ruleLiteralNull returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleLiteralNull() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4721:28: ( ( () otherlv_1= 'null' ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4722:1: ( () otherlv_1= 'null' )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4722:1: ( () otherlv_1= 'null' )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4722:2: () otherlv_1= 'null'
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4722:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4723:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLiteralNullAccess().getLiteralNullAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,112,FOLLOW_112_in_ruleLiteralNull10856); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLiteralNullAccess().getNullKeyword_1());
                  
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
    // $ANTLR end "ruleLiteralNull"


    // $ANTLR start "entryRuleLiteralNumber"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4740:1: entryRuleLiteralNumber returns [EObject current=null] : iv_ruleLiteralNumber= ruleLiteralNumber EOF ;
    public final EObject entryRuleLiteralNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralNumber = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4741:2: (iv_ruleLiteralNumber= ruleLiteralNumber EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4742:2: iv_ruleLiteralNumber= ruleLiteralNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralNumberRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralNumber_in_entryRuleLiteralNumber10892);
            iv_ruleLiteralNumber=ruleLiteralNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralNumber; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralNumber10902); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralNumber"


    // $ANTLR start "ruleLiteralNumber"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4749:1: ruleLiteralNumber returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNUMBER ) ) ) ;
    public final EObject ruleLiteralNumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4752:28: ( ( () ( (lv_value_1_0= ruleNUMBER ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4753:1: ( () ( (lv_value_1_0= ruleNUMBER ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4753:1: ( () ( (lv_value_1_0= ruleNUMBER ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4753:2: () ( (lv_value_1_0= ruleNUMBER ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4753:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4754:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLiteralNumberAccess().getLiteralNumberAction_0(),
                          current);
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4759:2: ( (lv_value_1_0= ruleNUMBER ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4760:1: (lv_value_1_0= ruleNUMBER )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4760:1: (lv_value_1_0= ruleNUMBER )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4761:3: lv_value_1_0= ruleNUMBER
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLiteralNumberAccess().getValueNUMBERParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralNumber10957);
            lv_value_1_0=ruleNUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLiteralNumberRule());
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
    // $ANTLR end "ruleLiteralNumber"


    // $ANTLR start "entryRuleLiteralText"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4785:1: entryRuleLiteralText returns [EObject current=null] : iv_ruleLiteralText= ruleLiteralText EOF ;
    public final EObject entryRuleLiteralText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralText = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4786:2: (iv_ruleLiteralText= ruleLiteralText EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4787:2: iv_ruleLiteralText= ruleLiteralText EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralTextRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralText_in_entryRuleLiteralText10993);
            iv_ruleLiteralText=ruleLiteralText();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralText; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralText11003); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralText"


    // $ANTLR start "ruleLiteralText"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4794:1: ruleLiteralText returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleLiteralText() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4797:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4798:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4798:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4798:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4798:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4799:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLiteralTextAccess().getLiteralTextAction_0(),
                          current);
                  
            }

            }

            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4804:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4805:1: (lv_value_1_0= RULE_STRING )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4805:1: (lv_value_1_0= RULE_STRING )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4806:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteralText11054); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getLiteralTextAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLiteralTextRule());
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
    // $ANTLR end "ruleLiteralText"


    // $ANTLR start "entryRuleLiteralEnum"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4830:1: entryRuleLiteralEnum returns [EObject current=null] : iv_ruleLiteralEnum= ruleLiteralEnum EOF ;
    public final EObject entryRuleLiteralEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralEnum = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4831:2: (iv_ruleLiteralEnum= ruleLiteralEnum EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4832:2: iv_ruleLiteralEnum= ruleLiteralEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralEnumRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralEnum_in_entryRuleLiteralEnum11095);
            iv_ruleLiteralEnum=ruleLiteralEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralEnum; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralEnum11105); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralEnum"


    // $ANTLR start "ruleLiteralEnum"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4839:1: ruleLiteralEnum returns [EObject current=null] : ( () otherlv_1= '#' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleLiteralEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4842:28: ( ( () otherlv_1= '#' ( (otherlv_2= RULE_ID ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4843:1: ( () otherlv_1= '#' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4843:1: ( () otherlv_1= '#' ( (otherlv_2= RULE_ID ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4843:2: () otherlv_1= '#' ( (otherlv_2= RULE_ID ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4843:2: ()
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4844:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLiteralEnumAccess().getLiteralEnumAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleLiteralEnum11151); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLiteralEnumAccess().getNumberSignKeyword_1());
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4853:1: ( (otherlv_2= RULE_ID ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4854:1: (otherlv_2= RULE_ID )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4854:1: (otherlv_2= RULE_ID )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4855:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLiteralEnumRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteralEnum11171); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getLiteralEnumAccess().getValueDataDefinitionEnumElementCrossReference_2_0()); 
              	
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
    // $ANTLR end "ruleLiteralEnum"


    // $ANTLR start "entryRuleLiteralTime"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4874:1: entryRuleLiteralTime returns [EObject current=null] : iv_ruleLiteralTime= ruleLiteralTime EOF ;
    public final EObject entryRuleLiteralTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralTime = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4875:2: (iv_ruleLiteralTime= ruleLiteralTime EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4876:2: iv_ruleLiteralTime= ruleLiteralTime EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralTimeRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralTime_in_entryRuleLiteralTime11207);
            iv_ruleLiteralTime=ruleLiteralTime();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralTime; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralTime11217); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralTime"


    // $ANTLR start "ruleLiteralTime"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4883:1: ruleLiteralTime returns [EObject current=null] : ( ( () ( (lv_now_1_0= 'now' ) ) ) | ( () ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' ) ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )? ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )? ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )? ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )? ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )? ) | ( () ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' ) ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )? ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )? ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )? ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )? ) | ( () ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' ) ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )? ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )? ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )? ) | ( () ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' ) ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )? ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )? ) | ( () ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) ) ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )? ) | ( () ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) ) ) ) ;
    public final EObject ruleLiteralTime() throws RecognitionException {
        EObject current = null;

        Token lv_now_1_0=null;
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
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4886:28: ( ( ( () ( (lv_now_1_0= 'now' ) ) ) | ( () ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' ) ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )? ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )? ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )? ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )? ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )? ) | ( () ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' ) ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )? ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )? ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )? ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )? ) | ( () ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' ) ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )? ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )? ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )? ) | ( () ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' ) ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )? ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )? ) | ( () ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) ) ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )? ) | ( () ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) ) ) ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4887:1: ( ( () ( (lv_now_1_0= 'now' ) ) ) | ( () ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' ) ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )? ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )? ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )? ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )? ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )? ) | ( () ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' ) ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )? ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )? ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )? ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )? ) | ( () ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' ) ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )? ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )? ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )? ) | ( () ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' ) ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )? ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )? ) | ( () ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) ) ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )? ) | ( () ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) ) ) )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4887:1: ( ( () ( (lv_now_1_0= 'now' ) ) ) | ( () ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' ) ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )? ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )? ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )? ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )? ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )? ) | ( () ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' ) ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )? ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )? ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )? ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )? ) | ( () ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' ) ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )? ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )? ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )? ) | ( () ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' ) ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )? ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )? ) | ( () ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) ) ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )? ) | ( () ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) ) ) )
            int alt93=7;
            alt93 = dfa93.predict(input);
            switch (alt93) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4887:2: ( () ( (lv_now_1_0= 'now' ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4887:2: ( () ( (lv_now_1_0= 'now' ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4887:3: () ( (lv_now_1_0= 'now' ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4887:3: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4888:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralTimeAccess().getLiteralTimeAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4893:2: ( (lv_now_1_0= 'now' ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4894:1: (lv_now_1_0= 'now' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4894:1: (lv_now_1_0= 'now' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4895:3: lv_now_1_0= 'now'
                    {
                    lv_now_1_0=(Token)match(input,113,FOLLOW_113_in_ruleLiteralTime11270); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_now_1_0, grammarAccess.getLiteralTimeAccess().getNowNowKeyword_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralTimeRule());
                      	        }
                             		setWithLastConsumed(current, "now", true, "now");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4909:6: ( () ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' ) ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )? ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )? ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )? ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )? ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4909:6: ( () ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' ) ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )? ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )? ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )? ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )? ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4909:7: () ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' ) ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )? ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )? ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )? ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )? ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4909:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4910:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralTimeAccess().getLiteralTimeAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4915:2: ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4915:3: ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4915:3: ( (lv_year_3_0= ruleNUMBER ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4916:1: (lv_year_3_0= ruleNUMBER )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4916:1: (lv_year_3_0= ruleNUMBER )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4917:3: lv_year_3_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getYearNUMBERParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11322);
                    lv_year_3_0=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
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

                    otherlv_4=(Token)match(input,114,FOLLOW_114_in_ruleLiteralTime11334); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getLiteralTimeAccess().getYearKeyword_1_1_1());
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4937:2: ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==RULE_INT) ) {
                        int LA67_1 = input.LA(2);

                        if ( (LA67_1==122) ) {
                            int LA67_3 = input.LA(3);

                            if ( (LA67_3==RULE_INT) ) {
                                int LA67_5 = input.LA(4);

                                if ( (LA67_5==115) ) {
                                    alt67=1;
                                }
                            }
                        }
                        else if ( (LA67_1==115) ) {
                            alt67=1;
                        }
                    }
                    switch (alt67) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4937:3: ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month'
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4937:3: ( (lv_month_5_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4938:1: (lv_month_5_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4938:1: (lv_month_5_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4939:3: lv_month_5_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getMonthNUMBERParserRuleCall_1_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11357);
                            lv_month_5_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
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

                            otherlv_6=(Token)match(input,115,FOLLOW_115_in_ruleLiteralTime11369); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getLiteralTimeAccess().getMonthKeyword_1_2_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4959:3: ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==RULE_INT) ) {
                        int LA68_1 = input.LA(2);

                        if ( (LA68_1==122) ) {
                            int LA68_3 = input.LA(3);

                            if ( (LA68_3==RULE_INT) ) {
                                int LA68_5 = input.LA(4);

                                if ( (LA68_5==116) ) {
                                    alt68=1;
                                }
                            }
                        }
                        else if ( (LA68_1==116) ) {
                            alt68=1;
                        }
                    }
                    switch (alt68) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4959:4: ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day'
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4959:4: ( (lv_day_7_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4960:1: (lv_day_7_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4960:1: (lv_day_7_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4961:3: lv_day_7_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getDayNUMBERParserRuleCall_1_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11393);
                            lv_day_7_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
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

                            otherlv_8=(Token)match(input,116,FOLLOW_116_in_ruleLiteralTime11405); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getLiteralTimeAccess().getDayKeyword_1_3_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4981:3: ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==RULE_INT) ) {
                        int LA69_1 = input.LA(2);

                        if ( (LA69_1==122) ) {
                            int LA69_3 = input.LA(3);

                            if ( (LA69_3==RULE_INT) ) {
                                int LA69_5 = input.LA(4);

                                if ( (LA69_5==117) ) {
                                    alt69=1;
                                }
                            }
                        }
                        else if ( (LA69_1==117) ) {
                            alt69=1;
                        }
                    }
                    switch (alt69) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4981:4: ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour'
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4981:4: ( (lv_hour_9_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4982:1: (lv_hour_9_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4982:1: (lv_hour_9_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4983:3: lv_hour_9_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getHourNUMBERParserRuleCall_1_4_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11429);
                            lv_hour_9_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
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

                            otherlv_10=(Token)match(input,117,FOLLOW_117_in_ruleLiteralTime11441); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_10, grammarAccess.getLiteralTimeAccess().getHourKeyword_1_4_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5003:3: ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==RULE_INT) ) {
                        int LA71_1 = input.LA(2);

                        if ( (LA71_1==122) ) {
                            int LA71_3 = input.LA(3);

                            if ( (LA71_3==RULE_INT) ) {
                                int LA71_5 = input.LA(4);

                                if ( ((LA71_5>=118 && LA71_5<=119)) ) {
                                    alt71=1;
                                }
                            }
                        }
                        else if ( ((LA71_1>=118 && LA71_1<=119)) ) {
                            alt71=1;
                        }
                    }
                    switch (alt71) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5003:4: ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5003:4: ( (lv_minute_11_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5004:1: (lv_minute_11_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5004:1: (lv_minute_11_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5005:3: lv_minute_11_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getMinuteNUMBERParserRuleCall_1_5_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11465);
                            lv_minute_11_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
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

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5021:2: (otherlv_12= 'm' | otherlv_13= 'minute' )
                            int alt70=2;
                            int LA70_0 = input.LA(1);

                            if ( (LA70_0==118) ) {
                                alt70=1;
                            }
                            else if ( (LA70_0==119) ) {
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
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5021:4: otherlv_12= 'm'
                                    {
                                    otherlv_12=(Token)match(input,118,FOLLOW_118_in_ruleLiteralTime11478); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_12, grammarAccess.getLiteralTimeAccess().getMKeyword_1_5_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5026:7: otherlv_13= 'minute'
                                    {
                                    otherlv_13=(Token)match(input,119,FOLLOW_119_in_ruleLiteralTime11496); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_13, grammarAccess.getLiteralTimeAccess().getMinuteKeyword_1_5_1_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5030:4: ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==RULE_INT) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5030:5: ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5030:5: ( (lv_second_14_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5031:1: (lv_second_14_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5031:1: (lv_second_14_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5032:3: lv_second_14_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getSecondNUMBERParserRuleCall_1_6_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11521);
                            lv_second_14_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
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

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5048:2: (otherlv_15= 's' | otherlv_16= 'second' )
                            int alt72=2;
                            int LA72_0 = input.LA(1);

                            if ( (LA72_0==120) ) {
                                alt72=1;
                            }
                            else if ( (LA72_0==121) ) {
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
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5048:4: otherlv_15= 's'
                                    {
                                    otherlv_15=(Token)match(input,120,FOLLOW_120_in_ruleLiteralTime11534); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_15, grammarAccess.getLiteralTimeAccess().getSKeyword_1_6_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5053:7: otherlv_16= 'second'
                                    {
                                    otherlv_16=(Token)match(input,121,FOLLOW_121_in_ruleLiteralTime11552); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_16, grammarAccess.getLiteralTimeAccess().getSecondKeyword_1_6_1_1());
                                          
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5058:6: ( () ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' ) ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )? ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )? ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )? ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5058:6: ( () ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' ) ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )? ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )? ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )? ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5058:7: () ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' ) ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )? ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )? ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )? ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5058:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5059:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralTimeAccess().getLiteralTimeAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5064:2: ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5064:3: ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5064:3: ( (lv_month_18_0= ruleNUMBER ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5065:1: (lv_month_18_0= ruleNUMBER )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5065:1: (lv_month_18_0= ruleNUMBER )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5066:3: lv_month_18_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getMonthNUMBERParserRuleCall_2_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11594);
                    lv_month_18_0=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
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

                    otherlv_19=(Token)match(input,115,FOLLOW_115_in_ruleLiteralTime11606); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getLiteralTimeAccess().getMonthKeyword_2_1_1());
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5086:2: ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==RULE_INT) ) {
                        int LA74_1 = input.LA(2);

                        if ( (LA74_1==122) ) {
                            int LA74_3 = input.LA(3);

                            if ( (LA74_3==RULE_INT) ) {
                                int LA74_5 = input.LA(4);

                                if ( (LA74_5==116) ) {
                                    alt74=1;
                                }
                            }
                        }
                        else if ( (LA74_1==116) ) {
                            alt74=1;
                        }
                    }
                    switch (alt74) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5086:3: ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day'
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5086:3: ( (lv_day_20_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5087:1: (lv_day_20_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5087:1: (lv_day_20_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5088:3: lv_day_20_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getDayNUMBERParserRuleCall_2_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11629);
                            lv_day_20_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
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

                            otherlv_21=(Token)match(input,116,FOLLOW_116_in_ruleLiteralTime11641); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_21, grammarAccess.getLiteralTimeAccess().getDayKeyword_2_2_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5108:3: ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==RULE_INT) ) {
                        int LA75_1 = input.LA(2);

                        if ( (LA75_1==122) ) {
                            int LA75_3 = input.LA(3);

                            if ( (LA75_3==RULE_INT) ) {
                                int LA75_5 = input.LA(4);

                                if ( (LA75_5==117) ) {
                                    alt75=1;
                                }
                            }
                        }
                        else if ( (LA75_1==117) ) {
                            alt75=1;
                        }
                    }
                    switch (alt75) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5108:4: ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour'
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5108:4: ( (lv_hour_22_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5109:1: (lv_hour_22_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5109:1: (lv_hour_22_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5110:3: lv_hour_22_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getHourNUMBERParserRuleCall_2_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11665);
                            lv_hour_22_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
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

                            otherlv_23=(Token)match(input,117,FOLLOW_117_in_ruleLiteralTime11677); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_23, grammarAccess.getLiteralTimeAccess().getHourKeyword_2_3_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5130:3: ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==RULE_INT) ) {
                        int LA77_1 = input.LA(2);

                        if ( (LA77_1==122) ) {
                            int LA77_3 = input.LA(3);

                            if ( (LA77_3==RULE_INT) ) {
                                int LA77_5 = input.LA(4);

                                if ( ((LA77_5>=118 && LA77_5<=119)) ) {
                                    alt77=1;
                                }
                            }
                        }
                        else if ( ((LA77_1>=118 && LA77_1<=119)) ) {
                            alt77=1;
                        }
                    }
                    switch (alt77) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5130:4: ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5130:4: ( (lv_minute_24_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5131:1: (lv_minute_24_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5131:1: (lv_minute_24_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5132:3: lv_minute_24_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getMinuteNUMBERParserRuleCall_2_4_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11701);
                            lv_minute_24_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
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

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5148:2: (otherlv_25= 'm' | otherlv_26= 'minute' )
                            int alt76=2;
                            int LA76_0 = input.LA(1);

                            if ( (LA76_0==118) ) {
                                alt76=1;
                            }
                            else if ( (LA76_0==119) ) {
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
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5148:4: otherlv_25= 'm'
                                    {
                                    otherlv_25=(Token)match(input,118,FOLLOW_118_in_ruleLiteralTime11714); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_25, grammarAccess.getLiteralTimeAccess().getMKeyword_2_4_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5153:7: otherlv_26= 'minute'
                                    {
                                    otherlv_26=(Token)match(input,119,FOLLOW_119_in_ruleLiteralTime11732); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_26, grammarAccess.getLiteralTimeAccess().getMinuteKeyword_2_4_1_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5157:4: ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==RULE_INT) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5157:5: ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5157:5: ( (lv_second_27_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5158:1: (lv_second_27_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5158:1: (lv_second_27_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5159:3: lv_second_27_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getSecondNUMBERParserRuleCall_2_5_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11757);
                            lv_second_27_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
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

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5175:2: (otherlv_28= 's' | otherlv_29= 'second' )
                            int alt78=2;
                            int LA78_0 = input.LA(1);

                            if ( (LA78_0==120) ) {
                                alt78=1;
                            }
                            else if ( (LA78_0==121) ) {
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
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5175:4: otherlv_28= 's'
                                    {
                                    otherlv_28=(Token)match(input,120,FOLLOW_120_in_ruleLiteralTime11770); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_28, grammarAccess.getLiteralTimeAccess().getSKeyword_2_5_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5180:7: otherlv_29= 'second'
                                    {
                                    otherlv_29=(Token)match(input,121,FOLLOW_121_in_ruleLiteralTime11788); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_29, grammarAccess.getLiteralTimeAccess().getSecondKeyword_2_5_1_1());
                                          
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5185:6: ( () ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' ) ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )? ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )? ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5185:6: ( () ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' ) ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )? ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )? ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5185:7: () ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' ) ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )? ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )? ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5185:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5186:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralTimeAccess().getLiteralTimeAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5191:2: ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5191:3: ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5191:3: ( (lv_day_31_0= ruleNUMBER ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5192:1: (lv_day_31_0= ruleNUMBER )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5192:1: (lv_day_31_0= ruleNUMBER )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5193:3: lv_day_31_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getDayNUMBERParserRuleCall_3_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11830);
                    lv_day_31_0=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
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

                    otherlv_32=(Token)match(input,116,FOLLOW_116_in_ruleLiteralTime11842); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getLiteralTimeAccess().getDayKeyword_3_1_1());
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5213:2: ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==RULE_INT) ) {
                        int LA80_1 = input.LA(2);

                        if ( (LA80_1==122) ) {
                            int LA80_3 = input.LA(3);

                            if ( (LA80_3==RULE_INT) ) {
                                int LA80_5 = input.LA(4);

                                if ( (LA80_5==117) ) {
                                    alt80=1;
                                }
                            }
                        }
                        else if ( (LA80_1==117) ) {
                            alt80=1;
                        }
                    }
                    switch (alt80) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5213:3: ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour'
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5213:3: ( (lv_hour_33_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5214:1: (lv_hour_33_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5214:1: (lv_hour_33_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5215:3: lv_hour_33_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getHourNUMBERParserRuleCall_3_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11865);
                            lv_hour_33_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
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

                            otherlv_34=(Token)match(input,117,FOLLOW_117_in_ruleLiteralTime11877); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_34, grammarAccess.getLiteralTimeAccess().getHourKeyword_3_2_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5235:3: ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==RULE_INT) ) {
                        int LA82_1 = input.LA(2);

                        if ( (LA82_1==122) ) {
                            int LA82_3 = input.LA(3);

                            if ( (LA82_3==RULE_INT) ) {
                                int LA82_5 = input.LA(4);

                                if ( ((LA82_5>=118 && LA82_5<=119)) ) {
                                    alt82=1;
                                }
                            }
                        }
                        else if ( ((LA82_1>=118 && LA82_1<=119)) ) {
                            alt82=1;
                        }
                    }
                    switch (alt82) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5235:4: ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5235:4: ( (lv_minute_35_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5236:1: (lv_minute_35_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5236:1: (lv_minute_35_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5237:3: lv_minute_35_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getMinuteNUMBERParserRuleCall_3_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11901);
                            lv_minute_35_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
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

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5253:2: (otherlv_36= 'm' | otherlv_37= 'minute' )
                            int alt81=2;
                            int LA81_0 = input.LA(1);

                            if ( (LA81_0==118) ) {
                                alt81=1;
                            }
                            else if ( (LA81_0==119) ) {
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
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5253:4: otherlv_36= 'm'
                                    {
                                    otherlv_36=(Token)match(input,118,FOLLOW_118_in_ruleLiteralTime11914); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_36, grammarAccess.getLiteralTimeAccess().getMKeyword_3_3_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5258:7: otherlv_37= 'minute'
                                    {
                                    otherlv_37=(Token)match(input,119,FOLLOW_119_in_ruleLiteralTime11932); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_37, grammarAccess.getLiteralTimeAccess().getMinuteKeyword_3_3_1_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5262:4: ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==RULE_INT) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5262:5: ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5262:5: ( (lv_second_38_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5263:1: (lv_second_38_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5263:1: (lv_second_38_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5264:3: lv_second_38_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getSecondNUMBERParserRuleCall_3_4_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime11957);
                            lv_second_38_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
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

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5280:2: (otherlv_39= 's' | otherlv_40= 'second' )
                            int alt83=2;
                            int LA83_0 = input.LA(1);

                            if ( (LA83_0==120) ) {
                                alt83=1;
                            }
                            else if ( (LA83_0==121) ) {
                                alt83=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 83, 0, input);

                                throw nvae;
                            }
                            switch (alt83) {
                                case 1 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5280:4: otherlv_39= 's'
                                    {
                                    otherlv_39=(Token)match(input,120,FOLLOW_120_in_ruleLiteralTime11970); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_39, grammarAccess.getLiteralTimeAccess().getSKeyword_3_4_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5285:7: otherlv_40= 'second'
                                    {
                                    otherlv_40=(Token)match(input,121,FOLLOW_121_in_ruleLiteralTime11988); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_40, grammarAccess.getLiteralTimeAccess().getSecondKeyword_3_4_1_1());
                                          
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5290:6: ( () ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' ) ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )? ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5290:6: ( () ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' ) ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )? ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5290:7: () ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' ) ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )? ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5290:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5291:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralTimeAccess().getLiteralTimeAction_4_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5296:2: ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5296:3: ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour'
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5296:3: ( (lv_hour_42_0= ruleNUMBER ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5297:1: (lv_hour_42_0= ruleNUMBER )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5297:1: (lv_hour_42_0= ruleNUMBER )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5298:3: lv_hour_42_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getHourNUMBERParserRuleCall_4_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime12030);
                    lv_hour_42_0=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
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

                    otherlv_43=(Token)match(input,117,FOLLOW_117_in_ruleLiteralTime12042); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_43, grammarAccess.getLiteralTimeAccess().getHourKeyword_4_1_1());
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5318:2: ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==RULE_INT) ) {
                        int LA86_1 = input.LA(2);

                        if ( (LA86_1==122) ) {
                            int LA86_3 = input.LA(3);

                            if ( (LA86_3==RULE_INT) ) {
                                int LA86_5 = input.LA(4);

                                if ( ((LA86_5>=118 && LA86_5<=119)) ) {
                                    alt86=1;
                                }
                            }
                        }
                        else if ( ((LA86_1>=118 && LA86_1<=119)) ) {
                            alt86=1;
                        }
                    }
                    switch (alt86) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5318:3: ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5318:3: ( (lv_minute_44_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5319:1: (lv_minute_44_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5319:1: (lv_minute_44_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5320:3: lv_minute_44_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getMinuteNUMBERParserRuleCall_4_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime12065);
                            lv_minute_44_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
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

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5336:2: (otherlv_45= 'm' | otherlv_46= 'minute' )
                            int alt85=2;
                            int LA85_0 = input.LA(1);

                            if ( (LA85_0==118) ) {
                                alt85=1;
                            }
                            else if ( (LA85_0==119) ) {
                                alt85=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 85, 0, input);

                                throw nvae;
                            }
                            switch (alt85) {
                                case 1 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5336:4: otherlv_45= 'm'
                                    {
                                    otherlv_45=(Token)match(input,118,FOLLOW_118_in_ruleLiteralTime12078); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_45, grammarAccess.getLiteralTimeAccess().getMKeyword_4_2_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5341:7: otherlv_46= 'minute'
                                    {
                                    otherlv_46=(Token)match(input,119,FOLLOW_119_in_ruleLiteralTime12096); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_46, grammarAccess.getLiteralTimeAccess().getMinuteKeyword_4_2_1_1());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5345:4: ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==RULE_INT) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5345:5: ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5345:5: ( (lv_second_47_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5346:1: (lv_second_47_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5346:1: (lv_second_47_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5347:3: lv_second_47_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getSecondNUMBERParserRuleCall_4_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime12121);
                            lv_second_47_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
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

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5363:2: (otherlv_48= 's' | otherlv_49= 'second' )
                            int alt87=2;
                            int LA87_0 = input.LA(1);

                            if ( (LA87_0==120) ) {
                                alt87=1;
                            }
                            else if ( (LA87_0==121) ) {
                                alt87=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 87, 0, input);

                                throw nvae;
                            }
                            switch (alt87) {
                                case 1 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5363:4: otherlv_48= 's'
                                    {
                                    otherlv_48=(Token)match(input,120,FOLLOW_120_in_ruleLiteralTime12134); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_48, grammarAccess.getLiteralTimeAccess().getSKeyword_4_3_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5368:7: otherlv_49= 'second'
                                    {
                                    otherlv_49=(Token)match(input,121,FOLLOW_121_in_ruleLiteralTime12152); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_49, grammarAccess.getLiteralTimeAccess().getSecondKeyword_4_3_1_1());
                                          
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5373:6: ( () ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) ) ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )? )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5373:6: ( () ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) ) ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )? )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5373:7: () ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) ) ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )?
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5373:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5374:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralTimeAccess().getLiteralTimeAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5379:2: ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5379:3: ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5379:3: ( (lv_minute_51_0= ruleNUMBER ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5380:1: (lv_minute_51_0= ruleNUMBER )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5380:1: (lv_minute_51_0= ruleNUMBER )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5381:3: lv_minute_51_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getMinuteNUMBERParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime12194);
                    lv_minute_51_0=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
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

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5397:2: (otherlv_52= 'm' | otherlv_53= 'minute' )
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==118) ) {
                        alt89=1;
                    }
                    else if ( (LA89_0==119) ) {
                        alt89=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 89, 0, input);

                        throw nvae;
                    }
                    switch (alt89) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5397:4: otherlv_52= 'm'
                            {
                            otherlv_52=(Token)match(input,118,FOLLOW_118_in_ruleLiteralTime12207); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_52, grammarAccess.getLiteralTimeAccess().getMKeyword_5_1_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5402:7: otherlv_53= 'minute'
                            {
                            otherlv_53=(Token)match(input,119,FOLLOW_119_in_ruleLiteralTime12225); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_53, grammarAccess.getLiteralTimeAccess().getMinuteKeyword_5_1_1_1());
                                  
                            }

                            }
                            break;

                    }


                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5406:3: ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==RULE_INT) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5406:4: ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5406:4: ( (lv_second_54_0= ruleNUMBER ) )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5407:1: (lv_second_54_0= ruleNUMBER )
                            {
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5407:1: (lv_second_54_0= ruleNUMBER )
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5408:3: lv_second_54_0= ruleNUMBER
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getSecondNUMBERParserRuleCall_5_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime12249);
                            lv_second_54_0=ruleNUMBER();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
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

                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5424:2: (otherlv_55= 's' | otherlv_56= 'second' )
                            int alt90=2;
                            int LA90_0 = input.LA(1);

                            if ( (LA90_0==120) ) {
                                alt90=1;
                            }
                            else if ( (LA90_0==121) ) {
                                alt90=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 90, 0, input);

                                throw nvae;
                            }
                            switch (alt90) {
                                case 1 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5424:4: otherlv_55= 's'
                                    {
                                    otherlv_55=(Token)match(input,120,FOLLOW_120_in_ruleLiteralTime12262); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_55, grammarAccess.getLiteralTimeAccess().getSKeyword_5_2_1_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5429:7: otherlv_56= 'second'
                                    {
                                    otherlv_56=(Token)match(input,121,FOLLOW_121_in_ruleLiteralTime12280); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_56, grammarAccess.getLiteralTimeAccess().getSecondKeyword_5_2_1_1());
                                          
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
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5434:6: ( () ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5434:6: ( () ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5434:7: () ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5434:7: ()
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5435:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralTimeAccess().getLiteralTimeAction_6_0(),
                                  current);
                          
                    }

                    }

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5440:2: ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5440:3: ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5440:3: ( (lv_second_58_0= ruleNUMBER ) )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5441:1: (lv_second_58_0= ruleNUMBER )
                    {
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5441:1: (lv_second_58_0= ruleNUMBER )
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5442:3: lv_second_58_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralTimeAccess().getSecondNUMBERParserRuleCall_6_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleLiteralTime12322);
                    lv_second_58_0=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralTimeRule());
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

                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5458:2: (otherlv_59= 's' | otherlv_60= 'second' )
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==120) ) {
                        alt92=1;
                    }
                    else if ( (LA92_0==121) ) {
                        alt92=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 92, 0, input);

                        throw nvae;
                    }
                    switch (alt92) {
                        case 1 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5458:4: otherlv_59= 's'
                            {
                            otherlv_59=(Token)match(input,120,FOLLOW_120_in_ruleLiteralTime12335); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_59, grammarAccess.getLiteralTimeAccess().getSKeyword_6_1_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5463:7: otherlv_60= 'second'
                            {
                            otherlv_60=(Token)match(input,121,FOLLOW_121_in_ruleLiteralTime12353); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_60, grammarAccess.getLiteralTimeAccess().getSecondKeyword_6_1_1_1());
                                  
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
    // $ANTLR end "ruleLiteralTime"


    // $ANTLR start "entryRuleNUMBER"
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5475:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5476:2: (iv_ruleNUMBER= ruleNUMBER EOF )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5477:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMBERRule()); 
            }
            pushFollow(FOLLOW_ruleNUMBER_in_entryRuleNUMBER12393);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMBER.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUMBER12404); if (state.failed) return current;

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
    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5484:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5487:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5488:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5488:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5488:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNUMBER12444); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 
                  
            }
            // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5495:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==122) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:5496:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,122,FOLLOW_122_in_ruleNUMBER12463); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNUMBERAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNUMBER12478); if (state.failed) return current;
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
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:662:5: ( ( () 'collection' ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:662:6: ( () 'collection' )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:662:6: ( () 'collection' )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:662:7: () 'collection'
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:662:7: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:663:1: 
        {
        }

        match(input,23,FOLLOW_23_in_synpred1_InternalLil1319); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalLil

    // $ANTLR start synpred2_InternalLil
    public final void synpred2_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:674:5: ( ( () 'set' ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:674:6: ( () 'set' )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:674:6: ( () 'set' )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:674:7: () 'set'
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:674:7: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:675:1: 
        {
        }

        match(input,24,FOLLOW_24_in_synpred2_InternalLil1357); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalLil

    // $ANTLR start synpred3_InternalLil
    public final void synpred3_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:686:5: ( ( () 'list' ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:686:6: ( () 'list' )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:686:6: ( () 'list' )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:686:7: () 'list'
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:686:7: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:687:1: 
        {
        }

        match(input,25,FOLLOW_25_in_synpred3_InternalLil1395); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalLil

    // $ANTLR start synpred4_InternalLil
    public final void synpred4_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:698:5: ( ( () 'queue' ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:698:6: ( () 'queue' )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:698:6: ( () 'queue' )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:698:7: () 'queue'
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:698:7: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:699:1: 
        {
        }

        match(input,26,FOLLOW_26_in_synpred4_InternalLil1433); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalLil

    // $ANTLR start synpred5_InternalLil
    public final void synpred5_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2688:3: ( ( () ( ( ruleExpressionOrOp ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2688:4: ( () ( ( ruleExpressionOrOp ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2688:4: ( () ( ( ruleExpressionOrOp ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2688:5: () ( ( ruleExpressionOrOp ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2688:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2689:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2689:2: ( ( ruleExpressionOrOp ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2690:1: ( ruleExpressionOrOp )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2690:1: ( ruleExpressionOrOp )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2691:1: ruleExpressionOrOp
        {
        pushFollow(FOLLOW_ruleExpressionOrOp_in_synpred5_InternalLil5842);
        ruleExpressionOrOp();

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
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2792:3: ( ( () ( ( ruleExpressionAndOp ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2792:4: ( () ( ( ruleExpressionAndOp ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2792:4: ( () ( ( ruleExpressionAndOp ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2792:5: () ( ( ruleExpressionAndOp ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2792:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2793:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2793:2: ( ( ruleExpressionAndOp ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2794:1: ( ruleExpressionAndOp )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2794:1: ( ruleExpressionAndOp )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2795:1: ruleExpressionAndOp
        {
        pushFollow(FOLLOW_ruleExpressionAndOp_in_synpred6_InternalLil6097);
        ruleExpressionAndOp();

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
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2896:3: ( ( () ( ( ruleExpressionEqualityOp ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2896:4: ( () ( ( ruleExpressionEqualityOp ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2896:4: ( () ( ( ruleExpressionEqualityOp ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2896:5: () ( ( ruleExpressionEqualityOp ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2896:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2897:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2897:2: ( ( ruleExpressionEqualityOp ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2898:1: ( ruleExpressionEqualityOp )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2898:1: ( ruleExpressionEqualityOp )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:2899:1: ruleExpressionEqualityOp
        {
        pushFollow(FOLLOW_ruleExpressionEqualityOp_in_synpred7_InternalLil6352);
        ruleExpressionEqualityOp();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalLil

    // $ANTLR start synpred8_InternalLil
    public final void synpred8_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3007:3: ( ( () ( ( ruleExpressionCompareOp ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3007:4: ( () ( ( ruleExpressionCompareOp ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3007:4: ( () ( ( ruleExpressionCompareOp ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3007:5: () ( ( ruleExpressionCompareOp ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3007:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3008:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3008:2: ( ( ruleExpressionCompareOp ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3009:1: ( ruleExpressionCompareOp )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3009:1: ( ruleExpressionCompareOp )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3010:1: ruleExpressionCompareOp
        {
        pushFollow(FOLLOW_ruleExpressionCompareOp_in_synpred8_InternalLil6628);
        ruleExpressionCompareOp();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalLil

    // $ANTLR start synpred9_InternalLil
    public final void synpred9_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3132:3: ( ( () ( ( ruleExpressionOtherOp ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3132:4: ( () ( ( ruleExpressionOtherOp ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3132:4: ( () ( ( ruleExpressionOtherOp ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3132:5: () ( ( ruleExpressionOtherOp ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3132:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3133:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3133:2: ( ( ruleExpressionOtherOp ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3134:1: ( ruleExpressionOtherOp )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3134:1: ( ruleExpressionOtherOp )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3135:1: ruleExpressionOtherOp
        {
        pushFollow(FOLLOW_ruleExpressionOtherOp_in_synpred9_InternalLil6942);
        ruleExpressionOtherOp();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalLil

    // $ANTLR start synpred10_InternalLil
    public final void synpred10_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3243:3: ( ( () ( ( ruleExpressionAdditionOp ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3243:4: ( () ( ( ruleExpressionAdditionOp ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3243:4: ( () ( ( ruleExpressionAdditionOp ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3243:5: () ( ( ruleExpressionAdditionOp ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3243:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3244:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3244:2: ( ( ruleExpressionAdditionOp ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3245:1: ( ruleExpressionAdditionOp )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3245:1: ( ruleExpressionAdditionOp )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3246:1: ruleExpressionAdditionOp
        {
        pushFollow(FOLLOW_ruleExpressionAdditionOp_in_synpred10_InternalLil7218);
        ruleExpressionAdditionOp();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalLil

    // $ANTLR start synpred11_InternalLil
    public final void synpred11_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3354:3: ( ( () ( ( ruleExpressionMultiplicationOp ) ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3354:4: ( () ( ( ruleExpressionMultiplicationOp ) ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3354:4: ( () ( ( ruleExpressionMultiplicationOp ) ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3354:5: () ( ( ruleExpressionMultiplicationOp ) )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3354:5: ()
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3355:1: 
        {
        }

        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3355:2: ( ( ruleExpressionMultiplicationOp ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3356:1: ( ruleExpressionMultiplicationOp )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3356:1: ( ruleExpressionMultiplicationOp )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:3357:1: ruleExpressionMultiplicationOp
        {
        pushFollow(FOLLOW_ruleExpressionMultiplicationOp_in_synpred11_InternalLil7494);
        ruleExpressionMultiplicationOp();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalLil

    // $ANTLR start synpred15_InternalLil
    public final void synpred15_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4131:3: ( ( ruleExpressionCase ) )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4132:1: ( ruleExpressionCase )
        {
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4132:1: ( ruleExpressionCase )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4133:1: ruleExpressionCase
        {
        pushFollow(FOLLOW_ruleExpressionCase_in_synpred15_InternalLil9408);
        ruleExpressionCase();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalLil

    // $ANTLR start synpred16_InternalLil
    public final void synpred16_InternalLil_fragment() throws RecognitionException {   
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4153:5: ( 'default' )
        // ../com.crubier.lil/src-gen/com/crubier/lil/parser/antlr/internal/InternalLil.g:4153:7: 'default'
        {
        match(input,75,FOLLOW_75_in_synpred16_InternalLil9439); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalLil

    // Delegated rules

    public final boolean synpred16_InternalLil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalLil_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred15_InternalLil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalLil_fragment(); // can never throw exception
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
    public final boolean synpred10_InternalLil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalLil_fragment(); // can never throw exception
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
    public final boolean synpred8_InternalLil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalLil_fragment(); // can never throw exception
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
    public final boolean synpred9_InternalLil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalLil_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA55 dfa55 = new DFA55(this);
    protected DFA93 dfa93 = new DFA93(this);
    static final String DFA55_eotS =
        "\14\uffff";
    static final String DFA55_eofS =
        "\3\uffff\1\12\7\uffff\1\12";
    static final String DFA55_minS =
        "\1\4\2\uffff\1\4\5\uffff\1\6\1\uffff\1\4";
    static final String DFA55_maxS =
        "\1\161\2\uffff\1\172\5\uffff\1\6\1\uffff\1\171";
    static final String DFA55_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\7\1\10\1\uffff\1\3\1\uffff";
    static final String DFA55_specialS =
        "\14\uffff}>";
    static final String[] DFA55_transitionS = {
            "\1\10\1\5\1\3\24\uffff\1\1\2\uffff\1\7\1\1\116\uffff\2\2\1\4"+
            "\1\6",
            "",
            "",
            "\1\12\7\uffff\1\12\13\uffff\1\12\3\uffff\2\12\2\uffff\1\12"+
            "\20\uffff\4\12\1\uffff\20\12\2\uffff\2\12\1\uffff\2\12\45\uffff"+
            "\10\6\1\11",
            "",
            "",
            "",
            "",
            "",
            "\1\13",
            "",
            "\1\12\7\uffff\1\12\13\uffff\1\12\3\uffff\2\12\2\uffff\1\12"+
            "\20\uffff\4\12\1\uffff\20\12\2\uffff\2\12\1\uffff\2\12\45\uffff"+
            "\10\6"
    };

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "3657:1: (this_ExpressionLiteralCollection_0= ruleExpressionLiteralCollection | this_LiteralBoolean_1= ruleLiteralBoolean | this_LiteralNumber_2= ruleLiteralNumber | this_LiteralNull_3= ruleLiteralNull | this_LiteralText_4= ruleLiteralText | this_LiteralTime_5= ruleLiteralTime | this_LiteralEnum_6= ruleLiteralEnum | ( () ( (otherlv_8= RULE_ID ) ) ) )";
        }
    }
    static final String DFA93_eotS =
        "\13\uffff";
    static final String DFA93_eofS =
        "\13\uffff";
    static final String DFA93_minS =
        "\1\6\1\uffff\1\162\1\6\6\uffff\1\162";
    static final String DFA93_maxS =
        "\1\161\1\uffff\1\172\1\6\6\uffff\1\171";
    static final String DFA93_acceptS =
        "\1\uffff\1\1\2\uffff\1\5\1\6\1\3\1\7\1\4\1\2\1\uffff";
    static final String DFA93_specialS =
        "\13\uffff}>";
    static final String[] DFA93_transitionS = {
            "\1\2\152\uffff\1\1",
            "",
            "\1\11\1\6\1\10\1\4\2\5\2\7\1\3",
            "\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\11\1\6\1\10\1\4\2\5\2\7"
    };

    static final short[] DFA93_eot = DFA.unpackEncodedString(DFA93_eotS);
    static final short[] DFA93_eof = DFA.unpackEncodedString(DFA93_eofS);
    static final char[] DFA93_min = DFA.unpackEncodedStringToUnsignedChars(DFA93_minS);
    static final char[] DFA93_max = DFA.unpackEncodedStringToUnsignedChars(DFA93_maxS);
    static final short[] DFA93_accept = DFA.unpackEncodedString(DFA93_acceptS);
    static final short[] DFA93_special = DFA.unpackEncodedString(DFA93_specialS);
    static final short[][] DFA93_transition;

    static {
        int numStates = DFA93_transitionS.length;
        DFA93_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA93_transition[i] = DFA.unpackEncodedString(DFA93_transitionS[i]);
        }
    }

    class DFA93 extends DFA {

        public DFA93(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 93;
            this.eot = DFA93_eot;
            this.eof = DFA93_eof;
            this.min = DFA93_min;
            this.max = DFA93_max;
            this.accept = DFA93_accept;
            this.special = DFA93_special;
            this.transition = DFA93_transition;
        }
        public String getDescription() {
            return "4887:1: ( ( () ( (lv_now_1_0= 'now' ) ) ) | ( () ( ( (lv_year_3_0= ruleNUMBER ) ) otherlv_4= 'year' ) ( ( (lv_month_5_0= ruleNUMBER ) ) otherlv_6= 'month' )? ( ( (lv_day_7_0= ruleNUMBER ) ) otherlv_8= 'day' )? ( ( (lv_hour_9_0= ruleNUMBER ) ) otherlv_10= 'hour' )? ( ( (lv_minute_11_0= ruleNUMBER ) ) (otherlv_12= 'm' | otherlv_13= 'minute' ) )? ( ( (lv_second_14_0= ruleNUMBER ) ) (otherlv_15= 's' | otherlv_16= 'second' ) )? ) | ( () ( ( (lv_month_18_0= ruleNUMBER ) ) otherlv_19= 'month' ) ( ( (lv_day_20_0= ruleNUMBER ) ) otherlv_21= 'day' )? ( ( (lv_hour_22_0= ruleNUMBER ) ) otherlv_23= 'hour' )? ( ( (lv_minute_24_0= ruleNUMBER ) ) (otherlv_25= 'm' | otherlv_26= 'minute' ) )? ( ( (lv_second_27_0= ruleNUMBER ) ) (otherlv_28= 's' | otherlv_29= 'second' ) )? ) | ( () ( ( (lv_day_31_0= ruleNUMBER ) ) otherlv_32= 'day' ) ( ( (lv_hour_33_0= ruleNUMBER ) ) otherlv_34= 'hour' )? ( ( (lv_minute_35_0= ruleNUMBER ) ) (otherlv_36= 'm' | otherlv_37= 'minute' ) )? ( ( (lv_second_38_0= ruleNUMBER ) ) (otherlv_39= 's' | otherlv_40= 'second' ) )? ) | ( () ( ( (lv_hour_42_0= ruleNUMBER ) ) otherlv_43= 'hour' ) ( ( (lv_minute_44_0= ruleNUMBER ) ) (otherlv_45= 'm' | otherlv_46= 'minute' ) )? ( ( (lv_second_47_0= ruleNUMBER ) ) (otherlv_48= 's' | otherlv_49= 'second' ) )? ) | ( () ( ( (lv_minute_51_0= ruleNUMBER ) ) (otherlv_52= 'm' | otherlv_53= 'minute' ) ) ( ( (lv_second_54_0= ruleNUMBER ) ) (otherlv_55= 's' | otherlv_56= 'second' ) )? ) | ( () ( ( (lv_second_58_0= ruleNUMBER ) ) (otherlv_59= 's' | otherlv_60= 'second' ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleLilModel_in_entryRuleLilModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLilModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActorTypeDefinition_in_ruleLilModel131 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleDataTypeDefinition_in_ruleLilModel158 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleInteractorTypeDefinition_in_ruleLilModel185 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleActorTypeDefinition_in_entryRuleActorTypeDefinition222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActorTypeDefinition232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActorTypeDefinition274 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleActorTypeDefinition291 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleActorTypeDefinition303 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleActorInstanceDeclaration_in_ruleActorTypeDefinition324 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleActorType_in_entryRuleActorType361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActorType371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleActorType418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleActorType447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActorType484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActorInstanceDeclaration_in_entryRuleActorInstanceDeclaration521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActorInstanceDeclaration531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActorInstanceDeclaration573 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleActorInstanceDeclaration590 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_ruleActorType_in_ruleActorInstanceDeclaration611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeDefinition_in_entryRuleDataTypeDefinition647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeDefinition657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataTypeDefinition709 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDataTypeDefinition726 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDataTypeDefinition738 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleDataInstanceDeclaration_in_ruleDataTypeDefinition759 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataTypeDefinition794 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDataTypeDefinition811 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDataTypeDefinition823 = new BitSet(new long[]{0x00000000007B0010L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleDataTypeDefinition844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleDataType939 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_17_in_ruleDataType968 = new BitSet(new long[]{0x0000000007840002L});
    public static final BitSet FOLLOW_18_in_ruleDataType981 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleDataTypeSymbolDefinitionSet_in_ruleDataType1002 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_19_in_ruleDataType1033 = new BitSet(new long[]{0x0000000007840002L});
    public static final BitSet FOLLOW_18_in_ruleDataType1046 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_ruleDataTypeNumberDefinitionSet_in_ruleDataType1067 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_20_in_ruleDataType1098 = new BitSet(new long[]{0x0000000007840002L});
    public static final BitSet FOLLOW_18_in_ruleDataType1111 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleDataTypeTextDefinitionSet_in_ruleDataType1132 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_21_in_ruleDataType1163 = new BitSet(new long[]{0x0000000007840002L});
    public static final BitSet FOLLOW_18_in_ruleDataType1176 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_ruleDataTypeTimeDefinitionSet_in_ruleDataType1197 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_22_in_ruleDataType1228 = new BitSet(new long[]{0x0000000007840002L});
    public static final BitSet FOLLOW_18_in_ruleDataType1241 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleDataTypeIdentifierDefinitionSet_in_ruleDataType1262 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataType1301 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_23_in_ruleDataType1338 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_24_in_ruleDataType1376 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_25_in_ruleDataType1414 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_26_in_ruleDataType1452 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleDataTypeSymbolDefinitionSet_in_entryRuleDataTypeSymbolDefinitionSet1491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeSymbolDefinitionSet1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleDataTypeSymbolDefinitionSet1538 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleDataTypeSymbolDefinitionSetElement_in_ruleDataTypeSymbolDefinitionSet1559 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleDataTypeSymbolDefinitionSet1572 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleDataTypeSymbolDefinitionSetElement_in_ruleDataTypeSymbolDefinitionSet1593 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_29_in_ruleDataTypeSymbolDefinitionSet1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeSymbolDefinitionSetElement_in_entryRuleDataTypeSymbolDefinitionSetElement1643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeSymbolDefinitionSetElement1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleDataTypeSymbolDefinitionSetElement1699 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataTypeSymbolDefinitionSetElement1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeNumberDefinitionSet_in_entryRuleDataTypeNumberDefinitionSet1757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeNumberDefinitionSet1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleDataTypeNumberDefinitionSet1814 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleLiteralNumber_in_ruleDataTypeNumberDefinitionSet1835 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleDataTypeNumberDefinitionSet1848 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleLiteralNumber_in_ruleDataTypeNumberDefinitionSet1869 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_29_in_ruleDataTypeNumberDefinitionSet1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleDataTypeNumberDefinitionSet1912 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleLiteralNumber_in_ruleDataTypeNumberDefinitionSet1933 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleDataTypeNumberDefinitionSet1945 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleLiteralNumber_in_ruleDataTypeNumberDefinitionSet1966 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleDataTypeNumberDefinitionSet1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeTextDefinitionSet_in_entryRuleDataTypeTextDefinitionSet2015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeTextDefinitionSet2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleDataTypeTextDefinitionSet2071 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLiteralText_in_ruleDataTypeTextDefinitionSet2092 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleDataTypeTextDefinitionSet2105 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleLiteralText_in_ruleDataTypeTextDefinitionSet2126 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_29_in_ruleDataTypeTextDefinitionSet2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeTimeDefinitionSet_in_entryRuleDataTypeTimeDefinitionSet2176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeTimeDefinitionSet2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleDataTypeTimeDefinitionSet2233 = new BitSet(new long[]{0x0000000000000040L,0x0002000000000000L});
    public static final BitSet FOLLOW_ruleLiteralTime_in_ruleDataTypeTimeDefinitionSet2254 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleDataTypeTimeDefinitionSet2267 = new BitSet(new long[]{0x0000000000000040L,0x0002000000000000L});
    public static final BitSet FOLLOW_ruleLiteralTime_in_ruleDataTypeTimeDefinitionSet2288 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_29_in_ruleDataTypeTimeDefinitionSet2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleDataTypeTimeDefinitionSet2331 = new BitSet(new long[]{0x0000000000000040L,0x0002000000000000L});
    public static final BitSet FOLLOW_ruleLiteralTime_in_ruleDataTypeTimeDefinitionSet2352 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleDataTypeTimeDefinitionSet2364 = new BitSet(new long[]{0x0000000000000040L,0x0002000000000000L});
    public static final BitSet FOLLOW_ruleLiteralTime_in_ruleDataTypeTimeDefinitionSet2385 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleDataTypeTimeDefinitionSet2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeIdentifierDefinitionSet_in_entryRuleDataTypeIdentifierDefinitionSet2434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeIdentifierDefinitionSet2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleDataTypeIdentifierDefinitionSet2490 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleLiteralNumber_in_ruleDataTypeIdentifierDefinitionSet2511 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleDataTypeIdentifierDefinitionSet2524 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleLiteralNumber_in_ruleDataTypeIdentifierDefinitionSet2545 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_29_in_ruleDataTypeIdentifierDefinitionSet2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataInstanceDeclaration_in_entryRuleDataInstanceDeclaration2595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataInstanceDeclaration2605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataInstanceDeclaration2647 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDataInstanceDeclaration2664 = new BitSet(new long[]{0x00000000007B0010L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleDataInstanceDeclaration2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorTypeDefinition_in_entryRuleInteractorTypeDefinition2721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorTypeDefinition2731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractorTypeDefinition2773 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleInteractorTypeDefinition2790 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInteractorTypeDefinition2802 = new BitSet(new long[]{0x000A000000000012L});
    public static final BitSet FOLLOW_ruleInteractorActor_in_ruleInteractorTypeDefinition2824 = new BitSet(new long[]{0x000A000000000012L});
    public static final BitSet FOLLOW_ruleInteractorData_in_ruleInteractorTypeDefinition2851 = new BitSet(new long[]{0x000A000000000012L});
    public static final BitSet FOLLOW_ruleInteractorComponent_in_ruleInteractorTypeDefinition2878 = new BitSet(new long[]{0x000A000000000012L});
    public static final BitSet FOLLOW_ruleInteractorBehavior_in_ruleInteractorTypeDefinition2905 = new BitSet(new long[]{0x000A000000000012L});
    public static final BitSet FOLLOW_ruleInteractorType_in_entryRuleInteractorType2943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorType2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractorType2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorActor_in_entryRuleInteractorActor3032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorActor3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractorActor3084 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInteractorActor3101 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_ruleActorType_in_ruleInteractorActor3122 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleInteractorActor3134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorData_in_entryRuleInteractorData3170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorData3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractorData3222 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInteractorData3239 = new BitSet(new long[]{0x00000000007B0010L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleInteractorData3260 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_ruleInteractorDataComponentMode_in_ruleInteractorData3281 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_34_in_ruleInteractorData3294 = new BitSet(new long[]{0x0000FE0000000010L});
    public static final BitSet FOLLOW_ruleInteractorSignalAlias_in_ruleInteractorData3315 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleInteractorData3330 = new BitSet(new long[]{0x0000FE0000000010L});
    public static final BitSet FOLLOW_ruleInteractorSignalAlias_in_ruleInteractorData3351 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleInteractorSignalAlias_in_entryRuleInteractorSignalAlias3389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorSignalAlias3399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessibleEntity_in_ruleInteractorSignalAlias3445 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleInteractorSignalAlias3458 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractorSignalAlias3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorDataComponentMode_in_entryRuleInteractorDataComponentMode3517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorDataComponentMode3528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleInteractorDataComponentMode3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleInteractorDataComponentMode3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleInteractorDataComponentMode3604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorComponent_in_entryRuleInteractorComponent3644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorComponent3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractorComponent3696 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInteractorComponent3713 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInteractorType_in_ruleInteractorComponent3734 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleInteractorComponent3746 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleInteractorComponent3759 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleActorAlias_in_ruleInteractorComponent3780 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleInteractorComponent3793 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleActorAlias_in_ruleInteractorComponent3814 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleAccessibleEntity_in_entryRuleAccessibleEntity3854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAccessibleEntity3864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericEntity_in_ruleAccessibleEntity3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAccessibleEntity3936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericEntity_in_entryRuleGenericEntity3973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericEntity3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleGenericEntity4022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleGenericEntity4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleGenericEntity4060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleGenericEntity4079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleGenericEntity4098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleGenericEntity4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleGenericEntity4136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActorAlias_in_entryRuleActorAlias4178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActorAlias4188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActorAlias4233 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleActorAlias4245 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActorAlias4265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorSignalReception_in_entryRuleInteractorSignalReception4301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorSignalReception4311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractorSignalReception4357 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleInteractorSignalReception4370 = new BitSet(new long[]{0x0000FE0000000010L});
    public static final BitSet FOLLOW_ruleInteractorSignalAlias_in_ruleInteractorSignalReception4391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleInteractorSignalReception4418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorSignalEmission_in_entryRuleInteractorSignalEmission4467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorSignalEmission4477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteractorSignalEmission4522 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleInteractorSignalEmission4535 = new BitSet(new long[]{0x0000FE0000000010L});
    public static final BitSet FOLLOW_ruleInteractorSignalAlias_in_ruleInteractorSignalEmission4556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorBehavior_in_entryRuleInteractorBehavior4594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorBehavior4604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorCause_in_ruleInteractorBehavior4650 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInteractorBehavior4662 = new BitSet(new long[]{0x0050000001000000L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorEffect_in_ruleInteractorBehavior4683 = new BitSet(new long[]{0x0050000001000002L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorCause_in_entryRuleInteractorBehaviorCause4720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorBehaviorCause4730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorOnCause_in_ruleInteractorBehaviorCause4777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorWhenCause_in_ruleInteractorBehaviorCause4804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorOnCause_in_entryRuleInteractorBehaviorOnCause4839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorBehaviorOnCause4849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleInteractorBehaviorOnCause4886 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_ruleInteractorSignalReception_in_ruleInteractorBehaviorOnCause4907 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleInteractorBehaviorOnCause4920 = new BitSet(new long[]{0x00040000C8000070L,0x0003FFFFFFFFA4C6L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleInteractorBehaviorOnCause4941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorWhenCause_in_entryRuleInteractorBehaviorWhenCause4979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorBehaviorWhenCause4989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleInteractorBehaviorWhenCause5026 = new BitSet(new long[]{0x00040000C8000070L,0x0003FFFFFFFFA4C6L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleInteractorBehaviorWhenCause5047 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleInteractorBehaviorWhenCause5060 = new BitSet(new long[]{0x00040000C8000070L,0x0003FFFFFFFFA4C6L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleInteractorBehaviorWhenCause5081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorEffect_in_entryRuleInteractorBehaviorEffect5119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorBehaviorEffect5129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorAlwaysEffect_in_ruleInteractorBehaviorEffect5176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorSetEffect_in_ruleInteractorBehaviorEffect5203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorTriggerEffect_in_ruleInteractorBehaviorEffect5230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorAlwaysEffect_in_entryRuleInteractorBehaviorAlwaysEffect5265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorBehaviorAlwaysEffect5275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleInteractorBehaviorAlwaysEffect5312 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInteractorSignalEmission_in_ruleInteractorBehaviorAlwaysEffect5333 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleInteractorBehaviorAlwaysEffect5345 = new BitSet(new long[]{0x00040000C8000070L,0x0003FFFFFFFFA4C6L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleInteractorBehaviorAlwaysEffect5366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorSetEffect_in_entryRuleInteractorBehaviorSetEffect5402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorBehaviorSetEffect5412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleInteractorBehaviorSetEffect5449 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInteractorSignalEmission_in_ruleInteractorBehaviorSetEffect5470 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleInteractorBehaviorSetEffect5482 = new BitSet(new long[]{0x00040000C8000070L,0x0003FFFFFFFFA4C6L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleInteractorBehaviorSetEffect5503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractorBehaviorTriggerEffect_in_entryRuleInteractorBehaviorTriggerEffect5539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteractorBehaviorTriggerEffect5549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleInteractorBehaviorTriggerEffect5586 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInteractorSignalEmission_in_ruleInteractorBehaviorTriggerEffect5607 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleInteractorBehaviorTriggerEffect5619 = new BitSet(new long[]{0x00040000C8000070L,0x0003FFFFFFFFA4C6L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleInteractorBehaviorTriggerEffect5640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression5676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression5686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionOr_in_ruleExpression5732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionOr_in_entryRuleExpressionOr5766 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionOr5776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionAnd_in_ruleExpressionOr5823 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleExpressionOrOp_in_ruleExpressionOr5872 = new BitSet(new long[]{0x00040000C8000070L,0x0003FFFFFFFFA4C6L});
    public static final BitSet FOLLOW_ruleExpressionAnd_in_ruleExpressionOr5895 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleExpressionOrOp_in_entryRuleExpressionOrOp5934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionOrOp5945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleExpressionOrOp5982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionAnd_in_entryRuleExpressionAnd6021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionAnd6031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionEquality_in_ruleExpressionAnd6078 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleExpressionAndOp_in_ruleExpressionAnd6127 = new BitSet(new long[]{0x00040000C8000070L,0x0003FFFFFFFFA4C6L});
    public static final BitSet FOLLOW_ruleExpressionEquality_in_ruleExpressionAnd6150 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleExpressionAndOp_in_entryRuleExpressionAndOp6189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionAndOp6200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleExpressionAndOp6237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionEquality_in_entryRuleExpressionEquality6276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionEquality6286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionCompare_in_ruleExpressionEquality6333 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_ruleExpressionEqualityOp_in_ruleExpressionEquality6382 = new BitSet(new long[]{0x00040000C8000070L,0x0003FFFFFFFFA4C6L});
    public static final BitSet FOLLOW_ruleExpressionCompare_in_ruleExpressionEquality6405 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_ruleExpressionEqualityOp_in_entryRuleExpressionEqualityOp6444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionEqualityOp6455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleExpressionEqualityOp6493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleExpressionEqualityOp6512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionCompare_in_entryRuleExpressionCompare6552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionCompare6562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionOther_in_ruleExpressionCompare6609 = new BitSet(new long[]{0x7800000000000002L});
    public static final BitSet FOLLOW_ruleExpressionCompareOp_in_ruleExpressionCompare6658 = new BitSet(new long[]{0x00040000C8000070L,0x0003FFFFFFFFA4C6L});
    public static final BitSet FOLLOW_ruleExpressionOther_in_ruleExpressionCompare6681 = new BitSet(new long[]{0x7800000000000002L});
    public static final BitSet FOLLOW_ruleExpressionCompareOp_in_entryRuleExpressionCompareOp6720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionCompareOp6731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleExpressionCompareOp6769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleExpressionCompareOp6788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleExpressionCompareOp6807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleExpressionCompareOp6826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionOther_in_entryRuleExpressionOther6866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionOther6876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionAddition_in_ruleExpressionOther6923 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpressionOtherOp_in_ruleExpressionOther6972 = new BitSet(new long[]{0x00040000C8000070L,0x0003FFFFFFFFA4C6L});
    public static final BitSet FOLLOW_ruleExpressionAddition_in_ruleExpressionOther6995 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpressionOtherOp_in_entryRuleExpressionOtherOp7034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionOtherOp7045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleExpressionOtherOp7083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleExpressionOtherOp7102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionAddition_in_entryRuleExpressionAddition7142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionAddition7152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionMultiplication_in_ruleExpressionAddition7199 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleExpressionAdditionOp_in_ruleExpressionAddition7248 = new BitSet(new long[]{0x00040000C8000070L,0x0003FFFFFFFFA4C6L});
    public static final BitSet FOLLOW_ruleExpressionMultiplication_in_ruleExpressionAddition7271 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleExpressionAdditionOp_in_entryRuleExpressionAdditionOp7310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionAdditionOp7321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleExpressionAdditionOp7359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleExpressionAdditionOp7378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionMultiplication_in_entryRuleExpressionMultiplication7418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionMultiplication7428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionUnary_in_ruleExpressionMultiplication7475 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000038L});
    public static final BitSet FOLLOW_ruleExpressionMultiplicationOp_in_ruleExpressionMultiplication7524 = new BitSet(new long[]{0x00040000C8000070L,0x0003FFFFFFFFA4C6L});
    public static final BitSet FOLLOW_ruleExpressionUnary_in_ruleExpressionMultiplication7547 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000038L});
    public static final BitSet FOLLOW_ruleExpressionMultiplicationOp_in_entryRuleExpressionMultiplicationOp7586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionMultiplicationOp7597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleExpressionMultiplicationOp7635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleExpressionMultiplicationOp7654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleExpressionMultiplicationOp7673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionUnary_in_entryRuleExpressionUnary7713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionUnary7723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionUnaryOp_in_ruleExpressionUnary7779 = new BitSet(new long[]{0x00040000C8000070L,0x0003FFFFFFFFA4C6L});
    public static final BitSet FOLLOW_ruleExpressionPrimary_in_ruleExpressionUnary7800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionPrimary_in_ruleExpressionUnary7829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionUnaryOp_in_entryRuleExpressionUnaryOp7865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionUnaryOp7876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleExpressionUnaryOp7914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleExpressionUnaryOp7933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleExpressionUnaryOp7952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionPrimary_in_entryRuleExpressionPrimary7992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionPrimary8002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionSwitch_in_ruleExpressionPrimary8049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionIf_in_ruleExpressionPrimary8076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionLiteral_in_ruleExpressionPrimary8103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionForEach_in_ruleExpressionPrimary8130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionFunctionCall_in_ruleExpressionPrimary8157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionParenthesized_in_ruleExpressionPrimary8184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionLiteral_in_entryRuleExpressionLiteral8219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionLiteral8229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionLiteralCollection_in_ruleExpressionLiteral8276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralBoolean_in_ruleExpressionLiteral8303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralNumber_in_ruleExpressionLiteral8330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralNull_in_ruleExpressionLiteral8357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralText_in_ruleExpressionLiteral8384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralTime_in_ruleExpressionLiteral8411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralEnum_in_ruleExpressionLiteral8438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpressionLiteral8473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionLiteralCollection_in_entryRuleExpressionLiteralCollection8510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionLiteralCollection8520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionLiteralSet_in_ruleExpressionLiteralCollection8567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionLiteralList_in_ruleExpressionLiteralCollection8594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionLiteralSet_in_entryRuleExpressionLiteralSet8629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionLiteralSet8639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleExpressionLiteralSet8685 = new BitSet(new long[]{0x00040000E8000070L,0x0003FFFFFFFFA4C6L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionLiteralSet8707 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleExpressionLiteralSet8720 = new BitSet(new long[]{0x00040000C8000070L,0x0003FFFFFFFFA4C6L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionLiteralSet8741 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_29_in_ruleExpressionLiteralSet8757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionLiteralList_in_entryRuleExpressionLiteralList8793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionLiteralList8803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleExpressionLiteralList8849 = new BitSet(new long[]{0x00040001C8000070L,0x0003FFFFFFFFA4C6L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionLiteralList8871 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_28_in_ruleExpressionLiteralList8884 = new BitSet(new long[]{0x00040000C8000070L,0x0003FFFFFFFFA4C6L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionLiteralList8905 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_32_in_ruleExpressionLiteralList8921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionParenthesized_in_entryRuleExpressionParenthesized8957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionParenthesized8967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleExpressionParenthesized9004 = new BitSet(new long[]{0x00040000C8000070L,0x0003FFFFFFFFA4C6L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionParenthesized9026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleExpressionParenthesized9037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionIf_in_entryRuleExpressionIf9073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionIf9083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleExpressionIf9129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleExpressionIf9141 = new BitSet(new long[]{0x00040000C8000070L,0x0003FFFFFFFFA4C6L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionIf9162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleExpressionIf9182 = new BitSet(new long[]{0x00040000C8000070L,0x0003FFFFFFFFA4C6L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionIf9204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleExpressionIf9225 = new BitSet(new long[]{0x00040000C8000070L,0x0003FFFFFFFFA4C6L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionIf9247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionSwitch_in_entryRuleExpressionSwitch9284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionSwitch9294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleExpressionSwitch9340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleExpressionSwitch9352 = new BitSet(new long[]{0x00040000C8000070L,0x0003FFFFFFFFA4C6L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionSwitch9373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleExpressionSwitch9393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleExpressionCase_in_ruleExpressionSwitch9425 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_75_in_ruleExpressionSwitch9447 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleExpressionSwitch9460 = new BitSet(new long[]{0x00040000C8000070L,0x0003FFFFFFFFA4C6L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionSwitch9481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionCase_in_entryRuleExpressionCase9519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionCase9529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleExpressionCase9566 = new BitSet(new long[]{0x00040000C8000070L,0x0003FFFFFFFFA4C6L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionCase9587 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleExpressionCase9599 = new BitSet(new long[]{0x00040000C8000070L,0x0003FFFFFFFFA4C6L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionCase9620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionForEach_in_entryRuleExpressionForEach9656 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionForEach9666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleExpressionForEach9712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleExpressionForEach9724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleExpressionForEach9736 = new BitSet(new long[]{0x00040000C8000070L,0x0003FFFFFFFFA4C6L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionForEach9757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleExpressionForEach9769 = new BitSet(new long[]{0x00040000C8000070L,0x0003FFFFFFFFA4C6L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionForEach9790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionFunctionCall_in_entryRuleExpressionFunctionCall9826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionFunctionCall9836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionFunctionCallBase_in_ruleExpressionFunctionCall9891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleExpressionFunctionCall9903 = new BitSet(new long[]{0x00040000D8000070L,0x0003FFFFFFFFA5C6L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionFunctionCall9924 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_28_in_ruleExpressionFunctionCall9938 = new BitSet(new long[]{0x00040000C8000070L,0x0003FFFFFFFFA4C6L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionFunctionCall9959 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleExpressionFunctionCall9973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionFunctionCallBase_in_entryRuleExpressionFunctionCallBase10010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionFunctionCallBase10021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleExpressionFunctionCallBase10059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleExpressionFunctionCallBase10078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleExpressionFunctionCallBase10097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleExpressionFunctionCallBase10116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleExpressionFunctionCallBase10135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleExpressionFunctionCallBase10154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleExpressionFunctionCallBase10173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleExpressionFunctionCallBase10192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleExpressionFunctionCallBase10211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleExpressionFunctionCallBase10230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleExpressionFunctionCallBase10249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleExpressionFunctionCallBase10268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleExpressionFunctionCallBase10287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleExpressionFunctionCallBase10306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleExpressionFunctionCallBase10325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleExpressionFunctionCallBase10344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleExpressionFunctionCallBase10363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleExpressionFunctionCallBase10382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleExpressionFunctionCallBase10401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleExpressionFunctionCallBase10420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleExpressionFunctionCallBase10439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleExpressionFunctionCallBase10458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleExpressionFunctionCallBase10477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleExpressionFunctionCallBase10496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleExpressionFunctionCallBase10515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleExpressionFunctionCallBase10534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleExpressionFunctionCallBase10553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleExpressionFunctionCallBase10572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleExpressionFunctionCallBase10591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleExpressionFunctionCallBase10610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleExpressionFunctionCallBase10629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean10669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralBoolean10679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleLiteralBoolean10726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleLiteralBoolean10750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralNull_in_entryRuleLiteralNull10800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralNull10810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleLiteralNull10856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralNumber_in_entryRuleLiteralNumber10892 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralNumber10902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralNumber10957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralText_in_entryRuleLiteralText10993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralText11003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteralText11054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralEnum_in_entryRuleLiteralEnum11095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralEnum11105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleLiteralEnum11151 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteralEnum11171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralTime_in_entryRuleLiteralTime11207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralTime11217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ruleLiteralTime11270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11322 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_ruleLiteralTime11334 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11357 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_ruleLiteralTime11369 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11393 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_ruleLiteralTime11405 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11429 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_ruleLiteralTime11441 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11465 = new BitSet(new long[]{0x0000000000000000L,0x00C0000000000000L});
    public static final BitSet FOLLOW_118_in_ruleLiteralTime11478 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_119_in_ruleLiteralTime11496 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11521 = new BitSet(new long[]{0x0000000000000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_120_in_ruleLiteralTime11534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleLiteralTime11552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11594 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_ruleLiteralTime11606 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11629 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_ruleLiteralTime11641 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11665 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_ruleLiteralTime11677 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11701 = new BitSet(new long[]{0x0000000000000000L,0x00C0000000000000L});
    public static final BitSet FOLLOW_118_in_ruleLiteralTime11714 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_119_in_ruleLiteralTime11732 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11757 = new BitSet(new long[]{0x0000000000000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_120_in_ruleLiteralTime11770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleLiteralTime11788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11830 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_ruleLiteralTime11842 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11865 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_ruleLiteralTime11877 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11901 = new BitSet(new long[]{0x0000000000000000L,0x00C0000000000000L});
    public static final BitSet FOLLOW_118_in_ruleLiteralTime11914 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_119_in_ruleLiteralTime11932 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime11957 = new BitSet(new long[]{0x0000000000000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_120_in_ruleLiteralTime11970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleLiteralTime11988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime12030 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_ruleLiteralTime12042 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime12065 = new BitSet(new long[]{0x0000000000000000L,0x00C0000000000000L});
    public static final BitSet FOLLOW_118_in_ruleLiteralTime12078 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_119_in_ruleLiteralTime12096 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime12121 = new BitSet(new long[]{0x0000000000000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_120_in_ruleLiteralTime12134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleLiteralTime12152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime12194 = new BitSet(new long[]{0x0000000000000000L,0x00C0000000000000L});
    public static final BitSet FOLLOW_118_in_ruleLiteralTime12207 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_119_in_ruleLiteralTime12225 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime12249 = new BitSet(new long[]{0x0000000000000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_120_in_ruleLiteralTime12262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleLiteralTime12280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLiteralTime12322 = new BitSet(new long[]{0x0000000000000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_120_in_ruleLiteralTime12335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleLiteralTime12353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_entryRuleNUMBER12393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER12404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER12444 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_ruleNUMBER12463 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER12478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred1_InternalLil1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred2_InternalLil1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred3_InternalLil1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred4_InternalLil1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionOrOp_in_synpred5_InternalLil5842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionAndOp_in_synpred6_InternalLil6097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionEqualityOp_in_synpred7_InternalLil6352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionCompareOp_in_synpred8_InternalLil6628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionOtherOp_in_synpred9_InternalLil6942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionAdditionOp_in_synpred10_InternalLil7218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionMultiplicationOp_in_synpred11_InternalLil7494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionCase_in_synpred15_InternalLil9408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_synpred16_InternalLil9439 = new BitSet(new long[]{0x0000000000000002L});

}