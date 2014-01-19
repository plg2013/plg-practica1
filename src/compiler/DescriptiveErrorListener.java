package compiler;

import org.antlr.v4.runtime.*;

import utils.Logs;


public class DescriptiveErrorListener extends BaseErrorListener {
    public static DescriptiveErrorListener INSTANCE = new DescriptiveErrorListener();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg, RecognitionException e)
    {
        String sourceName = recognizer.getInputStream().getSourceName();
        
        if (sourceName == null) sourceName = "";
        
        if (!sourceName.isEmpty()) {
            sourceName = String.format("%s:%d:%d: ", sourceName, line, charPositionInLine);
        }

        Logs.addError("[Syntax] " + sourceName + "line " + line + ":" + charPositionInLine + " " + msg);
    }

}
