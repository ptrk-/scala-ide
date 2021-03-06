package scala.tools.eclipse.semantichighlighting

import scala.tools.eclipse.properties.syntaxcolouring.ScalaSyntaxClasses

import org.eclipse.jface.preference.IPreferenceStore

class Preferences(val store: IPreferenceStore) {
  def isEnabled(): Boolean =
    store.getBoolean(ScalaSyntaxClasses.ENABLE_SEMANTIC_HIGHLIGHTING)

  def isStrikethroughDeprecatedDecorationEnabled(): Boolean =
    store.getBoolean(ScalaSyntaxClasses.STRIKETHROUGH_DEPRECATED)

  def isUseSyntacticHintsEnabled(): Boolean =
    store.getBoolean(ScalaSyntaxClasses.USE_SYNTACTIC_HINTS)
}

object Preferences {
  def apply(store: IPreferenceStore): Preferences = new Preferences(store)
}