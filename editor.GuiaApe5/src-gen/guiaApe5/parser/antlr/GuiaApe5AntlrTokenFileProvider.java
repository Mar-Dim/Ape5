/*
 * generated by Xtext 2.38.0
 */
package guiaApe5.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class GuiaApe5AntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("guiaApe5/parser/antlr/internal/InternalGuiaApe5.tokens");
	}
}
