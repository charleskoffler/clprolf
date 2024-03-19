package org.simol.compiler;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link SimolJava8ParserListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
@SuppressWarnings("CheckReturnValue")
public class SimolJava8CustomListener extends SimolJava8ParserBaseListener {
	private boolean previousWasIdentifierOrKeyword = false;
	//
	private StringBuilder output = new StringBuilder();
	
	public String getOutput(){
			return output.toString().trim();
	}
	//
	
	/**
	 * {@inheritDoc}
	 * Contain the code generation for simol.
	 * 
	 */
	@Override public void visitTerminal(TerminalNode node) {
		boolean simolEmptyKeywordMet = false;
        String text = node.getText();
        if (isIdentifierOrKeyword(text)) {
			//Code generation
			//Replacement of simol keywords.
			switch (text) {
					case "simu_real_world_obj":
					case "simu_comp_as_worker":
					case "model_real_world_obj":
					case "information":
						text = "class";
						break;
					
					case "compat_interf_version":
					case "compat_interf_capacity":
						text = "interface";
						break;
					
					case "nature":
						text = "extends";
						break;
						
					case "contracts":
						text = "implements";
						break;
					case "class_for":
					case "underst":
					case "with_compat":
					case "long_action":
					case "prevent_missing_collision":
					case "one_at_a_time":
					case "tour_monitor":
					case "for_every_thread":
					case "dependent_activity":
						text = "";
						simolEmptyKeywordMet = true; //As if there was not a keyword.
						break;
					default:
						break;
			}
			
			//The generated java code can not have two closely identifiers or keywords, the other cases are ok.
            if (previousWasIdentifierOrKeyword) {
                output.append(" " + text);
            } else {
                output.append(text);
            }
            if (!simolEmptyKeywordMet) previousWasIdentifierOrKeyword = true; //two simol cases would happen where it would become false.
			else previousWasIdentifierOrKeyword = false;
			
        } else {
        	if (!text.equals("<EOF>")) {
        		output.append(text);
        	}
            previousWasIdentifierOrKeyword = false;
        }
    }

    private boolean isIdentifierOrKeyword(String text) {
        // Add your logic to determine if text is an identifier or keyword
        // For example, you can check if it's a valid Java identifier
        return text.matches("[a-zA-Z_][a-zA-Z0-9_]*");
    }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}