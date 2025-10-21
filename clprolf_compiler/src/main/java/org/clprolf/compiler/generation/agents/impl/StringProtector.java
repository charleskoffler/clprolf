package org.clprolf.compiler.generation.agents.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.clprolf.framework.java.Agent;
import org.clprolf.framework.java.With_compat;

/**
 * The agent detects string literals ("...") inside an already parsed and valid text.
 * @author
 *
 */
@Agent
public class StringProtector {

    private @With_compat List<String> storedStrings;
    
    public StringProtector() {
    	this.storedStrings = null;
    }

    //TODO Handles standard Java 8 string literals ("...") — excluding Java 13+ text blocks ("""...""")
    public String shield(String src) {
    	storedStrings =  new ArrayList<>();
    	
    	// "(\\.|[^"\\])*" :
    	// A starting double quote "
    	// followed by zero or more elements,
    	// each element being either:
    	//   • an escaped sequence (\ + any character),
    	//   • or a normal character (anything except " and \),
    	// then a closing double quote ".
        Matcher matcher = Pattern.compile("\"(\\\\.|[^\"\\\\])*\"").matcher(src);
        int index = 0;
        while (matcher.find()) {
            String str = matcher.group();
            storedStrings.add(str);
            src = src.replace(str, "__CLPROLFSTRING_" + (index++) + "__");
        }
        return src;
    }

    public String restore(String src) {
        for (int i = 0; i < storedStrings.size(); i++) {
            src = src.replace("__CLPROLFSTRING_" + i + "__", storedStrings.get(i));
        }
        return src;
    }
}