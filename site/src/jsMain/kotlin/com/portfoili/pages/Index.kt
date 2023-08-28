package com.portfoili.pages

import androidx.compose.runtime.*
import com.portfoili.pages.sections.ContactsSection
import com.portfoili.pages.sections.HeaderSection
import com.portfoili.pages.sections.SkillsSection
import com.portfoili.pages.sections.WorksSections
import com.varabyte.kobweb.compose.css.BoxSizing
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.boxSizing
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.css.percent

@Page
@Composable
fun HomePage() {
    Column(
        modifier = Modifier
            .boxSizing(BoxSizing.BorderBox)
            .width(100.percent)
    ){

        HeaderSection()

        WorksSections()

        SkillsSection()

        ContactsSection()

    }
}
