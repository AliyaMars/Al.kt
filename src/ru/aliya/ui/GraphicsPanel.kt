package ru.aliya.ui

import ru.aliya.ui.painting.CartesianPainter
import ru.aliya.ui.painting.FunctionPainter
import ru.aliya.ui.painting.Painter
import java.awt.Color
import java.awt.Graphics
import javax.swing.JPanel

class GraphicsPanel(val painters: List<Painter>):JPanel() {
    override fun paint(g: Graphics?) {

        super.paint(g)
        g?.let {
            painters.forEach{ p->
                p.paint(it)
            }
        }
    }
}