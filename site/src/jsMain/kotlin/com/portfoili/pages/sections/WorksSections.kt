package com.portfoili.pages.sections

import androidx.compose.runtime.Composable
import com.portfoili.components.PetProjectCard
import com.portfoili.components.SectionLayout
import com.portfoili.styles.*
import com.portfoili.styles.colors.StyleColors
import com.portfoili.styles.common.undecoratedLinkStyle
import com.portfoili.styles.types.FontTypes
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.hover
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.AlignItems
import org.jetbrains.compose.web.css.JustifyContent
import org.jetbrains.compose.web.dom.Span

@Composable
fun WorksSections(){

    val bp = rememberBreakpoint()
    val isMobile = bp <= Breakpoint.MD

    SectionLayout(
        modifier = Modifier
            .id("WORKS")
            .backgroundColor(Colors.White)
            .minHeight(100.vh)
    ){

        Column(
            modifier = Modifier
                .padding(topBottom = if (isMobile) 25.px else 50.px)
                .fillMaxSize()
        ) {

            if (isMobile){
                MobilePetsProjects()
            }else{
                DesktopPetsProjects()
            }

            SpanText(
                text = commercialWorks,
                modifier = FontTypes.h4
                    .fontSize(34.px)
                    .margin(top = 40.px)
                    .fontWeight(FontWeight.Bold)
                    .color(StyleColors.onPrimary)
            )

            if (isMobile){
                MobileCommercialProjects(
                    modifier = Modifier.margin(top = 25.px)
                )
            }else{
                DesktopCommercialProjects(
                    modifier = Modifier.margin(top = 40.px)
                )
            }
        }

    }
}


@Composable
private fun DesktopPetsProjects(
    modifier: Modifier = Modifier
){
    Row(
        modifier =  modifier
            .maxHeight(700.px)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Column(
            modifier = Modifier
                .fillMaxHeight()
                .width(30.percent),
        ){

            Column(
                modifier = Modifier
                    .fillMaxHeight(),
            ){
                SpanText(
                    text = latest,
                    modifier = FontTypes.h3
                        .fontWeight(FontWeight.Bold)
                        .color(StyleColors.onPrimary)
                )
                SpanText(
                    text = projects,
                    modifier = FontTypes.h3
                        .fontWeight(FontWeight.Bold)
                        .color(StyleColors.onPrimary)
                )

            }

            Span(
                attrs = Modifier.height(26.px).toAttrs()
            )


            PetProjectCard(
                modifier = Modifier.fillMaxWidth(),
                title = lvivGuideTitle,
                shortDescription = compose,
                image = lvivGuideScreenPath,
                color = Color("#FCDA69"),
                link = lvivGuideGitHubLink
            )
        }


        PetProjectCard(
            modifier = Modifier.width(30.percent)
                .align(Alignment.CenterVertically),
            title = messengerAppTitle,
            shortDescription = compose,
            image = messengerAppScreenPath,
            color = Color("#FC9F76"),
            link = messengerAppGitHubLink
        )

        Column(
            modifier = Modifier
                .fillMaxHeight()
                .width(30.percent),

            verticalArrangement = Arrangement.SpaceBetween
        ) {
            PetProjectCard(
                modifier = Modifier.fillMaxWidth(),
                title = portfolioWebsiteTitle,
                shortDescription = kobweb,
                image = portfolioWebsiteScreenPath,
                color = Color("#6BB9D0"),
                link = portfolioWebsiteGitHubLink
            )

            Link(
                path = myRepositoriesLink,
                modifier = Modifier.align(Alignment.End),
                variant = undecoratedLinkStyle
            ){
                SpanText(
                    text = exploreMoreWorks,
                    modifier = FontTypes.subtitleStyle
                        .fontSize(18.px)
                        .color(StyleColors.accent)
                        .textDecorationLine(TextDecorationLine.Underline)
                )
            }

        }
    }
}

@Composable
private fun MobilePetsProjects(
    modifier: Modifier = Modifier
){
    Box(
        modifier =  modifier
            .display(DisplayStyle.Flex)
            .flexWrap(FlexWrap.Wrap)
            .alignItems(AlignItems.Center)
            .justifyContent(JustifyContent.Center)
            .gap(20.px)
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {

        Column(
            modifier = Modifier.fillMaxWidth(),
        ){
            SpanText(
                text = latest,
                modifier = FontTypes.h3
                    .fontWeight(FontWeight.Bold)
                    .color(StyleColors.onPrimary)
            )
            SpanText(
                text = projects,
                modifier = FontTypes.h3
                    .fontWeight(FontWeight.Bold)
                    .color(StyleColors.onPrimary)
            )

        }


        PetProjectCard(
            modifier = Modifier
                .minWidth(300.px)
                .width(45.percent),
            title = lvivGuideTitle,
            shortDescription = compose,
            image = lvivGuideScreenPath,
            color = Color("#FCDA69"),
            link = lvivGuideGitHubLink
        )


        PetProjectCard(
            modifier = Modifier
                .minWidth(300.px)
                .width(45.percent),
            title = messengerAppTitle,
            shortDescription = compose,
            image = messengerAppScreenPath,
            color = Color("#FC9F76"),
            link = messengerAppGitHubLink
        )


        PetProjectCard(
            modifier = Modifier
                .minWidth(300.px)
                .width(45.percent),
            title = portfolioWebsiteTitle,
            shortDescription = kobweb,
            image = portfolioWebsiteScreenPath,
            color = Color("#6BB9D0"),
            link = portfolioWebsiteGitHubLink
        )

        Link(
            path = myRepositoriesLink,
            modifier = Modifier.fillMaxWidth(),
            variant = undecoratedLinkStyle
        ){
            SpanText(
                text = exploreMoreWorks,
                modifier = FontTypes.subtitleStyle
                    .fontSize(18.px)
                    .color(StyleColors.accent)
                    .textDecorationLine(TextDecorationLine.Underline)
            )
        }
    }
}

@Composable
private fun DesktopCommercialProjects(
    modifier: Modifier = Modifier
){
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween
    ){


        Link(
            path = pick2mePlayMarketLink,
            modifier = CommercialCardItem
                .toModifier(),
            variant = undecoratedLinkStyle
        ){
            Box(
                modifier = CommercialImageStyle.toModifier()
            ) {
                Image(
                    src = pick2mePath,
                    modifier = CommercialImageStyle.toModifier()
                )
            }
        }

        Link(
            path = pick2meDriverPlayMarketLink,
            modifier = CommercialCardItem
                .toModifier(),
            variant = undecoratedLinkStyle
        ){
            Box(
                modifier = CommercialImageStyle.toModifier()
            ) {
                Image(
                    src = pick2meDriverPath,
                    modifier = CommercialImageStyle.toModifier()
                )
            }
        }
    }
}

@Composable
fun MobileCommercialProjects(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Link(
            path = pick2mePlayMarketLink,
            modifier = CommercialCardItem
                .toModifier()
                .width(100.percent),
            variant = undecoratedLinkStyle
        ){
            Box(
                modifier = CommercialImageStyle.toModifier()
                    .width(100.percent)
            ) {
                Image(
                    src = pick2mePath,
                    modifier = CommercialImageStyle.toModifier()
                        .width(100.percent)
                )
            }
        }

        Span(
            attrs = Modifier.height(20.px).toAttrs()
        )

        Link(
            path = pick2meDriverPlayMarketLink,
            modifier = CommercialCardItem
                .toModifier()
                .width(100.percent),
            variant = undecoratedLinkStyle
        ){
            Box(
                modifier = CommercialImageStyle.toModifier()
                    .width(100.percent)
            ) {
                Image(
                    src = pick2meDriverPath,
                    modifier = CommercialImageStyle.toModifier()
                        .width(100.percent)
                )
            }
        }
    }
}

val CommercialImageStyle by ComponentStyle {
    base {
        Modifier
            .fillMaxWidth()
            .objectFit(ObjectFit.Contain)
            .aspectRatio(1.69f)
    }
}

val CommercialCardItem by ComponentStyle{

    base {
        Modifier
            .cursor(Cursor.Pointer)
            .width(48.percent)
            .aspectRatio(1.69f)
            .transition(CSSTransition("box-shadow", duration = 300.ms))
    }

    hover{
        Modifier
            .boxShadow(
                blurRadius = 5.px,
                spreadRadius = 4.px,
                color = Colors.LightGray,
            )
    }
}