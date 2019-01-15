package io.github.karino2.kotlitex

data class FontMetrics(val cssEmPerMu: Double,
                       val slant: Double,
                       val space: Double,
                       val stretch: Double,
                       val shrink: Double,
                       val xHeight: Double,
                       val quad: Int,
                       val extraSpace: Double,
                       val num1: Double,
                       val num2: Double,
                       val num3: Double,
                       val denom1: Double,
                       val denom2: Double,
                       val sup1: Double,
                       val sup2: Double,
                       val sup3: Double,
                       val sub1: Double,
                       val sub2: Double,
                       val supDrop: Double,
                       val subDrop: Double,
                       val delim1: Double,
                       val delim2: Double,
                       val axisHeight: Double,
                       val defaultRuleThickness: Double,
                       val bigOpSpacing1: Double,
                       val bigOpSpacing2: Double,
                       val bigOpSpacing3: Double,
                       val bigOpSpacing4: Double,
                       val bigOpSpacing5: Double,
                       val sqrtRuleThickness: Double,
                       val ptPerEm: Int,
                       val doubleRuleSep: Double
)