package ru.aliya.ui.painting

import java.awt.*
import kotlin.math.abs

class PointsPainter(private val plane : CartesianPlane) : Painter {
    private val points: MutableMap<Double, Double> = mutableMapOf()
    private val pSize = 8
    var pColor : Color = Color.GREEN
    var flag = false
    override fun paint(g: Graphics) {
        with(plane) {
            (g as Graphics2D).apply {
                stroke = BasicStroke(1F)
                color = pColor
                if (flag) {
                    for (x in points.keys) {
                        drawOval(xCrt2Scr(x) - pSize / 2, yCrt2Scr(points.getValue(x)) - pSize / 2, pSize, pSize)
                        fillOval(xCrt2Scr(x) - pSize / 2, yCrt2Scr(points.getValue(x)) - pSize / 2, pSize, pSize)
                    }
                }
            }
        }
    }

    fun addPoint (x : Double, y : Double) : Boolean {
        points.keys.forEach{
            if (abs(plane.xCrt2Scr(x) - plane.xCrt2Scr(it)) <= pSize) return false
        }
        points.put(x, y)
        return true
    }


}