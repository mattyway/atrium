package ch.tutteli.atrium.core.polyfills

import kotlin.reflect.KClass

actual val KClass<*>.fullName get(): String = simpleName ?: "<unknown class name>"