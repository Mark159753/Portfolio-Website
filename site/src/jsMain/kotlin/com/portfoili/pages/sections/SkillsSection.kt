package com.portfoili.pages.sections

import androidx.compose.runtime.Composable
import com.portfoili.components.LanguageBar
import com.portfoili.components.ProgramLngModel
import com.portfoili.components.SectionLayout
import com.portfoili.styles.*
import com.portfoili.styles.colors.StyleColors
import com.portfoili.styles.skillTitle
import com.portfoili.styles.types.FontTypes
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.shapes.Circle
import com.varabyte.kobweb.silk.theme.shapes.clip
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.dom.ElementBuilder
import org.jetbrains.compose.web.dom.Span

@Composable
fun SkillsSection(){

    val bp = rememberBreakpoint()
    val isMobile = bp <= Breakpoint.MD

    SectionLayout(
        modifier = Modifier
            .id("SKILLS")
            .backgroundColor(StyleColors.primary)
            .minHeight(100.vh)
    ){

        if (isMobile){
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(topBottom = 25.px)
            ) {
                SkillsColumn(
                    modifier = Modifier
                        .fillMaxWidth()
                )

                Span(attrs = Modifier.height(20.px).toAttrs())

                LanguagesColumn(
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }
        }else{
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(topBottom = 50.px),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                SkillsColumn(
                    modifier = Modifier
                        .width(46.percent)
                )

                LanguagesColumn(
                    modifier = Modifier
                        .width(46.percent)
                )
            }
        }

    }
}

@Composable
private fun SkillsColumn(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
    ) {

        Title()

        Row(
            modifier = Modifier
                .margin(top = 20.px)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Span(attrs = Modifier
                .height(1.px)
                .width(50.px)
                .backgroundColor(Color("#0D2F3F"))
                .toAttrs()
            )

            Span(attrs = FontTypes
                .regular
                .color(StyleColors.onPrimary)
                .margin(left = 10.px)
                .toAttrs(),
            ){
                SpanText(
                    text = workYears,
                    modifier = FontTypes
                        .regular
                        .fontWeight(FontWeight.Bold)
                        .color(StyleColors.onPrimary)
                        .margin(left = 10.px)
                )
                SpanText(
                    text = companyName,
                    modifier = FontTypes
                        .regular
                        .color(StyleColors.onPrimary)
                )
            }
        }

        SpanText(
            text = familiarTechnologies,
            modifier = FontTypes.h3
                .fontSize(30.px)
                .fontWeight(FontWeight.Bold)
                .color(StyleColors.onPrimary)
                .margin(top = 20.px)
        )

        TechnologiesGrid(
            modifier = Modifier.margin(top = 16.px)
        )

    }
}

@Composable
private fun Title(){
    Column(
        modifier = Modifier
            .fillMaxHeight(),
    ){
        SpanText(
            text = skillTitle,
            modifier = FontTypes.h3
                .fontWeight(FontWeight.Bold)
                .color(StyleColors.onPrimary)
        )
        SpanText(
            text = experienceTitle,
            modifier = FontTypes.h3
                .fontWeight(FontWeight.Bold)
                .color(StyleColors.onPrimary)
        )

    }
}

@Composable
private fun TechnologiesGrid(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Row(
            modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            techModelTopRow.forEach { item ->
                TechItem(
                    modifier = Modifier.width(88.px),
                    item = item
                )
            }
        }

        Row(
            modifier
                .fillMaxWidth()
                .margin(top = 20.px),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            techModelBottomRow.forEach { item ->
                TechItem(
                    modifier = Modifier.width(88.px),
                    item = item
                )
            }
        }

    }
}

@Composable
private fun TechItem(
    modifier: Modifier = Modifier,
    item:TechModel
){
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box(
            modifier = Modifier
                .size(74.px)
                .backgroundColor(Color("#0D2F3F"))
                .padding(12.px)
                .clip(Circle())
        ) {
            Image(
                src = item.icon,
                modifier = Modifier
                    .objectFit(ObjectFit.Contain)
                    .fillMaxSize()
            )
        }

        SpanText(
            text = item.title,
            modifier = FontTypes
                .regular
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .textAlign(TextAlign.Center)
                .color(StyleColors.onPrimary)
                .margin(top = 20.px)
        )

    }
}

data class TechModel(
    val title: String,
    val icon:String
)

data class LangModel(
    val lng:String,
    val level:String
)

@Composable
private fun LanguagesColumn(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
    ) {
        SpanText(
            text = languages,
            modifier = FontTypes.h3
                .fontSize(30.px)
                .fontWeight(FontWeight.Bold)
                .color(StyleColors.onPrimary)
        )

        Span(
            attrs = Modifier
                .fillMaxWidth()
                .height(2.px)
                .margin(top = 20.px)
                .backgroundColor(Color("#0D2F3F"))
                .toAttrs()
        )

        languagesList.forEach { item ->
            Languages(
                modifier = Modifier.margin(top = 16.px),
                item = item
            )
        }

        SpanText(
            text = programingLanguages,
            modifier = FontTypes.h3
                .margin(top = 20.px)
                .fontSize(30.px)
                .fontWeight(FontWeight.Bold)
                .color(StyleColors.onPrimary)
        )

        Span(
            attrs = Modifier
                .fillMaxWidth()
                .height(2.px)
                .margin(top = 20.px)
                .backgroundColor(Color("#0D2F3F"))
                .toAttrs()
        )

        prLanguages.forEach { item ->
            LanguageBar(
                modifier = Modifier.margin(top = 16.px),
                item = item
            )
        }

    }
}

@Composable
private fun Languages(
    modifier: Modifier = Modifier,
    item: LangModel
){
    Span(attrs = modifier
        .then(FontTypes.regular)
        .color(StyleColors.onPrimary)
        .toAttrs(),
    ){
        SpanText(
            text = item.lng,
            modifier = FontTypes
                .regular
                .fontWeight(FontWeight.Bold)
                .color(StyleColors.onPrimary)
        )
        SpanText(
            text = "-",
            modifier = FontTypes
                .regular
                .color(StyleColors.onPrimary)
                .margin(leftRight = 6.px)
        )
        SpanText(
            text = item.level,
            modifier = FontTypes
                .regular
                .color(StyleColors.onPrimary)
        )
    }
}