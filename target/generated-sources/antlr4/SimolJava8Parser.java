// Generated from SimolJava8Parser.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimolJava8Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CONTRACTS=61, THROW=44, STATIC=38, ABSTRACTION=53, INTERFACE=28, AND_ASSIGN=123, 
		BREAK=4, BYTE=5, ELSE=15, IF=22, ENUM=16, SUB=110, WORKER_AGENT=75, MODEL_REAL_WORLD_OBJ=56, 
		BANG=97, LPAREN=85, DOT=93, CASE=6, AT=131, LINE_COMMENT=135, StringLiteral=83, 
		ELLIPSIS=132, LBRACK=89, PUBLIC=35, THROWS=45, NullLiteral=84, RSHIFT_ASSIGN=128, 
		COMPAT_INTERF_VERSION=62, LBRACE=87, GOTO=23, SUB_ASSIGN=120, SEMI=91, 
		CHAR=8, COLONCOLON=118, ASSIGN=94, COMMENT=134, AGENT=78, IMPORT=25, ARROW=117, 
		BITOR=114, CATCH=7, MUL_ASSIGN=121, LONG_ACTION=69, DOUBLE=14, PROTECTED=34, 
		CAPACITY_INH=66, LONG=29, COMMA=92, BITAND=113, TOUR_MONITOR=72, PREVENT_MISSING_COLLISION=70, 
		MODEL=57, PRIVATE=33, CONTINUE=11, DIV=112, NATURE=60, UNDERST=68, SIMU_REAL_WORLD_OBJ=52, 
		FloatingPointLiteral=80, LE=102, FOR_EVERY_THREAD=73, CharacterLiteral=82, 
		VOLATILE=49, EXTENDS=17, INSTANCEOF=26, NEW=31, ADD=109, LT=96, CLASS=9, 
		DO=13, FINALLY=19, COMP_AS_WORKER=55, Identifier=130, CONST=10, PACKAGE=32, 
		OR_ASSIGN=124, TRY=47, IntegerLiteral=79, SYNCHRONIZED=42, MUL=111, INFORMATION=59, 
		FOR=21, FINAL=18, ONE_AT_A_TIME=71, RPAREN=86, CARET=115, URSHIFT_ASSIGN=129, 
		BOOLEAN=3, WITH_COMPAT=67, NOTEQUAL=104, RBRACK=90, INDEF_OBJ=58, RBRACE=88, 
		SIMU_AGENT=76, AND=105, THIS=43, SWITCH=41, VOID=48, TRANSIENT=46, INC=107, 
		FLOAT=20, NATIVE=30, DIV_ASSIGN=122, VERSION_INH=65, BooleanLiteral=81, 
		DEPENDENT_ACTIVITY=74, ABSTRACT=1, STRICTFP=39, INT=27, QUESTION=99, RETURN=36, 
		CLASS_FOR=51, LSHIFT_ASSIGN=127, ADD_ASSIGN=119, WS=133, GE=103, AGENT_ABSTRACTION=77, 
		SUPER=40, OR=106, DEC=108, MOD=116, XOR_ASSIGN=125, ASSERT=2, EQUAL=101, 
		IMPLEMENTS=24, COLON=100, GT=95, SHORT=37, SIMU_COMP_AS_WORKER=54, COMPAT_INTERF_CAPACITY=63, 
		MOD_ASSIGN=126, COMPAT_INTERF=64, WHILE=50, TILDE=98, DEFAULT=12;
	public static final String[] tokenNames = {
		"<INVALID>", "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", 
		"'case'", "'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
		"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
		"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
		"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
		"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
		"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
		"'transient'", "'try'", "'void'", "'volatile'", "'while'", "'class_for'", 
		"'simu_real_world_obj'", "'abstraction'", "'simu_comp_as_worker'", "'comp_as_worker'", 
		"'model_real_world_obj'", "'model'", "'indef_obj'", "'information'", "'nature'", 
		"'contracts'", "'compat_interf_version'", "'compat_interf_capacity'", 
		"'compat_interf'", "'version_inh'", "'capacity_inh'", "'with_compat'", 
		"'underst'", "'long_action'", "'prevent_missing_collision'", "'one_at_a_time'", 
		"'tour_monitor'", "'for_every_thread'", "'dependent_activity'", "'worker_agent'", 
		"'simu_agent'", "'agent_abstraction'", "'agent'", "IntegerLiteral", "FloatingPointLiteral", 
		"BooleanLiteral", "CharacterLiteral", "StringLiteral", "'null'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", 
		"'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", 
		"'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", 
		"'%'", "'->'", "'::'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", 
		"'^='", "'%='", "'<<='", "'>>='", "'>>>='", "Identifier", "'@'", "'...'", 
		"WS", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_literal = 0, RULE_primitiveType = 1, RULE_numericType = 2, RULE_integralType = 3, 
		RULE_floatingPointType = 4, RULE_referenceType = 5, RULE_classOrInterfaceType = 6, 
		RULE_classType = 7, RULE_classType_lf_classOrInterfaceType = 8, RULE_classType_lfno_classOrInterfaceType = 9, 
		RULE_interfaceType = 10, RULE_interfaceType_lf_classOrInterfaceType = 11, 
		RULE_interfaceType_lfno_classOrInterfaceType = 12, RULE_typeVariable = 13, 
		RULE_arrayType = 14, RULE_dims = 15, RULE_typeParameter = 16, RULE_typeParameterModifier = 17, 
		RULE_typeBound = 18, RULE_additionalBound = 19, RULE_typeArguments = 20, 
		RULE_typeArgumentList = 21, RULE_typeArgument = 22, RULE_wildcard = 23, 
		RULE_wildcardBounds = 24, RULE_packageName = 25, RULE_typeName = 26, RULE_packageOrTypeName = 27, 
		RULE_expressionName = 28, RULE_methodName = 29, RULE_ambiguousName = 30, 
		RULE_compilationUnit = 31, RULE_packageDeclaration = 32, RULE_packageModifier = 33, 
		RULE_importDeclaration = 34, RULE_singleTypeImportDeclaration = 35, RULE_typeImportOnDemandDeclaration = 36, 
		RULE_singleStaticImportDeclaration = 37, RULE_staticImportOnDemandDeclaration = 38, 
		RULE_typeDeclaration = 39, RULE_classDeclaration = 40, RULE_normalClassDeclaration = 41, 
		RULE_simolRole = 42, RULE_classModifier = 43, RULE_typeParameters = 44, 
		RULE_typeParameterList = 45, RULE_superclass = 46, RULE_superinterfaces = 47, 
		RULE_interfaceTypeList = 48, RULE_classBody = 49, RULE_classBodyDeclaration = 50, 
		RULE_classMemberDeclaration = 51, RULE_fieldDeclaration = 52, RULE_fieldModifier = 53, 
		RULE_variableDeclaratorList = 54, RULE_variableDeclarator = 55, RULE_variableDeclaratorId = 56, 
		RULE_variableInitializer = 57, RULE_unannType = 58, RULE_unannPrimitiveType = 59, 
		RULE_unannReferenceType = 60, RULE_unannClassOrInterfaceType = 61, RULE_unannClassType = 62, 
		RULE_unannClassType_lf_unannClassOrInterfaceType = 63, RULE_unannClassType_lfno_unannClassOrInterfaceType = 64, 
		RULE_unannInterfaceType = 65, RULE_unannInterfaceType_lf_unannClassOrInterfaceType = 66, 
		RULE_unannInterfaceType_lfno_unannClassOrInterfaceType = 67, RULE_unannTypeVariable = 68, 
		RULE_unannArrayType = 69, RULE_methodDeclaration = 70, RULE_methodModifier = 71, 
		RULE_methodHeader = 72, RULE_result = 73, RULE_methodDeclarator = 74, 
		RULE_formalParameterList = 75, RULE_formalParameters = 76, RULE_formalParameter = 77, 
		RULE_variableModifier = 78, RULE_lastFormalParameter = 79, RULE_receiverParameter = 80, 
		RULE_throws_ = 81, RULE_exceptionTypeList = 82, RULE_exceptionType = 83, 
		RULE_methodBody = 84, RULE_instanceInitializer = 85, RULE_staticInitializer = 86, 
		RULE_constructorDeclaration = 87, RULE_constructorModifier = 88, RULE_constructorDeclarator = 89, 
		RULE_simpleTypeName = 90, RULE_constructorBody = 91, RULE_explicitConstructorInvocation = 92, 
		RULE_enumDeclaration = 93, RULE_enumBody = 94, RULE_enumConstantList = 95, 
		RULE_enumConstant = 96, RULE_enumConstantModifier = 97, RULE_enumBodyDeclarations = 98, 
		RULE_interfaceDeclaration = 99, RULE_normalInterfaceDeclaration = 100, 
		RULE_simolInterfaceRole = 101, RULE_interfaceModifier = 102, RULE_extendsInterfaces = 103, 
		RULE_interfaceBody = 104, RULE_interfaceMemberDeclaration = 105, RULE_constantDeclaration = 106, 
		RULE_constantModifier = 107, RULE_interfaceMethodDeclaration = 108, RULE_interfaceMethodModifier = 109, 
		RULE_annotationTypeDeclaration = 110, RULE_annotationTypeBody = 111, RULE_annotationTypeMemberDeclaration = 112, 
		RULE_annotationTypeElementDeclaration = 113, RULE_annotationTypeElementModifier = 114, 
		RULE_defaultValue = 115, RULE_annotation = 116, RULE_normalAnnotation = 117, 
		RULE_elementValuePairList = 118, RULE_elementValuePair = 119, RULE_elementValue = 120, 
		RULE_elementValueArrayInitializer = 121, RULE_elementValueList = 122, 
		RULE_markerAnnotation = 123, RULE_singleElementAnnotation = 124, RULE_arrayInitializer = 125, 
		RULE_variableInitializerList = 126, RULE_block = 127, RULE_blockStatements = 128, 
		RULE_blockStatement = 129, RULE_localVariableDeclarationStatement = 130, 
		RULE_localVariableDeclaration = 131, RULE_statement = 132, RULE_statementNoShortIf = 133, 
		RULE_statementWithoutTrailingSubstatement = 134, RULE_emptyStatement_ = 135, 
		RULE_labeledStatement = 136, RULE_labeledStatementNoShortIf = 137, RULE_expressionStatement = 138, 
		RULE_statementExpression = 139, RULE_ifThenStatement = 140, RULE_ifThenElseStatement = 141, 
		RULE_ifThenElseStatementNoShortIf = 142, RULE_assertStatement = 143, RULE_switchStatement = 144, 
		RULE_switchBlock = 145, RULE_switchBlockStatementGroup = 146, RULE_switchLabels = 147, 
		RULE_switchLabel = 148, RULE_enumConstantName = 149, RULE_whileStatement = 150, 
		RULE_whileStatementNoShortIf = 151, RULE_doStatement = 152, RULE_forStatement = 153, 
		RULE_forStatementNoShortIf = 154, RULE_basicForStatement = 155, RULE_basicForStatementNoShortIf = 156, 
		RULE_forInit = 157, RULE_forUpdate = 158, RULE_statementExpressionList = 159, 
		RULE_enhancedForStatement = 160, RULE_enhancedForStatementNoShortIf = 161, 
		RULE_breakStatement = 162, RULE_continueStatement = 163, RULE_returnStatement = 164, 
		RULE_throwStatement = 165, RULE_synchronizedStatement = 166, RULE_tryStatement = 167, 
		RULE_catches = 168, RULE_catchClause = 169, RULE_catchFormalParameter = 170, 
		RULE_catchType = 171, RULE_finally_ = 172, RULE_tryWithResourcesStatement = 173, 
		RULE_resourceSpecification = 174, RULE_resourceList = 175, RULE_resource = 176, 
		RULE_primary = 177, RULE_primaryNoNewArray = 178, RULE_primaryNoNewArray_lf_arrayAccess = 179, 
		RULE_primaryNoNewArray_lfno_arrayAccess = 180, RULE_primaryNoNewArray_lf_primary = 181, 
		RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary = 182, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary = 183, 
		RULE_primaryNoNewArray_lfno_primary = 184, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary = 185, 
		RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary = 186, 
		RULE_classInstanceCreationExpression = 187, RULE_classInstanceCreationExpression_lf_primary = 188, 
		RULE_classInstanceCreationExpression_lfno_primary = 189, RULE_typeArgumentsOrDiamond = 190, 
		RULE_fieldAccess = 191, RULE_fieldAccess_lf_primary = 192, RULE_fieldAccess_lfno_primary = 193, 
		RULE_arrayAccess = 194, RULE_arrayAccess_lf_primary = 195, RULE_arrayAccess_lfno_primary = 196, 
		RULE_methodInvocation = 197, RULE_methodInvocation_lf_primary = 198, RULE_methodInvocation_lfno_primary = 199, 
		RULE_argumentList = 200, RULE_methodReference = 201, RULE_methodReference_lf_primary = 202, 
		RULE_methodReference_lfno_primary = 203, RULE_arrayCreationExpression = 204, 
		RULE_dimExprs = 205, RULE_dimExpr = 206, RULE_constantExpression = 207, 
		RULE_expression = 208, RULE_lambdaExpression = 209, RULE_lambdaParameters = 210, 
		RULE_inferredFormalParameterList = 211, RULE_lambdaBody = 212, RULE_assignmentExpression = 213, 
		RULE_assignment = 214, RULE_leftHandSide = 215, RULE_assignmentOperator = 216, 
		RULE_conditionalExpression = 217, RULE_conditionalOrExpression = 218, 
		RULE_conditionalAndExpression = 219, RULE_inclusiveOrExpression = 220, 
		RULE_exclusiveOrExpression = 221, RULE_andExpression = 222, RULE_equalityExpression = 223, 
		RULE_relationalExpression = 224, RULE_shiftExpression = 225, RULE_additiveExpression = 226, 
		RULE_multiplicativeExpression = 227, RULE_unaryExpression = 228, RULE_preIncrementExpression = 229, 
		RULE_preDecrementExpression = 230, RULE_unaryExpressionNotPlusMinus = 231, 
		RULE_postfixExpression = 232, RULE_postIncrementExpression = 233, RULE_postIncrementExpression_lf_postfixExpression = 234, 
		RULE_postDecrementExpression = 235, RULE_postDecrementExpression_lf_postfixExpression = 236, 
		RULE_castExpression = 237;
	public static final String[] ruleNames = {
		"literal", "primitiveType", "numericType", "integralType", "floatingPointType", 
		"referenceType", "classOrInterfaceType", "classType", "classType_lf_classOrInterfaceType", 
		"classType_lfno_classOrInterfaceType", "interfaceType", "interfaceType_lf_classOrInterfaceType", 
		"interfaceType_lfno_classOrInterfaceType", "typeVariable", "arrayType", 
		"dims", "typeParameter", "typeParameterModifier", "typeBound", "additionalBound", 
		"typeArguments", "typeArgumentList", "typeArgument", "wildcard", "wildcardBounds", 
		"packageName", "typeName", "packageOrTypeName", "expressionName", "methodName", 
		"ambiguousName", "compilationUnit", "packageDeclaration", "packageModifier", 
		"importDeclaration", "singleTypeImportDeclaration", "typeImportOnDemandDeclaration", 
		"singleStaticImportDeclaration", "staticImportOnDemandDeclaration", "typeDeclaration", 
		"classDeclaration", "normalClassDeclaration", "simolRole", "classModifier", 
		"typeParameters", "typeParameterList", "superclass", "superinterfaces", 
		"interfaceTypeList", "classBody", "classBodyDeclaration", "classMemberDeclaration", 
		"fieldDeclaration", "fieldModifier", "variableDeclaratorList", "variableDeclarator", 
		"variableDeclaratorId", "variableInitializer", "unannType", "unannPrimitiveType", 
		"unannReferenceType", "unannClassOrInterfaceType", "unannClassType", "unannClassType_lf_unannClassOrInterfaceType", 
		"unannClassType_lfno_unannClassOrInterfaceType", "unannInterfaceType", 
		"unannInterfaceType_lf_unannClassOrInterfaceType", "unannInterfaceType_lfno_unannClassOrInterfaceType", 
		"unannTypeVariable", "unannArrayType", "methodDeclaration", "methodModifier", 
		"methodHeader", "result", "methodDeclarator", "formalParameterList", "formalParameters", 
		"formalParameter", "variableModifier", "lastFormalParameter", "receiverParameter", 
		"throws_", "exceptionTypeList", "exceptionType", "methodBody", "instanceInitializer", 
		"staticInitializer", "constructorDeclaration", "constructorModifier", 
		"constructorDeclarator", "simpleTypeName", "constructorBody", "explicitConstructorInvocation", 
		"enumDeclaration", "enumBody", "enumConstantList", "enumConstant", "enumConstantModifier", 
		"enumBodyDeclarations", "interfaceDeclaration", "normalInterfaceDeclaration", 
		"simolInterfaceRole", "interfaceModifier", "extendsInterfaces", "interfaceBody", 
		"interfaceMemberDeclaration", "constantDeclaration", "constantModifier", 
		"interfaceMethodDeclaration", "interfaceMethodModifier", "annotationTypeDeclaration", 
		"annotationTypeBody", "annotationTypeMemberDeclaration", "annotationTypeElementDeclaration", 
		"annotationTypeElementModifier", "defaultValue", "annotation", "normalAnnotation", 
		"elementValuePairList", "elementValuePair", "elementValue", "elementValueArrayInitializer", 
		"elementValueList", "markerAnnotation", "singleElementAnnotation", "arrayInitializer", 
		"variableInitializerList", "block", "blockStatements", "blockStatement", 
		"localVariableDeclarationStatement", "localVariableDeclaration", "statement", 
		"statementNoShortIf", "statementWithoutTrailingSubstatement", "emptyStatement_", 
		"labeledStatement", "labeledStatementNoShortIf", "expressionStatement", 
		"statementExpression", "ifThenStatement", "ifThenElseStatement", "ifThenElseStatementNoShortIf", 
		"assertStatement", "switchStatement", "switchBlock", "switchBlockStatementGroup", 
		"switchLabels", "switchLabel", "enumConstantName", "whileStatement", "whileStatementNoShortIf", 
		"doStatement", "forStatement", "forStatementNoShortIf", "basicForStatement", 
		"basicForStatementNoShortIf", "forInit", "forUpdate", "statementExpressionList", 
		"enhancedForStatement", "enhancedForStatementNoShortIf", "breakStatement", 
		"continueStatement", "returnStatement", "throwStatement", "synchronizedStatement", 
		"tryStatement", "catches", "catchClause", "catchFormalParameter", "catchType", 
		"finally_", "tryWithResourcesStatement", "resourceSpecification", "resourceList", 
		"resource", "primary", "primaryNoNewArray", "primaryNoNewArray_lf_arrayAccess", 
		"primaryNoNewArray_lfno_arrayAccess", "primaryNoNewArray_lf_primary", 
		"primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary", "primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary", 
		"primaryNoNewArray_lfno_primary", "primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary", 
		"primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary", "classInstanceCreationExpression", 
		"classInstanceCreationExpression_lf_primary", "classInstanceCreationExpression_lfno_primary", 
		"typeArgumentsOrDiamond", "fieldAccess", "fieldAccess_lf_primary", "fieldAccess_lfno_primary", 
		"arrayAccess", "arrayAccess_lf_primary", "arrayAccess_lfno_primary", "methodInvocation", 
		"methodInvocation_lf_primary", "methodInvocation_lfno_primary", "argumentList", 
		"methodReference", "methodReference_lf_primary", "methodReference_lfno_primary", 
		"arrayCreationExpression", "dimExprs", "dimExpr", "constantExpression", 
		"expression", "lambdaExpression", "lambdaParameters", "inferredFormalParameterList", 
		"lambdaBody", "assignmentExpression", "assignment", "leftHandSide", "assignmentOperator", 
		"conditionalExpression", "conditionalOrExpression", "conditionalAndExpression", 
		"inclusiveOrExpression", "exclusiveOrExpression", "andExpression", "equalityExpression", 
		"relationalExpression", "shiftExpression", "additiveExpression", "multiplicativeExpression", 
		"unaryExpression", "preIncrementExpression", "preDecrementExpression", 
		"unaryExpressionNotPlusMinus", "postfixExpression", "postIncrementExpression", 
		"postIncrementExpression_lf_postfixExpression", "postDecrementExpression", 
		"postDecrementExpression_lf_postfixExpression", "castExpression"
	};

	@Override
	public String getGrammarFileName() { return "SimolJava8Parser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimolJava8Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(SimolJava8Parser.StringLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(SimolJava8Parser.NullLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(SimolJava8Parser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(SimolJava8Parser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(SimolJava8Parser.BooleanLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(SimolJava8Parser.CharacterLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primitiveType);
		int _la;
		try {
			setState(492);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(478); annotation();
					}
					}
					setState(483);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(484); numericType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(485); annotation();
					}
					}
					setState(490);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(491); match(BOOLEAN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericTypeContext extends ParserRuleContext {
		public IntegralTypeContext integralType() {
			return getRuleContext(IntegralTypeContext.class,0);
		}
		public FloatingPointTypeContext floatingPointType() {
			return getRuleContext(FloatingPointTypeContext.class,0);
		}
		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterNumericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitNumericType(this);
		}
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_numericType);
		try {
			setState(496);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(494); integralType();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(495); floatingPointType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegralTypeContext extends ParserRuleContext {
		public IntegralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integralType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterIntegralType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitIntegralType(this);
		}
	}

	public final IntegralTypeContext integralType() throws RecognitionException {
		IntegralTypeContext _localctx = new IntegralTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_integralType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatingPointTypeContext extends ParserRuleContext {
		public FloatingPointTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterFloatingPointType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitFloatingPointType(this);
		}
	}

	public final FloatingPointTypeContext floatingPointType() throws RecognitionException {
		FloatingPointTypeContext _localctx = new FloatingPointTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_floatingPointType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceTypeContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitReferenceType(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_referenceType);
		try {
			setState(505);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(502); classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(503); typeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(504); arrayType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<InterfaceType_lf_classOrInterfaceTypeContext> interfaceType_lf_classOrInterfaceType() {
			return getRuleContexts(InterfaceType_lf_classOrInterfaceTypeContext.class);
		}
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType(int i) {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,i);
		}
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() {
			return getRuleContext(InterfaceType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public List<ClassType_lf_classOrInterfaceTypeContext> classType_lf_classOrInterfaceType() {
			return getRuleContexts(ClassType_lf_classOrInterfaceTypeContext.class);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType(int i) {
			return getRuleContext(InterfaceType_lf_classOrInterfaceTypeContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(507); classType_lfno_classOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(508); interfaceType_lfno_classOrInterfaceType();
				}
				break;
			}
			setState(515);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(513);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(511); classType_lf_classOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(512); interfaceType_lf_classOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(517);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitClassType(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classType);
		int _la;
		try {
			setState(540);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(518); annotation();
					}
					}
					setState(523);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(524); match(Identifier);
				setState(526);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(525); typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(528); classOrInterfaceType();
				setState(529); match(DOT);
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(530); annotation();
					}
					}
					setState(535);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(536); match(Identifier);
				setState(538);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(537); typeArguments();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ClassType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterClassType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitClassType_lf_classOrInterfaceType(this);
		}
	}

	public final ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() throws RecognitionException {
		ClassType_lf_classOrInterfaceTypeContext _localctx = new ClassType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classType_lf_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542); match(DOT);
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(543); annotation();
				}
				}
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(549); match(Identifier);
			setState(551);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(550); typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ClassType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterClassType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitClassType_lfno_classOrInterfaceType(this);
		}
	}

	public final ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() throws RecognitionException {
		ClassType_lfno_classOrInterfaceTypeContext _localctx = new ClassType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classType_lfno_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(553); annotation();
				}
				}
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(559); match(Identifier);
			setState(561);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(560); typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitInterfaceType(this);
		}
	}

	public final InterfaceTypeContext interfaceType() throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_interfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563); classType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterInterfaceType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitInterfaceType_lf_classOrInterfaceType(this);
		}
	}

	public final InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lf_classOrInterfaceTypeContext _localctx = new InterfaceType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_interfaceType_lf_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565); classType_lf_classOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterInterfaceType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitInterfaceType_lfno_classOrInterfaceType(this);
		}
	}

	public final InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lfno_classOrInterfaceTypeContext _localctx = new InterfaceType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interfaceType_lfno_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567); classType_lfno_classOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitTypeVariable(this);
		}
	}

	public final TypeVariableContext typeVariable() throws RecognitionException {
		TypeVariableContext _localctx = new TypeVariableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(569); annotation();
				}
				}
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(575); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arrayType);
		try {
			setState(586);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(577); primitiveType();
				setState(578); dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(580); classOrInterfaceType();
				setState(581); dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(583); typeVariable();
				setState(584); dims();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimsContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitDims(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dims);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(588); annotation();
				}
				}
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(594); match(LBRACK);
			setState(595); match(RBRACK);
			setState(606);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(599);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(596); annotation();
						}
						}
						setState(601);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(602); match(LBRACK);
					setState(603); match(RBRACK);
					}
					} 
				}
				setState(608);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public List<TypeParameterModifierContext> typeParameterModifier() {
			return getRuleContexts(TypeParameterModifierContext.class);
		}
		public TypeParameterModifierContext typeParameterModifier(int i) {
			return getRuleContext(TypeParameterModifierContext.class,i);
		}
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(609); typeParameterModifier();
				}
				}
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(615); match(Identifier);
			setState(617);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(616); typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TypeParameterModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterTypeParameterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitTypeParameterModifier(this);
		}
	}

	public final TypeParameterModifierContext typeParameterModifier() throws RecognitionException {
		TypeParameterModifierContext _localctx = new TypeParameterModifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeParameterModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619); annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitTypeBound(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeBound);
		int _la;
		try {
			setState(631);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(621); match(EXTENDS);
				setState(622); typeVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(623); match(EXTENDS);
				setState(624); classOrInterfaceType();
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(625); additionalBound();
					}
					}
					setState(630);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditionalBoundContext extends ParserRuleContext {
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public AdditionalBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionalBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterAdditionalBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitAdditionalBound(this);
		}
	}

	public final AdditionalBoundContext additionalBound() throws RecognitionException {
		AdditionalBoundContext _localctx = new AdditionalBoundContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_additionalBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633); match(BITAND);
			setState(634); interfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636); match(LT);
			setState(637); typeArgumentList();
			setState(638); match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentListContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterTypeArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitTypeArgumentList(this);
		}
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640); typeArgument();
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(641); match(COMMA);
				setState(642); typeArgument();
				}
				}
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public WildcardContext wildcard() {
			return getRuleContext(WildcardContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeArgument);
		try {
			setState(650);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(648); referenceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(649); wildcard();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardContext extends ParserRuleContext {
		public WildcardBoundsContext wildcardBounds() {
			return getRuleContext(WildcardBoundsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public WildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitWildcard(this);
		}
	}

	public final WildcardContext wildcard() throws RecognitionException {
		WildcardContext _localctx = new WildcardContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_wildcard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(652); annotation();
				}
				}
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(658); match(QUESTION);
			setState(660);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==SUPER) {
				{
				setState(659); wildcardBounds();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardBoundsContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public WildcardBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterWildcardBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitWildcardBounds(this);
		}
	}

	public final WildcardBoundsContext wildcardBounds() throws RecognitionException {
		WildcardBoundsContext _localctx = new WildcardBoundsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_wildcardBounds);
		try {
			setState(666);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(662); match(EXTENDS);
				setState(663); referenceType();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(664); match(SUPER);
				setState(665); referenceType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPackageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPackageName(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		return packageName(0);
	}

	private PackageNameContext packageName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageNameContext _localctx = new PackageNameContext(_ctx, _parentState);
		PackageNameContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_packageName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(669); match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(676);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageName);
					setState(671);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(672); match(DOT);
					setState(673); match(Identifier);
					}
					} 
				}
				setState(678);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_typeName);
		try {
			setState(684);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(679); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(680); packageOrTypeName(0);
				setState(681); match(DOT);
				setState(682); match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public PackageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageOrTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPackageOrTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPackageOrTypeName(this);
		}
	}

	public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
		return packageOrTypeName(0);
	}

	private PackageOrTypeNameContext packageOrTypeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, _parentState);
		PackageOrTypeNameContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_packageOrTypeName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(687); match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(694);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageOrTypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageOrTypeName);
					setState(689);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(690); match(DOT);
					setState(691); match(Identifier);
					}
					} 
				}
				setState(696);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public ExpressionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterExpressionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitExpressionName(this);
		}
	}

	public final ExpressionNameContext expressionName() throws RecognitionException {
		ExpressionNameContext _localctx = new ExpressionNameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expressionName);
		try {
			setState(702);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(697); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(698); ambiguousName(0);
				setState(699); match(DOT);
				setState(700); match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitMethodName(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmbiguousNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public AmbiguousNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambiguousName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterAmbiguousName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitAmbiguousName(this);
		}
	}

	public final AmbiguousNameContext ambiguousName() throws RecognitionException {
		return ambiguousName(0);
	}

	private AmbiguousNameContext ambiguousName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AmbiguousNameContext _localctx = new AmbiguousNameContext(_ctx, _parentState);
		AmbiguousNameContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_ambiguousName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(707); match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(714);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AmbiguousNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ambiguousName);
					setState(709);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(710); match(DOT);
					setState(711); match(Identifier);
					}
					} 
				}
				setState(716);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public TerminalNode EOF() { return getToken(SimolJava8Parser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(717); packageDeclaration();
				}
				break;
			}
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(720); importDeclaration();
				}
				}
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ENUM) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << CLASS_FOR) | (1L << SIMU_REAL_WORLD_OBJ) | (1L << ABSTRACTION) | (1L << SIMU_COMP_AS_WORKER) | (1L << COMP_AS_WORKER) | (1L << MODEL_REAL_WORLD_OBJ) | (1L << MODEL) | (1L << INDEF_OBJ) | (1L << INFORMATION) | (1L << COMPAT_INTERF_VERSION) | (1L << COMPAT_INTERF_CAPACITY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (COMPAT_INTERF - 64)) | (1L << (VERSION_INH - 64)) | (1L << (CAPACITY_INH - 64)) | (1L << (WORKER_AGENT - 64)) | (1L << (SIMU_AGENT - 64)) | (1L << (AGENT_ABSTRACTION - 64)) | (1L << (AGENT - 64)) | (1L << (SEMI - 64)))) != 0) || _la==AT) {
				{
				{
				setState(726); typeDeclaration();
				}
				}
				setState(731);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(732); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public List<PackageModifierContext> packageModifier() {
			return getRuleContexts(PackageModifierContext.class);
		}
		public PackageModifierContext packageModifier(int i) {
			return getRuleContext(PackageModifierContext.class,i);
		}
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(734); packageModifier();
				}
				}
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(740); match(PACKAGE);
			setState(741); packageName(0);
			setState(742); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public PackageModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPackageModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPackageModifier(this);
		}
	}

	public final PackageModifierContext packageModifier() throws RecognitionException {
		PackageModifierContext _localctx = new PackageModifierContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_packageModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744); annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public SingleStaticImportDeclarationContext singleStaticImportDeclaration() {
			return getRuleContext(SingleStaticImportDeclarationContext.class,0);
		}
		public StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() {
			return getRuleContext(StaticImportOnDemandDeclarationContext.class,0);
		}
		public SingleTypeImportDeclarationContext singleTypeImportDeclaration() {
			return getRuleContext(SingleTypeImportDeclarationContext.class,0);
		}
		public TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() {
			return getRuleContext(TypeImportOnDemandDeclarationContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_importDeclaration);
		try {
			setState(750);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(746); singleTypeImportDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(747); typeImportOnDemandDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(748); singleStaticImportDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(749); staticImportOnDemandDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTypeImportDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public SingleTypeImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTypeImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterSingleTypeImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitSingleTypeImportDeclaration(this);
		}
	}

	public final SingleTypeImportDeclarationContext singleTypeImportDeclaration() throws RecognitionException {
		SingleTypeImportDeclarationContext _localctx = new SingleTypeImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_singleTypeImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752); match(IMPORT);
			setState(753); typeName();
			setState(754); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeImportOnDemandDeclarationContext extends ParserRuleContext {
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TypeImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterTypeImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitTypeImportOnDemandDeclaration(this);
		}
	}

	public final TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() throws RecognitionException {
		TypeImportOnDemandDeclarationContext _localctx = new TypeImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typeImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756); match(IMPORT);
			setState(757); packageOrTypeName(0);
			setState(758); match(DOT);
			setState(759); match(MUL);
			setState(760); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleStaticImportDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public SingleStaticImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStaticImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterSingleStaticImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitSingleStaticImportDeclaration(this);
		}
	}

	public final SingleStaticImportDeclarationContext singleStaticImportDeclaration() throws RecognitionException {
		SingleStaticImportDeclarationContext _localctx = new SingleStaticImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_singleStaticImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762); match(IMPORT);
			setState(763); match(STATIC);
			setState(764); typeName();
			setState(765); match(DOT);
			setState(766); match(Identifier);
			setState(767); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticImportOnDemandDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StaticImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterStaticImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitStaticImportOnDemandDeclaration(this);
		}
	}

	public final StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() throws RecognitionException {
		StaticImportOnDemandDeclarationContext _localctx = new StaticImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_staticImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769); match(IMPORT);
			setState(770); match(STATIC);
			setState(771); typeName();
			setState(772); match(DOT);
			setState(773); match(MUL);
			setState(774); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_typeDeclaration);
		try {
			setState(779);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(776); classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(777); interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(778); match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_classDeclaration);
		try {
			setState(783);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(781); normalClassDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(782); enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public SuperclassContext superclass() {
			return getRuleContext(SuperclassContext.class,0);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public SimolRoleContext simolRole() {
			return getRuleContext(SimolRoleContext.class,0);
		}
		public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterNormalClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitNormalClassDeclaration(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(785); classModifier();
				}
				}
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(792);
			_la = _input.LA(1);
			if (_la==CLASS_FOR) {
				{
				setState(791); match(CLASS_FOR);
				}
			}

			setState(794); simolRole();
			setState(795); match(Identifier);
			setState(797);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(796); typeParameters();
				}
			}

			setState(800);
			_la = _input.LA(1);
			if (_la==NATURE) {
				{
				setState(799); superclass();
				}
			}

			setState(803);
			_la = _input.LA(1);
			if (_la==CONTRACTS) {
				{
				setState(802); superinterfaces();
				}
			}

			setState(805); classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimolRoleContext extends ParserRuleContext {
		public SimolRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simolRole; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterSimolRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitSimolRole(this);
		}
	}

	public final SimolRoleContext simolRole() throws RecognitionException {
		SimolRoleContext _localctx = new SimolRoleContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_simolRole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (SIMU_REAL_WORLD_OBJ - 52)) | (1L << (ABSTRACTION - 52)) | (1L << (SIMU_COMP_AS_WORKER - 52)) | (1L << (COMP_AS_WORKER - 52)) | (1L << (MODEL_REAL_WORLD_OBJ - 52)) | (1L << (MODEL - 52)) | (1L << (INDEF_OBJ - 52)) | (1L << (INFORMATION - 52)) | (1L << (WORKER_AGENT - 52)) | (1L << (SIMU_AGENT - 52)) | (1L << (AGENT_ABSTRACTION - 52)) | (1L << (AGENT - 52)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterClassModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitClassModifier(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_classModifier);
		try {
			setState(817);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(809); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(810); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(811); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(812); match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(813); match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(814); match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(815); match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(816); match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819); match(LT);
			setState(820); typeParameterList();
			setState(821); match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterListContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitTypeParameterList(this);
		}
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823); typeParameter();
			setState(828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(824); match(COMMA);
				setState(825); typeParameter();
				}
				}
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperclassContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public SuperclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterSuperclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitSuperclass(this);
		}
	}

	public final SuperclassContext superclass() throws RecognitionException {
		SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_superclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831); match(NATURE);
			setState(832); classType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperinterfacesContext extends ParserRuleContext {
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public SuperinterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superinterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterSuperinterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitSuperinterfaces(this);
		}
	}

	public final SuperinterfacesContext superinterfaces() throws RecognitionException {
		SuperinterfacesContext _localctx = new SuperinterfacesContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_superinterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834); match(CONTRACTS);
			setState(835); interfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeListContext extends ParserRuleContext {
		public List<InterfaceTypeContext> interfaceType() {
			return getRuleContexts(InterfaceTypeContext.class);
		}
		public InterfaceTypeContext interfaceType(int i) {
			return getRuleContext(InterfaceTypeContext.class,i);
		}
		public InterfaceTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterInterfaceTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitInterfaceTypeList(this);
		}
	}

	public final InterfaceTypeListContext interfaceTypeList() throws RecognitionException {
		InterfaceTypeListContext _localctx = new InterfaceTypeListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_interfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837); interfaceType();
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(838); match(COMMA);
				setState(839); interfaceType();
				}
				}
				setState(844);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845); match(LBRACE);
			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << CLASS_FOR) | (1L << SIMU_REAL_WORLD_OBJ) | (1L << ABSTRACTION) | (1L << SIMU_COMP_AS_WORKER) | (1L << COMP_AS_WORKER) | (1L << MODEL_REAL_WORLD_OBJ) | (1L << MODEL) | (1L << INDEF_OBJ) | (1L << INFORMATION) | (1L << COMPAT_INTERF_VERSION) | (1L << COMPAT_INTERF_CAPACITY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (COMPAT_INTERF - 64)) | (1L << (VERSION_INH - 64)) | (1L << (CAPACITY_INH - 64)) | (1L << (WITH_COMPAT - 64)) | (1L << (UNDERST - 64)) | (1L << (LONG_ACTION - 64)) | (1L << (PREVENT_MISSING_COLLISION - 64)) | (1L << (ONE_AT_A_TIME - 64)) | (1L << (TOUR_MONITOR - 64)) | (1L << (FOR_EVERY_THREAD - 64)) | (1L << (DEPENDENT_ACTIVITY - 64)) | (1L << (WORKER_AGENT - 64)) | (1L << (SIMU_AGENT - 64)) | (1L << (AGENT_ABSTRACTION - 64)) | (1L << (AGENT - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)))) != 0) || _la==Identifier || _la==AT) {
				{
				{
				setState(846); classBodyDeclaration();
				}
				}
				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(852); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ClassMemberDeclarationContext classMemberDeclaration() {
			return getRuleContext(ClassMemberDeclarationContext.class,0);
		}
		public StaticInitializerContext staticInitializer() {
			return getRuleContext(StaticInitializerContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public InstanceInitializerContext instanceInitializer() {
			return getRuleContext(InstanceInitializerContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_classBodyDeclaration);
		try {
			setState(858);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(854); classMemberDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(855); instanceInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(856); staticInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(857); constructorDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterClassMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitClassMemberDeclaration(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_classMemberDeclaration);
		try {
			setState(865);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(860); fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(861); methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(862); classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(863); interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(864); match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public List<FieldModifierContext> fieldModifier() {
			return getRuleContexts(FieldModifierContext.class);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public FieldModifierContext fieldModifier(int i) {
			return getRuleContext(FieldModifierContext.class,i);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (FINAL - 18)) | (1L << (PRIVATE - 18)) | (1L << (PROTECTED - 18)) | (1L << (PUBLIC - 18)) | (1L << (STATIC - 18)) | (1L << (TRANSIENT - 18)) | (1L << (VOLATILE - 18)) | (1L << (WITH_COMPAT - 18)) | (1L << (TOUR_MONITOR - 18)) | (1L << (FOR_EVERY_THREAD - 18)))) != 0) || _la==AT) {
				{
				{
				setState(867); fieldModifier();
				}
				}
				setState(872);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(873); unannType();
			setState(874); variableDeclaratorList();
			setState(875); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterFieldModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitFieldModifier(this);
		}
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_fieldModifier);
		try {
			setState(888);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(877); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(878); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(879); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(880); match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(881); match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(882); match(FINAL);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(883); match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 8);
				{
				setState(884); match(VOLATILE);
				}
				break;
			case WITH_COMPAT:
				enterOuterAlt(_localctx, 9);
				{
				setState(885); match(WITH_COMPAT);
				}
				break;
			case TOUR_MONITOR:
				enterOuterAlt(_localctx, 10);
				{
				setState(886); match(TOUR_MONITOR);
				}
				break;
			case FOR_EVERY_THREAD:
				enterOuterAlt(_localctx, 11);
				{
				setState(887); match(FOR_EVERY_THREAD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorListContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterVariableDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitVariableDeclaratorList(this);
		}
	}

	public final VariableDeclaratorListContext variableDeclaratorList() throws RecognitionException {
		VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_variableDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890); variableDeclarator();
			setState(895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(891); match(COMMA);
				setState(892); variableDeclarator();
				}
				}
				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898); variableDeclaratorId();
			setState(901);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(899); match(ASSIGN);
				setState(900); variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903); match(Identifier);
			setState(905);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(904); dims();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_variableInitializer);
		try {
			setState(909);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(907); expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(908); arrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannTypeContext extends ParserRuleContext {
		public UnannReferenceTypeContext unannReferenceType() {
			return getRuleContext(UnannReferenceTypeContext.class,0);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public UnannTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterUnannType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitUnannType(this);
		}
	}

	public final UnannTypeContext unannType() throws RecognitionException {
		UnannTypeContext _localctx = new UnannTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_unannType);
		try {
			setState(913);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(911); unannPrimitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(912); unannReferenceType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannPrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public UnannPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannPrimitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterUnannPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitUnannPrimitiveType(this);
		}
	}

	public final UnannPrimitiveTypeContext unannPrimitiveType() throws RecognitionException {
		UnannPrimitiveTypeContext _localctx = new UnannPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_unannPrimitiveType);
		try {
			setState(917);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(915); numericType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(916); match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannReferenceTypeContext extends ParserRuleContext {
		public UnannArrayTypeContext unannArrayType() {
			return getRuleContext(UnannArrayTypeContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannReferenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterUnannReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitUnannReferenceType(this);
		}
	}

	public final UnannReferenceTypeContext unannReferenceType() throws RecognitionException {
		UnannReferenceTypeContext _localctx = new UnannReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_unannReferenceType);
		try {
			setState(922);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(919); unannClassOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(920); unannTypeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(921); unannArrayType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public List<UnannInterfaceType_lf_unannClassOrInterfaceTypeContext> unannInterfaceType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public List<UnannClassType_lf_unannClassOrInterfaceTypeContext> unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannClassType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterUnannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitUnannClassOrInterfaceType(this);
		}
	}

	public final UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() throws RecognitionException {
		UnannClassOrInterfaceTypeContext _localctx = new UnannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_unannClassOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(924); unannClassType_lfno_unannClassOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(925); unannInterfaceType_lfno_unannClassOrInterfaceType();
				}
				break;
			}
			setState(932);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(930);
					switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
					case 1:
						{
						setState(928); unannClassType_lf_unannClassOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(929); unannInterfaceType_lf_unannClassOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(934);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public UnannClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterUnannClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitUnannClassType(this);
		}
	}

	public final UnannClassTypeContext unannClassType() throws RecognitionException {
		UnannClassTypeContext _localctx = new UnannClassTypeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_unannClassType);
		int _la;
		try {
			setState(951);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(935); match(Identifier);
				setState(937);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(936); typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(939); unannClassOrInterfaceType();
				setState(940); match(DOT);
				setState(944);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(941); annotation();
					}
					}
					setState(946);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(947); match(Identifier);
				setState(949);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(948); typeArguments();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterUnannClassType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitUnannClassType_lf_unannClassOrInterfaceType(this);
		}
	}

	public final UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_unannClassType_lf_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953); match(DOT);
			setState(957);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(954); annotation();
				}
				}
				setState(959);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(960); match(Identifier);
			setState(962);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(961); typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
	}

	public final UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_unannClassType_lfno_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964); match(Identifier);
			setState(966);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(965); typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public UnannInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterUnannInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitUnannInterfaceType(this);
		}
	}

	public final UnannInterfaceTypeContext unannInterfaceType() throws RecognitionException {
		UnannInterfaceTypeContext _localctx = new UnannInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_unannInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968); unannClassType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
	}

	public final UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_unannInterfaceType_lf_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970); unannClassType_lf_unannClassOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
	}

	public final UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972); unannClassType_lfno_unannClassOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannTypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public UnannTypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannTypeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterUnannTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitUnannTypeVariable(this);
		}
	}

	public final UnannTypeVariableContext unannTypeVariable() throws RecognitionException {
		UnannTypeVariableContext _localctx = new UnannTypeVariableContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_unannTypeVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannArrayTypeContext extends ParserRuleContext {
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public UnannArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannArrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterUnannArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitUnannArrayType(this);
		}
	}

	public final UnannArrayTypeContext unannArrayType() throws RecognitionException {
		UnannArrayTypeContext _localctx = new UnannArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_unannArrayType);
		try {
			setState(985);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(976); unannPrimitiveType();
				setState(977); dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(979); unannClassOrInterfaceType();
				setState(980); dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(982); unannTypeVariable();
				setState(983); dims();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public List<MethodModifierContext> methodModifier() {
			return getRuleContexts(MethodModifierContext.class);
		}
		public MethodModifierContext methodModifier(int i) {
			return getRuleContext(MethodModifierContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (UNDERST - 68)) | (1L << (LONG_ACTION - 68)) | (1L << (PREVENT_MISSING_COLLISION - 68)) | (1L << (ONE_AT_A_TIME - 68)) | (1L << (DEPENDENT_ACTIVITY - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(987); methodModifier();
				}
				}
				setState(992);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(993); methodHeader();
			setState(994); methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public MethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitMethodModifier(this);
		}
	}

	public final MethodModifierContext methodModifier() throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_methodModifier);
		try {
			setState(1011);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(996); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(997); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(998); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(999); match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1000); match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1001); match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1002); match(FINAL);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 8);
				{
				setState(1003); match(SYNCHRONIZED);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1004); match(NATIVE);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 10);
				{
				setState(1005); match(STRICTFP);
				}
				break;
			case UNDERST:
				enterOuterAlt(_localctx, 11);
				{
				setState(1006); match(UNDERST);
				}
				break;
			case LONG_ACTION:
				enterOuterAlt(_localctx, 12);
				{
				setState(1007); match(LONG_ACTION);
				}
				break;
			case PREVENT_MISSING_COLLISION:
				enterOuterAlt(_localctx, 13);
				{
				setState(1008); match(PREVENT_MISSING_COLLISION);
				}
				break;
			case ONE_AT_A_TIME:
				enterOuterAlt(_localctx, 14);
				{
				setState(1009); match(ONE_AT_A_TIME);
				}
				break;
			case DEPENDENT_ACTIVITY:
				enterOuterAlt(_localctx, 15);
				{
				setState(1010); match(DEPENDENT_ACTIVITY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodHeaderContext extends ParserRuleContext {
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterMethodHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitMethodHeader(this);
		}
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_methodHeader);
		int _la;
		try {
			setState(1030);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VOID:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1013); result();
				setState(1014); methodDeclarator();
				setState(1016);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1015); throws_();
					}
				}

				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1018); typeParameters();
				setState(1022);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1019); annotation();
					}
					}
					setState(1024);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1025); result();
				setState(1026); methodDeclarator();
				setState(1028);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1027); throws_();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitResult(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_result);
		try {
			setState(1034);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1032); unannType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1033); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public MethodDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterMethodDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitMethodDeclarator(this);
		}
	}

	public final MethodDeclaratorContext methodDeclarator() throws RecognitionException {
		MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036); match(Identifier);
			setState(1037); match(LPAREN);
			setState(1039);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==WITH_COMPAT || _la==Identifier || _la==AT) {
				{
				setState(1038); formalParameterList();
				}
			}

			setState(1041); match(RPAREN);
			setState(1043);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1042); dims();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_formalParameterList);
		try {
			setState(1051);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1045); receiverParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1046); formalParameters();
				setState(1047); match(COMMA);
				setState(1048); lastFormalParameter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1050); lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_formalParameters);
		try {
			int _alt;
			setState(1069);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1053); formalParameter();
				setState(1058);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1054); match(COMMA);
						setState(1055); formalParameter();
						}
						} 
					}
					setState(1060);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1061); receiverParameter();
				setState(1066);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1062); match(COMMA);
						setState(1063); formalParameter();
						}
						} 
					}
					setState(1068);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==WITH_COMPAT || _la==AT) {
				{
				{
				setState(1071); variableModifier();
				}
				}
				setState(1076);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1077); unannType();
			setState(1078); variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_variableModifier);
		try {
			setState(1083);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1080); annotation();
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1081); match(FINAL);
				}
				break;
			case WITH_COMPAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1082); match(WITH_COMPAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitLastFormalParameter(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_lastFormalParameter);
		int _la;
		try {
			setState(1102);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1088);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==WITH_COMPAT || _la==AT) {
					{
					{
					setState(1085); variableModifier();
					}
					}
					setState(1090);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1091); unannType();
				setState(1095);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1092); annotation();
					}
					}
					setState(1097);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1098); match(ELLIPSIS);
				setState(1099); variableDeclaratorId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1101); formalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterReceiverParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitReceiverParameter(this);
		}
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1104); annotation();
				}
				}
				setState(1109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1110); unannType();
			setState(1113);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1111); match(Identifier);
				setState(1112); match(DOT);
				}
			}

			setState(1115); match(THIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Throws_Context extends ParserRuleContext {
		public ExceptionTypeListContext exceptionTypeList() {
			return getRuleContext(ExceptionTypeListContext.class,0);
		}
		public Throws_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throws_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterThrows_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitThrows_(this);
		}
	}

	public final Throws_Context throws_() throws RecognitionException {
		Throws_Context _localctx = new Throws_Context(_ctx, getState());
		enterRule(_localctx, 162, RULE_throws_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117); match(THROWS);
			setState(1118); exceptionTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionTypeListContext extends ParserRuleContext {
		public List<ExceptionTypeContext> exceptionType() {
			return getRuleContexts(ExceptionTypeContext.class);
		}
		public ExceptionTypeContext exceptionType(int i) {
			return getRuleContext(ExceptionTypeContext.class,i);
		}
		public ExceptionTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterExceptionTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitExceptionTypeList(this);
		}
	}

	public final ExceptionTypeListContext exceptionTypeList() throws RecognitionException {
		ExceptionTypeListContext _localctx = new ExceptionTypeListContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_exceptionTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120); exceptionType();
			setState(1125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1121); match(COMMA);
				setState(1122); exceptionType();
				}
				}
				setState(1127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionTypeContext extends ParserRuleContext {
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public ExceptionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterExceptionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitExceptionType(this);
		}
	}

	public final ExceptionTypeContext exceptionType() throws RecognitionException {
		ExceptionTypeContext _localctx = new ExceptionTypeContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_exceptionType);
		try {
			setState(1130);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1128); classType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1129); typeVariable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_methodBody);
		try {
			setState(1134);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1132); block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1133); match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceInitializerContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InstanceInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterInstanceInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitInstanceInitializer(this);
		}
	}

	public final InstanceInitializerContext instanceInitializer() throws RecognitionException {
		InstanceInitializerContext _localctx = new InstanceInitializerContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_instanceInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1136); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticInitializerContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StaticInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterStaticInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitStaticInitializer(this);
		}
	}

	public final StaticInitializerContext staticInitializer() throws RecognitionException {
		StaticInitializerContext _localctx = new StaticInitializerContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_staticInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1138); match(STATIC);
			setState(1139); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public ConstructorDeclaratorContext constructorDeclarator() {
			return getRuleContext(ConstructorDeclaratorContext.class,0);
		}
		public List<ConstructorModifierContext> constructorModifier() {
			return getRuleContexts(ConstructorModifierContext.class);
		}
		public ConstructorModifierContext constructorModifier(int i) {
			return getRuleContext(ConstructorModifierContext.class,i);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0) || _la==AT) {
				{
				{
				setState(1141); constructorModifier();
				}
				}
				setState(1146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1147); constructorDeclarator();
			setState(1149);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(1148); throws_();
				}
			}

			setState(1151); constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ConstructorModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterConstructorModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitConstructorModifier(this);
		}
	}

	public final ConstructorModifierContext constructorModifier() throws RecognitionException {
		ConstructorModifierContext _localctx = new ConstructorModifierContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_constructorModifier);
		try {
			setState(1157);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1153); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1154); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1155); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1156); match(PRIVATE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclaratorContext extends ParserRuleContext {
		public SimpleTypeNameContext simpleTypeName() {
			return getRuleContext(SimpleTypeNameContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterConstructorDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitConstructorDeclarator(this);
		}
	}

	public final ConstructorDeclaratorContext constructorDeclarator() throws RecognitionException {
		ConstructorDeclaratorContext _localctx = new ConstructorDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_constructorDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1160);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1159); typeParameters();
				}
			}

			setState(1162); simpleTypeName();
			setState(1163); match(LPAREN);
			setState(1165);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==WITH_COMPAT || _la==Identifier || _la==AT) {
				{
				setState(1164); formalParameterList();
				}
			}

			setState(1167); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public SimpleTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterSimpleTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitSimpleTypeName(this);
		}
	}

	public final SimpleTypeNameContext simpleTypeName() throws RecognitionException {
		SimpleTypeNameContext _localctx = new SimpleTypeNameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_simpleTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1169); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitConstructorBody(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1171); match(LBRACE);
			setState(1173);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(1172); explicitConstructorInvocation();
				}
				break;
			}
			setState(1176);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << CLASS_FOR) | (1L << SIMU_REAL_WORLD_OBJ) | (1L << ABSTRACTION) | (1L << SIMU_COMP_AS_WORKER) | (1L << COMP_AS_WORKER) | (1L << MODEL_REAL_WORLD_OBJ) | (1L << MODEL) | (1L << INDEF_OBJ) | (1L << INFORMATION))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (WITH_COMPAT - 67)) | (1L << (WORKER_AGENT - 67)) | (1L << (SIMU_AGENT - 67)) | (1L << (AGENT_ABSTRACTION - 67)) | (1L << (AGENT - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (NullLiteral - 67)) | (1L << (LPAREN - 67)) | (1L << (LBRACE - 67)) | (1L << (SEMI - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (Identifier - 67)))) != 0) || _la==AT) {
				{
				setState(1175); blockStatements();
				}
			}

			setState(1178); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterExplicitConstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitExplicitConstructorInvocation(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(1226);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1181);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1180); typeArguments();
					}
				}

				setState(1183); match(THIS);
				setState(1184); match(LPAREN);
				setState(1186);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(1185); argumentList();
					}
				}

				setState(1188); match(RPAREN);
				setState(1189); match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1191);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1190); typeArguments();
					}
				}

				setState(1193); match(SUPER);
				setState(1194); match(LPAREN);
				setState(1196);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(1195); argumentList();
					}
				}

				setState(1198); match(RPAREN);
				setState(1199); match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1200); expressionName();
				setState(1201); match(DOT);
				setState(1203);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1202); typeArguments();
					}
				}

				setState(1205); match(SUPER);
				setState(1206); match(LPAREN);
				setState(1208);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(1207); argumentList();
					}
				}

				setState(1210); match(RPAREN);
				setState(1211); match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1213); primary();
				setState(1214); match(DOT);
				setState(1216);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1215); typeArguments();
					}
				}

				setState(1218); match(SUPER);
				setState(1219); match(LPAREN);
				setState(1221);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(1220); argumentList();
					}
				}

				setState(1223); match(RPAREN);
				setState(1224); match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1228); classModifier();
				}
				}
				setState(1233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1234); match(ENUM);
			setState(1235); match(Identifier);
			setState(1237);
			_la = _input.LA(1);
			if (_la==CONTRACTS) {
				{
				setState(1236); superinterfaces();
				}
			}

			setState(1239); enumBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyContext extends ParserRuleContext {
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumConstantListContext enumConstantList() {
			return getRuleContext(EnumConstantListContext.class,0);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitEnumBody(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241); match(LBRACE);
			setState(1243);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(1242); enumConstantList();
				}
			}

			setState(1246);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1245); match(COMMA);
				}
			}

			setState(1249);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1248); enumBodyDeclarations();
				}
			}

			setState(1251); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantListContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public EnumConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterEnumConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitEnumConstantList(this);
		}
	}

	public final EnumConstantListContext enumConstantList() throws RecognitionException {
		EnumConstantListContext _localctx = new EnumConstantListContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_enumConstantList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1253); enumConstant();
			setState(1258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1254); match(COMMA);
					setState(1255); enumConstant();
					}
					} 
				}
				setState(1260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<EnumConstantModifierContext> enumConstantModifier() {
			return getRuleContexts(EnumConstantModifierContext.class);
		}
		public EnumConstantModifierContext enumConstantModifier(int i) {
			return getRuleContext(EnumConstantModifierContext.class,i);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1261); enumConstantModifier();
				}
				}
				setState(1266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1267); match(Identifier);
			setState(1273);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1268); match(LPAREN);
				setState(1270);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(1269); argumentList();
					}
				}

				setState(1272); match(RPAREN);
				}
			}

			setState(1276);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1275); classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public EnumConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterEnumConstantModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitEnumConstantModifier(this);
		}
	}

	public final EnumConstantModifierContext enumConstantModifier() throws RecognitionException {
		EnumConstantModifierContext _localctx = new EnumConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_enumConstantModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1278); annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitEnumBodyDeclarations(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1280); match(SEMI);
			setState(1284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << CLASS_FOR) | (1L << SIMU_REAL_WORLD_OBJ) | (1L << ABSTRACTION) | (1L << SIMU_COMP_AS_WORKER) | (1L << COMP_AS_WORKER) | (1L << MODEL_REAL_WORLD_OBJ) | (1L << MODEL) | (1L << INDEF_OBJ) | (1L << INFORMATION) | (1L << COMPAT_INTERF_VERSION) | (1L << COMPAT_INTERF_CAPACITY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (COMPAT_INTERF - 64)) | (1L << (VERSION_INH - 64)) | (1L << (CAPACITY_INH - 64)) | (1L << (WITH_COMPAT - 64)) | (1L << (UNDERST - 64)) | (1L << (LONG_ACTION - 64)) | (1L << (PREVENT_MISSING_COLLISION - 64)) | (1L << (ONE_AT_A_TIME - 64)) | (1L << (TOUR_MONITOR - 64)) | (1L << (FOR_EVERY_THREAD - 64)) | (1L << (DEPENDENT_ACTIVITY - 64)) | (1L << (WORKER_AGENT - 64)) | (1L << (SIMU_AGENT - 64)) | (1L << (AGENT_ABSTRACTION - 64)) | (1L << (AGENT - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)))) != 0) || _la==Identifier || _la==AT) {
				{
				{
				setState(1281); classBodyDeclaration();
				}
				}
				setState(1286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_interfaceDeclaration);
		try {
			setState(1289);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1287); normalInterfaceDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1288); annotationTypeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalInterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ExtendsInterfacesContext extendsInterfaces() {
			return getRuleContext(ExtendsInterfacesContext.class,0);
		}
		public SimolRoleContext simolRole() {
			return getRuleContext(SimolRoleContext.class,0);
		}
		public SimolInterfaceRoleContext simolInterfaceRole() {
			return getRuleContext(SimolInterfaceRoleContext.class,0);
		}
		public NormalInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterNormalInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitNormalInterfaceDeclaration(this);
		}
	}

	public final NormalInterfaceDeclarationContext normalInterfaceDeclaration() throws RecognitionException {
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1291); interfaceModifier();
				}
				}
				setState(1296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1297); simolInterfaceRole();
			setState(1299);
			_la = _input.LA(1);
			if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (SIMU_REAL_WORLD_OBJ - 52)) | (1L << (ABSTRACTION - 52)) | (1L << (SIMU_COMP_AS_WORKER - 52)) | (1L << (COMP_AS_WORKER - 52)) | (1L << (MODEL_REAL_WORLD_OBJ - 52)) | (1L << (MODEL - 52)) | (1L << (INDEF_OBJ - 52)) | (1L << (INFORMATION - 52)) | (1L << (WORKER_AGENT - 52)) | (1L << (SIMU_AGENT - 52)) | (1L << (AGENT_ABSTRACTION - 52)) | (1L << (AGENT - 52)))) != 0)) {
				{
				setState(1298); simolRole();
				}
			}

			setState(1301); match(Identifier);
			setState(1303);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1302); typeParameters();
				}
			}

			setState(1306);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1305); extendsInterfaces();
				}
			}

			setState(1308); interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimolInterfaceRoleContext extends ParserRuleContext {
		public SimolInterfaceRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simolInterfaceRole; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterSimolInterfaceRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitSimolInterfaceRole(this);
		}
	}

	public final SimolInterfaceRoleContext simolInterfaceRole() throws RecognitionException {
		SimolInterfaceRoleContext _localctx = new SimolInterfaceRoleContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_simolInterfaceRole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1310);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (COMPAT_INTERF_VERSION - 62)) | (1L << (COMPAT_INTERF_CAPACITY - 62)) | (1L << (COMPAT_INTERF - 62)) | (1L << (VERSION_INH - 62)) | (1L << (CAPACITY_INH - 62)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public InterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitInterfaceModifier(this);
		}
	}

	public final InterfaceModifierContext interfaceModifier() throws RecognitionException {
		InterfaceModifierContext _localctx = new InterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_interfaceModifier);
		try {
			setState(1319);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1312); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1313); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1314); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1315); match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1316); match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1317); match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1318); match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendsInterfacesContext extends ParserRuleContext {
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public ExtendsInterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsInterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterExtendsInterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitExtendsInterfaces(this);
		}
	}

	public final ExtendsInterfacesContext extendsInterfaces() throws RecognitionException {
		ExtendsInterfacesContext _localctx = new ExtendsInterfacesContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_extendsInterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1321); match(EXTENDS);
			setState(1322); interfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration(int i) {
			return getRuleContext(InterfaceMemberDeclarationContext.class,i);
		}
		public List<InterfaceMemberDeclarationContext> interfaceMemberDeclaration() {
			return getRuleContexts(InterfaceMemberDeclarationContext.class);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324); match(LBRACE);
			setState(1328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << VOID) | (1L << CLASS_FOR) | (1L << SIMU_REAL_WORLD_OBJ) | (1L << ABSTRACTION) | (1L << SIMU_COMP_AS_WORKER) | (1L << COMP_AS_WORKER) | (1L << MODEL_REAL_WORLD_OBJ) | (1L << MODEL) | (1L << INDEF_OBJ) | (1L << INFORMATION) | (1L << COMPAT_INTERF_VERSION) | (1L << COMPAT_INTERF_CAPACITY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (COMPAT_INTERF - 64)) | (1L << (VERSION_INH - 64)) | (1L << (CAPACITY_INH - 64)) | (1L << (WORKER_AGENT - 64)) | (1L << (SIMU_AGENT - 64)) | (1L << (AGENT_ABSTRACTION - 64)) | (1L << (AGENT - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)))) != 0) || _la==Identifier || _la==AT) {
				{
				{
				setState(1325); interfaceMemberDeclaration();
				}
				}
				setState(1330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1331); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitInterfaceMemberDeclaration(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_interfaceMemberDeclaration);
		try {
			setState(1338);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1333); constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1334); interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1335); classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1336); interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1337); match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public ConstantModifierContext constantModifier(int i) {
			return getRuleContext(ConstantModifierContext.class,i);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<ConstantModifierContext> constantModifier() {
			return getRuleContexts(ConstantModifierContext.class);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitConstantDeclaration(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_constantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PUBLIC) | (1L << STATIC))) != 0) || _la==AT) {
				{
				{
				setState(1340); constantModifier();
				}
				}
				setState(1345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1346); unannType();
			setState(1347); variableDeclaratorList();
			setState(1348); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterConstantModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitConstantModifier(this);
		}
	}

	public final ConstantModifierContext constantModifier() throws RecognitionException {
		ConstantModifierContext _localctx = new ConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_constantModifier);
		try {
			setState(1354);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1350); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1351); match(PUBLIC);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1352); match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1353); match(FINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitInterfaceMethodDeclaration(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1356); interfaceMethodModifier();
				}
				}
				setState(1361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1362); methodHeader();
			setState(1363); methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterInterfaceMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitInterfaceMethodModifier(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_interfaceMethodModifier);
		try {
			setState(1371);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1365); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1366); match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1367); match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1368); match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1369); match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(1370); match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitAnnotationTypeDeclaration(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_annotationTypeDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1376);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1373); interfaceModifier();
					}
					} 
				}
				setState(1378);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			}
			setState(1379); match(AT);
			setState(1380); match(INTERFACE);
			setState(1381); match(Identifier);
			setState(1382); annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public List<AnnotationTypeMemberDeclarationContext> annotationTypeMemberDeclaration() {
			return getRuleContexts(AnnotationTypeMemberDeclarationContext.class);
		}
		public AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration(int i) {
			return getRuleContext(AnnotationTypeMemberDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitAnnotationTypeBody(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1384); match(LBRACE);
			setState(1388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << CLASS_FOR) | (1L << SIMU_REAL_WORLD_OBJ) | (1L << ABSTRACTION) | (1L << SIMU_COMP_AS_WORKER) | (1L << COMP_AS_WORKER) | (1L << MODEL_REAL_WORLD_OBJ) | (1L << MODEL) | (1L << INDEF_OBJ) | (1L << INFORMATION) | (1L << COMPAT_INTERF_VERSION) | (1L << COMPAT_INTERF_CAPACITY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (COMPAT_INTERF - 64)) | (1L << (VERSION_INH - 64)) | (1L << (CAPACITY_INH - 64)) | (1L << (WORKER_AGENT - 64)) | (1L << (SIMU_AGENT - 64)) | (1L << (AGENT_ABSTRACTION - 64)) | (1L << (AGENT - 64)) | (1L << (SEMI - 64)))) != 0) || _la==Identifier || _la==AT) {
				{
				{
				setState(1385); annotationTypeMemberDeclaration();
				}
				}
				setState(1390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1391); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeMemberDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public AnnotationTypeMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterAnnotationTypeMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitAnnotationTypeMemberDeclaration(this);
		}
	}

	public final AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration() throws RecognitionException {
		AnnotationTypeMemberDeclarationContext _localctx = new AnnotationTypeMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_annotationTypeMemberDeclaration);
		try {
			setState(1398);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1393); annotationTypeElementDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1394); constantDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1395); classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1396); interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1397); match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationTypeElementModifierContext annotationTypeElementModifier(int i) {
			return getRuleContext(AnnotationTypeElementModifierContext.class,i);
		}
		public List<AnnotationTypeElementModifierContext> annotationTypeElementModifier() {
			return getRuleContexts(AnnotationTypeElementModifierContext.class);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_annotationTypeElementDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSTRACT || _la==PUBLIC || _la==AT) {
				{
				{
				setState(1400); annotationTypeElementModifier();
				}
				}
				setState(1405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1406); unannType();
			setState(1407); match(Identifier);
			setState(1408); match(LPAREN);
			setState(1409); match(RPAREN);
			setState(1411);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1410); dims();
				}
			}

			setState(1414);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1413); defaultValue();
				}
			}

			setState(1416); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public AnnotationTypeElementModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterAnnotationTypeElementModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitAnnotationTypeElementModifier(this);
		}
	}

	public final AnnotationTypeElementModifierContext annotationTypeElementModifier() throws RecognitionException {
		AnnotationTypeElementModifierContext _localctx = new AnnotationTypeElementModifierContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_annotationTypeElementModifier);
		try {
			setState(1421);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1418); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1419); match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1420); match(ABSTRACT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1423); match(DEFAULT);
			setState(1424); elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public NormalAnnotationContext normalAnnotation() {
			return getRuleContext(NormalAnnotationContext.class,0);
		}
		public MarkerAnnotationContext markerAnnotation() {
			return getRuleContext(MarkerAnnotationContext.class,0);
		}
		public SingleElementAnnotationContext singleElementAnnotation() {
			return getRuleContext(SingleElementAnnotationContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_annotation);
		try {
			setState(1429);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1426); normalAnnotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1427); markerAnnotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1428); singleElementAnnotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalAnnotationContext extends ParserRuleContext {
		public ElementValuePairListContext elementValuePairList() {
			return getRuleContext(ElementValuePairListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public NormalAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterNormalAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitNormalAnnotation(this);
		}
	}

	public final NormalAnnotationContext normalAnnotation() throws RecognitionException {
		NormalAnnotationContext _localctx = new NormalAnnotationContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_normalAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1431); match(AT);
			setState(1432); typeName();
			setState(1433); match(LPAREN);
			setState(1435);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1434); elementValuePairList();
				}
			}

			setState(1437); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairListContext extends ParserRuleContext {
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterElementValuePairList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitElementValuePairList(this);
		}
	}

	public final ElementValuePairListContext elementValuePairList() throws RecognitionException {
		ElementValuePairListContext _localctx = new ElementValuePairListContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_elementValuePairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1439); elementValuePair();
			setState(1444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1440); match(COMMA);
				setState(1441); elementValuePair();
				}
				}
				setState(1446);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1447); match(Identifier);
			setState(1448); match(ASSIGN);
			setState(1449); elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_elementValue);
		try {
			setState(1454);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1451); conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1452); elementValueArrayInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1453); annotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public ElementValueListContext elementValueList() {
			return getRuleContext(ElementValueListContext.class,0);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_elementValueArrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1456); match(LBRACE);
			setState(1458);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (LBRACE - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1457); elementValueList();
				}
			}

			setState(1461);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1460); match(COMMA);
				}
			}

			setState(1463); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueListContext extends ParserRuleContext {
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterElementValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitElementValueList(this);
		}
	}

	public final ElementValueListContext elementValueList() throws RecognitionException {
		ElementValueListContext _localctx = new ElementValueListContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_elementValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1465); elementValue();
			setState(1470);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1466); match(COMMA);
					setState(1467); elementValue();
					}
					} 
				}
				setState(1472);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MarkerAnnotationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MarkerAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_markerAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterMarkerAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitMarkerAnnotation(this);
		}
	}

	public final MarkerAnnotationContext markerAnnotation() throws RecognitionException {
		MarkerAnnotationContext _localctx = new MarkerAnnotationContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_markerAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1473); match(AT);
			setState(1474); typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleElementAnnotationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public SingleElementAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleElementAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterSingleElementAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitSingleElementAnnotation(this);
		}
	}

	public final SingleElementAnnotationContext singleElementAnnotation() throws RecognitionException {
		SingleElementAnnotationContext _localctx = new SingleElementAnnotationContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_singleElementAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476); match(AT);
			setState(1477); typeName();
			setState(1478); match(LPAREN);
			setState(1479); elementValue();
			setState(1480); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public VariableInitializerListContext variableInitializerList() {
			return getRuleContext(VariableInitializerListContext.class,0);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1482); match(LBRACE);
			setState(1484);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (LBRACE - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1483); variableInitializerList();
				}
			}

			setState(1487);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1486); match(COMMA);
				}
			}

			setState(1489); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerListContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public VariableInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterVariableInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitVariableInitializerList(this);
		}
	}

	public final VariableInitializerListContext variableInitializerList() throws RecognitionException {
		VariableInitializerListContext _localctx = new VariableInitializerListContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_variableInitializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1491); variableInitializer();
			setState(1496);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1492); match(COMMA);
					setState(1493); variableInitializer();
					}
					} 
				}
				setState(1498);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1499); match(LBRACE);
			setState(1501);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << CLASS_FOR) | (1L << SIMU_REAL_WORLD_OBJ) | (1L << ABSTRACTION) | (1L << SIMU_COMP_AS_WORKER) | (1L << COMP_AS_WORKER) | (1L << MODEL_REAL_WORLD_OBJ) | (1L << MODEL) | (1L << INDEF_OBJ) | (1L << INFORMATION))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (WITH_COMPAT - 67)) | (1L << (WORKER_AGENT - 67)) | (1L << (SIMU_AGENT - 67)) | (1L << (AGENT_ABSTRACTION - 67)) | (1L << (AGENT - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (NullLiteral - 67)) | (1L << (LPAREN - 67)) | (1L << (LBRACE - 67)) | (1L << (SEMI - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (Identifier - 67)))) != 0) || _la==AT) {
				{
				setState(1500); blockStatements();
				}
			}

			setState(1503); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementsContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitBlockStatements(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1506); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1505); blockStatement();
				}
				}
				setState(1508); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << CLASS_FOR) | (1L << SIMU_REAL_WORLD_OBJ) | (1L << ABSTRACTION) | (1L << SIMU_COMP_AS_WORKER) | (1L << COMP_AS_WORKER) | (1L << MODEL_REAL_WORLD_OBJ) | (1L << MODEL) | (1L << INDEF_OBJ) | (1L << INFORMATION))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (WITH_COMPAT - 67)) | (1L << (WORKER_AGENT - 67)) | (1L << (SIMU_AGENT - 67)) | (1L << (AGENT_ABSTRACTION - 67)) | (1L << (AGENT - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (NullLiteral - 67)) | (1L << (LPAREN - 67)) | (1L << (LBRACE - 67)) | (1L << (SEMI - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (Identifier - 67)))) != 0) || _la==AT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_blockStatement);
		try {
			setState(1513);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1510); localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1511); classDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1512); statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitLocalVariableDeclarationStatement(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1515); localVariableDeclaration();
			setState(1516); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==WITH_COMPAT || _la==AT) {
				{
				{
				setState(1518); variableModifier();
				}
				}
				setState(1523);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1524); unannType();
			setState(1525); variableDeclaratorList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IfThenStatementContext ifThenStatement() {
			return getRuleContext(IfThenStatementContext.class,0);
		}
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public IfThenElseStatementContext ifThenElseStatement() {
			return getRuleContext(IfThenElseStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_statement);
		try {
			setState(1533);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1527); statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1528); labeledStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1529); ifThenStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1530); ifThenElseStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1531); whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1532); forStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementNoShortIfContext extends ParserRuleContext {
		public ForStatementNoShortIfContext forStatementNoShortIf() {
			return getRuleContext(ForStatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext whileStatementNoShortIf() {
			return getRuleContext(WhileStatementNoShortIfContext.class,0);
		}
		public IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() {
			return getRuleContext(IfThenElseStatementNoShortIfContext.class,0);
		}
		public LabeledStatementNoShortIfContext labeledStatementNoShortIf() {
			return getRuleContext(LabeledStatementNoShortIfContext.class,0);
		}
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public StatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitStatementNoShortIf(this);
		}
	}

	public final StatementNoShortIfContext statementNoShortIf() throws RecognitionException {
		StatementNoShortIfContext _localctx = new StatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_statementNoShortIf);
		try {
			setState(1540);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1535); statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1536); labeledStatementNoShortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1537); ifThenElseStatementNoShortIf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1538); whileStatementNoShortIf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1539); forStatementNoShortIf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementWithoutTrailingSubstatementContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public SynchronizedStatementContext synchronizedStatement() {
			return getRuleContext(SynchronizedStatementContext.class,0);
		}
		public AssertStatementContext assertStatement() {
			return getRuleContext(AssertStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public EmptyStatement_Context emptyStatement_() {
			return getRuleContext(EmptyStatement_Context.class,0);
		}
		public StatementWithoutTrailingSubstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWithoutTrailingSubstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterStatementWithoutTrailingSubstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitStatementWithoutTrailingSubstatement(this);
		}
	}

	public final StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() throws RecognitionException {
		StatementWithoutTrailingSubstatementContext _localctx = new StatementWithoutTrailingSubstatementContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_statementWithoutTrailingSubstatement);
		try {
			setState(1554);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1542); block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1543); emptyStatement_();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case INC:
			case DEC:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1544); expressionStatement();
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1545); assertStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(1546); switchStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(1547); doStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(1548); breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1549); continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(1550); returnStatement();
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 10);
				{
				setState(1551); synchronizedStatement();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 11);
				{
				setState(1552); throwStatement();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 12);
				{
				setState(1553); tryStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatement_Context extends ParserRuleContext {
		public EmptyStatement_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterEmptyStatement_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitEmptyStatement_(this);
		}
	}

	public final EmptyStatement_Context emptyStatement_() throws RecognitionException {
		EmptyStatement_Context _localctx = new EmptyStatement_Context(_ctx, getState());
		enterRule(_localctx, 270, RULE_emptyStatement_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1556); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitLabeledStatement(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1558); match(Identifier);
			setState(1559); match(COLON);
			setState(1560); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public LabeledStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterLabeledStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitLabeledStatementNoShortIf(this);
		}
	}

	public final LabeledStatementNoShortIfContext labeledStatementNoShortIf() throws RecognitionException {
		LabeledStatementNoShortIfContext _localctx = new LabeledStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_labeledStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1562); match(Identifier);
			setState(1563); match(COLON);
			setState(1564); statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1566); statementExpression();
			setState(1567); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public PostDecrementExpressionContext postDecrementExpression() {
			return getRuleContext(PostDecrementExpressionContext.class,0);
		}
		public PostIncrementExpressionContext postIncrementExpression() {
			return getRuleContext(PostIncrementExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_statementExpression);
		try {
			setState(1576);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1569); assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1570); preIncrementExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1571); preDecrementExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1572); postIncrementExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1573); postDecrementExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1574); methodInvocation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1575); classInstanceCreationExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfThenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterIfThenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitIfThenStatement(this);
		}
	}

	public final IfThenStatementContext ifThenStatement() throws RecognitionException {
		IfThenStatementContext _localctx = new IfThenStatementContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_ifThenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1578); match(IF);
			setState(1579); match(LPAREN);
			setState(1580); expression();
			setState(1581); match(RPAREN);
			setState(1582); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementContext extends ParserRuleContext {
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfThenElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterIfThenElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitIfThenElseStatement(this);
		}
	}

	public final IfThenElseStatementContext ifThenElseStatement() throws RecognitionException {
		IfThenElseStatementContext _localctx = new IfThenElseStatementContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_ifThenElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1584); match(IF);
			setState(1585); match(LPAREN);
			setState(1586); expression();
			setState(1587); match(RPAREN);
			setState(1588); statementNoShortIf();
			setState(1589); match(ELSE);
			setState(1590); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementNoShortIfContext extends ParserRuleContext {
		public List<StatementNoShortIfContext> statementNoShortIf() {
			return getRuleContexts(StatementNoShortIfContext.class);
		}
		public StatementNoShortIfContext statementNoShortIf(int i) {
			return getRuleContext(StatementNoShortIfContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfThenElseStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterIfThenElseStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitIfThenElseStatementNoShortIf(this);
		}
	}

	public final IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() throws RecognitionException {
		IfThenElseStatementNoShortIfContext _localctx = new IfThenElseStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_ifThenElseStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1592); match(IF);
			setState(1593); match(LPAREN);
			setState(1594); expression();
			setState(1595); match(RPAREN);
			setState(1596); statementNoShortIf();
			setState(1597); match(ELSE);
			setState(1598); statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertStatementContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AssertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterAssertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitAssertStatement(this);
		}
	}

	public final AssertStatementContext assertStatement() throws RecognitionException {
		AssertStatementContext _localctx = new AssertStatementContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_assertStatement);
		try {
			setState(1610);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1600); match(ASSERT);
				setState(1601); expression();
				setState(1602); match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1604); match(ASSERT);
				setState(1605); expression();
				setState(1606); match(COLON);
				setState(1607); expression();
				setState(1608); match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitSwitchStatement(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1612); match(SWITCH);
			setState(1613); match(LPAREN);
			setState(1614); expression();
			setState(1615); match(RPAREN);
			setState(1616); switchBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockContext extends ParserRuleContext {
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitSwitchBlock(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1618); match(LBRACE);
			setState(1622);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1619); switchBlockStatementGroup();
					}
					} 
				}
				setState(1624);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			}
			setState(1628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1625); switchLabel();
				}
				}
				setState(1630);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1631); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public SwitchLabelsContext switchLabels() {
			return getRuleContext(SwitchLabelsContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_switchBlockStatementGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1633); switchLabels();
			setState(1634); blockStatements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelsContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterSwitchLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitSwitchLabels(this);
		}
	}

	public final SwitchLabelsContext switchLabels() throws RecognitionException {
		SwitchLabelsContext _localctx = new SwitchLabelsContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_switchLabels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1636); switchLabel();
			setState(1640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1637); switchLabel();
				}
				}
				setState(1642);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_switchLabel);
		try {
			setState(1653);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1643); match(CASE);
				setState(1644); constantExpression();
				setState(1645); match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1647); match(CASE);
				setState(1648); enumConstantName();
				setState(1649); match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1651); match(DEFAULT);
				setState(1652); match(COLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitEnumConstantName(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1657); match(WHILE);
			setState(1658); match(LPAREN);
			setState(1659); expression();
			setState(1660); match(RPAREN);
			setState(1661); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementNoShortIfContext extends ParserRuleContext {
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterWhileStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitWhileStatementNoShortIf(this);
		}
	}

	public final WhileStatementNoShortIfContext whileStatementNoShortIf() throws RecognitionException {
		WhileStatementNoShortIfContext _localctx = new WhileStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_whileStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1663); match(WHILE);
			setState(1664); match(LPAREN);
			setState(1665); expression();
			setState(1666); match(RPAREN);
			setState(1667); statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitDoStatement(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1669); match(DO);
			setState(1670); statement();
			setState(1671); match(WHILE);
			setState(1672); match(LPAREN);
			setState(1673); expression();
			setState(1674); match(RPAREN);
			setState(1675); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public BasicForStatementContext basicForStatement() {
			return getRuleContext(BasicForStatementContext.class,0);
		}
		public EnhancedForStatementContext enhancedForStatement() {
			return getRuleContext(EnhancedForStatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_forStatement);
		try {
			setState(1679);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1677); basicForStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1678); enhancedForStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementNoShortIfContext extends ParserRuleContext {
		public BasicForStatementNoShortIfContext basicForStatementNoShortIf() {
			return getRuleContext(BasicForStatementNoShortIfContext.class,0);
		}
		public EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() {
			return getRuleContext(EnhancedForStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitForStatementNoShortIf(this);
		}
	}

	public final ForStatementNoShortIfContext forStatementNoShortIf() throws RecognitionException {
		ForStatementNoShortIfContext _localctx = new ForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_forStatementNoShortIf);
		try {
			setState(1683);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1681); basicForStatementNoShortIf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1682); enhancedForStatementNoShortIf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicForStatementContext extends ParserRuleContext {
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BasicForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterBasicForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitBasicForStatement(this);
		}
	}

	public final BasicForStatementContext basicForStatement() throws RecognitionException {
		BasicForStatementContext _localctx = new BasicForStatementContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_basicForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1685); match(FOR);
			setState(1686); match(LPAREN);
			setState(1688);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (WITH_COMPAT - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (NullLiteral - 67)) | (1L << (LPAREN - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (Identifier - 67)))) != 0) || _la==AT) {
				{
				setState(1687); forInit();
				}
			}

			setState(1690); match(SEMI);
			setState(1692);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1691); expression();
				}
			}

			setState(1694); match(SEMI);
			setState(1696);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1695); forUpdate();
				}
			}

			setState(1698); match(RPAREN);
			setState(1699); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicForStatementNoShortIfContext extends ParserRuleContext {
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BasicForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterBasicForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitBasicForStatementNoShortIf(this);
		}
	}

	public final BasicForStatementNoShortIfContext basicForStatementNoShortIf() throws RecognitionException {
		BasicForStatementNoShortIfContext _localctx = new BasicForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_basicForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1701); match(FOR);
			setState(1702); match(LPAREN);
			setState(1704);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (WITH_COMPAT - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (NullLiteral - 67)) | (1L << (LPAREN - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (Identifier - 67)))) != 0) || _la==AT) {
				{
				setState(1703); forInit();
				}
			}

			setState(1706); match(SEMI);
			setState(1708);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1707); expression();
				}
			}

			setState(1710); match(SEMI);
			setState(1712);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1711); forUpdate();
				}
			}

			setState(1714); match(RPAREN);
			setState(1715); statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_forInit);
		try {
			setState(1719);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1717); statementExpressionList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1718); localVariableDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1721); statementExpressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionListContext extends ParserRuleContext {
		public StatementExpressionContext statementExpression(int i) {
			return getRuleContext(StatementExpressionContext.class,i);
		}
		public List<StatementExpressionContext> statementExpression() {
			return getRuleContexts(StatementExpressionContext.class);
		}
		public StatementExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterStatementExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitStatementExpressionList(this);
		}
	}

	public final StatementExpressionListContext statementExpressionList() throws RecognitionException {
		StatementExpressionListContext _localctx = new StatementExpressionListContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_statementExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1723); statementExpression();
			setState(1728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1724); match(COMMA);
				setState(1725); statementExpression();
				}
				}
				setState(1730);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForStatementContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnhancedForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterEnhancedForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitEnhancedForStatement(this);
		}
	}

	public final EnhancedForStatementContext enhancedForStatement() throws RecognitionException {
		EnhancedForStatementContext _localctx = new EnhancedForStatementContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_enhancedForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1731); match(FOR);
			setState(1732); match(LPAREN);
			setState(1736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==WITH_COMPAT || _la==AT) {
				{
				{
				setState(1733); variableModifier();
				}
				}
				setState(1738);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1739); unannType();
			setState(1740); variableDeclaratorId();
			setState(1741); match(COLON);
			setState(1742); expression();
			setState(1743); match(RPAREN);
			setState(1744); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForStatementNoShortIfContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnhancedForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterEnhancedForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitEnhancedForStatementNoShortIf(this);
		}
	}

	public final EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() throws RecognitionException {
		EnhancedForStatementNoShortIfContext _localctx = new EnhancedForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_enhancedForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1746); match(FOR);
			setState(1747); match(LPAREN);
			setState(1751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==WITH_COMPAT || _la==AT) {
				{
				{
				setState(1748); variableModifier();
				}
				}
				setState(1753);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1754); unannType();
			setState(1755); variableDeclaratorId();
			setState(1756); match(COLON);
			setState(1757); expression();
			setState(1758); match(RPAREN);
			setState(1759); statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1761); match(BREAK);
			setState(1763);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1762); match(Identifier);
				}
			}

			setState(1765); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1767); match(CONTINUE);
			setState(1769);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1768); match(Identifier);
				}
			}

			setState(1771); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1773); match(RETURN);
			setState(1775);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1774); expression();
				}
			}

			setState(1777); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitThrowStatement(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1779); match(THROW);
			setState(1780); expression();
			setState(1781); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynchronizedStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SynchronizedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronizedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterSynchronizedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitSynchronizedStatement(this);
		}
	}

	public final SynchronizedStatementContext synchronizedStatement() throws RecognitionException {
		SynchronizedStatementContext _localctx = new SynchronizedStatementContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1783); match(SYNCHRONIZED);
			setState(1784); match(LPAREN);
			setState(1785); expression();
			setState(1786); match(RPAREN);
			setState(1787); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStatementContext extends ParserRuleContext {
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TryWithResourcesStatementContext tryWithResourcesStatement() {
			return getRuleContext(TryWithResourcesStatementContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitTryStatement(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_tryStatement);
		int _la;
		try {
			setState(1801);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1789); match(TRY);
				setState(1790); block();
				setState(1791); catches();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1793); match(TRY);
				setState(1794); block();
				setState(1796);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(1795); catches();
					}
				}

				setState(1798); finally_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1800); tryWithResourcesStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchesContext extends ParserRuleContext {
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterCatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitCatches(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1803); catchClause();
			setState(1807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(1804); catchClause();
				}
				}
				setState(1809);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public CatchFormalParameterContext catchFormalParameter() {
			return getRuleContext(CatchFormalParameterContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1810); match(CATCH);
			setState(1811); match(LPAREN);
			setState(1812); catchFormalParameter();
			setState(1813); match(RPAREN);
			setState(1814); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchFormalParameterContext extends ParserRuleContext {
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public CatchFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterCatchFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitCatchFormalParameter(this);
		}
	}

	public final CatchFormalParameterContext catchFormalParameter() throws RecognitionException {
		CatchFormalParameterContext _localctx = new CatchFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_catchFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==WITH_COMPAT || _la==AT) {
				{
				{
				setState(1816); variableModifier();
				}
				}
				setState(1821);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1822); catchType();
			setState(1823); variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public ClassTypeContext classType(int i) {
			return getRuleContext(ClassTypeContext.class,i);
		}
		public List<ClassTypeContext> classType() {
			return getRuleContexts(ClassTypeContext.class);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitCatchType(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1825); unannClassType();
			setState(1830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1826); match(BITOR);
				setState(1827); classType();
				}
				}
				setState(1832);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Finally_Context extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Finally_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterFinally_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitFinally_(this);
		}
	}

	public final Finally_Context finally_() throws RecognitionException {
		Finally_Context _localctx = new Finally_Context(_ctx, getState());
		enterRule(_localctx, 344, RULE_finally_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1833); match(FINALLY);
			setState(1834); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryWithResourcesStatementContext extends ParserRuleContext {
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TryWithResourcesStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryWithResourcesStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterTryWithResourcesStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitTryWithResourcesStatement(this);
		}
	}

	public final TryWithResourcesStatementContext tryWithResourcesStatement() throws RecognitionException {
		TryWithResourcesStatementContext _localctx = new TryWithResourcesStatementContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_tryWithResourcesStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1836); match(TRY);
			setState(1837); resourceSpecification();
			setState(1838); block();
			setState(1840);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(1839); catches();
				}
			}

			setState(1843);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(1842); finally_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public ResourceListContext resourceList() {
			return getRuleContext(ResourceListContext.class,0);
		}
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitResourceSpecification(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1845); match(LPAREN);
			setState(1846); resourceList();
			setState(1848);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1847); match(SEMI);
				}
			}

			setState(1850); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceListContext extends ParserRuleContext {
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterResourceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitResourceList(this);
		}
	}

	public final ResourceListContext resourceList() throws RecognitionException {
		ResourceListContext _localctx = new ResourceListContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_resourceList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1852); resource();
			setState(1857);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1853); match(SEMI);
					setState(1854); resource();
					}
					} 
				}
				setState(1859);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==WITH_COMPAT || _la==AT) {
				{
				{
				setState(1860); variableModifier();
				}
				}
				setState(1865);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1866); unannType();
			setState(1867); variableDeclaratorId();
			setState(1868); match(ASSIGN);
			setState(1869); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primaryContext.class,i);
		}
		public PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primaryContext.class,0);
		}
		public ArrayCreationExpressionContext arrayCreationExpression() {
			return getRuleContext(ArrayCreationExpressionContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_primaryContext> primaryNoNewArray_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primaryContext.class);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1873);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1871); primaryNoNewArray_lfno_primary();
				}
				break;
			case 2:
				{
				setState(1872); arrayCreationExpression();
				}
				break;
			}
			setState(1878);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1875); primaryNoNewArray_lf_primary();
					}
					} 
				}
				setState(1880);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArrayContext extends ParserRuleContext {
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public PrimaryNoNewArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPrimaryNoNewArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPrimaryNoNewArray(this);
		}
	}

	public final PrimaryNoNewArrayContext primaryNoNewArray() throws RecognitionException {
		PrimaryNoNewArrayContext _localctx = new PrimaryNoNewArrayContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_primaryNoNewArray);
		int _la;
		try {
			setState(1910);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1881); literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1882); typeName();
				setState(1887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1883); match(LBRACK);
					setState(1884); match(RBRACK);
					}
					}
					setState(1889);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1890); match(DOT);
				setState(1891); match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1893); match(VOID);
				setState(1894); match(DOT);
				setState(1895); match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1896); match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1897); typeName();
				setState(1898); match(DOT);
				setState(1899); match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1901); match(LPAREN);
				setState(1902); expression();
				setState(1903); match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1905); classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1906); fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1907); arrayAccess();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1908); methodInvocation();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1909); methodReference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_arrayAccessContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPrimaryNoNewArray_lf_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPrimaryNoNewArray_lf_arrayAccess(this);
		}
	}

	public final PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lf_arrayAccessContext _localctx = new PrimaryNoNewArray_lf_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_primaryNoNewArray_lf_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_arrayAccessContext extends ParserRuleContext {
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPrimaryNoNewArray_lfno_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPrimaryNoNewArray_lfno_arrayAccess(this);
		}
	}

	public final PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lfno_arrayAccessContext _localctx = new PrimaryNoNewArray_lfno_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_primaryNoNewArray_lfno_arrayAccess);
		int _la;
		try {
			setState(1942);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1914); literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1915); typeName();
				setState(1920);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1916); match(LBRACK);
					setState(1917); match(RBRACK);
					}
					}
					setState(1922);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1923); match(DOT);
				setState(1924); match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1926); match(VOID);
				setState(1927); match(DOT);
				setState(1928); match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1929); match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1930); typeName();
				setState(1931); match(DOT);
				setState(1932); match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1934); match(LPAREN);
				setState(1935); expression();
				setState(1936); match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1938); classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1939); fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1940); methodInvocation();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1941); methodReference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public ArrayAccess_lf_primaryContext arrayAccess_lf_primary() {
			return getRuleContext(ArrayAccess_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPrimaryNoNewArray_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPrimaryNoNewArray_lf_primary(this);
		}
	}

	public final PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_primaryNoNewArray_lf_primary);
		try {
			setState(1949);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1944); classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1945); fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1946); arrayAccess_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1947); methodInvocation_lf_primary();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1948); methodReference_lf_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);
		try {
			setState(1957);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1953); classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1954); fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1955); methodInvocation_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1956); methodReference_lf_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primaryContext extends ParserRuleContext {
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() {
			return getRuleContext(ArrayAccess_lfno_primaryContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPrimaryNoNewArray_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPrimaryNoNewArray_lfno_primary(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_primaryNoNewArray_lfno_primary);
		int _la;
		try {
			setState(1999);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1959); literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1960); typeName();
				setState(1965);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1961); match(LBRACK);
					setState(1962); match(RBRACK);
					}
					}
					setState(1967);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1968); match(DOT);
				setState(1969); match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1971); unannPrimitiveType();
				setState(1976);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1972); match(LBRACK);
					setState(1973); match(RBRACK);
					}
					}
					setState(1978);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1979); match(DOT);
				setState(1980); match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1982); match(VOID);
				setState(1983); match(DOT);
				setState(1984); match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1985); match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1986); typeName();
				setState(1987); match(DOT);
				setState(1988); match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1990); match(LPAREN);
				setState(1991); expression();
				setState(1992); match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1994); classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1995); fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1996); arrayAccess_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1997); methodInvocation_lfno_primary();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1998); methodReference_lfno_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);
		int _la;
		try {
			setState(2042);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2003); literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2004); typeName();
				setState(2009);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2005); match(LBRACK);
					setState(2006); match(RBRACK);
					}
					}
					setState(2011);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2012); match(DOT);
				setState(2013); match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2015); unannPrimitiveType();
				setState(2020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2016); match(LBRACK);
					setState(2017); match(RBRACK);
					}
					}
					setState(2022);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2023); match(DOT);
				setState(2024); match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2026); match(VOID);
				setState(2027); match(DOT);
				setState(2028); match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2029); match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2030); typeName();
				setState(2031); match(DOT);
				setState(2032); match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2034); match(LPAREN);
				setState(2035); expression();
				setState(2036); match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2038); classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2039); fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2040); methodInvocation_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2041); methodReference_lfno_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpressionContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(SimolJava8Parser.Identifier); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public TerminalNode Identifier(int i) {
			return getToken(SimolJava8Parser.Identifier, i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassInstanceCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterClassInstanceCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitClassInstanceCreationExpression(this);
		}
	}

	public final ClassInstanceCreationExpressionContext classInstanceCreationExpression() throws RecognitionException {
		ClassInstanceCreationExpressionContext _localctx = new ClassInstanceCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_classInstanceCreationExpression);
		int _la;
		try {
			setState(2127);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2044); match(NEW);
				setState(2046);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2045); typeArguments();
					}
				}

				setState(2051);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2048); annotation();
					}
					}
					setState(2053);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2054); match(Identifier);
				setState(2065);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2055); match(DOT);
					setState(2059);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2056); annotation();
						}
						}
						setState(2061);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2062); match(Identifier);
					}
					}
					setState(2067);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2069);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2068); typeArgumentsOrDiamond();
					}
				}

				setState(2071); match(LPAREN);
				setState(2073);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(2072); argumentList();
					}
				}

				setState(2075); match(RPAREN);
				setState(2077);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2076); classBody();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2079); expressionName();
				setState(2080); match(DOT);
				setState(2081); match(NEW);
				setState(2083);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2082); typeArguments();
					}
				}

				setState(2088);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2085); annotation();
					}
					}
					setState(2090);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2091); match(Identifier);
				setState(2093);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2092); typeArgumentsOrDiamond();
					}
				}

				setState(2095); match(LPAREN);
				setState(2097);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(2096); argumentList();
					}
				}

				setState(2099); match(RPAREN);
				setState(2101);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2100); classBody();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2103); primary();
				setState(2104); match(DOT);
				setState(2105); match(NEW);
				setState(2107);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2106); typeArguments();
					}
				}

				setState(2112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2109); annotation();
					}
					}
					setState(2114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2115); match(Identifier);
				setState(2117);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2116); typeArgumentsOrDiamond();
					}
				}

				setState(2119); match(LPAREN);
				setState(2121);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(2120); argumentList();
					}
				}

				setState(2123); match(RPAREN);
				setState(2125);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2124); classBody();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpression_lf_primaryContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassInstanceCreationExpression_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterClassInstanceCreationExpression_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitClassInstanceCreationExpression_lf_primary(this);
		}
	}

	public final ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lf_primaryContext _localctx = new ClassInstanceCreationExpression_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_classInstanceCreationExpression_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2129); match(DOT);
			setState(2130); match(NEW);
			setState(2132);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2131); typeArguments();
				}
			}

			setState(2137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2134); annotation();
				}
				}
				setState(2139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2140); match(Identifier);
			setState(2142);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2141); typeArgumentsOrDiamond();
				}
			}

			setState(2144); match(LPAREN);
			setState(2146);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(2145); argumentList();
				}
			}

			setState(2148); match(RPAREN);
			setState(2150);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				{
				setState(2149); classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpression_lfno_primaryContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(SimolJava8Parser.Identifier); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public TerminalNode Identifier(int i) {
			return getToken(SimolJava8Parser.Identifier, i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterClassInstanceCreationExpression_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitClassInstanceCreationExpression_lfno_primary(this);
		}
	}

	public final ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lfno_primaryContext _localctx = new ClassInstanceCreationExpression_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_classInstanceCreationExpression_lfno_primary);
		int _la;
		try {
			setState(2211);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(2152); match(NEW);
				setState(2154);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2153); typeArguments();
					}
				}

				setState(2159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2156); annotation();
					}
					}
					setState(2161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2162); match(Identifier);
				setState(2173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2163); match(DOT);
					setState(2167);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2164); annotation();
						}
						}
						setState(2169);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2170); match(Identifier);
					}
					}
					setState(2175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2177);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2176); typeArgumentsOrDiamond();
					}
				}

				setState(2179); match(LPAREN);
				setState(2181);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(2180); argumentList();
					}
				}

				setState(2183); match(RPAREN);
				setState(2185);
				switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(2184); classBody();
					}
					break;
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2187); expressionName();
				setState(2188); match(DOT);
				setState(2189); match(NEW);
				setState(2191);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2190); typeArguments();
					}
				}

				setState(2196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2193); annotation();
					}
					}
					setState(2198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2199); match(Identifier);
				setState(2201);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2200); typeArgumentsOrDiamond();
					}
				}

				setState(2203); match(LPAREN);
				setState(2205);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(2204); argumentList();
					}
				}

				setState(2207); match(RPAREN);
				setState(2209);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(2208); classBody();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitTypeArgumentsOrDiamond(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_typeArgumentsOrDiamond);
		try {
			setState(2216);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2213); typeArguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2214); match(LT);
				setState(2215); match(GT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccessContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public FieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitFieldAccess(this);
		}
	}

	public final FieldAccessContext fieldAccess() throws RecognitionException {
		FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_fieldAccess);
		try {
			setState(2231);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2218); primary();
				setState(2219); match(DOT);
				setState(2220); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2222); match(SUPER);
				setState(2223); match(DOT);
				setState(2224); match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2225); typeName();
				setState(2226); match(DOT);
				setState(2227); match(SUPER);
				setState(2228); match(DOT);
				setState(2229); match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_lf_primaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public FieldAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterFieldAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitFieldAccess_lf_primary(this);
		}
	}

	public final FieldAccess_lf_primaryContext fieldAccess_lf_primary() throws RecognitionException {
		FieldAccess_lf_primaryContext _localctx = new FieldAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_fieldAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2233); match(DOT);
			setState(2234); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_lfno_primaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FieldAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterFieldAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitFieldAccess_lfno_primary(this);
		}
	}

	public final FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() throws RecognitionException {
		FieldAccess_lfno_primaryContext _localctx = new FieldAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_fieldAccess_lfno_primary);
		try {
			setState(2245);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2236); match(SUPER);
				setState(2237); match(DOT);
				setState(2238); match(Identifier);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2239); typeName();
				setState(2240); match(DOT);
				setState(2241); match(SUPER);
				setState(2242); match(DOT);
				setState(2243); match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccessContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() {
			return getRuleContext(PrimaryNoNewArray_lfno_arrayAccessContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_arrayAccessContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_arrayAccessContext> primaryNoNewArray_lf_arrayAccess() {
			return getRuleContexts(PrimaryNoNewArray_lf_arrayAccessContext.class);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitArrayAccess(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2257);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				{
				setState(2247); expressionName();
				setState(2248); match(LBRACK);
				setState(2249); expression();
				setState(2250); match(RBRACK);
				}
				break;
			case 2:
				{
				setState(2252); primaryNoNewArray_lfno_arrayAccess();
				setState(2253); match(LBRACK);
				setState(2254); expression();
				setState(2255); match(RBRACK);
				}
				break;
			}
			setState(2266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(2259); primaryNoNewArray_lf_arrayAccess();
				setState(2260); match(LBRACK);
				setState(2261); expression();
				setState(2262); match(RBRACK);
				}
				}
				setState(2268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class,i);
		}
		public List<PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext> primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterArrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitArrayAccess_lf_primary(this);
		}
	}

	public final ArrayAccess_lf_primaryContext arrayAccess_lf_primary() throws RecognitionException {
		ArrayAccess_lf_primaryContext _localctx = new ArrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_arrayAccess_lf_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2269); primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
			setState(2270); match(LBRACK);
			setState(2271); expression();
			setState(2272); match(RBRACK);
			setState(2280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2273); primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();
					setState(2274); match(LBRACK);
					setState(2275); expression();
					setState(2276); match(RBRACK);
					}
					} 
				}
				setState(2282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_lfno_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext> primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() {
			return getRuleContexts(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class);
		}
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ArrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterArrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitArrayAccess_lfno_primary(this);
		}
	}

	public final ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() throws RecognitionException {
		ArrayAccess_lfno_primaryContext _localctx = new ArrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_arrayAccess_lfno_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2293);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				{
				setState(2283); expressionName();
				setState(2284); match(LBRACK);
				setState(2285); expression();
				setState(2286); match(RBRACK);
				}
				break;
			case 2:
				{
				setState(2288); primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
				setState(2289); match(LBRACK);
				setState(2290); expression();
				setState(2291); match(RBRACK);
				}
				break;
			}
			setState(2302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2295); primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();
					setState(2296); match(LBRACK);
					setState(2297); expression();
					setState(2298); match(RBRACK);
					}
					} 
				}
				setState(2304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocationContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterMethodInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitMethodInvocation(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_methodInvocation);
		int _la;
		try {
			setState(2373);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2305); methodName();
				setState(2306); match(LPAREN);
				setState(2308);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(2307); argumentList();
					}
				}

				setState(2310); match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2312); typeName();
				setState(2313); match(DOT);
				setState(2315);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2314); typeArguments();
					}
				}

				setState(2317); match(Identifier);
				setState(2318); match(LPAREN);
				setState(2320);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(2319); argumentList();
					}
				}

				setState(2322); match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2324); expressionName();
				setState(2325); match(DOT);
				setState(2327);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2326); typeArguments();
					}
				}

				setState(2329); match(Identifier);
				setState(2330); match(LPAREN);
				setState(2332);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(2331); argumentList();
					}
				}

				setState(2334); match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2336); primary();
				setState(2337); match(DOT);
				setState(2339);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2338); typeArguments();
					}
				}

				setState(2341); match(Identifier);
				setState(2342); match(LPAREN);
				setState(2344);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(2343); argumentList();
					}
				}

				setState(2346); match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2348); match(SUPER);
				setState(2349); match(DOT);
				setState(2351);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2350); typeArguments();
					}
				}

				setState(2353); match(Identifier);
				setState(2354); match(LPAREN);
				setState(2356);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(2355); argumentList();
					}
				}

				setState(2358); match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2359); typeName();
				setState(2360); match(DOT);
				setState(2361); match(SUPER);
				setState(2362); match(DOT);
				setState(2364);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2363); typeArguments();
					}
				}

				setState(2366); match(Identifier);
				setState(2367); match(LPAREN);
				setState(2369);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(2368); argumentList();
					}
				}

				setState(2371); match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_lf_primaryContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodInvocation_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterMethodInvocation_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitMethodInvocation_lf_primary(this);
		}
	}

	public final MethodInvocation_lf_primaryContext methodInvocation_lf_primary() throws RecognitionException {
		MethodInvocation_lf_primaryContext _localctx = new MethodInvocation_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_methodInvocation_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2375); match(DOT);
			setState(2377);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2376); typeArguments();
				}
			}

			setState(2379); match(Identifier);
			setState(2380); match(LPAREN);
			setState(2382);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(2381); argumentList();
				}
			}

			setState(2384); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_lfno_primaryContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterMethodInvocation_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitMethodInvocation_lfno_primary(this);
		}
	}

	public final MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() throws RecognitionException {
		MethodInvocation_lfno_primaryContext _localctx = new MethodInvocation_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_methodInvocation_lfno_primary);
		int _la;
		try {
			setState(2442);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2386); methodName();
				setState(2387); match(LPAREN);
				setState(2389);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(2388); argumentList();
					}
				}

				setState(2391); match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2393); typeName();
				setState(2394); match(DOT);
				setState(2396);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2395); typeArguments();
					}
				}

				setState(2398); match(Identifier);
				setState(2399); match(LPAREN);
				setState(2401);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(2400); argumentList();
					}
				}

				setState(2403); match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2405); expressionName();
				setState(2406); match(DOT);
				setState(2408);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2407); typeArguments();
					}
				}

				setState(2410); match(Identifier);
				setState(2411); match(LPAREN);
				setState(2413);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(2412); argumentList();
					}
				}

				setState(2415); match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2417); match(SUPER);
				setState(2418); match(DOT);
				setState(2420);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2419); typeArguments();
					}
				}

				setState(2422); match(Identifier);
				setState(2423); match(LPAREN);
				setState(2425);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(2424); argumentList();
					}
				}

				setState(2427); match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2428); typeName();
				setState(2429); match(DOT);
				setState(2430); match(SUPER);
				setState(2431); match(DOT);
				setState(2433);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2432); typeArguments();
					}
				}

				setState(2435); match(Identifier);
				setState(2436); match(LPAREN);
				setState(2438);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (IntegerLiteral - 79)) | (1L << (FloatingPointLiteral - 79)) | (1L << (BooleanLiteral - 79)) | (1L << (CharacterLiteral - 79)) | (1L << (StringLiteral - 79)) | (1L << (NullLiteral - 79)) | (1L << (LPAREN - 79)) | (1L << (BANG - 79)) | (1L << (TILDE - 79)) | (1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (ADD - 79)) | (1L << (SUB - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
					{
					setState(2437); argumentList();
					}
				}

				setState(2440); match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2444); expression();
			setState(2449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2445); match(COMMA);
				setState(2446); expression();
				}
				}
				setState(2451);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReferenceContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public MethodReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterMethodReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitMethodReference(this);
		}
	}

	public final MethodReferenceContext methodReference() throws RecognitionException {
		MethodReferenceContext _localctx = new MethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_methodReference);
		int _la;
		try {
			setState(2499);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2452); expressionName();
				setState(2453); match(COLONCOLON);
				setState(2455);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2454); typeArguments();
					}
				}

				setState(2457); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2459); referenceType();
				setState(2460); match(COLONCOLON);
				setState(2462);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2461); typeArguments();
					}
				}

				setState(2464); match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2466); primary();
				setState(2467); match(COLONCOLON);
				setState(2469);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2468); typeArguments();
					}
				}

				setState(2471); match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2473); match(SUPER);
				setState(2474); match(COLONCOLON);
				setState(2476);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2475); typeArguments();
					}
				}

				setState(2478); match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2479); typeName();
				setState(2480); match(DOT);
				setState(2481); match(SUPER);
				setState(2482); match(COLONCOLON);
				setState(2484);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2483); typeArguments();
					}
				}

				setState(2486); match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2488); classType();
				setState(2489); match(COLONCOLON);
				setState(2491);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2490); typeArguments();
					}
				}

				setState(2493); match(NEW);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2495); arrayType();
				setState(2496); match(COLONCOLON);
				setState(2497); match(NEW);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReference_lf_primaryContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public MethodReference_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterMethodReference_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitMethodReference_lf_primary(this);
		}
	}

	public final MethodReference_lf_primaryContext methodReference_lf_primary() throws RecognitionException {
		MethodReference_lf_primaryContext _localctx = new MethodReference_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_methodReference_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2501); match(COLONCOLON);
			setState(2503);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2502); typeArguments();
				}
			}

			setState(2505); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReference_lfno_primaryContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public MethodReference_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterMethodReference_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitMethodReference_lfno_primary(this);
		}
	}

	public final MethodReference_lfno_primaryContext methodReference_lfno_primary() throws RecognitionException {
		MethodReference_lfno_primaryContext _localctx = new MethodReference_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_methodReference_lfno_primary);
		int _la;
		try {
			setState(2547);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2507); expressionName();
				setState(2508); match(COLONCOLON);
				setState(2510);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2509); typeArguments();
					}
				}

				setState(2512); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2514); referenceType();
				setState(2515); match(COLONCOLON);
				setState(2517);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2516); typeArguments();
					}
				}

				setState(2519); match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2521); match(SUPER);
				setState(2522); match(COLONCOLON);
				setState(2524);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2523); typeArguments();
					}
				}

				setState(2526); match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2527); typeName();
				setState(2528); match(DOT);
				setState(2529); match(SUPER);
				setState(2530); match(COLONCOLON);
				setState(2532);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2531); typeArguments();
					}
				}

				setState(2534); match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2536); classType();
				setState(2537); match(COLONCOLON);
				setState(2539);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2538); typeArguments();
					}
				}

				setState(2541); match(NEW);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2543); arrayType();
				setState(2544); match(COLONCOLON);
				setState(2545); match(NEW);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreationExpressionContext extends ParserRuleContext {
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public DimExprsContext dimExprs() {
			return getRuleContext(DimExprsContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterArrayCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitArrayCreationExpression(this);
		}
	}

	public final ArrayCreationExpressionContext arrayCreationExpression() throws RecognitionException {
		ArrayCreationExpressionContext _localctx = new ArrayCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_arrayCreationExpression);
		try {
			setState(2571);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2549); match(NEW);
				setState(2550); primitiveType();
				setState(2551); dimExprs();
				setState(2553);
				switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
				case 1:
					{
					setState(2552); dims();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2555); match(NEW);
				setState(2556); classOrInterfaceType();
				setState(2557); dimExprs();
				setState(2559);
				switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
				case 1:
					{
					setState(2558); dims();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2561); match(NEW);
				setState(2562); primitiveType();
				setState(2563); dims();
				setState(2564); arrayInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2566); match(NEW);
				setState(2567); classOrInterfaceType();
				setState(2568); dims();
				setState(2569); arrayInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprsContext extends ParserRuleContext {
		public List<DimExprContext> dimExpr() {
			return getRuleContexts(DimExprContext.class);
		}
		public DimExprContext dimExpr(int i) {
			return getRuleContext(DimExprContext.class,i);
		}
		public DimExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterDimExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitDimExprs(this);
		}
	}

	public final DimExprsContext dimExprs() throws RecognitionException {
		DimExprsContext _localctx = new DimExprsContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2573); dimExpr();
			setState(2577);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2574); dimExpr();
					}
					} 
				}
				setState(2579);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DimExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterDimExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitDimExpr(this);
		}
	}

	public final DimExprContext dimExpr() throws RecognitionException {
		DimExprContext _localctx = new DimExprContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_dimExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2580); annotation();
				}
				}
				setState(2585);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2586); match(LBRACK);
			setState(2587); expression();
			setState(2588); match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2590); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_expression);
		try {
			setState(2594);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2592); lambdaExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2593); assignmentExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitLambdaExpression(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2596); lambdaParameters();
			setState(2597); match(ARROW);
			setState(2598); lambdaBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaParametersContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimolJava8Parser.Identifier, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public InferredFormalParameterListContext inferredFormalParameterList() {
			return getRuleContext(InferredFormalParameterListContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitLambdaParameters(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_lambdaParameters);
		int _la;
		try {
			setState(2610);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2600); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2601); match(LPAREN);
				setState(2603);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==WITH_COMPAT || _la==Identifier || _la==AT) {
					{
					setState(2602); formalParameterList();
					}
				}

				setState(2605); match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2606); match(LPAREN);
				setState(2607); inferredFormalParameterList();
				setState(2608); match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InferredFormalParameterListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(SimolJava8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SimolJava8Parser.Identifier, i);
		}
		public InferredFormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inferredFormalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterInferredFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitInferredFormalParameterList(this);
		}
	}

	public final InferredFormalParameterListContext inferredFormalParameterList() throws RecognitionException {
		InferredFormalParameterListContext _localctx = new InferredFormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_inferredFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2612); match(Identifier);
			setState(2617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2613); match(COMMA);
				setState(2614); match(Identifier);
				}
				}
				setState(2619);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitLambdaBody(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_lambdaBody);
		try {
			setState(2622);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2620); expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2621); block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_assignmentExpression);
		try {
			setState(2626);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2624); conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2625); assignment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2628); leftHandSide();
			setState(2629); assignmentOperator();
			setState(2630); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftHandSideContext extends ParserRuleContext {
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterLeftHandSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitLeftHandSide(this);
		}
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_leftHandSide);
		try {
			setState(2635);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2632); expressionName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2633); fieldAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2634); arrayAccess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2637);
			_la = _input.LA(1);
			if ( !(((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (ASSIGN - 94)) | (1L << (ADD_ASSIGN - 94)) | (1L << (SUB_ASSIGN - 94)) | (1L << (MUL_ASSIGN - 94)) | (1L << (DIV_ASSIGN - 94)) | (1L << (AND_ASSIGN - 94)) | (1L << (OR_ASSIGN - 94)) | (1L << (XOR_ASSIGN - 94)) | (1L << (MOD_ASSIGN - 94)) | (1L << (LSHIFT_ASSIGN - 94)) | (1L << (RSHIFT_ASSIGN - 94)) | (1L << (URSHIFT_ASSIGN - 94)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_conditionalExpression);
		try {
			setState(2646);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2639); conditionalOrExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2640); conditionalOrExpression(0);
				setState(2641); match(QUESTION);
				setState(2642); expression();
				setState(2643); match(COLON);
				setState(2644); conditionalExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitConditionalOrExpression(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		return conditionalOrExpression(0);
	}

	private ConditionalOrExpressionContext conditionalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, _parentState);
		ConditionalOrExpressionContext _prevctx = _localctx;
		int _startState = 436;
		enterRecursionRule(_localctx, 436, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2649); conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2656);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
					setState(2651);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2652); match(OR);
					setState(2653); conditionalAndExpression(0);
					}
					} 
				}
				setState(2658);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitConditionalAndExpression(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		return conditionalAndExpression(0);
	}

	private ConditionalAndExpressionContext conditionalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, _parentState);
		ConditionalAndExpressionContext _prevctx = _localctx;
		int _startState = 438;
		enterRecursionRule(_localctx, 438, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2660); inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2667);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
					setState(2662);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2663); match(AND);
					setState(2664); inclusiveOrExpression(0);
					}
					} 
				}
				setState(2669);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitInclusiveOrExpression(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 440;
		enterRecursionRule(_localctx, 440, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2671); exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2678);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(2673);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2674); match(BITOR);
					setState(2675); exclusiveOrExpression(0);
					}
					} 
				}
				setState(2680);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitExclusiveOrExpression(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 442;
		enterRecursionRule(_localctx, 442, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2682); andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2689);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(2684);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2685); match(CARET);
					setState(2686); andExpression(0);
					}
					} 
				}
				setState(2691);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 444;
		enterRecursionRule(_localctx, 444, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2693); equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2700);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(2695);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2696); match(BITAND);
					setState(2697); equalityExpression(0);
					}
					} 
				}
				setState(2702);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 446;
		enterRecursionRule(_localctx, 446, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2704); relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2714);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2712);
					switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2706);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2707); match(EQUAL);
						setState(2708); relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2709);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2710); match(NOTEQUAL);
						setState(2711); relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(2716);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 448;
		enterRecursionRule(_localctx, 448, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2718); shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2737);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2735);
					switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2720);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2721); match(LT);
						setState(2722); shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2723);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2724); match(GT);
						setState(2725); shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2726);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2727); match(LE);
						setState(2728); shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2729);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2730); match(GE);
						setState(2731); shiftExpression(0);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2732);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2733); match(INSTANCEOF);
						setState(2734); referenceType();
						}
						break;
					}
					} 
				}
				setState(2739);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitShiftExpression(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 450;
		enterRecursionRule(_localctx, 450, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2741); additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2758);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2756);
					switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2743);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2744); match(LT);
						setState(2745); match(LT);
						setState(2746); additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2747);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2748); match(GT);
						setState(2749); match(GT);
						setState(2750); additiveExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2751);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2752); match(GT);
						setState(2753); match(GT);
						setState(2754); match(GT);
						setState(2755); additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(2760);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 452;
		enterRecursionRule(_localctx, 452, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2762); multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2772);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2770);
					switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2764);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2765); match(ADD);
						setState(2766); multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2767);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2768); match(SUB);
						setState(2769); multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(2774);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 454;
		enterRecursionRule(_localctx, 454, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2776); unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2789);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2787);
					switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2778);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2779); match(MUL);
						setState(2780); unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2781);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2782); match(DIV);
						setState(2783); unaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2784);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2785); match(MOD);
						setState(2786); unaryExpression();
						}
						break;
					}
					} 
				}
				setState(2791);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_unaryExpression);
		try {
			setState(2799);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(2792); preIncrementExpression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(2793); preDecrementExpression();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(2794); match(ADD);
				setState(2795); unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(2796); match(SUB);
				setState(2797); unaryExpression();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2798); unaryExpressionNotPlusMinus();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreIncrementExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPreIncrementExpression(this);
		}
	}

	public final PreIncrementExpressionContext preIncrementExpression() throws RecognitionException {
		PreIncrementExpressionContext _localctx = new PreIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2801); match(INC);
			setState(2802); unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreDecrementExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPreDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPreDecrementExpression(this);
		}
	}

	public final PreDecrementExpressionContext preDecrementExpression() throws RecognitionException {
		PreDecrementExpressionContext _localctx = new PreDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2804); match(DEC);
			setState(2805); unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(2813);
			switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2807); postfixExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2808); match(TILDE);
				setState(2809); unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2810); match(BANG);
				setState(2811); unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2812); castExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public List<PostDecrementExpression_lf_postfixExpressionContext> postDecrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostDecrementExpression_lf_postfixExpressionContext.class);
		}
		public PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostIncrementExpression_lf_postfixExpressionContext.class,i);
		}
		public PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostDecrementExpression_lf_postfixExpressionContext.class,i);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<PostIncrementExpression_lf_postfixExpressionContext> postIncrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostIncrementExpression_lf_postfixExpressionContext.class);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPostfixExpression(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_postfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2817);
			switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
			case 1:
				{
				setState(2815); primary();
				}
				break;
			case 2:
				{
				setState(2816); expressionName();
				}
				break;
			}
			setState(2823);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,320,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(2821);
					switch (_input.LA(1)) {
					case INC:
						{
						setState(2819); postIncrementExpression_lf_postfixExpression();
						}
						break;
					case DEC:
						{
						setState(2820); postDecrementExpression_lf_postfixExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(2825);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,320,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPostIncrementExpression(this);
		}
	}

	public final PostIncrementExpressionContext postIncrementExpression() throws RecognitionException {
		PostIncrementExpressionContext _localctx = new PostIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2826); postfixExpression();
			setState(2827); match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public PostIncrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPostIncrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPostIncrementExpression_lf_postfixExpression(this);
		}
	}

	public final PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression() throws RecognitionException {
		PostIncrementExpression_lf_postfixExpressionContext _localctx = new PostIncrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_postIncrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2829); match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPostDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPostDecrementExpression(this);
		}
	}

	public final PostDecrementExpressionContext postDecrementExpression() throws RecognitionException {
		PostDecrementExpressionContext _localctx = new PostDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_postDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2831); postfixExpression();
			setState(2832); match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public PostDecrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterPostDecrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitPostDecrementExpression_lf_postfixExpression(this);
		}
	}

	public final PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression() throws RecognitionException {
		PostDecrementExpression_lf_postfixExpressionContext _localctx = new PostDecrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_postDecrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2834); match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimolJava8ParserListener ) ((SimolJava8ParserListener)listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_castExpression);
		int _la;
		try {
			setState(2863);
			switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2836); match(LPAREN);
				setState(2837); primitiveType();
				setState(2838); match(RPAREN);
				setState(2839); unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2841); match(LPAREN);
				setState(2842); referenceType();
				setState(2846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2843); additionalBound();
					}
					}
					setState(2848);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2849); match(RPAREN);
				setState(2850); unaryExpressionNotPlusMinus();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2852); match(LPAREN);
				setState(2853); referenceType();
				setState(2857);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2854); additionalBound();
					}
					}
					setState(2859);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2860); match(RPAREN);
				setState(2861); lambdaExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 25: return packageName_sempred((PackageNameContext)_localctx, predIndex);
		case 27: return packageOrTypeName_sempred((PackageOrTypeNameContext)_localctx, predIndex);
		case 30: return ambiguousName_sempred((AmbiguousNameContext)_localctx, predIndex);
		case 218: return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);
		case 219: return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);
		case 220: return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 221: return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 222: return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 223: return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 224: return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 225: return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 226: return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 227: return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16: return precpred(_ctx, 2);
		case 17: return precpred(_ctx, 1);
		case 15: return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18: return precpred(_ctx, 2);
		case 19: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean packageOrTypeName_sempred(PackageOrTypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10: return precpred(_ctx, 5);
		case 11: return precpred(_ctx, 4);
		case 12: return precpred(_ctx, 3);
		case 13: return precpred(_ctx, 2);
		case 14: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalAndExpression_sempred(ConditionalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20: return precpred(_ctx, 3);
		case 21: return precpred(_ctx, 2);
		case 22: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean ambiguousName_sempred(AmbiguousNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalOrExpression_sempred(ConditionalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8: return precpred(_ctx, 2);
		case 9: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean packageName_sempred(PackageNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0089\u0b34\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\3\2\3\2\3\3\7\3\u01e2"+
		"\n\3\f\3\16\3\u01e5\13\3\3\3\3\3\7\3\u01e9\n\3\f\3\16\3\u01ec\13\3\3\3"+
		"\5\3\u01ef\n\3\3\4\3\4\5\4\u01f3\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\5\7\u01fc"+
		"\n\7\3\b\3\b\5\b\u0200\n\b\3\b\3\b\7\b\u0204\n\b\f\b\16\b\u0207\13\b\3"+
		"\t\7\t\u020a\n\t\f\t\16\t\u020d\13\t\3\t\3\t\5\t\u0211\n\t\3\t\3\t\3\t"+
		"\7\t\u0216\n\t\f\t\16\t\u0219\13\t\3\t\3\t\5\t\u021d\n\t\5\t\u021f\n\t"+
		"\3\n\3\n\7\n\u0223\n\n\f\n\16\n\u0226\13\n\3\n\3\n\5\n\u022a\n\n\3\13"+
		"\7\13\u022d\n\13\f\13\16\13\u0230\13\13\3\13\3\13\5\13\u0234\n\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\7\17\u023d\n\17\f\17\16\17\u0240\13\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u024d\n\20\3\21"+
		"\7\21\u0250\n\21\f\21\16\21\u0253\13\21\3\21\3\21\3\21\7\21\u0258\n\21"+
		"\f\21\16\21\u025b\13\21\3\21\3\21\7\21\u025f\n\21\f\21\16\21\u0262\13"+
		"\21\3\22\7\22\u0265\n\22\f\22\16\22\u0268\13\22\3\22\3\22\5\22\u026c\n"+
		"\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\7\24\u0275\n\24\f\24\16\24\u0278"+
		"\13\24\5\24\u027a\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\7\27\u0286\n\27\f\27\16\27\u0289\13\27\3\30\3\30\5\30\u028d\n\30\3"+
		"\31\7\31\u0290\n\31\f\31\16\31\u0293\13\31\3\31\3\31\5\31\u0297\n\31\3"+
		"\32\3\32\3\32\3\32\5\32\u029d\n\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33"+
		"\u02a5\n\33\f\33\16\33\u02a8\13\33\3\34\3\34\3\34\3\34\3\34\5\34\u02af"+
		"\n\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u02b7\n\35\f\35\16\35\u02ba\13"+
		"\35\3\36\3\36\3\36\3\36\3\36\5\36\u02c1\n\36\3\37\3\37\3 \3 \3 \3 \3 "+
		"\3 \7 \u02cb\n \f \16 \u02ce\13 \3!\5!\u02d1\n!\3!\7!\u02d4\n!\f!\16!"+
		"\u02d7\13!\3!\7!\u02da\n!\f!\16!\u02dd\13!\3!\3!\3\"\7\"\u02e2\n\"\f\""+
		"\16\"\u02e5\13\"\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3$\3$\5$\u02f1\n$\3%\3%\3"+
		"%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3"+
		"(\3)\3)\3)\5)\u030e\n)\3*\3*\5*\u0312\n*\3+\7+\u0315\n+\f+\16+\u0318\13"+
		"+\3+\5+\u031b\n+\3+\3+\3+\5+\u0320\n+\3+\5+\u0323\n+\3+\5+\u0326\n+\3"+
		"+\3+\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0334\n-\3.\3.\3.\3.\3/\3/\3/\7"+
		"/\u033d\n/\f/\16/\u0340\13/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3"+
		"\62\7\62\u034b\n\62\f\62\16\62\u034e\13\62\3\63\3\63\7\63\u0352\n\63\f"+
		"\63\16\63\u0355\13\63\3\63\3\63\3\64\3\64\3\64\3\64\5\64\u035d\n\64\3"+
		"\65\3\65\3\65\3\65\3\65\5\65\u0364\n\65\3\66\7\66\u0367\n\66\f\66\16\66"+
		"\u036a\13\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\5\67\u037b\n\67\38\38\38\78\u0380\n8\f8\168\u0383\13"+
		"8\39\39\39\59\u0388\n9\3:\3:\5:\u038c\n:\3;\3;\5;\u0390\n;\3<\3<\5<\u0394"+
		"\n<\3=\3=\5=\u0398\n=\3>\3>\3>\5>\u039d\n>\3?\3?\5?\u03a1\n?\3?\3?\7?"+
		"\u03a5\n?\f?\16?\u03a8\13?\3@\3@\5@\u03ac\n@\3@\3@\3@\7@\u03b1\n@\f@\16"+
		"@\u03b4\13@\3@\3@\5@\u03b8\n@\5@\u03ba\n@\3A\3A\7A\u03be\nA\fA\16A\u03c1"+
		"\13A\3A\3A\5A\u03c5\nA\3B\3B\5B\u03c9\nB\3C\3C\3D\3D\3E\3E\3F\3F\3G\3"+
		"G\3G\3G\3G\3G\3G\3G\3G\5G\u03dc\nG\3H\7H\u03df\nH\fH\16H\u03e2\13H\3H"+
		"\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u03f6\nI\3J\3J"+
		"\3J\5J\u03fb\nJ\3J\3J\7J\u03ff\nJ\fJ\16J\u0402\13J\3J\3J\3J\5J\u0407\n"+
		"J\5J\u0409\nJ\3K\3K\5K\u040d\nK\3L\3L\3L\5L\u0412\nL\3L\3L\5L\u0416\n"+
		"L\3M\3M\3M\3M\3M\3M\5M\u041e\nM\3N\3N\3N\7N\u0423\nN\fN\16N\u0426\13N"+
		"\3N\3N\3N\7N\u042b\nN\fN\16N\u042e\13N\5N\u0430\nN\3O\7O\u0433\nO\fO\16"+
		"O\u0436\13O\3O\3O\3O\3P\3P\3P\5P\u043e\nP\3Q\7Q\u0441\nQ\fQ\16Q\u0444"+
		"\13Q\3Q\3Q\7Q\u0448\nQ\fQ\16Q\u044b\13Q\3Q\3Q\3Q\3Q\5Q\u0451\nQ\3R\7R"+
		"\u0454\nR\fR\16R\u0457\13R\3R\3R\3R\5R\u045c\nR\3R\3R\3S\3S\3S\3T\3T\3"+
		"T\7T\u0466\nT\fT\16T\u0469\13T\3U\3U\5U\u046d\nU\3V\3V\5V\u0471\nV\3W"+
		"\3W\3X\3X\3X\3Y\7Y\u0479\nY\fY\16Y\u047c\13Y\3Y\3Y\5Y\u0480\nY\3Y\3Y\3"+
		"Z\3Z\3Z\3Z\5Z\u0488\nZ\3[\5[\u048b\n[\3[\3[\3[\5[\u0490\n[\3[\3[\3\\\3"+
		"\\\3]\3]\5]\u0498\n]\3]\5]\u049b\n]\3]\3]\3^\5^\u04a0\n^\3^\3^\3^\5^\u04a5"+
		"\n^\3^\3^\3^\5^\u04aa\n^\3^\3^\3^\5^\u04af\n^\3^\3^\3^\3^\3^\5^\u04b6"+
		"\n^\3^\3^\3^\5^\u04bb\n^\3^\3^\3^\3^\3^\3^\5^\u04c3\n^\3^\3^\3^\5^\u04c8"+
		"\n^\3^\3^\3^\5^\u04cd\n^\3_\7_\u04d0\n_\f_\16_\u04d3\13_\3_\3_\3_\5_\u04d8"+
		"\n_\3_\3_\3`\3`\5`\u04de\n`\3`\5`\u04e1\n`\3`\5`\u04e4\n`\3`\3`\3a\3a"+
		"\3a\7a\u04eb\na\fa\16a\u04ee\13a\3b\7b\u04f1\nb\fb\16b\u04f4\13b\3b\3"+
		"b\3b\5b\u04f9\nb\3b\5b\u04fc\nb\3b\5b\u04ff\nb\3c\3c\3d\3d\7d\u0505\n"+
		"d\fd\16d\u0508\13d\3e\3e\5e\u050c\ne\3f\7f\u050f\nf\ff\16f\u0512\13f\3"+
		"f\3f\5f\u0516\nf\3f\3f\5f\u051a\nf\3f\5f\u051d\nf\3f\3f\3g\3g\3h\3h\3"+
		"h\3h\3h\3h\3h\5h\u052a\nh\3i\3i\3i\3j\3j\7j\u0531\nj\fj\16j\u0534\13j"+
		"\3j\3j\3k\3k\3k\3k\3k\5k\u053d\nk\3l\7l\u0540\nl\fl\16l\u0543\13l\3l\3"+
		"l\3l\3l\3m\3m\3m\3m\5m\u054d\nm\3n\7n\u0550\nn\fn\16n\u0553\13n\3n\3n"+
		"\3n\3o\3o\3o\3o\3o\3o\5o\u055e\no\3p\7p\u0561\np\fp\16p\u0564\13p\3p\3"+
		"p\3p\3p\3p\3q\3q\7q\u056d\nq\fq\16q\u0570\13q\3q\3q\3r\3r\3r\3r\3r\5r"+
		"\u0579\nr\3s\7s\u057c\ns\fs\16s\u057f\13s\3s\3s\3s\3s\3s\5s\u0586\ns\3"+
		"s\5s\u0589\ns\3s\3s\3t\3t\3t\5t\u0590\nt\3u\3u\3u\3v\3v\3v\5v\u0598\n"+
		"v\3w\3w\3w\3w\5w\u059e\nw\3w\3w\3x\3x\3x\7x\u05a5\nx\fx\16x\u05a8\13x"+
		"\3y\3y\3y\3y\3z\3z\3z\5z\u05b1\nz\3{\3{\5{\u05b5\n{\3{\5{\u05b8\n{\3{"+
		"\3{\3|\3|\3|\7|\u05bf\n|\f|\16|\u05c2\13|\3}\3}\3}\3~\3~\3~\3~\3~\3~\3"+
		"\177\3\177\5\177\u05cf\n\177\3\177\5\177\u05d2\n\177\3\177\3\177\3\u0080"+
		"\3\u0080\3\u0080\7\u0080\u05d9\n\u0080\f\u0080\16\u0080\u05dc\13\u0080"+
		"\3\u0081\3\u0081\5\u0081\u05e0\n\u0081\3\u0081\3\u0081\3\u0082\6\u0082"+
		"\u05e5\n\u0082\r\u0082\16\u0082\u05e6\3\u0083\3\u0083\3\u0083\5\u0083"+
		"\u05ec\n\u0083\3\u0084\3\u0084\3\u0084\3\u0085\7\u0085\u05f2\n\u0085\f"+
		"\u0085\16\u0085\u05f5\13\u0085\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u0600\n\u0086\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\5\u0087\u0607\n\u0087\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\5\u0088\u0615\n\u0088\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u062b\n\u008d\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u064d\n\u0091\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\7\u0093\u0657\n\u0093"+
		"\f\u0093\16\u0093\u065a\13\u0093\3\u0093\7\u0093\u065d\n\u0093\f\u0093"+
		"\16\u0093\u0660\13\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0095"+
		"\3\u0095\7\u0095\u0669\n\u0095\f\u0095\16\u0095\u066c\13\u0095\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\5\u0096\u0678\n\u0096\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098\3\u0098"+
		"\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009b\3\u009b"+
		"\5\u009b\u0692\n\u009b\3\u009c\3\u009c\5\u009c\u0696\n\u009c\3\u009d\3"+
		"\u009d\3\u009d\5\u009d\u069b\n\u009d\3\u009d\3\u009d\5\u009d\u069f\n\u009d"+
		"\3\u009d\3\u009d\5\u009d\u06a3\n\u009d\3\u009d\3\u009d\3\u009d\3\u009e"+
		"\3\u009e\3\u009e\5\u009e\u06ab\n\u009e\3\u009e\3\u009e\5\u009e\u06af\n"+
		"\u009e\3\u009e\3\u009e\5\u009e\u06b3\n\u009e\3\u009e\3\u009e\3\u009e\3"+
		"\u009f\3\u009f\5\u009f\u06ba\n\u009f\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3"+
		"\u00a1\7\u00a1\u06c1\n\u00a1\f\u00a1\16\u00a1\u06c4\13\u00a1\3\u00a2\3"+
		"\u00a2\3\u00a2\7\u00a2\u06c9\n\u00a2\f\u00a2\16\u00a2\u06cc\13\u00a2\3"+
		"\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3"+
		"\3\u00a3\7\u00a3\u06d8\n\u00a3\f\u00a3\16\u00a3\u06db\13\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\5\u00a4"+
		"\u06e6\n\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\5\u00a5\u06ec\n\u00a5\3"+
		"\u00a5\3\u00a5\3\u00a6\3\u00a6\5\u00a6\u06f2\n\u00a6\3\u00a6\3\u00a6\3"+
		"\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9"+
		"\u0707\n\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u070c\n\u00a9\3\u00aa\3"+
		"\u00aa\7\u00aa\u0710\n\u00aa\f\u00aa\16\u00aa\u0713\13\u00aa\3\u00ab\3"+
		"\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ac\7\u00ac\u071c\n\u00ac\f"+
		"\u00ac\16\u00ac\u071f\13\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad"+
		"\3\u00ad\7\u00ad\u0727\n\u00ad\f\u00ad\16\u00ad\u072a\13\u00ad\3\u00ae"+
		"\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\3\u00af\5\u00af\u0733\n\u00af"+
		"\3\u00af\5\u00af\u0736\n\u00af\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u073b\n"+
		"\u00b0\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b1\7\u00b1\u0742\n\u00b1\f"+
		"\u00b1\16\u00b1\u0745\13\u00b1\3\u00b2\7\u00b2\u0748\n\u00b2\f\u00b2\16"+
		"\u00b2\u074b\13\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b3"+
		"\3\u00b3\5\u00b3\u0754\n\u00b3\3\u00b3\7\u00b3\u0757\n\u00b3\f\u00b3\16"+
		"\u00b3\u075a\13\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4\7\u00b4\u0760\n"+
		"\u00b4\f\u00b4\16\u00b4\u0763\13\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u0779"+
		"\n\u00b4\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\7\u00b6\u0781"+
		"\n\u00b6\f\u00b6\16\u00b6\u0784\13\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u0799\n\u00b6"+
		"\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u07a0\n\u00b7\3\u00b8"+
		"\3\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u07a8\n\u00b9\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\7\u00ba\u07ae\n\u00ba\f\u00ba\16\u00ba\u07b1"+
		"\13\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\7\u00ba\u07b9"+
		"\n\u00ba\f\u00ba\16\u00ba\u07bc\13\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u07d2"+
		"\n\u00ba\3\u00bb\3\u00bb\3\u00bc\3\u00bc\3\u00bc\3\u00bc\7\u00bc\u07da"+
		"\n\u00bc\f\u00bc\16\u00bc\u07dd\13\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\7\u00bc\u07e5\n\u00bc\f\u00bc\16\u00bc\u07e8\13\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\5\u00bc\u07fd\n\u00bc\3\u00bd\3\u00bd\5\u00bd\u0801\n\u00bd\3"+
		"\u00bd\7\u00bd\u0804\n\u00bd\f\u00bd\16\u00bd\u0807\13\u00bd\3\u00bd\3"+
		"\u00bd\3\u00bd\7\u00bd\u080c\n\u00bd\f\u00bd\16\u00bd\u080f\13\u00bd\3"+
		"\u00bd\7\u00bd\u0812\n\u00bd\f\u00bd\16\u00bd\u0815\13\u00bd\3\u00bd\5"+
		"\u00bd\u0818\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u081c\n\u00bd\3\u00bd\3\u00bd"+
		"\5\u00bd\u0820\n\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0826\n"+
		"\u00bd\3\u00bd\7\u00bd\u0829\n\u00bd\f\u00bd\16\u00bd\u082c\13\u00bd\3"+
		"\u00bd\3\u00bd\5\u00bd\u0830\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u0834\n\u00bd"+
		"\3\u00bd\3\u00bd\5\u00bd\u0838\n\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\5\u00bd\u083e\n\u00bd\3\u00bd\7\u00bd\u0841\n\u00bd\f\u00bd\16\u00bd"+
		"\u0844\13\u00bd\3\u00bd\3\u00bd\5\u00bd\u0848\n\u00bd\3\u00bd\3\u00bd"+
		"\5\u00bd\u084c\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u0850\n\u00bd\5\u00bd\u0852"+
		"\n\u00bd\3\u00be\3\u00be\3\u00be\5\u00be\u0857\n\u00be\3\u00be\7\u00be"+
		"\u085a\n\u00be\f\u00be\16\u00be\u085d\13\u00be\3\u00be\3\u00be\5\u00be"+
		"\u0861\n\u00be\3\u00be\3\u00be\5\u00be\u0865\n\u00be\3\u00be\3\u00be\5"+
		"\u00be\u0869\n\u00be\3\u00bf\3\u00bf\5\u00bf\u086d\n\u00bf\3\u00bf\7\u00bf"+
		"\u0870\n\u00bf\f\u00bf\16\u00bf\u0873\13\u00bf\3\u00bf\3\u00bf\3\u00bf"+
		"\7\u00bf\u0878\n\u00bf\f\u00bf\16\u00bf\u087b\13\u00bf\3\u00bf\7\u00bf"+
		"\u087e\n\u00bf\f\u00bf\16\u00bf\u0881\13\u00bf\3\u00bf\5\u00bf\u0884\n"+
		"\u00bf\3\u00bf\3\u00bf\5\u00bf\u0888\n\u00bf\3\u00bf\3\u00bf\5\u00bf\u088c"+
		"\n\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u0892\n\u00bf\3\u00bf"+
		"\7\u00bf\u0895\n\u00bf\f\u00bf\16\u00bf\u0898\13\u00bf\3\u00bf\3\u00bf"+
		"\5\u00bf\u089c\n\u00bf\3\u00bf\3\u00bf\5\u00bf\u08a0\n\u00bf\3\u00bf\3"+
		"\u00bf\5\u00bf\u08a4\n\u00bf\5\u00bf\u08a6\n\u00bf\3\u00c0\3\u00c0\3\u00c0"+
		"\5\u00c0\u08ab\n\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u08ba"+
		"\n\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u08c8\n\u00c3\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4"+
		"\u08d4\n\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\7\u00c4\u08db\n"+
		"\u00c4\f\u00c4\16\u00c4\u08de\13\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\7\u00c5\u08e9\n\u00c5\f\u00c5"+
		"\16\u00c5\u08ec\13\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u08f8\n\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\7\u00c6\u08ff\n\u00c6\f\u00c6\16\u00c6\u0902"+
		"\13\u00c6\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0907\n\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u090e\n\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\5\u00c7\u0913\n\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7"+
		"\u091a\n\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u091f\n\u00c7\3\u00c7\3"+
		"\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0926\n\u00c7\3\u00c7\3\u00c7\3"+
		"\u00c7\5\u00c7\u092b\n\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5"+
		"\u00c7\u0932\n\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0937\n\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u093f\n\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\5\u00c7\u0944\n\u00c7\3\u00c7\3\u00c7\5\u00c7\u0948\n"+
		"\u00c7\3\u00c8\3\u00c8\5\u00c8\u094c\n\u00c8\3\u00c8\3\u00c8\3\u00c8\5"+
		"\u00c8\u0951\n\u00c8\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0958"+
		"\n\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u095f\n\u00c9"+
		"\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0964\n\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\3\u00c9\5\u00c9\u096b\n\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9"+
		"\u0970\n\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0977\n"+
		"\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u097c\n\u00c9\3\u00c9\3\u00c9\3"+
		"\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0984\n\u00c9\3\u00c9\3\u00c9\3"+
		"\u00c9\5\u00c9\u0989\n\u00c9\3\u00c9\3\u00c9\5\u00c9\u098d\n\u00c9\3\u00ca"+
		"\3\u00ca\3\u00ca\7\u00ca\u0992\n\u00ca\f\u00ca\16\u00ca\u0995\13\u00ca"+
		"\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u099a\n\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\5\u00cb\u09a1\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\5\u00cb\u09a8\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\5\u00cb\u09af\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\5\u00cb\u09b7\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb"+
		"\u09be\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb"+
		"\u09c6\n\u00cb\3\u00cc\3\u00cc\5\u00cc\u09ca\n\u00cc\3\u00cc\3\u00cc\3"+
		"\u00cd\3\u00cd\3\u00cd\5\u00cd\u09d1\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3"+
		"\u00cd\3\u00cd\5\u00cd\u09d8\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3"+
		"\u00cd\5\u00cd\u09df\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3"+
		"\u00cd\5\u00cd\u09e7\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5"+
		"\u00cd\u09ee\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5"+
		"\u00cd\u09f6\n\u00cd\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u09fc\n\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u0a02\n\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce"+
		"\u0a0e\n\u00ce\3\u00cf\3\u00cf\7\u00cf\u0a12\n\u00cf\f\u00cf\16\u00cf"+
		"\u0a15\13\u00cf\3\u00d0\7\u00d0\u0a18\n\u00d0\f\u00d0\16\u00d0\u0a1b\13"+
		"\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d1\3\u00d1\3\u00d2\3\u00d2"+
		"\5\u00d2\u0a25\n\u00d2\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d4\3\u00d4"+
		"\3\u00d4\5\u00d4\u0a2e\n\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4"+
		"\5\u00d4\u0a35\n\u00d4\3\u00d5\3\u00d5\3\u00d5\7\u00d5\u0a3a\n\u00d5\f"+
		"\u00d5\16\u00d5\u0a3d\13\u00d5\3\u00d6\3\u00d6\5\u00d6\u0a41\n\u00d6\3"+
		"\u00d7\3\u00d7\5\u00d7\u0a45\n\u00d7\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3"+
		"\u00d9\3\u00d9\3\u00d9\5\u00d9\u0a4e\n\u00d9\3\u00da\3\u00da\3\u00db\3"+
		"\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\5\u00db\u0a59\n\u00db\3"+
		"\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\7\u00dc\u0a61\n\u00dc\f"+
		"\u00dc\16\u00dc\u0a64\13\u00dc\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\7\u00dd\u0a6c\n\u00dd\f\u00dd\16\u00dd\u0a6f\13\u00dd\3\u00de"+
		"\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\7\u00de\u0a77\n\u00de\f\u00de"+
		"\16\u00de\u0a7a\13\u00de\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df"+
		"\7\u00df\u0a82\n\u00df\f\u00df\16\u00df\u0a85\13\u00df\3\u00e0\3\u00e0"+
		"\3\u00e0\3\u00e0\3\u00e0\3\u00e0\7\u00e0\u0a8d\n\u00e0\f\u00e0\16\u00e0"+
		"\u0a90\13\u00e0\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e1\7\u00e1\u0a9b\n\u00e1\f\u00e1\16\u00e1\u0a9e\13\u00e1"+
		"\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2"+
		"\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2"+
		"\7\u00e2\u0ab2\n\u00e2\f\u00e2\16\u00e2\u0ab5\13\u00e2\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\7\u00e3\u0ac7\n\u00e3\f\u00e3"+
		"\16\u00e3\u0aca\13\u00e3\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4"+
		"\3\u00e4\3\u00e4\3\u00e4\7\u00e4\u0ad5\n\u00e4\f\u00e4\16\u00e4\u0ad8"+
		"\13\u00e4\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\7\u00e5\u0ae6\n\u00e5\f\u00e5\16\u00e5"+
		"\u0ae9\13\u00e5\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6"+
		"\5\u00e6\u0af2\n\u00e6\3\u00e7\3\u00e7\3\u00e7\3\u00e8\3\u00e8\3\u00e8"+
		"\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\5\u00e9\u0b00\n\u00e9"+
		"\3\u00ea\3\u00ea\5\u00ea\u0b04\n\u00ea\3\u00ea\3\u00ea\7\u00ea\u0b08\n"+
		"\u00ea\f\u00ea\16\u00ea\u0b0b\13\u00ea\3\u00eb\3\u00eb\3\u00eb\3\u00ec"+
		"\3\u00ec\3\u00ed\3\u00ed\3\u00ed\3\u00ee\3\u00ee\3\u00ef\3\u00ef\3\u00ef"+
		"\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\7\u00ef\u0b1f\n\u00ef\f\u00ef"+
		"\16\u00ef\u0b22\13\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef"+
		"\7\u00ef\u0b2a\n\u00ef\f\u00ef\16\u00ef\u0b2d\13\u00ef\3\u00ef\3\u00ef"+
		"\3\u00ef\5\u00ef\u0b32\n\u00ef\3\u00ef\2\17\648>\u01b6\u01b8\u01ba\u01bc"+
		"\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u00f0\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae"+
		"\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6"+
		"\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de"+
		"\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6"+
		"\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e"+
		"\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126"+
		"\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e"+
		"\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156"+
		"\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e"+
		"\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186"+
		"\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e"+
		"\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6"+
		"\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce"+
		"\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\2\b\3\2QV\7\2\7\7\n\n\35\35"+
		"\37\37\'\'\4\2\20\20\26\26\4\2\66=MP\3\2@D\4\2``y\u0083\u0c2e\2\u01de"+
		"\3\2\2\2\4\u01ee\3\2\2\2\6\u01f2\3\2\2\2\b\u01f4\3\2\2\2\n\u01f6\3\2\2"+
		"\2\f\u01fb\3\2\2\2\16\u01ff\3\2\2\2\20\u021e\3\2\2\2\22\u0220\3\2\2\2"+
		"\24\u022e\3\2\2\2\26\u0235\3\2\2\2\30\u0237\3\2\2\2\32\u0239\3\2\2\2\34"+
		"\u023e\3\2\2\2\36\u024c\3\2\2\2 \u0251\3\2\2\2\"\u0266\3\2\2\2$\u026d"+
		"\3\2\2\2&\u0279\3\2\2\2(\u027b\3\2\2\2*\u027e\3\2\2\2,\u0282\3\2\2\2."+
		"\u028c\3\2\2\2\60\u0291\3\2\2\2\62\u029c\3\2\2\2\64\u029e\3\2\2\2\66\u02ae"+
		"\3\2\2\28\u02b0\3\2\2\2:\u02c0\3\2\2\2<\u02c2\3\2\2\2>\u02c4\3\2\2\2@"+
		"\u02d0\3\2\2\2B\u02e3\3\2\2\2D\u02ea\3\2\2\2F\u02f0\3\2\2\2H\u02f2\3\2"+
		"\2\2J\u02f6\3\2\2\2L\u02fc\3\2\2\2N\u0303\3\2\2\2P\u030d\3\2\2\2R\u0311"+
		"\3\2\2\2T\u0316\3\2\2\2V\u0329\3\2\2\2X\u0333\3\2\2\2Z\u0335\3\2\2\2\\"+
		"\u0339\3\2\2\2^\u0341\3\2\2\2`\u0344\3\2\2\2b\u0347\3\2\2\2d\u034f\3\2"+
		"\2\2f\u035c\3\2\2\2h\u0363\3\2\2\2j\u0368\3\2\2\2l\u037a\3\2\2\2n\u037c"+
		"\3\2\2\2p\u0384\3\2\2\2r\u0389\3\2\2\2t\u038f\3\2\2\2v\u0393\3\2\2\2x"+
		"\u0397\3\2\2\2z\u039c\3\2\2\2|\u03a0\3\2\2\2~\u03b9\3\2\2\2\u0080\u03bb"+
		"\3\2\2\2\u0082\u03c6\3\2\2\2\u0084\u03ca\3\2\2\2\u0086\u03cc\3\2\2\2\u0088"+
		"\u03ce\3\2\2\2\u008a\u03d0\3\2\2\2\u008c\u03db\3\2\2\2\u008e\u03e0\3\2"+
		"\2\2\u0090\u03f5\3\2\2\2\u0092\u0408\3\2\2\2\u0094\u040c\3\2\2\2\u0096"+
		"\u040e\3\2\2\2\u0098\u041d\3\2\2\2\u009a\u042f\3\2\2\2\u009c\u0434\3\2"+
		"\2\2\u009e\u043d\3\2\2\2\u00a0\u0450\3\2\2\2\u00a2\u0455\3\2\2\2\u00a4"+
		"\u045f\3\2\2\2\u00a6\u0462\3\2\2\2\u00a8\u046c\3\2\2\2\u00aa\u0470\3\2"+
		"\2\2\u00ac\u0472\3\2\2\2\u00ae\u0474\3\2\2\2\u00b0\u047a\3\2\2\2\u00b2"+
		"\u0487\3\2\2\2\u00b4\u048a\3\2\2\2\u00b6\u0493\3\2\2\2\u00b8\u0495\3\2"+
		"\2\2\u00ba\u04cc\3\2\2\2\u00bc\u04d1\3\2\2\2\u00be\u04db\3\2\2\2\u00c0"+
		"\u04e7\3\2\2\2\u00c2\u04f2\3\2\2\2\u00c4\u0500\3\2\2\2\u00c6\u0502\3\2"+
		"\2\2\u00c8\u050b\3\2\2\2\u00ca\u0510\3\2\2\2\u00cc\u0520\3\2\2\2\u00ce"+
		"\u0529\3\2\2\2\u00d0\u052b\3\2\2\2\u00d2\u052e\3\2\2\2\u00d4\u053c\3\2"+
		"\2\2\u00d6\u0541\3\2\2\2\u00d8\u054c\3\2\2\2\u00da\u0551\3\2\2\2\u00dc"+
		"\u055d\3\2\2\2\u00de\u0562\3\2\2\2\u00e0\u056a\3\2\2\2\u00e2\u0578\3\2"+
		"\2\2\u00e4\u057d\3\2\2\2\u00e6\u058f\3\2\2\2\u00e8\u0591\3\2\2\2\u00ea"+
		"\u0597\3\2\2\2\u00ec\u0599\3\2\2\2\u00ee\u05a1\3\2\2\2\u00f0\u05a9\3\2"+
		"\2\2\u00f2\u05b0\3\2\2\2\u00f4\u05b2\3\2\2\2\u00f6\u05bb\3\2\2\2\u00f8"+
		"\u05c3\3\2\2\2\u00fa\u05c6\3\2\2\2\u00fc\u05cc\3\2\2\2\u00fe\u05d5\3\2"+
		"\2\2\u0100\u05dd\3\2\2\2\u0102\u05e4\3\2\2\2\u0104\u05eb\3\2\2\2\u0106"+
		"\u05ed\3\2\2\2\u0108\u05f3\3\2\2\2\u010a\u05ff\3\2\2\2\u010c\u0606\3\2"+
		"\2\2\u010e\u0614\3\2\2\2\u0110\u0616\3\2\2\2\u0112\u0618\3\2\2\2\u0114"+
		"\u061c\3\2\2\2\u0116\u0620\3\2\2\2\u0118\u062a\3\2\2\2\u011a\u062c\3\2"+
		"\2\2\u011c\u0632\3\2\2\2\u011e\u063a\3\2\2\2\u0120\u064c\3\2\2\2\u0122"+
		"\u064e\3\2\2\2\u0124\u0654\3\2\2\2\u0126\u0663\3\2\2\2\u0128\u0666\3\2"+
		"\2\2\u012a\u0677\3\2\2\2\u012c\u0679\3\2\2\2\u012e\u067b\3\2\2\2\u0130"+
		"\u0681\3\2\2\2\u0132\u0687\3\2\2\2\u0134\u0691\3\2\2\2\u0136\u0695\3\2"+
		"\2\2\u0138\u0697\3\2\2\2\u013a\u06a7\3\2\2\2\u013c\u06b9\3\2\2\2\u013e"+
		"\u06bb\3\2\2\2\u0140\u06bd\3\2\2\2\u0142\u06c5\3\2\2\2\u0144\u06d4\3\2"+
		"\2\2\u0146\u06e3\3\2\2\2\u0148\u06e9\3\2\2\2\u014a\u06ef\3\2\2\2\u014c"+
		"\u06f5\3\2\2\2\u014e\u06f9\3\2\2\2\u0150\u070b\3\2\2\2\u0152\u070d\3\2"+
		"\2\2\u0154\u0714\3\2\2\2\u0156\u071d\3\2\2\2\u0158\u0723\3\2\2\2\u015a"+
		"\u072b\3\2\2\2\u015c\u072e\3\2\2\2\u015e\u0737\3\2\2\2\u0160\u073e\3\2"+
		"\2\2\u0162\u0749\3\2\2\2\u0164\u0753\3\2\2\2\u0166\u0778\3\2\2\2\u0168"+
		"\u077a\3\2\2\2\u016a\u0798\3\2\2\2\u016c\u079f\3\2\2\2\u016e\u07a1\3\2"+
		"\2\2\u0170\u07a7\3\2\2\2\u0172\u07d1\3\2\2\2\u0174\u07d3\3\2\2\2\u0176"+
		"\u07fc\3\2\2\2\u0178\u0851\3\2\2\2\u017a\u0853\3\2\2\2\u017c\u08a5\3\2"+
		"\2\2\u017e\u08aa\3\2\2\2\u0180\u08b9\3\2\2\2\u0182\u08bb\3\2\2\2\u0184"+
		"\u08c7\3\2\2\2\u0186\u08d3\3\2\2\2\u0188\u08df\3\2\2\2\u018a\u08f7\3\2"+
		"\2\2\u018c\u0947\3\2\2\2\u018e\u0949\3\2\2\2\u0190\u098c\3\2\2\2\u0192"+
		"\u098e\3\2\2\2\u0194\u09c5\3\2\2\2\u0196\u09c7\3\2\2\2\u0198\u09f5\3\2"+
		"\2\2\u019a\u0a0d\3\2\2\2\u019c\u0a0f\3\2\2\2\u019e\u0a19\3\2\2\2\u01a0"+
		"\u0a20\3\2\2\2\u01a2\u0a24\3\2\2\2\u01a4\u0a26\3\2\2\2\u01a6\u0a34\3\2"+
		"\2\2\u01a8\u0a36\3\2\2\2\u01aa\u0a40\3\2\2\2\u01ac\u0a44\3\2\2\2\u01ae"+
		"\u0a46\3\2\2\2\u01b0\u0a4d\3\2\2\2\u01b2\u0a4f\3\2\2\2\u01b4\u0a58\3\2"+
		"\2\2\u01b6\u0a5a\3\2\2\2\u01b8\u0a65\3\2\2\2\u01ba\u0a70\3\2\2\2\u01bc"+
		"\u0a7b\3\2\2\2\u01be\u0a86\3\2\2\2\u01c0\u0a91\3\2\2\2\u01c2\u0a9f\3\2"+
		"\2\2\u01c4\u0ab6\3\2\2\2\u01c6\u0acb\3\2\2\2\u01c8\u0ad9\3\2\2\2\u01ca"+
		"\u0af1\3\2\2\2\u01cc\u0af3\3\2\2\2\u01ce\u0af6\3\2\2\2\u01d0\u0aff\3\2"+
		"\2\2\u01d2\u0b03\3\2\2\2\u01d4\u0b0c\3\2\2\2\u01d6\u0b0f\3\2\2\2\u01d8"+
		"\u0b11\3\2\2\2\u01da\u0b14\3\2\2\2\u01dc\u0b31\3\2\2\2\u01de\u01df\t\2"+
		"\2\2\u01df\3\3\2\2\2\u01e0\u01e2\5\u00eav\2\u01e1\u01e0\3\2\2\2\u01e2"+
		"\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\3\2"+
		"\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01ef\5\6\4\2\u01e7\u01e9\5\u00eav\2\u01e8"+
		"\u01e7\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2"+
		"\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01ef\7\5\2\2\u01ee"+
		"\u01e3\3\2\2\2\u01ee\u01ea\3\2\2\2\u01ef\5\3\2\2\2\u01f0\u01f3\5\b\5\2"+
		"\u01f1\u01f3\5\n\6\2\u01f2\u01f0\3\2\2\2\u01f2\u01f1\3\2\2\2\u01f3\7\3"+
		"\2\2\2\u01f4\u01f5\t\3\2\2\u01f5\t\3\2\2\2\u01f6\u01f7\t\4\2\2\u01f7\13"+
		"\3\2\2\2\u01f8\u01fc\5\16\b\2\u01f9\u01fc\5\34\17\2\u01fa\u01fc\5\36\20"+
		"\2\u01fb\u01f8\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fc\r"+
		"\3\2\2\2\u01fd\u0200\5\24\13\2\u01fe\u0200\5\32\16\2\u01ff\u01fd\3\2\2"+
		"\2\u01ff\u01fe\3\2\2\2\u0200\u0205\3\2\2\2\u0201\u0204\5\22\n\2\u0202"+
		"\u0204\5\30\r\2\u0203\u0201\3\2\2\2\u0203\u0202\3\2\2\2\u0204\u0207\3"+
		"\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\17\3\2\2\2\u0207"+
		"\u0205\3\2\2\2\u0208\u020a\5\u00eav\2\u0209\u0208\3\2\2\2\u020a\u020d"+
		"\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e\3\2\2\2\u020d"+
		"\u020b\3\2\2\2\u020e\u0210\7\u0084\2\2\u020f\u0211\5*\26\2\u0210\u020f"+
		"\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u021f\3\2\2\2\u0212\u0213\5\16\b\2"+
		"\u0213\u0217\7_\2\2\u0214\u0216\5\u00eav\2\u0215\u0214\3\2\2\2\u0216\u0219"+
		"\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021a\3\2\2\2\u0219"+
		"\u0217\3\2\2\2\u021a\u021c\7\u0084\2\2\u021b\u021d\5*\26\2\u021c\u021b"+
		"\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021f\3\2\2\2\u021e\u020b\3\2\2\2\u021e"+
		"\u0212\3\2\2\2\u021f\21\3\2\2\2\u0220\u0224\7_\2\2\u0221\u0223\5\u00ea"+
		"v\2\u0222\u0221\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224"+
		"\u0225\3\2\2\2\u0225\u0227\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u0229\7\u0084"+
		"\2\2\u0228\u022a\5*\26\2\u0229\u0228\3\2\2\2\u0229\u022a\3\2\2\2\u022a"+
		"\23\3\2\2\2\u022b\u022d\5\u00eav\2\u022c\u022b\3\2\2\2\u022d\u0230\3\2"+
		"\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\3\2\2\2\u0230"+
		"\u022e\3\2\2\2\u0231\u0233\7\u0084\2\2\u0232\u0234\5*\26\2\u0233\u0232"+
		"\3\2\2\2\u0233\u0234\3\2\2\2\u0234\25\3\2\2\2\u0235\u0236\5\20\t\2\u0236"+
		"\27\3\2\2\2\u0237\u0238\5\22\n\2\u0238\31\3\2\2\2\u0239\u023a\5\24\13"+
		"\2\u023a\33\3\2\2\2\u023b\u023d\5\u00eav\2\u023c\u023b\3\2\2\2\u023d\u0240"+
		"\3\2\2\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0241\3\2\2\2\u0240"+
		"\u023e\3\2\2\2\u0241\u0242\7\u0084\2\2\u0242\35\3\2\2\2\u0243\u0244\5"+
		"\4\3\2\u0244\u0245\5 \21\2\u0245\u024d\3\2\2\2\u0246\u0247\5\16\b\2\u0247"+
		"\u0248\5 \21\2\u0248\u024d\3\2\2\2\u0249\u024a\5\34\17\2\u024a\u024b\5"+
		" \21\2\u024b\u024d\3\2\2\2\u024c\u0243\3\2\2\2\u024c\u0246\3\2\2\2\u024c"+
		"\u0249\3\2\2\2\u024d\37\3\2\2\2\u024e\u0250\5\u00eav\2\u024f\u024e\3\2"+
		"\2\2\u0250\u0253\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252"+
		"\u0254\3\2\2\2\u0253\u0251\3\2\2\2\u0254\u0255\7[\2\2\u0255\u0260\7\\"+
		"\2\2\u0256\u0258\5\u00eav\2\u0257\u0256\3\2\2\2\u0258\u025b\3\2\2\2\u0259"+
		"\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025c\3\2\2\2\u025b\u0259\3\2"+
		"\2\2\u025c\u025d\7[\2\2\u025d\u025f\7\\\2\2\u025e\u0259\3\2\2\2\u025f"+
		"\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261!\3\2\2\2"+
		"\u0262\u0260\3\2\2\2\u0263\u0265\5$\23\2\u0264\u0263\3\2\2\2\u0265\u0268"+
		"\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0269\3\2\2\2\u0268"+
		"\u0266\3\2\2\2\u0269\u026b\7\u0084\2\2\u026a\u026c\5&\24\2\u026b\u026a"+
		"\3\2\2\2\u026b\u026c\3\2\2\2\u026c#\3\2\2\2\u026d\u026e\5\u00eav\2\u026e"+
		"%\3\2\2\2\u026f\u0270\7\23\2\2\u0270\u027a\5\34\17\2\u0271\u0272\7\23"+
		"\2\2\u0272\u0276\5\16\b\2\u0273\u0275\5(\25\2\u0274\u0273\3\2\2\2\u0275"+
		"\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u027a\3\2"+
		"\2\2\u0278\u0276\3\2\2\2\u0279\u026f\3\2\2\2\u0279\u0271\3\2\2\2\u027a"+
		"\'\3\2\2\2\u027b\u027c\7s\2\2\u027c\u027d\5\26\f\2\u027d)\3\2\2\2\u027e"+
		"\u027f\7b\2\2\u027f\u0280\5,\27\2\u0280\u0281\7a\2\2\u0281+\3\2\2\2\u0282"+
		"\u0287\5.\30\2\u0283\u0284\7^\2\2\u0284\u0286\5.\30\2\u0285\u0283\3\2"+
		"\2\2\u0286\u0289\3\2\2\2\u0287\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288"+
		"-\3\2\2\2\u0289\u0287\3\2\2\2\u028a\u028d\5\f\7\2\u028b\u028d\5\60\31"+
		"\2\u028c\u028a\3\2\2\2\u028c\u028b\3\2\2\2\u028d/\3\2\2\2\u028e\u0290"+
		"\5\u00eav\2\u028f\u028e\3\2\2\2\u0290\u0293\3\2\2\2\u0291\u028f\3\2\2"+
		"\2\u0291\u0292\3\2\2\2\u0292\u0294\3\2\2\2\u0293\u0291\3\2\2\2\u0294\u0296"+
		"\7e\2\2\u0295\u0297\5\62\32\2\u0296\u0295\3\2\2\2\u0296\u0297\3\2\2\2"+
		"\u0297\61\3\2\2\2\u0298\u0299\7\23\2\2\u0299\u029d\5\f\7\2\u029a\u029b"+
		"\7*\2\2\u029b\u029d\5\f\7\2\u029c\u0298\3\2\2\2\u029c\u029a\3\2\2\2\u029d"+
		"\63\3\2\2\2\u029e\u029f\b\33\1\2\u029f\u02a0\7\u0084\2\2\u02a0\u02a6\3"+
		"\2\2\2\u02a1\u02a2\f\3\2\2\u02a2\u02a3\7_\2\2\u02a3\u02a5\7\u0084\2\2"+
		"\u02a4\u02a1\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7"+
		"\3\2\2\2\u02a7\65\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9\u02af\7\u0084\2\2"+
		"\u02aa\u02ab\58\35\2\u02ab\u02ac\7_\2\2\u02ac\u02ad\7\u0084\2\2\u02ad"+
		"\u02af\3\2\2\2\u02ae\u02a9\3\2\2\2\u02ae\u02aa\3\2\2\2\u02af\67\3\2\2"+
		"\2\u02b0\u02b1\b\35\1\2\u02b1\u02b2\7\u0084\2\2\u02b2\u02b8\3\2\2\2\u02b3"+
		"\u02b4\f\3\2\2\u02b4\u02b5\7_\2\2\u02b5\u02b7\7\u0084\2\2\u02b6\u02b3"+
		"\3\2\2\2\u02b7\u02ba\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9"+
		"9\3\2\2\2\u02ba\u02b8\3\2\2\2\u02bb\u02c1\7\u0084\2\2\u02bc\u02bd\5> "+
		"\2\u02bd\u02be\7_\2\2\u02be\u02bf\7\u0084\2\2\u02bf\u02c1\3\2\2\2\u02c0"+
		"\u02bb\3\2\2\2\u02c0\u02bc\3\2\2\2\u02c1;\3\2\2\2\u02c2\u02c3\7\u0084"+
		"\2\2\u02c3=\3\2\2\2\u02c4\u02c5\b \1\2\u02c5\u02c6\7\u0084\2\2\u02c6\u02cc"+
		"\3\2\2\2\u02c7\u02c8\f\3\2\2\u02c8\u02c9\7_\2\2\u02c9\u02cb\7\u0084\2"+
		"\2\u02ca\u02c7\3\2\2\2\u02cb\u02ce\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cd"+
		"\3\2\2\2\u02cd?\3\2\2\2\u02ce\u02cc\3\2\2\2\u02cf\u02d1\5B\"\2\u02d0\u02cf"+
		"\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d5\3\2\2\2\u02d2\u02d4\5F$\2\u02d3"+
		"\u02d2\3\2\2\2\u02d4\u02d7\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2"+
		"\2\2\u02d6\u02db\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d8\u02da\5P)\2\u02d9\u02d8"+
		"\3\2\2\2\u02da\u02dd\3\2\2\2\u02db\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc"+
		"\u02de\3\2\2\2\u02dd\u02db\3\2\2\2\u02de\u02df\7\2\2\3\u02dfA\3\2\2\2"+
		"\u02e0\u02e2\5D#\2\u02e1\u02e0\3\2\2\2\u02e2\u02e5\3\2\2\2\u02e3\u02e1"+
		"\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e6\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e6"+
		"\u02e7\7\"\2\2\u02e7\u02e8\5\64\33\2\u02e8\u02e9\7]\2\2\u02e9C\3\2\2\2"+
		"\u02ea\u02eb\5\u00eav\2\u02ebE\3\2\2\2\u02ec\u02f1\5H%\2\u02ed\u02f1\5"+
		"J&\2\u02ee\u02f1\5L\'\2\u02ef\u02f1\5N(\2\u02f0\u02ec\3\2\2\2\u02f0\u02ed"+
		"\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0\u02ef\3\2\2\2\u02f1G\3\2\2\2\u02f2"+
		"\u02f3\7\33\2\2\u02f3\u02f4\5\66\34\2\u02f4\u02f5\7]\2\2\u02f5I\3\2\2"+
		"\2\u02f6\u02f7\7\33\2\2\u02f7\u02f8\58\35\2\u02f8\u02f9\7_\2\2\u02f9\u02fa"+
		"\7q\2\2\u02fa\u02fb\7]\2\2\u02fbK\3\2\2\2\u02fc\u02fd\7\33\2\2\u02fd\u02fe"+
		"\7(\2\2\u02fe\u02ff\5\66\34\2\u02ff\u0300\7_\2\2\u0300\u0301\7\u0084\2"+
		"\2\u0301\u0302\7]\2\2\u0302M\3\2\2\2\u0303\u0304\7\33\2\2\u0304\u0305"+
		"\7(\2\2\u0305\u0306\5\66\34\2\u0306\u0307\7_\2\2\u0307\u0308\7q\2\2\u0308"+
		"\u0309\7]\2\2\u0309O\3\2\2\2\u030a\u030e\5R*\2\u030b\u030e\5\u00c8e\2"+
		"\u030c\u030e\7]\2\2\u030d\u030a\3\2\2\2\u030d\u030b\3\2\2\2\u030d\u030c"+
		"\3\2\2\2\u030eQ\3\2\2\2\u030f\u0312\5T+\2\u0310\u0312\5\u00bc_\2\u0311"+
		"\u030f\3\2\2\2\u0311\u0310\3\2\2\2\u0312S\3\2\2\2\u0313\u0315\5X-\2\u0314"+
		"\u0313\3\2\2\2\u0315\u0318\3\2\2\2\u0316\u0314\3\2\2\2\u0316\u0317\3\2"+
		"\2\2\u0317\u031a\3\2\2\2\u0318\u0316\3\2\2\2\u0319\u031b\7\65\2\2\u031a"+
		"\u0319\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031d\5V"+
		",\2\u031d\u031f\7\u0084\2\2\u031e\u0320\5Z.\2\u031f\u031e\3\2\2\2\u031f"+
		"\u0320\3\2\2\2\u0320\u0322\3\2\2\2\u0321\u0323\5^\60\2\u0322\u0321\3\2"+
		"\2\2\u0322\u0323\3\2\2\2\u0323\u0325\3\2\2\2\u0324\u0326\5`\61\2\u0325"+
		"\u0324\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0328\5d"+
		"\63\2\u0328U\3\2\2\2\u0329\u032a\t\5\2\2\u032aW\3\2\2\2\u032b\u0334\5"+
		"\u00eav\2\u032c\u0334\7%\2\2\u032d\u0334\7$\2\2\u032e\u0334\7#\2\2\u032f"+
		"\u0334\7\3\2\2\u0330\u0334\7(\2\2\u0331\u0334\7\24\2\2\u0332\u0334\7)"+
		"\2\2\u0333\u032b\3\2\2\2\u0333\u032c\3\2\2\2\u0333\u032d\3\2\2\2\u0333"+
		"\u032e\3\2\2\2\u0333\u032f\3\2\2\2\u0333\u0330\3\2\2\2\u0333\u0331\3\2"+
		"\2\2\u0333\u0332\3\2\2\2\u0334Y\3\2\2\2\u0335\u0336\7b\2\2\u0336\u0337"+
		"\5\\/\2\u0337\u0338\7a\2\2\u0338[\3\2\2\2\u0339\u033e\5\"\22\2\u033a\u033b"+
		"\7^\2\2\u033b\u033d\5\"\22\2\u033c\u033a\3\2\2\2\u033d\u0340\3\2\2\2\u033e"+
		"\u033c\3\2\2\2\u033e\u033f\3\2\2\2\u033f]\3\2\2\2\u0340\u033e\3\2\2\2"+
		"\u0341\u0342\7>\2\2\u0342\u0343\5\20\t\2\u0343_\3\2\2\2\u0344\u0345\7"+
		"?\2\2\u0345\u0346\5b\62\2\u0346a\3\2\2\2\u0347\u034c\5\26\f\2\u0348\u0349"+
		"\7^\2\2\u0349\u034b\5\26\f\2\u034a\u0348\3\2\2\2\u034b\u034e\3\2\2\2\u034c"+
		"\u034a\3\2\2\2\u034c\u034d\3\2\2\2\u034dc\3\2\2\2\u034e\u034c\3\2\2\2"+
		"\u034f\u0353\7Y\2\2\u0350\u0352\5f\64\2\u0351\u0350\3\2\2\2\u0352\u0355"+
		"\3\2\2\2\u0353\u0351\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0356\3\2\2\2\u0355"+
		"\u0353\3\2\2\2\u0356\u0357\7Z\2\2\u0357e\3\2\2\2\u0358\u035d\5h\65\2\u0359"+
		"\u035d\5\u00acW\2\u035a\u035d\5\u00aeX\2\u035b\u035d\5\u00b0Y\2\u035c"+
		"\u0358\3\2\2\2\u035c\u0359\3\2\2\2\u035c\u035a\3\2\2\2\u035c\u035b\3\2"+
		"\2\2\u035dg\3\2\2\2\u035e\u0364\5j\66\2\u035f\u0364\5\u008eH\2\u0360\u0364"+
		"\5R*\2\u0361\u0364\5\u00c8e\2\u0362\u0364\7]\2\2\u0363\u035e\3\2\2\2\u0363"+
		"\u035f\3\2\2\2\u0363\u0360\3\2\2\2\u0363\u0361\3\2\2\2\u0363\u0362\3\2"+
		"\2\2\u0364i\3\2\2\2\u0365\u0367\5l\67\2\u0366\u0365\3\2\2\2\u0367\u036a"+
		"\3\2\2\2\u0368\u0366\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036b\3\2\2\2\u036a"+
		"\u0368\3\2\2\2\u036b\u036c\5v<\2\u036c\u036d\5n8\2\u036d\u036e\7]\2\2"+
		"\u036ek\3\2\2\2\u036f\u037b\5\u00eav\2\u0370\u037b\7%\2\2\u0371\u037b"+
		"\7$\2\2\u0372\u037b\7#\2\2\u0373\u037b\7(\2\2\u0374\u037b\7\24\2\2\u0375"+
		"\u037b\7\60\2\2\u0376\u037b\7\63\2\2\u0377\u037b\7E\2\2\u0378\u037b\7"+
		"J\2\2\u0379\u037b\7K\2\2\u037a\u036f\3\2\2\2\u037a\u0370\3\2\2\2\u037a"+
		"\u0371\3\2\2\2\u037a\u0372\3\2\2\2\u037a\u0373\3\2\2\2\u037a\u0374\3\2"+
		"\2\2\u037a\u0375\3\2\2\2\u037a\u0376\3\2\2\2\u037a\u0377\3\2\2\2\u037a"+
		"\u0378\3\2\2\2\u037a\u0379\3\2\2\2\u037bm\3\2\2\2\u037c\u0381\5p9\2\u037d"+
		"\u037e\7^\2\2\u037e\u0380\5p9\2\u037f\u037d\3\2\2\2\u0380\u0383\3\2\2"+
		"\2\u0381\u037f\3\2\2\2\u0381\u0382\3\2\2\2\u0382o\3\2\2\2\u0383\u0381"+
		"\3\2\2\2\u0384\u0387\5r:\2\u0385\u0386\7`\2\2\u0386\u0388\5t;\2\u0387"+
		"\u0385\3\2\2\2\u0387\u0388\3\2\2\2\u0388q\3\2\2\2\u0389\u038b\7\u0084"+
		"\2\2\u038a\u038c\5 \21\2\u038b\u038a\3\2\2\2\u038b\u038c\3\2\2\2\u038c"+
		"s\3\2\2\2\u038d\u0390\5\u01a2\u00d2\2\u038e\u0390\5\u00fc\177\2\u038f"+
		"\u038d\3\2\2\2\u038f\u038e\3\2\2\2\u0390u\3\2\2\2\u0391\u0394\5x=\2\u0392"+
		"\u0394\5z>\2\u0393\u0391\3\2\2\2\u0393\u0392\3\2\2\2\u0394w\3\2\2\2\u0395"+
		"\u0398\5\6\4\2\u0396\u0398\7\5\2\2\u0397\u0395\3\2\2\2\u0397\u0396\3\2"+
		"\2\2\u0398y\3\2\2\2\u0399\u039d\5|?\2\u039a\u039d\5\u008aF\2\u039b\u039d"+
		"\5\u008cG\2\u039c\u0399\3\2\2\2\u039c\u039a\3\2\2\2\u039c\u039b\3\2\2"+
		"\2\u039d{\3\2\2\2\u039e\u03a1\5\u0082B\2\u039f\u03a1\5\u0088E\2\u03a0"+
		"\u039e\3\2\2\2\u03a0\u039f\3\2\2\2\u03a1\u03a6\3\2\2\2\u03a2\u03a5\5\u0080"+
		"A\2\u03a3\u03a5\5\u0086D\2\u03a4\u03a2\3\2\2\2\u03a4\u03a3\3\2\2\2\u03a5"+
		"\u03a8\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7}\3\2\2\2"+
		"\u03a8\u03a6\3\2\2\2\u03a9\u03ab\7\u0084\2\2\u03aa\u03ac\5*\26\2\u03ab"+
		"\u03aa\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ba\3\2\2\2\u03ad\u03ae\5|"+
		"?\2\u03ae\u03b2\7_\2\2\u03af\u03b1\5\u00eav\2\u03b0\u03af\3\2\2\2\u03b1"+
		"\u03b4\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b5\3\2"+
		"\2\2\u03b4\u03b2\3\2\2\2\u03b5\u03b7\7\u0084\2\2\u03b6\u03b8\5*\26\2\u03b7"+
		"\u03b6\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03ba\3\2\2\2\u03b9\u03a9\3\2"+
		"\2\2\u03b9\u03ad\3\2\2\2\u03ba\177\3\2\2\2\u03bb\u03bf\7_\2\2\u03bc\u03be"+
		"\5\u00eav\2\u03bd\u03bc\3\2\2\2\u03be\u03c1\3\2\2\2\u03bf\u03bd\3\2\2"+
		"\2\u03bf\u03c0\3\2\2\2\u03c0\u03c2\3\2\2\2\u03c1\u03bf\3\2\2\2\u03c2\u03c4"+
		"\7\u0084\2\2\u03c3\u03c5\5*\26\2\u03c4\u03c3\3\2\2\2\u03c4\u03c5\3\2\2"+
		"\2\u03c5\u0081\3\2\2\2\u03c6\u03c8\7\u0084\2\2\u03c7\u03c9\5*\26\2\u03c8"+
		"\u03c7\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u0083\3\2\2\2\u03ca\u03cb\5~"+
		"@\2\u03cb\u0085\3\2\2\2\u03cc\u03cd\5\u0080A\2\u03cd\u0087\3\2\2\2\u03ce"+
		"\u03cf\5\u0082B\2\u03cf\u0089\3\2\2\2\u03d0\u03d1\7\u0084\2\2\u03d1\u008b"+
		"\3\2\2\2\u03d2\u03d3\5x=\2\u03d3\u03d4\5 \21\2\u03d4\u03dc\3\2\2\2\u03d5"+
		"\u03d6\5|?\2\u03d6\u03d7\5 \21\2\u03d7\u03dc\3\2\2\2\u03d8\u03d9\5\u008a"+
		"F\2\u03d9\u03da\5 \21\2\u03da\u03dc\3\2\2\2\u03db\u03d2\3\2\2\2\u03db"+
		"\u03d5\3\2\2\2\u03db\u03d8\3\2\2\2\u03dc\u008d\3\2\2\2\u03dd\u03df\5\u0090"+
		"I\2\u03de\u03dd\3\2\2\2\u03df\u03e2\3\2\2\2\u03e0\u03de\3\2\2\2\u03e0"+
		"\u03e1\3\2\2\2\u03e1\u03e3\3\2\2\2\u03e2\u03e0\3\2\2\2\u03e3\u03e4\5\u0092"+
		"J\2\u03e4\u03e5\5\u00aaV\2\u03e5\u008f\3\2\2\2\u03e6\u03f6\5\u00eav\2"+
		"\u03e7\u03f6\7%\2\2\u03e8\u03f6\7$\2\2\u03e9\u03f6\7#\2\2\u03ea\u03f6"+
		"\7\3\2\2\u03eb\u03f6\7(\2\2\u03ec\u03f6\7\24\2\2\u03ed\u03f6\7,\2\2\u03ee"+
		"\u03f6\7 \2\2\u03ef\u03f6\7)\2\2\u03f0\u03f6\7F\2\2\u03f1\u03f6\7G\2\2"+
		"\u03f2\u03f6\7H\2\2\u03f3\u03f6\7I\2\2\u03f4\u03f6\7L\2\2\u03f5\u03e6"+
		"\3\2\2\2\u03f5\u03e7\3\2\2\2\u03f5\u03e8\3\2\2\2\u03f5\u03e9\3\2\2\2\u03f5"+
		"\u03ea\3\2\2\2\u03f5\u03eb\3\2\2\2\u03f5\u03ec\3\2\2\2\u03f5\u03ed\3\2"+
		"\2\2\u03f5\u03ee\3\2\2\2\u03f5\u03ef\3\2\2\2\u03f5\u03f0\3\2\2\2\u03f5"+
		"\u03f1\3\2\2\2\u03f5\u03f2\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f5\u03f4\3\2"+
		"\2\2\u03f6\u0091\3\2\2\2\u03f7\u03f8\5\u0094K\2\u03f8\u03fa\5\u0096L\2"+
		"\u03f9\u03fb\5\u00a4S\2\u03fa\u03f9\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb"+
		"\u0409\3\2\2\2\u03fc\u0400\5Z.\2\u03fd\u03ff\5\u00eav\2\u03fe\u03fd\3"+
		"\2\2\2\u03ff\u0402\3\2\2\2\u0400\u03fe\3\2\2\2\u0400\u0401\3\2\2\2\u0401"+
		"\u0403\3\2\2\2\u0402\u0400\3\2\2\2\u0403\u0404\5\u0094K\2\u0404\u0406"+
		"\5\u0096L\2\u0405\u0407\5\u00a4S\2\u0406\u0405\3\2\2\2\u0406\u0407\3\2"+
		"\2\2\u0407\u0409\3\2\2\2\u0408\u03f7\3\2\2\2\u0408\u03fc\3\2\2\2\u0409"+
		"\u0093\3\2\2\2\u040a\u040d\5v<\2\u040b\u040d\7\62\2\2\u040c\u040a\3\2"+
		"\2\2\u040c\u040b\3\2\2\2\u040d\u0095\3\2\2\2\u040e\u040f\7\u0084\2\2\u040f"+
		"\u0411\7W\2\2\u0410\u0412\5\u0098M\2\u0411\u0410\3\2\2\2\u0411\u0412\3"+
		"\2\2\2\u0412\u0413\3\2\2\2\u0413\u0415\7X\2\2\u0414\u0416\5 \21\2\u0415"+
		"\u0414\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0097\3\2\2\2\u0417\u041e\5\u00a2"+
		"R\2\u0418\u0419\5\u009aN\2\u0419\u041a\7^\2\2\u041a\u041b\5\u00a0Q\2\u041b"+
		"\u041e\3\2\2\2\u041c\u041e\5\u00a0Q\2\u041d\u0417\3\2\2\2\u041d\u0418"+
		"\3\2\2\2\u041d\u041c\3\2\2\2\u041e\u0099\3\2\2\2\u041f\u0424\5\u009cO"+
		"\2\u0420\u0421\7^\2\2\u0421\u0423\5\u009cO\2\u0422\u0420\3\2\2\2\u0423"+
		"\u0426\3\2\2\2\u0424\u0422\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u0430\3\2"+
		"\2\2\u0426\u0424\3\2\2\2\u0427\u042c\5\u00a2R\2\u0428\u0429\7^\2\2\u0429"+
		"\u042b\5\u009cO\2\u042a\u0428\3\2\2\2\u042b\u042e\3\2\2\2\u042c\u042a"+
		"\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u0430\3\2\2\2\u042e\u042c\3\2\2\2\u042f"+
		"\u041f\3\2\2\2\u042f\u0427\3\2\2\2\u0430\u009b\3\2\2\2\u0431\u0433\5\u009e"+
		"P\2\u0432\u0431\3\2\2\2\u0433\u0436\3\2\2\2\u0434\u0432\3\2\2\2\u0434"+
		"\u0435\3\2\2\2\u0435\u0437\3\2\2\2\u0436\u0434\3\2\2\2\u0437\u0438\5v"+
		"<\2\u0438\u0439\5r:\2\u0439\u009d\3\2\2\2\u043a\u043e\5\u00eav\2\u043b"+
		"\u043e\7\24\2\2\u043c\u043e\7E\2\2\u043d\u043a\3\2\2\2\u043d\u043b\3\2"+
		"\2\2\u043d\u043c\3\2\2\2\u043e\u009f\3\2\2\2\u043f\u0441\5\u009eP\2\u0440"+
		"\u043f\3\2\2\2\u0441\u0444\3\2\2\2\u0442\u0440\3\2\2\2\u0442\u0443\3\2"+
		"\2\2\u0443\u0445\3\2\2\2\u0444\u0442\3\2\2\2\u0445\u0449\5v<\2\u0446\u0448"+
		"\5\u00eav\2\u0447\u0446\3\2\2\2\u0448\u044b\3\2\2\2\u0449\u0447\3\2\2"+
		"\2\u0449\u044a\3\2\2\2\u044a\u044c\3\2\2\2\u044b\u0449\3\2\2\2\u044c\u044d"+
		"\7\u0086\2\2\u044d\u044e\5r:\2\u044e\u0451\3\2\2\2\u044f\u0451\5\u009c"+
		"O\2\u0450\u0442\3\2\2\2\u0450\u044f\3\2\2\2\u0451\u00a1\3\2\2\2\u0452"+
		"\u0454\5\u00eav\2\u0453\u0452\3\2\2\2\u0454\u0457\3\2\2\2\u0455\u0453"+
		"\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0458\3\2\2\2\u0457\u0455\3\2\2\2\u0458"+
		"\u045b\5v<\2\u0459\u045a\7\u0084\2\2\u045a\u045c\7_\2\2\u045b\u0459\3"+
		"\2\2\2\u045b\u045c\3\2\2\2\u045c\u045d\3\2\2\2\u045d\u045e\7-\2\2\u045e"+
		"\u00a3\3\2\2\2\u045f\u0460\7/\2\2\u0460\u0461\5\u00a6T\2\u0461\u00a5\3"+
		"\2\2\2\u0462\u0467\5\u00a8U\2\u0463\u0464\7^\2\2\u0464\u0466\5\u00a8U"+
		"\2\u0465\u0463\3\2\2\2\u0466\u0469\3\2\2\2\u0467\u0465\3\2\2\2\u0467\u0468"+
		"\3\2\2\2\u0468\u00a7\3\2\2\2\u0469\u0467\3\2\2\2\u046a\u046d\5\20\t\2"+
		"\u046b\u046d\5\34\17\2\u046c\u046a\3\2\2\2\u046c\u046b\3\2\2\2\u046d\u00a9"+
		"\3\2\2\2\u046e\u0471\5\u0100\u0081\2\u046f\u0471\7]\2\2\u0470\u046e\3"+
		"\2\2\2\u0470\u046f\3\2\2\2\u0471\u00ab\3\2\2\2\u0472\u0473\5\u0100\u0081"+
		"\2\u0473\u00ad\3\2\2\2\u0474\u0475\7(\2\2\u0475\u0476\5\u0100\u0081\2"+
		"\u0476\u00af\3\2\2\2\u0477\u0479\5\u00b2Z\2\u0478\u0477\3\2\2\2\u0479"+
		"\u047c\3\2\2\2\u047a\u0478\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u047d\3\2"+
		"\2\2\u047c\u047a\3\2\2\2\u047d\u047f\5\u00b4[\2\u047e\u0480\5\u00a4S\2"+
		"\u047f\u047e\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u0482"+
		"\5\u00b8]\2\u0482\u00b1\3\2\2\2\u0483\u0488\5\u00eav\2\u0484\u0488\7%"+
		"\2\2\u0485\u0488\7$\2\2\u0486\u0488\7#\2\2\u0487\u0483\3\2\2\2\u0487\u0484"+
		"\3\2\2\2\u0487\u0485\3\2\2\2\u0487\u0486\3\2\2\2\u0488\u00b3\3\2\2\2\u0489"+
		"\u048b\5Z.\2\u048a\u0489\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u048c\3\2\2"+
		"\2\u048c\u048d\5\u00b6\\\2\u048d\u048f\7W\2\2\u048e\u0490\5\u0098M\2\u048f"+
		"\u048e\3\2\2\2\u048f\u0490\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0492\7X"+
		"\2\2\u0492\u00b5\3\2\2\2\u0493\u0494\7\u0084\2\2\u0494\u00b7\3\2\2\2\u0495"+
		"\u0497\7Y\2\2\u0496\u0498\5\u00ba^\2\u0497\u0496\3\2\2\2\u0497\u0498\3"+
		"\2\2\2\u0498\u049a\3\2\2\2\u0499\u049b\5\u0102\u0082\2\u049a\u0499\3\2"+
		"\2\2\u049a\u049b\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u049d\7Z\2\2\u049d"+
		"\u00b9\3\2\2\2\u049e\u04a0\5*\26\2\u049f\u049e\3\2\2\2\u049f\u04a0\3\2"+
		"\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a2\7-\2\2\u04a2\u04a4\7W\2\2\u04a3\u04a5"+
		"\5\u0192\u00ca\2\u04a4\u04a3\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04a6\3"+
		"\2\2\2\u04a6\u04a7\7X\2\2\u04a7\u04cd\7]\2\2\u04a8\u04aa\5*\26\2\u04a9"+
		"\u04a8\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab\u04ac\7*"+
		"\2\2\u04ac\u04ae\7W\2\2\u04ad\u04af\5\u0192\u00ca\2\u04ae\u04ad\3\2\2"+
		"\2\u04ae\u04af\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b1\7X\2\2\u04b1\u04cd"+
		"\7]\2\2\u04b2\u04b3\5:\36\2\u04b3\u04b5\7_\2\2\u04b4\u04b6\5*\26\2\u04b5"+
		"\u04b4\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8\7*"+
		"\2\2\u04b8\u04ba\7W\2\2\u04b9\u04bb\5\u0192\u00ca\2\u04ba\u04b9\3\2\2"+
		"\2\u04ba\u04bb\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04bd\7X\2\2\u04bd\u04be"+
		"\7]\2\2\u04be\u04cd\3\2\2\2\u04bf\u04c0\5\u0164\u00b3\2\u04c0\u04c2\7"+
		"_\2\2\u04c1\u04c3\5*\26\2\u04c2\u04c1\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3"+
		"\u04c4\3\2\2\2\u04c4\u04c5\7*\2\2\u04c5\u04c7\7W\2\2\u04c6\u04c8\5\u0192"+
		"\u00ca\2\u04c7\u04c6\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9"+
		"\u04ca\7X\2\2\u04ca\u04cb\7]\2\2\u04cb\u04cd\3\2\2\2\u04cc\u049f\3\2\2"+
		"\2\u04cc\u04a9\3\2\2\2\u04cc\u04b2\3\2\2\2\u04cc\u04bf\3\2\2\2\u04cd\u00bb"+
		"\3\2\2\2\u04ce\u04d0\5X-\2\u04cf\u04ce\3\2\2\2\u04d0\u04d3\3\2\2\2\u04d1"+
		"\u04cf\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d4\3\2\2\2\u04d3\u04d1\3\2"+
		"\2\2\u04d4\u04d5\7\22\2\2\u04d5\u04d7\7\u0084\2\2\u04d6\u04d8\5`\61\2"+
		"\u04d7\u04d6\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04da"+
		"\5\u00be`\2\u04da\u00bd\3\2\2\2\u04db\u04dd\7Y\2\2\u04dc\u04de\5\u00c0"+
		"a\2\u04dd\u04dc\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04e0\3\2\2\2\u04df"+
		"\u04e1\7^\2\2\u04e0\u04df\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e3\3\2"+
		"\2\2\u04e2\u04e4\5\u00c6d\2\u04e3\u04e2\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4"+
		"\u04e5\3\2\2\2\u04e5\u04e6\7Z\2\2\u04e6\u00bf\3\2\2\2\u04e7\u04ec\5\u00c2"+
		"b\2\u04e8\u04e9\7^\2\2\u04e9\u04eb\5\u00c2b\2\u04ea\u04e8\3\2\2\2\u04eb"+
		"\u04ee\3\2\2\2\u04ec\u04ea\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u00c1\3\2"+
		"\2\2\u04ee\u04ec\3\2\2\2\u04ef\u04f1\5\u00c4c\2\u04f0\u04ef\3\2\2\2\u04f1"+
		"\u04f4\3\2\2\2\u04f2\u04f0\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f5\3\2"+
		"\2\2\u04f4\u04f2\3\2\2\2\u04f5\u04fb\7\u0084\2\2\u04f6\u04f8\7W\2\2\u04f7"+
		"\u04f9\5\u0192\u00ca\2\u04f8\u04f7\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9\u04fa"+
		"\3\2\2\2\u04fa\u04fc\7X\2\2\u04fb\u04f6\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc"+
		"\u04fe\3\2\2\2\u04fd\u04ff\5d\63\2\u04fe\u04fd\3\2\2\2\u04fe\u04ff\3\2"+
		"\2\2\u04ff\u00c3\3\2\2\2\u0500\u0501\5\u00eav\2\u0501\u00c5\3\2\2\2\u0502"+
		"\u0506\7]\2\2\u0503\u0505\5f\64\2\u0504\u0503\3\2\2\2\u0505\u0508\3\2"+
		"\2\2\u0506\u0504\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u00c7\3\2\2\2\u0508"+
		"\u0506\3\2\2\2\u0509\u050c\5\u00caf\2\u050a\u050c\5\u00dep\2\u050b\u0509"+
		"\3\2\2\2\u050b\u050a\3\2\2\2\u050c\u00c9\3\2\2\2\u050d\u050f\5\u00ceh"+
		"\2\u050e\u050d\3\2\2\2\u050f\u0512\3\2\2\2\u0510\u050e\3\2\2\2\u0510\u0511"+
		"\3\2\2\2\u0511\u0513\3\2\2\2\u0512\u0510\3\2\2\2\u0513\u0515\5\u00ccg"+
		"\2\u0514\u0516\5V,\2\u0515\u0514\3\2\2\2\u0515\u0516\3\2\2\2\u0516\u0517"+
		"\3\2\2\2\u0517\u0519\7\u0084\2\2\u0518\u051a\5Z.\2\u0519\u0518\3\2\2\2"+
		"\u0519\u051a\3\2\2\2\u051a\u051c\3\2\2\2\u051b\u051d\5\u00d0i\2\u051c"+
		"\u051b\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u051e\3\2\2\2\u051e\u051f\5\u00d2"+
		"j\2\u051f\u00cb\3\2\2\2\u0520\u0521\t\6\2\2\u0521\u00cd\3\2\2\2\u0522"+
		"\u052a\5\u00eav\2\u0523\u052a\7%\2\2\u0524\u052a\7$\2\2\u0525\u052a\7"+
		"#\2\2\u0526\u052a\7\3\2\2\u0527\u052a\7(\2\2\u0528\u052a\7)\2\2\u0529"+
		"\u0522\3\2\2\2\u0529\u0523\3\2\2\2\u0529\u0524\3\2\2\2\u0529\u0525\3\2"+
		"\2\2\u0529\u0526\3\2\2\2\u0529\u0527\3\2\2\2\u0529\u0528\3\2\2\2\u052a"+
		"\u00cf\3\2\2\2\u052b\u052c\7\23\2\2\u052c\u052d\5b\62\2\u052d\u00d1\3"+
		"\2\2\2\u052e\u0532\7Y\2\2\u052f\u0531\5\u00d4k\2\u0530\u052f\3\2\2\2\u0531"+
		"\u0534\3\2\2\2\u0532\u0530\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0535\3\2"+
		"\2\2\u0534\u0532\3\2\2\2\u0535\u0536\7Z\2\2\u0536\u00d3\3\2\2\2\u0537"+
		"\u053d\5\u00d6l\2\u0538\u053d\5\u00dan\2\u0539\u053d\5R*\2\u053a\u053d"+
		"\5\u00c8e\2\u053b\u053d\7]\2\2\u053c\u0537\3\2\2\2\u053c\u0538\3\2\2\2"+
		"\u053c\u0539\3\2\2\2\u053c\u053a\3\2\2\2\u053c\u053b\3\2\2\2\u053d\u00d5"+
		"\3\2\2\2\u053e\u0540\5\u00d8m\2\u053f\u053e\3\2\2\2\u0540\u0543\3\2\2"+
		"\2\u0541\u053f\3\2\2\2\u0541\u0542\3\2\2\2\u0542\u0544\3\2\2\2\u0543\u0541"+
		"\3\2\2\2\u0544\u0545\5v<\2\u0545\u0546\5n8\2\u0546\u0547\7]\2\2\u0547"+
		"\u00d7\3\2\2\2\u0548\u054d\5\u00eav\2\u0549\u054d\7%\2\2\u054a\u054d\7"+
		"(\2\2\u054b\u054d\7\24\2\2\u054c\u0548\3\2\2\2\u054c\u0549\3\2\2\2\u054c"+
		"\u054a\3\2\2\2\u054c\u054b\3\2\2\2\u054d\u00d9\3\2\2\2\u054e\u0550\5\u00dc"+
		"o\2\u054f\u054e\3\2\2\2\u0550\u0553\3\2\2\2\u0551\u054f\3\2\2\2\u0551"+
		"\u0552\3\2\2\2\u0552\u0554\3\2\2\2\u0553\u0551\3\2\2\2\u0554\u0555\5\u0092"+
		"J\2\u0555\u0556\5\u00aaV\2\u0556\u00db\3\2\2\2\u0557\u055e\5\u00eav\2"+
		"\u0558\u055e\7%\2\2\u0559\u055e\7\3\2\2\u055a\u055e\7\16\2\2\u055b\u055e"+
		"\7(\2\2\u055c\u055e\7)\2\2\u055d\u0557\3\2\2\2\u055d\u0558\3\2\2\2\u055d"+
		"\u0559\3\2\2\2\u055d\u055a\3\2\2\2\u055d\u055b\3\2\2\2\u055d\u055c\3\2"+
		"\2\2\u055e\u00dd\3\2\2\2\u055f\u0561\5\u00ceh\2\u0560\u055f\3\2\2\2\u0561"+
		"\u0564\3\2\2\2\u0562\u0560\3\2\2\2\u0562\u0563\3\2\2\2\u0563\u0565\3\2"+
		"\2\2\u0564\u0562\3\2\2\2\u0565\u0566\7\u0085\2\2\u0566\u0567\7\36\2\2"+
		"\u0567\u0568\7\u0084\2\2\u0568\u0569\5\u00e0q\2\u0569\u00df\3\2\2\2\u056a"+
		"\u056e\7Y\2\2\u056b\u056d\5\u00e2r\2\u056c\u056b\3\2\2\2\u056d\u0570\3"+
		"\2\2\2\u056e\u056c\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u0571\3\2\2\2\u0570"+
		"\u056e\3\2\2\2\u0571\u0572\7Z\2\2\u0572\u00e1\3\2\2\2\u0573\u0579\5\u00e4"+
		"s\2\u0574\u0579\5\u00d6l\2\u0575\u0579\5R*\2\u0576\u0579\5\u00c8e\2\u0577"+
		"\u0579\7]\2\2\u0578\u0573\3\2\2\2\u0578\u0574\3\2\2\2\u0578\u0575\3\2"+
		"\2\2\u0578\u0576\3\2\2\2\u0578\u0577\3\2\2\2\u0579\u00e3\3\2\2\2\u057a"+
		"\u057c\5\u00e6t\2\u057b\u057a\3\2\2\2\u057c\u057f\3\2\2\2\u057d\u057b"+
		"\3\2\2\2\u057d\u057e\3\2\2\2\u057e\u0580\3\2\2\2\u057f\u057d\3\2\2\2\u0580"+
		"\u0581\5v<\2\u0581\u0582\7\u0084\2\2\u0582\u0583\7W\2\2\u0583\u0585\7"+
		"X\2\2\u0584\u0586\5 \21\2\u0585\u0584\3\2\2\2\u0585\u0586\3\2\2\2\u0586"+
		"\u0588\3\2\2\2\u0587\u0589\5\u00e8u\2\u0588\u0587\3\2\2\2\u0588\u0589"+
		"\3\2\2\2\u0589\u058a\3\2\2\2\u058a\u058b\7]\2\2\u058b\u00e5\3\2\2\2\u058c"+
		"\u0590\5\u00eav\2\u058d\u0590\7%\2\2\u058e\u0590\7\3\2\2\u058f\u058c\3"+
		"\2\2\2\u058f\u058d\3\2\2\2\u058f\u058e\3\2\2\2\u0590\u00e7\3\2\2\2\u0591"+
		"\u0592\7\16\2\2\u0592\u0593\5\u00f2z\2\u0593\u00e9\3\2\2\2\u0594\u0598"+
		"\5\u00ecw\2\u0595\u0598\5\u00f8}\2\u0596\u0598\5\u00fa~\2\u0597\u0594"+
		"\3\2\2\2\u0597\u0595\3\2\2\2\u0597\u0596\3\2\2\2\u0598\u00eb\3\2\2\2\u0599"+
		"\u059a\7\u0085\2\2\u059a\u059b\5\66\34\2\u059b\u059d\7W\2\2\u059c\u059e"+
		"\5\u00eex\2\u059d\u059c\3\2\2\2\u059d\u059e\3\2\2\2\u059e\u059f\3\2\2"+
		"\2\u059f\u05a0\7X\2\2\u05a0\u00ed\3\2\2\2\u05a1\u05a6\5\u00f0y\2\u05a2"+
		"\u05a3\7^\2\2\u05a3\u05a5\5\u00f0y\2\u05a4\u05a2\3\2\2\2\u05a5\u05a8\3"+
		"\2\2\2\u05a6\u05a4\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7\u00ef\3\2\2\2\u05a8"+
		"\u05a6\3\2\2\2\u05a9\u05aa\7\u0084\2\2\u05aa\u05ab\7`\2\2\u05ab\u05ac"+
		"\5\u00f2z\2\u05ac\u00f1\3\2\2\2\u05ad\u05b1\5\u01b4\u00db\2\u05ae\u05b1"+
		"\5\u00f4{\2\u05af\u05b1\5\u00eav\2\u05b0\u05ad\3\2\2\2\u05b0\u05ae\3\2"+
		"\2\2\u05b0\u05af\3\2\2\2\u05b1\u00f3\3\2\2\2\u05b2\u05b4\7Y\2\2\u05b3"+
		"\u05b5\5\u00f6|\2\u05b4\u05b3\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5\u05b7"+
		"\3\2\2\2\u05b6\u05b8\7^\2\2\u05b7\u05b6\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8"+
		"\u05b9\3\2\2\2\u05b9\u05ba\7Z\2\2\u05ba\u00f5\3\2\2\2\u05bb\u05c0\5\u00f2"+
		"z\2\u05bc\u05bd\7^\2\2\u05bd\u05bf\5\u00f2z\2\u05be\u05bc\3\2\2\2\u05bf"+
		"\u05c2\3\2\2\2\u05c0\u05be\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1\u00f7\3\2"+
		"\2\2\u05c2\u05c0\3\2\2\2\u05c3\u05c4\7\u0085\2\2\u05c4\u05c5\5\66\34\2"+
		"\u05c5\u00f9\3\2\2\2\u05c6\u05c7\7\u0085\2\2\u05c7\u05c8\5\66\34\2\u05c8"+
		"\u05c9\7W\2\2\u05c9\u05ca\5\u00f2z\2\u05ca\u05cb\7X\2\2\u05cb\u00fb\3"+
		"\2\2\2\u05cc\u05ce\7Y\2\2\u05cd\u05cf\5\u00fe\u0080\2\u05ce\u05cd\3\2"+
		"\2\2\u05ce\u05cf\3\2\2\2\u05cf\u05d1\3\2\2\2\u05d0\u05d2\7^\2\2\u05d1"+
		"\u05d0\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3\u05d4\7Z"+
		"\2\2\u05d4\u00fd\3\2\2\2\u05d5\u05da\5t;\2\u05d6\u05d7\7^\2\2\u05d7\u05d9"+
		"\5t;\2\u05d8\u05d6\3\2\2\2\u05d9\u05dc\3\2\2\2\u05da\u05d8\3\2\2\2\u05da"+
		"\u05db\3\2\2\2\u05db\u00ff\3\2\2\2\u05dc\u05da\3\2\2\2\u05dd\u05df\7Y"+
		"\2\2\u05de\u05e0\5\u0102\u0082\2\u05df\u05de\3\2\2\2\u05df\u05e0\3\2\2"+
		"\2\u05e0\u05e1\3\2\2\2\u05e1\u05e2\7Z\2\2\u05e2\u0101\3\2\2\2\u05e3\u05e5"+
		"\5\u0104\u0083\2\u05e4\u05e3\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6\u05e4\3"+
		"\2\2\2\u05e6\u05e7\3\2\2\2\u05e7\u0103\3\2\2\2\u05e8\u05ec\5\u0106\u0084"+
		"\2\u05e9\u05ec\5R*\2\u05ea\u05ec\5\u010a\u0086\2\u05eb\u05e8\3\2\2\2\u05eb"+
		"\u05e9\3\2\2\2\u05eb\u05ea\3\2\2\2\u05ec\u0105\3\2\2\2\u05ed\u05ee\5\u0108"+
		"\u0085\2\u05ee\u05ef\7]\2\2\u05ef\u0107\3\2\2\2\u05f0\u05f2\5\u009eP\2"+
		"\u05f1\u05f0\3\2\2\2\u05f2\u05f5\3\2\2\2\u05f3\u05f1\3\2\2\2\u05f3\u05f4"+
		"\3\2\2\2\u05f4\u05f6\3\2\2\2\u05f5\u05f3\3\2\2\2\u05f6\u05f7\5v<\2\u05f7"+
		"\u05f8\5n8\2\u05f8\u0109\3\2\2\2\u05f9\u0600\5\u010e\u0088\2\u05fa\u0600"+
		"\5\u0112\u008a\2\u05fb\u0600\5\u011a\u008e\2\u05fc\u0600\5\u011c\u008f"+
		"\2\u05fd\u0600\5\u012e\u0098\2\u05fe\u0600\5\u0134\u009b\2\u05ff\u05f9"+
		"\3\2\2\2\u05ff\u05fa\3\2\2\2\u05ff\u05fb\3\2\2\2\u05ff\u05fc\3\2\2\2\u05ff"+
		"\u05fd\3\2\2\2\u05ff\u05fe\3\2\2\2\u0600\u010b\3\2\2\2\u0601\u0607\5\u010e"+
		"\u0088\2\u0602\u0607\5\u0114\u008b\2\u0603\u0607\5\u011e\u0090\2\u0604"+
		"\u0607\5\u0130\u0099\2\u0605\u0607\5\u0136\u009c\2\u0606\u0601\3\2\2\2"+
		"\u0606\u0602\3\2\2\2\u0606\u0603\3\2\2\2\u0606\u0604\3\2\2\2\u0606\u0605"+
		"\3\2\2\2\u0607\u010d\3\2\2\2\u0608\u0615\5\u0100\u0081\2\u0609\u0615\5"+
		"\u0110\u0089\2\u060a\u0615\5\u0116\u008c\2\u060b\u0615\5\u0120\u0091\2"+
		"\u060c\u0615\5\u0122\u0092\2\u060d\u0615\5\u0132\u009a\2\u060e\u0615\5"+
		"\u0146\u00a4\2\u060f\u0615\5\u0148\u00a5\2\u0610\u0615\5\u014a\u00a6\2"+
		"\u0611\u0615\5\u014e\u00a8\2\u0612\u0615\5\u014c\u00a7\2\u0613\u0615\5"+
		"\u0150\u00a9\2\u0614\u0608\3\2\2\2\u0614\u0609\3\2\2\2\u0614\u060a\3\2"+
		"\2\2\u0614\u060b\3\2\2\2\u0614\u060c\3\2\2\2\u0614\u060d\3\2\2\2\u0614"+
		"\u060e\3\2\2\2\u0614\u060f\3\2\2\2\u0614\u0610\3\2\2\2\u0614\u0611\3\2"+
		"\2\2\u0614\u0612\3\2\2\2\u0614\u0613\3\2\2\2\u0615\u010f\3\2\2\2\u0616"+
		"\u0617\7]\2\2\u0617\u0111\3\2\2\2\u0618\u0619\7\u0084\2\2\u0619\u061a"+
		"\7f\2\2\u061a\u061b\5\u010a\u0086\2\u061b\u0113\3\2\2\2\u061c\u061d\7"+
		"\u0084\2\2\u061d\u061e\7f\2\2\u061e\u061f\5\u010c\u0087\2\u061f\u0115"+
		"\3\2\2\2\u0620\u0621\5\u0118\u008d\2\u0621\u0622\7]\2\2\u0622\u0117\3"+
		"\2\2\2\u0623\u062b\5\u01ae\u00d8\2\u0624\u062b\5\u01cc\u00e7\2\u0625\u062b"+
		"\5\u01ce\u00e8\2\u0626\u062b\5\u01d4\u00eb\2\u0627\u062b\5\u01d8\u00ed"+
		"\2\u0628\u062b\5\u018c\u00c7\2\u0629\u062b\5\u0178\u00bd\2\u062a\u0623"+
		"\3\2\2\2\u062a\u0624\3\2\2\2\u062a\u0625\3\2\2\2\u062a\u0626\3\2\2\2\u062a"+
		"\u0627\3\2\2\2\u062a\u0628\3\2\2\2\u062a\u0629\3\2\2\2\u062b\u0119\3\2"+
		"\2\2\u062c\u062d\7\30\2\2\u062d\u062e\7W\2\2\u062e\u062f\5\u01a2\u00d2"+
		"\2\u062f\u0630\7X\2\2\u0630\u0631\5\u010a\u0086\2\u0631\u011b\3\2\2\2"+
		"\u0632\u0633\7\30\2\2\u0633\u0634\7W\2\2\u0634\u0635\5\u01a2\u00d2\2\u0635"+
		"\u0636\7X\2\2\u0636\u0637\5\u010c\u0087\2\u0637\u0638\7\21\2\2\u0638\u0639"+
		"\5\u010a\u0086\2\u0639\u011d\3\2\2\2\u063a\u063b\7\30\2\2\u063b\u063c"+
		"\7W\2\2\u063c\u063d\5\u01a2\u00d2\2\u063d\u063e\7X\2\2\u063e\u063f\5\u010c"+
		"\u0087\2\u063f\u0640\7\21\2\2\u0640\u0641\5\u010c\u0087\2\u0641\u011f"+
		"\3\2\2\2\u0642\u0643\7\4\2\2\u0643\u0644\5\u01a2\u00d2\2\u0644\u0645\7"+
		"]\2\2\u0645\u064d\3\2\2\2\u0646\u0647\7\4\2\2\u0647\u0648\5\u01a2\u00d2"+
		"\2\u0648\u0649\7f\2\2\u0649\u064a\5\u01a2\u00d2\2\u064a\u064b\7]\2\2\u064b"+
		"\u064d\3\2\2\2\u064c\u0642\3\2\2\2\u064c\u0646\3\2\2\2\u064d\u0121\3\2"+
		"\2\2\u064e\u064f\7+\2\2\u064f\u0650\7W\2\2\u0650\u0651\5\u01a2\u00d2\2"+
		"\u0651\u0652\7X\2\2\u0652\u0653\5\u0124\u0093\2\u0653\u0123\3\2\2\2\u0654"+
		"\u0658\7Y\2\2\u0655\u0657\5\u0126\u0094\2\u0656\u0655\3\2\2\2\u0657\u065a"+
		"\3\2\2\2\u0658\u0656\3\2\2\2\u0658\u0659\3\2\2\2\u0659\u065e\3\2\2\2\u065a"+
		"\u0658\3\2\2\2\u065b\u065d\5\u012a\u0096\2\u065c\u065b\3\2\2\2\u065d\u0660"+
		"\3\2\2\2\u065e\u065c\3\2\2\2\u065e\u065f\3\2\2\2\u065f\u0661\3\2\2\2\u0660"+
		"\u065e\3\2\2\2\u0661\u0662\7Z\2\2\u0662\u0125\3\2\2\2\u0663\u0664\5\u0128"+
		"\u0095\2\u0664\u0665\5\u0102\u0082\2\u0665\u0127\3\2\2\2\u0666\u066a\5"+
		"\u012a\u0096\2\u0667\u0669\5\u012a\u0096\2\u0668\u0667\3\2\2\2\u0669\u066c"+
		"\3\2\2\2\u066a\u0668\3\2\2\2\u066a\u066b\3\2\2\2\u066b\u0129\3\2\2\2\u066c"+
		"\u066a\3\2\2\2\u066d\u066e\7\b\2\2\u066e\u066f\5\u01a0\u00d1\2\u066f\u0670"+
		"\7f\2\2\u0670\u0678\3\2\2\2\u0671\u0672\7\b\2\2\u0672\u0673\5\u012c\u0097"+
		"\2\u0673\u0674\7f\2\2\u0674\u0678\3\2\2\2\u0675\u0676\7\16\2\2\u0676\u0678"+
		"\7f\2\2\u0677\u066d\3\2\2\2\u0677\u0671\3\2\2\2\u0677\u0675\3\2\2\2\u0678"+
		"\u012b\3\2\2\2\u0679\u067a\7\u0084\2\2\u067a\u012d\3\2\2\2\u067b\u067c"+
		"\7\64\2\2\u067c\u067d\7W\2\2\u067d\u067e\5\u01a2\u00d2\2\u067e\u067f\7"+
		"X\2\2\u067f\u0680\5\u010a\u0086\2\u0680\u012f\3\2\2\2\u0681\u0682\7\64"+
		"\2\2\u0682\u0683\7W\2\2\u0683\u0684\5\u01a2\u00d2\2\u0684\u0685\7X\2\2"+
		"\u0685\u0686\5\u010c\u0087\2\u0686\u0131\3\2\2\2\u0687\u0688\7\17\2\2"+
		"\u0688\u0689\5\u010a\u0086\2\u0689\u068a\7\64\2\2\u068a\u068b\7W\2\2\u068b"+
		"\u068c\5\u01a2\u00d2\2\u068c\u068d\7X\2\2\u068d\u068e\7]\2\2\u068e\u0133"+
		"\3\2\2\2\u068f\u0692\5\u0138\u009d\2\u0690\u0692\5\u0142\u00a2\2\u0691"+
		"\u068f\3\2\2\2\u0691\u0690\3\2\2\2\u0692\u0135\3\2\2\2\u0693\u0696\5\u013a"+
		"\u009e\2\u0694\u0696\5\u0144\u00a3\2\u0695\u0693\3\2\2\2\u0695\u0694\3"+
		"\2\2\2\u0696\u0137\3\2\2\2\u0697\u0698\7\27\2\2\u0698\u069a\7W\2\2\u0699"+
		"\u069b\5\u013c\u009f\2\u069a\u0699\3\2\2\2\u069a\u069b\3\2\2\2\u069b\u069c"+
		"\3\2\2\2\u069c\u069e\7]\2\2\u069d\u069f\5\u01a2\u00d2\2\u069e\u069d\3"+
		"\2\2\2\u069e\u069f\3\2\2\2\u069f\u06a0\3\2\2\2\u06a0\u06a2\7]\2\2\u06a1"+
		"\u06a3\5\u013e\u00a0\2\u06a2\u06a1\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3\u06a4"+
		"\3\2\2\2\u06a4\u06a5\7X\2\2\u06a5\u06a6\5\u010a\u0086\2\u06a6\u0139\3"+
		"\2\2\2\u06a7\u06a8\7\27\2\2\u06a8\u06aa\7W\2\2\u06a9\u06ab\5\u013c\u009f"+
		"\2\u06aa\u06a9\3\2\2\2\u06aa\u06ab\3\2\2\2\u06ab\u06ac\3\2\2\2\u06ac\u06ae"+
		"\7]\2\2\u06ad\u06af\5\u01a2\u00d2\2\u06ae\u06ad\3\2\2\2\u06ae\u06af\3"+
		"\2\2\2\u06af\u06b0\3\2\2\2\u06b0\u06b2\7]\2\2\u06b1\u06b3\5\u013e\u00a0"+
		"\2\u06b2\u06b1\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u06b4\3\2\2\2\u06b4\u06b5"+
		"\7X\2\2\u06b5\u06b6\5\u010c\u0087\2\u06b6\u013b\3\2\2\2\u06b7\u06ba\5"+
		"\u0140\u00a1\2\u06b8\u06ba\5\u0108\u0085\2\u06b9\u06b7\3\2\2\2\u06b9\u06b8"+
		"\3\2\2\2\u06ba\u013d\3\2\2\2\u06bb\u06bc\5\u0140\u00a1\2\u06bc\u013f\3"+
		"\2\2\2\u06bd\u06c2\5\u0118\u008d\2\u06be\u06bf\7^\2\2\u06bf\u06c1\5\u0118"+
		"\u008d\2\u06c0\u06be\3\2\2\2\u06c1\u06c4\3\2\2\2\u06c2\u06c0\3\2\2\2\u06c2"+
		"\u06c3\3\2\2\2\u06c3\u0141\3\2\2\2\u06c4\u06c2\3\2\2\2\u06c5\u06c6\7\27"+
		"\2\2\u06c6\u06ca\7W\2\2\u06c7\u06c9\5\u009eP\2\u06c8\u06c7\3\2\2\2\u06c9"+
		"\u06cc\3\2\2\2\u06ca\u06c8\3\2\2\2\u06ca\u06cb\3\2\2\2\u06cb\u06cd\3\2"+
		"\2\2\u06cc\u06ca\3\2\2\2\u06cd\u06ce\5v<\2\u06ce\u06cf\5r:\2\u06cf\u06d0"+
		"\7f\2\2\u06d0\u06d1\5\u01a2\u00d2\2\u06d1\u06d2\7X\2\2\u06d2\u06d3\5\u010a"+
		"\u0086\2\u06d3\u0143\3\2\2\2\u06d4\u06d5\7\27\2\2\u06d5\u06d9\7W\2\2\u06d6"+
		"\u06d8\5\u009eP\2\u06d7\u06d6\3\2\2\2\u06d8\u06db\3\2\2\2\u06d9\u06d7"+
		"\3\2\2\2\u06d9\u06da\3\2\2\2\u06da\u06dc\3\2\2\2\u06db\u06d9\3\2\2\2\u06dc"+
		"\u06dd\5v<\2\u06dd\u06de\5r:\2\u06de\u06df\7f\2\2\u06df\u06e0\5\u01a2"+
		"\u00d2\2\u06e0\u06e1\7X\2\2\u06e1\u06e2\5\u010c\u0087\2\u06e2\u0145\3"+
		"\2\2\2\u06e3\u06e5\7\6\2\2\u06e4\u06e6\7\u0084\2\2\u06e5\u06e4\3\2\2\2"+
		"\u06e5\u06e6\3\2\2\2\u06e6\u06e7\3\2\2\2\u06e7\u06e8\7]\2\2\u06e8\u0147"+
		"\3\2\2\2\u06e9\u06eb\7\r\2\2\u06ea\u06ec\7\u0084\2\2\u06eb\u06ea\3\2\2"+
		"\2\u06eb\u06ec\3\2\2\2\u06ec\u06ed\3\2\2\2\u06ed\u06ee\7]\2\2\u06ee\u0149"+
		"\3\2\2\2\u06ef\u06f1\7&\2\2\u06f0\u06f2\5\u01a2\u00d2\2\u06f1\u06f0\3"+
		"\2\2\2\u06f1\u06f2\3\2\2\2\u06f2\u06f3\3\2\2\2\u06f3\u06f4\7]\2\2\u06f4"+
		"\u014b\3\2\2\2\u06f5\u06f6\7.\2\2\u06f6\u06f7\5\u01a2\u00d2\2\u06f7\u06f8"+
		"\7]\2\2\u06f8\u014d\3\2\2\2\u06f9\u06fa\7,\2\2\u06fa\u06fb\7W\2\2\u06fb"+
		"\u06fc\5\u01a2\u00d2\2\u06fc\u06fd\7X\2\2\u06fd\u06fe\5\u0100\u0081\2"+
		"\u06fe\u014f\3\2\2\2\u06ff\u0700\7\61\2\2\u0700\u0701\5\u0100\u0081\2"+
		"\u0701\u0702\5\u0152\u00aa\2\u0702\u070c\3\2\2\2\u0703\u0704\7\61\2\2"+
		"\u0704\u0706\5\u0100\u0081\2\u0705\u0707\5\u0152\u00aa\2\u0706\u0705\3"+
		"\2\2\2\u0706\u0707\3\2\2\2\u0707\u0708\3\2\2\2\u0708\u0709\5\u015a\u00ae"+
		"\2\u0709\u070c\3\2\2\2\u070a\u070c\5\u015c\u00af\2\u070b\u06ff\3\2\2\2"+
		"\u070b\u0703\3\2\2\2\u070b\u070a\3\2\2\2\u070c\u0151\3\2\2\2\u070d\u0711"+
		"\5\u0154\u00ab\2\u070e\u0710\5\u0154\u00ab\2\u070f\u070e\3\2\2\2\u0710"+
		"\u0713\3\2\2\2\u0711\u070f\3\2\2\2\u0711\u0712\3\2\2\2\u0712\u0153\3\2"+
		"\2\2\u0713\u0711\3\2\2\2\u0714\u0715\7\t\2\2\u0715\u0716\7W\2\2\u0716"+
		"\u0717\5\u0156\u00ac\2\u0717\u0718\7X\2\2\u0718\u0719\5\u0100\u0081\2"+
		"\u0719\u0155\3\2\2\2\u071a\u071c\5\u009eP\2\u071b\u071a\3\2\2\2\u071c"+
		"\u071f\3\2\2\2\u071d\u071b\3\2\2\2\u071d\u071e\3\2\2\2\u071e\u0720\3\2"+
		"\2\2\u071f\u071d\3\2\2\2\u0720\u0721\5\u0158\u00ad\2\u0721\u0722\5r:\2"+
		"\u0722\u0157\3\2\2\2\u0723\u0728\5~@\2\u0724\u0725\7t\2\2\u0725\u0727"+
		"\5\20\t\2\u0726\u0724\3\2\2\2\u0727\u072a\3\2\2\2\u0728\u0726\3\2\2\2"+
		"\u0728\u0729\3\2\2\2\u0729\u0159\3\2\2\2\u072a\u0728\3\2\2\2\u072b\u072c"+
		"\7\25\2\2\u072c\u072d\5\u0100\u0081\2\u072d\u015b\3\2\2\2\u072e\u072f"+
		"\7\61\2\2\u072f\u0730\5\u015e\u00b0\2\u0730\u0732\5\u0100\u0081\2\u0731"+
		"\u0733\5\u0152\u00aa\2\u0732\u0731\3\2\2\2\u0732\u0733\3\2\2\2\u0733\u0735"+
		"\3\2\2\2\u0734\u0736\5\u015a\u00ae\2\u0735\u0734\3\2\2\2\u0735\u0736\3"+
		"\2\2\2\u0736\u015d\3\2\2\2\u0737\u0738\7W\2\2\u0738\u073a\5\u0160\u00b1"+
		"\2\u0739\u073b\7]\2\2\u073a\u0739\3\2\2\2\u073a\u073b\3\2\2\2\u073b\u073c"+
		"\3\2\2\2\u073c\u073d\7X\2\2\u073d\u015f\3\2\2\2\u073e\u0743\5\u0162\u00b2"+
		"\2\u073f\u0740\7]\2\2\u0740\u0742\5\u0162\u00b2\2\u0741\u073f\3\2\2\2"+
		"\u0742\u0745\3\2\2\2\u0743\u0741\3\2\2\2\u0743\u0744\3\2\2\2\u0744\u0161"+
		"\3\2\2\2\u0745\u0743\3\2\2\2\u0746\u0748\5\u009eP\2\u0747\u0746\3\2\2"+
		"\2\u0748\u074b\3\2\2\2\u0749\u0747\3\2\2\2\u0749\u074a\3\2\2\2\u074a\u074c"+
		"\3\2\2\2\u074b\u0749\3\2\2\2\u074c\u074d\5v<\2\u074d\u074e\5r:\2\u074e"+
		"\u074f\7`\2\2\u074f\u0750\5\u01a2\u00d2\2\u0750\u0163\3\2\2\2\u0751\u0754"+
		"\5\u0172\u00ba\2\u0752\u0754\5\u019a\u00ce\2\u0753\u0751\3\2\2\2\u0753"+
		"\u0752\3\2\2\2\u0754\u0758\3\2\2\2\u0755\u0757\5\u016c\u00b7\2\u0756\u0755"+
		"\3\2\2\2\u0757\u075a\3\2\2\2\u0758\u0756\3\2\2\2\u0758\u0759\3\2\2\2\u0759"+
		"\u0165\3\2\2\2\u075a\u0758\3\2\2\2\u075b\u0779\5\2\2\2\u075c\u0761\5\66"+
		"\34\2\u075d\u075e\7[\2\2\u075e\u0760\7\\\2\2\u075f\u075d\3\2\2\2\u0760"+
		"\u0763\3\2\2\2\u0761\u075f\3\2\2\2\u0761\u0762\3\2\2\2\u0762\u0764\3\2"+
		"\2\2\u0763\u0761\3\2\2\2\u0764\u0765\7_\2\2\u0765\u0766\7\13\2\2\u0766"+
		"\u0779\3\2\2\2\u0767\u0768\7\62\2\2\u0768\u0769\7_\2\2\u0769\u0779\7\13"+
		"\2\2\u076a\u0779\7-\2\2\u076b\u076c\5\66\34\2\u076c\u076d\7_\2\2\u076d"+
		"\u076e\7-\2\2\u076e\u0779\3\2\2\2\u076f\u0770\7W\2\2\u0770\u0771\5\u01a2"+
		"\u00d2\2\u0771\u0772\7X\2\2\u0772\u0779\3\2\2\2\u0773\u0779\5\u0178\u00bd"+
		"\2\u0774\u0779\5\u0180\u00c1\2\u0775\u0779\5\u0186\u00c4\2\u0776\u0779"+
		"\5\u018c\u00c7\2\u0777\u0779\5\u0194\u00cb\2\u0778\u075b\3\2\2\2\u0778"+
		"\u075c\3\2\2\2\u0778\u0767\3\2\2\2\u0778\u076a\3\2\2\2\u0778\u076b\3\2"+
		"\2\2\u0778\u076f\3\2\2\2\u0778\u0773\3\2\2\2\u0778\u0774\3\2\2\2\u0778"+
		"\u0775\3\2\2\2\u0778\u0776\3\2\2\2\u0778\u0777\3\2\2\2\u0779\u0167\3\2"+
		"\2\2\u077a\u077b\3\2\2\2\u077b\u0169\3\2\2\2\u077c\u0799\5\2\2\2\u077d"+
		"\u0782\5\66\34\2\u077e\u077f\7[\2\2\u077f\u0781\7\\\2\2\u0780\u077e\3"+
		"\2\2\2\u0781\u0784\3\2\2\2\u0782\u0780\3\2\2\2\u0782\u0783\3\2\2\2\u0783"+
		"\u0785\3\2\2\2\u0784\u0782\3\2\2\2\u0785\u0786\7_\2\2\u0786\u0787\7\13"+
		"\2\2\u0787\u0799\3\2\2\2\u0788\u0789\7\62\2\2\u0789\u078a\7_\2\2\u078a"+
		"\u0799\7\13\2\2\u078b\u0799\7-\2\2\u078c\u078d\5\66\34\2\u078d\u078e\7"+
		"_\2\2\u078e\u078f\7-\2\2\u078f\u0799\3\2\2\2\u0790\u0791\7W\2\2\u0791"+
		"\u0792\5\u01a2\u00d2\2\u0792\u0793\7X\2\2\u0793\u0799\3\2\2\2\u0794\u0799"+
		"\5\u0178\u00bd\2\u0795\u0799\5\u0180\u00c1\2\u0796\u0799\5\u018c\u00c7"+
		"\2\u0797\u0799\5\u0194\u00cb\2\u0798\u077c\3\2\2\2\u0798\u077d\3\2\2\2"+
		"\u0798\u0788\3\2\2\2\u0798\u078b\3\2\2\2\u0798\u078c\3\2\2\2\u0798\u0790"+
		"\3\2\2\2\u0798\u0794\3\2\2\2\u0798\u0795\3\2\2\2\u0798\u0796\3\2\2\2\u0798"+
		"\u0797\3\2\2\2\u0799\u016b\3\2\2\2\u079a\u07a0\5\u017a\u00be\2\u079b\u07a0"+
		"\5\u0182\u00c2\2\u079c\u07a0\5\u0188\u00c5\2\u079d\u07a0\5\u018e\u00c8"+
		"\2\u079e\u07a0\5\u0196\u00cc\2\u079f\u079a\3\2\2\2\u079f\u079b\3\2\2\2"+
		"\u079f\u079c\3\2\2\2\u079f\u079d\3\2\2\2\u079f\u079e\3\2\2\2\u07a0\u016d"+
		"\3\2\2\2\u07a1\u07a2\3\2\2\2\u07a2\u016f\3\2\2\2\u07a3\u07a8\5\u017a\u00be"+
		"\2\u07a4\u07a8\5\u0182\u00c2\2\u07a5\u07a8\5\u018e\u00c8\2\u07a6\u07a8"+
		"\5\u0196\u00cc\2\u07a7\u07a3\3\2\2\2\u07a7\u07a4\3\2\2\2\u07a7\u07a5\3"+
		"\2\2\2\u07a7\u07a6\3\2\2\2\u07a8\u0171\3\2\2\2\u07a9\u07d2\5\2\2\2\u07aa"+
		"\u07af\5\66\34\2\u07ab\u07ac\7[\2\2\u07ac\u07ae\7\\\2\2\u07ad\u07ab\3"+
		"\2\2\2\u07ae\u07b1\3\2\2\2\u07af\u07ad\3\2\2\2\u07af\u07b0\3\2\2\2\u07b0"+
		"\u07b2\3\2\2\2\u07b1\u07af\3\2\2\2\u07b2\u07b3\7_\2\2\u07b3\u07b4\7\13"+
		"\2\2\u07b4\u07d2\3\2\2\2\u07b5\u07ba\5x=\2\u07b6\u07b7\7[\2\2\u07b7\u07b9"+
		"\7\\\2\2\u07b8\u07b6\3\2\2\2\u07b9\u07bc\3\2\2\2\u07ba\u07b8\3\2\2\2\u07ba"+
		"\u07bb\3\2\2\2\u07bb\u07bd\3\2\2\2\u07bc\u07ba\3\2\2\2\u07bd\u07be\7_"+
		"\2\2\u07be\u07bf\7\13\2\2\u07bf\u07d2\3\2\2\2\u07c0\u07c1\7\62\2\2\u07c1"+
		"\u07c2\7_\2\2\u07c2\u07d2\7\13\2\2\u07c3\u07d2\7-\2\2\u07c4\u07c5\5\66"+
		"\34\2\u07c5\u07c6\7_\2\2\u07c6\u07c7\7-\2\2\u07c7\u07d2\3\2\2\2\u07c8"+
		"\u07c9\7W\2\2\u07c9\u07ca\5\u01a2\u00d2\2\u07ca\u07cb\7X\2\2\u07cb\u07d2"+
		"\3\2\2\2\u07cc\u07d2\5\u017c\u00bf\2\u07cd\u07d2\5\u0184\u00c3\2\u07ce"+
		"\u07d2\5\u018a\u00c6\2\u07cf\u07d2\5\u0190\u00c9\2\u07d0\u07d2\5\u0198"+
		"\u00cd\2\u07d1\u07a9\3\2\2\2\u07d1\u07aa\3\2\2\2\u07d1\u07b5\3\2\2\2\u07d1"+
		"\u07c0\3\2\2\2\u07d1\u07c3\3\2\2\2\u07d1\u07c4\3\2\2\2\u07d1\u07c8\3\2"+
		"\2\2\u07d1\u07cc\3\2\2\2\u07d1\u07cd\3\2\2\2\u07d1\u07ce\3\2\2\2\u07d1"+
		"\u07cf\3\2\2\2\u07d1\u07d0\3\2\2\2\u07d2\u0173\3\2\2\2\u07d3\u07d4\3\2"+
		"\2\2\u07d4\u0175\3\2\2\2\u07d5\u07fd\5\2\2\2\u07d6\u07db\5\66\34\2\u07d7"+
		"\u07d8\7[\2\2\u07d8\u07da\7\\\2\2\u07d9\u07d7\3\2\2\2\u07da\u07dd\3\2"+
		"\2\2\u07db\u07d9\3\2\2\2\u07db\u07dc\3\2\2\2\u07dc\u07de\3\2\2\2\u07dd"+
		"\u07db\3\2\2\2\u07de\u07df\7_\2\2\u07df\u07e0\7\13\2\2\u07e0\u07fd\3\2"+
		"\2\2\u07e1\u07e6\5x=\2\u07e2\u07e3\7[\2\2\u07e3\u07e5\7\\\2\2\u07e4\u07e2"+
		"\3\2\2\2\u07e5\u07e8\3\2\2\2\u07e6\u07e4\3\2\2\2\u07e6\u07e7\3\2\2\2\u07e7"+
		"\u07e9\3\2\2\2\u07e8\u07e6\3\2\2\2\u07e9\u07ea\7_\2\2\u07ea\u07eb\7\13"+
		"\2\2\u07eb\u07fd\3\2\2\2\u07ec\u07ed\7\62\2\2\u07ed\u07ee\7_\2\2\u07ee"+
		"\u07fd\7\13\2\2\u07ef\u07fd\7-\2\2\u07f0\u07f1\5\66\34\2\u07f1\u07f2\7"+
		"_\2\2\u07f2\u07f3\7-\2\2\u07f3\u07fd\3\2\2\2\u07f4\u07f5\7W\2\2\u07f5"+
		"\u07f6\5\u01a2\u00d2\2\u07f6\u07f7\7X\2\2\u07f7\u07fd\3\2\2\2\u07f8\u07fd"+
		"\5\u017c\u00bf\2\u07f9\u07fd\5\u0184\u00c3\2\u07fa\u07fd\5\u0190\u00c9"+
		"\2\u07fb\u07fd\5\u0198\u00cd\2\u07fc\u07d5\3\2\2\2\u07fc\u07d6\3\2\2\2"+
		"\u07fc\u07e1\3\2\2\2\u07fc\u07ec\3\2\2\2\u07fc\u07ef\3\2\2\2\u07fc\u07f0"+
		"\3\2\2\2\u07fc\u07f4\3\2\2\2\u07fc\u07f8\3\2\2\2\u07fc\u07f9\3\2\2\2\u07fc"+
		"\u07fa\3\2\2\2\u07fc\u07fb\3\2\2\2\u07fd\u0177\3\2\2\2\u07fe\u0800\7!"+
		"\2\2\u07ff\u0801\5*\26\2\u0800\u07ff\3\2\2\2\u0800\u0801\3\2\2\2\u0801"+
		"\u0805\3\2\2\2\u0802\u0804\5\u00eav\2\u0803\u0802\3\2\2\2\u0804\u0807"+
		"\3\2\2\2\u0805\u0803\3\2\2\2\u0805\u0806\3\2\2\2\u0806\u0808\3\2\2\2\u0807"+
		"\u0805\3\2\2\2\u0808\u0813\7\u0084\2\2\u0809\u080d\7_\2\2\u080a\u080c"+
		"\5\u00eav\2\u080b\u080a\3\2\2\2\u080c\u080f\3\2\2\2\u080d\u080b\3\2\2"+
		"\2\u080d\u080e\3\2\2\2\u080e\u0810\3\2\2\2\u080f\u080d\3\2\2\2\u0810\u0812"+
		"\7\u0084\2\2\u0811\u0809\3\2\2\2\u0812\u0815\3\2\2\2\u0813\u0811\3\2\2"+
		"\2\u0813\u0814\3\2\2\2\u0814\u0817\3\2\2\2\u0815\u0813\3\2\2\2\u0816\u0818"+
		"\5\u017e\u00c0\2\u0817\u0816\3\2\2\2\u0817\u0818\3\2\2\2\u0818\u0819\3"+
		"\2\2\2\u0819\u081b\7W\2\2\u081a\u081c\5\u0192\u00ca\2\u081b\u081a\3\2"+
		"\2\2\u081b\u081c\3\2\2\2\u081c\u081d\3\2\2\2\u081d\u081f\7X\2\2\u081e"+
		"\u0820\5d\63\2\u081f\u081e\3\2\2\2\u081f\u0820\3\2\2\2\u0820\u0852\3\2"+
		"\2\2\u0821\u0822\5:\36\2\u0822\u0823\7_\2\2\u0823\u0825\7!\2\2\u0824\u0826"+
		"\5*\26\2\u0825\u0824\3\2\2\2\u0825\u0826\3\2\2\2\u0826\u082a\3\2\2\2\u0827"+
		"\u0829\5\u00eav\2\u0828\u0827\3\2\2\2\u0829\u082c\3\2\2\2\u082a\u0828"+
		"\3\2\2\2\u082a\u082b\3\2\2\2\u082b\u082d\3\2\2\2\u082c\u082a\3\2\2\2\u082d"+
		"\u082f\7\u0084\2\2\u082e\u0830\5\u017e\u00c0\2\u082f\u082e\3\2\2\2\u082f"+
		"\u0830\3\2\2\2\u0830\u0831\3\2\2\2\u0831\u0833\7W\2\2\u0832\u0834\5\u0192"+
		"\u00ca\2\u0833\u0832\3\2\2\2\u0833\u0834\3\2\2\2\u0834\u0835\3\2\2\2\u0835"+
		"\u0837\7X\2\2\u0836\u0838\5d\63\2\u0837\u0836\3\2\2\2\u0837\u0838\3\2"+
		"\2\2\u0838\u0852\3\2\2\2\u0839\u083a\5\u0164\u00b3\2\u083a\u083b\7_\2"+
		"\2\u083b\u083d\7!\2\2\u083c\u083e\5*\26\2\u083d\u083c\3\2\2\2\u083d\u083e"+
		"\3\2\2\2\u083e\u0842\3\2\2\2\u083f\u0841\5\u00eav\2\u0840\u083f\3\2\2"+
		"\2\u0841\u0844\3\2\2\2\u0842\u0840\3\2\2\2\u0842\u0843\3\2\2\2\u0843\u0845"+
		"\3\2\2\2\u0844\u0842\3\2\2\2\u0845\u0847\7\u0084\2\2\u0846\u0848\5\u017e"+
		"\u00c0\2\u0847\u0846\3\2\2\2\u0847\u0848\3\2\2\2\u0848\u0849\3\2\2\2\u0849"+
		"\u084b\7W\2\2\u084a\u084c\5\u0192\u00ca\2\u084b\u084a\3\2\2\2\u084b\u084c"+
		"\3\2\2\2\u084c\u084d\3\2\2\2\u084d\u084f\7X\2\2\u084e\u0850\5d\63\2\u084f"+
		"\u084e\3\2\2\2\u084f\u0850\3\2\2\2\u0850\u0852\3\2\2\2\u0851\u07fe\3\2"+
		"\2\2\u0851\u0821\3\2\2\2\u0851\u0839\3\2\2\2\u0852\u0179\3\2\2\2\u0853"+
		"\u0854\7_\2\2\u0854\u0856\7!\2\2\u0855\u0857\5*\26\2\u0856\u0855\3\2\2"+
		"\2\u0856\u0857\3\2\2\2\u0857\u085b\3\2\2\2\u0858\u085a\5\u00eav\2\u0859"+
		"\u0858\3\2\2\2\u085a\u085d\3\2\2\2\u085b\u0859\3\2\2\2\u085b\u085c\3\2"+
		"\2\2\u085c\u085e\3\2\2\2\u085d\u085b\3\2\2\2\u085e\u0860\7\u0084\2\2\u085f"+
		"\u0861\5\u017e\u00c0\2\u0860\u085f\3\2\2\2\u0860\u0861\3\2\2\2\u0861\u0862"+
		"\3\2\2\2\u0862\u0864\7W\2\2\u0863\u0865\5\u0192\u00ca\2\u0864\u0863\3"+
		"\2\2\2\u0864\u0865\3\2\2\2\u0865\u0866\3\2\2\2\u0866\u0868\7X\2\2\u0867"+
		"\u0869\5d\63\2\u0868\u0867\3\2\2\2\u0868\u0869\3\2\2\2\u0869\u017b\3\2"+
		"\2\2\u086a\u086c\7!\2\2\u086b\u086d\5*\26\2\u086c\u086b\3\2\2\2\u086c"+
		"\u086d\3\2\2\2\u086d\u0871\3\2\2\2\u086e\u0870\5\u00eav\2\u086f\u086e"+
		"\3\2\2\2\u0870\u0873\3\2\2\2\u0871\u086f\3\2\2\2\u0871\u0872\3\2\2\2\u0872"+
		"\u0874\3\2\2\2\u0873\u0871\3\2\2\2\u0874\u087f\7\u0084\2\2\u0875\u0879"+
		"\7_\2\2\u0876\u0878\5\u00eav\2\u0877\u0876\3\2\2\2\u0878\u087b\3\2\2\2"+
		"\u0879\u0877\3\2\2\2\u0879\u087a\3\2\2\2\u087a\u087c\3\2\2\2\u087b\u0879"+
		"\3\2\2\2\u087c\u087e\7\u0084\2\2\u087d\u0875\3\2\2\2\u087e\u0881\3\2\2"+
		"\2\u087f\u087d\3\2\2\2\u087f\u0880\3\2\2\2\u0880\u0883\3\2\2\2\u0881\u087f"+
		"\3\2\2\2\u0882\u0884\5\u017e\u00c0\2\u0883\u0882\3\2\2\2\u0883\u0884\3"+
		"\2\2\2\u0884\u0885\3\2\2\2\u0885\u0887\7W\2\2\u0886\u0888\5\u0192\u00ca"+
		"\2\u0887\u0886\3\2\2\2\u0887\u0888\3\2\2\2\u0888\u0889\3\2\2\2\u0889\u088b"+
		"\7X\2\2\u088a\u088c\5d\63\2\u088b\u088a\3\2\2\2\u088b\u088c\3\2\2\2\u088c"+
		"\u08a6\3\2\2\2\u088d\u088e\5:\36\2\u088e\u088f\7_\2\2\u088f\u0891\7!\2"+
		"\2\u0890\u0892\5*\26\2\u0891\u0890\3\2\2\2\u0891\u0892\3\2\2\2\u0892\u0896"+
		"\3\2\2\2\u0893\u0895\5\u00eav\2\u0894\u0893\3\2\2\2\u0895\u0898\3\2\2"+
		"\2\u0896\u0894\3\2\2\2\u0896\u0897\3\2\2\2\u0897\u0899\3\2\2\2\u0898\u0896"+
		"\3\2\2\2\u0899\u089b\7\u0084\2\2\u089a\u089c\5\u017e\u00c0\2\u089b\u089a"+
		"\3\2\2\2\u089b\u089c\3\2\2\2\u089c\u089d\3\2\2\2\u089d\u089f\7W\2\2\u089e"+
		"\u08a0\5\u0192\u00ca\2\u089f\u089e\3\2\2\2\u089f\u08a0\3\2\2\2\u08a0\u08a1"+
		"\3\2\2\2\u08a1\u08a3\7X\2\2\u08a2\u08a4\5d\63\2\u08a3\u08a2\3\2\2\2\u08a3"+
		"\u08a4\3\2\2\2\u08a4\u08a6\3\2\2\2\u08a5\u086a\3\2\2\2\u08a5\u088d\3\2"+
		"\2\2\u08a6\u017d\3\2\2\2\u08a7\u08ab\5*\26\2\u08a8\u08a9\7b\2\2\u08a9"+
		"\u08ab\7a\2\2\u08aa\u08a7\3\2\2\2\u08aa\u08a8\3\2\2\2\u08ab\u017f\3\2"+
		"\2\2\u08ac\u08ad\5\u0164\u00b3\2\u08ad\u08ae\7_\2\2\u08ae\u08af\7\u0084"+
		"\2\2\u08af\u08ba\3\2\2\2\u08b0\u08b1\7*\2\2\u08b1\u08b2\7_\2\2\u08b2\u08ba"+
		"\7\u0084\2\2\u08b3\u08b4\5\66\34\2\u08b4\u08b5\7_\2\2\u08b5\u08b6\7*\2"+
		"\2\u08b6\u08b7\7_\2\2\u08b7\u08b8\7\u0084\2\2\u08b8\u08ba\3\2\2\2\u08b9"+
		"\u08ac\3\2\2\2\u08b9\u08b0\3\2\2\2\u08b9\u08b3\3\2\2\2\u08ba\u0181\3\2"+
		"\2\2\u08bb\u08bc\7_\2\2\u08bc\u08bd\7\u0084\2\2\u08bd\u0183\3\2\2\2\u08be"+
		"\u08bf\7*\2\2\u08bf\u08c0\7_\2\2\u08c0\u08c8\7\u0084\2\2\u08c1\u08c2\5"+
		"\66\34\2\u08c2\u08c3\7_\2\2\u08c3\u08c4\7*\2\2\u08c4\u08c5\7_\2\2\u08c5"+
		"\u08c6\7\u0084\2\2\u08c6\u08c8\3\2\2\2\u08c7\u08be\3\2\2\2\u08c7\u08c1"+
		"\3\2\2\2\u08c8\u0185\3\2\2\2\u08c9\u08ca\5:\36\2\u08ca\u08cb\7[\2\2\u08cb"+
		"\u08cc\5\u01a2\u00d2\2\u08cc\u08cd\7\\\2\2\u08cd\u08d4\3\2\2\2\u08ce\u08cf"+
		"\5\u016a\u00b6\2\u08cf\u08d0\7[\2\2\u08d0\u08d1\5\u01a2\u00d2\2\u08d1"+
		"\u08d2\7\\\2\2\u08d2\u08d4\3\2\2\2\u08d3\u08c9\3\2\2\2\u08d3\u08ce\3\2"+
		"\2\2\u08d4\u08dc\3\2\2\2\u08d5\u08d6\5\u0168\u00b5\2\u08d6\u08d7\7[\2"+
		"\2\u08d7\u08d8\5\u01a2\u00d2\2\u08d8\u08d9\7\\\2\2\u08d9\u08db\3\2\2\2"+
		"\u08da\u08d5\3\2\2\2\u08db\u08de\3\2\2\2\u08dc\u08da\3\2\2\2\u08dc\u08dd"+
		"\3\2\2\2\u08dd\u0187\3\2\2\2\u08de\u08dc\3\2\2\2\u08df\u08e0\5\u0170\u00b9"+
		"\2\u08e0\u08e1\7[\2\2\u08e1\u08e2\5\u01a2\u00d2\2\u08e2\u08ea\7\\\2\2"+
		"\u08e3\u08e4\5\u016e\u00b8\2\u08e4\u08e5\7[\2\2\u08e5\u08e6\5\u01a2\u00d2"+
		"\2\u08e6\u08e7\7\\\2\2\u08e7\u08e9\3\2\2\2\u08e8\u08e3\3\2\2\2\u08e9\u08ec"+
		"\3\2\2\2\u08ea\u08e8\3\2\2\2\u08ea\u08eb\3\2\2\2\u08eb\u0189\3\2\2\2\u08ec"+
		"\u08ea\3\2\2\2\u08ed\u08ee\5:\36\2\u08ee\u08ef\7[\2\2\u08ef\u08f0\5\u01a2"+
		"\u00d2\2\u08f0\u08f1\7\\\2\2\u08f1\u08f8\3\2\2\2\u08f2\u08f3\5\u0176\u00bc"+
		"\2\u08f3\u08f4\7[\2\2\u08f4\u08f5\5\u01a2\u00d2\2\u08f5\u08f6\7\\\2\2"+
		"\u08f6\u08f8\3\2\2\2\u08f7\u08ed\3\2\2\2\u08f7\u08f2\3\2\2\2\u08f8\u0900"+
		"\3\2\2\2\u08f9\u08fa\5\u0174\u00bb\2\u08fa\u08fb\7[\2\2\u08fb\u08fc\5"+
		"\u01a2\u00d2\2\u08fc\u08fd\7\\\2\2\u08fd\u08ff\3\2\2\2\u08fe\u08f9\3\2"+
		"\2\2\u08ff\u0902\3\2\2\2\u0900\u08fe\3\2\2\2\u0900\u0901\3\2\2\2\u0901"+
		"\u018b\3\2\2\2\u0902\u0900\3\2\2\2\u0903\u0904\5<\37\2\u0904\u0906\7W"+
		"\2\2\u0905\u0907\5\u0192\u00ca\2\u0906\u0905\3\2\2\2\u0906\u0907\3\2\2"+
		"\2\u0907\u0908\3\2\2\2\u0908\u0909\7X\2\2\u0909\u0948\3\2\2\2\u090a\u090b"+
		"\5\66\34\2\u090b\u090d\7_\2\2\u090c\u090e\5*\26\2\u090d\u090c\3\2\2\2"+
		"\u090d\u090e\3\2\2\2\u090e\u090f\3\2\2\2\u090f\u0910\7\u0084\2\2\u0910"+
		"\u0912\7W\2\2\u0911\u0913\5\u0192\u00ca\2\u0912\u0911\3\2\2\2\u0912\u0913"+
		"\3\2\2\2\u0913\u0914\3\2\2\2\u0914\u0915\7X\2\2\u0915\u0948\3\2\2\2\u0916"+
		"\u0917\5:\36\2\u0917\u0919\7_\2\2\u0918\u091a\5*\26\2\u0919\u0918\3\2"+
		"\2\2\u0919\u091a\3\2\2\2\u091a\u091b\3\2\2\2\u091b\u091c\7\u0084\2\2\u091c"+
		"\u091e\7W\2\2\u091d\u091f\5\u0192\u00ca\2\u091e\u091d\3\2\2\2\u091e\u091f"+
		"\3\2\2\2\u091f\u0920\3\2\2\2\u0920\u0921\7X\2\2\u0921\u0948\3\2\2\2\u0922"+
		"\u0923\5\u0164\u00b3\2\u0923\u0925\7_\2\2\u0924\u0926\5*\26\2\u0925\u0924"+
		"\3\2\2\2\u0925\u0926\3\2\2\2\u0926\u0927\3\2\2\2\u0927\u0928\7\u0084\2"+
		"\2\u0928\u092a\7W\2\2\u0929\u092b\5\u0192\u00ca\2\u092a\u0929\3\2\2\2"+
		"\u092a\u092b\3\2\2\2\u092b\u092c\3\2\2\2\u092c\u092d\7X\2\2\u092d\u0948"+
		"\3\2\2\2\u092e\u092f\7*\2\2\u092f\u0931\7_\2\2\u0930\u0932\5*\26\2\u0931"+
		"\u0930\3\2\2\2\u0931\u0932\3\2\2\2\u0932\u0933\3\2\2\2\u0933\u0934\7\u0084"+
		"\2\2\u0934\u0936\7W\2\2\u0935\u0937\5\u0192\u00ca\2\u0936\u0935\3\2\2"+
		"\2\u0936\u0937\3\2\2\2\u0937\u0938\3\2\2\2\u0938\u0948\7X\2\2\u0939\u093a"+
		"\5\66\34\2\u093a\u093b\7_\2\2\u093b\u093c\7*\2\2\u093c\u093e\7_\2\2\u093d"+
		"\u093f\5*\26\2\u093e\u093d\3\2\2\2\u093e\u093f\3\2\2\2\u093f\u0940\3\2"+
		"\2\2\u0940\u0941\7\u0084\2\2\u0941\u0943\7W\2\2\u0942\u0944\5\u0192\u00ca"+
		"\2\u0943\u0942\3\2\2\2\u0943\u0944\3\2\2\2\u0944\u0945\3\2\2\2\u0945\u0946"+
		"\7X\2\2\u0946\u0948\3\2\2\2\u0947\u0903\3\2\2\2\u0947\u090a\3\2\2\2\u0947"+
		"\u0916\3\2\2\2\u0947\u0922\3\2\2\2\u0947\u092e\3\2\2\2\u0947\u0939\3\2"+
		"\2\2\u0948\u018d\3\2\2\2\u0949\u094b\7_\2\2\u094a\u094c\5*\26\2\u094b"+
		"\u094a\3\2\2\2\u094b\u094c\3\2\2\2\u094c\u094d\3\2\2\2\u094d\u094e\7\u0084"+
		"\2\2\u094e\u0950\7W\2\2\u094f\u0951\5\u0192\u00ca\2\u0950\u094f\3\2\2"+
		"\2\u0950\u0951\3\2\2\2\u0951\u0952\3\2\2\2\u0952\u0953\7X\2\2\u0953\u018f"+
		"\3\2\2\2\u0954\u0955\5<\37\2\u0955\u0957\7W\2\2\u0956\u0958\5\u0192\u00ca"+
		"\2\u0957\u0956\3\2\2\2\u0957\u0958\3\2\2\2\u0958\u0959\3\2\2\2\u0959\u095a"+
		"\7X\2\2\u095a\u098d\3\2\2\2\u095b\u095c\5\66\34\2\u095c\u095e\7_\2\2\u095d"+
		"\u095f\5*\26\2\u095e\u095d\3\2\2\2\u095e\u095f\3\2\2\2\u095f\u0960\3\2"+
		"\2\2\u0960\u0961\7\u0084\2\2\u0961\u0963";
	private static final String _serializedATNSegment1 =
		"\7W\2\2\u0962\u0964\5\u0192\u00ca\2\u0963\u0962\3\2\2\2\u0963\u0964\3"+
		"\2\2\2\u0964\u0965\3\2\2\2\u0965\u0966\7X\2\2\u0966\u098d\3\2\2\2\u0967"+
		"\u0968\5:\36\2\u0968\u096a\7_\2\2\u0969\u096b\5*\26\2\u096a\u0969\3\2"+
		"\2\2\u096a\u096b\3\2\2\2\u096b\u096c\3\2\2\2\u096c\u096d\7\u0084\2\2\u096d"+
		"\u096f\7W\2\2\u096e\u0970\5\u0192\u00ca\2\u096f\u096e\3\2\2\2\u096f\u0970"+
		"\3\2\2\2\u0970\u0971\3\2\2\2\u0971\u0972\7X\2\2\u0972\u098d\3\2\2\2\u0973"+
		"\u0974\7*\2\2\u0974\u0976\7_\2\2\u0975\u0977\5*\26\2\u0976\u0975\3\2\2"+
		"\2\u0976\u0977\3\2\2\2\u0977\u0978\3\2\2\2\u0978\u0979\7\u0084\2\2\u0979"+
		"\u097b\7W\2\2\u097a\u097c\5\u0192\u00ca\2\u097b\u097a\3\2\2\2\u097b\u097c"+
		"\3\2\2\2\u097c\u097d\3\2\2\2\u097d\u098d\7X\2\2\u097e\u097f\5\66\34\2"+
		"\u097f\u0980\7_\2\2\u0980\u0981\7*\2\2\u0981\u0983\7_\2\2\u0982\u0984"+
		"\5*\26\2\u0983\u0982\3\2\2\2\u0983\u0984\3\2\2\2\u0984\u0985\3\2\2\2\u0985"+
		"\u0986\7\u0084\2\2\u0986\u0988\7W\2\2\u0987\u0989\5\u0192\u00ca\2\u0988"+
		"\u0987\3\2\2\2\u0988\u0989\3\2\2\2\u0989\u098a\3\2\2\2\u098a\u098b\7X"+
		"\2\2\u098b\u098d\3\2\2\2\u098c\u0954\3\2\2\2\u098c\u095b\3\2\2\2\u098c"+
		"\u0967\3\2\2\2\u098c\u0973\3\2\2\2\u098c\u097e\3\2\2\2\u098d\u0191\3\2"+
		"\2\2\u098e\u0993\5\u01a2\u00d2\2\u098f\u0990\7^\2\2\u0990\u0992\5\u01a2"+
		"\u00d2\2\u0991\u098f\3\2\2\2\u0992\u0995\3\2\2\2\u0993\u0991\3\2\2\2\u0993"+
		"\u0994\3\2\2\2\u0994\u0193\3\2\2\2\u0995\u0993\3\2\2\2\u0996\u0997\5:"+
		"\36\2\u0997\u0999\7x\2\2\u0998\u099a\5*\26\2\u0999\u0998\3\2\2\2\u0999"+
		"\u099a\3\2\2\2\u099a\u099b\3\2\2\2\u099b\u099c\7\u0084\2\2\u099c\u09c6"+
		"\3\2\2\2\u099d\u099e\5\f\7\2\u099e\u09a0\7x\2\2\u099f\u09a1\5*\26\2\u09a0"+
		"\u099f\3\2\2\2\u09a0\u09a1\3\2\2\2\u09a1\u09a2\3\2\2\2\u09a2\u09a3\7\u0084"+
		"\2\2\u09a3\u09c6\3\2\2\2\u09a4\u09a5\5\u0164\u00b3\2\u09a5\u09a7\7x\2"+
		"\2\u09a6\u09a8\5*\26\2\u09a7\u09a6\3\2\2\2\u09a7\u09a8\3\2\2\2\u09a8\u09a9"+
		"\3\2\2\2\u09a9\u09aa\7\u0084\2\2\u09aa\u09c6\3\2\2\2\u09ab\u09ac\7*\2"+
		"\2\u09ac\u09ae\7x\2\2\u09ad\u09af\5*\26\2\u09ae\u09ad\3\2\2\2\u09ae\u09af"+
		"\3\2\2\2\u09af\u09b0\3\2\2\2\u09b0\u09c6\7\u0084\2\2\u09b1\u09b2\5\66"+
		"\34\2\u09b2\u09b3\7_\2\2\u09b3\u09b4\7*\2\2\u09b4\u09b6\7x\2\2\u09b5\u09b7"+
		"\5*\26\2\u09b6\u09b5\3\2\2\2\u09b6\u09b7\3\2\2\2\u09b7\u09b8\3\2\2\2\u09b8"+
		"\u09b9\7\u0084\2\2\u09b9\u09c6\3\2\2\2\u09ba\u09bb\5\20\t\2\u09bb\u09bd"+
		"\7x\2\2\u09bc\u09be\5*\26\2\u09bd\u09bc\3\2\2\2\u09bd\u09be\3\2\2\2\u09be"+
		"\u09bf\3\2\2\2\u09bf\u09c0\7!\2\2\u09c0\u09c6\3\2\2\2\u09c1\u09c2\5\36"+
		"\20\2\u09c2\u09c3\7x\2\2\u09c3\u09c4\7!\2\2\u09c4\u09c6\3\2\2\2\u09c5"+
		"\u0996\3\2\2\2\u09c5\u099d\3\2\2\2\u09c5\u09a4\3\2\2\2\u09c5\u09ab\3\2"+
		"\2\2\u09c5\u09b1\3\2\2\2\u09c5\u09ba\3\2\2\2\u09c5\u09c1\3\2\2\2\u09c6"+
		"\u0195\3\2\2\2\u09c7\u09c9\7x\2\2\u09c8\u09ca\5*\26\2\u09c9\u09c8\3\2"+
		"\2\2\u09c9\u09ca\3\2\2\2\u09ca\u09cb\3\2\2\2\u09cb\u09cc\7\u0084\2\2\u09cc"+
		"\u0197\3\2\2\2\u09cd\u09ce\5:\36\2\u09ce\u09d0\7x\2\2\u09cf\u09d1\5*\26"+
		"\2\u09d0\u09cf\3\2\2\2\u09d0\u09d1\3\2\2\2\u09d1\u09d2\3\2\2\2\u09d2\u09d3"+
		"\7\u0084\2\2\u09d3\u09f6\3\2\2\2\u09d4\u09d5\5\f\7\2\u09d5\u09d7\7x\2"+
		"\2\u09d6\u09d8\5*\26\2\u09d7\u09d6\3\2\2\2\u09d7\u09d8\3\2\2\2\u09d8\u09d9"+
		"\3\2\2\2\u09d9\u09da\7\u0084\2\2\u09da\u09f6\3\2\2\2\u09db\u09dc\7*\2"+
		"\2\u09dc\u09de\7x\2\2\u09dd\u09df\5*\26\2\u09de\u09dd\3\2\2\2\u09de\u09df"+
		"\3\2\2\2\u09df\u09e0\3\2\2\2\u09e0\u09f6\7\u0084\2\2\u09e1\u09e2\5\66"+
		"\34\2\u09e2\u09e3\7_\2\2\u09e3\u09e4\7*\2\2\u09e4\u09e6\7x\2\2\u09e5\u09e7"+
		"\5*\26\2\u09e6\u09e5\3\2\2\2\u09e6\u09e7\3\2\2\2\u09e7\u09e8\3\2\2\2\u09e8"+
		"\u09e9\7\u0084\2\2\u09e9\u09f6\3\2\2\2\u09ea\u09eb\5\20\t\2\u09eb\u09ed"+
		"\7x\2\2\u09ec\u09ee\5*\26\2\u09ed\u09ec\3\2\2\2\u09ed\u09ee\3\2\2\2\u09ee"+
		"\u09ef\3\2\2\2\u09ef\u09f0\7!\2\2\u09f0\u09f6\3\2\2\2\u09f1\u09f2\5\36"+
		"\20\2\u09f2\u09f3\7x\2\2\u09f3\u09f4\7!\2\2\u09f4\u09f6\3\2\2\2\u09f5"+
		"\u09cd\3\2\2\2\u09f5\u09d4\3\2\2\2\u09f5\u09db\3\2\2\2\u09f5\u09e1\3\2"+
		"\2\2\u09f5\u09ea\3\2\2\2\u09f5\u09f1\3\2\2\2\u09f6\u0199\3\2\2\2\u09f7"+
		"\u09f8\7!\2\2\u09f8\u09f9\5\4\3\2\u09f9\u09fb\5\u019c\u00cf\2\u09fa\u09fc"+
		"\5 \21\2\u09fb\u09fa\3\2\2\2\u09fb\u09fc\3\2\2\2\u09fc\u0a0e\3\2\2\2\u09fd"+
		"\u09fe\7!\2\2\u09fe\u09ff\5\16\b\2\u09ff\u0a01\5\u019c\u00cf\2\u0a00\u0a02"+
		"\5 \21\2\u0a01\u0a00\3\2\2\2\u0a01\u0a02\3\2\2\2\u0a02\u0a0e\3\2\2\2\u0a03"+
		"\u0a04\7!\2\2\u0a04\u0a05\5\4\3\2\u0a05\u0a06\5 \21\2\u0a06\u0a07\5\u00fc"+
		"\177\2\u0a07\u0a0e\3\2\2\2\u0a08\u0a09\7!\2\2\u0a09\u0a0a\5\16\b\2\u0a0a"+
		"\u0a0b\5 \21\2\u0a0b\u0a0c\5\u00fc\177\2\u0a0c\u0a0e\3\2\2\2\u0a0d\u09f7"+
		"\3\2\2\2\u0a0d\u09fd\3\2\2\2\u0a0d\u0a03\3\2\2\2\u0a0d\u0a08\3\2\2\2\u0a0e"+
		"\u019b\3\2\2\2\u0a0f\u0a13\5\u019e\u00d0\2\u0a10\u0a12\5\u019e\u00d0\2"+
		"\u0a11\u0a10\3\2\2\2\u0a12\u0a15\3\2\2\2\u0a13\u0a11\3\2\2\2\u0a13\u0a14"+
		"\3\2\2\2\u0a14\u019d\3\2\2\2\u0a15\u0a13\3\2\2\2\u0a16\u0a18\5\u00eav"+
		"\2\u0a17\u0a16\3\2\2\2\u0a18\u0a1b\3\2\2\2\u0a19\u0a17\3\2\2\2\u0a19\u0a1a"+
		"\3\2\2\2\u0a1a\u0a1c\3\2\2\2\u0a1b\u0a19\3\2\2\2\u0a1c\u0a1d\7[\2\2\u0a1d"+
		"\u0a1e\5\u01a2\u00d2\2\u0a1e\u0a1f\7\\\2\2\u0a1f\u019f\3\2\2\2\u0a20\u0a21"+
		"\5\u01a2\u00d2\2\u0a21\u01a1\3\2\2\2\u0a22\u0a25\5\u01a4\u00d3\2\u0a23"+
		"\u0a25\5\u01ac\u00d7\2\u0a24\u0a22\3\2\2\2\u0a24\u0a23\3\2\2\2\u0a25\u01a3"+
		"\3\2\2\2\u0a26\u0a27\5\u01a6\u00d4\2\u0a27\u0a28\7w\2\2\u0a28\u0a29\5"+
		"\u01aa\u00d6\2\u0a29\u01a5\3\2\2\2\u0a2a\u0a35\7\u0084\2\2\u0a2b\u0a2d"+
		"\7W\2\2\u0a2c\u0a2e\5\u0098M\2\u0a2d\u0a2c\3\2\2\2\u0a2d\u0a2e\3\2\2\2"+
		"\u0a2e\u0a2f\3\2\2\2\u0a2f\u0a35\7X\2\2\u0a30\u0a31\7W\2\2\u0a31\u0a32"+
		"\5\u01a8\u00d5\2\u0a32\u0a33\7X\2\2\u0a33\u0a35\3\2\2\2\u0a34\u0a2a\3"+
		"\2\2\2\u0a34\u0a2b\3\2\2\2\u0a34\u0a30\3\2\2\2\u0a35\u01a7\3\2\2\2\u0a36"+
		"\u0a3b\7\u0084\2\2\u0a37\u0a38\7^\2\2\u0a38\u0a3a\7\u0084\2\2\u0a39\u0a37"+
		"\3\2\2\2\u0a3a\u0a3d\3\2\2\2\u0a3b\u0a39\3\2\2\2\u0a3b\u0a3c\3\2\2\2\u0a3c"+
		"\u01a9\3\2\2\2\u0a3d\u0a3b\3\2\2\2\u0a3e\u0a41\5\u01a2\u00d2\2\u0a3f\u0a41"+
		"\5\u0100\u0081\2\u0a40\u0a3e\3\2\2\2\u0a40\u0a3f\3\2\2\2\u0a41\u01ab\3"+
		"\2\2\2\u0a42\u0a45\5\u01b4\u00db\2\u0a43\u0a45\5\u01ae\u00d8\2\u0a44\u0a42"+
		"\3\2\2\2\u0a44\u0a43\3\2\2\2\u0a45\u01ad\3\2\2\2\u0a46\u0a47\5\u01b0\u00d9"+
		"\2\u0a47\u0a48\5\u01b2\u00da\2\u0a48\u0a49\5\u01a2\u00d2\2\u0a49\u01af"+
		"\3\2\2\2\u0a4a\u0a4e\5:\36\2\u0a4b\u0a4e\5\u0180\u00c1\2\u0a4c\u0a4e\5"+
		"\u0186\u00c4\2\u0a4d\u0a4a\3\2\2\2\u0a4d\u0a4b\3\2\2\2\u0a4d\u0a4c\3\2"+
		"\2\2\u0a4e\u01b1\3\2\2\2\u0a4f\u0a50\t\7\2\2\u0a50\u01b3\3\2\2\2\u0a51"+
		"\u0a59\5\u01b6\u00dc\2\u0a52\u0a53\5\u01b6\u00dc\2\u0a53\u0a54\7e\2\2"+
		"\u0a54\u0a55\5\u01a2\u00d2\2\u0a55\u0a56\7f\2\2\u0a56\u0a57\5\u01b4\u00db"+
		"\2\u0a57\u0a59\3\2\2\2\u0a58\u0a51\3\2\2\2\u0a58\u0a52\3\2\2\2\u0a59\u01b5"+
		"\3\2\2\2\u0a5a\u0a5b\b\u00dc\1\2\u0a5b\u0a5c\5\u01b8\u00dd\2\u0a5c\u0a62"+
		"\3\2\2\2\u0a5d\u0a5e\f\3\2\2\u0a5e\u0a5f\7l\2\2\u0a5f\u0a61\5\u01b8\u00dd"+
		"\2\u0a60\u0a5d\3\2\2\2\u0a61\u0a64\3\2\2\2\u0a62\u0a60\3\2\2\2\u0a62\u0a63"+
		"\3\2\2\2\u0a63\u01b7\3\2\2\2\u0a64\u0a62\3\2\2\2\u0a65\u0a66\b\u00dd\1"+
		"\2\u0a66\u0a67\5\u01ba\u00de\2\u0a67\u0a6d\3\2\2\2\u0a68\u0a69\f\3\2\2"+
		"\u0a69\u0a6a\7k\2\2\u0a6a\u0a6c\5\u01ba\u00de\2\u0a6b\u0a68\3\2\2\2\u0a6c"+
		"\u0a6f\3\2\2\2\u0a6d\u0a6b\3\2\2\2\u0a6d\u0a6e\3\2\2\2\u0a6e\u01b9\3\2"+
		"\2\2\u0a6f\u0a6d\3\2\2\2\u0a70\u0a71\b\u00de\1\2\u0a71\u0a72\5\u01bc\u00df"+
		"\2\u0a72\u0a78\3\2\2\2\u0a73\u0a74\f\3\2\2\u0a74\u0a75\7t\2\2\u0a75\u0a77"+
		"\5\u01bc\u00df\2\u0a76\u0a73\3\2\2\2\u0a77\u0a7a\3\2\2\2\u0a78\u0a76\3"+
		"\2\2\2\u0a78\u0a79\3\2\2\2\u0a79\u01bb\3\2\2\2\u0a7a\u0a78\3\2\2\2\u0a7b"+
		"\u0a7c\b\u00df\1\2\u0a7c\u0a7d\5\u01be\u00e0\2\u0a7d\u0a83\3\2\2\2\u0a7e"+
		"\u0a7f\f\3\2\2\u0a7f\u0a80\7u\2\2\u0a80\u0a82\5\u01be\u00e0\2\u0a81\u0a7e"+
		"\3\2\2\2\u0a82\u0a85\3\2\2\2\u0a83\u0a81\3\2\2\2\u0a83\u0a84\3\2\2\2\u0a84"+
		"\u01bd\3\2\2\2\u0a85\u0a83\3\2\2\2\u0a86\u0a87\b\u00e0\1\2\u0a87\u0a88"+
		"\5\u01c0\u00e1\2\u0a88\u0a8e\3\2\2\2\u0a89\u0a8a\f\3\2\2\u0a8a\u0a8b\7"+
		"s\2\2\u0a8b\u0a8d\5\u01c0\u00e1\2\u0a8c\u0a89\3\2\2\2\u0a8d\u0a90\3\2"+
		"\2\2\u0a8e\u0a8c\3\2\2\2\u0a8e\u0a8f\3\2\2\2\u0a8f\u01bf\3\2\2\2\u0a90"+
		"\u0a8e\3\2\2\2\u0a91\u0a92\b\u00e1\1\2\u0a92\u0a93\5\u01c2\u00e2\2\u0a93"+
		"\u0a9c\3\2\2\2\u0a94\u0a95\f\4\2\2\u0a95\u0a96\7g\2\2\u0a96\u0a9b\5\u01c2"+
		"\u00e2\2\u0a97\u0a98\f\3\2\2\u0a98\u0a99\7j\2\2\u0a99\u0a9b\5\u01c2\u00e2"+
		"\2\u0a9a\u0a94\3\2\2\2\u0a9a\u0a97\3\2\2\2\u0a9b\u0a9e\3\2\2\2\u0a9c\u0a9a"+
		"\3\2\2\2\u0a9c\u0a9d\3\2\2\2\u0a9d\u01c1\3\2\2\2\u0a9e\u0a9c\3\2\2\2\u0a9f"+
		"\u0aa0\b\u00e2\1\2\u0aa0\u0aa1\5\u01c4\u00e3\2\u0aa1\u0ab3\3\2\2\2\u0aa2"+
		"\u0aa3\f\7\2\2\u0aa3\u0aa4\7b\2\2\u0aa4\u0ab2\5\u01c4\u00e3\2\u0aa5\u0aa6"+
		"\f\6\2\2\u0aa6\u0aa7\7a\2\2\u0aa7\u0ab2\5\u01c4\u00e3\2\u0aa8\u0aa9\f"+
		"\5\2\2\u0aa9\u0aaa\7h\2\2\u0aaa\u0ab2\5\u01c4\u00e3\2\u0aab\u0aac\f\4"+
		"\2\2\u0aac\u0aad\7i\2\2\u0aad\u0ab2\5\u01c4\u00e3\2\u0aae\u0aaf\f\3\2"+
		"\2\u0aaf\u0ab0\7\34\2\2\u0ab0\u0ab2\5\f\7\2\u0ab1\u0aa2\3\2\2\2\u0ab1"+
		"\u0aa5\3\2\2\2\u0ab1\u0aa8\3\2\2\2\u0ab1\u0aab\3\2\2\2\u0ab1\u0aae\3\2"+
		"\2\2\u0ab2\u0ab5\3\2\2\2\u0ab3\u0ab1\3\2\2\2\u0ab3\u0ab4\3\2\2\2\u0ab4"+
		"\u01c3\3\2\2\2\u0ab5\u0ab3\3\2\2\2\u0ab6\u0ab7\b\u00e3\1\2\u0ab7\u0ab8"+
		"\5\u01c6\u00e4\2\u0ab8\u0ac8\3\2\2\2\u0ab9\u0aba\f\5\2\2\u0aba\u0abb\7"+
		"b\2\2\u0abb\u0abc\7b\2\2\u0abc\u0ac7\5\u01c6\u00e4\2\u0abd\u0abe\f\4\2"+
		"\2\u0abe\u0abf\7a\2\2\u0abf\u0ac0\7a\2\2\u0ac0\u0ac7\5\u01c6\u00e4\2\u0ac1"+
		"\u0ac2\f\3\2\2\u0ac2\u0ac3\7a\2\2\u0ac3\u0ac4\7a\2\2\u0ac4\u0ac5\7a\2"+
		"\2\u0ac5\u0ac7\5\u01c6\u00e4\2\u0ac6\u0ab9\3\2\2\2\u0ac6\u0abd\3\2\2\2"+
		"\u0ac6\u0ac1\3\2\2\2\u0ac7\u0aca\3\2\2\2\u0ac8\u0ac6\3\2\2\2\u0ac8\u0ac9"+
		"\3\2\2\2\u0ac9\u01c5\3\2\2\2\u0aca\u0ac8\3\2\2\2\u0acb\u0acc\b\u00e4\1"+
		"\2\u0acc\u0acd\5\u01c8\u00e5\2\u0acd\u0ad6\3\2\2\2\u0ace\u0acf\f\4\2\2"+
		"\u0acf\u0ad0\7o\2\2\u0ad0\u0ad5\5\u01c8\u00e5\2\u0ad1\u0ad2\f\3\2\2\u0ad2"+
		"\u0ad3\7p\2\2\u0ad3\u0ad5\5\u01c8\u00e5\2\u0ad4\u0ace\3\2\2\2\u0ad4\u0ad1"+
		"\3\2\2\2\u0ad5\u0ad8\3\2\2\2\u0ad6\u0ad4\3\2\2\2\u0ad6\u0ad7\3\2\2\2\u0ad7"+
		"\u01c7\3\2\2\2\u0ad8\u0ad6\3\2\2\2\u0ad9\u0ada\b\u00e5\1\2\u0ada\u0adb"+
		"\5\u01ca\u00e6\2\u0adb\u0ae7\3\2\2\2\u0adc\u0add\f\5\2\2\u0add\u0ade\7"+
		"q\2\2\u0ade\u0ae6\5\u01ca\u00e6\2\u0adf\u0ae0\f\4\2\2\u0ae0\u0ae1\7r\2"+
		"\2\u0ae1\u0ae6\5\u01ca\u00e6\2\u0ae2\u0ae3\f\3\2\2\u0ae3\u0ae4\7v\2\2"+
		"\u0ae4\u0ae6\5\u01ca\u00e6\2\u0ae5\u0adc\3\2\2\2\u0ae5\u0adf\3\2\2\2\u0ae5"+
		"\u0ae2\3\2\2\2\u0ae6\u0ae9\3\2\2\2\u0ae7\u0ae5\3\2\2\2\u0ae7\u0ae8\3\2"+
		"\2\2\u0ae8\u01c9\3\2\2\2\u0ae9\u0ae7\3\2\2\2\u0aea\u0af2\5\u01cc\u00e7"+
		"\2\u0aeb\u0af2\5\u01ce\u00e8\2\u0aec\u0aed\7o\2\2\u0aed\u0af2\5\u01ca"+
		"\u00e6\2\u0aee\u0aef\7p\2\2\u0aef\u0af2\5\u01ca\u00e6\2\u0af0\u0af2\5"+
		"\u01d0\u00e9\2\u0af1\u0aea\3\2\2\2\u0af1\u0aeb\3\2\2\2\u0af1\u0aec\3\2"+
		"\2\2\u0af1\u0aee\3\2\2\2\u0af1\u0af0\3\2\2\2\u0af2\u01cb\3\2\2\2\u0af3"+
		"\u0af4\7m\2\2\u0af4\u0af5\5\u01ca\u00e6\2\u0af5\u01cd\3\2\2\2\u0af6\u0af7"+
		"\7n\2\2\u0af7\u0af8\5\u01ca\u00e6\2\u0af8\u01cf\3\2\2\2\u0af9\u0b00\5"+
		"\u01d2\u00ea\2\u0afa\u0afb\7d\2\2\u0afb\u0b00\5\u01ca\u00e6\2\u0afc\u0afd"+
		"\7c\2\2\u0afd\u0b00\5\u01ca\u00e6\2\u0afe\u0b00\5\u01dc\u00ef\2\u0aff"+
		"\u0af9\3\2\2\2\u0aff\u0afa\3\2\2\2\u0aff\u0afc\3\2\2\2\u0aff\u0afe\3\2"+
		"\2\2\u0b00\u01d1\3\2\2\2\u0b01\u0b04\5\u0164\u00b3\2\u0b02\u0b04\5:\36"+
		"\2\u0b03\u0b01\3\2\2\2\u0b03\u0b02\3\2\2\2\u0b04\u0b09\3\2\2\2\u0b05\u0b08"+
		"\5\u01d6\u00ec\2\u0b06\u0b08\5\u01da\u00ee\2\u0b07\u0b05\3\2\2\2\u0b07"+
		"\u0b06\3\2\2\2\u0b08\u0b0b\3\2\2\2\u0b09\u0b07\3\2\2\2\u0b09\u0b0a\3\2"+
		"\2\2\u0b0a\u01d3\3\2\2\2\u0b0b\u0b09\3\2\2\2\u0b0c\u0b0d\5\u01d2\u00ea"+
		"\2\u0b0d\u0b0e\7m\2\2\u0b0e\u01d5\3\2\2\2\u0b0f\u0b10\7m\2\2\u0b10\u01d7"+
		"\3\2\2\2\u0b11\u0b12\5\u01d2\u00ea\2\u0b12\u0b13\7n\2\2\u0b13\u01d9\3"+
		"\2\2\2\u0b14\u0b15\7n\2\2\u0b15\u01db\3\2\2\2\u0b16\u0b17\7W\2\2\u0b17"+
		"\u0b18\5\4\3\2\u0b18\u0b19\7X\2\2\u0b19\u0b1a\5\u01ca\u00e6\2\u0b1a\u0b32"+
		"\3\2\2\2\u0b1b\u0b1c\7W\2\2\u0b1c\u0b20\5\f\7\2\u0b1d\u0b1f\5(\25\2\u0b1e"+
		"\u0b1d\3\2\2\2\u0b1f\u0b22\3\2\2\2\u0b20\u0b1e\3\2\2\2\u0b20\u0b21\3\2"+
		"\2\2\u0b21\u0b23\3\2\2\2\u0b22\u0b20\3\2\2\2\u0b23\u0b24\7X\2\2\u0b24"+
		"\u0b25\5\u01d0\u00e9\2\u0b25\u0b32\3\2\2\2\u0b26\u0b27\7W\2\2\u0b27\u0b2b"+
		"\5\f\7\2\u0b28\u0b2a\5(\25\2\u0b29\u0b28\3\2\2\2\u0b2a\u0b2d\3\2\2\2\u0b2b"+
		"\u0b29\3\2\2\2\u0b2b\u0b2c\3\2\2\2\u0b2c\u0b2e\3\2\2\2\u0b2d\u0b2b\3\2"+
		"\2\2\u0b2e\u0b2f\7X\2\2\u0b2f\u0b30\5\u01a4\u00d3\2\u0b30\u0b32\3\2\2"+
		"\2\u0b31\u0b16\3\2\2\2\u0b31\u0b1b\3\2\2\2\u0b31\u0b26\3\2\2\2\u0b32\u01dd"+
		"\3\2\2\2\u0146\u01e3\u01ea\u01ee\u01f2\u01fb\u01ff\u0203\u0205\u020b\u0210"+
		"\u0217\u021c\u021e\u0224\u0229\u022e\u0233\u023e\u024c\u0251\u0259\u0260"+
		"\u0266\u026b\u0276\u0279\u0287\u028c\u0291\u0296\u029c\u02a6\u02ae\u02b8"+
		"\u02c0\u02cc\u02d0\u02d5\u02db\u02e3\u02f0\u030d\u0311\u0316\u031a\u031f"+
		"\u0322\u0325\u0333\u033e\u034c\u0353\u035c\u0363\u0368\u037a\u0381\u0387"+
		"\u038b\u038f\u0393\u0397\u039c\u03a0\u03a4\u03a6\u03ab\u03b2\u03b7\u03b9"+
		"\u03bf\u03c4\u03c8\u03db\u03e0\u03f5\u03fa\u0400\u0406\u0408\u040c\u0411"+
		"\u0415\u041d\u0424\u042c\u042f\u0434\u043d\u0442\u0449\u0450\u0455\u045b"+
		"\u0467\u046c\u0470\u047a\u047f\u0487\u048a\u048f\u0497\u049a\u049f\u04a4"+
		"\u04a9\u04ae\u04b5\u04ba\u04c2\u04c7\u04cc\u04d1\u04d7\u04dd\u04e0\u04e3"+
		"\u04ec\u04f2\u04f8\u04fb\u04fe\u0506\u050b\u0510\u0515\u0519\u051c\u0529"+
		"\u0532\u053c\u0541\u054c\u0551\u055d\u0562\u056e\u0578\u057d\u0585\u0588"+
		"\u058f\u0597\u059d\u05a6\u05b0\u05b4\u05b7\u05c0\u05ce\u05d1\u05da\u05df"+
		"\u05e6\u05eb\u05f3\u05ff\u0606\u0614\u062a\u064c\u0658\u065e\u066a\u0677"+
		"\u0691\u0695\u069a\u069e\u06a2\u06aa\u06ae\u06b2\u06b9\u06c2\u06ca\u06d9"+
		"\u06e5\u06eb\u06f1\u0706\u070b\u0711\u071d\u0728\u0732\u0735\u073a\u0743"+
		"\u0749\u0753\u0758\u0761\u0778\u0782\u0798\u079f\u07a7\u07af\u07ba\u07d1"+
		"\u07db\u07e6\u07fc\u0800\u0805\u080d\u0813\u0817\u081b\u081f\u0825\u082a"+
		"\u082f\u0833\u0837\u083d\u0842\u0847\u084b\u084f\u0851\u0856\u085b\u0860"+
		"\u0864\u0868\u086c\u0871\u0879\u087f\u0883\u0887\u088b\u0891\u0896\u089b"+
		"\u089f\u08a3\u08a5\u08aa\u08b9\u08c7\u08d3\u08dc\u08ea\u08f7\u0900\u0906"+
		"\u090d\u0912\u0919\u091e\u0925\u092a\u0931\u0936\u093e\u0943\u0947\u094b"+
		"\u0950\u0957\u095e\u0963\u096a\u096f\u0976\u097b\u0983\u0988\u098c\u0993"+
		"\u0999\u09a0\u09a7\u09ae\u09b6\u09bd\u09c5\u09c9\u09d0\u09d7\u09de\u09e6"+
		"\u09ed\u09f5\u09fb\u0a01\u0a0d\u0a13\u0a19\u0a24\u0a2d\u0a34\u0a3b\u0a40"+
		"\u0a44\u0a4d\u0a58\u0a62\u0a6d\u0a78\u0a83\u0a8e\u0a9a\u0a9c\u0ab1\u0ab3"+
		"\u0ac6\u0ac8\u0ad4\u0ad6\u0ae5\u0ae7\u0af1\u0aff\u0b03\u0b07\u0b09\u0b20"+
		"\u0b2b\u0b31";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}