package com.portfoili.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.BoxScope
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.compose.ui.toAttrs
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Section

@Composable
fun SectionLayout(
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.()->Unit
){
    Section(
        attrs = modifier
            .fillMaxWidth()
            .toAttrs()
    ){
        Box(
            modifier = Modifier
                .styleModifier {
                    property("margin", "0 auto")
                }
                .padding(leftRight = 16.px)
                .fillMaxHeight()
                .maxWidth(1280.px),
            content = content
        )
    }
}