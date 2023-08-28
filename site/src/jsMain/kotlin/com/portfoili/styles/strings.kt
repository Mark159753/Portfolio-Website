package com.portfoili.styles

import com.portfoili.components.ProgramLngModel
import com.portfoili.pages.sections.LangModel
import com.portfoili.pages.sections.TechModel

const val hey_there = "Hey There,"
const val i_m_mark = "I'm Mark"

const val experience = "EXPERIENCE"
const val years = "YEARS"
const val two = "2"

const val email = "marek867@ukr.net"

const val short_description = "I create beautiful android\n" +
        "apps, and I love what I do."

const val person_image_path = "/person.png"

//Menu
const val my_github_link = "https://github.com/Mark159753"
const val github_icon_path = "/github_icon.svg"
const val developer = "Developer"

//PetProjectCard
const val arrow_top_path = "/arrow_top.svg"

//WorksSections
const val commercialWorks = "Commercial Works"
const val latest = "Latest"
const val projects = "Projects"
const val exploreMoreWorks = "Explore more works"
const val myRepositoriesLink = "https://github.com/Mark159753?tab=repositories"

//Projects
const val messengerAppTitle = "Messenger pet app"
const val messengerAppScreenPath = "/messanger_app_sceen.png"
const val messengerAppGitHubLink = "https://github.com/Mark159753/Messenger-Compose"
const val compose = "Jetpack Compose"

const val lvivGuideTitle = "LvivGuide pet app"
const val lvivGuideScreenPath = "/lviv_guide_screen.png"
const val lvivGuideGitHubLink = "https://github.com/Mark159753/Lviv-Guide-Compose"

const val portfolioWebsiteTitle = "Portfolio Website"
const val portfolioWebsiteScreenPath = "/web_portfolio_screen.png"
const val portfolioWebsiteGitHubLink = "https://github.com/Mark159753/Portfolio-Website"
const val kobweb = "Kobweb"

const val pick2mePath = "/pick_2_me.png"
const val pick2mePlayMarketLink = "https://play.google.com/store/apps/details?id=com.alababic.app&hl=uk&gl=US"
const val pick2meDriverPath = "/pick2me_driver.png"
const val pick2meDriverPlayMarketLink= "https://play.google.com/store/apps/details?id=com.alababic.driver&hl=uk&gl=US"

//SkillsSection
const val skillTitle = "Skills &"
const val experienceTitle = "Experiences"
const val familiarTechnologies = "Familiar Technologies"
const val languages = "Languages"
const val workYears = "2021 - 2023"
const val companyName = " Android Developer in FunkSoft"

val techModelTopRow = listOf(
    TechModel(
        title = "Jetpack Compose",
        icon = "/compose_icon.svg"
    ),
    TechModel(
        title = "Google map",
        icon = "/google_map_icon.svg"
    ),
    TechModel(
        title = "QraphQL",
        icon = "/graphQL_icon.svg"
    )
)

val techModelBottomRow = listOf(
    TechModel(
        title = "Room",
        icon = "/room_icon.svg"
    ),
    TechModel(
        title = "Retrofit",
        icon = "/retrofit_icon.svg"
    ),
    TechModel(
        title = "Firebase",
        icon = "/firebase_icon.svg"
    )
)

val languagesList = arrayOf(
    LangModel(
        lng = "Ukraine",
        level = "native"
    ),
    LangModel(
        lng = "Poland",
        level = "fluent"
    ),
    LangModel(
        lng = "Russian",
        level = "fluent"
    ),
    LangModel(
        lng = "English",
        level = " intermedia (B1)"
    ),
)

const val programingLanguages = "Programing Languages"

val prLanguages = arrayOf(
    ProgramLngModel(
        name = "Kotlin",
        level = 80
    ),
    ProgramLngModel(
        name = "Java",
        level = 70
    ),
    ProgramLngModel(
        name = "TypeScript",
        level = 50
    ),
)

//ContactSection
const val contactTitle = "Contacts"
const val letsDiscuss = "Let's Discuss"
const val yourProject = "Your Project"
const val emailTitle = "Email"
const val chatIconPath = "/chat_icon.svg"
const val phoneTitle = "Phone"
const val callIconPath = "/call_icon.svg"
const val phone = "+380687867767"
const val sayHi = "Say Hi!"
const val wavingHandPath = "/waving-hand.svg"


val menuTitles = arrayOf(
    "HOME",
    "WORKS",
    "SKILLS",
    "CONTACTS"
)