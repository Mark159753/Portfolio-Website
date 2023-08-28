package com.portfoili.styles.types

import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import org.jetbrains.compose.web.css.em
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.pt
import org.jetbrains.compose.web.css.px

object FontTypes{
    val h1 = Modifier
        .fontFamily("Caros")
        .fontWeight(FontWeight.Bold)
        .fontSize(74.px)

    val h2 = Modifier
        .fontFamily("Caros")
        .fontWeight(FontWeight.Bold)
        .fontSize(60.px)

    val h3 = Modifier
        .fontFamily("Caros")
        .fontWeight(FontWeight.Normal)
        .fontSize(44.px)

    val h4 = Modifier
        .fontFamily("Caros")
        .fontWeight(FontWeight.Bold)
        .fontSize(38.px)

    val h5 = Modifier
        .fontFamily("Caros")
        .fontWeight(FontWeight.Bold)
        .fontSize(26.px)

    val menuTitle = Modifier
        .fontFamily("Caros")
        .fontWeight(FontWeight.Light)
        .fontSize(14.px)

    val subtitleStyle = Modifier
        .fontFamily("Caros")
        .fontWeight(FontWeight.Light)
        .fontSize(22.px)

    val smallText = Modifier
        .fontFamily("Caros")
        .fontWeight(FontWeight.Light)
        .fontSize(12.px)

    val regular = Modifier
        .fontFamily("Caros")
        .fontWeight(FontWeight.Light)
        .fontSize(18.px)
}