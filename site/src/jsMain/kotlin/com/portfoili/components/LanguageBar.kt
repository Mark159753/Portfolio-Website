package com.portfoili.components

import androidx.compose.runtime.Composable
import com.portfoili.styles.colors.StyleColors
import com.portfoili.styles.types.FontTypes
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Span

@Composable
fun LanguageBar(
    modifier: Modifier = Modifier,
    item:ProgramLngModel
){
    Column(
        modifier = modifier
            .fillMaxWidth()
    ) {
        SpanText(
            text = item.name,
            modifier = FontTypes
                .regular
                .fontWeight(FontWeight.Bold)
                .color(StyleColors.onPrimary)
        )

        Row(
            modifier = Modifier
                .margin(top = 8.px)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .height(20.px)
                    .weight(1)
            ) {
                Span(
                    attrs = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .borderRadius(100.px)
                        .backgroundColor(Color("#BCBCBC"))
                        .toAttrs()
                )

                Span(
                    attrs = Modifier
                        .fillMaxWidth(item.level.percent)
                        .fillMaxHeight()
                        .borderRadius(100.px)
                        .backgroundColor(StyleColors.onPrimary)
                        .toAttrs()
                )
            }

            SpanText(
                text = "${item.level}%",
                modifier = FontTypes
                    .regular
                    .margin(left = 8.px)
                    .fontWeight(FontWeight.Bold)
                    .color(StyleColors.onPrimary)
            )
        }
    }
}

data class ProgramLngModel(
    val name:String,
    val level:Int
)