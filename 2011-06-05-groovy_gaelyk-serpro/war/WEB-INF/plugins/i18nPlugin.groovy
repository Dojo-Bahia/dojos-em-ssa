import groovyx.gaelyk.logging.GroovyLogger
import java.text.MessageFormat

def log = new GroovyLogger("i18nPlugin")
log.info "Registering i18n plugin..."

// Adding syntax sugar to classic Java ResourceBundle
class ResourceBundleUtils {
	def propertyMissing(String name) { this.getString(name) }
	def methodMissing(String name, args) {
		MessageFormat.format(this.getString(name), args)
	}
}
ResourceBundle.metaClass.mixin ResourceBundleUtils

binding {
	I18N_FILES_PATH = "WEB-INF/i18n"
	BUNDLE_NAME = "messages"
	DEFAULT_LOCALE = "pt_BR"

	// Instantiate your resource bundle for default locale here
	msg = new PropertyResourceBundle(new
		FileReader("$I18N_FILES_PATH/${BUNDLE_NAME}_${DEFAULT_LOCALE}.properties"))
}

// Use this section if you want to use the browser locale
/*
before {
	binding.msg = new PropertyResourceBundle(new
		FileReader("${binding.I18N_FILES_PATH}/${binding.BUNDLE_NAME}_${request.locale}.properties"))
}
*/
