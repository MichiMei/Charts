package com.hd.charts.style

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.hd.charts.common.style.ChartViewStyle

@Immutable
class BarChartViewStyle private constructor(
    val chartViewStyle: ChartViewStyle,
    val barChartStyle: BarChartStyle
) {
    class Builder {
        private var chartViewStyleBuilder = ChartViewStyle.Builder()
        private val barChartStyleBuilder = BarChartStyle.Builder()

        fun chartViewStyle(block: ChartViewStyle.Builder.() -> Unit) {
            chartViewStyleBuilder.apply(block)
        }

        fun chartViewStyle(builder: ChartViewStyle.Builder) {
            chartViewStyleBuilder = builder
        }

        fun chartStyle(block: BarChartStyle.Builder.() -> Unit) {
            barChartStyleBuilder.apply(block)
        }

        fun build(): BarChartViewStyle {
            return BarChartViewStyle(
                chartViewStyle = chartViewStyleBuilder.build(),
                barChartStyle = barChartStyleBuilder.build()
            )
        }
    }
}

@Immutable
class BarChartStyle(
    val barColor: Color?,
    val space: Dp?
) {
    class Builder {
        var barColor: Color? = null
        var space: Dp? = null

        fun build(): BarChartStyle {
            return BarChartStyle(
                barColor = barColor,
                space = space
            )
        }
    }
}
