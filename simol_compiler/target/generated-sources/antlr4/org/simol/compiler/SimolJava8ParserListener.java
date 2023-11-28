// Generated from org/simol/compiler/SimolJava8Parser.g4 by ANTLR 4.13.1
package org.simol.compiler;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimolJava8Parser}.
 */
public interface SimolJava8ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SimolJava8Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SimolJava8Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(SimolJava8Parser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(SimolJava8Parser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(SimolJava8Parser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(SimolJava8Parser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(SimolJava8Parser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(SimolJava8Parser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(SimolJava8Parser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(SimolJava8Parser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(SimolJava8Parser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(SimolJava8Parser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(SimolJava8Parser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(SimolJava8Parser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(SimolJava8Parser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(SimolJava8Parser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lf_classOrInterfaceType(SimolJava8Parser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lf_classOrInterfaceType(SimolJava8Parser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lfno_classOrInterfaceType(SimolJava8Parser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lfno_classOrInterfaceType(SimolJava8Parser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(SimolJava8Parser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(SimolJava8Parser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lf_classOrInterfaceType(SimolJava8Parser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lf_classOrInterfaceType(SimolJava8Parser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lfno_classOrInterfaceType(SimolJava8Parser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lfno_classOrInterfaceType(SimolJava8Parser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(SimolJava8Parser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(SimolJava8Parser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(SimolJava8Parser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(SimolJava8Parser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(SimolJava8Parser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(SimolJava8Parser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(SimolJava8Parser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(SimolJava8Parser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(SimolJava8Parser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(SimolJava8Parser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(SimolJava8Parser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(SimolJava8Parser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(SimolJava8Parser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(SimolJava8Parser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(SimolJava8Parser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(SimolJava8Parser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(SimolJava8Parser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(SimolJava8Parser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(SimolJava8Parser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(SimolJava8Parser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(SimolJava8Parser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(SimolJava8Parser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(SimolJava8Parser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(SimolJava8Parser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(SimolJava8Parser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(SimolJava8Parser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(SimolJava8Parser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(SimolJava8Parser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(SimolJava8Parser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(SimolJava8Parser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(SimolJava8Parser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(SimolJava8Parser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(SimolJava8Parser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(SimolJava8Parser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(SimolJava8Parser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(SimolJava8Parser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(SimolJava8Parser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(SimolJava8Parser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(SimolJava8Parser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(SimolJava8Parser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void enterPackageModifier(SimolJava8Parser.PackageModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void exitPackageModifier(SimolJava8Parser.PackageModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(SimolJava8Parser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(SimolJava8Parser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeImportDeclaration(SimolJava8Parser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeImportDeclaration(SimolJava8Parser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(SimolJava8Parser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(SimolJava8Parser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleStaticImportDeclaration(SimolJava8Parser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleStaticImportDeclaration(SimolJava8Parser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticImportOnDemandDeclaration(SimolJava8Parser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticImportOnDemandDeclaration(SimolJava8Parser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(SimolJava8Parser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(SimolJava8Parser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(SimolJava8Parser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(SimolJava8Parser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(SimolJava8Parser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(SimolJava8Parser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#simolRole}.
	 * @param ctx the parse tree
	 */
	void enterSimolRole(SimolJava8Parser.SimolRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#simolRole}.
	 * @param ctx the parse tree
	 */
	void exitSimolRole(SimolJava8Parser.SimolRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(SimolJava8Parser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(SimolJava8Parser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(SimolJava8Parser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(SimolJava8Parser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(SimolJava8Parser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(SimolJava8Parser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(SimolJava8Parser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(SimolJava8Parser.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void enterSuperinterfaces(SimolJava8Parser.SuperinterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void exitSuperinterfaces(SimolJava8Parser.SuperinterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(SimolJava8Parser.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(SimolJava8Parser.InterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(SimolJava8Parser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(SimolJava8Parser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(SimolJava8Parser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(SimolJava8Parser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(SimolJava8Parser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(SimolJava8Parser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(SimolJava8Parser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(SimolJava8Parser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(SimolJava8Parser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(SimolJava8Parser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(SimolJava8Parser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(SimolJava8Parser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(SimolJava8Parser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(SimolJava8Parser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(SimolJava8Parser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(SimolJava8Parser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(SimolJava8Parser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(SimolJava8Parser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(SimolJava8Parser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(SimolJava8Parser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(SimolJava8Parser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(SimolJava8Parser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(SimolJava8Parser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(SimolJava8Parser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(SimolJava8Parser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(SimolJava8Parser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType(SimolJava8Parser.UnannClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType(SimolJava8Parser.UnannClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(SimolJava8Parser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(SimolJava8Parser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(SimolJava8Parser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(SimolJava8Parser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType(SimolJava8Parser.UnannInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType(SimolJava8Parser.UnannInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(SimolJava8Parser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(SimolJava8Parser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(SimolJava8Parser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(SimolJava8Parser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(SimolJava8Parser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(SimolJava8Parser.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(SimolJava8Parser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(SimolJava8Parser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(SimolJava8Parser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(SimolJava8Parser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(SimolJava8Parser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(SimolJava8Parser.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(SimolJava8Parser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(SimolJava8Parser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(SimolJava8Parser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(SimolJava8Parser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(SimolJava8Parser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(SimolJava8Parser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(SimolJava8Parser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(SimolJava8Parser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(SimolJava8Parser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(SimolJava8Parser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(SimolJava8Parser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(SimolJava8Parser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(SimolJava8Parser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(SimolJava8Parser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(SimolJava8Parser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(SimolJava8Parser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(SimolJava8Parser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(SimolJava8Parser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(SimolJava8Parser.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(SimolJava8Parser.Throws_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(SimolJava8Parser.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(SimolJava8Parser.ExceptionTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(SimolJava8Parser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(SimolJava8Parser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(SimolJava8Parser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(SimolJava8Parser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(SimolJava8Parser.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(SimolJava8Parser.InstanceInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(SimolJava8Parser.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(SimolJava8Parser.StaticInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(SimolJava8Parser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(SimolJava8Parser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifier(SimolJava8Parser.ConstructorModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifier(SimolJava8Parser.ConstructorModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarator(SimolJava8Parser.ConstructorDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarator(SimolJava8Parser.ConstructorDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(SimolJava8Parser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(SimolJava8Parser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(SimolJava8Parser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(SimolJava8Parser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(SimolJava8Parser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(SimolJava8Parser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(SimolJava8Parser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(SimolJava8Parser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(SimolJava8Parser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(SimolJava8Parser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantList(SimolJava8Parser.EnumConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantList(SimolJava8Parser.EnumConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(SimolJava8Parser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(SimolJava8Parser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantModifier(SimolJava8Parser.EnumConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantModifier(SimolJava8Parser.EnumConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(SimolJava8Parser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(SimolJava8Parser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(SimolJava8Parser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(SimolJava8Parser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(SimolJava8Parser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(SimolJava8Parser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#simolInterfaceRole}.
	 * @param ctx the parse tree
	 */
	void enterSimolInterfaceRole(SimolJava8Parser.SimolInterfaceRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#simolInterfaceRole}.
	 * @param ctx the parse tree
	 */
	void exitSimolInterfaceRole(SimolJava8Parser.SimolInterfaceRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifier(SimolJava8Parser.InterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifier(SimolJava8Parser.InterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(SimolJava8Parser.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(SimolJava8Parser.ExtendsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(SimolJava8Parser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(SimolJava8Parser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(SimolJava8Parser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(SimolJava8Parser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(SimolJava8Parser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(SimolJava8Parser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifier(SimolJava8Parser.ConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifier(SimolJava8Parser.ConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(SimolJava8Parser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(SimolJava8Parser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(SimolJava8Parser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(SimolJava8Parser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(SimolJava8Parser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(SimolJava8Parser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(SimolJava8Parser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(SimolJava8Parser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeMemberDeclaration(SimolJava8Parser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeMemberDeclaration(SimolJava8Parser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(SimolJava8Parser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(SimolJava8Parser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementModifier(SimolJava8Parser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementModifier(SimolJava8Parser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(SimolJava8Parser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(SimolJava8Parser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(SimolJava8Parser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(SimolJava8Parser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(SimolJava8Parser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(SimolJava8Parser.NormalAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(SimolJava8Parser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(SimolJava8Parser.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(SimolJava8Parser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(SimolJava8Parser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(SimolJava8Parser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(SimolJava8Parser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(SimolJava8Parser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(SimolJava8Parser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(SimolJava8Parser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(SimolJava8Parser.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(SimolJava8Parser.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(SimolJava8Parser.MarkerAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(SimolJava8Parser.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(SimolJava8Parser.SingleElementAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(SimolJava8Parser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(SimolJava8Parser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(SimolJava8Parser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(SimolJava8Parser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SimolJava8Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SimolJava8Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(SimolJava8Parser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(SimolJava8Parser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(SimolJava8Parser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(SimolJava8Parser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(SimolJava8Parser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(SimolJava8Parser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(SimolJava8Parser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(SimolJava8Parser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SimolJava8Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SimolJava8Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(SimolJava8Parser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(SimolJava8Parser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(SimolJava8Parser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(SimolJava8Parser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#emptyStatement_}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement_(SimolJava8Parser.EmptyStatement_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#emptyStatement_}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement_(SimolJava8Parser.EmptyStatement_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(SimolJava8Parser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(SimolJava8Parser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatementNoShortIf(SimolJava8Parser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatementNoShortIf(SimolJava8Parser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(SimolJava8Parser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(SimolJava8Parser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(SimolJava8Parser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(SimolJava8Parser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(SimolJava8Parser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(SimolJava8Parser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(SimolJava8Parser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(SimolJava8Parser.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(SimolJava8Parser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(SimolJava8Parser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(SimolJava8Parser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(SimolJava8Parser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(SimolJava8Parser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(SimolJava8Parser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(SimolJava8Parser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(SimolJava8Parser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(SimolJava8Parser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(SimolJava8Parser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabels(SimolJava8Parser.SwitchLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabels(SimolJava8Parser.SwitchLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(SimolJava8Parser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(SimolJava8Parser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(SimolJava8Parser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(SimolJava8Parser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(SimolJava8Parser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(SimolJava8Parser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(SimolJava8Parser.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(SimolJava8Parser.WhileStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(SimolJava8Parser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(SimolJava8Parser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(SimolJava8Parser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(SimolJava8Parser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(SimolJava8Parser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(SimolJava8Parser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(SimolJava8Parser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(SimolJava8Parser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(SimolJava8Parser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(SimolJava8Parser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(SimolJava8Parser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(SimolJava8Parser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(SimolJava8Parser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(SimolJava8Parser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(SimolJava8Parser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(SimolJava8Parser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(SimolJava8Parser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(SimolJava8Parser.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatementNoShortIf(SimolJava8Parser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatementNoShortIf(SimolJava8Parser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(SimolJava8Parser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(SimolJava8Parser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(SimolJava8Parser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(SimolJava8Parser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(SimolJava8Parser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(SimolJava8Parser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(SimolJava8Parser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(SimolJava8Parser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(SimolJava8Parser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(SimolJava8Parser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(SimolJava8Parser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(SimolJava8Parser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(SimolJava8Parser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(SimolJava8Parser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(SimolJava8Parser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(SimolJava8Parser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterCatchFormalParameter(SimolJava8Parser.CatchFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitCatchFormalParameter(SimolJava8Parser.CatchFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(SimolJava8Parser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(SimolJava8Parser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#finally_}.
	 * @param ctx the parse tree
	 */
	void enterFinally_(SimolJava8Parser.Finally_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#finally_}.
	 * @param ctx the parse tree
	 */
	void exitFinally_(SimolJava8Parser.Finally_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryWithResourcesStatement(SimolJava8Parser.TryWithResourcesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryWithResourcesStatement(SimolJava8Parser.TryWithResourcesStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(SimolJava8Parser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(SimolJava8Parser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#resourceList}.
	 * @param ctx the parse tree
	 */
	void enterResourceList(SimolJava8Parser.ResourceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#resourceList}.
	 * @param ctx the parse tree
	 */
	void exitResourceList(SimolJava8Parser.ResourceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(SimolJava8Parser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(SimolJava8Parser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(SimolJava8Parser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(SimolJava8Parser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(SimolJava8Parser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(SimolJava8Parser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(SimolJava8Parser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(SimolJava8Parser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(SimolJava8Parser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(SimolJava8Parser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(SimolJava8Parser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(SimolJava8Parser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(SimolJava8Parser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(SimolJava8Parser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(SimolJava8Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(SimolJava8Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(SimolJava8Parser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(SimolJava8Parser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(SimolJava8Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(SimolJava8Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(SimolJava8Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(SimolJava8Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(SimolJava8Parser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(SimolJava8Parser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(SimolJava8Parser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(SimolJava8Parser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(SimolJava8Parser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(SimolJava8Parser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(SimolJava8Parser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(SimolJava8Parser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(SimolJava8Parser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(SimolJava8Parser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(SimolJava8Parser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(SimolJava8Parser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(SimolJava8Parser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(SimolJava8Parser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(SimolJava8Parser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(SimolJava8Parser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lf_primary(SimolJava8Parser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lf_primary(SimolJava8Parser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(SimolJava8Parser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(SimolJava8Parser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(SimolJava8Parser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(SimolJava8Parser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(SimolJava8Parser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(SimolJava8Parser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(SimolJava8Parser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(SimolJava8Parser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(SimolJava8Parser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(SimolJava8Parser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(SimolJava8Parser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(SimolJava8Parser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(SimolJava8Parser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(SimolJava8Parser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(SimolJava8Parser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(SimolJava8Parser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(SimolJava8Parser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(SimolJava8Parser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(SimolJava8Parser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(SimolJava8Parser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(SimolJava8Parser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(SimolJava8Parser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(SimolJava8Parser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(SimolJava8Parser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SimolJava8Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SimolJava8Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(SimolJava8Parser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(SimolJava8Parser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(SimolJava8Parser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(SimolJava8Parser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(SimolJava8Parser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(SimolJava8Parser.InferredFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(SimolJava8Parser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(SimolJava8Parser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(SimolJava8Parser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(SimolJava8Parser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SimolJava8Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SimolJava8Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(SimolJava8Parser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(SimolJava8Parser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(SimolJava8Parser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(SimolJava8Parser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(SimolJava8Parser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(SimolJava8Parser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(SimolJava8Parser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(SimolJava8Parser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(SimolJava8Parser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(SimolJava8Parser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(SimolJava8Parser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(SimolJava8Parser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(SimolJava8Parser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(SimolJava8Parser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(SimolJava8Parser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(SimolJava8Parser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(SimolJava8Parser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(SimolJava8Parser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(SimolJava8Parser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(SimolJava8Parser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(SimolJava8Parser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(SimolJava8Parser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(SimolJava8Parser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(SimolJava8Parser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(SimolJava8Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(SimolJava8Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(SimolJava8Parser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(SimolJava8Parser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(SimolJava8Parser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(SimolJava8Parser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(SimolJava8Parser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(SimolJava8Parser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(SimolJava8Parser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(SimolJava8Parser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(SimolJava8Parser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(SimolJava8Parser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(SimolJava8Parser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(SimolJava8Parser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(SimolJava8Parser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(SimolJava8Parser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(SimolJava8Parser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(SimolJava8Parser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(SimolJava8Parser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(SimolJava8Parser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimolJava8Parser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(SimolJava8Parser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimolJava8Parser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(SimolJava8Parser.CastExpressionContext ctx);
}