package com.portfoili.pages.sections

import androidx.compose.runtime.Composable
import com.portfoili.components.SectionLayout
import com.portfoili.styles.*
import com.portfoili.styles.colors.StyleColors
import com.portfoili.styles.common.undecoratedLinkStyle
import com.portfoili.styles.types.FontTypes
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.shapes.Circle
import com.varabyte.kobweb.silk.theme.shapes.clip
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Span

@Composable
fun ContactsSection(){
    SectionLayout(
        modifier = Modifier
            .id("CONTACTS")
            .minHeight(100.vh)
    ){

        Column(
            modifier = Modifier
                .minHeight(100.vh)
                .fillMaxSize()
        ) {
            SpanText(
                text = contactTitle,
                modifier = FontTypes.h3
                    .margin(top = 50.px)
                    .fontWeight(FontWeight.Bold)
                    .color(StyleColors.onPrimary)
                    .align(Alignment.CenterHorizontally)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .margin(top = 50.px),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                ContactsColumn(
                    modifier = Modifier.width(40.percent)
                )

                SayHiColumn(
                    modifier = Modifier.width(34.percent)
                )
            }

            Span(
                attrs = Modifier.weight(1f).toAttrs()
            )

            Footer(
                modifier = Modifier
                    .margin(top = 50.px)
            )
        }
    }
}

@Composable
private fun ContactsColumn(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
    ) {
        SpanText(
            text = letsDiscuss,
            modifier = FontTypes.h3
                .fontWeight(FontWeight.Bold)
                .color(StyleColors.onPrimary)
        )
        SpanText(
            text = yourProject,
            modifier = FontTypes.h3
                .fontWeight(FontWeight.Bold)
                .color(StyleColors.onPrimary)
        )


        ContactItem(
            modifier = Modifier
                .margin(top = 50.px)
                .fillMaxWidth(),
            title = emailTitle,
            value = email,
            icon = chatIconPath
        )

        ContactItem(
            modifier = Modifier
                .fillMaxWidth()
                .margin(top = 16.px),
            title = phoneTitle,
            value = phone,
            icon = callIconPath
        )
    }
}

@Composable
private fun SayHiColumn(
    modifier: Modifier = Modifier
){
    Box(
        modifier = modifier
            .aspectRatio(1f)
            .borderRadius(100.percent)
            .border(width = 1.px, LineStyle.Solid, color = StyleColors.onPrimary),
        contentAlignment = Alignment.Center
    ) {

        Row(
            modifier = Modifier
                .padding(14.px)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Image(
                src = wavingHandPath,
                modifier = Modifier
                    .size(24.px)
                    .objectFit(ObjectFit.Contain)
            )

            SpanText(
                text = sayHi,
                modifier = FontTypes.regular
                    .color(StyleColors.onPrimary)
                    .margin(left = 6.px)
            )

            Span(attrs = Modifier.width(28.percent).toAttrs())

            Link(
                path = "#HOME",
                variant = undecoratedLinkStyle,
                modifier = Modifier.width(30.percent)
            ){
                Box(
                    modifier = Modifier
                        .padding(22.percent)
                        .fillMaxWidth()
                        .aspectRatio(1f)
                        .clip(Circle())
                        .backgroundColor(StyleColors.secondary),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        src = arrow_top_path,
                        modifier = Modifier
                            .fillMaxWidth()
                            .objectFit(ObjectFit.Contain)
                    )
                }
            }
        }

        Span(
            attrs = Modifier
                .translateY(26.px)
                .width(80.percent)
                .height(1.px)
                .backgroundColor(StyleColors.onPrimary)
                .rotate(26.deg)
                .toAttrs()
        )
    }
}

@Composable
private fun ContactItem(
    modifier: Modifier = Modifier,
    title:String,
    value:String,
    icon:String
){
    Column(
        modifier = modifier
    ) {

        Span(
            attrs = Modifier
                .fillMaxWidth()
                .height(1.px)
                .backgroundColor(StyleColors.onPrimary)
                .toAttrs()
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .margin(top = 16.px)
            ,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(50.px)
                    .clip(Circle())
                    .backgroundColor(StyleColors.onPrimary)
                    .padding(16.px)
            ) {
                Image(
                    src = icon,
                    modifier = Modifier
                        .fillMaxSize()
                        .objectFit(ObjectFit.Contain)
                )
            }

            Column(
                modifier = Modifier
                    .margin(left = 16.px)
            ) {
                SpanText(
                    text = title,
                    modifier = FontTypes.smallText
                        .color(StyleColors.onPrimary)
                )

                SpanText(
                    text = value,
                    modifier = FontTypes.regular
                        .color(StyleColors.onPrimary)
                )
            }
        }
    }
}

@Composable
private fun Footer(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .padding(bottom = 25.px)
            .fillMaxWidth()
    ){
        Span(
            attrs = Modifier
                .fillMaxWidth()
                .height(1.px)
                .backgroundColor(StyleColors.onPrimary)
                .toAttrs()
        )

        SpanText(
            text = "2023",
            modifier = FontTypes.regular
                .margin(top = 25.px)
                .color(StyleColors.onPrimary)
                .align(Alignment.CenterHorizontally)
        )
    }
}