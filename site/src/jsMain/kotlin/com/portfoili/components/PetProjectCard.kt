package com.portfoili.components

import androidx.compose.runtime.Composable
import com.portfoili.styles.arrow_top_path
import com.portfoili.styles.colors.StyleColors
import com.portfoili.styles.common.undecoratedLinkStyle
import com.portfoili.styles.types.FontTypes
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.Divider
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.shapes.Circle
import com.varabyte.kobweb.silk.theme.shapes.clip
import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Span

@Composable
fun PetProjectCard(
    modifier: Modifier = Modifier,
    title:String,
    shortDescription:String,
    image:String,
    color: CSSColorValue,
    link:String
){
    Link(
        path = link,
        modifier = modifier,
        variant =  undecoratedLinkStyle
    ) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
            Divider(
                modifier = Modifier
                    .height(2.px)
                    .fillMaxWidth()
                    .color(StyleColors.divider)
                    .backgroundColor(StyleColors.divider)
            )

            Row(
                modifier = Modifier
                    .margin(top = 8.px)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
            ) {

                Column(
                    modifier = Modifier.fillMaxWidth(75.percent)
                ) {
                    SpanText(
                        text = title,
                        modifier = FontTypes
                            .h5.fontWeight(FontWeight.Normal)
                            .fontSize(30.px)
                            .color(StyleColors.onPrimary)
                    )

                    SpanText(
                        text = shortDescription,
                        modifier = FontTypes.menuTitle
                            .color(StyleColors.onPrimary)
                    )
                }

                Span(attrs = Modifier.weight(1f).toAttrs())

                Box(
                    modifier = Modifier
                        .padding(4.px)
                        .size(50.px)
                        .clip(Circle())
                        .backgroundColor(StyleColors.secondary),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        src = arrow_top_path
                    )
                }
            }

            Box(
                modifier = Modifier
                    .margin(top = 8.px)
                    .fillMaxWidth()
                    .aspectRatio(width = 1f, height = 1.02f)
                    .backgroundColor(color),
                contentAlignment = Alignment.BottomCenter
            ) {
                Image(
                    src = image,
                    modifier = Modifier
                        .objectFit(ObjectFit.Contain)
                        .fillMaxWidth(90.percent)
                        .aspectRatio(width = 1f, height = 1.02f)
                )
            }
        }
    }
}