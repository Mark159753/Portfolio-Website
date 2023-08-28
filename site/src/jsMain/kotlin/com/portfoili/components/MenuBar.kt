package com.portfoili.components

import androidx.compose.runtime.Composable
import com.portfoili.styles.colors.StyleColors
import com.portfoili.styles.common.undecoratedLinkStyle
import com.portfoili.styles.developer
import com.portfoili.styles.github_icon_path
import com.portfoili.styles.menuTitles
import com.portfoili.styles.my_github_link
import com.portfoili.styles.types.FontTypes
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.after
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.hover
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Span

@Composable
fun MenuBar(
    modifier: Modifier = Modifier
){
    Row(
        modifier = modifier
            .width(100.percent),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        SpanText(
            developer,
            modifier = FontTypes.h5
                .color(StyleColors.onPrimary)
        )

        Span(attrs = Modifier.weight(1f).toAttrs())

        MenuItems()

        Span(attrs = Modifier.width(10.percent).toAttrs())

        Link(my_github_link){
            Image(
                src = github_icon_path,
                modifier = Modifier.size(32.px)
            )
        }
    }
}

@Composable
private fun MenuItems(){
    val bp = rememberBreakpoint()

    if (bp > Breakpoint.MD){
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .display(DisplayStyle.Flex)
                .gap(56.px)
        ){
            menuTitles.forEach { item ->
                Link(
                    path = "#$item",
                    variant = undecoratedLinkStyle
                    ){
                    SpanText(
                        item,
                        modifier = ButtonTopMenuItemStyle
                            .toModifier()
                            .then(FontTypes.menuTitle)
                            .color(StyleColors.onPrimary)
                    )
                }
            }
        }
    }
}

val ButtonTopMenuItemStyle by ComponentStyle{

    base {
        Modifier
            .cursor(Cursor.Pointer)
    }

    after{
        Modifier
            .content("")
            .display(DisplayStyle.Block)
            .styleModifier {
                property("margin", "auto")
            }
            .height(1.px)
            .width(0.px)
            .borderRadius(200.px)
            .top(5.px)
            .backgroundColor(Colors.Transparent)
            .transition(CSSTransition("all", duration = 300.ms))
    }

    hover.plus(after).invoke {
        Modifier
            .width(100.percent)
            .backgroundColor(StyleColors.onPrimary)
    }

}