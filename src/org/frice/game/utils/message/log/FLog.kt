package org.frice.game.utils.message.log

/**
 * Created by ice1000 on 2016/8/14.
 * @author ice1000
 * @since v0.2
 */
class FatalError
@JvmOverloads
constructor(s: String = "") : Error(s) {
	init {
		FLog.e(s)
	}
}

/**
 * Created by ice1000 on 2016/8/13.
 * @author ice1000
 * @since v0.1
 */
object FLog {
	@JvmStatic
	fun v(e: Any?) = verbose(e)

	@JvmStatic
	fun d(e: Any?) = debug(e)

	@JvmStatic
	fun i(e: Any?) = info(e)

	@JvmStatic
	fun w(e: Any?) = warning(e)

	@JvmStatic
	fun e(e: Any?) = error(e)

	@JvmStatic
	fun verbose(e: Any?) {
		if (level >= VERBOSE) println(e)
	}

	@JvmStatic
	fun debug(e: Any?) {
		if (level >= DEBUG) println(e)
	}

	@JvmStatic
	fun info(e: Any?) {
		if (level >= INFO) println(e)
	}

	@JvmStatic
	fun warning(e: Any?) {
		if (level >= WARN) println(e)
	}

	@JvmStatic
	fun error(e: Any?) {
		if (level >= ERROR) System.err.println(e)
	}

	var level = 0
	const val VERBOSE = 0
	const val DEBUG = 10
	const val INFO = 20
	const val WARN = 30
	const val ERROR = 40
}
