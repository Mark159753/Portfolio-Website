package com.portfoili.pages.sections

import androidx.compose.runtime.Composable
import com.portfoili.components.MenuBar
import com.portfoili.components.SectionLayout
import com.portfoili.styles.*
import com.portfoili.styles.colors.StyleColors
import com.portfoili.styles.common.undecoratedLinkStyle
import com.portfoili.styles.types.FontTypes
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh

@Composable
fun HeaderSection(){

    val bp = rememberBreakpoint()

    val minHeight = if (bp <= Breakpoint.MD) 720.px else 560.px

    SectionLayout(
        modifier = Modifier
            .id("HOME")
            .backgroundColor(StyleColors.primary)
            .minHeight(minHeight)
            .height(100.vh)
    ){
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxSize()
        ) {
            MenuBar(
                modifier = Modifier.padding(top = 30.px)
            )

            if (bp <= Breakpoint.MD){
                MobileVersion()
            }else{
                DesktopVersion()
            }
        }

    }
}


@Composable
private fun DesktopVersion(){
    Box(
        modifier = Modifier.fillMaxSize()
    ){
        Image(
            src = person_image_path,
            modifier = Modifier
                .width(55.percent)
                .aspectRatio(1.44f)
                .align(Alignment.BottomCenter)
        )

        Texts(
            modifier = Modifier.align(Alignment.Center)
        )

    }
}


@Composable
private fun MobileVersion(){
    Column(
        modifier = Modifier
            .fillMaxSize()
    ){
        Texts()

        Image(
            src = person_image_path,
            modifier = Modifier
                .width(55.percent)
                .minWidth(300.px)
                .aspectRatio(1.44f)
        )

    }
}

@Composable
private fun Texts(
    modifier: Modifier = Modifier
){

    val bp = rememberBreakpoint()

    Column(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(70.percent),
        verticalArrangement = Arrangement.SpaceBetween
    ){

        if (bp <= Breakpoint.MD){
            Title()

            SpanText(
                text = short_description,
                modifier = FontTypes.subtitleStyle
                    .color(StyleColors.onPrimary)
            )
        }else{
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){
                Title()

                SpanText(
                    text = short_description,
                    modifier = FontTypes.subtitleStyle
                        .maxWidth(25.percent)
                        .color(StyleColors.onPrimary)
                )
            }
        }


        Link(
            path = "mailto:$email",
            variant = undecoratedLinkStyle
        ){
            SpanText(
                text = email,
                modifier = FontTypes.subtitleStyle
                    .fontSize(20.px)
                    .color(StyleColors.accent)
                    .textDecorationLine(TextDecorationLine.Underline)
            )
        }

        ExperienceBlock()
    }
}

@Composable
private fun ExperienceBlock(){
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        SpanText(
            text = two,
            modifier = FontTypes.h2
                .color(StyleColors.onPrimary)
        )

        Column {
            SpanText(
                text = years,
                modifier = Modifier
                    .fontFamily("Caros")
                    .fontWeight(FontWeight.Light)
                    .fontSize(18.px)
                    .color(StyleColors.onPrimary)
            )

            SpanText(
                text = experience,
                modifier = Modifier
                    .fontFamily("Caros")
                    .fontWeight(FontWeight.Light)
                    .fontSize(18.px)
                    .color(StyleColors.onPrimary)
            )
        }
    }
}
@Composable
private fun Title(){
    Column {
        SpanText(
            text = hey_there,
            modifier = FontTypes.h1
                .color(StyleColors.onPrimary)
        )
        SpanText(
            text = i_m_mark,
            modifier = FontTypes.h1
                .color(StyleColors.onPrimary)
        )
    }
}