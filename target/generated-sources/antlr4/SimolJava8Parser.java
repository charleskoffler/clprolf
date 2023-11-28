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
		CONTRACTS=56, THROW=44, STATIC=38, INTERFACE=28, AND_ASSIGN=110, BREAK=4, 
		BYTE=5, ELSE=15, IF=22, ENUM=16, SUB=97, BANG=84, LPAREN=72, DOT=80, CASE=6, 
		AT=118, LINE_COMMENT=122, StringLiteral=70, ELLIPSIS=119, LBRACK=76, PUBLIC=35, 
		THROWS=45, NullLiteral=71, RSHIFT_ASSIGN=115, COMPAT_INTERF_VERSION=57, 
		LBRACE=74, GOTO=23, SUB_ASSIGN=107, SEMI=78, CHAR=8, COLONCOLON=105, ASSIGN=81, 
		COMMENT=121, IMPORT=25, ARROW=104, BITOR=101, CATCH=7, MUL_ASSIGN=108, 
		LONG_ACTION=61, DOUBLE=14, PROTECTED=34, LONG=29, COMMA=79, BITAND=100, 
		TOUR_MONITOR=64, PREVENT_MISSING_COLLISION=62, PRIVATE=33, CONTINUE=11, 
		DIV=99, NATURE=55, UNDERST=60, SIMU_REAL_WORLD_OBJ=51, FloatingPointLiteral=67, 
		LE=89, FOR_EVERY_THREAD=65, CharacterLiteral=69, VOLATILE=49, EXTENDS=17, 
		INSTANCEOF=26, NEW=31, ADD=96, LT=83, CLASS=9, DO=13, FINALLY=19, Identifier=117, 
		CONST=10, PACKAGE=32, OR_ASSIGN=111, TRY=47, REAL_WORLD_OBJ=53, IntegerLiteral=66, 
		SYNCHRONIZED=42, MUL=98, INFORMATION=54, FOR=21, FINAL=18, ONE_AT_A_TIME=63, 
		RPAREN=73, CARET=102, URSHIFT_ASSIGN=116, BOOLEAN=3, WITH_COMPAT=59, NOTEQUAL=91, 
		SIMU_COMP_WORKER=52, RBRACK=77, RBRACE=75, AND=92, THIS=43, SWITCH=41, 
		VOID=48, TRANSIENT=46, INC=94, FLOAT=20, NATIVE=30, DIV_ASSIGN=109, BooleanLiteral=68, 
		ABSTRACT=1, STRICTFP=39, INT=27, QUESTION=86, RETURN=36, LSHIFT_ASSIGN=114, 
		ADD_ASSIGN=106, WS=120, GE=90, SUPER=40, OR=93, DEC=95, MOD=103, XOR_ASSIGN=112, 
		ASSERT=2, EQUAL=88, IMPLEMENTS=24, COLON=87, GT=82, SHORT=37, COMPAT_INTERF_CAPACITY=58, 
		MOD_ASSIGN=113, WHILE=50, TILDE=85, DEFAULT=12;
	public static final String[] tokenNames = {
		"<INVALID>", "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", 
		"'case'", "'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
		"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
		"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
		"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
		"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
		"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
		"'transient'", "'try'", "'void'", "'volatile'", "'while'", "'simu_real_world_obj'", 
		"'simu_comp_worker'", "'real_world_obj'", "'information'", "'nature'", 
		"'contracts'", "'compat_interf_version'", "'compat_interf_capacity'", 
		"'with_compat'", "'underst'", "'long_action'", "'prevent_missing_collision'", 
		"'one_at_a_time'", "'tour_monitor'", "'for_every_thread'", "IntegerLiteral", 
		"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
		"'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", 
		"'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", 
		"'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", 
		"'|'", "'^'", "'%'", "'->'", "'::'", "'+='", "'-='", "'*='", "'/='", "'&='", 
		"'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", "Identifier", "'@'", 
		"'...'", "WS", "COMMENT", "LINE_COMMENT"
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
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)))) != 0)) ) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ENUM) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SIMU_REAL_WORLD_OBJ) | (1L << SIMU_COMP_WORKER) | (1L << REAL_WORLD_OBJ) | (1L << INFORMATION) | (1L << COMPAT_INTERF_VERSION) | (1L << COMPAT_INTERF_CAPACITY))) != 0) || _la==SEMI || _la==AT) {
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
			setState(791); simolRole();
			setState(792); match(Identifier);
			setState(794);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(793); typeParameters();
				}
			}

			setState(797);
			_la = _input.LA(1);
			if (_la==NATURE) {
				{
				setState(796); superclass();
				}
			}

			setState(800);
			_la = _input.LA(1);
			if (_la==CONTRACTS) {
				{
				setState(799); superinterfaces();
				}
			}

			setState(802); classBody();
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
			setState(804);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIMU_REAL_WORLD_OBJ) | (1L << SIMU_COMP_WORKER) | (1L << REAL_WORLD_OBJ) | (1L << INFORMATION))) != 0)) ) {
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
			setState(814);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(806); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(807); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(808); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(809); match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(810); match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(811); match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(812); match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(813); match(STRICTFP);
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
			setState(816); match(LT);
			setState(817); typeParameterList();
			setState(818); match(GT);
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
			setState(820); typeParameter();
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(821); match(COMMA);
				setState(822); typeParameter();
				}
				}
				setState(827);
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
			setState(828); match(NATURE);
			setState(829); classType();
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
			setState(831); match(CONTRACTS);
			setState(832); interfaceTypeList();
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
			setState(834); interfaceType();
			setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(835); match(COMMA);
				setState(836); interfaceType();
				}
				}
				setState(841);
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
			setState(842); match(LBRACE);
			setState(846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << SIMU_REAL_WORLD_OBJ) | (1L << SIMU_COMP_WORKER) | (1L << REAL_WORLD_OBJ) | (1L << INFORMATION) | (1L << COMPAT_INTERF_VERSION) | (1L << COMPAT_INTERF_CAPACITY) | (1L << WITH_COMPAT) | (1L << UNDERST) | (1L << LONG_ACTION) | (1L << PREVENT_MISSING_COLLISION) | (1L << ONE_AT_A_TIME))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TOUR_MONITOR - 64)) | (1L << (FOR_EVERY_THREAD - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				{
				setState(843); classBodyDeclaration();
				}
				}
				setState(848);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(849); match(RBRACE);
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
			setState(855);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(851); classMemberDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(852); instanceInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(853); staticInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(854); constructorDeclaration();
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
			setState(862);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(857); fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(858); methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(859); classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(860); interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(861); match(SEMI);
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
			setState(867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << WITH_COMPAT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TOUR_MONITOR - 64)) | (1L << (FOR_EVERY_THREAD - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				{
				setState(864); fieldModifier();
				}
				}
				setState(869);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(870); unannType();
			setState(871); variableDeclaratorList();
			setState(872); match(SEMI);
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
			setState(885);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(874); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(875); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(876); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(877); match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(878); match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(879); match(FINAL);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(880); match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 8);
				{
				setState(881); match(VOLATILE);
				}
				break;
			case WITH_COMPAT:
				enterOuterAlt(_localctx, 9);
				{
				setState(882); match(WITH_COMPAT);
				}
				break;
			case TOUR_MONITOR:
				enterOuterAlt(_localctx, 10);
				{
				setState(883); match(TOUR_MONITOR);
				}
				break;
			case FOR_EVERY_THREAD:
				enterOuterAlt(_localctx, 11);
				{
				setState(884); match(FOR_EVERY_THREAD);
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
			setState(887); variableDeclarator();
			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(888); match(COMMA);
				setState(889); variableDeclarator();
				}
				}
				setState(894);
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
			setState(895); variableDeclaratorId();
			setState(898);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(896); match(ASSIGN);
				setState(897); variableInitializer();
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
			setState(900); match(Identifier);
			setState(902);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(901); dims();
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
			setState(906);
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
				setState(904); expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(905); arrayInitializer();
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
			setState(910);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(908); unannPrimitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(909); unannReferenceType();
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
			setState(914);
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
				setState(912); numericType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(913); match(BOOLEAN);
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
			setState(919);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(916); unannClassOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(917); unannTypeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(918); unannArrayType();
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
			setState(923);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(921); unannClassType_lfno_unannClassOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(922); unannInterfaceType_lfno_unannClassOrInterfaceType();
				}
				break;
			}
			setState(929);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(927);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						setState(925); unannClassType_lf_unannClassOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(926); unannInterfaceType_lf_unannClassOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(931);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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
			setState(948);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(932); match(Identifier);
				setState(934);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(933); typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(936); unannClassOrInterfaceType();
				setState(937); match(DOT);
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(938); annotation();
					}
					}
					setState(943);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(944); match(Identifier);
				setState(946);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(945); typeArguments();
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
			setState(950); match(DOT);
			setState(954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(951); annotation();
				}
				}
				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(957); match(Identifier);
			setState(959);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(958); typeArguments();
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
			setState(961); match(Identifier);
			setState(963);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(962); typeArguments();
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
			setState(965); unannClassType();
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
			setState(967); unannClassType_lf_unannClassOrInterfaceType();
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
			setState(969); unannClassType_lfno_unannClassOrInterfaceType();
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
			setState(971); match(Identifier);
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
			setState(982);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(973); unannPrimitiveType();
				setState(974); dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(976); unannClassOrInterfaceType();
				setState(977); dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(979); unannTypeVariable();
				setState(980); dims();
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
			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << UNDERST) | (1L << LONG_ACTION) | (1L << PREVENT_MISSING_COLLISION) | (1L << ONE_AT_A_TIME))) != 0) || _la==AT) {
				{
				{
				setState(984); methodModifier();
				}
				}
				setState(989);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(990); methodHeader();
			setState(991); methodBody();
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
			setState(1007);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(993); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(994); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(995); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(996); match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(997); match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(998); match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(999); match(FINAL);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 8);
				{
				setState(1000); match(SYNCHRONIZED);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1001); match(NATIVE);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 10);
				{
				setState(1002); match(STRICTFP);
				}
				break;
			case UNDERST:
				enterOuterAlt(_localctx, 11);
				{
				setState(1003); match(UNDERST);
				}
				break;
			case LONG_ACTION:
				enterOuterAlt(_localctx, 12);
				{
				setState(1004); match(LONG_ACTION);
				}
				break;
			case PREVENT_MISSING_COLLISION:
				enterOuterAlt(_localctx, 13);
				{
				setState(1005); match(PREVENT_MISSING_COLLISION);
				}
				break;
			case ONE_AT_A_TIME:
				enterOuterAlt(_localctx, 14);
				{
				setState(1006); match(ONE_AT_A_TIME);
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
			setState(1026);
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
				setState(1009); result();
				setState(1010); methodDeclarator();
				setState(1012);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1011); throws_();
					}
				}

				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1014); typeParameters();
				setState(1018);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1015); annotation();
					}
					}
					setState(1020);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1021); result();
				setState(1022); methodDeclarator();
				setState(1024);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1023); throws_();
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
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1028); unannType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1029); match(VOID);
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
			setState(1032); match(Identifier);
			setState(1033); match(LPAREN);
			setState(1035);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << WITH_COMPAT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1034); formalParameterList();
				}
			}

			setState(1037); match(RPAREN);
			setState(1039);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1038); dims();
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
			setState(1047);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1041); receiverParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1042); formalParameters();
				setState(1043); match(COMMA);
				setState(1044); lastFormalParameter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1046); lastFormalParameter();
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
			setState(1065);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1049); formalParameter();
				setState(1054);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1050); match(COMMA);
						setState(1051); formalParameter();
						}
						} 
					}
					setState(1056);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1057); receiverParameter();
				setState(1062);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1058); match(COMMA);
						setState(1059); formalParameter();
						}
						} 
					}
					setState(1064);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
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
			setState(1070);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==WITH_COMPAT || _la==AT) {
				{
				{
				setState(1067); variableModifier();
				}
				}
				setState(1072);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1073); unannType();
			setState(1074); variableDeclaratorId();
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
			setState(1079);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1076); annotation();
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1077); match(FINAL);
				}
				break;
			case WITH_COMPAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1078); match(WITH_COMPAT);
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
			setState(1098);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1084);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==WITH_COMPAT || _la==AT) {
					{
					{
					setState(1081); variableModifier();
					}
					}
					setState(1086);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1087); unannType();
				setState(1091);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1088); annotation();
					}
					}
					setState(1093);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1094); match(ELLIPSIS);
				setState(1095); variableDeclaratorId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1097); formalParameter();
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
			setState(1103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1100); annotation();
				}
				}
				setState(1105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1106); unannType();
			setState(1109);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1107); match(Identifier);
				setState(1108); match(DOT);
				}
			}

			setState(1111); match(THIS);
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
			setState(1113); match(THROWS);
			setState(1114); exceptionTypeList();
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
			setState(1116); exceptionType();
			setState(1121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1117); match(COMMA);
				setState(1118); exceptionType();
				}
				}
				setState(1123);
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
			setState(1126);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1124); classType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1125); typeVariable();
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
			setState(1130);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1128); block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1129); match(SEMI);
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
			setState(1132); block();
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
			setState(1134); match(STATIC);
			setState(1135); block();
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
			setState(1140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0) || _la==AT) {
				{
				{
				setState(1137); constructorModifier();
				}
				}
				setState(1142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1143); constructorDeclarator();
			setState(1145);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(1144); throws_();
				}
			}

			setState(1147); constructorBody();
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
			setState(1153);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1149); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1150); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1151); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1152); match(PRIVATE);
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
			setState(1156);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1155); typeParameters();
				}
			}

			setState(1158); simpleTypeName();
			setState(1159); match(LPAREN);
			setState(1161);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << WITH_COMPAT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1160); formalParameterList();
				}
			}

			setState(1163); match(RPAREN);
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
			setState(1165); match(Identifier);
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
			setState(1167); match(LBRACE);
			setState(1169);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(1168); explicitConstructorInvocation();
				}
				break;
			}
			setState(1172);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << SIMU_REAL_WORLD_OBJ) | (1L << SIMU_COMP_WORKER) | (1L << REAL_WORLD_OBJ) | (1L << INFORMATION) | (1L << WITH_COMPAT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				setState(1171); blockStatements();
				}
			}

			setState(1174); match(RBRACE);
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
			setState(1222);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1177);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1176); typeArguments();
					}
				}

				setState(1179); match(THIS);
				setState(1180); match(LPAREN);
				setState(1182);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
					{
					setState(1181); argumentList();
					}
				}

				setState(1184); match(RPAREN);
				setState(1185); match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1187);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1186); typeArguments();
					}
				}

				setState(1189); match(SUPER);
				setState(1190); match(LPAREN);
				setState(1192);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
					{
					setState(1191); argumentList();
					}
				}

				setState(1194); match(RPAREN);
				setState(1195); match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1196); expressionName();
				setState(1197); match(DOT);
				setState(1199);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1198); typeArguments();
					}
				}

				setState(1201); match(SUPER);
				setState(1202); match(LPAREN);
				setState(1204);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
					{
					setState(1203); argumentList();
					}
				}

				setState(1206); match(RPAREN);
				setState(1207); match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1209); primary();
				setState(1210); match(DOT);
				setState(1212);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1211); typeArguments();
					}
				}

				setState(1214); match(SUPER);
				setState(1215); match(LPAREN);
				setState(1217);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
					{
					setState(1216); argumentList();
					}
				}

				setState(1219); match(RPAREN);
				setState(1220); match(SEMI);
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
			setState(1227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1224); classModifier();
				}
				}
				setState(1229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1230); match(ENUM);
			setState(1231); match(Identifier);
			setState(1233);
			_la = _input.LA(1);
			if (_la==CONTRACTS) {
				{
				setState(1232); superinterfaces();
				}
			}

			setState(1235); enumBody();
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
			setState(1237); match(LBRACE);
			setState(1239);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(1238); enumConstantList();
				}
			}

			setState(1242);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1241); match(COMMA);
				}
			}

			setState(1245);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1244); enumBodyDeclarations();
				}
			}

			setState(1247); match(RBRACE);
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
			setState(1249); enumConstant();
			setState(1254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1250); match(COMMA);
					setState(1251); enumConstant();
					}
					} 
				}
				setState(1256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
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
			setState(1260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1257); enumConstantModifier();
				}
				}
				setState(1262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1263); match(Identifier);
			setState(1269);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1264); match(LPAREN);
				setState(1266);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
					{
					setState(1265); argumentList();
					}
				}

				setState(1268); match(RPAREN);
				}
			}

			setState(1272);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1271); classBody();
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
			setState(1274); annotation();
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
			setState(1276); match(SEMI);
			setState(1280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << SIMU_REAL_WORLD_OBJ) | (1L << SIMU_COMP_WORKER) | (1L << REAL_WORLD_OBJ) | (1L << INFORMATION) | (1L << COMPAT_INTERF_VERSION) | (1L << COMPAT_INTERF_CAPACITY) | (1L << WITH_COMPAT) | (1L << UNDERST) | (1L << LONG_ACTION) | (1L << PREVENT_MISSING_COLLISION) | (1L << ONE_AT_A_TIME))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TOUR_MONITOR - 64)) | (1L << (FOR_EVERY_THREAD - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				{
				setState(1277); classBodyDeclaration();
				}
				}
				setState(1282);
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
			setState(1285);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1283); normalInterfaceDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1284); annotationTypeDeclaration();
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
			setState(1290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1287); interfaceModifier();
				}
				}
				setState(1292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1293); simolInterfaceRole();
			setState(1294); match(Identifier);
			setState(1296);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1295); typeParameters();
				}
			}

			setState(1299);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1298); extendsInterfaces();
				}
			}

			setState(1301); interfaceBody();
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
			setState(1303);
			_la = _input.LA(1);
			if ( !(_la==COMPAT_INTERF_VERSION || _la==COMPAT_INTERF_CAPACITY) ) {
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
			setState(1312);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1305); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1306); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1307); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1308); match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1309); match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1310); match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1311); match(STRICTFP);
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
			setState(1314); match(EXTENDS);
			setState(1315); interfaceTypeList();
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
			setState(1317); match(LBRACE);
			setState(1321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << VOID) | (1L << SIMU_REAL_WORLD_OBJ) | (1L << SIMU_COMP_WORKER) | (1L << REAL_WORLD_OBJ) | (1L << INFORMATION) | (1L << COMPAT_INTERF_VERSION) | (1L << COMPAT_INTERF_CAPACITY))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (SEMI - 78)) | (1L << (LT - 78)) | (1L << (Identifier - 78)) | (1L << (AT - 78)))) != 0)) {
				{
				{
				setState(1318); interfaceMemberDeclaration();
				}
				}
				setState(1323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1324); match(RBRACE);
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
			setState(1331);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1326); constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1327); interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1328); classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1329); interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1330); match(SEMI);
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
			setState(1336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PUBLIC) | (1L << STATIC))) != 0) || _la==AT) {
				{
				{
				setState(1333); constantModifier();
				}
				}
				setState(1338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1339); unannType();
			setState(1340); variableDeclaratorList();
			setState(1341); match(SEMI);
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
			setState(1347);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1343); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1344); match(PUBLIC);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1345); match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1346); match(FINAL);
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
			setState(1352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1349); interfaceMethodModifier();
				}
				}
				setState(1354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1355); methodHeader();
			setState(1356); methodBody();
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
			setState(1364);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1358); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1359); match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1360); match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1361); match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1362); match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(1363); match(STRICTFP);
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
			setState(1369);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1366); interfaceModifier();
					}
					} 
				}
				setState(1371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			}
			setState(1372); match(AT);
			setState(1373); match(INTERFACE);
			setState(1374); match(Identifier);
			setState(1375); annotationTypeBody();
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
			setState(1377); match(LBRACE);
			setState(1381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SIMU_REAL_WORLD_OBJ) | (1L << SIMU_COMP_WORKER) | (1L << REAL_WORLD_OBJ) | (1L << INFORMATION) | (1L << COMPAT_INTERF_VERSION) | (1L << COMPAT_INTERF_CAPACITY))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (SEMI - 78)) | (1L << (Identifier - 78)) | (1L << (AT - 78)))) != 0)) {
				{
				{
				setState(1378); annotationTypeMemberDeclaration();
				}
				}
				setState(1383);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1384); match(RBRACE);
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
			setState(1391);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1386); annotationTypeElementDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1387); constantDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1388); classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1389); interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1390); match(SEMI);
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
			setState(1396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSTRACT || _la==PUBLIC || _la==AT) {
				{
				{
				setState(1393); annotationTypeElementModifier();
				}
				}
				setState(1398);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1399); unannType();
			setState(1400); match(Identifier);
			setState(1401); match(LPAREN);
			setState(1402); match(RPAREN);
			setState(1404);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1403); dims();
				}
			}

			setState(1407);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1406); defaultValue();
				}
			}

			setState(1409); match(SEMI);
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
			setState(1414);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1411); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1412); match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1413); match(ABSTRACT);
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
			setState(1416); match(DEFAULT);
			setState(1417); elementValue();
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
			setState(1422);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1419); normalAnnotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1420); markerAnnotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1421); singleElementAnnotation();
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
			setState(1424); match(AT);
			setState(1425); typeName();
			setState(1426); match(LPAREN);
			setState(1428);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1427); elementValuePairList();
				}
			}

			setState(1430); match(RPAREN);
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
			setState(1432); elementValuePair();
			setState(1437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1433); match(COMMA);
				setState(1434); elementValuePair();
				}
				}
				setState(1439);
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
			setState(1440); match(Identifier);
			setState(1441); match(ASSIGN);
			setState(1442); elementValue();
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
			setState(1447);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1444); conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1445); elementValueArrayInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1446); annotation();
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
			setState(1449); match(LBRACE);
			setState(1451);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LBRACE - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				setState(1450); elementValueList();
				}
			}

			setState(1454);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1453); match(COMMA);
				}
			}

			setState(1456); match(RBRACE);
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
			setState(1458); elementValue();
			setState(1463);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1459); match(COMMA);
					setState(1460); elementValue();
					}
					} 
				}
				setState(1465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
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
			setState(1466); match(AT);
			setState(1467); typeName();
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
			setState(1469); match(AT);
			setState(1470); typeName();
			setState(1471); match(LPAREN);
			setState(1472); elementValue();
			setState(1473); match(RPAREN);
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
			setState(1475); match(LBRACE);
			setState(1477);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LBRACE - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				setState(1476); variableInitializerList();
				}
			}

			setState(1480);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1479); match(COMMA);
				}
			}

			setState(1482); match(RBRACE);
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
			setState(1484); variableInitializer();
			setState(1489);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1485); match(COMMA);
					setState(1486); variableInitializer();
					}
					} 
				}
				setState(1491);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
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
			setState(1492); match(LBRACE);
			setState(1494);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << SIMU_REAL_WORLD_OBJ) | (1L << SIMU_COMP_WORKER) | (1L << REAL_WORLD_OBJ) | (1L << INFORMATION) | (1L << WITH_COMPAT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				setState(1493); blockStatements();
				}
			}

			setState(1496); match(RBRACE);
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
			setState(1499); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1498); blockStatement();
				}
				}
				setState(1501); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << SIMU_REAL_WORLD_OBJ) | (1L << SIMU_COMP_WORKER) | (1L << REAL_WORLD_OBJ) | (1L << INFORMATION) | (1L << WITH_COMPAT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0) );
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
			setState(1506);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1503); localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1504); classDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1505); statement();
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
			setState(1508); localVariableDeclaration();
			setState(1509); match(SEMI);
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
			setState(1514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==WITH_COMPAT || _la==AT) {
				{
				{
				setState(1511); variableModifier();
				}
				}
				setState(1516);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1517); unannType();
			setState(1518); variableDeclaratorList();
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
			setState(1526);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1520); statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1521); labeledStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1522); ifThenStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1523); ifThenElseStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1524); whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1525); forStatement();
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
			setState(1533);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1528); statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1529); labeledStatementNoShortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1530); ifThenElseStatementNoShortIf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1531); whileStatementNoShortIf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1532); forStatementNoShortIf();
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
			setState(1547);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1535); block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1536); emptyStatement_();
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
				setState(1537); expressionStatement();
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1538); assertStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(1539); switchStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(1540); doStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(1541); breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1542); continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(1543); returnStatement();
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 10);
				{
				setState(1544); synchronizedStatement();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 11);
				{
				setState(1545); throwStatement();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 12);
				{
				setState(1546); tryStatement();
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
			setState(1549); match(SEMI);
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
			setState(1551); match(Identifier);
			setState(1552); match(COLON);
			setState(1553); statement();
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
			setState(1555); match(Identifier);
			setState(1556); match(COLON);
			setState(1557); statementNoShortIf();
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
			setState(1559); statementExpression();
			setState(1560); match(SEMI);
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
			setState(1569);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1562); assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1563); preIncrementExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1564); preDecrementExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1565); postIncrementExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1566); postDecrementExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1567); methodInvocation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1568); classInstanceCreationExpression();
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
			setState(1571); match(IF);
			setState(1572); match(LPAREN);
			setState(1573); expression();
			setState(1574); match(RPAREN);
			setState(1575); statement();
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
			setState(1577); match(IF);
			setState(1578); match(LPAREN);
			setState(1579); expression();
			setState(1580); match(RPAREN);
			setState(1581); statementNoShortIf();
			setState(1582); match(ELSE);
			setState(1583); statement();
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
			setState(1585); match(IF);
			setState(1586); match(LPAREN);
			setState(1587); expression();
			setState(1588); match(RPAREN);
			setState(1589); statementNoShortIf();
			setState(1590); match(ELSE);
			setState(1591); statementNoShortIf();
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
			setState(1603);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1593); match(ASSERT);
				setState(1594); expression();
				setState(1595); match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1597); match(ASSERT);
				setState(1598); expression();
				setState(1599); match(COLON);
				setState(1600); expression();
				setState(1601); match(SEMI);
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
			setState(1605); match(SWITCH);
			setState(1606); match(LPAREN);
			setState(1607); expression();
			setState(1608); match(RPAREN);
			setState(1609); switchBlock();
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
			setState(1611); match(LBRACE);
			setState(1615);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1612); switchBlockStatementGroup();
					}
					} 
				}
				setState(1617);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			}
			setState(1621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1618); switchLabel();
				}
				}
				setState(1623);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1624); match(RBRACE);
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
			setState(1626); switchLabels();
			setState(1627); blockStatements();
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
			setState(1629); switchLabel();
			setState(1633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1630); switchLabel();
				}
				}
				setState(1635);
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
			setState(1646);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1636); match(CASE);
				setState(1637); constantExpression();
				setState(1638); match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1640); match(CASE);
				setState(1641); enumConstantName();
				setState(1642); match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1644); match(DEFAULT);
				setState(1645); match(COLON);
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
			setState(1648); match(Identifier);
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
			setState(1650); match(WHILE);
			setState(1651); match(LPAREN);
			setState(1652); expression();
			setState(1653); match(RPAREN);
			setState(1654); statement();
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
			setState(1656); match(WHILE);
			setState(1657); match(LPAREN);
			setState(1658); expression();
			setState(1659); match(RPAREN);
			setState(1660); statementNoShortIf();
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
			setState(1662); match(DO);
			setState(1663); statement();
			setState(1664); match(WHILE);
			setState(1665); match(LPAREN);
			setState(1666); expression();
			setState(1667); match(RPAREN);
			setState(1668); match(SEMI);
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
			setState(1672);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1670); basicForStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1671); enhancedForStatement();
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
			setState(1676);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1674); basicForStatementNoShortIf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1675); enhancedForStatementNoShortIf();
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
			setState(1678); match(FOR);
			setState(1679); match(LPAREN);
			setState(1681);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << WITH_COMPAT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				setState(1680); forInit();
				}
			}

			setState(1683); match(SEMI);
			setState(1685);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				setState(1684); expression();
				}
			}

			setState(1687); match(SEMI);
			setState(1689);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				setState(1688); forUpdate();
				}
			}

			setState(1691); match(RPAREN);
			setState(1692); statement();
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
			setState(1694); match(FOR);
			setState(1695); match(LPAREN);
			setState(1697);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << WITH_COMPAT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				setState(1696); forInit();
				}
			}

			setState(1699); match(SEMI);
			setState(1701);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				setState(1700); expression();
				}
			}

			setState(1703); match(SEMI);
			setState(1705);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				setState(1704); forUpdate();
				}
			}

			setState(1707); match(RPAREN);
			setState(1708); statementNoShortIf();
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
			setState(1712);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1710); statementExpressionList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1711); localVariableDeclaration();
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
			setState(1714); statementExpressionList();
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
			setState(1716); statementExpression();
			setState(1721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1717); match(COMMA);
				setState(1718); statementExpression();
				}
				}
				setState(1723);
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
			setState(1724); match(FOR);
			setState(1725); match(LPAREN);
			setState(1729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==WITH_COMPAT || _la==AT) {
				{
				{
				setState(1726); variableModifier();
				}
				}
				setState(1731);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1732); unannType();
			setState(1733); variableDeclaratorId();
			setState(1734); match(COLON);
			setState(1735); expression();
			setState(1736); match(RPAREN);
			setState(1737); statement();
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
			setState(1739); match(FOR);
			setState(1740); match(LPAREN);
			setState(1744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==WITH_COMPAT || _la==AT) {
				{
				{
				setState(1741); variableModifier();
				}
				}
				setState(1746);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1747); unannType();
			setState(1748); variableDeclaratorId();
			setState(1749); match(COLON);
			setState(1750); expression();
			setState(1751); match(RPAREN);
			setState(1752); statementNoShortIf();
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
			setState(1754); match(BREAK);
			setState(1756);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1755); match(Identifier);
				}
			}

			setState(1758); match(SEMI);
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
			setState(1760); match(CONTINUE);
			setState(1762);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1761); match(Identifier);
				}
			}

			setState(1764); match(SEMI);
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
			setState(1766); match(RETURN);
			setState(1768);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				setState(1767); expression();
				}
			}

			setState(1770); match(SEMI);
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
			setState(1772); match(THROW);
			setState(1773); expression();
			setState(1774); match(SEMI);
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
			setState(1776); match(SYNCHRONIZED);
			setState(1777); match(LPAREN);
			setState(1778); expression();
			setState(1779); match(RPAREN);
			setState(1780); block();
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
			setState(1794);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1782); match(TRY);
				setState(1783); block();
				setState(1784); catches();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1786); match(TRY);
				setState(1787); block();
				setState(1789);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(1788); catches();
					}
				}

				setState(1791); finally_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1793); tryWithResourcesStatement();
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
			setState(1796); catchClause();
			setState(1800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(1797); catchClause();
				}
				}
				setState(1802);
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
			setState(1803); match(CATCH);
			setState(1804); match(LPAREN);
			setState(1805); catchFormalParameter();
			setState(1806); match(RPAREN);
			setState(1807); block();
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
			setState(1812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==WITH_COMPAT || _la==AT) {
				{
				{
				setState(1809); variableModifier();
				}
				}
				setState(1814);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1815); catchType();
			setState(1816); variableDeclaratorId();
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
			setState(1818); unannClassType();
			setState(1823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1819); match(BITOR);
				setState(1820); classType();
				}
				}
				setState(1825);
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
			setState(1826); match(FINALLY);
			setState(1827); block();
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
			setState(1829); match(TRY);
			setState(1830); resourceSpecification();
			setState(1831); block();
			setState(1833);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(1832); catches();
				}
			}

			setState(1836);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(1835); finally_();
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
			setState(1838); match(LPAREN);
			setState(1839); resourceList();
			setState(1841);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1840); match(SEMI);
				}
			}

			setState(1843); match(RPAREN);
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
			setState(1845); resource();
			setState(1850);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1846); match(SEMI);
					setState(1847); resource();
					}
					} 
				}
				setState(1852);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
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
			setState(1856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==WITH_COMPAT || _la==AT) {
				{
				{
				setState(1853); variableModifier();
				}
				}
				setState(1858);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1859); unannType();
			setState(1860); variableDeclaratorId();
			setState(1861); match(ASSIGN);
			setState(1862); expression();
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
			setState(1866);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1864); primaryNoNewArray_lfno_primary();
				}
				break;
			case 2:
				{
				setState(1865); arrayCreationExpression();
				}
				break;
			}
			setState(1871);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1868); primaryNoNewArray_lf_primary();
					}
					} 
				}
				setState(1873);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
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
			setState(1903);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1874); literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1875); typeName();
				setState(1880);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1876); match(LBRACK);
					setState(1877); match(RBRACK);
					}
					}
					setState(1882);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1883); match(DOT);
				setState(1884); match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1886); match(VOID);
				setState(1887); match(DOT);
				setState(1888); match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1889); match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1890); typeName();
				setState(1891); match(DOT);
				setState(1892); match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1894); match(LPAREN);
				setState(1895); expression();
				setState(1896); match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1898); classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1899); fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1900); arrayAccess();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1901); methodInvocation();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1902); methodReference();
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
			setState(1935);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1907); literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1908); typeName();
				setState(1913);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1909); match(LBRACK);
					setState(1910); match(RBRACK);
					}
					}
					setState(1915);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1916); match(DOT);
				setState(1917); match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1919); match(VOID);
				setState(1920); match(DOT);
				setState(1921); match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1922); match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1923); typeName();
				setState(1924); match(DOT);
				setState(1925); match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1927); match(LPAREN);
				setState(1928); expression();
				setState(1929); match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1931); classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1932); fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1933); methodInvocation();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1934); methodReference();
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
			setState(1942);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1937); classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1938); fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1939); arrayAccess_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1940); methodInvocation_lf_primary();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1941); methodReference_lf_primary();
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
			setState(1950);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1946); classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1947); fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1948); methodInvocation_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1949); methodReference_lf_primary();
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
			setState(1992);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1952); literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1953); typeName();
				setState(1958);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1954); match(LBRACK);
					setState(1955); match(RBRACK);
					}
					}
					setState(1960);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1961); match(DOT);
				setState(1962); match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1964); unannPrimitiveType();
				setState(1969);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1965); match(LBRACK);
					setState(1966); match(RBRACK);
					}
					}
					setState(1971);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1972); match(DOT);
				setState(1973); match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1975); match(VOID);
				setState(1976); match(DOT);
				setState(1977); match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1978); match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1979); typeName();
				setState(1980); match(DOT);
				setState(1981); match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1983); match(LPAREN);
				setState(1984); expression();
				setState(1985); match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1987); classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1988); fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1989); arrayAccess_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1990); methodInvocation_lfno_primary();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1991); methodReference_lfno_primary();
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
			setState(2035);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1996); literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1997); typeName();
				setState(2002);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1998); match(LBRACK);
					setState(1999); match(RBRACK);
					}
					}
					setState(2004);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2005); match(DOT);
				setState(2006); match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2008); unannPrimitiveType();
				setState(2013);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2009); match(LBRACK);
					setState(2010); match(RBRACK);
					}
					}
					setState(2015);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2016); match(DOT);
				setState(2017); match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2019); match(VOID);
				setState(2020); match(DOT);
				setState(2021); match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2022); match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2023); typeName();
				setState(2024); match(DOT);
				setState(2025); match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2027); match(LPAREN);
				setState(2028); expression();
				setState(2029); match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2031); classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2032); fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2033); methodInvocation_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2034); methodReference_lfno_primary();
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
			setState(2120);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2037); match(NEW);
				setState(2039);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2038); typeArguments();
					}
				}

				setState(2044);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2041); annotation();
					}
					}
					setState(2046);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2047); match(Identifier);
				setState(2058);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2048); match(DOT);
					setState(2052);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2049); annotation();
						}
						}
						setState(2054);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2055); match(Identifier);
					}
					}
					setState(2060);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2062);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2061); typeArgumentsOrDiamond();
					}
				}

				setState(2064); match(LPAREN);
				setState(2066);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
					{
					setState(2065); argumentList();
					}
				}

				setState(2068); match(RPAREN);
				setState(2070);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2069); classBody();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2072); expressionName();
				setState(2073); match(DOT);
				setState(2074); match(NEW);
				setState(2076);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2075); typeArguments();
					}
				}

				setState(2081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2078); annotation();
					}
					}
					setState(2083);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2084); match(Identifier);
				setState(2086);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2085); typeArgumentsOrDiamond();
					}
				}

				setState(2088); match(LPAREN);
				setState(2090);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
					{
					setState(2089); argumentList();
					}
				}

				setState(2092); match(RPAREN);
				setState(2094);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2093); classBody();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2096); primary();
				setState(2097); match(DOT);
				setState(2098); match(NEW);
				setState(2100);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2099); typeArguments();
					}
				}

				setState(2105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2102); annotation();
					}
					}
					setState(2107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2108); match(Identifier);
				setState(2110);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2109); typeArgumentsOrDiamond();
					}
				}

				setState(2112); match(LPAREN);
				setState(2114);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
					{
					setState(2113); argumentList();
					}
				}

				setState(2116); match(RPAREN);
				setState(2118);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2117); classBody();
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
			setState(2122); match(DOT);
			setState(2123); match(NEW);
			setState(2125);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2124); typeArguments();
				}
			}

			setState(2130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2127); annotation();
				}
				}
				setState(2132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2133); match(Identifier);
			setState(2135);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2134); typeArgumentsOrDiamond();
				}
			}

			setState(2137); match(LPAREN);
			setState(2139);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				setState(2138); argumentList();
				}
			}

			setState(2141); match(RPAREN);
			setState(2143);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				{
				setState(2142); classBody();
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
			setState(2204);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(2145); match(NEW);
				setState(2147);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2146); typeArguments();
					}
				}

				setState(2152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2149); annotation();
					}
					}
					setState(2154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2155); match(Identifier);
				setState(2166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2156); match(DOT);
					setState(2160);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2157); annotation();
						}
						}
						setState(2162);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2163); match(Identifier);
					}
					}
					setState(2168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2170);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2169); typeArgumentsOrDiamond();
					}
				}

				setState(2172); match(LPAREN);
				setState(2174);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
					{
					setState(2173); argumentList();
					}
				}

				setState(2176); match(RPAREN);
				setState(2178);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(2177); classBody();
					}
					break;
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2180); expressionName();
				setState(2181); match(DOT);
				setState(2182); match(NEW);
				setState(2184);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2183); typeArguments();
					}
				}

				setState(2189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2186); annotation();
					}
					}
					setState(2191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2192); match(Identifier);
				setState(2194);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2193); typeArgumentsOrDiamond();
					}
				}

				setState(2196); match(LPAREN);
				setState(2198);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
					{
					setState(2197); argumentList();
					}
				}

				setState(2200); match(RPAREN);
				setState(2202);
				switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
				case 1:
					{
					setState(2201); classBody();
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
			setState(2209);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2206); typeArguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2207); match(LT);
				setState(2208); match(GT);
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
			setState(2224);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2211); primary();
				setState(2212); match(DOT);
				setState(2213); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2215); match(SUPER);
				setState(2216); match(DOT);
				setState(2217); match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2218); typeName();
				setState(2219); match(DOT);
				setState(2220); match(SUPER);
				setState(2221); match(DOT);
				setState(2222); match(Identifier);
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
			setState(2226); match(DOT);
			setState(2227); match(Identifier);
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
			setState(2238);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2229); match(SUPER);
				setState(2230); match(DOT);
				setState(2231); match(Identifier);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2232); typeName();
				setState(2233); match(DOT);
				setState(2234); match(SUPER);
				setState(2235); match(DOT);
				setState(2236); match(Identifier);
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
			setState(2250);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(2240); expressionName();
				setState(2241); match(LBRACK);
				setState(2242); expression();
				setState(2243); match(RBRACK);
				}
				break;
			case 2:
				{
				setState(2245); primaryNoNewArray_lfno_arrayAccess();
				setState(2246); match(LBRACK);
				setState(2247); expression();
				setState(2248); match(RBRACK);
				}
				break;
			}
			setState(2259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(2252); primaryNoNewArray_lf_arrayAccess();
				setState(2253); match(LBRACK);
				setState(2254); expression();
				setState(2255); match(RBRACK);
				}
				}
				setState(2261);
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
			setState(2262); primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
			setState(2263); match(LBRACK);
			setState(2264); expression();
			setState(2265); match(RBRACK);
			setState(2273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2266); primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();
					setState(2267); match(LBRACK);
					setState(2268); expression();
					setState(2269); match(RBRACK);
					}
					} 
				}
				setState(2275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
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
			setState(2286);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				{
				setState(2276); expressionName();
				setState(2277); match(LBRACK);
				setState(2278); expression();
				setState(2279); match(RBRACK);
				}
				break;
			case 2:
				{
				setState(2281); primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
				setState(2282); match(LBRACK);
				setState(2283); expression();
				setState(2284); match(RBRACK);
				}
				break;
			}
			setState(2295);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2288); primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();
					setState(2289); match(LBRACK);
					setState(2290); expression();
					setState(2291); match(RBRACK);
					}
					} 
				}
				setState(2297);
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
			setState(2366);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2298); methodName();
				setState(2299); match(LPAREN);
				setState(2301);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
					{
					setState(2300); argumentList();
					}
				}

				setState(2303); match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2305); typeName();
				setState(2306); match(DOT);
				setState(2308);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2307); typeArguments();
					}
				}

				setState(2310); match(Identifier);
				setState(2311); match(LPAREN);
				setState(2313);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
					{
					setState(2312); argumentList();
					}
				}

				setState(2315); match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2317); expressionName();
				setState(2318); match(DOT);
				setState(2320);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2319); typeArguments();
					}
				}

				setState(2322); match(Identifier);
				setState(2323); match(LPAREN);
				setState(2325);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
					{
					setState(2324); argumentList();
					}
				}

				setState(2327); match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2329); primary();
				setState(2330); match(DOT);
				setState(2332);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2331); typeArguments();
					}
				}

				setState(2334); match(Identifier);
				setState(2335); match(LPAREN);
				setState(2337);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
					{
					setState(2336); argumentList();
					}
				}

				setState(2339); match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2341); match(SUPER);
				setState(2342); match(DOT);
				setState(2344);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2343); typeArguments();
					}
				}

				setState(2346); match(Identifier);
				setState(2347); match(LPAREN);
				setState(2349);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
					{
					setState(2348); argumentList();
					}
				}

				setState(2351); match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2352); typeName();
				setState(2353); match(DOT);
				setState(2354); match(SUPER);
				setState(2355); match(DOT);
				setState(2357);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2356); typeArguments();
					}
				}

				setState(2359); match(Identifier);
				setState(2360); match(LPAREN);
				setState(2362);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
					{
					setState(2361); argumentList();
					}
				}

				setState(2364); match(RPAREN);
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
			setState(2368); match(DOT);
			setState(2370);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2369); typeArguments();
				}
			}

			setState(2372); match(Identifier);
			setState(2373); match(LPAREN);
			setState(2375);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				setState(2374); argumentList();
				}
			}

			setState(2377); match(RPAREN);
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
			setState(2435);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2379); methodName();
				setState(2380); match(LPAREN);
				setState(2382);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
					{
					setState(2381); argumentList();
					}
				}

				setState(2384); match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2386); typeName();
				setState(2387); match(DOT);
				setState(2389);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2388); typeArguments();
					}
				}

				setState(2391); match(Identifier);
				setState(2392); match(LPAREN);
				setState(2394);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
					{
					setState(2393); argumentList();
					}
				}

				setState(2396); match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2398); expressionName();
				setState(2399); match(DOT);
				setState(2401);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2400); typeArguments();
					}
				}

				setState(2403); match(Identifier);
				setState(2404); match(LPAREN);
				setState(2406);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
					{
					setState(2405); argumentList();
					}
				}

				setState(2408); match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2410); match(SUPER);
				setState(2411); match(DOT);
				setState(2413);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2412); typeArguments();
					}
				}

				setState(2415); match(Identifier);
				setState(2416); match(LPAREN);
				setState(2418);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
					{
					setState(2417); argumentList();
					}
				}

				setState(2420); match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2421); typeName();
				setState(2422); match(DOT);
				setState(2423); match(SUPER);
				setState(2424); match(DOT);
				setState(2426);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2425); typeArguments();
					}
				}

				setState(2428); match(Identifier);
				setState(2429); match(LPAREN);
				setState(2431);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
					{
					setState(2430); argumentList();
					}
				}

				setState(2433); match(RPAREN);
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
			setState(2437); expression();
			setState(2442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2438); match(COMMA);
				setState(2439); expression();
				}
				}
				setState(2444);
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
			setState(2492);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2445); expressionName();
				setState(2446); match(COLONCOLON);
				setState(2448);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2447); typeArguments();
					}
				}

				setState(2450); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2452); referenceType();
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2459); primary();
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
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2466); match(SUPER);
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
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2472); typeName();
				setState(2473); match(DOT);
				setState(2474); match(SUPER);
				setState(2475); match(COLONCOLON);
				setState(2477);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2476); typeArguments();
					}
				}

				setState(2479); match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2481); classType();
				setState(2482); match(COLONCOLON);
				setState(2484);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2483); typeArguments();
					}
				}

				setState(2486); match(NEW);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2488); arrayType();
				setState(2489); match(COLONCOLON);
				setState(2490); match(NEW);
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
			setState(2494); match(COLONCOLON);
			setState(2496);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2495); typeArguments();
				}
			}

			setState(2498); match(Identifier);
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
			setState(2540);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2500); expressionName();
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
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2507); referenceType();
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2514); match(SUPER);
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
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2520); typeName();
				setState(2521); match(DOT);
				setState(2522); match(SUPER);
				setState(2523); match(COLONCOLON);
				setState(2525);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2524); typeArguments();
					}
				}

				setState(2527); match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2529); classType();
				setState(2530); match(COLONCOLON);
				setState(2532);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2531); typeArguments();
					}
				}

				setState(2534); match(NEW);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2536); arrayType();
				setState(2537); match(COLONCOLON);
				setState(2538); match(NEW);
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
			setState(2564);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2542); match(NEW);
				setState(2543); primitiveType();
				setState(2544); dimExprs();
				setState(2546);
				switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
				case 1:
					{
					setState(2545); dims();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2548); match(NEW);
				setState(2549); classOrInterfaceType();
				setState(2550); dimExprs();
				setState(2552);
				switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
				case 1:
					{
					setState(2551); dims();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2554); match(NEW);
				setState(2555); primitiveType();
				setState(2556); dims();
				setState(2557); arrayInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2559); match(NEW);
				setState(2560); classOrInterfaceType();
				setState(2561); dims();
				setState(2562); arrayInitializer();
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
			setState(2566); dimExpr();
			setState(2570);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2567); dimExpr();
					}
					} 
				}
				setState(2572);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
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
			setState(2576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2573); annotation();
				}
				}
				setState(2578);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2579); match(LBRACK);
			setState(2580); expression();
			setState(2581); match(RBRACK);
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
			setState(2583); expression();
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
			setState(2587);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2585); lambdaExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2586); assignmentExpression();
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
			setState(2589); lambdaParameters();
			setState(2590); match(ARROW);
			setState(2591); lambdaBody();
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
			setState(2603);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2593); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2594); match(LPAREN);
				setState(2596);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << WITH_COMPAT))) != 0) || _la==Identifier || _la==AT) {
					{
					setState(2595); formalParameterList();
					}
				}

				setState(2598); match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2599); match(LPAREN);
				setState(2600); inferredFormalParameterList();
				setState(2601); match(RPAREN);
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
			setState(2605); match(Identifier);
			setState(2610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2606); match(COMMA);
				setState(2607); match(Identifier);
				}
				}
				setState(2612);
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
			setState(2615);
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
				setState(2613); expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2614); block();
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
			setState(2619);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2617); conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2618); assignment();
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
			setState(2621); leftHandSide();
			setState(2622); assignmentOperator();
			setState(2623); expression();
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
			setState(2628);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2625); expressionName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2626); fieldAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2627); arrayAccess();
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
			setState(2630);
			_la = _input.LA(1);
			if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (ASSIGN - 81)) | (1L << (ADD_ASSIGN - 81)) | (1L << (SUB_ASSIGN - 81)) | (1L << (MUL_ASSIGN - 81)) | (1L << (DIV_ASSIGN - 81)) | (1L << (AND_ASSIGN - 81)) | (1L << (OR_ASSIGN - 81)) | (1L << (XOR_ASSIGN - 81)) | (1L << (MOD_ASSIGN - 81)) | (1L << (LSHIFT_ASSIGN - 81)) | (1L << (RSHIFT_ASSIGN - 81)) | (1L << (URSHIFT_ASSIGN - 81)))) != 0)) ) {
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
			setState(2639);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2632); conditionalOrExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2633); conditionalOrExpression(0);
				setState(2634); match(QUESTION);
				setState(2635); expression();
				setState(2636); match(COLON);
				setState(2637); conditionalExpression();
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
			setState(2642); conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2649);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,299,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
					setState(2644);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2645); match(OR);
					setState(2646); conditionalAndExpression(0);
					}
					} 
				}
				setState(2651);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,299,_ctx);
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
			setState(2653); inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2660);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
					setState(2655);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2656); match(AND);
					setState(2657); inclusiveOrExpression(0);
					}
					} 
				}
				setState(2662);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
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
			setState(2664); exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2671);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(2666);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2667); match(BITOR);
					setState(2668); exclusiveOrExpression(0);
					}
					} 
				}
				setState(2673);
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
			setState(2675); andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2682);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(2677);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2678); match(CARET);
					setState(2679); andExpression(0);
					}
					} 
				}
				setState(2684);
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
			setState(2686); equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2693);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(2688);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2689); match(BITAND);
					setState(2690); equalityExpression(0);
					}
					} 
				}
				setState(2695);
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
			setState(2697); relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2707);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2705);
					switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2699);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2700); match(EQUAL);
						setState(2701); relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2702);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2703); match(NOTEQUAL);
						setState(2704); relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(2709);
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
			setState(2711); shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2730);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2728);
					switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2713);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2714); match(LT);
						setState(2715); shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2716);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2717); match(GT);
						setState(2718); shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2719);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2720); match(LE);
						setState(2721); shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2722);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2723); match(GE);
						setState(2724); shiftExpression(0);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2725);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2726); match(INSTANCEOF);
						setState(2727); referenceType();
						}
						break;
					}
					} 
				}
				setState(2732);
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
			setState(2734); additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2751);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2749);
					switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2736);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2737); match(LT);
						setState(2738); match(LT);
						setState(2739); additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2740);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2741); match(GT);
						setState(2742); match(GT);
						setState(2743); additiveExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2744);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2745); match(GT);
						setState(2746); match(GT);
						setState(2747); match(GT);
						setState(2748); additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(2753);
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
			setState(2755); multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2765);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2763);
					switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2757);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2758); match(ADD);
						setState(2759); multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2760);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2761); match(SUB);
						setState(2762); multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(2767);
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
			setState(2769); unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2782);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2780);
					switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2771);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2772); match(MUL);
						setState(2773); unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2774);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2775); match(DIV);
						setState(2776); unaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2777);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2778); match(MOD);
						setState(2779); unaryExpression();
						}
						break;
					}
					} 
				}
				setState(2784);
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
			setState(2792);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(2785); preIncrementExpression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(2786); preDecrementExpression();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(2787); match(ADD);
				setState(2788); unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(2789); match(SUB);
				setState(2790); unaryExpression();
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
				setState(2791); unaryExpressionNotPlusMinus();
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
			setState(2794); match(INC);
			setState(2795); unaryExpression();
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
			setState(2797); match(DEC);
			setState(2798); unaryExpression();
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
			setState(2806);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2800); postfixExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2801); match(TILDE);
				setState(2802); unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2803); match(BANG);
				setState(2804); unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2805); castExpression();
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
			setState(2810);
			switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
			case 1:
				{
				setState(2808); primary();
				}
				break;
			case 2:
				{
				setState(2809); expressionName();
				}
				break;
			}
			setState(2816);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(2814);
					switch (_input.LA(1)) {
					case INC:
						{
						setState(2812); postIncrementExpression_lf_postfixExpression();
						}
						break;
					case DEC:
						{
						setState(2813); postDecrementExpression_lf_postfixExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(2818);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
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
			setState(2819); postfixExpression();
			setState(2820); match(INC);
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
			setState(2822); match(INC);
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
			setState(2824); postfixExpression();
			setState(2825); match(DEC);
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
			setState(2827); match(DEC);
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
			setState(2856);
			switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2829); match(LPAREN);
				setState(2830); primitiveType();
				setState(2831); match(RPAREN);
				setState(2832); unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2834); match(LPAREN);
				setState(2835); referenceType();
				setState(2839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2836); additionalBound();
					}
					}
					setState(2841);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2842); match(RPAREN);
				setState(2843); unaryExpressionNotPlusMinus();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2845); match(LPAREN);
				setState(2846); referenceType();
				setState(2850);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2847); additionalBound();
					}
					}
					setState(2852);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2853); match(RPAREN);
				setState(2854); lambdaExpression();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3|\u0b2d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
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
		"+\3+\3+\3+\5+\u031d\n+\3+\5+\u0320\n+\3+\5+\u0323\n+\3+\3+\3,\3,\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\5-\u0331\n-\3.\3.\3.\3.\3/\3/\3/\7/\u033a\n/\f/\16"+
		"/\u033d\13/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\7\62\u0348\n"+
		"\62\f\62\16\62\u034b\13\62\3\63\3\63\7\63\u034f\n\63\f\63\16\63\u0352"+
		"\13\63\3\63\3\63\3\64\3\64\3\64\3\64\5\64\u035a\n\64\3\65\3\65\3\65\3"+
		"\65\3\65\5\65\u0361\n\65\3\66\7\66\u0364\n\66\f\66\16\66\u0367\13\66\3"+
		"\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\5\67\u0378\n\67\38\38\38\78\u037d\n8\f8\168\u0380\138\39\39\39\59"+
		"\u0385\n9\3:\3:\5:\u0389\n:\3;\3;\5;\u038d\n;\3<\3<\5<\u0391\n<\3=\3="+
		"\5=\u0395\n=\3>\3>\3>\5>\u039a\n>\3?\3?\5?\u039e\n?\3?\3?\7?\u03a2\n?"+
		"\f?\16?\u03a5\13?\3@\3@\5@\u03a9\n@\3@\3@\3@\7@\u03ae\n@\f@\16@\u03b1"+
		"\13@\3@\3@\5@\u03b5\n@\5@\u03b7\n@\3A\3A\7A\u03bb\nA\fA\16A\u03be\13A"+
		"\3A\3A\5A\u03c2\nA\3B\3B\5B\u03c6\nB\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\5G\u03d9\nG\3H\7H\u03dc\nH\fH\16H\u03df\13H\3H\3H\3"+
		"H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u03f2\nI\3J\3J\3J\5J\u03f7"+
		"\nJ\3J\3J\7J\u03fb\nJ\fJ\16J\u03fe\13J\3J\3J\3J\5J\u0403\nJ\5J\u0405\n"+
		"J\3K\3K\5K\u0409\nK\3L\3L\3L\5L\u040e\nL\3L\3L\5L\u0412\nL\3M\3M\3M\3"+
		"M\3M\3M\5M\u041a\nM\3N\3N\3N\7N\u041f\nN\fN\16N\u0422\13N\3N\3N\3N\7N"+
		"\u0427\nN\fN\16N\u042a\13N\5N\u042c\nN\3O\7O\u042f\nO\fO\16O\u0432\13"+
		"O\3O\3O\3O\3P\3P\3P\5P\u043a\nP\3Q\7Q\u043d\nQ\fQ\16Q\u0440\13Q\3Q\3Q"+
		"\7Q\u0444\nQ\fQ\16Q\u0447\13Q\3Q\3Q\3Q\3Q\5Q\u044d\nQ\3R\7R\u0450\nR\f"+
		"R\16R\u0453\13R\3R\3R\3R\5R\u0458\nR\3R\3R\3S\3S\3S\3T\3T\3T\7T\u0462"+
		"\nT\fT\16T\u0465\13T\3U\3U\5U\u0469\nU\3V\3V\5V\u046d\nV\3W\3W\3X\3X\3"+
		"X\3Y\7Y\u0475\nY\fY\16Y\u0478\13Y\3Y\3Y\5Y\u047c\nY\3Y\3Y\3Z\3Z\3Z\3Z"+
		"\5Z\u0484\nZ\3[\5[\u0487\n[\3[\3[\3[\5[\u048c\n[\3[\3[\3\\\3\\\3]\3]\5"+
		"]\u0494\n]\3]\5]\u0497\n]\3]\3]\3^\5^\u049c\n^\3^\3^\3^\5^\u04a1\n^\3"+
		"^\3^\3^\5^\u04a6\n^\3^\3^\3^\5^\u04ab\n^\3^\3^\3^\3^\3^\5^\u04b2\n^\3"+
		"^\3^\3^\5^\u04b7\n^\3^\3^\3^\3^\3^\3^\5^\u04bf\n^\3^\3^\3^\5^\u04c4\n"+
		"^\3^\3^\3^\5^\u04c9\n^\3_\7_\u04cc\n_\f_\16_\u04cf\13_\3_\3_\3_\5_\u04d4"+
		"\n_\3_\3_\3`\3`\5`\u04da\n`\3`\5`\u04dd\n`\3`\5`\u04e0\n`\3`\3`\3a\3a"+
		"\3a\7a\u04e7\na\fa\16a\u04ea\13a\3b\7b\u04ed\nb\fb\16b\u04f0\13b\3b\3"+
		"b\3b\5b\u04f5\nb\3b\5b\u04f8\nb\3b\5b\u04fb\nb\3c\3c\3d\3d\7d\u0501\n"+
		"d\fd\16d\u0504\13d\3e\3e\5e\u0508\ne\3f\7f\u050b\nf\ff\16f\u050e\13f\3"+
		"f\3f\3f\5f\u0513\nf\3f\5f\u0516\nf\3f\3f\3g\3g\3h\3h\3h\3h\3h\3h\3h\5"+
		"h\u0523\nh\3i\3i\3i\3j\3j\7j\u052a\nj\fj\16j\u052d\13j\3j\3j\3k\3k\3k"+
		"\3k\3k\5k\u0536\nk\3l\7l\u0539\nl\fl\16l\u053c\13l\3l\3l\3l\3l\3m\3m\3"+
		"m\3m\5m\u0546\nm\3n\7n\u0549\nn\fn\16n\u054c\13n\3n\3n\3n\3o\3o\3o\3o"+
		"\3o\3o\5o\u0557\no\3p\7p\u055a\np\fp\16p\u055d\13p\3p\3p\3p\3p\3p\3q\3"+
		"q\7q\u0566\nq\fq\16q\u0569\13q\3q\3q\3r\3r\3r\3r\3r\5r\u0572\nr\3s\7s"+
		"\u0575\ns\fs\16s\u0578\13s\3s\3s\3s\3s\3s\5s\u057f\ns\3s\5s\u0582\ns\3"+
		"s\3s\3t\3t\3t\5t\u0589\nt\3u\3u\3u\3v\3v\3v\5v\u0591\nv\3w\3w\3w\3w\5"+
		"w\u0597\nw\3w\3w\3x\3x\3x\7x\u059e\nx\fx\16x\u05a1\13x\3y\3y\3y\3y\3z"+
		"\3z\3z\5z\u05aa\nz\3{\3{\5{\u05ae\n{\3{\5{\u05b1\n{\3{\3{\3|\3|\3|\7|"+
		"\u05b8\n|\f|\16|\u05bb\13|\3}\3}\3}\3~\3~\3~\3~\3~\3~\3\177\3\177\5\177"+
		"\u05c8\n\177\3\177\5\177\u05cb\n\177\3\177\3\177\3\u0080\3\u0080\3\u0080"+
		"\7\u0080\u05d2\n\u0080\f\u0080\16\u0080\u05d5\13\u0080\3\u0081\3\u0081"+
		"\5\u0081\u05d9\n\u0081\3\u0081\3\u0081\3\u0082\6\u0082\u05de\n\u0082\r"+
		"\u0082\16\u0082\u05df\3\u0083\3\u0083\3\u0083\5\u0083\u05e5\n\u0083\3"+
		"\u0084\3\u0084\3\u0084\3\u0085\7\u0085\u05eb\n\u0085\f\u0085\16\u0085"+
		"\u05ee\13\u0085\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\5\u0086\u05f9\n\u0086\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\5\u0087\u0600\n\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u060e"+
		"\n\u0088\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\5\u008d\u0624\n\u008d\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\5\u0091\u0646\n\u0091\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0093\3\u0093\7\u0093\u0650\n\u0093\f\u0093\16\u0093"+
		"\u0653\13\u0093\3\u0093\7\u0093\u0656\n\u0093\f\u0093\16\u0093\u0659\13"+
		"\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0095\3\u0095\7\u0095"+
		"\u0662\n\u0095\f\u0095\16\u0095\u0665\13\u0095\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\5\u0096\u0671"+
		"\n\u0096\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009b\3\u009b\5\u009b\u068b"+
		"\n\u009b\3\u009c\3\u009c\5\u009c\u068f\n\u009c\3\u009d\3\u009d\3\u009d"+
		"\5\u009d\u0694\n\u009d\3\u009d\3\u009d\5\u009d\u0698\n\u009d\3\u009d\3"+
		"\u009d\5\u009d\u069c\n\u009d\3\u009d\3\u009d\3\u009d\3\u009e\3\u009e\3"+
		"\u009e\5\u009e\u06a4\n\u009e\3\u009e\3\u009e\5\u009e\u06a8\n\u009e\3\u009e"+
		"\3\u009e\5\u009e\u06ac\n\u009e\3\u009e\3\u009e\3\u009e\3\u009f\3\u009f"+
		"\5\u009f\u06b3\n\u009f\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1\7\u00a1"+
		"\u06ba\n\u00a1\f\u00a1\16\u00a1\u06bd\13\u00a1\3\u00a2\3\u00a2\3\u00a2"+
		"\7\u00a2\u06c2\n\u00a2\f\u00a2\16\u00a2\u06c5\13\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a3\7\u00a3"+
		"\u06d1\n\u00a3\f\u00a3\16\u00a3\u06d4\13\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\5\u00a4\u06df\n\u00a4"+
		"\3\u00a4\3\u00a4\3\u00a5\3\u00a5\5\u00a5\u06e5\n\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a6\3\u00a6\5\u00a6\u06eb\n\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0700\n\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0705\n\u00a9\3\u00aa\3\u00aa\7\u00aa"+
		"\u0709\n\u00aa\f\u00aa\16\u00aa\u070c\13\u00aa\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ac\7\u00ac\u0715\n\u00ac\f\u00ac\16\u00ac"+
		"\u0718\13\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ad\7\u00ad"+
		"\u0720\n\u00ad\f\u00ad\16\u00ad\u0723\13\u00ad\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00af\3\u00af\3\u00af\3\u00af\5\u00af\u072c\n\u00af\3\u00af\5\u00af"+
		"\u072f\n\u00af\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u0734\n\u00b0\3\u00b0\3"+
		"\u00b0\3\u00b1\3\u00b1\3\u00b1\7\u00b1\u073b\n\u00b1\f\u00b1\16\u00b1"+
		"\u073e\13\u00b1\3\u00b2\7\u00b2\u0741\n\u00b2\f\u00b2\16\u00b2\u0744\13"+
		"\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b3\3\u00b3\5\u00b3"+
		"\u074d\n\u00b3\3\u00b3\7\u00b3\u0750\n\u00b3\f\u00b3\16\u00b3\u0753\13"+
		"\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4\7\u00b4\u0759\n\u00b4\f\u00b4\16"+
		"\u00b4\u075c\13\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u0772\n\u00b4\3\u00b5"+
		"\3\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\7\u00b6\u077a\n\u00b6\f\u00b6"+
		"\16\u00b6\u077d\13\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u0792\n\u00b6\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u0799\n\u00b7\3\u00b8\3\u00b8\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u07a1\n\u00b9\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\7\u00ba\u07a7\n\u00ba\f\u00ba\16\u00ba\u07aa\13\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\7\u00ba\u07b2\n\u00ba\f\u00ba"+
		"\16\u00ba\u07b5\13\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u07cb\n\u00ba\3\u00bb"+
		"\3\u00bb\3\u00bc\3\u00bc\3\u00bc\3\u00bc\7\u00bc\u07d3\n\u00bc\f\u00bc"+
		"\16\u00bc\u07d6\13\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\7\u00bc\u07de\n\u00bc\f\u00bc\16\u00bc\u07e1\13\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc"+
		"\u07f6\n\u00bc\3\u00bd\3\u00bd\5\u00bd\u07fa\n\u00bd\3\u00bd\7\u00bd\u07fd"+
		"\n\u00bd\f\u00bd\16\u00bd\u0800\13\u00bd\3\u00bd\3\u00bd\3\u00bd\7\u00bd"+
		"\u0805\n\u00bd\f\u00bd\16\u00bd\u0808\13\u00bd\3\u00bd\7\u00bd\u080b\n"+
		"\u00bd\f\u00bd\16\u00bd\u080e\13\u00bd\3\u00bd\5\u00bd\u0811\n\u00bd\3"+
		"\u00bd\3\u00bd\5\u00bd\u0815\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u0819\n\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u081f\n\u00bd\3\u00bd\7\u00bd"+
		"\u0822\n\u00bd\f\u00bd\16\u00bd\u0825\13\u00bd\3\u00bd\3\u00bd\5\u00bd"+
		"\u0829\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u082d\n\u00bd\3\u00bd\3\u00bd\5"+
		"\u00bd\u0831\n\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0837\n\u00bd"+
		"\3\u00bd\7\u00bd\u083a\n\u00bd\f\u00bd\16\u00bd\u083d\13\u00bd\3\u00bd"+
		"\3\u00bd\5\u00bd\u0841\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u0845\n\u00bd\3"+
		"\u00bd\3\u00bd\5\u00bd\u0849\n\u00bd\5\u00bd\u084b\n\u00bd\3\u00be\3\u00be"+
		"\3\u00be\5\u00be\u0850\n\u00be\3\u00be\7\u00be\u0853\n\u00be\f\u00be\16"+
		"\u00be\u0856\13\u00be\3\u00be\3\u00be\5\u00be\u085a\n\u00be\3\u00be\3"+
		"\u00be\5\u00be\u085e\n\u00be\3\u00be\3\u00be\5\u00be\u0862\n\u00be\3\u00bf"+
		"\3\u00bf\5\u00bf\u0866\n\u00bf\3\u00bf\7\u00bf\u0869\n\u00bf\f\u00bf\16"+
		"\u00bf\u086c\13\u00bf\3\u00bf\3\u00bf\3\u00bf\7\u00bf\u0871\n\u00bf\f"+
		"\u00bf\16\u00bf\u0874\13\u00bf\3\u00bf\7\u00bf\u0877\n\u00bf\f\u00bf\16"+
		"\u00bf\u087a\13\u00bf\3\u00bf\5\u00bf\u087d\n\u00bf\3\u00bf\3\u00bf\5"+
		"\u00bf\u0881\n\u00bf\3\u00bf\3\u00bf\5\u00bf\u0885\n\u00bf\3\u00bf\3\u00bf"+
		"\3\u00bf\3\u00bf\5\u00bf\u088b\n\u00bf\3\u00bf\7\u00bf\u088e\n\u00bf\f"+
		"\u00bf\16\u00bf\u0891\13\u00bf\3\u00bf\3\u00bf\5\u00bf\u0895\n\u00bf\3"+
		"\u00bf\3\u00bf\5\u00bf\u0899\n\u00bf\3\u00bf\3\u00bf\5\u00bf\u089d\n\u00bf"+
		"\5\u00bf\u089f\n\u00bf\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u08a4\n\u00c0\3"+
		"\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u08b3\n\u00c1\3\u00c2\3\u00c2"+
		"\3\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3"+
		"\3\u00c3\5\u00c3\u08c1\n\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u08cd\n\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\7\u00c4\u08d4\n\u00c4\f\u00c4\16\u00c4"+
		"\u08d7\13\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\7\u00c5\u08e2\n\u00c5\f\u00c5\16\u00c5\u08e5\13\u00c5"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\5\u00c6\u08f1\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\7\u00c6\u08f8\n\u00c6\f\u00c6\16\u00c6\u08fb\13\u00c6\3\u00c7\3\u00c7"+
		"\3\u00c7\5\u00c7\u0900\n\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\5\u00c7\u0907\n\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u090c\n\u00c7\3"+
		"\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0913\n\u00c7\3\u00c7\3"+
		"\u00c7\3\u00c7\5\u00c7\u0918\n\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3"+
		"\u00c7\5\u00c7\u091f\n\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0924\n\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u092b\n\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\5\u00c7\u0930\n\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\5\u00c7\u0938\n\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7"+
		"\u093d\n\u00c7\3\u00c7\3\u00c7\5\u00c7\u0941\n\u00c7\3\u00c8\3\u00c8\5"+
		"\u00c8\u0945\n\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u094a\n\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0951\n\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0958\n\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\5\u00c9\u095d\n\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9"+
		"\u0964\n\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0969\n\u00c9\3\u00c9\3"+
		"\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0970\n\u00c9\3\u00c9\3\u00c9\3"+
		"\u00c9\5\u00c9\u0975\n\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3"+
		"\u00c9\5\u00c9\u097d\n\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0982\n\u00c9"+
		"\3\u00c9\3\u00c9\5\u00c9\u0986\n\u00c9\3\u00ca\3\u00ca\3\u00ca\7\u00ca"+
		"\u098b\n\u00ca\f\u00ca\16\u00ca\u098e\13\u00ca\3\u00cb\3\u00cb\3\u00cb"+
		"\5\u00cb\u0993\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb"+
		"\u099a\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u09a1\n"+
		"\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u09a8\n\u00cb\3"+
		"\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u09b0\n\u00cb\3"+
		"\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u09b7\n\u00cb\3\u00cb\3"+
		"\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u09bf\n\u00cb\3\u00cc\3"+
		"\u00cc\5\u00cc\u09c3\n\u00cc\3\u00cc\3\u00cc\3\u00cd\3\u00cd\3\u00cd\5"+
		"\u00cd\u09ca\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u09d1"+
		"\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u09d8\n\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u09e0\n\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u09e7\n\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u09ef\n\u00cd\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u09f5\n\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\5\u00ce\u09fb\n\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u0a07\n\u00ce\3\u00cf"+
		"\3\u00cf\7\u00cf\u0a0b\n\u00cf\f\u00cf\16\u00cf\u0a0e\13\u00cf\3\u00d0"+
		"\7\u00d0\u0a11\n\u00d0\f\u00d0\16\u00d0\u0a14\13\u00d0\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d1\3\u00d1\3\u00d2\3\u00d2\5\u00d2\u0a1e\n\u00d2"+
		"\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u0a27"+
		"\n\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u0a2e\n\u00d4"+
		"\3\u00d5\3\u00d5\3\u00d5\7\u00d5\u0a33\n\u00d5\f\u00d5\16\u00d5\u0a36"+
		"\13\u00d5\3\u00d6\3\u00d6\5\u00d6\u0a3a\n\u00d6\3\u00d7\3\u00d7\5\u00d7"+
		"\u0a3e\n\u00d7\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d9\3\u00d9\3\u00d9"+
		"\5\u00d9\u0a47\n\u00d9\3\u00da\3\u00da\3\u00db\3\u00db\3\u00db\3\u00db"+
		"\3\u00db\3\u00db\3\u00db\5\u00db\u0a52\n\u00db\3\u00dc\3\u00dc\3\u00dc"+
		"\3\u00dc\3\u00dc\3\u00dc\7\u00dc\u0a5a\n\u00dc\f\u00dc\16\u00dc\u0a5d"+
		"\13\u00dc\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\7\u00dd\u0a65"+
		"\n\u00dd\f\u00dd\16\u00dd\u0a68\13\u00dd\3\u00de\3\u00de\3\u00de\3\u00de"+
		"\3\u00de\3\u00de\7\u00de\u0a70\n\u00de\f\u00de\16\u00de\u0a73\13\u00de"+
		"\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\7\u00df\u0a7b\n\u00df"+
		"\f\u00df\16\u00df\u0a7e\13\u00df\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0"+
		"\3\u00e0\7\u00e0\u0a86\n\u00e0\f\u00e0\16\u00e0\u0a89\13\u00e0\3\u00e1"+
		"\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\7\u00e1"+
		"\u0a94\n\u00e1\f\u00e1\16\u00e1\u0a97\13\u00e1\3\u00e2\3\u00e2\3\u00e2"+
		"\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2"+
		"\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\7\u00e2\u0aab\n\u00e2"+
		"\f\u00e2\16\u00e2\u0aae\13\u00e2\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\7\u00e3\u0ac0\n\u00e3\f\u00e3\16\u00e3\u0ac3\13\u00e3"+
		"\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4"+
		"\7\u00e4\u0ace\n\u00e4\f\u00e4\16\u00e4\u0ad1\13\u00e4\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\7\u00e5\u0adf\n\u00e5\f\u00e5\16\u00e5\u0ae2\13\u00e5\3\u00e6"+
		"\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\5\u00e6\u0aeb\n\u00e6"+
		"\3\u00e7\3\u00e7\3\u00e7\3\u00e8\3\u00e8\3\u00e8\3\u00e9\3\u00e9\3\u00e9"+
		"\3\u00e9\3\u00e9\3\u00e9\5\u00e9\u0af9\n\u00e9\3\u00ea\3\u00ea\5\u00ea"+
		"\u0afd\n\u00ea\3\u00ea\3\u00ea\7\u00ea\u0b01\n\u00ea\f\u00ea\16\u00ea"+
		"\u0b04\13\u00ea\3\u00eb\3\u00eb\3\u00eb\3\u00ec\3\u00ec\3\u00ed\3\u00ed"+
		"\3\u00ed\3\u00ee\3\u00ee\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef"+
		"\3\u00ef\3\u00ef\7\u00ef\u0b18\n\u00ef\f\u00ef\16\u00ef\u0b1b\13\u00ef"+
		"\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\7\u00ef\u0b23\n\u00ef"+
		"\f\u00ef\16\u00ef\u0b26\13\u00ef\3\u00ef\3\u00ef\3\u00ef\5\u00ef\u0b2b"+
		"\n\u00ef\3\u00ef\2\17\648>\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4"+
		"\u01c6\u01c8\u00f0\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6"+
		"\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe"+
		"\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116"+
		"\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e"+
		"\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146"+
		"\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e"+
		"\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176"+
		"\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e"+
		"\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6"+
		"\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be"+
		"\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6"+
		"\u01d8\u01da\u01dc\2\b\3\2DI\7\2\7\7\n\n\35\35\37\37\'\'\4\2\20\20\26"+
		"\26\3\2\658\3\2;<\4\2SSlv\u0c24\2\u01de\3\2\2\2\4\u01ee\3\2\2\2\6\u01f2"+
		"\3\2\2\2\b\u01f4\3\2\2\2\n\u01f6\3\2\2\2\f\u01fb\3\2\2\2\16\u01ff\3\2"+
		"\2\2\20\u021e\3\2\2\2\22\u0220\3\2\2\2\24\u022e\3\2\2\2\26\u0235\3\2\2"+
		"\2\30\u0237\3\2\2\2\32\u0239\3\2\2\2\34\u023e\3\2\2\2\36\u024c\3\2\2\2"+
		" \u0251\3\2\2\2\"\u0266\3\2\2\2$\u026d\3\2\2\2&\u0279\3\2\2\2(\u027b\3"+
		"\2\2\2*\u027e\3\2\2\2,\u0282\3\2\2\2.\u028c\3\2\2\2\60\u0291\3\2\2\2\62"+
		"\u029c\3\2\2\2\64\u029e\3\2\2\2\66\u02ae\3\2\2\28\u02b0\3\2\2\2:\u02c0"+
		"\3\2\2\2<\u02c2\3\2\2\2>\u02c4\3\2\2\2@\u02d0\3\2\2\2B\u02e3\3\2\2\2D"+
		"\u02ea\3\2\2\2F\u02f0\3\2\2\2H\u02f2\3\2\2\2J\u02f6\3\2\2\2L\u02fc\3\2"+
		"\2\2N\u0303\3\2\2\2P\u030d\3\2\2\2R\u0311\3\2\2\2T\u0316\3\2\2\2V\u0326"+
		"\3\2\2\2X\u0330\3\2\2\2Z\u0332\3\2\2\2\\\u0336\3\2\2\2^\u033e\3\2\2\2"+
		"`\u0341\3\2\2\2b\u0344\3\2\2\2d\u034c\3\2\2\2f\u0359\3\2\2\2h\u0360\3"+
		"\2\2\2j\u0365\3\2\2\2l\u0377\3\2\2\2n\u0379\3\2\2\2p\u0381\3\2\2\2r\u0386"+
		"\3\2\2\2t\u038c\3\2\2\2v\u0390\3\2\2\2x\u0394\3\2\2\2z\u0399\3\2\2\2|"+
		"\u039d\3\2\2\2~\u03b6\3\2\2\2\u0080\u03b8\3\2\2\2\u0082\u03c3\3\2\2\2"+
		"\u0084\u03c7\3\2\2\2\u0086\u03c9\3\2\2\2\u0088\u03cb\3\2\2\2\u008a\u03cd"+
		"\3\2\2\2\u008c\u03d8\3\2\2\2\u008e\u03dd\3\2\2\2\u0090\u03f1\3\2\2\2\u0092"+
		"\u0404\3\2\2\2\u0094\u0408\3\2\2\2\u0096\u040a\3\2\2\2\u0098\u0419\3\2"+
		"\2\2\u009a\u042b\3\2\2\2\u009c\u0430\3\2\2\2\u009e\u0439\3\2\2\2\u00a0"+
		"\u044c\3\2\2\2\u00a2\u0451\3\2\2\2\u00a4\u045b\3\2\2\2\u00a6\u045e\3\2"+
		"\2\2\u00a8\u0468\3\2\2\2\u00aa\u046c\3\2\2\2\u00ac\u046e\3\2\2\2\u00ae"+
		"\u0470\3\2\2\2\u00b0\u0476\3\2\2\2\u00b2\u0483\3\2\2\2\u00b4\u0486\3\2"+
		"\2\2\u00b6\u048f\3\2\2\2\u00b8\u0491\3\2\2\2\u00ba\u04c8\3\2\2\2\u00bc"+
		"\u04cd\3\2\2\2\u00be\u04d7\3\2\2\2\u00c0\u04e3\3\2\2\2\u00c2\u04ee\3\2"+
		"\2\2\u00c4\u04fc\3\2\2\2\u00c6\u04fe\3\2\2\2\u00c8\u0507\3\2\2\2\u00ca"+
		"\u050c\3\2\2\2\u00cc\u0519\3\2\2\2\u00ce\u0522\3\2\2\2\u00d0\u0524\3\2"+
		"\2\2\u00d2\u0527\3\2\2\2\u00d4\u0535\3\2\2\2\u00d6\u053a\3\2\2\2\u00d8"+
		"\u0545\3\2\2\2\u00da\u054a\3\2\2\2\u00dc\u0556\3\2\2\2\u00de\u055b\3\2"+
		"\2\2\u00e0\u0563\3\2\2\2\u00e2\u0571\3\2\2\2\u00e4\u0576\3\2\2\2\u00e6"+
		"\u0588\3\2\2\2\u00e8\u058a\3\2\2\2\u00ea\u0590\3\2\2\2\u00ec\u0592\3\2"+
		"\2\2\u00ee\u059a\3\2\2\2\u00f0\u05a2\3\2\2\2\u00f2\u05a9\3\2\2\2\u00f4"+
		"\u05ab\3\2\2\2\u00f6\u05b4\3\2\2\2\u00f8\u05bc\3\2\2\2\u00fa\u05bf\3\2"+
		"\2\2\u00fc\u05c5\3\2\2\2\u00fe\u05ce\3\2\2\2\u0100\u05d6\3\2\2\2\u0102"+
		"\u05dd\3\2\2\2\u0104\u05e4\3\2\2\2\u0106\u05e6\3\2\2\2\u0108\u05ec\3\2"+
		"\2\2\u010a\u05f8\3\2\2\2\u010c\u05ff\3\2\2\2\u010e\u060d\3\2\2\2\u0110"+
		"\u060f\3\2\2\2\u0112\u0611\3\2\2\2\u0114\u0615\3\2\2\2\u0116\u0619\3\2"+
		"\2\2\u0118\u0623\3\2\2\2\u011a\u0625\3\2\2\2\u011c\u062b\3\2\2\2\u011e"+
		"\u0633\3\2\2\2\u0120\u0645\3\2\2\2\u0122\u0647\3\2\2\2\u0124\u064d\3\2"+
		"\2\2\u0126\u065c\3\2\2\2\u0128\u065f\3\2\2\2\u012a\u0670\3\2\2\2\u012c"+
		"\u0672\3\2\2\2\u012e\u0674\3\2\2\2\u0130\u067a\3\2\2\2\u0132\u0680\3\2"+
		"\2\2\u0134\u068a\3\2\2\2\u0136\u068e\3\2\2\2\u0138\u0690\3\2\2\2\u013a"+
		"\u06a0\3\2\2\2\u013c\u06b2\3\2\2\2\u013e\u06b4\3\2\2\2\u0140\u06b6\3\2"+
		"\2\2\u0142\u06be\3\2\2\2\u0144\u06cd\3\2\2\2\u0146\u06dc\3\2\2\2\u0148"+
		"\u06e2\3\2\2\2\u014a\u06e8\3\2\2\2\u014c\u06ee\3\2\2\2\u014e\u06f2\3\2"+
		"\2\2\u0150\u0704\3\2\2\2\u0152\u0706\3\2\2\2\u0154\u070d\3\2\2\2\u0156"+
		"\u0716\3\2\2\2\u0158\u071c\3\2\2\2\u015a\u0724\3\2\2\2\u015c\u0727\3\2"+
		"\2\2\u015e\u0730\3\2\2\2\u0160\u0737\3\2\2\2\u0162\u0742\3\2\2\2\u0164"+
		"\u074c\3\2\2\2\u0166\u0771\3\2\2\2\u0168\u0773\3\2\2\2\u016a\u0791\3\2"+
		"\2\2\u016c\u0798\3\2\2\2\u016e\u079a\3\2\2\2\u0170\u07a0\3\2\2\2\u0172"+
		"\u07ca\3\2\2\2\u0174\u07cc\3\2\2\2\u0176\u07f5\3\2\2\2\u0178\u084a\3\2"+
		"\2\2\u017a\u084c\3\2\2\2\u017c\u089e\3\2\2\2\u017e\u08a3\3\2\2\2\u0180"+
		"\u08b2\3\2\2\2\u0182\u08b4\3\2\2\2\u0184\u08c0\3\2\2\2\u0186\u08cc\3\2"+
		"\2\2\u0188\u08d8\3\2\2\2\u018a\u08f0\3\2\2\2\u018c\u0940\3\2\2\2\u018e"+
		"\u0942\3\2\2\2\u0190\u0985\3\2\2\2\u0192\u0987\3\2\2\2\u0194\u09be\3\2"+
		"\2\2\u0196\u09c0\3\2\2\2\u0198\u09ee\3\2\2\2\u019a\u0a06\3\2\2\2\u019c"+
		"\u0a08\3\2\2\2\u019e\u0a12\3\2\2\2\u01a0\u0a19\3\2\2\2\u01a2\u0a1d\3\2"+
		"\2\2\u01a4\u0a1f\3\2\2\2\u01a6\u0a2d\3\2\2\2\u01a8\u0a2f\3\2\2\2\u01aa"+
		"\u0a39\3\2\2\2\u01ac\u0a3d\3\2\2\2\u01ae\u0a3f\3\2\2\2\u01b0\u0a46\3\2"+
		"\2\2\u01b2\u0a48\3\2\2\2\u01b4\u0a51\3\2\2\2\u01b6\u0a53\3\2\2\2\u01b8"+
		"\u0a5e\3\2\2\2\u01ba\u0a69\3\2\2\2\u01bc\u0a74\3\2\2\2\u01be\u0a7f\3\2"+
		"\2\2\u01c0\u0a8a\3\2\2\2\u01c2\u0a98\3\2\2\2\u01c4\u0aaf\3\2\2\2\u01c6"+
		"\u0ac4\3\2\2\2\u01c8\u0ad2\3\2\2\2\u01ca\u0aea\3\2\2\2\u01cc\u0aec\3\2"+
		"\2\2\u01ce\u0aef\3\2\2\2\u01d0\u0af8\3\2\2\2\u01d2\u0afc\3\2\2\2\u01d4"+
		"\u0b05\3\2\2\2\u01d6\u0b08\3\2\2\2\u01d8\u0b0a\3\2\2\2\u01da\u0b0d\3\2"+
		"\2\2\u01dc\u0b2a\3\2\2\2\u01de\u01df\t\2\2\2\u01df\3\3\2\2\2\u01e0\u01e2"+
		"\5\u00eav\2\u01e1\u01e0\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2\2"+
		"\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01ef"+
		"\5\6\4\2\u01e7\u01e9\5\u00eav\2\u01e8\u01e7\3\2\2\2\u01e9\u01ec\3\2\2"+
		"\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01ea"+
		"\3\2\2\2\u01ed\u01ef\7\5\2\2\u01ee\u01e3\3\2\2\2\u01ee\u01ea\3\2\2\2\u01ef"+
		"\5\3\2\2\2\u01f0\u01f3\5\b\5\2\u01f1\u01f3\5\n\6\2\u01f2\u01f0\3\2\2\2"+
		"\u01f2\u01f1\3\2\2\2\u01f3\7\3\2\2\2\u01f4\u01f5\t\3\2\2\u01f5\t\3\2\2"+
		"\2\u01f6\u01f7\t\4\2\2\u01f7\13\3\2\2\2\u01f8\u01fc\5\16\b\2\u01f9\u01fc"+
		"\5\34\17\2\u01fa\u01fc\5\36\20\2\u01fb\u01f8\3\2\2\2\u01fb\u01f9\3\2\2"+
		"\2\u01fb\u01fa\3\2\2\2\u01fc\r\3\2\2\2\u01fd\u0200\5\24\13\2\u01fe\u0200"+
		"\5\32\16\2\u01ff\u01fd\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200\u0205\3\2\2\2"+
		"\u0201\u0204\5\22\n\2\u0202\u0204\5\30\r\2\u0203\u0201\3\2\2\2\u0203\u0202"+
		"\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206"+
		"\17\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u020a\5\u00eav\2\u0209\u0208\3\2"+
		"\2\2\u020a\u020d\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c"+
		"\u020e\3\2\2\2\u020d\u020b\3\2\2\2\u020e\u0210\7w\2\2\u020f\u0211\5*\26"+
		"\2\u0210\u020f\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u021f\3\2\2\2\u0212\u0213"+
		"\5\16\b\2\u0213\u0217\7R\2\2\u0214\u0216\5\u00eav\2\u0215\u0214\3\2\2"+
		"\2\u0216\u0219\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021a"+
		"\3\2\2\2\u0219\u0217\3\2\2\2\u021a\u021c\7w\2\2\u021b\u021d\5*\26\2\u021c"+
		"\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021f\3\2\2\2\u021e\u020b\3\2"+
		"\2\2\u021e\u0212\3\2\2\2\u021f\21\3\2\2\2\u0220\u0224\7R\2\2\u0221\u0223"+
		"\5\u00eav\2\u0222\u0221\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2"+
		"\2\u0224\u0225\3\2\2\2\u0225\u0227\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u0229"+
		"\7w\2\2\u0228\u022a\5*\26\2\u0229\u0228\3\2\2\2\u0229\u022a\3\2\2\2\u022a"+
		"\23\3\2\2\2\u022b\u022d\5\u00eav\2\u022c\u022b\3\2\2\2\u022d\u0230\3\2"+
		"\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\3\2\2\2\u0230"+
		"\u022e\3\2\2\2\u0231\u0233\7w\2\2\u0232\u0234\5*\26\2\u0233\u0232\3\2"+
		"\2\2\u0233\u0234\3\2\2\2\u0234\25\3\2\2\2\u0235\u0236\5\20\t\2\u0236\27"+
		"\3\2\2\2\u0237\u0238\5\22\n\2\u0238\31\3\2\2\2\u0239\u023a\5\24\13\2\u023a"+
		"\33\3\2\2\2\u023b\u023d\5\u00eav\2\u023c\u023b\3\2\2\2\u023d\u0240\3\2"+
		"\2\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0241\3\2\2\2\u0240"+
		"\u023e\3\2\2\2\u0241\u0242\7w\2\2\u0242\35\3\2\2\2\u0243\u0244\5\4\3\2"+
		"\u0244\u0245\5 \21\2\u0245\u024d\3\2\2\2\u0246\u0247\5\16\b\2\u0247\u0248"+
		"\5 \21\2\u0248\u024d\3\2\2\2\u0249\u024a\5\34\17\2\u024a\u024b\5 \21\2"+
		"\u024b\u024d\3\2\2\2\u024c\u0243\3\2\2\2\u024c\u0246\3\2\2\2\u024c\u0249"+
		"\3\2\2\2\u024d\37\3\2\2\2\u024e\u0250\5\u00eav\2\u024f\u024e\3\2\2\2\u0250"+
		"\u0253\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0254\3\2"+
		"\2\2\u0253\u0251\3\2\2\2\u0254\u0255\7N\2\2\u0255\u0260\7O\2\2\u0256\u0258"+
		"\5\u00eav\2\u0257\u0256\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2"+
		"\2\u0259\u025a\3\2\2\2\u025a\u025c\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u025d"+
		"\7N\2\2\u025d\u025f\7O\2\2\u025e\u0259\3\2\2\2\u025f\u0262\3\2\2\2\u0260"+
		"\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261!\3\2\2\2\u0262\u0260\3\2\2\2"+
		"\u0263\u0265\5$\23\2\u0264\u0263\3\2\2\2\u0265\u0268\3\2\2\2\u0266\u0264"+
		"\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0269\3\2\2\2\u0268\u0266\3\2\2\2\u0269"+
		"\u026b\7w\2\2\u026a\u026c\5&\24\2\u026b\u026a\3\2\2\2\u026b\u026c\3\2"+
		"\2\2\u026c#\3\2\2\2\u026d\u026e\5\u00eav\2\u026e%\3\2\2\2\u026f\u0270"+
		"\7\23\2\2\u0270\u027a\5\34\17\2\u0271\u0272\7\23\2\2\u0272\u0276\5\16"+
		"\b\2\u0273\u0275\5(\25\2\u0274\u0273\3\2\2\2\u0275\u0278\3\2\2\2\u0276"+
		"\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u027a\3\2\2\2\u0278\u0276\3\2"+
		"\2\2\u0279\u026f\3\2\2\2\u0279\u0271\3\2\2\2\u027a\'\3\2\2\2\u027b\u027c"+
		"\7f\2\2\u027c\u027d\5\26\f\2\u027d)\3\2\2\2\u027e\u027f\7U\2\2\u027f\u0280"+
		"\5,\27\2\u0280\u0281\7T\2\2\u0281+\3\2\2\2\u0282\u0287\5.\30\2\u0283\u0284"+
		"\7Q\2\2\u0284\u0286\5.\30\2\u0285\u0283\3\2\2\2\u0286\u0289\3\2\2\2\u0287"+
		"\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288-\3\2\2\2\u0289\u0287\3\2\2\2"+
		"\u028a\u028d\5\f\7\2\u028b\u028d\5\60\31\2\u028c\u028a\3\2\2\2\u028c\u028b"+
		"\3\2\2\2\u028d/\3\2\2\2\u028e\u0290\5\u00eav\2\u028f\u028e\3\2\2\2\u0290"+
		"\u0293\3\2\2\2\u0291\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0294\3\2"+
		"\2\2\u0293\u0291\3\2\2\2\u0294\u0296\7X\2\2\u0295\u0297\5\62\32\2\u0296"+
		"\u0295\3\2\2\2\u0296\u0297\3\2\2\2\u0297\61\3\2\2\2\u0298\u0299\7\23\2"+
		"\2\u0299\u029d\5\f\7\2\u029a\u029b\7*\2\2\u029b\u029d\5\f\7\2\u029c\u0298"+
		"\3\2\2\2\u029c\u029a\3\2\2\2\u029d\63\3\2\2\2\u029e\u029f\b\33\1\2\u029f"+
		"\u02a0\7w\2\2\u02a0\u02a6\3\2\2\2\u02a1\u02a2\f\3\2\2\u02a2\u02a3\7R\2"+
		"\2\u02a3\u02a5\7w\2\2\u02a4\u02a1\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6\u02a4"+
		"\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\65\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9"+
		"\u02af\7w\2\2\u02aa\u02ab\58\35\2\u02ab\u02ac\7R\2\2\u02ac\u02ad\7w\2"+
		"\2\u02ad\u02af\3\2\2\2\u02ae\u02a9\3\2\2\2\u02ae\u02aa\3\2\2\2\u02af\67"+
		"\3\2\2\2\u02b0\u02b1\b\35\1\2\u02b1\u02b2\7w\2\2\u02b2\u02b8\3\2\2\2\u02b3"+
		"\u02b4\f\3\2\2\u02b4\u02b5\7R\2\2\u02b5\u02b7\7w\2\2\u02b6\u02b3\3\2\2"+
		"\2\u02b7\u02ba\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b99"+
		"\3\2\2\2\u02ba\u02b8\3\2\2\2\u02bb\u02c1\7w\2\2\u02bc\u02bd\5> \2\u02bd"+
		"\u02be\7R\2\2\u02be\u02bf\7w\2\2\u02bf\u02c1\3\2\2\2\u02c0\u02bb\3\2\2"+
		"\2\u02c0\u02bc\3\2\2\2\u02c1;\3\2\2\2\u02c2\u02c3\7w\2\2\u02c3=\3\2\2"+
		"\2\u02c4\u02c5\b \1\2\u02c5\u02c6\7w\2\2\u02c6\u02cc\3\2\2\2\u02c7\u02c8"+
		"\f\3\2\2\u02c8\u02c9\7R\2\2\u02c9\u02cb\7w\2\2\u02ca\u02c7\3\2\2\2\u02cb"+
		"\u02ce\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd?\3\2\2\2"+
		"\u02ce\u02cc\3\2\2\2\u02cf\u02d1\5B\"\2\u02d0\u02cf\3\2\2\2\u02d0\u02d1"+
		"\3\2\2\2\u02d1\u02d5\3\2\2\2\u02d2\u02d4\5F$\2\u02d3\u02d2\3\2\2\2\u02d4"+
		"\u02d7\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02db\3\2"+
		"\2\2\u02d7\u02d5\3\2\2\2\u02d8\u02da\5P)\2\u02d9\u02d8\3\2\2\2\u02da\u02dd"+
		"\3\2\2\2\u02db\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02de\3\2\2\2\u02dd"+
		"\u02db\3\2\2\2\u02de\u02df\7\2\2\3\u02dfA\3\2\2\2\u02e0\u02e2\5D#\2\u02e1"+
		"\u02e0\3\2\2\2\u02e2\u02e5\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e3\u02e4\3\2"+
		"\2\2\u02e4\u02e6\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e6\u02e7\7\"\2\2\u02e7"+
		"\u02e8\5\64\33\2\u02e8\u02e9\7P\2\2\u02e9C\3\2\2\2\u02ea\u02eb\5\u00ea"+
		"v\2\u02ebE\3\2\2\2\u02ec\u02f1\5H%\2\u02ed\u02f1\5J&\2\u02ee\u02f1\5L"+
		"\'\2\u02ef\u02f1\5N(\2\u02f0\u02ec\3\2\2\2\u02f0\u02ed\3\2\2\2\u02f0\u02ee"+
		"\3\2\2\2\u02f0\u02ef\3\2\2\2\u02f1G\3\2\2\2\u02f2\u02f3\7\33\2\2\u02f3"+
		"\u02f4\5\66\34\2\u02f4\u02f5\7P\2\2\u02f5I\3\2\2\2\u02f6\u02f7\7\33\2"+
		"\2\u02f7\u02f8\58\35\2\u02f8\u02f9\7R\2\2\u02f9\u02fa\7d\2\2\u02fa\u02fb"+
		"\7P\2\2\u02fbK\3\2\2\2\u02fc\u02fd\7\33\2\2\u02fd\u02fe\7(\2\2\u02fe\u02ff"+
		"\5\66\34\2\u02ff\u0300\7R\2\2\u0300\u0301\7w\2\2\u0301\u0302\7P\2\2\u0302"+
		"M\3\2\2\2\u0303\u0304\7\33\2\2\u0304\u0305\7(\2\2\u0305\u0306\5\66\34"+
		"\2\u0306\u0307\7R\2\2\u0307\u0308\7d\2\2\u0308\u0309\7P\2\2\u0309O\3\2"+
		"\2\2\u030a\u030e\5R*\2\u030b\u030e\5\u00c8e\2\u030c\u030e\7P\2\2\u030d"+
		"\u030a\3\2\2\2\u030d\u030b\3\2\2\2\u030d\u030c\3\2\2\2\u030eQ\3\2\2\2"+
		"\u030f\u0312\5T+\2\u0310\u0312\5\u00bc_\2\u0311\u030f\3\2\2\2\u0311\u0310"+
		"\3\2\2\2\u0312S\3\2\2\2\u0313\u0315\5X-\2\u0314\u0313\3\2\2\2\u0315\u0318"+
		"\3\2\2\2\u0316\u0314\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0319\3\2\2\2\u0318"+
		"\u0316\3\2\2\2\u0319\u031a\5V,\2\u031a\u031c\7w\2\2\u031b\u031d\5Z.\2"+
		"\u031c\u031b\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u031f\3\2\2\2\u031e\u0320"+
		"\5^\60\2\u031f\u031e\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0322\3\2\2\2\u0321"+
		"\u0323\5`\61\2\u0322\u0321\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0324\3\2"+
		"\2\2\u0324\u0325\5d\63\2\u0325U\3\2\2\2\u0326\u0327\t\5\2\2\u0327W\3\2"+
		"\2\2\u0328\u0331\5\u00eav\2\u0329\u0331\7%\2\2\u032a\u0331\7$\2\2\u032b"+
		"\u0331\7#\2\2\u032c\u0331\7\3\2\2\u032d\u0331\7(\2\2\u032e\u0331\7\24"+
		"\2\2\u032f\u0331\7)\2\2\u0330\u0328\3\2\2\2\u0330\u0329\3\2\2\2\u0330"+
		"\u032a\3\2\2\2\u0330\u032b\3\2\2\2\u0330\u032c\3\2\2\2\u0330\u032d\3\2"+
		"\2\2\u0330\u032e\3\2\2\2\u0330\u032f\3\2\2\2\u0331Y\3\2\2\2\u0332\u0333"+
		"\7U\2\2\u0333\u0334\5\\/\2\u0334\u0335\7T\2\2\u0335[\3\2\2\2\u0336\u033b"+
		"\5\"\22\2\u0337\u0338\7Q\2\2\u0338\u033a\5\"\22\2\u0339\u0337\3\2\2\2"+
		"\u033a\u033d\3\2\2\2\u033b\u0339\3\2\2\2\u033b\u033c\3\2\2\2\u033c]\3"+
		"\2\2\2\u033d\u033b\3\2\2\2\u033e\u033f\79\2\2\u033f\u0340\5\20\t\2\u0340"+
		"_\3\2\2\2\u0341\u0342\7:\2\2\u0342\u0343\5b\62\2\u0343a\3\2\2\2\u0344"+
		"\u0349\5\26\f\2\u0345\u0346\7Q\2\2\u0346\u0348\5\26\f\2\u0347\u0345\3"+
		"\2\2\2\u0348\u034b\3\2\2\2\u0349\u0347\3\2\2\2\u0349\u034a\3\2\2\2\u034a"+
		"c\3\2\2\2\u034b\u0349\3\2\2\2\u034c\u0350\7L\2\2\u034d\u034f\5f\64\2\u034e"+
		"\u034d\3\2\2\2\u034f\u0352\3\2\2\2\u0350\u034e\3\2\2\2\u0350\u0351\3\2"+
		"\2\2\u0351\u0353\3\2\2\2\u0352\u0350\3\2\2\2\u0353\u0354\7M\2\2\u0354"+
		"e\3\2\2\2\u0355\u035a\5h\65\2\u0356\u035a\5\u00acW\2\u0357\u035a\5\u00ae"+
		"X\2\u0358\u035a\5\u00b0Y\2\u0359\u0355\3\2\2\2\u0359\u0356\3\2\2\2\u0359"+
		"\u0357\3\2\2\2\u0359\u0358\3\2\2\2\u035ag\3\2\2\2\u035b\u0361\5j\66\2"+
		"\u035c\u0361\5\u008eH\2\u035d\u0361\5R*\2\u035e\u0361\5\u00c8e\2\u035f"+
		"\u0361\7P\2\2\u0360\u035b\3\2\2\2\u0360\u035c\3\2\2\2\u0360\u035d\3\2"+
		"\2\2\u0360\u035e\3\2\2\2\u0360\u035f\3\2\2\2\u0361i\3\2\2\2\u0362\u0364"+
		"\5l\67\2\u0363\u0362\3\2\2\2\u0364\u0367\3\2\2\2\u0365\u0363\3\2\2\2\u0365"+
		"\u0366\3\2\2\2\u0366\u0368\3\2\2\2\u0367\u0365\3\2\2\2\u0368\u0369\5v"+
		"<\2\u0369\u036a\5n8\2\u036a\u036b\7P\2\2\u036bk\3\2\2\2\u036c\u0378\5"+
		"\u00eav\2\u036d\u0378\7%\2\2\u036e\u0378\7$\2\2\u036f\u0378\7#\2\2\u0370"+
		"\u0378\7(\2\2\u0371\u0378\7\24\2\2\u0372\u0378\7\60\2\2\u0373\u0378\7"+
		"\63\2\2\u0374\u0378\7=\2\2\u0375\u0378\7B\2\2\u0376\u0378\7C\2\2\u0377"+
		"\u036c\3\2\2\2\u0377\u036d\3\2\2\2\u0377\u036e\3\2\2\2\u0377\u036f\3\2"+
		"\2\2\u0377\u0370\3\2\2\2\u0377\u0371\3\2\2\2\u0377\u0372\3\2\2\2\u0377"+
		"\u0373\3\2\2\2\u0377\u0374\3\2\2\2\u0377\u0375\3\2\2\2\u0377\u0376\3\2"+
		"\2\2\u0378m\3\2\2\2\u0379\u037e\5p9\2\u037a\u037b\7Q\2\2\u037b\u037d\5"+
		"p9\2\u037c\u037a\3\2\2\2\u037d\u0380\3\2\2\2\u037e\u037c\3\2\2\2\u037e"+
		"\u037f\3\2\2\2\u037fo\3\2\2\2\u0380\u037e\3\2\2\2\u0381\u0384\5r:\2\u0382"+
		"\u0383\7S\2\2\u0383\u0385\5t;\2\u0384\u0382\3\2\2\2\u0384\u0385\3\2\2"+
		"\2\u0385q\3\2\2\2\u0386\u0388\7w\2\2\u0387\u0389\5 \21\2\u0388\u0387\3"+
		"\2\2\2\u0388\u0389\3\2\2\2\u0389s\3\2\2\2\u038a\u038d\5\u01a2\u00d2\2"+
		"\u038b\u038d\5\u00fc\177\2\u038c\u038a\3\2\2\2\u038c\u038b\3\2\2\2\u038d"+
		"u\3\2\2\2\u038e\u0391\5x=\2\u038f\u0391\5z>\2\u0390\u038e\3\2\2\2\u0390"+
		"\u038f\3\2\2\2\u0391w\3\2\2\2\u0392\u0395\5\6\4\2\u0393\u0395\7\5\2\2"+
		"\u0394\u0392\3\2\2\2\u0394\u0393\3\2\2\2\u0395y\3\2\2\2\u0396\u039a\5"+
		"|?\2\u0397\u039a\5\u008aF\2\u0398\u039a\5\u008cG\2\u0399\u0396\3\2\2\2"+
		"\u0399\u0397\3\2\2\2\u0399\u0398\3\2\2\2\u039a{\3\2\2\2\u039b\u039e\5"+
		"\u0082B\2\u039c\u039e\5\u0088E\2\u039d\u039b\3\2\2\2\u039d\u039c\3\2\2"+
		"\2\u039e\u03a3\3\2\2\2\u039f\u03a2\5\u0080A\2\u03a0\u03a2\5\u0086D\2\u03a1"+
		"\u039f\3\2\2\2\u03a1\u03a0\3\2\2\2\u03a2\u03a5\3\2\2\2\u03a3\u03a1\3\2"+
		"\2\2\u03a3\u03a4\3\2\2\2\u03a4}\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a6\u03a8"+
		"\7w\2\2\u03a7\u03a9\5*\26\2\u03a8\u03a7\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9"+
		"\u03b7\3\2\2\2\u03aa\u03ab\5|?\2\u03ab\u03af\7R\2\2\u03ac\u03ae\5\u00ea"+
		"v\2\u03ad\u03ac\3\2\2\2\u03ae\u03b1\3\2\2\2\u03af\u03ad\3\2\2\2\u03af"+
		"\u03b0\3\2\2\2\u03b0\u03b2\3\2\2\2\u03b1\u03af\3\2\2\2\u03b2\u03b4\7w"+
		"\2\2\u03b3\u03b5\5*\26\2\u03b4\u03b3\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5"+
		"\u03b7\3\2\2\2\u03b6\u03a6\3\2\2\2\u03b6\u03aa\3\2\2\2\u03b7\177\3\2\2"+
		"\2\u03b8\u03bc\7R\2\2\u03b9\u03bb\5\u00eav\2\u03ba\u03b9\3\2\2\2\u03bb"+
		"\u03be\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03bf\3\2"+
		"\2\2\u03be\u03bc\3\2\2\2\u03bf\u03c1\7w\2\2\u03c0\u03c2\5*\26\2\u03c1"+
		"\u03c0\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u0081\3\2\2\2\u03c3\u03c5\7w"+
		"\2\2\u03c4\u03c6\5*\26\2\u03c5\u03c4\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6"+
		"\u0083\3\2\2\2\u03c7\u03c8\5~@\2\u03c8\u0085\3\2\2\2\u03c9\u03ca\5\u0080"+
		"A\2\u03ca\u0087\3\2\2\2\u03cb\u03cc\5\u0082B\2\u03cc\u0089\3\2\2\2\u03cd"+
		"\u03ce\7w\2\2\u03ce\u008b\3\2\2\2\u03cf\u03d0\5x=\2\u03d0\u03d1\5 \21"+
		"\2\u03d1\u03d9\3\2\2\2\u03d2\u03d3\5|?\2\u03d3\u03d4\5 \21\2\u03d4\u03d9"+
		"\3\2\2\2\u03d5\u03d6\5\u008aF\2\u03d6\u03d7\5 \21\2\u03d7\u03d9\3\2\2"+
		"\2\u03d8\u03cf\3\2\2\2\u03d8\u03d2\3\2\2\2\u03d8\u03d5\3\2\2\2\u03d9\u008d"+
		"\3\2\2\2\u03da\u03dc\5\u0090I\2\u03db\u03da\3\2\2\2\u03dc\u03df\3\2\2"+
		"\2\u03dd\u03db\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03e0\3\2\2\2\u03df\u03dd"+
		"\3\2\2\2\u03e0\u03e1\5\u0092J\2\u03e1\u03e2\5\u00aaV\2\u03e2\u008f\3\2"+
		"\2\2\u03e3\u03f2\5\u00eav\2\u03e4\u03f2\7%\2\2\u03e5\u03f2\7$\2\2\u03e6"+
		"\u03f2\7#\2\2\u03e7\u03f2\7\3\2\2\u03e8\u03f2\7(\2\2\u03e9\u03f2\7\24"+
		"\2\2\u03ea\u03f2\7,\2\2\u03eb\u03f2\7 \2\2\u03ec\u03f2\7)\2\2\u03ed\u03f2"+
		"\7>\2\2\u03ee\u03f2\7?\2\2\u03ef\u03f2\7@\2\2\u03f0\u03f2\7A\2\2\u03f1"+
		"\u03e3\3\2\2\2\u03f1\u03e4\3\2\2\2\u03f1\u03e5\3\2\2\2\u03f1\u03e6\3\2"+
		"\2\2\u03f1\u03e7\3\2\2\2\u03f1\u03e8\3\2\2\2\u03f1\u03e9\3\2\2\2\u03f1"+
		"\u03ea\3\2\2\2\u03f1\u03eb\3\2\2\2\u03f1\u03ec\3\2\2\2\u03f1\u03ed\3\2"+
		"\2\2\u03f1\u03ee\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f1\u03f0\3\2\2\2\u03f2"+
		"\u0091\3\2\2\2\u03f3\u03f4\5\u0094K\2\u03f4\u03f6\5\u0096L\2\u03f5\u03f7"+
		"\5\u00a4S\2\u03f6\u03f5\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u0405\3\2\2"+
		"\2\u03f8\u03fc\5Z.\2\u03f9\u03fb\5\u00eav\2\u03fa\u03f9\3\2\2\2\u03fb"+
		"\u03fe\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u03ff\3\2"+
		"\2\2\u03fe\u03fc\3\2\2\2\u03ff\u0400\5\u0094K\2\u0400\u0402\5\u0096L\2"+
		"\u0401\u0403\5\u00a4S\2\u0402\u0401\3\2\2\2\u0402\u0403\3\2\2\2\u0403"+
		"\u0405\3\2\2\2\u0404\u03f3\3\2\2\2\u0404\u03f8\3\2\2\2\u0405\u0093\3\2"+
		"\2\2\u0406\u0409\5v<\2\u0407\u0409\7\62\2\2\u0408\u0406\3\2\2\2\u0408"+
		"\u0407\3\2\2\2\u0409\u0095\3\2\2\2\u040a\u040b\7w\2\2\u040b\u040d\7J\2"+
		"\2\u040c\u040e\5\u0098M\2\u040d\u040c\3\2\2\2\u040d\u040e\3\2\2\2\u040e"+
		"\u040f\3\2\2\2\u040f\u0411\7K\2\2\u0410\u0412\5 \21\2\u0411\u0410\3\2"+
		"\2\2\u0411\u0412\3\2\2\2\u0412\u0097\3\2\2\2\u0413\u041a\5\u00a2R\2\u0414"+
		"\u0415\5\u009aN\2\u0415\u0416\7Q\2\2\u0416\u0417\5\u00a0Q\2\u0417\u041a"+
		"\3\2\2\2\u0418\u041a\5\u00a0Q\2\u0419\u0413\3\2\2\2\u0419\u0414\3\2\2"+
		"\2\u0419\u0418\3\2\2\2\u041a\u0099\3\2\2\2\u041b\u0420\5\u009cO\2\u041c"+
		"\u041d\7Q\2\2\u041d\u041f\5\u009cO\2\u041e\u041c\3\2\2\2\u041f\u0422\3"+
		"\2\2\2\u0420\u041e\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u042c\3\2\2\2\u0422"+
		"\u0420\3\2\2\2\u0423\u0428\5\u00a2R\2\u0424\u0425\7Q\2\2\u0425\u0427\5"+
		"\u009cO\2\u0426\u0424\3\2\2\2\u0427\u042a\3\2\2\2\u0428\u0426\3\2\2\2"+
		"\u0428\u0429\3\2\2\2\u0429\u042c\3\2\2\2\u042a\u0428\3\2\2\2\u042b\u041b"+
		"\3\2\2\2\u042b\u0423\3\2\2\2\u042c\u009b\3\2\2\2\u042d\u042f\5\u009eP"+
		"\2\u042e\u042d\3\2\2\2\u042f\u0432\3\2\2\2\u0430\u042e\3\2\2\2\u0430\u0431"+
		"\3\2\2\2\u0431\u0433\3\2\2\2\u0432\u0430\3\2\2\2\u0433\u0434\5v<\2\u0434"+
		"\u0435\5r:\2\u0435\u009d\3\2\2\2\u0436\u043a\5\u00eav\2\u0437\u043a\7"+
		"\24\2\2\u0438\u043a\7=\2\2\u0439\u0436\3\2\2\2\u0439\u0437\3\2\2\2\u0439"+
		"\u0438\3\2\2\2\u043a\u009f\3\2\2\2\u043b\u043d\5\u009eP\2\u043c\u043b"+
		"\3\2\2\2\u043d\u0440\3\2\2\2\u043e\u043c\3\2\2\2\u043e\u043f\3\2\2\2\u043f"+
		"\u0441\3\2\2\2\u0440\u043e\3\2\2\2\u0441\u0445\5v<\2\u0442\u0444\5\u00ea"+
		"v\2\u0443\u0442\3\2\2\2\u0444\u0447\3\2\2\2\u0445\u0443\3\2\2\2\u0445"+
		"\u0446\3\2\2\2\u0446\u0448\3\2\2\2\u0447\u0445\3\2\2\2\u0448\u0449\7y"+
		"\2\2\u0449\u044a\5r:\2\u044a\u044d\3\2\2\2\u044b\u044d\5\u009cO\2\u044c"+
		"\u043e\3\2\2\2\u044c\u044b\3\2\2\2\u044d\u00a1\3\2\2\2\u044e\u0450\5\u00ea"+
		"v\2\u044f\u044e\3\2\2\2\u0450\u0453\3\2\2\2\u0451\u044f\3\2\2\2\u0451"+
		"\u0452\3\2\2\2\u0452\u0454\3\2\2\2\u0453\u0451\3\2\2\2\u0454\u0457\5v"+
		"<\2\u0455\u0456\7w\2\2\u0456\u0458\7R\2\2\u0457\u0455\3\2\2\2\u0457\u0458"+
		"\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u045a\7-\2\2\u045a\u00a3\3\2\2\2\u045b"+
		"\u045c\7/\2\2\u045c\u045d\5\u00a6T\2\u045d\u00a5\3\2\2\2\u045e\u0463\5"+
		"\u00a8U\2\u045f\u0460\7Q\2\2\u0460\u0462\5\u00a8U\2\u0461\u045f\3\2\2"+
		"\2\u0462\u0465\3\2\2\2\u0463\u0461\3\2\2\2\u0463\u0464\3\2\2\2\u0464\u00a7"+
		"\3\2\2\2\u0465\u0463\3\2\2\2\u0466\u0469\5\20\t\2\u0467\u0469\5\34\17"+
		"\2\u0468\u0466\3\2\2\2\u0468\u0467\3\2\2\2\u0469\u00a9\3\2\2\2\u046a\u046d"+
		"\5\u0100\u0081\2\u046b\u046d\7P\2\2\u046c\u046a\3\2\2\2\u046c\u046b\3"+
		"\2\2\2\u046d\u00ab\3\2\2\2\u046e\u046f\5\u0100\u0081\2\u046f\u00ad\3\2"+
		"\2\2\u0470\u0471\7(\2\2\u0471\u0472\5\u0100\u0081\2\u0472\u00af\3\2\2"+
		"\2\u0473\u0475\5\u00b2Z\2\u0474\u0473\3\2\2\2\u0475\u0478\3\2\2\2\u0476"+
		"\u0474\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u0479\3\2\2\2\u0478\u0476\3\2"+
		"\2\2\u0479\u047b\5\u00b4[\2\u047a\u047c\5\u00a4S\2\u047b\u047a\3\2\2\2"+
		"\u047b\u047c\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u047e\5\u00b8]\2\u047e"+
		"\u00b1\3\2\2\2\u047f\u0484\5\u00eav\2\u0480\u0484\7%\2\2\u0481\u0484\7"+
		"$\2\2\u0482\u0484\7#\2\2\u0483\u047f\3\2\2\2\u0483\u0480\3\2\2\2\u0483"+
		"\u0481\3\2\2\2\u0483\u0482\3\2\2\2\u0484\u00b3\3\2\2\2\u0485\u0487\5Z"+
		".\2\u0486\u0485\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0488\3\2\2\2\u0488"+
		"\u0489\5\u00b6\\\2\u0489\u048b\7J\2\2\u048a\u048c\5\u0098M\2\u048b\u048a"+
		"\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u048e\7K\2\2\u048e"+
		"\u00b5\3\2\2\2\u048f\u0490\7w\2\2\u0490\u00b7\3\2\2\2\u0491\u0493\7L\2"+
		"\2\u0492\u0494\5\u00ba^\2\u0493\u0492\3\2\2\2\u0493\u0494\3\2\2\2\u0494"+
		"\u0496\3\2\2\2\u0495\u0497\5\u0102\u0082\2\u0496\u0495\3\2\2\2\u0496\u0497"+
		"\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u0499\7M\2\2\u0499\u00b9\3\2\2\2\u049a"+
		"\u049c\5*\26\2\u049b\u049a\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u049d\3\2"+
		"\2\2\u049d\u049e\7-\2\2\u049e\u04a0\7J\2\2\u049f\u04a1\5\u0192\u00ca\2"+
		"\u04a0\u049f\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a3"+
		"\7K\2\2\u04a3\u04c9\7P\2\2\u04a4\u04a6\5*\26\2\u04a5\u04a4\3\2\2\2\u04a5"+
		"\u04a6\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7\u04a8\7*\2\2\u04a8\u04aa\7J\2"+
		"\2\u04a9\u04ab\5\u0192\u00ca\2\u04aa\u04a9\3\2\2\2\u04aa\u04ab\3\2\2\2"+
		"\u04ab\u04ac\3\2\2\2\u04ac\u04ad\7K\2\2\u04ad\u04c9\7P\2\2\u04ae\u04af"+
		"\5:\36\2\u04af\u04b1\7R\2\2\u04b0\u04b2\5*\26\2\u04b1\u04b0\3\2\2\2\u04b1"+
		"\u04b2\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b4\7*\2\2\u04b4\u04b6\7J\2"+
		"\2\u04b5\u04b7\5\u0192\u00ca\2\u04b6\u04b5\3\2\2\2\u04b6\u04b7\3\2\2\2"+
		"\u04b7\u04b8\3\2\2\2\u04b8\u04b9\7K\2\2\u04b9\u04ba\7P\2\2\u04ba\u04c9"+
		"\3\2\2\2\u04bb\u04bc\5\u0164\u00b3\2\u04bc\u04be\7R\2\2\u04bd\u04bf\5"+
		"*\26\2\u04be\u04bd\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0"+
		"\u04c1\7*\2\2\u04c1\u04c3\7J\2\2\u04c2\u04c4\5\u0192\u00ca\2\u04c3\u04c2"+
		"\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04c6\7K\2\2\u04c6"+
		"\u04c7\7P\2\2\u04c7\u04c9\3\2\2\2\u04c8\u049b\3\2\2\2\u04c8\u04a5\3\2"+
		"\2\2\u04c8\u04ae\3\2\2\2\u04c8\u04bb\3\2\2\2\u04c9\u00bb\3\2\2\2\u04ca"+
		"\u04cc\5X-\2\u04cb\u04ca\3\2\2\2\u04cc\u04cf\3\2\2\2\u04cd\u04cb\3\2\2"+
		"\2\u04cd\u04ce\3\2\2\2\u04ce\u04d0\3\2\2\2\u04cf\u04cd\3\2\2\2\u04d0\u04d1"+
		"\7\22\2\2\u04d1\u04d3\7w\2\2\u04d2\u04d4\5`\61\2\u04d3\u04d2\3\2\2\2\u04d3"+
		"\u04d4\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d6\5\u00be`\2\u04d6\u00bd"+
		"\3\2\2\2\u04d7\u04d9\7L\2\2\u04d8\u04da\5\u00c0a\2\u04d9\u04d8\3\2\2\2"+
		"\u04d9\u04da\3\2\2\2\u04da\u04dc\3\2\2\2\u04db\u04dd\7Q\2\2\u04dc\u04db"+
		"\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04df\3\2\2\2\u04de\u04e0\5\u00c6d"+
		"\2\u04df\u04de\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e2"+
		"\7M\2\2\u04e2\u00bf\3\2\2\2\u04e3\u04e8\5\u00c2b\2\u04e4\u04e5\7Q\2\2"+
		"\u04e5\u04e7\5\u00c2b\2\u04e6\u04e4\3\2\2\2\u04e7\u04ea\3\2\2\2\u04e8"+
		"\u04e6\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u00c1\3\2\2\2\u04ea\u04e8\3\2"+
		"\2\2\u04eb\u04ed\5\u00c4c\2\u04ec\u04eb\3\2\2\2\u04ed\u04f0\3\2\2\2\u04ee"+
		"\u04ec\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f1\3\2\2\2\u04f0\u04ee\3\2"+
		"\2\2\u04f1\u04f7\7w\2\2\u04f2\u04f4\7J\2\2\u04f3\u04f5\5\u0192\u00ca\2"+
		"\u04f4\u04f3\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04f8"+
		"\7K\2\2\u04f7\u04f2\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04fa\3\2\2\2\u04f9"+
		"\u04fb\5d\63\2\u04fa\u04f9\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u00c3\3\2"+
		"\2\2\u04fc\u04fd\5\u00eav\2\u04fd\u00c5\3\2\2\2\u04fe\u0502\7P\2\2\u04ff"+
		"\u0501\5f\64\2\u0500\u04ff\3\2\2\2\u0501\u0504\3\2\2\2\u0502\u0500\3\2"+
		"\2\2\u0502\u0503\3\2\2\2\u0503\u00c7\3\2\2\2\u0504\u0502\3\2\2\2\u0505"+
		"\u0508\5\u00caf\2\u0506\u0508\5\u00dep\2\u0507\u0505\3\2\2\2\u0507\u0506"+
		"\3\2\2\2\u0508\u00c9\3\2\2\2\u0509\u050b\5\u00ceh\2\u050a\u0509\3\2\2"+
		"\2\u050b\u050e\3\2\2\2\u050c\u050a\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u050f"+
		"\3\2\2\2\u050e\u050c\3\2\2\2\u050f\u0510\5\u00ccg\2\u0510\u0512\7w\2\2"+
		"\u0511\u0513\5Z.\2\u0512\u0511\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0515"+
		"\3\2\2\2\u0514\u0516\5\u00d0i\2\u0515\u0514\3\2\2\2\u0515\u0516\3\2\2"+
		"\2\u0516\u0517\3\2\2\2\u0517\u0518\5\u00d2j\2\u0518\u00cb\3\2\2\2\u0519"+
		"\u051a\t\6\2\2\u051a\u00cd\3\2\2\2\u051b\u0523\5\u00eav\2\u051c\u0523"+
		"\7%\2\2\u051d\u0523\7$\2\2\u051e\u0523\7#\2\2\u051f\u0523\7\3\2\2\u0520"+
		"\u0523\7(\2\2\u0521\u0523\7)\2\2\u0522\u051b\3\2\2\2\u0522\u051c\3\2\2"+
		"\2\u0522\u051d\3\2\2\2\u0522\u051e\3\2\2\2\u0522\u051f\3\2\2\2\u0522\u0520"+
		"\3\2\2\2\u0522\u0521\3\2\2\2\u0523\u00cf\3\2\2\2\u0524\u0525\7\23\2\2"+
		"\u0525\u0526\5b\62\2\u0526\u00d1\3\2\2\2\u0527\u052b\7L\2\2\u0528\u052a"+
		"\5\u00d4k\2\u0529\u0528\3\2\2\2\u052a\u052d\3\2\2\2\u052b\u0529\3\2\2"+
		"\2\u052b\u052c\3\2\2\2\u052c\u052e\3\2\2\2\u052d\u052b\3\2\2\2\u052e\u052f"+
		"\7M\2\2\u052f\u00d3\3\2\2\2\u0530\u0536\5\u00d6l\2\u0531\u0536\5\u00da"+
		"n\2\u0532\u0536\5R*\2\u0533\u0536\5\u00c8e\2\u0534\u0536\7P\2\2\u0535"+
		"\u0530\3\2\2\2\u0535\u0531\3\2\2\2\u0535\u0532\3\2\2\2\u0535\u0533\3\2"+
		"\2\2\u0535\u0534\3\2\2\2\u0536\u00d5\3\2\2\2\u0537\u0539\5\u00d8m\2\u0538"+
		"\u0537\3\2\2\2\u0539\u053c\3\2\2\2\u053a\u0538\3\2\2\2\u053a\u053b\3\2"+
		"\2\2\u053b\u053d\3\2\2\2\u053c\u053a\3\2\2\2\u053d\u053e\5v<\2\u053e\u053f"+
		"\5n8\2\u053f\u0540\7P\2\2\u0540\u00d7\3\2\2\2\u0541\u0546\5\u00eav\2\u0542"+
		"\u0546\7%\2\2\u0543\u0546\7(\2\2\u0544\u0546\7\24\2\2\u0545\u0541\3\2"+
		"\2\2\u0545\u0542\3\2\2\2\u0545\u0543\3\2\2\2\u0545\u0544\3\2\2\2\u0546"+
		"\u00d9\3\2\2\2\u0547\u0549\5\u00dco\2\u0548\u0547\3\2\2\2\u0549\u054c"+
		"\3\2\2\2\u054a\u0548\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u054d\3\2\2\2\u054c"+
		"\u054a\3\2\2\2\u054d\u054e\5\u0092J\2\u054e\u054f\5\u00aaV\2\u054f\u00db"+
		"\3\2\2\2\u0550\u0557\5\u00eav\2\u0551\u0557\7%\2\2\u0552\u0557\7\3\2\2"+
		"\u0553\u0557\7\16\2\2\u0554\u0557\7(\2\2\u0555\u0557\7)\2\2\u0556\u0550"+
		"\3\2\2\2\u0556\u0551\3\2\2\2\u0556\u0552\3\2\2\2\u0556\u0553\3\2\2\2\u0556"+
		"\u0554\3\2\2\2\u0556\u0555\3\2\2\2\u0557\u00dd\3\2\2\2\u0558\u055a\5\u00ce"+
		"h\2\u0559\u0558\3\2\2\2\u055a\u055d\3\2\2\2\u055b\u0559\3\2\2\2\u055b"+
		"\u055c\3\2\2\2\u055c\u055e\3\2\2\2\u055d\u055b\3\2\2\2\u055e\u055f\7x"+
		"\2\2\u055f\u0560\7\36\2\2\u0560\u0561\7w\2\2\u0561\u0562\5\u00e0q\2\u0562"+
		"\u00df\3\2\2\2\u0563\u0567\7L\2\2\u0564\u0566\5\u00e2r\2\u0565\u0564\3"+
		"\2\2\2\u0566\u0569\3\2\2\2\u0567\u0565\3\2\2\2\u0567\u0568\3\2\2\2\u0568"+
		"\u056a\3\2\2\2\u0569\u0567\3\2\2\2\u056a\u056b\7M\2\2\u056b\u00e1\3\2"+
		"\2\2\u056c\u0572\5\u00e4s\2\u056d\u0572\5\u00d6l\2\u056e\u0572\5R*\2\u056f"+
		"\u0572\5\u00c8e\2\u0570\u0572\7P\2\2\u0571\u056c\3\2\2\2\u0571\u056d\3"+
		"\2\2\2\u0571\u056e\3\2\2\2\u0571\u056f\3\2\2\2\u0571\u0570\3\2\2\2\u0572"+
		"\u00e3\3\2\2\2\u0573\u0575\5\u00e6t\2\u0574\u0573\3\2\2\2\u0575\u0578"+
		"\3\2\2\2\u0576\u0574\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u0579\3\2\2\2\u0578"+
		"\u0576\3\2\2\2\u0579\u057a\5v<\2\u057a\u057b\7w\2\2\u057b\u057c\7J\2\2"+
		"\u057c\u057e\7K\2\2\u057d\u057f\5 \21\2\u057e\u057d\3\2\2\2\u057e\u057f"+
		"\3\2\2\2\u057f\u0581\3\2\2\2\u0580\u0582\5\u00e8u\2\u0581\u0580\3\2\2"+
		"\2\u0581\u0582\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u0584\7P\2\2\u0584\u00e5"+
		"\3\2\2\2\u0585\u0589\5\u00eav\2\u0586\u0589\7%\2\2\u0587\u0589\7\3\2\2"+
		"\u0588\u0585\3\2\2\2\u0588\u0586\3\2\2\2\u0588\u0587\3\2\2\2\u0589\u00e7"+
		"\3\2\2\2\u058a\u058b\7\16\2\2\u058b\u058c\5\u00f2z\2\u058c\u00e9\3\2\2"+
		"\2\u058d\u0591\5\u00ecw\2\u058e\u0591\5\u00f8}\2\u058f\u0591\5\u00fa~"+
		"\2\u0590\u058d\3\2\2\2\u0590\u058e\3\2\2\2\u0590\u058f\3\2\2\2\u0591\u00eb"+
		"\3\2\2\2\u0592\u0593\7x\2\2\u0593\u0594\5\66\34\2\u0594\u0596\7J\2\2\u0595"+
		"\u0597\5\u00eex\2\u0596\u0595\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u0598"+
		"\3\2\2\2\u0598\u0599\7K\2\2\u0599\u00ed\3\2\2\2\u059a\u059f\5\u00f0y\2"+
		"\u059b\u059c\7Q\2\2\u059c\u059e\5\u00f0y\2\u059d\u059b\3\2\2\2\u059e\u05a1"+
		"\3\2\2\2\u059f\u059d\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u00ef\3\2\2\2\u05a1"+
		"\u059f\3\2\2\2\u05a2\u05a3\7w\2\2\u05a3\u05a4\7S\2\2\u05a4\u05a5\5\u00f2"+
		"z\2\u05a5\u00f1\3\2\2\2\u05a6\u05aa\5\u01b4\u00db\2\u05a7\u05aa\5\u00f4"+
		"{\2\u05a8\u05aa\5\u00eav\2\u05a9\u05a6\3\2\2\2\u05a9\u05a7\3\2\2\2\u05a9"+
		"\u05a8\3\2\2\2\u05aa\u00f3\3\2\2\2\u05ab\u05ad\7L\2\2\u05ac\u05ae\5\u00f6"+
		"|\2\u05ad\u05ac\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u05b0\3\2\2\2\u05af"+
		"\u05b1\7Q\2\2\u05b0\u05af\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1\u05b2\3\2"+
		"\2\2\u05b2\u05b3\7M\2\2\u05b3\u00f5\3\2\2\2\u05b4\u05b9\5\u00f2z\2\u05b5"+
		"\u05b6\7Q\2\2\u05b6\u05b8\5\u00f2z\2\u05b7\u05b5\3\2\2\2\u05b8\u05bb\3"+
		"\2\2\2\u05b9\u05b7\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u00f7\3\2\2\2\u05bb"+
		"\u05b9\3\2\2\2\u05bc\u05bd\7x\2\2\u05bd\u05be\5\66\34\2\u05be\u00f9\3"+
		"\2\2\2\u05bf\u05c0\7x\2\2\u05c0\u05c1\5\66\34\2\u05c1\u05c2\7J\2\2\u05c2"+
		"\u05c3\5\u00f2z\2\u05c3\u05c4\7K\2\2\u05c4\u00fb\3\2\2\2\u05c5\u05c7\7"+
		"L\2\2\u05c6\u05c8\5\u00fe\u0080\2\u05c7\u05c6\3\2\2\2\u05c7\u05c8\3\2"+
		"\2\2\u05c8\u05ca\3\2\2\2\u05c9\u05cb\7Q\2\2\u05ca\u05c9\3\2\2\2\u05ca"+
		"\u05cb\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05cd\7M\2\2\u05cd\u00fd\3\2"+
		"\2\2\u05ce\u05d3\5t;\2\u05cf\u05d0\7Q\2\2\u05d0\u05d2\5t;\2\u05d1\u05cf"+
		"\3\2\2\2\u05d2\u05d5\3\2\2\2\u05d3\u05d1\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4"+
		"\u00ff\3\2\2\2\u05d5\u05d3\3\2\2\2\u05d6\u05d8\7L\2\2\u05d7\u05d9\5\u0102"+
		"\u0082\2\u05d8\u05d7\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05da\3\2\2\2\u05da"+
		"\u05db\7M\2\2\u05db\u0101\3\2\2\2\u05dc\u05de\5\u0104\u0083\2\u05dd\u05dc"+
		"\3\2\2\2\u05de\u05df\3\2\2\2\u05df\u05dd\3\2\2\2\u05df\u05e0\3\2\2\2\u05e0"+
		"\u0103\3\2\2\2\u05e1\u05e5\5\u0106\u0084\2\u05e2\u05e5\5R*\2\u05e3\u05e5"+
		"\5\u010a\u0086\2\u05e4\u05e1\3\2\2\2\u05e4\u05e2\3\2\2\2\u05e4\u05e3\3"+
		"\2\2\2\u05e5\u0105\3\2\2\2\u05e6\u05e7\5\u0108\u0085\2\u05e7\u05e8\7P"+
		"\2\2\u05e8\u0107\3\2\2\2\u05e9\u05eb\5\u009eP\2\u05ea\u05e9\3\2\2\2\u05eb"+
		"\u05ee\3\2\2\2\u05ec\u05ea\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed\u05ef\3\2"+
		"\2\2\u05ee\u05ec\3\2\2\2\u05ef\u05f0\5v<\2\u05f0\u05f1\5n8\2\u05f1\u0109"+
		"\3\2\2\2\u05f2\u05f9\5\u010e\u0088\2\u05f3\u05f9\5\u0112\u008a\2\u05f4"+
		"\u05f9\5\u011a\u008e\2\u05f5\u05f9\5\u011c\u008f\2\u05f6\u05f9\5\u012e"+
		"\u0098\2\u05f7\u05f9\5\u0134\u009b\2\u05f8\u05f2\3\2\2\2\u05f8\u05f3\3"+
		"\2\2\2\u05f8\u05f4\3\2\2\2\u05f8\u05f5\3\2\2\2\u05f8\u05f6\3\2\2\2\u05f8"+
		"\u05f7\3\2\2\2\u05f9\u010b\3\2\2\2\u05fa\u0600\5\u010e\u0088\2\u05fb\u0600"+
		"\5\u0114\u008b\2\u05fc\u0600\5\u011e\u0090\2\u05fd\u0600\5\u0130\u0099"+
		"\2\u05fe\u0600\5\u0136\u009c\2\u05ff\u05fa\3\2\2\2\u05ff\u05fb\3\2\2\2"+
		"\u05ff\u05fc\3\2\2\2\u05ff\u05fd\3\2\2\2\u05ff\u05fe\3\2\2\2\u0600\u010d"+
		"\3\2\2\2\u0601\u060e\5\u0100\u0081\2\u0602\u060e\5\u0110\u0089\2\u0603"+
		"\u060e\5\u0116\u008c\2\u0604\u060e\5\u0120\u0091\2\u0605\u060e\5\u0122"+
		"\u0092\2\u0606\u060e\5\u0132\u009a\2\u0607\u060e\5\u0146\u00a4\2\u0608"+
		"\u060e\5\u0148\u00a5\2\u0609\u060e\5\u014a\u00a6\2\u060a\u060e\5\u014e"+
		"\u00a8\2\u060b\u060e\5\u014c\u00a7\2\u060c\u060e\5\u0150\u00a9\2\u060d"+
		"\u0601\3\2\2\2\u060d\u0602\3\2\2\2\u060d\u0603\3\2\2\2\u060d\u0604\3\2"+
		"\2\2\u060d\u0605\3\2\2\2\u060d\u0606\3\2\2\2\u060d\u0607\3\2\2\2\u060d"+
		"\u0608\3\2\2\2\u060d\u0609\3\2\2\2\u060d\u060a\3\2\2\2\u060d\u060b\3\2"+
		"\2\2\u060d\u060c\3\2\2\2\u060e\u010f\3\2\2\2\u060f\u0610\7P\2\2\u0610"+
		"\u0111\3\2\2\2\u0611\u0612\7w\2\2\u0612\u0613\7Y\2\2\u0613\u0614\5\u010a"+
		"\u0086\2\u0614\u0113\3\2\2\2\u0615\u0616\7w\2\2\u0616\u0617\7Y\2\2\u0617"+
		"\u0618\5\u010c\u0087\2\u0618\u0115\3\2\2\2\u0619\u061a\5\u0118\u008d\2"+
		"\u061a\u061b\7P\2\2\u061b\u0117\3\2\2\2\u061c\u0624\5\u01ae\u00d8\2\u061d"+
		"\u0624\5\u01cc\u00e7\2\u061e\u0624\5\u01ce\u00e8\2\u061f\u0624\5\u01d4"+
		"\u00eb\2\u0620\u0624\5\u01d8\u00ed\2\u0621\u0624\5\u018c\u00c7\2\u0622"+
		"\u0624\5\u0178\u00bd\2\u0623\u061c\3\2\2\2\u0623\u061d\3\2\2\2\u0623\u061e"+
		"\3\2\2\2\u0623\u061f\3\2\2\2\u0623\u0620\3\2\2\2\u0623\u0621\3\2\2\2\u0623"+
		"\u0622\3\2\2\2\u0624\u0119\3\2\2\2\u0625\u0626\7\30\2\2\u0626\u0627\7"+
		"J\2\2\u0627\u0628\5\u01a2\u00d2\2\u0628\u0629\7K\2\2\u0629\u062a\5\u010a"+
		"\u0086\2\u062a\u011b\3\2\2\2\u062b\u062c\7\30\2\2\u062c\u062d\7J\2\2\u062d"+
		"\u062e\5\u01a2\u00d2\2\u062e\u062f\7K\2\2\u062f\u0630\5\u010c\u0087\2"+
		"\u0630\u0631\7\21\2\2\u0631\u0632\5\u010a\u0086\2\u0632\u011d\3\2\2\2"+
		"\u0633\u0634\7\30\2\2\u0634\u0635\7J\2\2\u0635\u0636\5\u01a2\u00d2\2\u0636"+
		"\u0637\7K\2\2\u0637\u0638\5\u010c\u0087\2\u0638\u0639\7\21\2\2\u0639\u063a"+
		"\5\u010c\u0087\2\u063a\u011f\3\2\2\2\u063b\u063c\7\4\2\2\u063c\u063d\5"+
		"\u01a2\u00d2\2\u063d\u063e\7P\2\2\u063e\u0646\3\2\2\2\u063f\u0640\7\4"+
		"\2\2\u0640\u0641\5\u01a2\u00d2\2\u0641\u0642\7Y\2\2\u0642\u0643\5\u01a2"+
		"\u00d2\2\u0643\u0644\7P\2\2\u0644\u0646\3\2\2\2\u0645\u063b\3\2\2\2\u0645"+
		"\u063f\3\2\2\2\u0646\u0121\3\2\2\2\u0647\u0648\7+\2\2\u0648\u0649\7J\2"+
		"\2\u0649\u064a\5\u01a2\u00d2\2\u064a\u064b\7K\2\2\u064b\u064c\5\u0124"+
		"\u0093\2\u064c\u0123\3\2\2\2\u064d\u0651\7L\2\2\u064e\u0650\5\u0126\u0094"+
		"\2\u064f\u064e\3\2\2\2\u0650\u0653\3\2\2\2\u0651\u064f\3\2\2\2\u0651\u0652"+
		"\3\2\2\2\u0652\u0657\3\2\2\2\u0653\u0651\3\2\2\2\u0654\u0656\5\u012a\u0096"+
		"\2\u0655\u0654\3\2\2\2\u0656\u0659\3\2\2\2\u0657\u0655\3\2\2\2\u0657\u0658"+
		"\3\2\2\2\u0658\u065a\3\2\2\2\u0659\u0657\3\2\2\2\u065a\u065b\7M\2\2\u065b"+
		"\u0125\3\2\2\2\u065c\u065d\5\u0128\u0095\2\u065d\u065e\5\u0102\u0082\2"+
		"\u065e\u0127\3\2\2\2\u065f\u0663\5\u012a\u0096\2\u0660\u0662\5\u012a\u0096"+
		"\2\u0661\u0660\3\2\2\2\u0662\u0665\3\2\2\2\u0663\u0661\3\2\2\2\u0663\u0664"+
		"\3\2\2\2\u0664\u0129\3\2\2\2\u0665\u0663\3\2\2\2\u0666\u0667\7\b\2\2\u0667"+
		"\u0668\5\u01a0\u00d1\2\u0668\u0669\7Y\2\2\u0669\u0671\3\2\2\2\u066a\u066b"+
		"\7\b\2\2\u066b\u066c\5\u012c\u0097\2\u066c\u066d\7Y\2\2\u066d\u0671\3"+
		"\2\2\2\u066e\u066f\7\16\2\2\u066f\u0671\7Y\2\2\u0670\u0666\3\2\2\2\u0670"+
		"\u066a\3\2\2\2\u0670\u066e\3\2\2\2\u0671\u012b\3\2\2\2\u0672\u0673\7w"+
		"\2\2\u0673\u012d\3\2\2\2\u0674\u0675\7\64\2\2\u0675\u0676\7J\2\2\u0676"+
		"\u0677\5\u01a2\u00d2\2\u0677\u0678\7K\2\2\u0678\u0679\5\u010a\u0086\2"+
		"\u0679\u012f\3\2\2\2\u067a\u067b\7\64\2\2\u067b\u067c\7J\2\2\u067c\u067d"+
		"\5\u01a2\u00d2\2\u067d\u067e\7K\2\2\u067e\u067f\5\u010c\u0087\2\u067f"+
		"\u0131\3\2\2\2\u0680\u0681\7\17\2\2\u0681\u0682\5\u010a\u0086\2\u0682"+
		"\u0683\7\64\2\2\u0683\u0684\7J\2\2\u0684\u0685\5\u01a2\u00d2\2\u0685\u0686"+
		"\7K\2\2\u0686\u0687\7P\2\2\u0687\u0133\3\2\2\2\u0688\u068b\5\u0138\u009d"+
		"\2\u0689\u068b\5\u0142\u00a2\2\u068a\u0688\3\2\2\2\u068a\u0689\3\2\2\2"+
		"\u068b\u0135\3\2\2\2\u068c\u068f\5\u013a\u009e\2\u068d\u068f\5\u0144\u00a3"+
		"\2\u068e\u068c\3\2\2\2\u068e\u068d\3\2\2\2\u068f\u0137\3\2\2\2\u0690\u0691"+
		"\7\27\2\2\u0691\u0693\7J\2\2\u0692\u0694\5\u013c\u009f\2\u0693\u0692\3"+
		"\2\2\2\u0693\u0694\3\2\2\2\u0694\u0695\3\2\2\2\u0695\u0697\7P\2\2\u0696"+
		"\u0698\5\u01a2\u00d2\2\u0697\u0696\3\2\2\2\u0697\u0698\3\2\2\2\u0698\u0699"+
		"\3\2\2\2\u0699\u069b\7P\2\2\u069a\u069c\5\u013e\u00a0\2\u069b\u069a\3"+
		"\2\2\2\u069b\u069c\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u069e\7K\2\2\u069e"+
		"\u069f\5\u010a\u0086\2\u069f\u0139\3\2\2\2\u06a0\u06a1\7\27\2\2\u06a1"+
		"\u06a3\7J\2\2\u06a2\u06a4\5\u013c\u009f\2\u06a3\u06a2\3\2\2\2\u06a3\u06a4"+
		"\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5\u06a7\7P\2\2\u06a6\u06a8\5\u01a2\u00d2"+
		"\2\u06a7\u06a6\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8\u06a9\3\2\2\2\u06a9\u06ab"+
		"\7P\2\2\u06aa\u06ac\5\u013e\u00a0\2\u06ab\u06aa\3\2\2\2\u06ab\u06ac\3"+
		"\2\2\2\u06ac\u06ad\3\2\2\2\u06ad\u06ae\7K\2\2\u06ae\u06af\5\u010c\u0087"+
		"\2\u06af\u013b\3\2\2\2\u06b0\u06b3\5\u0140\u00a1\2\u06b1\u06b3\5\u0108"+
		"\u0085\2\u06b2\u06b0\3\2\2\2\u06b2\u06b1\3\2\2\2\u06b3\u013d\3\2\2\2\u06b4"+
		"\u06b5\5\u0140\u00a1\2\u06b5\u013f\3\2\2\2\u06b6\u06bb\5\u0118\u008d\2"+
		"\u06b7\u06b8\7Q\2\2\u06b8\u06ba\5\u0118\u008d\2\u06b9\u06b7\3\2\2\2\u06ba"+
		"\u06bd\3\2\2\2\u06bb\u06b9\3\2\2\2\u06bb\u06bc\3\2\2\2\u06bc\u0141\3\2"+
		"\2\2\u06bd\u06bb\3\2\2\2\u06be\u06bf\7\27\2\2\u06bf\u06c3\7J\2\2\u06c0"+
		"\u06c2\5\u009eP\2\u06c1\u06c0\3\2\2\2\u06c2\u06c5\3\2\2\2\u06c3\u06c1"+
		"\3\2\2\2\u06c3\u06c4\3\2\2\2\u06c4\u06c6\3\2\2\2\u06c5\u06c3\3\2\2\2\u06c6"+
		"\u06c7\5v<\2\u06c7\u06c8\5r:\2\u06c8\u06c9\7Y\2\2\u06c9\u06ca\5\u01a2"+
		"\u00d2\2\u06ca\u06cb\7K\2\2\u06cb\u06cc\5\u010a\u0086\2\u06cc\u0143\3"+
		"\2\2\2\u06cd\u06ce\7\27\2\2\u06ce\u06d2\7J\2\2\u06cf\u06d1\5\u009eP\2"+
		"\u06d0\u06cf\3\2\2\2\u06d1\u06d4\3\2\2\2\u06d2\u06d0\3\2\2\2\u06d2\u06d3"+
		"\3\2\2\2\u06d3\u06d5\3\2\2\2\u06d4\u06d2\3\2\2\2\u06d5\u06d6\5v<\2\u06d6"+
		"\u06d7\5r:\2\u06d7\u06d8\7Y\2\2\u06d8\u06d9\5\u01a2\u00d2\2\u06d9\u06da"+
		"\7K\2\2\u06da\u06db\5\u010c\u0087\2\u06db\u0145\3\2\2\2\u06dc\u06de\7"+
		"\6\2\2\u06dd\u06df\7w\2\2\u06de\u06dd\3\2\2\2\u06de\u06df\3\2\2\2\u06df"+
		"\u06e0\3\2\2\2\u06e0\u06e1\7P\2\2\u06e1\u0147\3\2\2\2\u06e2\u06e4\7\r"+
		"\2\2\u06e3\u06e5\7w\2\2\u06e4\u06e3\3\2\2\2\u06e4\u06e5\3\2\2\2\u06e5"+
		"\u06e6\3\2\2\2\u06e6\u06e7\7P\2\2\u06e7\u0149\3\2\2\2\u06e8\u06ea\7&\2"+
		"\2\u06e9\u06eb\5\u01a2\u00d2\2\u06ea\u06e9\3\2\2\2\u06ea\u06eb\3\2\2\2"+
		"\u06eb\u06ec\3\2\2\2\u06ec\u06ed\7P\2\2\u06ed\u014b\3\2\2\2\u06ee\u06ef"+
		"\7.\2\2\u06ef\u06f0\5\u01a2\u00d2\2\u06f0\u06f1\7P\2\2\u06f1\u014d\3\2"+
		"\2\2\u06f2\u06f3\7,\2\2\u06f3\u06f4\7J\2\2\u06f4\u06f5\5\u01a2\u00d2\2"+
		"\u06f5\u06f6\7K\2\2\u06f6\u06f7\5\u0100\u0081\2\u06f7\u014f\3\2\2\2\u06f8"+
		"\u06f9\7\61\2\2\u06f9\u06fa\5\u0100\u0081\2\u06fa\u06fb\5\u0152\u00aa"+
		"\2\u06fb\u0705\3\2\2\2\u06fc\u06fd\7\61\2\2\u06fd\u06ff\5\u0100\u0081"+
		"\2\u06fe\u0700\5\u0152\u00aa\2\u06ff\u06fe\3\2\2\2\u06ff\u0700\3\2\2\2"+
		"\u0700\u0701\3\2\2\2\u0701\u0702\5\u015a\u00ae\2\u0702\u0705\3\2\2\2\u0703"+
		"\u0705\5\u015c\u00af\2\u0704\u06f8\3\2\2\2\u0704\u06fc\3\2\2\2\u0704\u0703"+
		"\3\2\2\2\u0705\u0151\3\2\2\2\u0706\u070a\5\u0154\u00ab\2\u0707\u0709\5"+
		"\u0154\u00ab\2\u0708\u0707\3\2\2\2\u0709\u070c\3\2\2\2\u070a\u0708\3\2"+
		"\2\2\u070a\u070b\3\2\2\2\u070b\u0153\3\2\2\2\u070c\u070a\3\2\2\2\u070d"+
		"\u070e\7\t\2\2\u070e\u070f\7J\2\2\u070f\u0710\5\u0156\u00ac\2\u0710\u0711"+
		"\7K\2\2\u0711\u0712\5\u0100\u0081\2\u0712\u0155\3\2\2\2\u0713\u0715\5"+
		"\u009eP\2\u0714\u0713\3\2\2\2\u0715\u0718\3\2\2\2\u0716\u0714\3\2\2\2"+
		"\u0716\u0717\3\2\2\2\u0717\u0719\3\2\2\2\u0718\u0716\3\2\2\2\u0719\u071a"+
		"\5\u0158\u00ad\2\u071a\u071b\5r:\2\u071b\u0157\3\2\2\2\u071c\u0721\5~"+
		"@\2\u071d\u071e\7g\2\2\u071e\u0720\5\20\t\2\u071f\u071d\3\2\2\2\u0720"+
		"\u0723\3\2\2\2\u0721\u071f\3\2\2\2\u0721\u0722\3\2\2\2\u0722\u0159\3\2"+
		"\2\2\u0723\u0721\3\2\2\2\u0724\u0725\7\25\2\2\u0725\u0726\5\u0100\u0081"+
		"\2\u0726\u015b\3\2\2\2\u0727\u0728\7\61\2\2\u0728\u0729\5\u015e\u00b0"+
		"\2\u0729\u072b\5\u0100\u0081\2\u072a\u072c\5\u0152\u00aa\2\u072b\u072a"+
		"\3\2\2\2\u072b\u072c\3\2\2\2\u072c\u072e\3\2\2\2\u072d\u072f\5\u015a\u00ae"+
		"\2\u072e\u072d\3\2\2\2\u072e\u072f\3\2\2\2\u072f\u015d\3\2\2\2\u0730\u0731"+
		"\7J\2\2\u0731\u0733\5\u0160\u00b1\2\u0732\u0734\7P\2\2\u0733\u0732\3\2"+
		"\2\2\u0733\u0734\3\2\2\2\u0734\u0735\3\2\2\2\u0735\u0736\7K\2\2\u0736"+
		"\u015f\3\2\2\2\u0737\u073c\5\u0162\u00b2\2\u0738\u0739\7P\2\2\u0739\u073b"+
		"\5\u0162\u00b2\2\u073a\u0738\3\2\2\2\u073b\u073e\3\2\2\2\u073c\u073a\3"+
		"\2\2\2\u073c\u073d\3\2\2\2\u073d\u0161\3\2\2\2\u073e\u073c\3\2\2\2\u073f"+
		"\u0741\5\u009eP\2\u0740\u073f\3\2\2\2\u0741\u0744\3\2\2\2\u0742\u0740"+
		"\3\2\2\2\u0742\u0743\3\2\2\2\u0743\u0745\3\2\2\2\u0744\u0742\3\2\2\2\u0745"+
		"\u0746\5v<\2\u0746\u0747\5r:\2\u0747\u0748\7S\2\2\u0748\u0749\5\u01a2"+
		"\u00d2\2\u0749\u0163\3\2\2\2\u074a\u074d\5\u0172\u00ba\2\u074b\u074d\5"+
		"\u019a\u00ce\2\u074c\u074a\3\2\2\2\u074c\u074b\3\2\2\2\u074d\u0751\3\2"+
		"\2\2\u074e\u0750\5\u016c\u00b7\2\u074f\u074e\3\2\2\2\u0750\u0753\3\2\2"+
		"\2\u0751\u074f\3\2\2\2\u0751\u0752\3\2\2\2\u0752\u0165\3\2\2\2\u0753\u0751"+
		"\3\2\2\2\u0754\u0772\5\2\2\2\u0755\u075a\5\66\34\2\u0756\u0757\7N\2\2"+
		"\u0757\u0759\7O\2\2\u0758\u0756\3\2\2\2\u0759\u075c\3\2\2\2\u075a\u0758"+
		"\3\2\2\2\u075a\u075b\3\2\2\2\u075b\u075d\3\2\2\2\u075c\u075a\3\2\2\2\u075d"+
		"\u075e\7R\2\2\u075e\u075f\7\13\2\2\u075f\u0772\3\2\2\2\u0760\u0761\7\62"+
		"\2\2\u0761\u0762\7R\2\2\u0762\u0772\7\13\2\2\u0763\u0772\7-\2\2\u0764"+
		"\u0765\5\66\34\2\u0765\u0766\7R\2\2\u0766\u0767\7-\2\2\u0767\u0772\3\2"+
		"\2\2\u0768\u0769\7J\2\2\u0769\u076a\5\u01a2\u00d2\2\u076a\u076b\7K\2\2"+
		"\u076b\u0772\3\2\2\2\u076c\u0772\5\u0178\u00bd\2\u076d\u0772\5\u0180\u00c1"+
		"\2\u076e\u0772\5\u0186\u00c4\2\u076f\u0772\5\u018c\u00c7\2\u0770\u0772"+
		"\5\u0194\u00cb\2\u0771\u0754\3\2\2\2\u0771\u0755\3\2\2\2\u0771\u0760\3"+
		"\2\2\2\u0771\u0763\3\2\2\2\u0771\u0764\3\2\2\2\u0771\u0768\3\2\2\2\u0771"+
		"\u076c\3\2\2\2\u0771\u076d\3\2\2\2\u0771\u076e\3\2\2\2\u0771\u076f\3\2"+
		"\2\2\u0771\u0770\3\2\2\2\u0772\u0167\3\2\2\2\u0773\u0774\3\2\2\2\u0774"+
		"\u0169\3\2\2\2\u0775\u0792\5\2\2\2\u0776\u077b\5\66\34\2\u0777\u0778\7"+
		"N\2\2\u0778\u077a\7O\2\2\u0779\u0777\3\2\2\2\u077a\u077d\3\2\2\2\u077b"+
		"\u0779\3\2\2\2\u077b\u077c\3\2\2\2\u077c\u077e\3\2\2\2\u077d\u077b\3\2"+
		"\2\2\u077e\u077f\7R\2\2\u077f\u0780\7\13\2\2\u0780\u0792\3\2\2\2\u0781"+
		"\u0782\7\62\2\2\u0782\u0783\7R\2\2\u0783\u0792\7\13\2\2\u0784\u0792\7"+
		"-\2\2\u0785\u0786\5\66\34\2\u0786\u0787\7R\2\2\u0787\u0788\7-\2\2\u0788"+
		"\u0792\3\2\2\2\u0789\u078a\7J\2\2\u078a\u078b\5\u01a2\u00d2\2\u078b\u078c"+
		"\7K\2\2\u078c\u0792\3\2\2\2\u078d\u0792\5\u0178\u00bd\2\u078e\u0792\5"+
		"\u0180\u00c1\2\u078f\u0792\5\u018c\u00c7\2\u0790\u0792\5\u0194\u00cb\2"+
		"\u0791\u0775\3\2\2\2\u0791\u0776\3\2\2\2\u0791\u0781\3\2\2\2\u0791\u0784"+
		"\3\2\2\2\u0791\u0785\3\2\2\2\u0791\u0789\3\2\2\2\u0791\u078d\3\2\2\2\u0791"+
		"\u078e\3\2\2\2\u0791\u078f\3\2\2\2\u0791\u0790\3\2\2\2\u0792\u016b\3\2"+
		"\2\2\u0793\u0799\5\u017a\u00be\2\u0794\u0799\5\u0182\u00c2\2\u0795\u0799"+
		"\5\u0188\u00c5\2\u0796\u0799\5\u018e\u00c8\2\u0797\u0799\5\u0196\u00cc"+
		"\2\u0798\u0793\3\2\2\2\u0798\u0794\3\2\2\2\u0798\u0795\3\2\2\2\u0798\u0796"+
		"\3\2\2\2\u0798\u0797\3\2\2\2\u0799\u016d\3\2\2\2\u079a\u079b\3\2\2\2\u079b"+
		"\u016f\3\2\2\2\u079c\u07a1\5\u017a\u00be\2\u079d\u07a1\5\u0182\u00c2\2"+
		"\u079e\u07a1\5\u018e\u00c8\2\u079f\u07a1\5\u0196\u00cc\2\u07a0\u079c\3"+
		"\2\2\2\u07a0\u079d\3\2\2\2\u07a0\u079e\3\2\2\2\u07a0\u079f\3\2\2\2\u07a1"+
		"\u0171\3\2\2\2\u07a2\u07cb\5\2\2\2\u07a3\u07a8\5\66\34\2\u07a4\u07a5\7"+
		"N\2\2\u07a5\u07a7\7O\2\2\u07a6\u07a4\3\2\2\2\u07a7\u07aa\3\2\2\2\u07a8"+
		"\u07a6\3\2\2\2\u07a8\u07a9\3\2\2\2\u07a9\u07ab\3\2\2\2\u07aa\u07a8\3\2"+
		"\2\2\u07ab\u07ac\7R\2\2\u07ac\u07ad\7\13\2\2\u07ad\u07cb\3\2\2\2\u07ae"+
		"\u07b3\5x=\2\u07af\u07b0\7N\2\2\u07b0\u07b2\7O\2\2\u07b1\u07af\3\2\2\2"+
		"\u07b2\u07b5\3\2\2\2\u07b3\u07b1\3\2\2\2\u07b3\u07b4\3\2\2\2\u07b4\u07b6"+
		"\3\2\2\2\u07b5\u07b3\3\2\2\2\u07b6\u07b7\7R\2\2\u07b7\u07b8\7\13\2\2\u07b8"+
		"\u07cb\3\2\2\2\u07b9\u07ba\7\62\2\2\u07ba\u07bb\7R\2\2\u07bb\u07cb\7\13"+
		"\2\2\u07bc\u07cb\7-\2\2\u07bd\u07be\5\66\34\2\u07be\u07bf\7R\2\2\u07bf"+
		"\u07c0\7-\2\2\u07c0\u07cb\3\2\2\2\u07c1\u07c2\7J\2\2\u07c2\u07c3\5\u01a2"+
		"\u00d2\2\u07c3\u07c4\7K\2\2\u07c4\u07cb\3\2\2\2\u07c5\u07cb\5\u017c\u00bf"+
		"\2\u07c6\u07cb\5\u0184\u00c3\2\u07c7\u07cb\5\u018a\u00c6\2\u07c8\u07cb"+
		"\5\u0190\u00c9\2\u07c9\u07cb\5\u0198\u00cd\2\u07ca\u07a2\3\2\2\2\u07ca"+
		"\u07a3\3\2\2\2\u07ca\u07ae\3\2\2\2\u07ca\u07b9\3\2\2\2\u07ca\u07bc\3\2"+
		"\2\2\u07ca\u07bd\3\2\2\2\u07ca\u07c1\3\2\2\2\u07ca\u07c5\3\2\2\2\u07ca"+
		"\u07c6\3\2\2\2\u07ca\u07c7\3\2\2\2\u07ca\u07c8\3\2\2\2\u07ca\u07c9\3\2"+
		"\2\2\u07cb\u0173\3\2\2\2\u07cc\u07cd\3\2\2\2\u07cd\u0175\3\2\2\2\u07ce"+
		"\u07f6\5\2\2\2\u07cf\u07d4\5\66\34\2\u07d0\u07d1\7N\2\2\u07d1\u07d3\7"+
		"O\2\2\u07d2\u07d0\3\2\2\2\u07d3\u07d6\3\2\2\2\u07d4\u07d2\3\2\2\2\u07d4"+
		"\u07d5\3\2\2\2\u07d5\u07d7\3\2\2\2\u07d6\u07d4\3\2\2\2\u07d7\u07d8\7R"+
		"\2\2\u07d8\u07d9\7\13\2\2\u07d9\u07f6\3\2\2\2\u07da\u07df\5x=\2\u07db"+
		"\u07dc\7N\2\2\u07dc\u07de\7O\2\2\u07dd\u07db\3\2\2\2\u07de\u07e1\3\2\2"+
		"\2\u07df\u07dd\3\2\2\2\u07df\u07e0\3\2\2\2\u07e0\u07e2\3\2\2\2\u07e1\u07df"+
		"\3\2\2\2\u07e2\u07e3\7R\2\2\u07e3\u07e4\7\13\2\2\u07e4\u07f6\3\2\2\2\u07e5"+
		"\u07e6\7\62\2\2\u07e6\u07e7\7R\2\2\u07e7\u07f6\7\13\2\2\u07e8\u07f6\7"+
		"-\2\2\u07e9\u07ea\5\66\34\2\u07ea\u07eb\7R\2\2\u07eb\u07ec\7-\2\2\u07ec"+
		"\u07f6\3\2\2\2\u07ed\u07ee\7J\2\2\u07ee\u07ef\5\u01a2\u00d2\2\u07ef\u07f0"+
		"\7K\2\2\u07f0\u07f6\3\2\2\2\u07f1\u07f6\5\u017c\u00bf\2\u07f2\u07f6\5"+
		"\u0184\u00c3\2\u07f3\u07f6\5\u0190\u00c9\2\u07f4\u07f6\5\u0198\u00cd\2"+
		"\u07f5\u07ce\3\2\2\2\u07f5\u07cf\3\2\2\2\u07f5\u07da\3\2\2\2\u07f5\u07e5"+
		"\3\2\2\2\u07f5\u07e8\3\2\2\2\u07f5\u07e9\3\2\2\2\u07f5\u07ed\3\2\2\2\u07f5"+
		"\u07f1\3\2\2\2\u07f5\u07f2\3\2\2\2\u07f5\u07f3\3\2\2\2\u07f5\u07f4\3\2"+
		"\2\2\u07f6\u0177\3\2\2\2\u07f7\u07f9\7!\2\2\u07f8\u07fa\5*\26\2\u07f9"+
		"\u07f8\3\2\2\2\u07f9\u07fa\3\2\2\2\u07fa\u07fe\3\2\2\2\u07fb\u07fd\5\u00ea"+
		"v\2\u07fc\u07fb\3\2\2\2\u07fd\u0800\3\2\2\2\u07fe\u07fc\3\2\2\2\u07fe"+
		"\u07ff\3\2\2\2\u07ff\u0801\3\2\2\2\u0800\u07fe\3\2\2\2\u0801\u080c\7w"+
		"\2\2\u0802\u0806\7R\2\2\u0803\u0805\5\u00eav\2\u0804\u0803\3\2\2\2\u0805"+
		"\u0808\3\2\2\2\u0806\u0804\3\2\2\2\u0806\u0807\3\2\2\2\u0807\u0809\3\2"+
		"\2\2\u0808\u0806\3\2\2\2\u0809\u080b\7w\2\2\u080a\u0802\3\2\2\2\u080b"+
		"\u080e\3\2\2\2\u080c\u080a\3\2\2\2\u080c\u080d\3\2\2\2\u080d\u0810\3\2"+
		"\2\2\u080e\u080c\3\2\2\2\u080f\u0811\5\u017e\u00c0\2\u0810\u080f\3\2\2"+
		"\2\u0810\u0811\3\2\2\2\u0811\u0812\3\2\2\2\u0812\u0814\7J\2\2\u0813\u0815"+
		"\5\u0192\u00ca\2\u0814\u0813\3\2\2\2\u0814\u0815\3\2\2\2\u0815\u0816\3"+
		"\2\2\2\u0816\u0818\7K\2\2\u0817\u0819\5d\63\2\u0818\u0817\3\2\2\2\u0818"+
		"\u0819\3\2\2\2\u0819\u084b\3\2\2\2\u081a\u081b\5:\36\2\u081b\u081c\7R"+
		"\2\2\u081c\u081e\7!\2\2\u081d\u081f\5*\26\2\u081e\u081d\3\2\2\2\u081e"+
		"\u081f\3\2\2\2\u081f\u0823\3\2\2\2\u0820\u0822\5\u00eav\2\u0821\u0820"+
		"\3\2\2\2\u0822\u0825\3\2\2\2\u0823\u0821\3\2\2\2\u0823\u0824\3\2\2\2\u0824"+
		"\u0826\3\2\2\2\u0825\u0823\3\2\2\2\u0826\u0828\7w\2\2\u0827\u0829\5\u017e"+
		"\u00c0\2\u0828\u0827\3\2\2\2\u0828\u0829\3\2\2\2\u0829\u082a\3\2\2\2\u082a"+
		"\u082c\7J\2\2\u082b\u082d\5\u0192\u00ca\2\u082c\u082b\3\2\2\2\u082c\u082d"+
		"\3\2\2\2\u082d\u082e\3\2\2\2\u082e\u0830\7K\2\2\u082f\u0831\5d\63\2\u0830"+
		"\u082f\3\2\2\2\u0830\u0831\3\2\2\2\u0831\u084b\3\2\2\2\u0832\u0833\5\u0164"+
		"\u00b3\2\u0833\u0834\7R\2\2\u0834\u0836\7!\2\2\u0835\u0837\5*\26\2\u0836"+
		"\u0835\3\2\2\2\u0836\u0837\3\2\2\2\u0837\u083b\3\2\2\2\u0838\u083a\5\u00ea"+
		"v\2\u0839\u0838\3\2\2\2\u083a\u083d\3\2\2\2\u083b\u0839\3\2\2\2\u083b"+
		"\u083c\3\2\2\2\u083c\u083e\3\2\2\2\u083d\u083b\3\2\2\2\u083e\u0840\7w"+
		"\2\2\u083f\u0841\5\u017e\u00c0\2\u0840\u083f\3\2\2\2\u0840\u0841\3\2\2"+
		"\2\u0841\u0842\3\2\2\2\u0842\u0844\7J\2\2\u0843\u0845\5\u0192\u00ca\2"+
		"\u0844\u0843\3\2\2\2\u0844\u0845\3\2\2\2\u0845\u0846\3\2\2\2\u0846\u0848"+
		"\7K\2\2\u0847\u0849\5d\63\2\u0848\u0847\3\2\2\2\u0848\u0849\3\2\2\2\u0849"+
		"\u084b\3\2\2\2\u084a\u07f7\3\2\2\2\u084a\u081a\3\2\2\2\u084a\u0832\3\2"+
		"\2\2\u084b\u0179\3\2\2\2\u084c\u084d\7R\2\2\u084d\u084f\7!\2\2\u084e\u0850"+
		"\5*\26\2\u084f\u084e\3\2\2\2\u084f\u0850\3\2\2\2\u0850\u0854\3\2\2\2\u0851"+
		"\u0853\5\u00eav\2\u0852\u0851\3\2\2\2\u0853\u0856\3\2\2\2\u0854\u0852"+
		"\3\2\2\2\u0854\u0855\3\2\2\2\u0855\u0857\3\2\2\2\u0856\u0854\3\2\2\2\u0857"+
		"\u0859\7w\2\2\u0858\u085a\5\u017e\u00c0\2\u0859\u0858\3\2\2\2\u0859\u085a"+
		"\3\2\2\2\u085a\u085b\3\2\2\2\u085b\u085d\7J\2\2\u085c\u085e\5\u0192\u00ca"+
		"\2\u085d\u085c\3\2\2\2\u085d\u085e\3\2\2\2\u085e\u085f\3\2\2\2\u085f\u0861"+
		"\7K\2\2\u0860\u0862\5d\63\2\u0861\u0860\3\2\2\2\u0861\u0862\3\2\2\2\u0862"+
		"\u017b\3\2\2\2\u0863\u0865\7!\2\2\u0864\u0866\5*\26\2\u0865\u0864\3\2"+
		"\2\2\u0865\u0866\3\2\2\2\u0866\u086a\3\2\2\2\u0867\u0869\5\u00eav\2\u0868"+
		"\u0867\3\2\2\2\u0869\u086c\3\2\2\2\u086a\u0868\3\2\2\2\u086a\u086b\3\2"+
		"\2\2\u086b\u086d\3\2\2\2\u086c\u086a\3\2\2\2\u086d\u0878\7w\2\2\u086e"+
		"\u0872\7R\2\2\u086f\u0871\5\u00eav\2\u0870\u086f\3\2\2\2\u0871\u0874\3"+
		"\2\2\2\u0872\u0870\3\2\2\2\u0872\u0873\3\2\2\2\u0873\u0875\3\2\2\2\u0874"+
		"\u0872\3\2\2\2\u0875\u0877\7w\2\2\u0876\u086e\3\2\2\2\u0877\u087a\3\2"+
		"\2\2\u0878\u0876\3\2\2\2\u0878\u0879\3\2\2\2\u0879\u087c\3\2\2\2\u087a"+
		"\u0878\3\2\2\2\u087b\u087d\5\u017e\u00c0\2\u087c\u087b\3\2\2\2\u087c\u087d"+
		"\3\2\2\2\u087d\u087e\3\2\2\2\u087e\u0880\7J\2\2\u087f\u0881\5\u0192\u00ca"+
		"\2\u0880\u087f\3\2\2\2\u0880\u0881\3\2\2\2\u0881\u0882\3\2\2\2\u0882\u0884"+
		"\7K\2\2\u0883\u0885\5d\63\2\u0884\u0883\3\2\2\2\u0884\u0885\3\2\2\2\u0885"+
		"\u089f\3\2\2\2\u0886\u0887\5:\36\2\u0887\u0888\7R\2\2\u0888\u088a\7!\2"+
		"\2\u0889\u088b\5*\26\2\u088a\u0889\3\2\2\2\u088a\u088b\3\2\2\2\u088b\u088f"+
		"\3\2\2\2\u088c\u088e\5\u00eav\2\u088d\u088c\3\2\2\2\u088e\u0891\3\2\2"+
		"\2\u088f\u088d\3\2\2\2\u088f\u0890\3\2\2\2\u0890\u0892\3\2\2\2\u0891\u088f"+
		"\3\2\2\2\u0892\u0894\7w\2\2\u0893\u0895\5\u017e\u00c0\2\u0894\u0893\3"+
		"\2\2\2\u0894\u0895\3\2\2\2\u0895\u0896\3\2\2\2\u0896\u0898\7J\2\2\u0897"+
		"\u0899\5\u0192\u00ca\2\u0898\u0897\3\2\2\2\u0898\u0899\3\2\2\2\u0899\u089a"+
		"\3\2\2\2\u089a\u089c\7K\2\2\u089b\u089d\5d\63\2\u089c\u089b\3\2\2\2\u089c"+
		"\u089d\3\2\2\2\u089d\u089f\3\2\2\2\u089e\u0863\3\2\2\2\u089e\u0886\3\2"+
		"\2\2\u089f\u017d\3\2\2\2\u08a0\u08a4\5*\26\2\u08a1\u08a2\7U\2\2\u08a2"+
		"\u08a4\7T\2\2\u08a3\u08a0\3\2\2\2\u08a3\u08a1\3\2\2\2\u08a4\u017f\3\2"+
		"\2\2\u08a5\u08a6\5\u0164\u00b3\2\u08a6\u08a7\7R\2\2\u08a7\u08a8\7w\2\2"+
		"\u08a8\u08b3\3\2\2\2\u08a9\u08aa\7*\2\2\u08aa\u08ab\7R\2\2\u08ab\u08b3"+
		"\7w\2\2\u08ac\u08ad\5\66\34\2\u08ad\u08ae\7R\2\2\u08ae\u08af\7*\2\2\u08af"+
		"\u08b0\7R\2\2\u08b0\u08b1\7w\2\2\u08b1\u08b3\3\2\2\2\u08b2\u08a5\3\2\2"+
		"\2\u08b2\u08a9\3\2\2\2\u08b2\u08ac\3\2\2\2\u08b3\u0181\3\2\2\2\u08b4\u08b5"+
		"\7R\2\2\u08b5\u08b6\7w\2\2\u08b6\u0183\3\2\2\2\u08b7\u08b8\7*\2\2\u08b8"+
		"\u08b9\7R\2\2\u08b9\u08c1\7w\2\2\u08ba\u08bb\5\66\34\2\u08bb\u08bc\7R"+
		"\2\2\u08bc\u08bd\7*\2\2\u08bd\u08be\7R\2\2\u08be\u08bf\7w\2\2\u08bf\u08c1"+
		"\3\2\2\2\u08c0\u08b7\3\2\2\2\u08c0\u08ba\3\2\2\2\u08c1\u0185\3\2\2\2\u08c2"+
		"\u08c3\5:\36\2\u08c3\u08c4\7N\2\2\u08c4\u08c5\5\u01a2\u00d2\2\u08c5\u08c6"+
		"\7O\2\2\u08c6\u08cd\3\2\2\2\u08c7\u08c8\5\u016a\u00b6\2\u08c8\u08c9\7"+
		"N\2\2\u08c9\u08ca\5\u01a2\u00d2\2\u08ca\u08cb\7O\2\2\u08cb\u08cd\3\2\2"+
		"\2\u08cc\u08c2\3\2\2\2\u08cc\u08c7\3\2\2\2\u08cd\u08d5\3\2\2\2\u08ce\u08cf"+
		"\5\u0168\u00b5\2\u08cf\u08d0\7N\2\2\u08d0\u08d1\5\u01a2\u00d2\2\u08d1"+
		"\u08d2\7O\2\2\u08d2\u08d4\3\2\2\2\u08d3\u08ce\3\2\2\2\u08d4\u08d7\3\2"+
		"\2\2\u08d5\u08d3\3\2\2\2\u08d5\u08d6\3\2\2\2\u08d6\u0187\3\2\2\2\u08d7"+
		"\u08d5\3\2\2\2\u08d8\u08d9\5\u0170\u00b9\2\u08d9\u08da\7N\2\2\u08da\u08db"+
		"\5\u01a2\u00d2\2\u08db\u08e3\7O\2\2\u08dc\u08dd\5\u016e\u00b8\2\u08dd"+
		"\u08de\7N\2\2\u08de\u08df\5\u01a2\u00d2\2\u08df\u08e0\7O\2\2\u08e0\u08e2"+
		"\3\2\2\2\u08e1\u08dc\3\2\2\2\u08e2\u08e5\3\2\2\2\u08e3\u08e1\3\2\2\2\u08e3"+
		"\u08e4\3\2\2\2\u08e4\u0189\3\2\2\2\u08e5\u08e3\3\2\2\2\u08e6\u08e7\5:"+
		"\36\2\u08e7\u08e8\7N\2\2\u08e8\u08e9\5\u01a2\u00d2\2\u08e9\u08ea\7O\2"+
		"\2\u08ea\u08f1\3\2\2\2\u08eb\u08ec\5\u0176\u00bc\2\u08ec\u08ed\7N\2\2"+
		"\u08ed\u08ee\5\u01a2\u00d2\2\u08ee\u08ef\7O\2\2\u08ef\u08f1\3\2\2\2\u08f0"+
		"\u08e6\3\2\2\2\u08f0\u08eb\3\2\2\2\u08f1\u08f9\3\2\2\2\u08f2\u08f3\5\u0174"+
		"\u00bb\2\u08f3\u08f4\7N\2\2\u08f4\u08f5\5\u01a2\u00d2\2\u08f5\u08f6\7"+
		"O\2\2\u08f6\u08f8\3\2\2\2\u08f7\u08f2\3\2\2\2\u08f8\u08fb\3\2\2\2\u08f9"+
		"\u08f7\3\2\2\2\u08f9\u08fa\3\2\2\2\u08fa\u018b\3\2\2\2\u08fb\u08f9\3\2"+
		"\2\2\u08fc\u08fd\5<\37\2\u08fd\u08ff\7J\2\2\u08fe\u0900\5\u0192\u00ca"+
		"\2\u08ff\u08fe\3\2\2\2\u08ff\u0900\3\2\2\2\u0900\u0901\3\2\2\2\u0901\u0902"+
		"\7K\2\2\u0902\u0941\3\2\2\2\u0903\u0904\5\66\34\2\u0904\u0906\7R\2\2\u0905"+
		"\u0907\5*\26\2\u0906\u0905\3\2\2\2\u0906\u0907\3\2\2\2\u0907\u0908\3\2"+
		"\2\2\u0908\u0909\7w\2\2\u0909\u090b\7J\2\2\u090a\u090c\5\u0192\u00ca\2"+
		"\u090b\u090a\3\2\2\2\u090b\u090c\3\2\2\2\u090c\u090d\3\2\2\2\u090d\u090e"+
		"\7K\2\2\u090e\u0941\3\2\2\2\u090f\u0910\5:\36\2\u0910\u0912\7R\2\2\u0911"+
		"\u0913\5*\26\2\u0912\u0911\3\2\2\2\u0912\u0913\3\2\2\2\u0913\u0914\3\2"+
		"\2\2\u0914\u0915\7w\2\2\u0915\u0917\7J\2\2\u0916\u0918\5\u0192\u00ca\2"+
		"\u0917\u0916\3\2\2\2\u0917\u0918\3\2\2\2\u0918\u0919\3\2\2\2\u0919\u091a"+
		"\7K\2\2\u091a\u0941\3\2\2\2\u091b\u091c\5\u0164\u00b3\2\u091c\u091e\7"+
		"R\2\2\u091d\u091f\5*\26\2\u091e\u091d\3\2\2\2\u091e\u091f\3\2\2\2\u091f"+
		"\u0920\3\2\2\2\u0920\u0921\7w\2\2\u0921\u0923\7J\2\2\u0922\u0924\5\u0192"+
		"\u00ca\2\u0923\u0922\3\2\2\2\u0923\u0924\3\2\2\2\u0924\u0925\3\2\2\2\u0925"+
		"\u0926\7K\2\2\u0926\u0941\3\2\2\2\u0927\u0928\7*\2\2\u0928\u092a\7R\2"+
		"\2\u0929\u092b\5*\26\2\u092a\u0929\3\2\2\2\u092a\u092b\3\2\2\2\u092b\u092c"+
		"\3\2\2\2\u092c\u092d\7w\2\2\u092d\u092f\7J\2\2\u092e\u0930\5\u0192\u00ca"+
		"\2\u092f\u092e\3\2\2\2\u092f\u0930\3\2\2\2\u0930\u0931\3\2\2\2\u0931\u0941"+
		"\7K\2\2\u0932\u0933\5\66\34\2\u0933\u0934\7R\2\2\u0934\u0935\7*\2\2\u0935"+
		"\u0937\7R\2\2\u0936\u0938\5*\26\2\u0937\u0936\3\2\2\2\u0937\u0938\3\2"+
		"\2\2\u0938\u0939\3\2\2\2\u0939\u093a\7w\2\2\u093a\u093c\7J\2\2\u093b\u093d"+
		"\5\u0192\u00ca\2\u093c\u093b\3\2\2\2\u093c\u093d\3\2\2\2\u093d\u093e\3"+
		"\2\2\2\u093e\u093f\7K\2\2\u093f\u0941\3\2\2\2\u0940\u08fc\3\2\2\2\u0940"+
		"\u0903\3\2\2\2\u0940\u090f\3\2\2\2\u0940\u091b\3\2\2\2\u0940\u0927\3\2"+
		"\2\2\u0940\u0932\3\2\2\2\u0941\u018d\3\2\2\2\u0942\u0944\7R\2\2\u0943"+
		"\u0945\5*\26\2\u0944\u0943\3\2\2\2\u0944\u0945\3\2\2\2\u0945\u0946\3\2"+
		"\2\2\u0946\u0947\7w\2\2\u0947\u0949\7J\2\2\u0948\u094a\5\u0192\u00ca\2"+
		"\u0949\u0948\3\2\2\2\u0949\u094a\3\2\2\2\u094a\u094b\3\2\2\2\u094b\u094c"+
		"\7K\2\2\u094c\u018f\3\2\2\2\u094d\u094e\5<\37\2\u094e\u0950\7J\2\2\u094f"+
		"\u0951\5\u0192\u00ca\2\u0950\u094f\3\2\2\2\u0950\u0951\3\2\2\2\u0951\u0952"+
		"\3\2\2\2\u0952\u0953\7K\2\2\u0953\u0986\3\2\2\2\u0954\u0955\5\66\34\2"+
		"\u0955\u0957\7R\2\2\u0956\u0958\5*\26\2\u0957\u0956\3\2\2\2\u0957\u0958"+
		"\3\2\2\2\u0958\u0959\3\2\2\2\u0959\u095a\7w\2\2\u095a\u095c\7J\2\2\u095b"+
		"\u095d\5\u0192\u00ca\2\u095c\u095b\3\2\2\2\u095c\u095d\3\2\2\2\u095d\u095e"+
		"\3\2\2\2\u095e\u095f\7K\2\2\u095f\u0986\3\2\2\2\u0960\u0961\5:\36\2\u0961"+
		"\u0963\7R\2\2\u0962\u0964\5*\26\2\u0963\u0962\3\2\2\2\u0963\u0964\3\2"+
		"\2\2\u0964\u0965\3\2\2\2\u0965\u0966";
	private static final String _serializedATNSegment1 =
		"\7w\2\2\u0966\u0968\7J\2\2\u0967\u0969\5\u0192\u00ca\2\u0968\u0967\3\2"+
		"\2\2\u0968\u0969\3\2\2\2\u0969\u096a\3\2\2\2\u096a\u096b\7K\2\2\u096b"+
		"\u0986\3\2\2\2\u096c\u096d\7*\2\2\u096d\u096f\7R\2\2\u096e\u0970\5*\26"+
		"\2\u096f\u096e\3\2\2\2\u096f\u0970\3\2\2\2\u0970\u0971\3\2\2\2\u0971\u0972"+
		"\7w\2\2\u0972\u0974\7J\2\2\u0973\u0975\5\u0192\u00ca\2\u0974\u0973\3\2"+
		"\2\2\u0974\u0975\3\2\2\2\u0975\u0976\3\2\2\2\u0976\u0986\7K\2\2\u0977"+
		"\u0978\5\66\34\2\u0978\u0979\7R\2\2\u0979\u097a\7*\2\2\u097a\u097c\7R"+
		"\2\2\u097b\u097d\5*\26\2\u097c\u097b\3\2\2\2\u097c\u097d\3\2\2\2\u097d"+
		"\u097e\3\2\2\2\u097e\u097f\7w\2\2\u097f\u0981\7J\2\2\u0980\u0982\5\u0192"+
		"\u00ca\2\u0981\u0980\3\2\2\2\u0981\u0982\3\2\2\2\u0982\u0983\3\2\2\2\u0983"+
		"\u0984\7K\2\2\u0984\u0986\3\2\2\2\u0985\u094d\3\2\2\2\u0985\u0954\3\2"+
		"\2\2\u0985\u0960\3\2\2\2\u0985\u096c\3\2\2\2\u0985\u0977\3\2\2\2\u0986"+
		"\u0191\3\2\2\2\u0987\u098c\5\u01a2\u00d2\2\u0988\u0989\7Q\2\2\u0989\u098b"+
		"\5\u01a2\u00d2\2\u098a\u0988\3\2\2\2\u098b\u098e\3\2\2\2\u098c\u098a\3"+
		"\2\2\2\u098c\u098d\3\2\2\2\u098d\u0193\3\2\2\2\u098e\u098c\3\2\2\2\u098f"+
		"\u0990\5:\36\2\u0990\u0992\7k\2\2\u0991\u0993\5*\26\2\u0992\u0991\3\2"+
		"\2\2\u0992\u0993\3\2\2\2\u0993\u0994\3\2\2\2\u0994\u0995\7w\2\2\u0995"+
		"\u09bf\3\2\2\2\u0996\u0997\5\f\7\2\u0997\u0999\7k\2\2\u0998\u099a\5*\26"+
		"\2\u0999\u0998\3\2\2\2\u0999\u099a\3\2\2\2\u099a\u099b\3\2\2\2\u099b\u099c"+
		"\7w\2\2\u099c\u09bf\3\2\2\2\u099d\u099e\5\u0164\u00b3\2\u099e\u09a0\7"+
		"k\2\2\u099f\u09a1\5*\26\2\u09a0\u099f\3\2\2\2\u09a0\u09a1\3\2\2\2\u09a1"+
		"\u09a2\3\2\2\2\u09a2\u09a3\7w\2\2\u09a3\u09bf\3\2\2\2\u09a4\u09a5\7*\2"+
		"\2\u09a5\u09a7\7k\2\2\u09a6\u09a8\5*\26\2\u09a7\u09a6\3\2\2\2\u09a7\u09a8"+
		"\3\2\2\2\u09a8\u09a9\3\2\2\2\u09a9\u09bf\7w\2\2\u09aa\u09ab\5\66\34\2"+
		"\u09ab\u09ac\7R\2\2\u09ac\u09ad\7*\2\2\u09ad\u09af\7k\2\2\u09ae\u09b0"+
		"\5*\26\2\u09af\u09ae\3\2\2\2\u09af\u09b0\3\2\2\2\u09b0\u09b1\3\2\2\2\u09b1"+
		"\u09b2\7w\2\2\u09b2\u09bf\3\2\2\2\u09b3\u09b4\5\20\t\2\u09b4\u09b6\7k"+
		"\2\2\u09b5\u09b7\5*\26\2\u09b6\u09b5\3\2\2\2\u09b6\u09b7\3\2\2\2\u09b7"+
		"\u09b8\3\2\2\2\u09b8\u09b9\7!\2\2\u09b9\u09bf\3\2\2\2\u09ba\u09bb\5\36"+
		"\20\2\u09bb\u09bc\7k\2\2\u09bc\u09bd\7!\2\2\u09bd\u09bf\3\2\2\2\u09be"+
		"\u098f\3\2\2\2\u09be\u0996\3\2\2\2\u09be\u099d\3\2\2\2\u09be\u09a4\3\2"+
		"\2\2\u09be\u09aa\3\2\2\2\u09be\u09b3\3\2\2\2\u09be\u09ba\3\2\2\2\u09bf"+
		"\u0195\3\2\2\2\u09c0\u09c2\7k\2\2\u09c1\u09c3\5*\26\2\u09c2\u09c1\3\2"+
		"\2\2\u09c2\u09c3\3\2\2\2\u09c3\u09c4\3\2\2\2\u09c4\u09c5\7w\2\2\u09c5"+
		"\u0197\3\2\2\2\u09c6\u09c7\5:\36\2\u09c7\u09c9\7k\2\2\u09c8\u09ca\5*\26"+
		"\2\u09c9\u09c8\3\2\2\2\u09c9\u09ca\3\2\2\2\u09ca\u09cb\3\2\2\2\u09cb\u09cc"+
		"\7w\2\2\u09cc\u09ef\3\2\2\2\u09cd\u09ce\5\f\7\2\u09ce\u09d0\7k\2\2\u09cf"+
		"\u09d1\5*\26\2\u09d0\u09cf\3\2\2\2\u09d0\u09d1\3\2\2\2\u09d1\u09d2\3\2"+
		"\2\2\u09d2\u09d3\7w\2\2\u09d3\u09ef\3\2\2\2\u09d4\u09d5\7*\2\2\u09d5\u09d7"+
		"\7k\2\2\u09d6\u09d8\5*\26\2\u09d7\u09d6\3\2\2\2\u09d7\u09d8\3\2\2\2\u09d8"+
		"\u09d9\3\2\2\2\u09d9\u09ef\7w\2\2\u09da\u09db\5\66\34\2\u09db\u09dc\7"+
		"R\2\2\u09dc\u09dd\7*\2\2\u09dd\u09df\7k\2\2\u09de\u09e0\5*\26\2\u09df"+
		"\u09de\3\2\2\2\u09df\u09e0\3\2\2\2\u09e0\u09e1\3\2\2\2\u09e1\u09e2\7w"+
		"\2\2\u09e2\u09ef\3\2\2\2\u09e3\u09e4\5\20\t\2\u09e4\u09e6\7k\2\2\u09e5"+
		"\u09e7\5*\26\2\u09e6\u09e5\3\2\2\2\u09e6\u09e7\3\2\2\2\u09e7\u09e8\3\2"+
		"\2\2\u09e8\u09e9\7!\2\2\u09e9\u09ef\3\2\2\2\u09ea\u09eb\5\36\20\2\u09eb"+
		"\u09ec\7k\2\2\u09ec\u09ed\7!\2\2\u09ed\u09ef\3\2\2\2\u09ee\u09c6\3\2\2"+
		"\2\u09ee\u09cd\3\2\2\2\u09ee\u09d4\3\2\2\2\u09ee\u09da\3\2\2\2\u09ee\u09e3"+
		"\3\2\2\2\u09ee\u09ea\3\2\2\2\u09ef\u0199\3\2\2\2\u09f0\u09f1\7!\2\2\u09f1"+
		"\u09f2\5\4\3\2\u09f2\u09f4\5\u019c\u00cf\2\u09f3\u09f5\5 \21\2\u09f4\u09f3"+
		"\3\2\2\2\u09f4\u09f5\3\2\2\2\u09f5\u0a07\3\2\2\2\u09f6\u09f7\7!\2\2\u09f7"+
		"\u09f8\5\16\b\2\u09f8\u09fa\5\u019c\u00cf\2\u09f9\u09fb\5 \21\2\u09fa"+
		"\u09f9\3\2\2\2\u09fa\u09fb\3\2\2\2\u09fb\u0a07\3\2\2\2\u09fc\u09fd\7!"+
		"\2\2\u09fd\u09fe\5\4\3\2\u09fe\u09ff\5 \21\2\u09ff\u0a00\5\u00fc\177\2"+
		"\u0a00\u0a07\3\2\2\2\u0a01\u0a02\7!\2\2\u0a02\u0a03\5\16\b\2\u0a03\u0a04"+
		"\5 \21\2\u0a04\u0a05\5\u00fc\177\2\u0a05\u0a07\3\2\2\2\u0a06\u09f0\3\2"+
		"\2\2\u0a06\u09f6\3\2\2\2\u0a06\u09fc\3\2\2\2\u0a06\u0a01\3\2\2\2\u0a07"+
		"\u019b\3\2\2\2\u0a08\u0a0c\5\u019e\u00d0\2\u0a09\u0a0b\5\u019e\u00d0\2"+
		"\u0a0a\u0a09\3\2\2\2\u0a0b\u0a0e\3\2\2\2\u0a0c\u0a0a\3\2\2\2\u0a0c\u0a0d"+
		"\3\2\2\2\u0a0d\u019d\3\2\2\2\u0a0e\u0a0c\3\2\2\2\u0a0f\u0a11\5\u00eav"+
		"\2\u0a10\u0a0f\3\2\2\2\u0a11\u0a14\3\2\2\2\u0a12\u0a10\3\2\2\2\u0a12\u0a13"+
		"\3\2\2\2\u0a13\u0a15\3\2\2\2\u0a14\u0a12\3\2\2\2\u0a15\u0a16\7N\2\2\u0a16"+
		"\u0a17\5\u01a2\u00d2\2\u0a17\u0a18\7O\2\2\u0a18\u019f\3\2\2\2\u0a19\u0a1a"+
		"\5\u01a2\u00d2\2\u0a1a\u01a1\3\2\2\2\u0a1b\u0a1e\5\u01a4\u00d3\2\u0a1c"+
		"\u0a1e\5\u01ac\u00d7\2\u0a1d\u0a1b\3\2\2\2\u0a1d\u0a1c\3\2\2\2\u0a1e\u01a3"+
		"\3\2\2\2\u0a1f\u0a20\5\u01a6\u00d4\2\u0a20\u0a21\7j\2\2\u0a21\u0a22\5"+
		"\u01aa\u00d6\2\u0a22\u01a5\3\2\2\2\u0a23\u0a2e\7w\2\2\u0a24\u0a26\7J\2"+
		"\2\u0a25\u0a27\5\u0098M\2\u0a26\u0a25\3\2\2\2\u0a26\u0a27\3\2\2\2\u0a27"+
		"\u0a28\3\2\2\2\u0a28\u0a2e\7K\2\2\u0a29\u0a2a\7J\2\2\u0a2a\u0a2b\5\u01a8"+
		"\u00d5\2\u0a2b\u0a2c\7K\2\2\u0a2c\u0a2e\3\2\2\2\u0a2d\u0a23\3\2\2\2\u0a2d"+
		"\u0a24\3\2\2\2\u0a2d\u0a29\3\2\2\2\u0a2e\u01a7\3\2\2\2\u0a2f\u0a34\7w"+
		"\2\2\u0a30\u0a31\7Q\2\2\u0a31\u0a33\7w\2\2\u0a32\u0a30\3\2\2\2\u0a33\u0a36"+
		"\3\2\2\2\u0a34\u0a32\3\2\2\2\u0a34\u0a35\3\2\2\2\u0a35\u01a9\3\2\2\2\u0a36"+
		"\u0a34\3\2\2\2\u0a37\u0a3a\5\u01a2\u00d2\2\u0a38\u0a3a\5\u0100\u0081\2"+
		"\u0a39\u0a37\3\2\2\2\u0a39\u0a38\3\2\2\2\u0a3a\u01ab\3\2\2\2\u0a3b\u0a3e"+
		"\5\u01b4\u00db\2\u0a3c\u0a3e\5\u01ae\u00d8\2\u0a3d\u0a3b\3\2\2\2\u0a3d"+
		"\u0a3c\3\2\2\2\u0a3e\u01ad\3\2\2\2\u0a3f\u0a40\5\u01b0\u00d9\2\u0a40\u0a41"+
		"\5\u01b2\u00da\2\u0a41\u0a42\5\u01a2\u00d2\2\u0a42\u01af\3\2\2\2\u0a43"+
		"\u0a47\5:\36\2\u0a44\u0a47\5\u0180\u00c1\2\u0a45\u0a47\5\u0186\u00c4\2"+
		"\u0a46\u0a43\3\2\2\2\u0a46\u0a44\3\2\2\2\u0a46\u0a45\3\2\2\2\u0a47\u01b1"+
		"\3\2\2\2\u0a48\u0a49\t\7\2\2\u0a49\u01b3\3\2\2\2\u0a4a\u0a52\5\u01b6\u00dc"+
		"\2\u0a4b\u0a4c\5\u01b6\u00dc\2\u0a4c\u0a4d\7X\2\2\u0a4d\u0a4e\5\u01a2"+
		"\u00d2\2\u0a4e\u0a4f\7Y\2\2\u0a4f\u0a50\5\u01b4\u00db\2\u0a50\u0a52\3"+
		"\2\2\2\u0a51\u0a4a\3\2\2\2\u0a51\u0a4b\3\2\2\2\u0a52\u01b5\3\2\2\2\u0a53"+
		"\u0a54\b\u00dc\1\2\u0a54\u0a55\5\u01b8\u00dd\2\u0a55\u0a5b\3\2\2\2\u0a56"+
		"\u0a57\f\3\2\2\u0a57\u0a58\7_\2\2\u0a58\u0a5a\5\u01b8\u00dd\2\u0a59\u0a56"+
		"\3\2\2\2\u0a5a\u0a5d\3\2\2\2\u0a5b\u0a59\3\2\2\2\u0a5b\u0a5c\3\2\2\2\u0a5c"+
		"\u01b7\3\2\2\2\u0a5d\u0a5b\3\2\2\2\u0a5e\u0a5f\b\u00dd\1\2\u0a5f\u0a60"+
		"\5\u01ba\u00de\2\u0a60\u0a66\3\2\2\2\u0a61\u0a62\f\3\2\2\u0a62\u0a63\7"+
		"^\2\2\u0a63\u0a65\5\u01ba\u00de\2\u0a64\u0a61\3\2\2\2\u0a65\u0a68\3\2"+
		"\2\2\u0a66\u0a64\3\2\2\2\u0a66\u0a67\3\2\2\2\u0a67\u01b9\3\2\2\2\u0a68"+
		"\u0a66\3\2\2\2\u0a69\u0a6a\b\u00de\1\2\u0a6a\u0a6b\5\u01bc\u00df\2\u0a6b"+
		"\u0a71\3\2\2\2\u0a6c\u0a6d\f\3\2\2\u0a6d\u0a6e\7g\2\2\u0a6e\u0a70\5\u01bc"+
		"\u00df\2\u0a6f\u0a6c\3\2\2\2\u0a70\u0a73\3\2\2\2\u0a71\u0a6f\3\2\2\2\u0a71"+
		"\u0a72\3\2\2\2\u0a72\u01bb\3\2\2\2\u0a73\u0a71\3\2\2\2\u0a74\u0a75\b\u00df"+
		"\1\2\u0a75\u0a76\5\u01be\u00e0\2\u0a76\u0a7c\3\2\2\2\u0a77\u0a78\f\3\2"+
		"\2\u0a78\u0a79\7h\2\2\u0a79\u0a7b\5\u01be\u00e0\2\u0a7a\u0a77\3\2\2\2"+
		"\u0a7b\u0a7e\3\2\2\2\u0a7c\u0a7a\3\2\2\2\u0a7c\u0a7d\3\2\2\2\u0a7d\u01bd"+
		"\3\2\2\2\u0a7e\u0a7c\3\2\2\2\u0a7f\u0a80\b\u00e0\1\2\u0a80\u0a81\5\u01c0"+
		"\u00e1\2\u0a81\u0a87\3\2\2\2\u0a82\u0a83\f\3\2\2\u0a83\u0a84\7f\2\2\u0a84"+
		"\u0a86\5\u01c0\u00e1\2\u0a85\u0a82\3\2\2\2\u0a86\u0a89\3\2\2\2\u0a87\u0a85"+
		"\3\2\2\2\u0a87\u0a88\3\2\2\2\u0a88\u01bf\3\2\2\2\u0a89\u0a87\3\2\2\2\u0a8a"+
		"\u0a8b\b\u00e1\1\2\u0a8b\u0a8c\5\u01c2\u00e2\2\u0a8c\u0a95\3\2\2\2\u0a8d"+
		"\u0a8e\f\4\2\2\u0a8e\u0a8f\7Z\2\2\u0a8f\u0a94\5\u01c2\u00e2\2\u0a90\u0a91"+
		"\f\3\2\2\u0a91\u0a92\7]\2\2\u0a92\u0a94\5\u01c2\u00e2\2\u0a93\u0a8d\3"+
		"\2\2\2\u0a93\u0a90\3\2\2\2\u0a94\u0a97\3\2\2\2\u0a95\u0a93\3\2\2\2\u0a95"+
		"\u0a96\3\2\2\2\u0a96\u01c1\3\2\2\2\u0a97\u0a95\3\2\2\2\u0a98\u0a99\b\u00e2"+
		"\1\2\u0a99\u0a9a\5\u01c4\u00e3\2\u0a9a\u0aac\3\2\2\2\u0a9b\u0a9c\f\7\2"+
		"\2\u0a9c\u0a9d\7U\2\2\u0a9d\u0aab\5\u01c4\u00e3\2\u0a9e\u0a9f\f\6\2\2"+
		"\u0a9f\u0aa0\7T\2\2\u0aa0\u0aab\5\u01c4\u00e3\2\u0aa1\u0aa2\f\5\2\2\u0aa2"+
		"\u0aa3\7[\2\2\u0aa3\u0aab\5\u01c4\u00e3\2\u0aa4\u0aa5\f\4\2\2\u0aa5\u0aa6"+
		"\7\\\2\2\u0aa6\u0aab\5\u01c4\u00e3\2\u0aa7\u0aa8\f\3\2\2\u0aa8\u0aa9\7"+
		"\34\2\2\u0aa9\u0aab\5\f\7\2\u0aaa\u0a9b\3\2\2\2\u0aaa\u0a9e\3\2\2\2\u0aaa"+
		"\u0aa1\3\2\2\2\u0aaa\u0aa4\3\2\2\2\u0aaa\u0aa7\3\2\2\2\u0aab\u0aae\3\2"+
		"\2\2\u0aac\u0aaa\3\2\2\2\u0aac\u0aad\3\2\2\2\u0aad\u01c3\3\2\2\2\u0aae"+
		"\u0aac\3\2\2\2\u0aaf\u0ab0\b\u00e3\1\2\u0ab0\u0ab1\5\u01c6\u00e4\2\u0ab1"+
		"\u0ac1\3\2\2\2\u0ab2\u0ab3\f\5\2\2\u0ab3\u0ab4\7U\2\2\u0ab4\u0ab5\7U\2"+
		"\2\u0ab5\u0ac0\5\u01c6\u00e4\2\u0ab6\u0ab7\f\4\2\2\u0ab7\u0ab8\7T\2\2"+
		"\u0ab8\u0ab9\7T\2\2\u0ab9\u0ac0\5\u01c6\u00e4\2\u0aba\u0abb\f\3\2\2\u0abb"+
		"\u0abc\7T\2\2\u0abc\u0abd\7T\2\2\u0abd\u0abe\7T\2\2\u0abe\u0ac0\5\u01c6"+
		"\u00e4\2\u0abf\u0ab2\3\2\2\2\u0abf\u0ab6\3\2\2\2\u0abf\u0aba\3\2\2\2\u0ac0"+
		"\u0ac3\3\2\2\2\u0ac1\u0abf\3\2\2\2\u0ac1\u0ac2\3\2\2\2\u0ac2\u01c5\3\2"+
		"\2\2\u0ac3\u0ac1\3\2\2\2\u0ac4\u0ac5\b\u00e4\1\2\u0ac5\u0ac6\5\u01c8\u00e5"+
		"\2\u0ac6\u0acf\3\2\2\2\u0ac7\u0ac8\f\4\2\2\u0ac8\u0ac9\7b\2\2\u0ac9\u0ace"+
		"\5\u01c8\u00e5\2\u0aca\u0acb\f\3\2\2\u0acb\u0acc\7c\2\2\u0acc\u0ace\5"+
		"\u01c8\u00e5\2\u0acd\u0ac7\3\2\2\2\u0acd\u0aca\3\2\2\2\u0ace\u0ad1\3\2"+
		"\2\2\u0acf\u0acd\3\2\2\2\u0acf\u0ad0\3\2\2\2\u0ad0\u01c7\3\2\2\2\u0ad1"+
		"\u0acf\3\2\2\2\u0ad2\u0ad3\b\u00e5\1\2\u0ad3\u0ad4\5\u01ca\u00e6\2\u0ad4"+
		"\u0ae0\3\2\2\2\u0ad5\u0ad6\f\5\2\2\u0ad6\u0ad7\7d\2\2\u0ad7\u0adf\5\u01ca"+
		"\u00e6\2\u0ad8\u0ad9\f\4\2\2\u0ad9\u0ada\7e\2\2\u0ada\u0adf\5\u01ca\u00e6"+
		"\2\u0adb\u0adc\f\3\2\2\u0adc\u0add\7i\2\2\u0add\u0adf\5\u01ca\u00e6\2"+
		"\u0ade\u0ad5\3\2\2\2\u0ade\u0ad8\3\2\2\2\u0ade\u0adb\3\2\2\2\u0adf\u0ae2"+
		"\3\2\2\2\u0ae0\u0ade\3\2\2\2\u0ae0\u0ae1\3\2\2\2\u0ae1\u01c9\3\2\2\2\u0ae2"+
		"\u0ae0\3\2\2\2\u0ae3\u0aeb\5\u01cc\u00e7\2\u0ae4\u0aeb\5\u01ce\u00e8\2"+
		"\u0ae5\u0ae6\7b\2\2\u0ae6\u0aeb\5\u01ca\u00e6\2\u0ae7\u0ae8\7c\2\2\u0ae8"+
		"\u0aeb\5\u01ca\u00e6\2\u0ae9\u0aeb\5\u01d0\u00e9\2\u0aea\u0ae3\3\2\2\2"+
		"\u0aea\u0ae4\3\2\2\2\u0aea\u0ae5\3\2\2\2\u0aea\u0ae7\3\2\2\2\u0aea\u0ae9"+
		"\3\2\2\2\u0aeb\u01cb\3\2\2\2\u0aec\u0aed\7`\2\2\u0aed\u0aee\5\u01ca\u00e6"+
		"\2\u0aee\u01cd\3\2\2\2\u0aef\u0af0\7a\2\2\u0af0\u0af1\5\u01ca\u00e6\2"+
		"\u0af1\u01cf\3\2\2\2\u0af2\u0af9\5\u01d2\u00ea\2\u0af3\u0af4\7W\2\2\u0af4"+
		"\u0af9\5\u01ca\u00e6\2\u0af5\u0af6\7V\2\2\u0af6\u0af9\5\u01ca\u00e6\2"+
		"\u0af7\u0af9\5\u01dc\u00ef\2\u0af8\u0af2\3\2\2\2\u0af8\u0af3\3\2\2\2\u0af8"+
		"\u0af5\3\2\2\2\u0af8\u0af7\3\2\2\2\u0af9\u01d1\3\2\2\2\u0afa\u0afd\5\u0164"+
		"\u00b3\2\u0afb\u0afd\5:\36\2\u0afc\u0afa\3\2\2\2\u0afc\u0afb\3\2\2\2\u0afd"+
		"\u0b02\3\2\2\2\u0afe\u0b01\5\u01d6\u00ec\2\u0aff\u0b01\5\u01da\u00ee\2"+
		"\u0b00\u0afe\3\2\2\2\u0b00\u0aff\3\2\2\2\u0b01\u0b04\3\2\2\2\u0b02\u0b00"+
		"\3\2\2\2\u0b02\u0b03\3\2\2\2\u0b03\u01d3\3\2\2\2\u0b04\u0b02\3\2\2\2\u0b05"+
		"\u0b06\5\u01d2\u00ea\2\u0b06\u0b07\7`\2\2\u0b07\u01d5\3\2\2\2\u0b08\u0b09"+
		"\7`\2\2\u0b09\u01d7\3\2\2\2\u0b0a\u0b0b\5\u01d2\u00ea\2\u0b0b\u0b0c\7"+
		"a\2\2\u0b0c\u01d9\3\2\2\2\u0b0d\u0b0e\7a\2\2\u0b0e\u01db\3\2\2\2\u0b0f"+
		"\u0b10\7J\2\2\u0b10\u0b11\5\4\3\2\u0b11\u0b12\7K\2\2\u0b12\u0b13\5\u01ca"+
		"\u00e6\2\u0b13\u0b2b\3\2\2\2\u0b14\u0b15\7J\2\2\u0b15\u0b19\5\f\7\2\u0b16"+
		"\u0b18\5(\25\2\u0b17\u0b16\3\2\2\2\u0b18\u0b1b\3\2\2\2\u0b19\u0b17\3\2"+
		"\2\2\u0b19\u0b1a\3\2\2\2\u0b1a\u0b1c\3\2\2\2\u0b1b\u0b19\3\2\2\2\u0b1c"+
		"\u0b1d\7K\2\2\u0b1d\u0b1e\5\u01d0\u00e9\2\u0b1e\u0b2b\3\2\2\2\u0b1f\u0b20"+
		"\7J\2\2\u0b20\u0b24\5\f\7\2\u0b21\u0b23\5(\25\2\u0b22\u0b21\3\2\2\2\u0b23"+
		"\u0b26\3\2\2\2\u0b24\u0b22\3\2\2\2\u0b24\u0b25\3\2\2\2\u0b25\u0b27\3\2"+
		"\2\2\u0b26\u0b24\3\2\2\2\u0b27\u0b28\7K\2\2\u0b28\u0b29\5\u01a4\u00d3"+
		"\2\u0b29\u0b2b\3\2\2\2\u0b2a\u0b0f\3\2\2\2\u0b2a\u0b14\3\2\2\2\u0b2a\u0b1f"+
		"\3\2\2\2\u0b2b\u01dd\3\2\2\2\u0144\u01e3\u01ea\u01ee\u01f2\u01fb\u01ff"+
		"\u0203\u0205\u020b\u0210\u0217\u021c\u021e\u0224\u0229\u022e\u0233\u023e"+
		"\u024c\u0251\u0259\u0260\u0266\u026b\u0276\u0279\u0287\u028c\u0291\u0296"+
		"\u029c\u02a6\u02ae\u02b8\u02c0\u02cc\u02d0\u02d5\u02db\u02e3\u02f0\u030d"+
		"\u0311\u0316\u031c\u031f\u0322\u0330\u033b\u0349\u0350\u0359\u0360\u0365"+
		"\u0377\u037e\u0384\u0388\u038c\u0390\u0394\u0399\u039d\u03a1\u03a3\u03a8"+
		"\u03af\u03b4\u03b6\u03bc\u03c1\u03c5\u03d8\u03dd\u03f1\u03f6\u03fc\u0402"+
		"\u0404\u0408\u040d\u0411\u0419\u0420\u0428\u042b\u0430\u0439\u043e\u0445"+
		"\u044c\u0451\u0457\u0463\u0468\u046c\u0476\u047b\u0483\u0486\u048b\u0493"+
		"\u0496\u049b\u04a0\u04a5\u04aa\u04b1\u04b6\u04be\u04c3\u04c8\u04cd\u04d3"+
		"\u04d9\u04dc\u04df\u04e8\u04ee\u04f4\u04f7\u04fa\u0502\u0507\u050c\u0512"+
		"\u0515\u0522\u052b\u0535\u053a\u0545\u054a\u0556\u055b\u0567\u0571\u0576"+
		"\u057e\u0581\u0588\u0590\u0596\u059f\u05a9\u05ad\u05b0\u05b9\u05c7\u05ca"+
		"\u05d3\u05d8\u05df\u05e4\u05ec\u05f8\u05ff\u060d\u0623\u0645\u0651\u0657"+
		"\u0663\u0670\u068a\u068e\u0693\u0697\u069b\u06a3\u06a7\u06ab\u06b2\u06bb"+
		"\u06c3\u06d2\u06de\u06e4\u06ea\u06ff\u0704\u070a\u0716\u0721\u072b\u072e"+
		"\u0733\u073c\u0742\u074c\u0751\u075a\u0771\u077b\u0791\u0798\u07a0\u07a8"+
		"\u07b3\u07ca\u07d4\u07df\u07f5\u07f9\u07fe\u0806\u080c\u0810\u0814\u0818"+
		"\u081e\u0823\u0828\u082c\u0830\u0836\u083b\u0840\u0844\u0848\u084a\u084f"+
		"\u0854\u0859\u085d\u0861\u0865\u086a\u0872\u0878\u087c\u0880\u0884\u088a"+
		"\u088f\u0894\u0898\u089c\u089e\u08a3\u08b2\u08c0\u08cc\u08d5\u08e3\u08f0"+
		"\u08f9\u08ff\u0906\u090b\u0912\u0917\u091e\u0923\u092a\u092f\u0937\u093c"+
		"\u0940\u0944\u0949\u0950\u0957\u095c\u0963\u0968\u096f\u0974\u097c\u0981"+
		"\u0985\u098c\u0992\u0999\u09a0\u09a7\u09af\u09b6\u09be\u09c2\u09c9\u09d0"+
		"\u09d7\u09df\u09e6\u09ee\u09f4\u09fa\u0a06\u0a0c\u0a12\u0a1d\u0a26\u0a2d"+
		"\u0a34\u0a39\u0a3d\u0a46\u0a51\u0a5b\u0a66\u0a71\u0a7c\u0a87\u0a93\u0a95"+
		"\u0aaa\u0aac\u0abf\u0ac1\u0acd\u0acf\u0ade\u0ae0\u0aea\u0af8\u0afc\u0b00"+
		"\u0b02\u0b19\u0b24\u0b2a";
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