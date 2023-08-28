package com.portfoili

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.navigation.UncoloredLinkVariant
import com.varabyte.kobweb.silk.components.navigation.UndecoratedLinkVariant
import com.varabyte.kobweb.silk.components.style.*
import com.varabyte.kobweb.silk.components.style.common.SmoothColorStyle

import org.jetbrains.compose.web.css.*

@InitSilk
fun updateTheme(ctx: InitSilkContext) = ctx.stylesheet.apply {
    registerStyle("body"){
        base {
            Modifier
                .padding(0.px)
                .margin(0.px)
        }
    }

    registerStyle("a"){
        UndecoratedLinkVariant.then(UncoloredLinkVariant)
    }
}


@App
@Composable
fun MyApp(content: @Composable () -> Unit) {
    SilkApp {
        Surface(
            SmoothColorStyle
                .toModifier()
                .minWidth(100.percent)
                .minHeight(100.vh)
        ) {
            content()
        }
    }
}
