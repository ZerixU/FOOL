// Generated from /Users/Domenico/IdeaProjects/Fool/src/parser/FOOL.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FOOLParser}.
 */
public interface FOOLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code singleExp}
	 * labeled alternative in {@link FOOLParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterSingleExp(FOOLParser.SingleExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleExp}
	 * labeled alternative in {@link FOOLParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitSingleExp(FOOLParser.SingleExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letInExp}
	 * labeled alternative in {@link FOOLParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterLetInExp(FOOLParser.LetInExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letInExp}
	 * labeled alternative in {@link FOOLParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitLetInExp(FOOLParser.LetInExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classExpmissing}
	 * labeled alternative in {@link FOOLParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterClassExpmissing(FOOLParser.ClassExpmissingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classExpmissing}
	 * labeled alternative in {@link FOOLParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitClassExpmissing(FOOLParser.ClassExpmissingContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(FOOLParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(FOOLParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLParser#classdec}.
	 * @param ctx the parse tree
	 */
	void enterClassdec(FOOLParser.ClassdecContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#classdec}.
	 * @param ctx the parse tree
	 */
	void exitClassdec(FOOLParser.ClassdecContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLParser#letVar}.
	 * @param ctx the parse tree
	 */
	void enterLetVar(FOOLParser.LetVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#letVar}.
	 * @param ctx the parse tree
	 */
	void exitLetVar(FOOLParser.LetVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLParser#vardec}.
	 * @param ctx the parse tree
	 */
	void enterVardec(FOOLParser.VardecContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#vardec}.
	 * @param ctx the parse tree
	 */
	void exitVardec(FOOLParser.VardecContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLParser#varasm}.
	 * @param ctx the parse tree
	 */
	void enterVarasm(FOOLParser.VarasmContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#varasm}.
	 * @param ctx the parse tree
	 */
	void exitVarasm(FOOLParser.VarasmContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLParser#fun}.
	 * @param ctx the parse tree
	 */
	void enterFun(FOOLParser.FunContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#fun}.
	 * @param ctx the parse tree
	 */
	void exitFun(FOOLParser.FunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varAssignment}
	 * labeled alternative in {@link FOOLParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterVarAssignment(FOOLParser.VarAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varAssignment}
	 * labeled alternative in {@link FOOLParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitVarAssignment(FOOLParser.VarAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funDeclaration}
	 * labeled alternative in {@link FOOLParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterFunDeclaration(FOOLParser.FunDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funDeclaration}
	 * labeled alternative in {@link FOOLParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitFunDeclaration(FOOLParser.FunDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(FOOLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(FOOLParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(FOOLParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(FOOLParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(FOOLParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(FOOLParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(FOOLParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(FOOLParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(FOOLParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(FOOLParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intVal}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterIntVal(FOOLParser.IntValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intVal}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitIntVal(FOOLParser.IntValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolVal}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterBoolVal(FOOLParser.BoolValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolVal}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitBoolVal(FOOLParser.BoolValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code baseExp}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterBaseExp(FOOLParser.BaseExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code baseExp}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitBaseExp(FOOLParser.BaseExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifExp}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterIfExp(FOOLParser.IfExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifExp}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitIfExp(FOOLParser.IfExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varExp}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterVarExp(FOOLParser.VarExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varExp}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitVarExp(FOOLParser.VarExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funExp}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterFunExp(FOOLParser.FunExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funExp}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitFunExp(FOOLParser.FunExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methExp}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterMethExp(FOOLParser.MethExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methExp}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitMethExp(FOOLParser.MethExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newExp}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNewExp(FOOLParser.NewExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newExp}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNewExp(FOOLParser.NewExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code null}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNull(FOOLParser.NullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code null}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNull(FOOLParser.NullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asmStm}
	 * labeled alternative in {@link FOOLParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterAsmStm(FOOLParser.AsmStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asmStm}
	 * labeled alternative in {@link FOOLParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitAsmStm(FOOLParser.AsmStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStm}
	 * labeled alternative in {@link FOOLParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterIfStm(FOOLParser.IfStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStm}
	 * labeled alternative in {@link FOOLParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitIfStm(FOOLParser.IfStmContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLParser#stms}.
	 * @param ctx the parse tree
	 */
	void enterStms(FOOLParser.StmsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#stms}.
	 * @param ctx the parse tree
	 */
	void exitStms(FOOLParser.StmsContext ctx);
}