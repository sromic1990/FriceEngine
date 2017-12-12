package org.frice.obj.button

import org.frice.event.MOUSE_PRESSED
import org.frice.event.OnMouseEvent
import org.frice.resource.graphics.ColorResource
import java.util.function.Consumer

/**
 * Created by ice1000 on 2016/8/18.
 *
 * @author ice1000
 * @since v0.3.3
 */
open class SimpleButton
@JvmOverloads
constructor(
	var colorResource: ColorResource = ColorResource.GRAY,
	override var text: String,
	override var x: Double,
	override var y: Double,
	override var w: Double,
	override var h: Double) : FButton, FText() {

	protected var bool = false

	override var onMouseListener: Consumer<OnMouseEvent>? = null

	override val color: ColorResource
		get() = if (bool) ColorResource(colorResource.color.darker()) else colorResource

	override fun buttonPressed(e: OnMouseEvent) {
		bool = e.type == MOUSE_PRESSED
	}
}